parser grammar GoogleSQLParser;

options {
	tokenVocab = GoogleSQLLexer;
}

root: stmts EOF;

stmts: stmt (SEMI_SYMBOL stmt)* SEMI_SYMBOL?;

stmt: query_statement;

// query_statement: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax
query_statement: query;

query: query_without_pipe_operators;

query_without_pipe_operators:
	with_clause query_primary_or_set_operation order_by_clause? limit_offset_clause?
	| with_clause_with_trailing_comma select_or_from_keyword {p.NotifyErrorListeners("Syntax error: Trailing comma after the WITH " "clause before the main query is not allowed", nil, nil)
		}
	| with_clause PIPE_SYMBOL {p.NotifyErrorListeners("Syntax error: A pipe operator cannot follow "
                               "the WITH clause before the main query; The "
                               "main query usually starts with SELECT or "
                               "FROM here", nil, nil)}
	| query_primary_or_set_operation order_by_clause? limit_offset_clause?
	| with_clause? from_clause
	// FIXME(zp): Inject the keyword from original input.
	| with_clause? from_clause bad_keyword_after_from_query {p.NotifyErrorListeners("Syntax error: ", "<KEYWORD>", " not supported after FROM query; "
            "Consider using pipe operator `|>` ", nil, nil)}
	| with_clause? from_clause bad_keyword_after_from_query_allows_parens {p.NotifyErrorListeners("Syntax error: ", "<KEYWORD>", " not supported after FROM query; "
            "Consider using pipe operator `|>` ", nil, nil)};

bad_keyword_after_from_query:
	WHERE_SYMBOL
	| SELECT_SYMBOL
	| GROUP_SYMBOL;

bad_keyword_after_from_query_allows_parens:
	ORDER_SYMBOL
	| UNION_SYMBOL
	| INTERSECT_SYMBOL
	| EXCEPT_SYMBOL
	| LIMIT_SYMBOL;

with_clause_with_trailing_comma: with_clause COMMA_SYMBOL;

select_or_from_keyword: SELECT_SYMBOL | FROM_SYMBOL;

query_primary_or_set_operation:
	query_primary
	| query_set_operation;

query_set_operation: query_set_operation_prefix;

query_set_operation_prefix:
	query_primary set_operation_metadata query_primary
	| query_set_operation_prefix set_operation_metadata query_primary
	| query_primary set_operation_metadata FROM_SYMBOL { p.NotifyErrorListeners("Syntax error: Unexpected FROM;" "FROM queries following a set operation must be parenthesized", nil, nil); 
		}
	| query_set_operation_prefix set_operation_metadata FROM_SYMBOL { p.NotifyErrorListeners("Syntax error: Unexpected FROM;" "FROM queries following a set operation must be parenthesized", nil, nil); 
		};

query_primary:
	select
	| parenthesized_query opt_as_alias_with_required_as;

set_operation_metadata:
	opt_corresponding_outer_mode? query_set_operation_type hint? all_or_distinct opt_strict?
		opt_column_match_suffix?;

opt_column_match_suffix:
	CORRESPONDING_SYMBOL
	| CORRESPONDING_SYMBOL BY_SYMBOL;

opt_strict: STRICT_SYMBOL;

all_or_distinct: ALL_SYMBOL | DISTINCT_SYMBOL;

query_set_operation_type:
	UNION_SYMBOL
	| EXCEPT_SYMBOL
	| INTERSECT_SYMBOL;

opt_corresponding_outer_mode:
	FULL_SYMBOL opt_outer?
	| OUTER_SYMBOL
	| LEFT_SYMBOL opt_outer?;

opt_outer: OUTER_SYMBOL;

with_clause:
	WITH_SYMBOL aliased_query
	| WITH_SYMBOL RECURSIVE_SYMBOL aliased_query
	| with_clause COMMA_SYMBOL aliased_query;

aliased_query:
	identifier AS_SYMBOL parenthesized_query opt_aliased_query_modifiers?;

opt_aliased_query_modifiers: recursion_depth_modifier;

recursion_depth_modifier:
	WITH_SYMBOL DEPTH_SYMBOL opt_as_alias_with_required_as?
	| WITH_SYMBOL DEPTH_SYMBOL opt_as_alias_with_required_as BETWEEN_SYMBOL
		possibly_unbounded_int_literal_or_parameter AND_SYMBOL
		possibly_unbounded_int_literal_or_parameter
	| WITH_SYMBOL DEPTH_SYMBOL opt_as_alias_with_required_as MAX_SYMBOL
		possibly_unbounded_int_literal_or_parameter;

possibly_unbounded_int_literal_or_parameter:
	int_literal_or_parameter
	| UNBOUNDED_SYMBOL;

int_literal_or_parameter:
	integer_literal
	| parameter_expression
	| system_variable_expression;

limit_clause: LIMIT_SYMBOL count (OFFSET_SYMBOL skip_rows);

order_by_clause: order_by_clause_prefix;

order_by_clause_prefix:
	ORDER_SYMBOL hint? BY_SYMBOL ordering_expression (
		COMMA_SYMBOL ordering_expression
	)*;

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

select: select_clause from_clause? opt_clauses_following_from;

opt_clauses_following_from:
	where_clause group_by_clause? having_clause? qualify_clause_nonreserved? window_clause?
	| opt_clauses_following_where;

opt_clauses_following_where:
	group_by_clause having_clause? qualify_clause_nonreserved? window_clause?
	| opt_clauses_following_group_by;

opt_clauses_following_group_by:
	having_clause? qualify_clause_nonreserved? window_clause?
	| qualify_clause_nonreserved? window_clause?;

window_clause: window_clause_prefix;

window_clause_prefix:
	WINDOW_SYMBOL window_definition (
		COMMA_SYMBOL window_definition
	)*;

window_definition: identifier AS_SYMBOL window_specification;

where_clause: WHERE_SYMBOL expression;

having_clause: HAVING_SYMBOL expression;

group_by_clause: group_by_all | group_by_clause_prefix;

group_by_all: group_by_preamble ALL_SYMBOL;

select_clause:
	SELECT_SYMBOL hint? opt_select_with? all_or_distinct? opt_select_as_clause? select_list
	| SELECT_SYMBOL hint? opt_select_with? all_or_distinct? opt_select_as_clause? FROM_SYMBOL {p.NotifyErrorListeners("Syntax error: SELECT list must not be empty", nil, nil)
		};

opt_select_as_clause:
	AS_SYMBOL STRUCT_SYMBOL
	| AS_SYMBOL path_expression;

opt_select_with:
	WITH_SYMBOL identifier
	| WITH_SYMBOL identifier OPTIONS_SYMBOL options_list;

// from_clause: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax#from_clause
from_clause: FROM_SYMBOL from_clause_contents;

from_clause_contents:
	table_primary
	| from_clause_contents COMMA_SYMBOL table_primary
	| from_clause_contents opt_natural? join_type? join_hint
	| AT_SYMBOL {p.NotifyErrorListeners("Query parameters cannot be used in place of table names",nil,nil)
		}
	| QUESTION_SYMBOL {p.NotifyErrorListeners("Query parameters cannot be used in place of table names",nil,nil)
		}
	| ATAT_SYMBOL {p.NotifyErrorListeners("System variables cannot be used in place of table names",nil,nil)
		};

table_primary:
	tvf_with_suffixes
	| table_path_expression
	| LR_BRACKET_SYMBOL join RR_BRACKET_SYMBOL
	| table_subquery
	| table_primary match_recognize_clause
	| table_primary sample_clause;

tvf_with_suffixes:
	tvf_prefix_no_args RR_BRACKET_SYMBOL hint? pivot_or_unpivot_clause_and_aliases?
	| tvf_prefix RR_BRACKET_SYMBOL hint? pivot_or_unpivot_clause_and_aliases?;

pivot_or_unpivot_clause_and_aliases:
	AS_SYMBOL identifier
	| identifier
	| AS_SYMBOL identifier pivot_clause as_alias?
	| AS_SYMBOL identifier unpivot_clause as_alias?
	| AS_SYMBOL identifier qualify_clause_nonreserved {
				 p.NotifyErrorListeners("QUALIFY clause must be used in conjunction with WHERE or GROUP BY " "or HAVING clause", nil, nil); 
		}
	| identifier pivot_clause as_alias
	| identifier unpivot_clause as_alias
	| identifier qualify_clause_nonreserved {
				 p.NotifyErrorListeners("QUALIFY clause must be used in conjunction with WHERE or GROUP BY " "or HAVING clause", nil, nil); 
		}
	| pivot_clause as_alias?
	| unpivot_clause as_alias?
	| qualify_clause_nonreserved {
				 p.NotifyErrorListeners("QUALIFY clause must be used in conjunction with WHERE or GROUP BY " "or HAVING clause", nil, nil); 
		};

sample_clause:
	TABLESAMPLE_SYMBOL identifier LR_BRACKET_SYMBOL sample_size RR_BRACKET_SYMBOL
		opt_sample_clause_suffix;

opt_sample_clause_suffix:
	repeatable_clause
	| WITH_SYMBOL WEIGHT_SYMBOL repeatable_clause?
	| WITH_SYMBOL WEIGHT_SYMBOL identifier repeatable_clause?
	| WITH_SYMBOL WEIGHT_SYMBOL AS_SYMBOL identifier repeatable_clause?;

repeatable_clause:
	REPEATABLE_SYMBOL LR_BRACKET_SYMBOL possibly_cast_int_literal_or_parameter RR_BRACKET_SYMBOL;

possibly_cast_int_literal_or_parameter:
	cast_int_literal_or_parameter
	| int_literal_or_parameter;

cast_int_literal_or_parameter:
	CAST_SYMBOL LR_BRACKET_SYMBOL int_literal_or_parameter AS_SYMBOL type opt_format?
		RR_BRACKET_SYMBOL;

sample_size:
	sample_size_value sample_size_unit partition_by_clause_prefix_no_hint?;

sample_size_value:
	possibly_cast_int_literal_or_parameter
	| floating_point_literal;

sample_size_unit: ROWS_SYMBOL | PERCENT_SYMBOL;

partition_by_clause_prefix_no_hint:
	PARTITION_SYMBOL BY_SYMBOL expression (
		COMMA_SYMBOL expression
	)*;

match_recognize_clause:
	MATCH_RECOGNIZE_SYMBOL LR_BRACKET_SYMBOL partition_by_clause_prefix? order_by_clause
		MEASURES_SYMBOL select_list_prefix_with_as_aliases PATTERN_SYMBOL LR_BRACKET_SYMBOL
		row_pattern_expr RR_BRACKET_SYMBOL DEFINE_SYMBOL with_expression_variable_prefix
		RR_BRACKET_SYMBOL as_alias?;

row_pattern_expr:
	row_pattern_concatenation
	| row_pattern_expr STROKE_SYMBOL row_pattern_concatenation;

row_pattern_concatenation:
	row_pattern_factor
	| row_pattern_concatenation row_pattern_factor;

row_pattern_factor:
	identifier
	| LR_BRACKET_SYMBOL row_pattern_expr RR_BRACKET_SYMBOL;

select_list_prefix_with_as_aliases:
	select_column_expr_with_as_alias (
		COMMA_SYMBOL select_column_expr_with_as_alias
	)*;

select_column_expr_with_as_alias:
	expression AS_SYMBOL identifier;

table_subquery:
	parenthesized_query opt_pivot_or_unpivot_clause_and_alias?;

join: table_primary join_item*;

// join_item resolves the mutually left-recursive for [join, join_input]. join_input: join |
// table_primary;
join_item:
	opt_natural? join_type join_hint? JOIN_SYMBOL hint? table_primary on_or_using_clause_list?;

on_or_using_clause_list: on_or_using_clause+;

on_or_using_clause: on_clause | using_clause;

join_hint: HASH_SYMBOL | LOOKUP_SYMBOL;

table_path_expression:
	table_path_expression_base hint? opt_pivot_or_unpivot_clause_and_alias?
		opt_with_offset_and_alias? opt_at_system_time?;

opt_at_system_time:
	FOR_SYMBOL SYSTEM_SYMBOL TIME_SYMBOL AS_SYMBOL OF_SYMBOL expression
	| FOR_SYMBOL SYSTEM_TIME_SYMBOL AS_SYMBOL OF_SYMBOL expression;

opt_with_offset_and_alias: WITH_SYMBOL OFFSET_SYMBOL as_alias?;

opt_pivot_or_unpivot_clause_and_alias:
	AS_SYMBOL identifier
	| identifier
	| AS_SYMBOL identifier pivot_clause as_alias?
	| AS_SYMBOL identifier unpivot_clause as_alias?
	| AS_SYMBOL identifier qualify_clause_nonreserved {p.NotifyErrorListeners("QUALIFY clause must be used in conjunction with WHERE or GROUP BY "
        "or HAVING clause", nil, nil)}
	| identifier pivot_clause as_alias?
	| identifier unpivot_clause as_alias?
	| identifier qualify_clause_nonreserved {p.NotifyErrorListeners("QUALIFY clause must be used in conjunction with WHERE or GROUP BY "
        "or HAVING clause", nil, nil)}
	| pivot_clause as_alias?
	| unpivot_clause as_alias?
	| qualify_clause_nonreserved {p.NotifyErrorListeners("QUALIFY clause must be used in conjunction with WHERE or GROUP BY "
        "or HAVING clause", nil, nil)};

table_path_expression_base:
	unnest_expression
	| maybe_slashed_or_dashed_path_expression
	| path_expression LS_BRACKET_SYMBOL {p.NotifyErrorListeners("Syntax error: Array element access is not allowed in the FROM "
            "clause without UNNEST; Use UNNEST(<expression>)",nil,nil)}
	| path_expression DOT_SYMBOL LR_BRACKET_SYMBOL {p.NotifyErrorListeners("Syntax error: Generalized field access is not allowed in the FROM "
            "clause without UNNEST; Use UNNEST(<expression>)",nil,nil)}
	| unnest_expression LS_BRACKET_SYMBOL {p.NotifyErrorListeners("Syntax error: Array element access is not allowed in the FROM "
            "clause without UNNEST; Use UNNEST(<expression>)",nil,nil)}
	| unnest_expression DOT_SYMBOL LR_BRACKET_SYMBOL {p.NotifyErrorListeners("Syntax error: Generalized field access is not allowed in the FROM "
            "clause without UNNEST; Use UNNEST(<expression>)",nil,nil)};

maybe_slashed_or_dashed_path_expression:
	maybe_dashed_path_expression
	| slashed_path_expression;

maybe_dashed_path_expression:
	path_expression
	| dashed_path_expression;

dashed_path_expression:
	dashed_identifier
	| dashed_path_expression DOT_SYMBOL identifier;

dashed_identifier:
	identifier DASH_SYMBOL identifier
	| dashed_identifier DASH_SYMBOL dashed_identifier
	| identifier DASH_SYMBOL INTEGER_LITERAL
	| dashed_identifier DASH_SYMBOL INTEGER_LITERAL
	| identifier DASH_SYMBOL floating_point_literal identifier
	| dashed_identifier DASH_SYMBOL floating_point_literal identifier;

slashed_identifier:
	SLASH_SYMBOL identifier_or_integer
	| slashed_identifier slashed_identifier_separator identifier_or_integer
	| slashed_identifier slashed_identifier_separator floating_point_literal
		slashed_identifier_separator identifier_or_integer;

identifier_or_integer:
	identifier
	| INTEGER_LITERAL; // TODO(zp): SCRIPT_LABEL;

slashed_identifier_separator:
	DASH_SYMBOL SLASH_SYMBOL COLON_SYMBOL;

slashed_path_expression:
	slashed_identifier
	| slashed_identifier slashed_identifier_separator floating_point_literal identifier;

unnest_expression:
	unnest_expression_prefix opt_array_zip_mode? RR_BRACKET_SYMBOL
	| UNNEST_SYMBOL LR_BRACKET_SYMBOL SELECT_SYMBOL {p.NotifyErrorListeners("The argument to UNNEST is an expression, not a query; to use a query "
        "as an expression, the query must be wrapped with additional "
        "parentheses to make it a scalar subquery expression", nil, nil)};

unnest_expression_prefix:
	UNNEST_SYMBOL LR_BRACKET_SYMBOL expression_with_opt_alias (
		COMMA_SYMBOL expression_with_opt_alias
	)*;

opt_array_zip_mode: COMMA_SYMBOL named_argument;

expression_with_opt_alias:
	expression opt_as_alias_with_required_as?;

tvf_prefix:
	tvf_prefix_no_args tvf_argument (COMMA_SYMBOL tvf_argument)*;

tvf_argument:
	expression
	| descriptor_argument
	| table_clause
	| model_clause
	| connection_clause
	| named_argument
	| LR_BRACKET_SYMBOL table_clause RR_BRACKET_SYMBOL {p.NotifyErrorListeners("Syntax error: Table arguments for table-valued function "
            "calls written as \"TABLE path\" must not be enclosed in "
            "parentheses. To fix this, replace (TABLE path) with TABLE path",nil,nil)}
	| LR_BRACKET_SYMBOL model_clause RR_BRACKET_SYMBOL {p.NotifyErrorListeners("Syntax error: Model arguments for table-valued function "
            "calls written as \"MODEL path\" must not be enclosed in "
            "parentheses. To fix this, replace (MODEL path) with MODEL path",nil,nil)}
	| LR_BRACKET_SYMBOL connection_clause RR_BRACKET_SYMBOL {p.NotifyErrorListeners("Syntax error: Connection arguments for table-valued function "
            "calls written as \"CONNECTION path\" must not be enclosed in "
            "parentheses. To fix this, replace (CONNECTION path) with "
            "CONNECTION path",nil,nil)}
	| LR_BRACKET_SYMBOL named_argument RR_BRACKET_SYMBOL {p.NotifyErrorListeners("Syntax error: Named arguments for table-valued function "
            "calls written as \"name => value\" must not be enclosed in "
            "parentheses. To fix this, replace (name => value) with "
            "name => value",nil,nil)}
	| SELECT_SYMBOL {p.NotifyErrorListeners("Syntax error: Each subquery argument for table-valued function "
            "calls must be enclosed in parentheses. To fix this, replace "
            "SELECT... with (SELECT...)",nil,nil)}
	| WITH_SYMBOL {p.NotifyErrorListeners("Syntax error: Each subquery argument for table-valued function "
            "calls must be enclosed in parentheses. To fix this, replace "
            "WITH... with (WITH...)",nil,nil)};

connection_clause: CONNECTION_SYMBOL path_expression_or_default;

path_expression_or_default: path_expression | DEFAULT_SYMBOL;

descriptor_argument:
	DESCRIPTOR_SYMBOL LR_BRACKET_SYMBOL descriptor_column_list RR_BRACKET_SYMBOL;

descriptor_column_list:
	descriptor_column (COMMA_SYMBOL descriptor_column)*;

descriptor_column: identifier;

table_clause:
	TABLE_SYMBOL tvf_with_suffixes
	| TABLE_SYMBOL path_expression;

model_clause: MODEL_SYMBOL path_expression;

qualify_clause_nonreserved: QUALIFY_SYMBOL expression;

unpivot_clause:
	UNPIVOT_SYMBOL unpivot_nulls_filter? LR_BRACKET_SYMBOL path_expression_list_with_opt_parens
		FOR_SYMBOL path_expression IN_SYMBOL unpivot_in_item_list RR_BRACKET_SYMBOL;

unpivot_in_item_list:
	unpivot_in_item_list_prefix RR_BRACKET_SYMBOL;

unpivot_in_item_list_prefix:
	LR_BRACKET_SYMBOL unpivot_in_item
	| unpivot_in_item_list_prefix COMMA_SYMBOL unpivot_in_item;

unpivot_in_item:
	path_expression_list_with_opt_parens opt_as_string_or_integer?;

opt_as_string_or_integer:
	AS_SYMBOL? string_literal
	| AS_SYMBOL? integer_literal;

path_expression_list_with_opt_parens:
	LR_BRACKET_SYMBOL path_expression_list RR_BRACKET_SYMBOL
	| path_expression_list;

path_expression_list:
	path_expression (COMMA_SYMBOL path_expression)*;

unpivot_nulls_filter:
	EXCLUDE_SYMBOL NULLS_SYMBOL
	| INCLUDE_SYMBOL NULLS_SYMBOL;

pivot_clause:
	PIVOT_SYMBOL LR_BRACKET_SYMBOL pivot_expression_list FOR_SYMBOL expression_higher_prec_than_and
		IN_SYMBOL LR_BRACKET_SYMBOL pivot_value_list RR_BRACKET_SYMBOL RR_BRACKET_SYMBOL;

pivot_expression_list:
	pivot_expression (COMMA_SYMBOL pivot_expression)*;

pivot_expression: expression as_alias?;

pivot_value_list: pivot_value (COMMA_SYMBOL pivot_value)*;

pivot_value: expression as_alias?;

tvf_prefix_no_args:
	path_expression
	| IF_SYMBOL LR_BRACKET_SYMBOL;

join_type:
	CROSS_SYMBOL
	| FULL_SYMBOL opt_outer?
	| INNER_SYMBOL
	| LEFT_SYMBOL opt_outer?
	| RIGHT_SYMBOL opt_outer?;

opt_natural: NATURAL_SYMBOL;

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
	| LR_BRACKET_SYMBOL query RR_BRACKET_SYMBOL as_alias?
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
	cte_name AS_SYMBOL LR_BRACKET_SYMBOL query RR_BRACKET_SYMBOL;

// recursive_cte: https://cloud.google.com/bigquery/docs/reference/standard-sql/query-syntax#recursive_cte
recursive_cte:
	cte_name AS_SYMBOL LR_BRACKET_SYMBOL recursive_union_operation RR_BRACKET_SYMBOL;

recursive_union_operation:
	base_term union_operator recursive_term;

base_term: query;

union_operator: UNION_SYMBOL ALL_SYMBOL;

recursive_term: query;

// expression: https://github.com/google/zetasql/blob/194cd32b5d766d60e3ca442651d792c7fe54ea74/zetasql/parser/bison_parser.y#L7712
expression:
	expression_higher_prec_than_and
	| and_expression
	| expression OR_SYMBOL expression;

// expression_higher_prec_than_and: https://github.com/google/zetasql/blob/194cd32b5d766d60e3ca442651d792c7fe54ea74/zetasql/parser/bison_parser.y#L7747
expression_higher_prec_than_and:
	unparenthesized_expression_higher_prec_than_and
	| parenthesized_expression_not_a_query
	| parenthesized_query;

parenthesized_query: LR_BRACKET_SYMBOL query RR_BRACKET_SYMBOL;

parenthesized_expression_not_a_query:
	LR_BRACKET_SYMBOL (
		parenthesized_expression_not_a_query
		| unparenthesized_expression_higher_prec_than_and
		| and_expression
		// Previous or_expression, replace by solving mutually left-recursive.
		| expression OR_SYMBOL expression
	) RR_BRACKET_SYMBOL;

and_expression:
	expression_higher_prec_than_and AND_SYMBOL expression_higher_prec_than_and (
		AND_SYMBOL expression_higher_prec_than_and
	)*;

// unparenthesized_expression_higher_prec_than_and:
// https://github.com/google/zetasql/blob/194cd32b5d766d60e3ca442651d792c7fe54ea74/zetasql/parser/bison_parser.y#L7781
// TODO(zp): Implement the rest of the expression.
unparenthesized_expression_higher_prec_than_and:
	null_literal
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
	| function_call_expression_with_clauses
	| interval_expression
	| identifier
	| struct_constructor
	| expression_subquery_with_keyword
	| expression_higher_prec_than_and LS_BRACKET_SYMBOL expression RS_BRACKET_SYMBOL
	| expression_higher_prec_than_and DOT_SYMBOL LR_BRACKET_SYMBOL path_expression RR_BRACKET_SYMBOL
	| expression_higher_prec_than_and DOT_SYMBOL identifier
	| NOT_SYMBOL expression_higher_prec_than_and
	| expression_higher_prec_than_and like_operator any_some_all hint? unnest_expression
	| expression_higher_prec_than_and like_operator any_some_all hint?
		parenthesized_anysomeall_list_in_rhs
	| expression_higher_prec_than_and like_operator expression_higher_prec_than_and;

parenthesized_anysomeall_list_in_rhs:
	parenthesized_query
	| parenthesized_expression_not_a_query
	| in_list_two_or_more_prefix RR_BRACKET_SYMBOL;

in_list_two_or_more_prefix:
	LR_BRACKET_SYMBOL expression COMMA_SYMBOL expression (
		COMMA_SYMBOL expression
	)*;

any_some_all: ANY_SYMBOL | SOME_SYMBOL | ALL_SYMBOL;

like_operator: LIKE_SYMBOL | NOT_SPECIAL_SYMBOL LIKE_SYMBOL;

expression_subquery_with_keyword:
	ARRAY_SYMBOL parenthesized_query
	| EXISTS_SYMBOL hint? parenthesized_query;

struct_constructor:
	struct_constructor_prefix_with_keyword RR_BRACKET_SYMBOL
	| struct_constructor_prefix_with_keyword_no_arg RR_BRACKET_SYMBOL
	| struct_constructor_prefix_without_keyword RR_BRACKET_SYMBOL;

struct_constructor_prefix_with_keyword:
	struct_constructor_prefix_with_keyword_no_arg struct_constructor_arg (
		COMMA_SYMBOL struct_constructor_arg
	)*;

struct_constructor_arg:
	expression opt_as_alias_with_required_as?;

struct_constructor_prefix_without_keyword:
	LR_BRACKET_SYMBOL expression COMMA_SYMBOL expression (
		COMMA_SYMBOL expression
	)*;

struct_constructor_prefix_with_keyword_no_arg:
	struct_type LR_BRACKET_SYMBOL
	| STRUCT_SYMBOL LR_BRACKET_SYMBOL;

interval_expression:
	INTERVAL_SYMBOL expression identifier (TO_SYMBOL identifier)?;

function_call_expression_with_clauses:
	function_call_expression hint? with_group_rows? over_clause?;

function_call_expression:
	// Empty argument list.
	function_call_expression_base opt_having_or_group_by_modifier? order_by_clause?
		limit_offset_clause? RR_BRACKET_SYMBOL
	| function_call_expression_with_args_prefix opt_null_handling_modifier?
		opt_having_or_group_by_modifier? clamped_between_modifier? with_report_modifier?
		order_by_clause? limit_offset_clause? RR_BRACKET_SYMBOL;

function_call_expression_with_args_prefix:
	function_call_expression_base (
		function_call_argument
		| ASTERISK_SYMBOL
	) (COMMA_SYMBOL function_call_argument)*;

function_call_expression_base:
	expression_higher_prec_than_and LR_BRACKET_SYMBOL DISTINCT_SYMBOL
	| expression_higher_prec_than_and LR_BRACKET_SYMBOL
	| function_name_from_keyword LR_BRACKET_SYMBOL;

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
	PARTITION_SYMBOL hint? BY_SYMBOL expression (
		COMMA_SYMBOL expression
	)*;

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
	LR_BRACKET_SYMBOL options_entry (COMMA_SYMBOL options_entry)*;

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
	group_by_preamble grouping_item (COMMA_SYMBOL grouping_item)*;

group_by_preamble: GROUP_SYMBOL hint? opt_and_order? BY_SYMBOL;

opt_and_order: AND_SYMBOL ORDER_SYMBOL;

hint:
	/*XXX(zp): ABORT_CHECK*/ AT_SYMBOL integer_literal
	| hint_with_body;
hint_with_body: hint_with_body_prefix RC_BRACKET_SYMBOL;

hint_with_body_prefix:
	AT_SYMBOL (integer_literal AT_SYMBOL)? LC_BRACKET_SYMBOL hint_entry (
		COMMA_SYMBOL hint_entry
	)*;

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
	GROUPING_SYMBOL SETS_SYMBOL LR_BRACKET_SYMBOL grouping_set (
		COMMA_SYMBOL grouping_set
	)*;

grouping_set:
	LR_BRACKET_SYMBOL RR_BRACKET_SYMBOL
	| expression
	| rollup_list RR_BRACKET_SYMBOL
	| cube_list RR_BRACKET_SYMBOL;

cube_list:
	CUBE_SYMBOL LR_BRACKET_SYMBOL (COMMA_SYMBOL expression)*;

rollup_list:
	ROLLUP_SYMBOL LR_BRACKET_SYMBOL expression (
		COMMA_SYMBOL expression
	)*;

opt_as_alias_with_required_as: AS_SYMBOL identifier;

opt_grouping_item_order: opt_selection_item_order | null_order;

opt_selection_item_order: asc_or_desc null_order?;

asc_or_desc: ASC_SYMBOL | DESC_SYMBOL;

null_order:
	NULLS_SYMBOL FIRST_SYMBOL
	| NULLS_SYMBOL LAST_SYMBOL;

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
	REPLACE_FIELDS_SYMBOL LR_BRACKET_SYMBOL expression COMMA_SYMBOL replace_fields_arg (
		COMMA_SYMBOL replace_fields_arg
	)*;

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
	with_expression_variable (
		COMMA_SYMBOL with_expression_variable
	)*;

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
	CASE_SYMBOL expression (
		WHEN_SYMBOL expression THEN_SYMBOL expression
	)+;

case_no_value_expression_prefix:
	CASE_SYMBOL (WHEN_SYMBOL expression THEN_SYMBOL expression)+;

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
	new_constructor_prefix_no_arg new_constructor_arg (
		COMMA_SYMBOL new_constructor_arg
	)*;

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
	array_constructor_prefix_no_expressions expression (
		COMMA_SYMBOL expression
	)*;

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
	LR_BRACKET_SYMBOL type_parameter (
		COMMA_SYMBOL type_parameter
	)*;

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
	FUNCTION_SYMBOL template_type_open LR_BRACKET_SYMBOL type (
		COMMA_SYMBOL type
	)*;

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

null_literal: NULL_SYMBOL;

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