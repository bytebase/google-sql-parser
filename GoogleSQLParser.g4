parser grammar GoogleSQLParser;

options {
	tokenVocab = GoogleSQLLexer;
}

root: stmts EOF;

stmts: stmt (SEMI_SYMBOL stmt)* SEMI_SYMBOL?;

stmt: query_statement;

// query_statement: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax
query_statement: query_expr;

query_expr:
	with_statement? (
		select
		| LR_BRACKET_SYMBOL query_expr RR_BRACKET_SYMBOL
	) order_by_clause? limit_clause?
	| query_expr set_operator query_expr order_by_clause? limit_clause?;

query_primary: select;

limit_clause: LIMIT_SYMBOL count (OFFSET_SYMBOL skip_rows);

order_by_clause: order_by_clause_prefix;

order_by_clause_prefix:
	ORDER_SYMBOL hint? BY_SYMBOL ordering_expression
	| order_by_clause_prefix COMMA_SYMBOL ordering_expression;

ordering_expression:
	expression collate_clause? asc_or_desc? null_order?;

order_by_expr_list:
	order_by_expr_list_item (
		COMMA_SYMBOL order_by_expr_list_item
	)*;

order_by_expr_list_item: expression (ASC_SYMBOL | DESC_SYMBOL)?;

set_operator:
	UNION_SYMBOL (ALL_SYMBOL | DISTINCT_SYMBOL)
	| INTERSECT_SYMBOL DISTINCT_SYMBOL
	| EXCEPT_SYMBOL DISTINCT_SYMBOL;

select:
	SELECT_SYMBOL (differential_privacy_clause)? (
		ALL_SYMBOL
		| DISTINCT_SYMBOL
	)? (AS_SYMBOL (STRUCT_SYMBOL | VALUE_SYMBOL))? select_list from_clause? /*TODO(zp): Where ... */
		;

// from_clause: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax#from_clause
from_clause:
	FROM_SYMBOL from_item (pivot_operator | unpivot_operator)? tablesample_operator?;

// tablesample_operator: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax#tablesample_operator
tablesample_operator:
	TABLESAMPLE_SYMBOL SYSTEM_SYMBOL LR_BRACKET_SYMBOL percent = integer_type PERCENT_SYMBOL
		RR_BRACKET_SYMBOL;

// unpivot_operator: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax#unpivot_operator
unpivot_operator:
	UNPIVOT_SYMBOL (
		INCLUDE_SYMBOL NULLS_SYMBOL
		| EXCLUDE_SYMBOL NULLS_SYMBOL
	)? LR_BRACKET_SYMBOL (
		single_column_unpivot
		| multi_column_unpivot
	) unpivot_alias = as_alias?;

single_column_unpivot:
	values_column = column_name FOR_SYMBOL name_column = column_name IN_SYMBOL LR_BRACKET_SYMBOL
		columns_to_unpivot_list RR_BRACKET_SYMBOL;

multi_column_unpivot:
	values_column_set FOR_SYMBOL name_column = column_name IN_SYMBOL LR_BRACKET_SYMBOL
		column_sets_to_unpivot RR_BRACKET_SYMBOL;

values_column_set:
	values_column = column_name (
		COMMA_SYMBOL values_column = column_name
	)*;

columns_to_unpivot_list:
	columns_to_unpivot_item (
		COMMA_SYMBOL columns_to_unpivot_item
	)*;

columns_to_unpivot_item:
	unpivot_column = column_name row_value_alias = as_alias?;

column_sets_to_unpivot:
	LR_BRACKET_SYMBOL columns_to_unpivot_list RR_BRACKET_SYMBOL;

// pivot_operator: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax#pivot_operator
pivot_operator:
	PIVOT_SYMBOL LR_BRACKET_SYMBOL aggregate_function_call_as_alias_list FOR_SYMBOL input_column =
		column_name IN_SYMBOL LR_BRACKET_SYMBOL pivot_column_as_alias_list RR_BRACKET_SYMBOL
		RR_BRACKET_SYMBOL as_alias?;

pivot_column_as_alias_list:
	pivot_column_as_alias_list_item (
		COMMA_SYMBOL pivot_column_as_alias_list_item
	)*;

pivot_column_as_alias_list_item:
	pivot_column = column_name as_alias?;

aggregate_function_call_as_alias_list:
	aggregate_function_call_as_alias_list_item (
		COMMA_SYMBOL aggregate_function_call_as_alias_list_item
	)*;

aggregate_function_call_as_alias_list_item:
	/*aggregate_function_call*/ as_alias?;

from_item:
	table_name as_alias? (
		FOR_SYMBOL SYSTEM_TIME_SYMBOL AS_SYMBOL OF_SYMBOL expression /* Actully, this should be timestamp_expression, but no syntax detail found. */
	)?
	| from_item cross_join_operator from_item
	| from_item conditional_join_operator from_item join_condition
	| LR_BRACKET_SYMBOL (
		from_item cross_join_operator from_item
		| from_item conditional_join_operator from_item join_condition
	) RR_BRACKET_SYMBOL
	| LR_BRACKET_SYMBOL query_expr RR_BRACKET_SYMBOL as_alias?
	// | field_path
	| unnest_operator
	| cte_name as_alias?;

// unnest_operator: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax#unnest_operator.
unnest_operator:
	(
		UNNEST_SYMBOL LR_BRACKET_SYMBOL /*array*/ RR_BRACKET_SYMBOL as_alias?
		| /*array_path*/ as_alias
	) (WITH_SYMBOL OFFSET_SYMBOL as_alias?)?;

cross_join_operator: (CROSS_SYMBOL JOIN_SYMBOL) | COMMA_SYMBOL;

conditional_join_operator:
	INNER_SYMBOL? JOIN_SYMBOL
	| FULL_SYMBOL OUTER_SYMBOL? JOIN_SYMBOL
	| LEFT_SYMBOL OUTER_SYMBOL? JOIN_SYMBOL
	| RIGHT_SYMBOL OUTER_SYMBOL? JOIN_SYMBOL;

join_condition: on_clause | using_clause;

on_clause:
	ON_SYMBOL expression /* Actullay, this should be bool_expression */;

using_clause:
	USING_SYMBOL LR_BRACKET_SYMBOL column_name_list RR_BRACKET_SYMBOL;

select_list: select_list_item (COMMA_SYMBOL select_list_item)*;

select_list_item: select_all | select_expression;

select_expression: expression as_alias?;

select_all: (expression DOT_SYMBOL)? ASTERISK_SYMBOL select_all_except_clause?
		select_all_replace_clause?;

select_all_except_clause:
	EXCEPT_SYMBOL LR_BRACKET_SYMBOL column_name_list RR_BRACKET_SYMBOL;

select_all_replace_clause:
	REPLACE_SYMBOL LR_BRACKET_SYMBOL expr_as_alias_list RR_BRACKET_SYMBOL;

column_name_list: column_name (COMMA_SYMBOL column_name)*;

expr_as_alias_list:
	expr_as_alias_item (COMMA_SYMBOL expr_as_alias_item)*;

expr_as_alias_item: expression AS_SYMBOL? column_name;

as_alias: AS_SYMBOL? alias_name;

// differential_privacy_clause: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax#dp_clause
differential_privacy_clause:
	WITH_SYMBOL DIFFERENTIAL_PRIVACY_SYMBOL OPTIONS_SYMBOL LR_BRACKET_SYMBOL privacy_parameters
		RR_BRACKET_SYMBOL;

privacy_parameters:
	EPSILON_SYMBOL EQUAL_SYMBOL expression COMMA_SYMBOL DELTA_SYMBOL EQUAL_SYMBOL expression
		COMMA_SYMBOL (
		MAX_GROUPS_CONTRIBUTED_SYMBOL EQUAL_SYMBOL expression COMMA_SYMBOL
	)? PRIVACY_UNIT_COLUMN_SYMBOL EQUAL_SYMBOL expression;

with_statement:
	WITH_SYMBOL RECURSIVE_SYMBOL? cte (COMMA_SYMBOL cte)*;

cte: non_recursive_cte | recursive_cte;

// non_recursive_cte: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax#simple_cte
non_recursive_cte:
	cte_name AS_SYMBOL LR_BRACKET_SYMBOL query_expr RR_BRACKET_SYMBOL;

// recursive_cte: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax#recursive_cte
recursive_cte:
	cte_name AS_SYMBOL LR_BRACKET_SYMBOL recursive_union_operation RR_BRACKET_SYMBOL;

recursive_union_operation:
	base_term union_operator recursive_term;

base_term: query_expr;

union_operator: UNION_SYMBOL ALL_SYMBOL;

recursive_term: query_expr;

// expression: https://github.com/google/zetasql/blob/194cd32b5d766d60e3ca442651d792c7fe54ea74/zetasql/parser/bison_parser.y#L7712
expression: expression_higher_prec_than_and;
// | and_expression | or_expression;

// expression_higher_prec_than_and: https://github.com/google/zetasql/blob/194cd32b5d766d60e3ca442651d792c7fe54ea74/zetasql/parser/bison_parser.y#L7747
expression_higher_prec_than_and:
	unparenthesized_expression_higher_prec_than_and;
// | parenthesized_expression_not_a_query | parenthesized_query;

// unparenthesized_expression_higher_prec_than_and: https://github.com/google/zetasql/blob/194cd32b5d766d60e3ca442651d792c7fe54ea74/zetasql/parser/bison_parser.y#L7781
unparenthesized_expression_higher_prec_than_and:
	NULL_SYMBOL
	| boolean_literal
	| string_literal
	| bytes_literal
	| integer_literal
	| numeric_literal
	| bignumeric_literal
	| json_literal
	| floating_point_literal
	| date_or_time_literal
	| range_literal
	| parameter_expression
	| system_variable_expression
	| array_constructor
	| new_constructor
	| braced_constructor
	| braced_new_constructor
	| struct_braced_constructor
	| case_expression
	| cast_expression
	| extract_expression
	| with_expression
	| replace_fields_expression
	| function_call_expression_with_clause;

function_call_expression_with_clause:
	function_call_expression hint? with_group_rows? over_clause?;

function_call_expression:
	// Empty argument list.
	function_call_expression_base opt_having_or_group_by_modifier? order_by_clause?
		limit_offset_clause? RR_BRACKET_SYMBOL
	| function_call_expression_with_args_prefix opt_null_handling_modifier?
		opt_having_or_group_by_modifier? clamped_between_modifier? with_report_modifier?
		order_by_clause? limit_offset_clause? RR_BRACKET_SYMBOL;

over_clause: OVER_SYMBOL window_specification;

window_specification:
	identifier
	| LR_BRACKET_SYMBOL identifier? partition_by_clause? order_by_clause? opt_window_frame_clause?
		RR_BRACKET_SYMBOL;

opt_window_frame_clause:
	frame_unit BETWEEN_SYMBOL window_frame_bound AND_SYMBOL window_frame_bound
	| frame_unit window_frame_bound;

window_frame_bound:
	UNBOUNDED_SYMBOL preceding_or_following
	| CURRENT_SYMBOL ROW_SYMBOL
	| expression preceding_or_following;

preceding_or_following: PRECEDING_SYMBOL | FOLLOWING_SYMBOL;

frame_unit: ROWS_SYMBOL | RANGE_SYMBOL;

partition_by_clause: partition_by_clause_prefix;

partition_by_clause_prefix:
	PARTITION_SYMBOL hint? BY_SYMBOL expression
	| partition_by_clause_prefix COMMA_SYMBOL expression;

with_group_rows:
	WITH_SYMBOL GROUP_SYMBOL ROWS_SYMBOL /* XXX(zp): query = parenthesized_query*/;

with_report_modifier:
	WITH_SYMBOL REPORT_SYMBOL with_report_format;

clamped_between_modifier:
	CLAMPED_SYMBOL expression_higher_prec_than_and AND_SYMBOL expression;

with_report_format: options_list;

options_list:
	options_list_prefix RR_BRACKET_SYMBOL
	| LR_BRACKET_SYMBOL RR_BRACKET_SYMBOL;

options_list_prefix:
	LR_BRACKET_SYMBOL options_entry
	| options_list_prefix COMMA_SYMBOL options_entry;

options_entry:
	identifier_in_hints options_assignment_operator expression_or_proto;

expression_or_proto: PROTO_SYMBOL | expression;

options_assignment_operator:
	EQUAL_SYMBOL
	| PLUS_EQUAL_SYMBOL
	| SUB_EQUAL_SYMBOL;

opt_null_handling_modifier:
	IGNORE_SYMBOL NULLS_SYMBOL
	| RESPECT_SYMBOL NULLS_SYMBOL;

function_call_expression_with_args_prefix:
	/* TODO(zp): handle mutually left-recursive. */
	/*
	 function_call_expression_base function_call_argument | function_call_expression_base
	 ASTERISK_SYMBOL | function_call_expression_with_args_prefix COMMA_SYMBOL
	 function_call_argument;
	 */
	COMMA_SYMBOL function_call_argument;

function_call_argument:
	expression opt_as_alias_with_required_as? named_argument
	| lambda_argument
	| sequence_arg
	| SELECT_SYMBOL { p.NotifyErrorListeners("Each function argument
	 is an expression, not a query; to use a " "query as an expression, the query must be wrapped
	 with additional " "parentheses to make it a scalar subquery expression", nil, nil); };

sequence_arg: SEQUENCE_SYMBOL path_expression;

named_argument:
	identifier EQUAL_GT_BRACKET_SYMBOL expression
	| identifier EQUAL_GT_BRACKET_SYMBOL lambda_argument;

lambda_argument:
	lambda_argument_list SUB_GT_BRACKET_SYMBOL expression;

lambda_argument_list:
	/* XXX(zp): expr kind check expression*/ expression
	| LR_BRACKET_SYMBOL RR_BRACKET_SYMBOL;

limit_offset_clause:
	LIMIT_SYMBOL expression OFFSET_SYMBOL expression
	| LIMIT_SYMBOL expression;

opt_having_or_group_by_modifier:
	HAVING_SYMBOL MAX_SYMBOL expression
	| HAVING_SYMBOL MIN_SYMBOL expression group_by_clause_prefix;

group_by_clause_prefix:
	preamble = group_by_preamble item = grouping_item
	| prefix = group_by_clause_prefix COMMA_SYMBOL item = grouping_item;

group_by_preamble: GROUP_SYMBOL hint? opt_and_order? BY_SYMBOL;

opt_and_order: AND_SYMBOL ORDER_SYMBOL;

hint:
	/*XXX(zp): ABORT_CHECK*/ AT_SYMBOL integer_literal
	| hint_with_body;
hint_with_body: hint_with_body_prefix RC_BRACKET_SYMBOL;

hint_with_body_prefix:
	AT_SYMBOL integer_literal AT_SYMBOL LC_BRACKET_SYMBOL entry = hint_entry
	| AT_SYMBOL LC_BRACKET_SYMBOL entry = hint_entry
	| hint_with_body_prefix COMMA_SYMBOL hint_entry;

hint_entry:
	identifier_in_hints EQUAL_SYMBOL expression
	| identifier_in_hints DOT_SYMBOL identifier_in_hints EQUAL_SYMBOL expression;

identifier_in_hints:
	identifier
	| extra_identifier_in_hints_name;

extra_identifier_in_hints_name:
	HASH_SYMBOL
	| PROTO_SYMBOL
	| PARTITION_SYMBOL;

grouping_item:
	LR_BRACKET_SYMBOL RR_BRACKET_SYMBOL
	| expression opt_as_alias_with_required_as? opt_grouping_item_order?
	| rollup_list RR_BRACKET_SYMBOL
	| cube_list RR_BRACKET_SYMBOL
	| grouping_set_list RR_BRACKET_SYMBOL;

grouping_set_list:
	GROUPING_SYMBOL SETS_SYMBOL LR_BRACKET_SYMBOL grouping_set
	| grouping_set_list COMMA_SYMBOL grouping_set;

grouping_set:
	LR_BRACKET_SYMBOL RR_BRACKET_SYMBOL
	| expression
	| rollup_list RR_BRACKET_SYMBOL
	| cube_list RR_BRACKET_SYMBOL;

cube_list:
	CUBE_SYMBOL LR_BRACKET_SYMBOL expression
	| cube_list COMMA_SYMBOL expression;

rollup_list:
	ROLLUP_SYMBOL LR_BRACKET_SYMBOL expression
	| rollup_list COMMA_SYMBOL expression;

opt_as_alias_with_required_as: AS_SYMBOL identifier;

opt_grouping_item_order: opt_selection_item_order | null_order;

opt_selection_item_order: asc_or_desc null_order?;

asc_or_desc: ASC_SYMBOL | DESC_SYMBOL;

null_order:
	NULLS_SYMBOL FIRST_SYMBOL
	| NULLS_SYMBOL LAST_SYMBOL;

function_call_expression_base:
	expression_higher_prec_than_and LR_BRACKET_SYMBOL DISTINCT_SYMBOL
	| expression_higher_prec_than_and LR_BRACKET_SYMBOL
	| function_name_from_keyword LR_BRACKET_SYMBOL;

function_name_from_keyword:
	IF_SYMBOL
	| GROUPING_SYMBOL
	| LEFT_SYMBOL
	| RIGHT_SYMBOL
	| COLLATE_SYMBOL
	| RANGE_SYMBOL;

replace_fields_expression:
	replace_fields_prefix RR_BRACKET_SYMBOL;

replace_fields_prefix:
	REPLACE_FIELDS_SYMBOL LR_BRACKET_SYMBOL expression COMMA_SYMBOL replace_fields_arg
	| replace_fields_prefix COMMA_SYMBOL replace_fields_arg;

replace_fields_arg:
	expression AS_SYMBOL generalized_path_expression
	| expression AS_SYMBOL generalized_extension_path;

generalized_path_expression:
	identifier
	| generalized_path_expression DOT_SYMBOL generalized_extension_path
	| generalized_path_expression DOT_SYMBOL identifier
	| generalized_path_expression LS_BRACKET_SYMBOL expression RS_BRACKET_SYMBOL;

generalized_extension_path:
	identifier
	| generalized_path_expression DOT_SYMBOL generalized_extension_path
	| generalized_path_expression DOT_SYMBOL identifier
	| generalized_path_expression LS_BRACKET_SYMBOL expression RS_BRACKET_SYMBOL;

with_expression:
	/* XXX(zp): zetasql Yacc implement this in lookahead_transformer. */ WITH_SYMBOL
		LR_BRACKET_SYMBOL with_expression_variable_prefix COMMA_SYMBOL expression RR_BRACKET_SYMBOL;

with_expression_variable_prefix:
	with_expression_variable
	| with_expression_variable_prefix COMMA_SYMBOL with_expression_variable;

with_expression_variable: identifier AS_SYMBOL expression;

extract_expression:
	extract_expression_base RR_BRACKET_SYMBOL
	| extract_expression_base AT_SYMBOL TIME_SYMBOL ZONE_SYMBOL expression RR_BRACKET_SYMBOL;

extract_expression_base:
	EXTRACT_SYMBOL LR_BRACKET_SYMBOL expression FROM_SYMBOL expression;

opt_format: FORMAT_SYMBOL expression opt_at_time_zone?;

opt_at_time_zone: AT_SYMBOL TIME_SYMBOL ZONE_SYMBOL expression;

cast_expression:
	CAST_SYMBOL LR_BRACKET_SYMBOL AS_SYMBOL type opt_format? RR_BRACKET_SYMBOL
	| CAST_SYMBOL LR_BRACKET_SYMBOL CAST_SYMBOL { p.NotifyErrorListeners("The argument to CAST is an
	 expression, not a query; to use a query " "as an expression, the query must be wrapped with
	 additional " "parentheses to make it a scalar subquery expression", nil, nil); }
	| SAFE_CAST_SYMBOL LR_BRACKET_SYMBOL AS_SYMBOL type opt_format? RR_BRACKET_SYMBOL
	| SAFE_CAST_SYMBOL LR_BRACKET_SYMBOL SAFE_CAST_SYMBOL { p.NotifyErrorListeners("The argument to
	 CAST is an expression, not a query; to use a query " "as an expression, the query must be
	 wrapped with additional " "parentheses to make it a scalar subquery expression", nil, nil); };

case_expression:
	case_expression_prefix END_SYMBOL
	| case_expression_prefix ELSE_SYMBOL expression END_SYMBOL;

case_expression_prefix:
	case_no_value_expression_prefix
	| case_value_expression_prefix;

case_value_expression_prefix:
	CASE_SYMBOL expression WHEN_SYMBOL expression THEN_SYMBOL expression
	| case_value_expression_prefix WHEN_SYMBOL expression THEN_SYMBOL expression;

case_no_value_expression_prefix:
	CASE_SYMBOL WHEN_SYMBOL expression THEN_SYMBOL expression
	| case_no_value_expression_prefix WHEN_SYMBOL expression THEN_SYMBOL expression;

struct_braced_constructor:
	stype = struct_type ctor = braced_constructor
	| STRUCT_SYMBOL ctor = braced_constructor;

braced_new_constructor: NEW_SYMBOL type_name new_constructor;

braced_constructor:
	braced_constructor_start RC_BRACKET_SYMBOL
	| braced_constructor_prefix RC_BRACKET_SYMBOL
	// Allow trailing comma in braced constructor. | braced_constructor_prefix
	COMMA_SYMBOL RC_BRACKET_SYMBOL;

braced_constructor_start: RC_BRACKET_SYMBOL;

braced_constructor_prefix:
	braced_constructor_start braced_constructor_field
	| braced_constructor_start braced_constructor_extension
	| braced_constructor_prefix COMMA_SYMBOL braced_constructor_field
	| braced_constructor_prefix braced_constructor_field
	| braced_constructor_prefix COMMA_SYMBOL braced_constructor_extension;

braced_constructor_field:
	braced_constructor_lhs braced_constructor_field_value;

braced_constructor_lhs: generalized_path_expression;

braced_constructor_field_value:
	COLON_SYMBOL expression
	| braced_constructor;

braced_constructor_extension:
	LR_BRACKET_SYMBOL path_expression RR_BRACKET_SYMBOL;

new_constructor:
	new_constructor_prefix RR_BRACKET_SYMBOL
	| new_constructor_prefix_no_arg RR_BRACKET_SYMBOL;

new_constructor_prefix:
	new_constructor_prefix_no_arg new_constructor_arg
	| new_constructor_prefix COMMA_SYMBOL new_constructor_arg;

new_constructor_prefix_no_arg:
	NEW_SYMBOL type_name LR_BRACKET_SYMBOL;

new_constructor_arg:
	expression
	| expression AS_SYMBOL identifier
	| expression AS_SYMBOL LR_BRACKET_SYMBOL path_expression RR_BRACKET_SYMBOL;

array_constructor:
	array_constructor_prefix_no_expressions RS_BRACKET_SYMBOL
	| array_constructor_prefix RS_BRACKET_SYMBOL;

array_constructor_prefix:
	array_constructor_prefix_no_expressions expression
	| array_constructor_prefix COMMA_SYMBOL expression;

array_constructor_prefix_no_expressions:
	ARRAY_SYMBOL LS_BRACKET_SYMBOL
	| LS_BRACKET_SYMBOL
	| array_type;

range_literal: range_type string_literal;

range_type:
	RANGE_SYMBOL template_type_open type template_type_close;

type: raw_type opt_type_parameters? collate_clause?;

collate_clause: COLLATE_SYMBOL string_literal_or_parameter;

string_literal_or_parameter:
	string_literal
	| parameter_expression
	| system_variable_expression;

system_variable_expression: ATAT_SYMBOL path_expression;

parameter_expression:
	named_parameter_expression
	| QUESTION_SYMBOL;

named_parameter_expression: AT_SYMBOL identifier;

// This is opt_type_parameters in zetasql yacc, but here prefer to use ? in ANTLR.
opt_type_parameters:
	type_parameters_prefix RR_BRACKET_SYMBOL
	| type_parameters_prefix COMMA_SYMBOL RR_BRACKET_SYMBOL { p.NotifyErrorListeners("Syntax error: Trailing comma in type
	 parameters list is not allowed.", nil, nil); };

type_parameters_prefix:
	LR_BRACKET_SYMBOL type_parameter
	| type_parameters_prefix COMMA_SYMBOL type_parameter;

type_parameter:
	integer_literal
	| boolean_literal
	| string_literal
	| bytes_literal
	| floating_point_literal
	| MAX_SYMBOL;

raw_type:
	array_type
	| struct_type
	| type_name
	| range_type
	| function_type
	| map_type;

map_type:
	MAP_SYMBOL template_type_open key_type = type COMMA_SYMBOL value_type = type template_type_close
		;

function_type:
	FUNCTION_SYMBOL template_type_open LR_BRACKET_SYMBOL RR_BRACKET_SYMBOL SUB_GT_BRACKET_SYMBOL
		return_type = type template_type_close
	| FUNCTION_SYMBOL template_type_open arg_type = type SUB_GT_BRACKET_SYMBOL return_type = type
		template_type_close
	| arg_list = function_type_prefix RR_BRACKET_SYMBOL SUB_GT_BRACKET_SYMBOL return_type = type
		template_type_close;

function_type_prefix:
	FUNCTION_SYMBOL template_type_open LR_BRACKET_SYMBOL type
	| function_type_prefix COMMA_SYMBOL type;

type_name: path_expression | INTERVAL_SYMBOL;

path_expression:
	identifier
	| path_expression DOT_SYMBOL identifier;

identifier: token_identifier | keyword_as_identifier;

keyword_as_identifier:
	common_keyword_as_identifier
	| SIMPLE_SYMBOL;

common_keyword_as_identifier:
	ABORT_SYMBOL
	| ACCESS_SYMBOL
	| ACTION_SYMBOL
	| AGGREGATE_SYMBOL
	| ADD_SYMBOL
	| ALTER_SYMBOL
	| ALWAYS_SYMBOL
	| ANALYZE_SYMBOL
	| APPROX_SYMBOL
	| ARE_SYMBOL
	| ASSERT_SYMBOL
	| BATCH_SYMBOL
	| BEGIN_SYMBOL
	| BIGDECIMAL_SYMBOL
	| BIGNUMERIC_SYMBOL
	| BREAK_SYMBOL
	| CALL_SYMBOL
	| CASCADE_SYMBOL
	| CHECK_SYMBOL
	| CLAMPED_SYMBOL
	| CLONE_SYMBOL
	| COPY_SYMBOL
	| CLUSTER_SYMBOL
	| COLUMN_SYMBOL
	| COLUMNS_SYMBOL
	| COMMIT_SYMBOL
	| CONNECTION_SYMBOL
	| CONSTANT_SYMBOL
	| CONSTRAINT_SYMBOL
	| CONTINUE_SYMBOL
	| CORRESPONDING_SYMBOL
	| CYCLE_SYMBOL
	| DATA_SYMBOL
	| DATABASE_SYMBOL
	| DATE_SYMBOL
	| DATETIME_SYMBOL
	| DECIMAL_SYMBOL
	| DECLARE_SYMBOL
	| DEFINER_SYMBOL
	| DELETE_SYMBOL
	| DELETION_SYMBOL
	| DEPTH_SYMBOL
	| DESCRIBE_SYMBOL
	| DETERMINISTIC_SYMBOL
	| DO_SYMBOL
	| DROP_SYMBOL
	| ELSEIF_SYMBOL
	| ENFORCED_SYMBOL
	| ERROR_SYMBOL
	| EXCEPTION_SYMBOL
	| EXECUTE_SYMBOL
	| EXPLAIN_SYMBOL
	| EXPORT_SYMBOL
	| EXTEND_SYMBOL
	| EXTERNAL_SYMBOL
	| FILES_SYMBOL
	| FILTER_SYMBOL
	| FILL_SYMBOL
	| FIRST_SYMBOL
	| FOREIGN_SYMBOL
	| FORMAT_SYMBOL
	| FUNCTION_SYMBOL
	| GENERATED_SYMBOL
	| GRANT_SYMBOL
	| GROUP_ROWS_SYMBOL
	| HIDDEN_SYMBOL
	| IDENTITY_SYMBOL
	| IMMEDIATE_SYMBOL
	| IMMUTABLE_SYMBOL
	| IMPORT_SYMBOL
	| INCLUDE_SYMBOL
	| INCREMENT_SYMBOL
	| INDEX_SYMBOL
	| INOUT_SYMBOL
	| INPUT_SYMBOL
	| INSERT_SYMBOL
	| INVOKER_SYMBOL
	| ISOLATION_SYMBOL
	| ITERATE_SYMBOL
	| JSON_SYMBOL
	| KEY_SYMBOL
	| LANGUAGE_SYMBOL
	| LAST_SYMBOL
	| LEAVE_SYMBOL
	| LEVEL_SYMBOL
	| LOAD_SYMBOL
	| LOOP_SYMBOL
	| MACRO_SYMBOL
	| MAP_SYMBOL
	| MATCH_SYMBOL
	| KW_MATCH_RECOGNIZE_NONRESERVED_SYMBOL
	| MATCHED_SYMBOL
	| MATERIALIZED_SYMBOL
	| MAX_SYMBOL
	| MAXVALUE_SYMBOL
	| MEASURES_SYMBOL
	| MESSAGE_SYMBOL
	| METADATA_SYMBOL
	| MIN_SYMBOL
	| MINVALUE_SYMBOL
	| MODEL_SYMBOL
	| MODULE_SYMBOL
	| NUMERIC_SYMBOL
	| OFFSET_SYMBOL
	| ONLY_SYMBOL
	| OPTIONS_SYMBOL
	| OUT_SYMBOL
	| OUTPUT_SYMBOL
	| OVERWRITE_SYMBOL
	| PARTITIONS_SYMBOL
	| PATTERN_SYMBOL
	| PERCENT_SYMBOL
	| PIVOT_SYMBOL
	| POLICIES_SYMBOL
	| POLICY_SYMBOL
	| PRIMARY_SYMBOL
	| PRIVATE_SYMBOL
	| PRIVILEGE_SYMBOL
	| PRIVILEGES_SYMBOL
	| PROCEDURE_SYMBOL
	| PROJECT_SYMBOL
	| PUBLIC_SYMBOL
	| RAISE_SYMBOL
	| READ_SYMBOL
	| REFERENCES_SYMBOL
	| REMOTE_SYMBOL
	| REMOVE_SYMBOL
	| RENAME_SYMBOL
	| REPEAT_SYMBOL
	| REPEATABLE_SYMBOL
	| REPLACE_SYMBOL
	| REPLACE_FIELDS_SYMBOL
	| REPLICA_SYMBOL
	| REPORT_SYMBOL
	| RESTRICT_SYMBOL
	| RESTRICTION_SYMBOL
	| RETURNS_SYMBOL
	| RETURN_SYMBOL
	| REVOKE_SYMBOL
	| ROLLBACK_SYMBOL
	| ROW_SYMBOL
	| RUN_SYMBOL
	| SAFE_CAST_SYMBOL
	| SCHEMA_SYMBOL
	| SEARCH_SYMBOL
	| SECURITY_SYMBOL
	| SEQUENCE_SYMBOL
	| SETS_SYMBOL
	| SHOW_SYMBOL
	| SNAPSHOT_SYMBOL
	| SOURCE_SYMBOL
	| SQL_SYMBOL
	| STABLE_SYMBOL
	| START_SYMBOL
	| STATIC_DESCRIBE_SYMBOL
	| STORED_SYMBOL
	| STORING_SYMBOL
	| STRICT_SYMBOL
	| SYSTEM_SYMBOL
	| SYSTEM_TIME_SYMBOL
	| TABLE_SYMBOL
	| TABLES_SYMBOL
	| TARGET_SYMBOL
	| TEMP_SYMBOL
	| TEMPORARY_SYMBOL
	| TIME_SYMBOL
	| TIMESTAMP_SYMBOL
	| TRANSACTION_SYMBOL
	| TRANSFORM_SYMBOL
	| TRUNCATE_SYMBOL
	| TYPE_SYMBOL
	| UNDROP_SYMBOL
	| UNIQUE_SYMBOL
	| UNKNOWN_SYMBOL
	| UNPIVOT_SYMBOL
	| UNTIL_SYMBOL
	| UPDATE_SYMBOL
	| VALUE_SYMBOL
	| VALUES_SYMBOL
	| VECTOR_SYMBOL
	| VIEW_SYMBOL
	| VIEWS_SYMBOL
	| VOLATILE_SYMBOL
	| WEIGHT_SYMBOL
	| WHILE_SYMBOL
	| WRITE_SYMBOL
	| ZONE_SYMBOL
	| DESCRIPTOR_SYMBOL
	| INTERLEAVE_SYMBOL
	| NULL_FILTERED_SYMBOL
	| PARENT_SYMBOL;

token_identifier: IDENTIFIER;

struct_type:
	STRUCT_SYMBOL template_type_open template_type_close;

array_type:
	ARRAY_SYMBOL template_type_open type template_type_close;

template_type_open: LT_BRACKET_SYMBOL;

template_type_close: GT_BRACKET_SYMBOL;

date_or_time_literal: date_or_time_literal_kind string_literal;

date_or_time_literal_kind:
	DATE_SYMBOL
	| TIME_SYMBOL
	| DATETIME_SYMBOL
	| TIMESTAMP_SYMBOL;

floating_point_literal: FLOAT;

json_literal: JSON_SYMBOL string_literal;

bignumeric_literal: bignumeric_literal_prefix string_literal;

bignumeric_literal_prefix:
	BIGNUMERIC_SYMBOL
	| BIGDECIMAL_SYMBOL;

numeric_literal: numeric_literal_prefix string_literal;

numeric_literal_prefix: NUMERIC_SYMBOL | DECIMAL_SYMBOL;

integer_literal: INTEGER_LITERAL;

bytes_literal:
	bytes_literal_component
	| bytes_literal bytes_literal_component {
	 literalStopIndex, componentStartIndex := localctx.Bytes_literal().GetStop().GetStop(),
	 localctx.Bytes_literal_component().GetStart().GetStart() if literalStopIndex + 1 ==
	 componentStartIndex { p.NotifyErrorListeners("Syntax error: concatenated bytes literals must be
	 separated by whitespace or comments.", nil, nil) } }
	| bytes_literal string_literal_component {p.NotifyErrorListeners("Syntax error: string and bytes literals cannot be concatenated.", nil,
	 nil); };

boolean_literal: TRUE_SYMBOL | FALSE_SYMBOL;

string_literal:
	string_literal_component
	| string_literal string_literal_component {
	 literalStopIndex, componentStartIndex := localctx.String_literal().GetStop().GetStop(),
	 localctx.String_literal_component().GetStart().GetStart() if literalStopIndex + 1 ==
	 componentStartIndex { p.NotifyErrorListeners("Syntax error: concatenated string literals must
	 be separated by whitespace or comments.", nil, nil) } }
	| string_literal bytes_literal_component {p.NotifyErrorListeners("Syntax error: string and bytes literals cannot
	 be concatenated.", nil, nil); };

string_literal_component: STRING_LITERAL;

bytes_literal_component: BYTES_LITERAL;

count: number;
skip_rows: number;

/*
 Name can be any ID or string, with optional quotes and parens name : ID | '"' name '"' | LR_BRACKET
 name RR_BRACKET | BACKTICK name BACKTICK | '\'' name '\'';
 */
name: ID | QUOTED_ID;

// Name rules

/* Each specific type of name just expands to the parent name rule. This lets us assign handlers to
 only a specific type of name. (i.e. we care about cte_names and column_names, but not about
 datatype_names)
 */
cte_name: name;
column_name: name;
alias_name: name;
table_name: name;

number: integer_type | float_type;
integer_type: INT;
float_type: FLOAT;