// Generated from /Users/h3n4l/OpenSource/google-sql-parser/GoogleSQLParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GoogleSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARRAY_SYMBOL=1, ALL_SYMBOL=2, AS_SYMBOL=3, ASC_SYMBOL=4, BY_SYMBOL=5, 
		CROSS_SYMBOL=6, JOIN_SYMBOL=7, DELTA_SYMBOL=8, DESC_SYMBOL=9, DIFFERENTIAL_PRIVACY_SYMBOL=10, 
		DISTINCT_SYMBOL=11, EPSILON_SYMBOL=12, EXCEPT_SYMBOL=13, EXCLUDE_SYMBOL=14, 
		FOR_SYMBOL=15, FROM_SYMBOL=16, FULL_SYMBOL=17, IN_SYMBOL=18, INCLUDE_SYMBOL=19, 
		INNER_SYMBOL=20, INTERSECT_SYMBOL=21, LEFT_SYMBOL=22, LIMIT_SYMBOL=23, 
		MAX_GROUPS_CONTRIBUTED_SYMBOL=24, NULL_SYMBOL=25, NULLS_SYMBOL=26, OF_SYMBOL=27, 
		OFFSET_SYMBOL=28, ON_SYMBOL=29, OPTIONS_SYMBOL=30, ORDER_SYMBOL=31, OUTER_SYMBOL=32, 
		PERCENT_SYMBOL=33, PIVOT_SYMBOL=34, PRIVACY_UNIT_COLUMN_SYMBOL=35, RIGHT_SYMBOL=36, 
		RECURSIVE_SYMBOL=37, REPLACE_SYMBOL=38, UNPIVOT_SYMBOL=39, SELECT_SYMBOL=40, 
		STRUCT_SYMBOL=41, SYSTEM_SYMBOL=42, SYSTEM_TIME_SYMBOL=43, TABLESAMPLE_SYMBOL=44, 
		UNION_SYMBOL=45, UNNEST_SYMBOL=46, USING_SYMBOL=47, VALUE_SYMBOL=48, WITH_SYMBOL=49, 
		TRUE_SYMBOL=50, FALSE_SYMBOL=51, NUMERIC_SYMBOL=52, DECIMAL_SYMBOL=53, 
		BIGNUMERIC_SYMBOL=54, BIGDECIMAL_SYMBOL=55, NOT_SYMBOL=56, AND_SYMBOL=57, 
		JSON_SYMBOL=58, DATE_SYMBOL=59, TIME_SYMBOL=60, DATETIME_SYMBOL=61, TIMESTAMP_SYMBOL=62, 
		RANGE_SYMBOL=63, INTERVAL_SYMBOL=64, SIMPLE_SYMBOL=65, ABORT_SYMBOL=66, 
		ACCESS_SYMBOL=67, ACTION_SYMBOL=68, AGGREGATE_SYMBOL=69, ADD_SYMBOL=70, 
		ALTER_SYMBOL=71, ALWAYS_SYMBOL=72, ANALYZE_SYMBOL=73, APPROX_SYMBOL=74, 
		ARE_SYMBOL=75, ASSERT_SYMBOL=76, BATCH_SYMBOL=77, BEGIN_SYMBOL=78, BREAK_SYMBOL=79, 
		CALL_SYMBOL=80, CASCADE_SYMBOL=81, CHECK_SYMBOL=82, CLAMPED_SYMBOL=83, 
		CLONE_SYMBOL=84, COPY_SYMBOL=85, CLUSTER_SYMBOL=86, COLUMN_SYMBOL=87, 
		COLUMNS_SYMBOL=88, COMMIT_SYMBOL=89, CONNECTION_SYMBOL=90, CONSTANT_SYMBOL=91, 
		CONSTRAINT_SYMBOL=92, CONTINUE_SYMBOL=93, CORRESPONDING_SYMBOL=94, CYCLE_SYMBOL=95, 
		DATA_SYMBOL=96, DATABASE_SYMBOL=97, DECLARE_SYMBOL=98, DEFINER_SYMBOL=99, 
		DELETE_SYMBOL=100, DELETION_SYMBOL=101, DEPTH_SYMBOL=102, DESCRIBE_SYMBOL=103, 
		DETERMINISTIC_SYMBOL=104, DO_SYMBOL=105, DROP_SYMBOL=106, ELSEIF_SYMBOL=107, 
		ENFORCED_SYMBOL=108, ERROR_SYMBOL=109, EXCEPTION_SYMBOL=110, EXECUTE_SYMBOL=111, 
		EXPLAIN_SYMBOL=112, EXPORT_SYMBOL=113, EXTEND_SYMBOL=114, EXTERNAL_SYMBOL=115, 
		FILES_SYMBOL=116, FILTER_SYMBOL=117, FILL_SYMBOL=118, FIRST_SYMBOL=119, 
		FOREIGN_SYMBOL=120, FORMAT_SYMBOL=121, FUNCTION_SYMBOL=122, GENERATED_SYMBOL=123, 
		GRANT_SYMBOL=124, GROUP_ROWS_SYMBOL=125, HIDDEN_SYMBOL=126, IDENTITY_SYMBOL=127, 
		IMMEDIATE_SYMBOL=128, IMMUTABLE_SYMBOL=129, IMPORT_SYMBOL=130, INCREMENT_SYMBOL=131, 
		INDEX_SYMBOL=132, INOUT_SYMBOL=133, INPUT_SYMBOL=134, INSERT_SYMBOL=135, 
		INVOKER_SYMBOL=136, ISOLATION_SYMBOL=137, ITERATE_SYMBOL=138, KEY_SYMBOL=139, 
		LANGUAGE_SYMBOL=140, LAST_SYMBOL=141, LEAVE_SYMBOL=142, LEVEL_SYMBOL=143, 
		LOAD_SYMBOL=144, LOOP_SYMBOL=145, MACRO_SYMBOL=146, MAP_SYMBOL=147, MATCH_SYMBOL=148, 
		KW_MATCH_RECOGNIZE_NONRESERVED_SYMBOL=149, MATCHED_SYMBOL=150, MATERIALIZED_SYMBOL=151, 
		MAX_SYMBOL=152, MAXVALUE_SYMBOL=153, MEASURES_SYMBOL=154, MESSAGE_SYMBOL=155, 
		METADATA_SYMBOL=156, MIN_SYMBOL=157, MINVALUE_SYMBOL=158, MODEL_SYMBOL=159, 
		MODULE_SYMBOL=160, ONLY_SYMBOL=161, OUT_SYMBOL=162, OUTPUT_SYMBOL=163, 
		OVERWRITE_SYMBOL=164, PARTITIONS_SYMBOL=165, PATTERN_SYMBOL=166, POLICIES_SYMBOL=167, 
		POLICY_SYMBOL=168, PRIMARY_SYMBOL=169, PRIVATE_SYMBOL=170, PRIVILEGE_SYMBOL=171, 
		PRIVILEGES_SYMBOL=172, PROCEDURE_SYMBOL=173, PROJECT_SYMBOL=174, PUBLIC_SYMBOL=175, 
		RAISE_SYMBOL=176, READ_SYMBOL=177, REFERENCES_SYMBOL=178, REMOTE_SYMBOL=179, 
		REMOVE_SYMBOL=180, RENAME_SYMBOL=181, REPEAT_SYMBOL=182, REPEATABLE_SYMBOL=183, 
		REPLACE_FIELDS_SYMBOL=184, REPLICA_SYMBOL=185, REPORT_SYMBOL=186, RESTRICT_SYMBOL=187, 
		RESTRICTION_SYMBOL=188, RETURNS_SYMBOL=189, RETURN_SYMBOL=190, REVOKE_SYMBOL=191, 
		ROLLBACK_SYMBOL=192, ROW_SYMBOL=193, RUN_SYMBOL=194, SAFE_CAST_SYMBOL=195, 
		SCHEMA_SYMBOL=196, SEARCH_SYMBOL=197, SECURITY_SYMBOL=198, SEQUENCE_SYMBOL=199, 
		SETS_SYMBOL=200, SHOW_SYMBOL=201, SNAPSHOT_SYMBOL=202, SOURCE_SYMBOL=203, 
		SQL_SYMBOL=204, STABLE_SYMBOL=205, START_SYMBOL=206, STATIC_DESCRIBE_SYMBOL=207, 
		STORED_SYMBOL=208, STORING_SYMBOL=209, STRICT_SYMBOL=210, TABLE_SYMBOL=211, 
		TABLES_SYMBOL=212, TARGET_SYMBOL=213, TEMP_SYMBOL=214, TEMPORARY_SYMBOL=215, 
		TRANSACTION_SYMBOL=216, TRANSFORM_SYMBOL=217, TRUNCATE_SYMBOL=218, TYPE_SYMBOL=219, 
		UNDROP_SYMBOL=220, UNIQUE_SYMBOL=221, UNKNOWN_SYMBOL=222, UNTIL_SYMBOL=223, 
		UPDATE_SYMBOL=224, VALUES_SYMBOL=225, VECTOR_SYMBOL=226, VIEW_SYMBOL=227, 
		VIEWS_SYMBOL=228, VOLATILE_SYMBOL=229, WEIGHT_SYMBOL=230, WHILE_SYMBOL=231, 
		WRITE_SYMBOL=232, ZONE_SYMBOL=233, DESCRIPTOR_SYMBOL=234, INTERLEAVE_SYMBOL=235, 
		NULL_FILTERED_SYMBOL=236, PARENT_SYMBOL=237, COLLATE_SYMBOL=238, ASTERISK_SYMBOL=239, 
		COMMA_SYMBOL=240, DOT_SYMBOL=241, EQUAL_SYMBOL=242, LC_BRACKET_SYMBOL=243, 
		RC_BRACKET_SYMBOL=244, LT_BRACKET_SYMBOL=245, GT_BRACKET_SYMBOL=246, LR_BRACKET_SYMBOL=247, 
		RR_BRACKET_SYMBOL=248, LS_BRACKET_SYMBOL=249, RS_BRACKET_SYMBOL=250, SEMI_SYMBOL=251, 
		SINGLE_QUOTE_SYMBOL=252, SINGLE_QUOTE_3_SYMBOL=253, DOUBLE_QUOTE_SYMBOL=254, 
		DOUBLE_QUOTE_3_SYMBOL=255, BACKQUOTE_SYMBOL=256, DASH_SYMBOL=257, QUESTION_SYMBOL=258, 
		AT_SYMBOL=259, ATAT_SYMBOL=260, QUOTED_ID=261, ID=262, INT=263, FLOAT=264, 
		STRING_LITERAL=265, BYTES_LITERAL=266, UNCLOSED_STRING_LITERAL=267, UNCLOSED_TRIPLE_QUOTED_STRING_LITERAL=268, 
		UNCLOSED_RAW_STRING_LITERAL=269, UNCLOSED_TRIPLE_QUOTED_RAW_STRING_LITERAL=270, 
		UNCLOSED_BYTES_LITERAL=271, UNCLOSED_TRIPLE_QUOTED_BYTES_LITERAL=272, 
		UNCLOSED_RAW_BYTES_LITERAL=273, UNCLOSED_TRIPLE_QUOTED_RAW_BYTES_LITERAL=274, 
		INTEGER_LITERAL=275, IDENTIFIER=276, UNCLOSED_ESCAPED_IDENTIFIER=277, 
		FUNCTION_RETURN=278, WHITESPACE=279;
	public static final int
		RULE_root = 0, RULE_stmts = 1, RULE_stmt = 2, RULE_query_statement = 3, 
		RULE_query_expr = 4, RULE_query_primary = 5, RULE_limit_clause = 6, RULE_order_by_clause = 7, 
		RULE_order_by_expr_list = 8, RULE_order_by_expr_list_item = 9, RULE_set_operator = 10, 
		RULE_select = 11, RULE_from_clause = 12, RULE_tablesample_operator = 13, 
		RULE_unpivot_operator = 14, RULE_single_column_unpivot = 15, RULE_multi_column_unpivot = 16, 
		RULE_values_column_set = 17, RULE_columns_to_unpivot_list = 18, RULE_columns_to_unpivot_item = 19, 
		RULE_column_sets_to_unpivot = 20, RULE_pivot_operator = 21, RULE_pivot_column_as_alias_list = 22, 
		RULE_pivot_column_as_alias_list_item = 23, RULE_aggregate_function_call_as_alias_list = 24, 
		RULE_aggregate_function_call_as_alias_list_item = 25, RULE_from_item = 26, 
		RULE_unnest_operator = 27, RULE_cross_join_operator = 28, RULE_conditional_join_operator = 29, 
		RULE_join_condition = 30, RULE_on_clause = 31, RULE_using_clause = 32, 
		RULE_select_list = 33, RULE_select_list_item = 34, RULE_select_expression = 35, 
		RULE_select_all = 36, RULE_select_all_except_clause = 37, RULE_select_all_replace_clause = 38, 
		RULE_column_name_list = 39, RULE_expr_as_alias_list = 40, RULE_expr_as_alias_item = 41, 
		RULE_as_alias = 42, RULE_differential_privacy_clause = 43, RULE_privacy_parameters = 44, 
		RULE_with_statement = 45, RULE_cte = 46, RULE_non_recursive_cte = 47, 
		RULE_recursive_cte = 48, RULE_recursive_union_operation = 49, RULE_base_term = 50, 
		RULE_union_operator = 51, RULE_recursive_term = 52, RULE_expression = 53, 
		RULE_expression_higher_prec_than_and = 54, RULE_unparenthesized_expression_higher_prec_than_and = 55, 
		RULE_array_constructor = 56, RULE_array_constructor_prefix = 57, RULE_array_constructor_prefix_no_expressions = 58, 
		RULE_range_literal = 59, RULE_range_type = 60, RULE_type = 61, RULE_collate_clause = 62, 
		RULE_string_literal_or_parameter = 63, RULE_system_variable_expression = 64, 
		RULE_parameter_expression = 65, RULE_named_parameter_expression = 66, 
		RULE_opt_type_parameters = 67, RULE_type_parameters_prefix = 68, RULE_type_parameter = 69, 
		RULE_raw_type = 70, RULE_map_type = 71, RULE_function_type = 72, RULE_function_type_prefix = 73, 
		RULE_type_name = 74, RULE_path_expression = 75, RULE_identifier = 76, 
		RULE_keyword_as_identifier = 77, RULE_common_keyword_as_identifier = 78, 
		RULE_token_identifier = 79, RULE_struct_type = 80, RULE_array_type = 81, 
		RULE_template_type_open = 82, RULE_template_type_close = 83, RULE_date_or_time_literal = 84, 
		RULE_date_or_time_literal_kind = 85, RULE_floating_point_literal = 86, 
		RULE_json_literal = 87, RULE_bignumeric_literal = 88, RULE_bignumeric_literal_prefix = 89, 
		RULE_numeric_literal = 90, RULE_numeric_literal_prefix = 91, RULE_integer_literal = 92, 
		RULE_bytes_literal = 93, RULE_boolean_literal = 94, RULE_string_literal = 95, 
		RULE_string_literal_component = 96, RULE_bytes_literal_component = 97, 
		RULE_count = 98, RULE_skip_rows = 99, RULE_name = 100, RULE_cte_name = 101, 
		RULE_column_name = 102, RULE_alias_name = 103, RULE_table_name = 104, 
		RULE_number = 105, RULE_integer_type = 106, RULE_float_type = 107;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "stmts", "stmt", "query_statement", "query_expr", "query_primary", 
			"limit_clause", "order_by_clause", "order_by_expr_list", "order_by_expr_list_item", 
			"set_operator", "select", "from_clause", "tablesample_operator", "unpivot_operator", 
			"single_column_unpivot", "multi_column_unpivot", "values_column_set", 
			"columns_to_unpivot_list", "columns_to_unpivot_item", "column_sets_to_unpivot", 
			"pivot_operator", "pivot_column_as_alias_list", "pivot_column_as_alias_list_item", 
			"aggregate_function_call_as_alias_list", "aggregate_function_call_as_alias_list_item", 
			"from_item", "unnest_operator", "cross_join_operator", "conditional_join_operator", 
			"join_condition", "on_clause", "using_clause", "select_list", "select_list_item", 
			"select_expression", "select_all", "select_all_except_clause", "select_all_replace_clause", 
			"column_name_list", "expr_as_alias_list", "expr_as_alias_item", "as_alias", 
			"differential_privacy_clause", "privacy_parameters", "with_statement", 
			"cte", "non_recursive_cte", "recursive_cte", "recursive_union_operation", 
			"base_term", "union_operator", "recursive_term", "expression", "expression_higher_prec_than_and", 
			"unparenthesized_expression_higher_prec_than_and", "array_constructor", 
			"array_constructor_prefix", "array_constructor_prefix_no_expressions", 
			"range_literal", "range_type", "type", "collate_clause", "string_literal_or_parameter", 
			"system_variable_expression", "parameter_expression", "named_parameter_expression", 
			"opt_type_parameters", "type_parameters_prefix", "type_parameter", "raw_type", 
			"map_type", "function_type", "function_type_prefix", "type_name", "path_expression", 
			"identifier", "keyword_as_identifier", "common_keyword_as_identifier", 
			"token_identifier", "struct_type", "array_type", "template_type_open", 
			"template_type_close", "date_or_time_literal", "date_or_time_literal_kind", 
			"floating_point_literal", "json_literal", "bignumeric_literal", "bignumeric_literal_prefix", 
			"numeric_literal", "numeric_literal_prefix", "integer_literal", "bytes_literal", 
			"boolean_literal", "string_literal", "string_literal_component", "bytes_literal_component", 
			"count", "skip_rows", "name", "cte_name", "column_name", "alias_name", 
			"table_name", "number", "integer_type", "float_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ARRAY'", "'ALL'", "'AS'", "'ASC'", "'BY'", "'CROSS'", "'JOIN'", 
			"'DELTA'", "'DESC'", "'DIFFERENTIAL_PRIVACY'", "'DISTINCT'", "'EPSILON'", 
			"'EXCEPT'", "'EXCLUDE'", "'FOR'", "'FROM'", "'FULL'", "'IN'", "'INCLUDE'", 
			"'INNER'", "'INTERSECT'", "'LEFT'", "'LIMIT'", "'MAX_GROUPS_CONTRIBUTED'", 
			"'NULL'", "'NULLS'", "'OF'", "'OFFSET'", "'ON'", "'OPTIONS'", "'ORDER'", 
			"'OUTER'", "'PERCENT'", "'PIVOT'", "'PRIVACY_UNIT_COLUMN'", "'RIGHT'", 
			"'RECURSIVE'", "'REPLACE'", "'UNPIVOT'", "'SELECT'", "'STRUCT'", "'SYSTEM'", 
			"'SYSTEM_TIME'", "'TABLESAMPLE'", "'UNION'", "'UNNEST'", "'USING'", "'VALUE'", 
			"'WITH'", "'TRUE'", "'FALSE'", "'NUMERIC'", "'DECIMAL'", "'BIGNUMERIC'", 
			"'BIGDECIMAL'", "'NOT'", "'AND'", "'JSON'", "'DATE'", "'TIME'", "'DATETIME'", 
			"'TIMESTAMP'", "'RANGE'", "'INTERVAL'", "'SIMPLE'", "'ABORT'", "'ACCESS'", 
			"'ACTION'", "'AGGREGATE'", "'ADD'", "'ALTER'", "'ALWAYS'", "'ANALYZE'", 
			"'APPROX'", "'ARE'", "'ASSERT'", "'BATCH'", "'BEGIN'", "'BREAK'", "'CALL'", 
			"'CASCADE'", "'CHECK'", "'CLAMPED'", "'CLONE'", "'COPY'", "'CLUSTER'", 
			"'COLUMN'", "'COLUMNS'", "'COMMIT'", "'CONNECTION'", "'CONSTANT'", "'CONSTRAINT'", 
			"'CONTINUE'", "'CORRESPONDING'", "'CYCLE'", "'DATA'", "'DATABASE'", "'DECLARE'", 
			"'DEFINER'", "'DELETE'", "'DELETION'", "'DEPTH'", "'DESCRIBE'", "'DETERMINISTIC'", 
			"'DO'", "'DROP'", "'ELSEIF'", "'ENFORCED'", "'ERROR'", "'EXCEPTION'", 
			"'EXECUTE'", "'EXPLAIN'", "'EXPORT'", "'EXTEND'", "'EXTERNAL'", "'FILES'", 
			"'FILTER'", "'FILL'", "'FIRST'", "'FOREIGN'", "'FORMAT'", "'FUNCTION'", 
			"'GENERATED'", "'GRANT'", "'GROUP_ROWS'", "'HIDDEN'", "'IDENTITY'", "'IMMEDIATE'", 
			"'IMMUTABLE'", "'IMPORT'", "'INCREMENT'", "'INDEX'", "'INOUT'", "'INPUT'", 
			"'INSERT'", "'INVOKER'", "'ISOLATION'", "'ITERATE'", "'KEY'", "'LANGUAGE'", 
			"'LAST'", "'LEAVE'", "'LEVEL'", "'LOAD'", "'LOOP'", "'MACRO'", "'MAP'", 
			"'MATCH'", "'KW_MATCH_RECOGNIZE_NONRESERVED'", "'MATCHED'", "'MATERIALIZED'", 
			"'MAX'", "'MAXVALUE'", "'MEASURES'", "'MESSAGE'", "'METADATA'", "'MIN'", 
			"'MINVALUE'", "'MODEL'", "'MODULE'", "'ONLY'", "'OUT'", "'OUTPUT'", "'OVERWRITE'", 
			"'PARTITIONS'", "'PATTERN'", "'POLICIES'", "'POLICY'", "'PRIMARY'", "'PRIVATE'", 
			"'PRIVILEGE'", "'PRIVILEGES'", "'PROCEDURE'", "'PROJECT'", "'PUBLIC'", 
			"'RAISE'", "'READ'", "'REFERENCES'", "'REMOTE'", "'REMOVE'", "'RENAME'", 
			"'REPEAT'", "'REPEATABLE'", "'REPLACE_FIELDS'", "'REPLICA'", "'REPORT'", 
			"'RESTRICT'", "'RESTRICTION'", "'RETURNS'", "'RETURN'", "'REVOKE'", "'ROLLBACK'", 
			"'ROW'", "'RUN'", "'SAFE_CAST'", "'SCHEMA'", "'SEARCH'", "'SECURITY'", 
			"'SEQUENCE'", "'SETS'", "'SHOW'", "'SNAPSHOT'", "'SOURCE'", "'SQL'", 
			"'STABLE'", "'START'", "'STATIC_DESCRIBE'", "'STORED'", "'STORING'", 
			"'STRICT'", "'TABLE'", "'TABLES'", "'TARGET'", "'TEMP'", "'TEMPORARY'", 
			"'TRANSACTION'", "'TRANSFORM'", "'TRUNCATE'", "'TYPE'", "'UNDROP'", "'UNIQUE'", 
			"'UNKNOWN'", "'UNTIL'", "'UPDATE'", "'VALUES'", "'VECTOR'", "'VIEW'", 
			"'VIEWS'", "'VOLATILE'", "'WEIGHT'", "'WHILE'", "'WRITE'", "'ZONE'", 
			"'DESCRIPTOR'", "'INTERLEAVE'", "'NULL_FILTERED'", "'PARENT'", "'COLLATE'", 
			"'*'", "','", "'.'", "'='", "'{'", "'}'", "'<'", "'>'", "'('", "')'", 
			"'['", "']'", "';'", "'''", "'''''", "'\"'", "'\"\"\"'", "'`'", "'-'", 
			"'?'", "'@'", "'@@'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARRAY_SYMBOL", "ALL_SYMBOL", "AS_SYMBOL", "ASC_SYMBOL", "BY_SYMBOL", 
			"CROSS_SYMBOL", "JOIN_SYMBOL", "DELTA_SYMBOL", "DESC_SYMBOL", "DIFFERENTIAL_PRIVACY_SYMBOL", 
			"DISTINCT_SYMBOL", "EPSILON_SYMBOL", "EXCEPT_SYMBOL", "EXCLUDE_SYMBOL", 
			"FOR_SYMBOL", "FROM_SYMBOL", "FULL_SYMBOL", "IN_SYMBOL", "INCLUDE_SYMBOL", 
			"INNER_SYMBOL", "INTERSECT_SYMBOL", "LEFT_SYMBOL", "LIMIT_SYMBOL", "MAX_GROUPS_CONTRIBUTED_SYMBOL", 
			"NULL_SYMBOL", "NULLS_SYMBOL", "OF_SYMBOL", "OFFSET_SYMBOL", "ON_SYMBOL", 
			"OPTIONS_SYMBOL", "ORDER_SYMBOL", "OUTER_SYMBOL", "PERCENT_SYMBOL", "PIVOT_SYMBOL", 
			"PRIVACY_UNIT_COLUMN_SYMBOL", "RIGHT_SYMBOL", "RECURSIVE_SYMBOL", "REPLACE_SYMBOL", 
			"UNPIVOT_SYMBOL", "SELECT_SYMBOL", "STRUCT_SYMBOL", "SYSTEM_SYMBOL", 
			"SYSTEM_TIME_SYMBOL", "TABLESAMPLE_SYMBOL", "UNION_SYMBOL", "UNNEST_SYMBOL", 
			"USING_SYMBOL", "VALUE_SYMBOL", "WITH_SYMBOL", "TRUE_SYMBOL", "FALSE_SYMBOL", 
			"NUMERIC_SYMBOL", "DECIMAL_SYMBOL", "BIGNUMERIC_SYMBOL", "BIGDECIMAL_SYMBOL", 
			"NOT_SYMBOL", "AND_SYMBOL", "JSON_SYMBOL", "DATE_SYMBOL", "TIME_SYMBOL", 
			"DATETIME_SYMBOL", "TIMESTAMP_SYMBOL", "RANGE_SYMBOL", "INTERVAL_SYMBOL", 
			"SIMPLE_SYMBOL", "ABORT_SYMBOL", "ACCESS_SYMBOL", "ACTION_SYMBOL", "AGGREGATE_SYMBOL", 
			"ADD_SYMBOL", "ALTER_SYMBOL", "ALWAYS_SYMBOL", "ANALYZE_SYMBOL", "APPROX_SYMBOL", 
			"ARE_SYMBOL", "ASSERT_SYMBOL", "BATCH_SYMBOL", "BEGIN_SYMBOL", "BREAK_SYMBOL", 
			"CALL_SYMBOL", "CASCADE_SYMBOL", "CHECK_SYMBOL", "CLAMPED_SYMBOL", "CLONE_SYMBOL", 
			"COPY_SYMBOL", "CLUSTER_SYMBOL", "COLUMN_SYMBOL", "COLUMNS_SYMBOL", "COMMIT_SYMBOL", 
			"CONNECTION_SYMBOL", "CONSTANT_SYMBOL", "CONSTRAINT_SYMBOL", "CONTINUE_SYMBOL", 
			"CORRESPONDING_SYMBOL", "CYCLE_SYMBOL", "DATA_SYMBOL", "DATABASE_SYMBOL", 
			"DECLARE_SYMBOL", "DEFINER_SYMBOL", "DELETE_SYMBOL", "DELETION_SYMBOL", 
			"DEPTH_SYMBOL", "DESCRIBE_SYMBOL", "DETERMINISTIC_SYMBOL", "DO_SYMBOL", 
			"DROP_SYMBOL", "ELSEIF_SYMBOL", "ENFORCED_SYMBOL", "ERROR_SYMBOL", "EXCEPTION_SYMBOL", 
			"EXECUTE_SYMBOL", "EXPLAIN_SYMBOL", "EXPORT_SYMBOL", "EXTEND_SYMBOL", 
			"EXTERNAL_SYMBOL", "FILES_SYMBOL", "FILTER_SYMBOL", "FILL_SYMBOL", "FIRST_SYMBOL", 
			"FOREIGN_SYMBOL", "FORMAT_SYMBOL", "FUNCTION_SYMBOL", "GENERATED_SYMBOL", 
			"GRANT_SYMBOL", "GROUP_ROWS_SYMBOL", "HIDDEN_SYMBOL", "IDENTITY_SYMBOL", 
			"IMMEDIATE_SYMBOL", "IMMUTABLE_SYMBOL", "IMPORT_SYMBOL", "INCREMENT_SYMBOL", 
			"INDEX_SYMBOL", "INOUT_SYMBOL", "INPUT_SYMBOL", "INSERT_SYMBOL", "INVOKER_SYMBOL", 
			"ISOLATION_SYMBOL", "ITERATE_SYMBOL", "KEY_SYMBOL", "LANGUAGE_SYMBOL", 
			"LAST_SYMBOL", "LEAVE_SYMBOL", "LEVEL_SYMBOL", "LOAD_SYMBOL", "LOOP_SYMBOL", 
			"MACRO_SYMBOL", "MAP_SYMBOL", "MATCH_SYMBOL", "KW_MATCH_RECOGNIZE_NONRESERVED_SYMBOL", 
			"MATCHED_SYMBOL", "MATERIALIZED_SYMBOL", "MAX_SYMBOL", "MAXVALUE_SYMBOL", 
			"MEASURES_SYMBOL", "MESSAGE_SYMBOL", "METADATA_SYMBOL", "MIN_SYMBOL", 
			"MINVALUE_SYMBOL", "MODEL_SYMBOL", "MODULE_SYMBOL", "ONLY_SYMBOL", "OUT_SYMBOL", 
			"OUTPUT_SYMBOL", "OVERWRITE_SYMBOL", "PARTITIONS_SYMBOL", "PATTERN_SYMBOL", 
			"POLICIES_SYMBOL", "POLICY_SYMBOL", "PRIMARY_SYMBOL", "PRIVATE_SYMBOL", 
			"PRIVILEGE_SYMBOL", "PRIVILEGES_SYMBOL", "PROCEDURE_SYMBOL", "PROJECT_SYMBOL", 
			"PUBLIC_SYMBOL", "RAISE_SYMBOL", "READ_SYMBOL", "REFERENCES_SYMBOL", 
			"REMOTE_SYMBOL", "REMOVE_SYMBOL", "RENAME_SYMBOL", "REPEAT_SYMBOL", "REPEATABLE_SYMBOL", 
			"REPLACE_FIELDS_SYMBOL", "REPLICA_SYMBOL", "REPORT_SYMBOL", "RESTRICT_SYMBOL", 
			"RESTRICTION_SYMBOL", "RETURNS_SYMBOL", "RETURN_SYMBOL", "REVOKE_SYMBOL", 
			"ROLLBACK_SYMBOL", "ROW_SYMBOL", "RUN_SYMBOL", "SAFE_CAST_SYMBOL", "SCHEMA_SYMBOL", 
			"SEARCH_SYMBOL", "SECURITY_SYMBOL", "SEQUENCE_SYMBOL", "SETS_SYMBOL", 
			"SHOW_SYMBOL", "SNAPSHOT_SYMBOL", "SOURCE_SYMBOL", "SQL_SYMBOL", "STABLE_SYMBOL", 
			"START_SYMBOL", "STATIC_DESCRIBE_SYMBOL", "STORED_SYMBOL", "STORING_SYMBOL", 
			"STRICT_SYMBOL", "TABLE_SYMBOL", "TABLES_SYMBOL", "TARGET_SYMBOL", "TEMP_SYMBOL", 
			"TEMPORARY_SYMBOL", "TRANSACTION_SYMBOL", "TRANSFORM_SYMBOL", "TRUNCATE_SYMBOL", 
			"TYPE_SYMBOL", "UNDROP_SYMBOL", "UNIQUE_SYMBOL", "UNKNOWN_SYMBOL", "UNTIL_SYMBOL", 
			"UPDATE_SYMBOL", "VALUES_SYMBOL", "VECTOR_SYMBOL", "VIEW_SYMBOL", "VIEWS_SYMBOL", 
			"VOLATILE_SYMBOL", "WEIGHT_SYMBOL", "WHILE_SYMBOL", "WRITE_SYMBOL", "ZONE_SYMBOL", 
			"DESCRIPTOR_SYMBOL", "INTERLEAVE_SYMBOL", "NULL_FILTERED_SYMBOL", "PARENT_SYMBOL", 
			"COLLATE_SYMBOL", "ASTERISK_SYMBOL", "COMMA_SYMBOL", "DOT_SYMBOL", "EQUAL_SYMBOL", 
			"LC_BRACKET_SYMBOL", "RC_BRACKET_SYMBOL", "LT_BRACKET_SYMBOL", "GT_BRACKET_SYMBOL", 
			"LR_BRACKET_SYMBOL", "RR_BRACKET_SYMBOL", "LS_BRACKET_SYMBOL", "RS_BRACKET_SYMBOL", 
			"SEMI_SYMBOL", "SINGLE_QUOTE_SYMBOL", "SINGLE_QUOTE_3_SYMBOL", "DOUBLE_QUOTE_SYMBOL", 
			"DOUBLE_QUOTE_3_SYMBOL", "BACKQUOTE_SYMBOL", "DASH_SYMBOL", "QUESTION_SYMBOL", 
			"AT_SYMBOL", "ATAT_SYMBOL", "QUOTED_ID", "ID", "INT", "FLOAT", "STRING_LITERAL", 
			"BYTES_LITERAL", "UNCLOSED_STRING_LITERAL", "UNCLOSED_TRIPLE_QUOTED_STRING_LITERAL", 
			"UNCLOSED_RAW_STRING_LITERAL", "UNCLOSED_TRIPLE_QUOTED_RAW_STRING_LITERAL", 
			"UNCLOSED_BYTES_LITERAL", "UNCLOSED_TRIPLE_QUOTED_BYTES_LITERAL", "UNCLOSED_RAW_BYTES_LITERAL", 
			"UNCLOSED_TRIPLE_QUOTED_RAW_BYTES_LITERAL", "INTEGER_LITERAL", "IDENTIFIER", 
			"UNCLOSED_ESCAPED_IDENTIFIER", "FUNCTION_RETURN", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GoogleSQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GoogleSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GoogleSQLParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			stmts();
			setState(217);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI_SYMBOL() { return getTokens(GoogleSQLParser.SEMI_SYMBOL); }
		public TerminalNode SEMI_SYMBOL(int i) {
			return getToken(GoogleSQLParser.SEMI_SYMBOL, i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			stmt();
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					match(SEMI_SYMBOL);
					setState(221);
					stmt();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_SYMBOL) {
				{
				setState(227);
				match(SEMI_SYMBOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Query_statementContext query_statement() {
			return getRuleContext(Query_statementContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			query_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_statementContext extends ParserRuleContext {
		public Query_exprContext query_expr() {
			return getRuleContext(Query_exprContext.class,0);
		}
		public Query_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_statement; }
	}

	public final Query_statementContext query_statement() throws RecognitionException {
		Query_statementContext _localctx = new Query_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_query_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			query_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_exprContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public List<Query_exprContext> query_expr() {
			return getRuleContexts(Query_exprContext.class);
		}
		public Query_exprContext query_expr(int i) {
			return getRuleContext(Query_exprContext.class,i);
		}
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public With_statementContext with_statement() {
			return getRuleContext(With_statementContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Set_operatorContext set_operator() {
			return getRuleContext(Set_operatorContext.class,0);
		}
		public Query_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expr; }
	}

	public final Query_exprContext query_expr() throws RecognitionException {
		return query_expr(0);
	}

	private Query_exprContext query_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Query_exprContext _localctx = new Query_exprContext(_ctx, _parentState);
		Query_exprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_query_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_SYMBOL) {
				{
				setState(235);
				with_statement();
				}
			}

			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_SYMBOL:
				{
				setState(238);
				select();
				}
				break;
			case LR_BRACKET_SYMBOL:
				{
				setState(239);
				match(LR_BRACKET_SYMBOL);
				setState(240);
				query_expr(0);
				setState(241);
				match(RR_BRACKET_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(245);
				order_by_clause();
				}
				break;
			}
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(248);
				limit_clause();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Query_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_query_expr);
					setState(251);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(252);
					set_operator();
					setState(253);
					query_expr(0);
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(254);
						order_by_clause();
						}
						break;
					}
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(257);
						limit_clause();
						}
						break;
					}
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_primaryContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public Query_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_primary; }
	}

	public final Query_primaryContext query_primary() throws RecognitionException {
		Query_primaryContext _localctx = new Query_primaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_query_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode LIMIT_SYMBOL() { return getToken(GoogleSQLParser.LIMIT_SYMBOL, 0); }
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public TerminalNode OFFSET_SYMBOL() { return getToken(GoogleSQLParser.OFFSET_SYMBOL, 0); }
		public Skip_rowsContext skip_rows() {
			return getRuleContext(Skip_rowsContext.class,0);
		}
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LIMIT_SYMBOL);
			setState(268);
			count();
			{
			setState(269);
			match(OFFSET_SYMBOL);
			setState(270);
			skip_rows();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER_SYMBOL() { return getToken(GoogleSQLParser.ORDER_SYMBOL, 0); }
		public TerminalNode BY_SYMBOL() { return getToken(GoogleSQLParser.BY_SYMBOL, 0); }
		public Order_by_expr_listContext order_by_expr_list() {
			return getRuleContext(Order_by_expr_listContext.class,0);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_order_by_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(ORDER_SYMBOL);
			setState(273);
			match(BY_SYMBOL);
			setState(274);
			order_by_expr_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_expr_listContext extends ParserRuleContext {
		public List<Order_by_expr_list_itemContext> order_by_expr_list_item() {
			return getRuleContexts(Order_by_expr_list_itemContext.class);
		}
		public Order_by_expr_list_itemContext order_by_expr_list_item(int i) {
			return getRuleContext(Order_by_expr_list_itemContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(GoogleSQLParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(GoogleSQLParser.COMMA_SYMBOL, i);
		}
		public Order_by_expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr_list; }
	}

	public final Order_by_expr_listContext order_by_expr_list() throws RecognitionException {
		Order_by_expr_listContext _localctx = new Order_by_expr_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_order_by_expr_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			order_by_expr_list_item();
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					match(COMMA_SYMBOL);
					setState(278);
					order_by_expr_list_item();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_expr_list_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC_SYMBOL() { return getToken(GoogleSQLParser.ASC_SYMBOL, 0); }
		public TerminalNode DESC_SYMBOL() { return getToken(GoogleSQLParser.DESC_SYMBOL, 0); }
		public Order_by_expr_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr_list_item; }
	}

	public final Order_by_expr_list_itemContext order_by_expr_list_item() throws RecognitionException {
		Order_by_expr_list_itemContext _localctx = new Order_by_expr_list_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_order_by_expr_list_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			expression();
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(285);
				_la = _input.LA(1);
				if ( !(_la==ASC_SYMBOL || _la==DESC_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_operatorContext extends ParserRuleContext {
		public TerminalNode UNION_SYMBOL() { return getToken(GoogleSQLParser.UNION_SYMBOL, 0); }
		public TerminalNode ALL_SYMBOL() { return getToken(GoogleSQLParser.ALL_SYMBOL, 0); }
		public TerminalNode DISTINCT_SYMBOL() { return getToken(GoogleSQLParser.DISTINCT_SYMBOL, 0); }
		public TerminalNode INTERSECT_SYMBOL() { return getToken(GoogleSQLParser.INTERSECT_SYMBOL, 0); }
		public TerminalNode EXCEPT_SYMBOL() { return getToken(GoogleSQLParser.EXCEPT_SYMBOL, 0); }
		public Set_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_operator; }
	}

	public final Set_operatorContext set_operator() throws RecognitionException {
		Set_operatorContext _localctx = new Set_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_set_operator);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(UNION_SYMBOL);
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==ALL_SYMBOL || _la==DISTINCT_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case INTERSECT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(INTERSECT_SYMBOL);
				setState(291);
				match(DISTINCT_SYMBOL);
				}
				break;
			case EXCEPT_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(EXCEPT_SYMBOL);
				setState(293);
				match(DISTINCT_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT_SYMBOL() { return getToken(GoogleSQLParser.SELECT_SYMBOL, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public Differential_privacy_clauseContext differential_privacy_clause() {
			return getRuleContext(Differential_privacy_clauseContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(GoogleSQLParser.AS_SYMBOL, 0); }
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public TerminalNode ALL_SYMBOL() { return getToken(GoogleSQLParser.ALL_SYMBOL, 0); }
		public TerminalNode DISTINCT_SYMBOL() { return getToken(GoogleSQLParser.DISTINCT_SYMBOL, 0); }
		public TerminalNode STRUCT_SYMBOL() { return getToken(GoogleSQLParser.STRUCT_SYMBOL, 0); }
		public TerminalNode VALUE_SYMBOL() { return getToken(GoogleSQLParser.VALUE_SYMBOL, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(SELECT_SYMBOL);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_SYMBOL) {
				{
				setState(297);
				differential_privacy_clause();
				}
			}

			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL_SYMBOL || _la==DISTINCT_SYMBOL) {
				{
				setState(300);
				_la = _input.LA(1);
				if ( !(_la==ALL_SYMBOL || _la==DISTINCT_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_SYMBOL) {
				{
				setState(303);
				match(AS_SYMBOL);
				setState(304);
				_la = _input.LA(1);
				if ( !(_la==STRUCT_SYMBOL || _la==VALUE_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(307);
			select_list();
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(308);
				from_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM_SYMBOL() { return getToken(GoogleSQLParser.FROM_SYMBOL, 0); }
		public From_itemContext from_item() {
			return getRuleContext(From_itemContext.class,0);
		}
		public Pivot_operatorContext pivot_operator() {
			return getRuleContext(Pivot_operatorContext.class,0);
		}
		public Unpivot_operatorContext unpivot_operator() {
			return getRuleContext(Unpivot_operatorContext.class,0);
		}
		public Tablesample_operatorContext tablesample_operator() {
			return getRuleContext(Tablesample_operatorContext.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(FROM_SYMBOL);
			setState(312);
			from_item(0);
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(313);
				pivot_operator();
				}
				break;
			case 2:
				{
				setState(314);
				unpivot_operator();
				}
				break;
			}
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(317);
				tablesample_operator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tablesample_operatorContext extends ParserRuleContext {
		public Integer_typeContext percent;
		public TerminalNode TABLESAMPLE_SYMBOL() { return getToken(GoogleSQLParser.TABLESAMPLE_SYMBOL, 0); }
		public TerminalNode SYSTEM_SYMBOL() { return getToken(GoogleSQLParser.SYSTEM_SYMBOL, 0); }
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public TerminalNode PERCENT_SYMBOL() { return getToken(GoogleSQLParser.PERCENT_SYMBOL, 0); }
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Tablesample_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablesample_operator; }
	}

	public final Tablesample_operatorContext tablesample_operator() throws RecognitionException {
		Tablesample_operatorContext _localctx = new Tablesample_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tablesample_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(TABLESAMPLE_SYMBOL);
			setState(321);
			match(SYSTEM_SYMBOL);
			setState(322);
			match(LR_BRACKET_SYMBOL);
			setState(323);
			((Tablesample_operatorContext)_localctx).percent = integer_type();
			setState(324);
			match(PERCENT_SYMBOL);
			setState(325);
			match(RR_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unpivot_operatorContext extends ParserRuleContext {
		public As_aliasContext unpivot_alias;
		public TerminalNode UNPIVOT_SYMBOL() { return getToken(GoogleSQLParser.UNPIVOT_SYMBOL, 0); }
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public Single_column_unpivotContext single_column_unpivot() {
			return getRuleContext(Single_column_unpivotContext.class,0);
		}
		public Multi_column_unpivotContext multi_column_unpivot() {
			return getRuleContext(Multi_column_unpivotContext.class,0);
		}
		public TerminalNode INCLUDE_SYMBOL() { return getToken(GoogleSQLParser.INCLUDE_SYMBOL, 0); }
		public TerminalNode NULLS_SYMBOL() { return getToken(GoogleSQLParser.NULLS_SYMBOL, 0); }
		public TerminalNode EXCLUDE_SYMBOL() { return getToken(GoogleSQLParser.EXCLUDE_SYMBOL, 0); }
		public As_aliasContext as_alias() {
			return getRuleContext(As_aliasContext.class,0);
		}
		public Unpivot_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivot_operator; }
	}

	public final Unpivot_operatorContext unpivot_operator() throws RecognitionException {
		Unpivot_operatorContext _localctx = new Unpivot_operatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unpivot_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(UNPIVOT_SYMBOL);
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCLUDE_SYMBOL:
				{
				setState(328);
				match(INCLUDE_SYMBOL);
				setState(329);
				match(NULLS_SYMBOL);
				}
				break;
			case EXCLUDE_SYMBOL:
				{
				setState(330);
				match(EXCLUDE_SYMBOL);
				setState(331);
				match(NULLS_SYMBOL);
				}
				break;
			case LR_BRACKET_SYMBOL:
				break;
			default:
				break;
			}
			setState(334);
			match(LR_BRACKET_SYMBOL);
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(335);
				single_column_unpivot();
				}
				break;
			case 2:
				{
				setState(336);
				multi_column_unpivot();
				}
				break;
			}
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(339);
				((Unpivot_operatorContext)_localctx).unpivot_alias = as_alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_column_unpivotContext extends ParserRuleContext {
		public Column_nameContext values_column;
		public Column_nameContext name_column;
		public TerminalNode FOR_SYMBOL() { return getToken(GoogleSQLParser.FOR_SYMBOL, 0); }
		public TerminalNode IN_SYMBOL() { return getToken(GoogleSQLParser.IN_SYMBOL, 0); }
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public Columns_to_unpivot_listContext columns_to_unpivot_list() {
			return getRuleContext(Columns_to_unpivot_listContext.class,0);
		}
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Single_column_unpivotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_column_unpivot; }
	}

	public final Single_column_unpivotContext single_column_unpivot() throws RecognitionException {
		Single_column_unpivotContext _localctx = new Single_column_unpivotContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_single_column_unpivot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			((Single_column_unpivotContext)_localctx).values_column = column_name();
			setState(343);
			match(FOR_SYMBOL);
			setState(344);
			((Single_column_unpivotContext)_localctx).name_column = column_name();
			setState(345);
			match(IN_SYMBOL);
			setState(346);
			match(LR_BRACKET_SYMBOL);
			setState(347);
			columns_to_unpivot_list();
			setState(348);
			match(RR_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multi_column_unpivotContext extends ParserRuleContext {
		public Column_nameContext name_column;
		public Values_column_setContext values_column_set() {
			return getRuleContext(Values_column_setContext.class,0);
		}
		public TerminalNode FOR_SYMBOL() { return getToken(GoogleSQLParser.FOR_SYMBOL, 0); }
		public TerminalNode IN_SYMBOL() { return getToken(GoogleSQLParser.IN_SYMBOL, 0); }
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public Column_sets_to_unpivotContext column_sets_to_unpivot() {
			return getRuleContext(Column_sets_to_unpivotContext.class,0);
		}
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Multi_column_unpivotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_column_unpivot; }
	}

	public final Multi_column_unpivotContext multi_column_unpivot() throws RecognitionException {
		Multi_column_unpivotContext _localctx = new Multi_column_unpivotContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multi_column_unpivot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			values_column_set();
			setState(351);
			match(FOR_SYMBOL);
			setState(352);
			((Multi_column_unpivotContext)_localctx).name_column = column_name();
			setState(353);
			match(IN_SYMBOL);
			setState(354);
			match(LR_BRACKET_SYMBOL);
			setState(355);
			column_sets_to_unpivot();
			setState(356);
			match(RR_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Values_column_setContext extends ParserRuleContext {
		public Column_nameContext values_column;
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(GoogleSQLParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(GoogleSQLParser.COMMA_SYMBOL, i);
		}
		public Values_column_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_column_set; }
	}

	public final Values_column_setContext values_column_set() throws RecognitionException {
		Values_column_setContext _localctx = new Values_column_setContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_values_column_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((Values_column_setContext)_localctx).values_column = column_name();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(359);
				match(COMMA_SYMBOL);
				setState(360);
				((Values_column_setContext)_localctx).values_column = column_name();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Columns_to_unpivot_listContext extends ParserRuleContext {
		public List<Columns_to_unpivot_itemContext> columns_to_unpivot_item() {
			return getRuleContexts(Columns_to_unpivot_itemContext.class);
		}
		public Columns_to_unpivot_itemContext columns_to_unpivot_item(int i) {
			return getRuleContext(Columns_to_unpivot_itemContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(GoogleSQLParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(GoogleSQLParser.COMMA_SYMBOL, i);
		}
		public Columns_to_unpivot_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns_to_unpivot_list; }
	}

	public final Columns_to_unpivot_listContext columns_to_unpivot_list() throws RecognitionException {
		Columns_to_unpivot_listContext _localctx = new Columns_to_unpivot_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_columns_to_unpivot_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			columns_to_unpivot_item();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(367);
				match(COMMA_SYMBOL);
				setState(368);
				columns_to_unpivot_item();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Columns_to_unpivot_itemContext extends ParserRuleContext {
		public Column_nameContext unpivot_column;
		public As_aliasContext row_value_alias;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public As_aliasContext as_alias() {
			return getRuleContext(As_aliasContext.class,0);
		}
		public Columns_to_unpivot_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns_to_unpivot_item; }
	}

	public final Columns_to_unpivot_itemContext columns_to_unpivot_item() throws RecognitionException {
		Columns_to_unpivot_itemContext _localctx = new Columns_to_unpivot_itemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columns_to_unpivot_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			((Columns_to_unpivot_itemContext)_localctx).unpivot_column = column_name();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_SYMBOL || _la==QUOTED_ID || _la==ID) {
				{
				setState(375);
				((Columns_to_unpivot_itemContext)_localctx).row_value_alias = as_alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_sets_to_unpivotContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public Columns_to_unpivot_listContext columns_to_unpivot_list() {
			return getRuleContext(Columns_to_unpivot_listContext.class,0);
		}
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public Column_sets_to_unpivotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_sets_to_unpivot; }
	}

	public final Column_sets_to_unpivotContext column_sets_to_unpivot() throws RecognitionException {
		Column_sets_to_unpivotContext _localctx = new Column_sets_to_unpivotContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_column_sets_to_unpivot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(LR_BRACKET_SYMBOL);
			setState(379);
			columns_to_unpivot_list();
			setState(380);
			match(RR_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pivot_operatorContext extends ParserRuleContext {
		public Column_nameContext input_column;
		public TerminalNode PIVOT_SYMBOL() { return getToken(GoogleSQLParser.PIVOT_SYMBOL, 0); }
		public List<TerminalNode> LR_BRACKET_SYMBOL() { return getTokens(GoogleSQLParser.LR_BRACKET_SYMBOL); }
		public TerminalNode LR_BRACKET_SYMBOL(int i) {
			return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, i);
		}
		public Aggregate_function_call_as_alias_listContext aggregate_function_call_as_alias_list() {
			return getRuleContext(Aggregate_function_call_as_alias_listContext.class,0);
		}
		public TerminalNode FOR_SYMBOL() { return getToken(GoogleSQLParser.FOR_SYMBOL, 0); }
		public TerminalNode IN_SYMBOL() { return getToken(GoogleSQLParser.IN_SYMBOL, 0); }
		public Pivot_column_as_alias_listContext pivot_column_as_alias_list() {
			return getRuleContext(Pivot_column_as_alias_listContext.class,0);
		}
		public List<TerminalNode> RR_BRACKET_SYMBOL() { return getTokens(GoogleSQLParser.RR_BRACKET_SYMBOL); }
		public TerminalNode RR_BRACKET_SYMBOL(int i) {
			return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, i);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public As_aliasContext as_alias() {
			return getRuleContext(As_aliasContext.class,0);
		}
		public Pivot_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivot_operator; }
	}

	public final Pivot_operatorContext pivot_operator() throws RecognitionException {
		Pivot_operatorContext _localctx = new Pivot_operatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pivot_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(PIVOT_SYMBOL);
			setState(383);
			match(LR_BRACKET_SYMBOL);
			setState(384);
			aggregate_function_call_as_alias_list();
			setState(385);
			match(FOR_SYMBOL);
			setState(386);
			((Pivot_operatorContext)_localctx).input_column = column_name();
			setState(387);
			match(IN_SYMBOL);
			setState(388);
			match(LR_BRACKET_SYMBOL);
			setState(389);
			pivot_column_as_alias_list();
			setState(390);
			match(RR_BRACKET_SYMBOL);
			setState(391);
			match(RR_BRACKET_SYMBOL);
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(392);
				as_alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pivot_column_as_alias_listContext extends ParserRuleContext {
		public List<Pivot_column_as_alias_list_itemContext> pivot_column_as_alias_list_item() {
			return getRuleContexts(Pivot_column_as_alias_list_itemContext.class);
		}
		public Pivot_column_as_alias_list_itemContext pivot_column_as_alias_list_item(int i) {
			return getRuleContext(Pivot_column_as_alias_list_itemContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(GoogleSQLParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(GoogleSQLParser.COMMA_SYMBOL, i);
		}
		public Pivot_column_as_alias_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivot_column_as_alias_list; }
	}

	public final Pivot_column_as_alias_listContext pivot_column_as_alias_list() throws RecognitionException {
		Pivot_column_as_alias_listContext _localctx = new Pivot_column_as_alias_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pivot_column_as_alias_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			pivot_column_as_alias_list_item();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(396);
				match(COMMA_SYMBOL);
				setState(397);
				pivot_column_as_alias_list_item();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pivot_column_as_alias_list_itemContext extends ParserRuleContext {
		public Column_nameContext pivot_column;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public As_aliasContext as_alias() {
			return getRuleContext(As_aliasContext.class,0);
		}
		public Pivot_column_as_alias_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivot_column_as_alias_list_item; }
	}

	public final Pivot_column_as_alias_list_itemContext pivot_column_as_alias_list_item() throws RecognitionException {
		Pivot_column_as_alias_list_itemContext _localctx = new Pivot_column_as_alias_list_itemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pivot_column_as_alias_list_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			((Pivot_column_as_alias_list_itemContext)_localctx).pivot_column = column_name();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_SYMBOL || _la==QUOTED_ID || _la==ID) {
				{
				setState(404);
				as_alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregate_function_call_as_alias_listContext extends ParserRuleContext {
		public List<Aggregate_function_call_as_alias_list_itemContext> aggregate_function_call_as_alias_list_item() {
			return getRuleContexts(Aggregate_function_call_as_alias_list_itemContext.class);
		}
		public Aggregate_function_call_as_alias_list_itemContext aggregate_function_call_as_alias_list_item(int i) {
			return getRuleContext(Aggregate_function_call_as_alias_list_itemContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(GoogleSQLParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(GoogleSQLParser.COMMA_SYMBOL, i);
		}
		public Aggregate_function_call_as_alias_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function_call_as_alias_list; }
	}

	public final Aggregate_function_call_as_alias_listContext aggregate_function_call_as_alias_list() throws RecognitionException {
		Aggregate_function_call_as_alias_listContext _localctx = new Aggregate_function_call_as_alias_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_aggregate_function_call_as_alias_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			aggregate_function_call_as_alias_list_item();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(408);
				match(COMMA_SYMBOL);
				setState(409);
				aggregate_function_call_as_alias_list_item();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregate_function_call_as_alias_list_itemContext extends ParserRuleContext {
		public As_aliasContext as_alias() {
			return getRuleContext(As_aliasContext.class,0);
		}
		public Aggregate_function_call_as_alias_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function_call_as_alias_list_item; }
	}

	public final Aggregate_function_call_as_alias_list_itemContext aggregate_function_call_as_alias_list_item() throws RecognitionException {
		Aggregate_function_call_as_alias_list_itemContext _localctx = new Aggregate_function_call_as_alias_list_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_aggregate_function_call_as_alias_list_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_SYMBOL || _la==QUOTED_ID || _la==ID) {
				{
				setState(415);
				as_alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_itemContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public As_aliasContext as_alias() {
			return getRuleContext(As_aliasContext.class,0);
		}
		public TerminalNode FOR_SYMBOL() { return getToken(GoogleSQLParser.FOR_SYMBOL, 0); }
		public TerminalNode SYSTEM_TIME_SYMBOL() { return getToken(GoogleSQLParser.SYSTEM_TIME_SYMBOL, 0); }
		public TerminalNode AS_SYMBOL() { return getToken(GoogleSQLParser.AS_SYMBOL, 0); }
		public TerminalNode OF_SYMBOL() { return getToken(GoogleSQLParser.OF_SYMBOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public List<From_itemContext> from_item() {
			return getRuleContexts(From_itemContext.class);
		}
		public From_itemContext from_item(int i) {
			return getRuleContext(From_itemContext.class,i);
		}
		public Cross_join_operatorContext cross_join_operator() {
			return getRuleContext(Cross_join_operatorContext.class,0);
		}
		public Conditional_join_operatorContext conditional_join_operator() {
			return getRuleContext(Conditional_join_operatorContext.class,0);
		}
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public Query_exprContext query_expr() {
			return getRuleContext(Query_exprContext.class,0);
		}
		public Unnest_operatorContext unnest_operator() {
			return getRuleContext(Unnest_operatorContext.class,0);
		}
		public Cte_nameContext cte_name() {
			return getRuleContext(Cte_nameContext.class,0);
		}
		public From_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_item; }
	}

	public final From_itemContext from_item() throws RecognitionException {
		return from_item(0);
	}

	private From_itemContext from_item(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		From_itemContext _localctx = new From_itemContext(_ctx, _parentState);
		From_itemContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_from_item, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(419);
				table_name();
				setState(421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(420);
					as_alias();
					}
					break;
				}
				setState(428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(423);
					match(FOR_SYMBOL);
					setState(424);
					match(SYSTEM_TIME_SYMBOL);
					setState(425);
					match(AS_SYMBOL);
					setState(426);
					match(OF_SYMBOL);
					setState(427);
					expression();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(430);
				match(LR_BRACKET_SYMBOL);
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(431);
					from_item(0);
					setState(432);
					cross_join_operator();
					setState(433);
					from_item(0);
					}
					break;
				case 2:
					{
					setState(435);
					from_item(0);
					setState(436);
					conditional_join_operator();
					setState(437);
					from_item(0);
					setState(438);
					join_condition();
					}
					break;
				}
				setState(442);
				match(RR_BRACKET_SYMBOL);
				}
				break;
			case 3:
				{
				setState(444);
				match(LR_BRACKET_SYMBOL);
				setState(445);
				query_expr(0);
				setState(446);
				match(RR_BRACKET_SYMBOL);
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(447);
					as_alias();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(450);
				unnest_operator();
				}
				break;
			case 5:
				{
				setState(451);
				cte_name();
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(452);
					as_alias();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(466);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new From_itemContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_from_item);
						setState(457);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(458);
						cross_join_operator();
						setState(459);
						from_item(7);
						}
						break;
					case 2:
						{
						_localctx = new From_itemContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_from_item);
						setState(461);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(462);
						conditional_join_operator();
						setState(463);
						from_item(0);
						setState(464);
						join_condition();
						}
						break;
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unnest_operatorContext extends ParserRuleContext {
		public TerminalNode UNNEST_SYMBOL() { return getToken(GoogleSQLParser.UNNEST_SYMBOL, 0); }
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public List<As_aliasContext> as_alias() {
			return getRuleContexts(As_aliasContext.class);
		}
		public As_aliasContext as_alias(int i) {
			return getRuleContext(As_aliasContext.class,i);
		}
		public TerminalNode WITH_SYMBOL() { return getToken(GoogleSQLParser.WITH_SYMBOL, 0); }
		public TerminalNode OFFSET_SYMBOL() { return getToken(GoogleSQLParser.OFFSET_SYMBOL, 0); }
		public Unnest_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnest_operator; }
	}

	public final Unnest_operatorContext unnest_operator() throws RecognitionException {
		Unnest_operatorContext _localctx = new Unnest_operatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unnest_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNNEST_SYMBOL:
				{
				setState(471);
				match(UNNEST_SYMBOL);
				setState(472);
				match(LR_BRACKET_SYMBOL);
				setState(473);
				match(RR_BRACKET_SYMBOL);
				setState(475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(474);
					as_alias();
					}
					break;
				}
				}
				break;
			case AS_SYMBOL:
			case QUOTED_ID:
			case ID:
				{
				setState(477);
				as_alias();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(480);
				match(WITH_SYMBOL);
				setState(481);
				match(OFFSET_SYMBOL);
				setState(483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(482);
					as_alias();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cross_join_operatorContext extends ParserRuleContext {
		public TerminalNode CROSS_SYMBOL() { return getToken(GoogleSQLParser.CROSS_SYMBOL, 0); }
		public TerminalNode JOIN_SYMBOL() { return getToken(GoogleSQLParser.JOIN_SYMBOL, 0); }
		public TerminalNode COMMA_SYMBOL() { return getToken(GoogleSQLParser.COMMA_SYMBOL, 0); }
		public Cross_join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cross_join_operator; }
	}

	public final Cross_join_operatorContext cross_join_operator() throws RecognitionException {
		Cross_join_operatorContext _localctx = new Cross_join_operatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cross_join_operator);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CROSS_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(487);
				match(CROSS_SYMBOL);
				setState(488);
				match(JOIN_SYMBOL);
				}
				}
				break;
			case COMMA_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				match(COMMA_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_join_operatorContext extends ParserRuleContext {
		public TerminalNode JOIN_SYMBOL() { return getToken(GoogleSQLParser.JOIN_SYMBOL, 0); }
		public TerminalNode INNER_SYMBOL() { return getToken(GoogleSQLParser.INNER_SYMBOL, 0); }
		public TerminalNode FULL_SYMBOL() { return getToken(GoogleSQLParser.FULL_SYMBOL, 0); }
		public TerminalNode OUTER_SYMBOL() { return getToken(GoogleSQLParser.OUTER_SYMBOL, 0); }
		public TerminalNode LEFT_SYMBOL() { return getToken(GoogleSQLParser.LEFT_SYMBOL, 0); }
		public TerminalNode RIGHT_SYMBOL() { return getToken(GoogleSQLParser.RIGHT_SYMBOL, 0); }
		public Conditional_join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_join_operator; }
	}

	public final Conditional_join_operatorContext conditional_join_operator() throws RecognitionException {
		Conditional_join_operatorContext _localctx = new Conditional_join_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_conditional_join_operator);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN_SYMBOL:
			case INNER_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER_SYMBOL) {
					{
					setState(492);
					match(INNER_SYMBOL);
					}
				}

				setState(495);
				match(JOIN_SYMBOL);
				}
				break;
			case FULL_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(FULL_SYMBOL);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER_SYMBOL) {
					{
					setState(497);
					match(OUTER_SYMBOL);
					}
				}

				setState(500);
				match(JOIN_SYMBOL);
				}
				break;
			case LEFT_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				match(LEFT_SYMBOL);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER_SYMBOL) {
					{
					setState(502);
					match(OUTER_SYMBOL);
					}
				}

				setState(505);
				match(JOIN_SYMBOL);
				}
				break;
			case RIGHT_SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(506);
				match(RIGHT_SYMBOL);
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER_SYMBOL) {
					{
					setState(507);
					match(OUTER_SYMBOL);
					}
				}

				setState(510);
				match(JOIN_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_conditionContext extends ParserRuleContext {
		public On_clauseContext on_clause() {
			return getRuleContext(On_clauseContext.class,0);
		}
		public Using_clauseContext using_clause() {
			return getRuleContext(Using_clauseContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_join_condition);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				on_clause();
				}
				break;
			case USING_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				using_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class On_clauseContext extends ParserRuleContext {
		public TerminalNode ON_SYMBOL() { return getToken(GoogleSQLParser.ON_SYMBOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public On_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_clause; }
	}

	public final On_clauseContext on_clause() throws RecognitionException {
		On_clauseContext _localctx = new On_clauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_on_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(ON_SYMBOL);
			setState(518);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Using_clauseContext extends ParserRuleContext {
		public TerminalNode USING_SYMBOL() { return getToken(GoogleSQLParser.USING_SYMBOL, 0); }
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_clause; }
	}

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_using_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(USING_SYMBOL);
			setState(521);
			match(LR_BRACKET_SYMBOL);
			setState(522);
			column_name_list();
			setState(523);
			match(RR_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(GoogleSQLParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(GoogleSQLParser.COMMA_SYMBOL, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			select_list_item();
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(526);
					match(COMMA_SYMBOL);
					setState(527);
					select_list_item();
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_list_itemContext extends ParserRuleContext {
		public Select_allContext select_all() {
			return getRuleContext(Select_allContext.class,0);
		}
		public Select_expressionContext select_expression() {
			return getRuleContext(Select_expressionContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_select_list_item);
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				select_all();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				select_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public As_aliasContext as_alias() {
			return getRuleContext(As_aliasContext.class,0);
		}
		public Select_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expression; }
	}

	public final Select_expressionContext select_expression() throws RecognitionException {
		Select_expressionContext _localctx = new Select_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_select_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			expression();
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(538);
				as_alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_allContext extends ParserRuleContext {
		public TerminalNode ASTERISK_SYMBOL() { return getToken(GoogleSQLParser.ASTERISK_SYMBOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT_SYMBOL() { return getToken(GoogleSQLParser.DOT_SYMBOL, 0); }
		public Select_all_except_clauseContext select_all_except_clause() {
			return getRuleContext(Select_all_except_clauseContext.class,0);
		}
		public Select_all_replace_clauseContext select_all_replace_clause() {
			return getRuleContext(Select_all_replace_clauseContext.class,0);
		}
		public Select_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_all; }
	}

	public final Select_allContext select_all() throws RecognitionException {
		Select_allContext _localctx = new Select_allContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_select_all);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -217298681987071998L) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & 67341825L) != 0)) {
				{
				setState(541);
				expression();
				setState(542);
				match(DOT_SYMBOL);
				}
			}

			setState(546);
			match(ASTERISK_SYMBOL);
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(547);
				select_all_except_clause();
				}
				break;
			}
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(550);
				select_all_replace_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_all_except_clauseContext extends ParserRuleContext {
		public TerminalNode EXCEPT_SYMBOL() { return getToken(GoogleSQLParser.EXCEPT_SYMBOL, 0); }
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public Select_all_except_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_all_except_clause; }
	}

	public final Select_all_except_clauseContext select_all_except_clause() throws RecognitionException {
		Select_all_except_clauseContext _localctx = new Select_all_except_clauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_select_all_except_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(EXCEPT_SYMBOL);
			setState(554);
			match(LR_BRACKET_SYMBOL);
			setState(555);
			column_name_list();
			setState(556);
			match(RR_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_all_replace_clauseContext extends ParserRuleContext {
		public TerminalNode REPLACE_SYMBOL() { return getToken(GoogleSQLParser.REPLACE_SYMBOL, 0); }
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public Expr_as_alias_listContext expr_as_alias_list() {
			return getRuleContext(Expr_as_alias_listContext.class,0);
		}
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public Select_all_replace_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_all_replace_clause; }
	}

	public final Select_all_replace_clauseContext select_all_replace_clause() throws RecognitionException {
		Select_all_replace_clauseContext _localctx = new Select_all_replace_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_select_all_replace_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(REPLACE_SYMBOL);
			setState(559);
			match(LR_BRACKET_SYMBOL);
			setState(560);
			expr_as_alias_list();
			setState(561);
			match(RR_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_name_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(GoogleSQLParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(GoogleSQLParser.COMMA_SYMBOL, i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			column_name();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(564);
				match(COMMA_SYMBOL);
				setState(565);
				column_name();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_as_alias_listContext extends ParserRuleContext {
		public List<Expr_as_alias_itemContext> expr_as_alias_item() {
			return getRuleContexts(Expr_as_alias_itemContext.class);
		}
		public Expr_as_alias_itemContext expr_as_alias_item(int i) {
			return getRuleContext(Expr_as_alias_itemContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(GoogleSQLParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(GoogleSQLParser.COMMA_SYMBOL, i);
		}
		public Expr_as_alias_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_as_alias_list; }
	}

	public final Expr_as_alias_listContext expr_as_alias_list() throws RecognitionException {
		Expr_as_alias_listContext _localctx = new Expr_as_alias_listContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expr_as_alias_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			expr_as_alias_item();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(572);
				match(COMMA_SYMBOL);
				setState(573);
				expr_as_alias_item();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_as_alias_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(GoogleSQLParser.AS_SYMBOL, 0); }
		public Expr_as_alias_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_as_alias_item; }
	}

	public final Expr_as_alias_itemContext expr_as_alias_item() throws RecognitionException {
		Expr_as_alias_itemContext _localctx = new Expr_as_alias_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expr_as_alias_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			expression();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_SYMBOL) {
				{
				setState(580);
				match(AS_SYMBOL);
				}
			}

			setState(583);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class As_aliasContext extends ParserRuleContext {
		public Alias_nameContext alias_name() {
			return getRuleContext(Alias_nameContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(GoogleSQLParser.AS_SYMBOL, 0); }
		public As_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_alias; }
	}

	public final As_aliasContext as_alias() throws RecognitionException {
		As_aliasContext _localctx = new As_aliasContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_as_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_SYMBOL) {
				{
				setState(585);
				match(AS_SYMBOL);
				}
			}

			setState(588);
			alias_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Differential_privacy_clauseContext extends ParserRuleContext {
		public TerminalNode WITH_SYMBOL() { return getToken(GoogleSQLParser.WITH_SYMBOL, 0); }
		public TerminalNode DIFFERENTIAL_PRIVACY_SYMBOL() { return getToken(GoogleSQLParser.DIFFERENTIAL_PRIVACY_SYMBOL, 0); }
		public TerminalNode OPTIONS_SYMBOL() { return getToken(GoogleSQLParser.OPTIONS_SYMBOL, 0); }
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public Privacy_parametersContext privacy_parameters() {
			return getRuleContext(Privacy_parametersContext.class,0);
		}
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public Differential_privacy_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differential_privacy_clause; }
	}

	public final Differential_privacy_clauseContext differential_privacy_clause() throws RecognitionException {
		Differential_privacy_clauseContext _localctx = new Differential_privacy_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_differential_privacy_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(WITH_SYMBOL);
			setState(591);
			match(DIFFERENTIAL_PRIVACY_SYMBOL);
			setState(592);
			match(OPTIONS_SYMBOL);
			setState(593);
			match(LR_BRACKET_SYMBOL);
			setState(594);
			privacy_parameters();
			setState(595);
			match(RR_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Privacy_parametersContext extends ParserRuleContext {
		public TerminalNode EPSILON_SYMBOL() { return getToken(GoogleSQLParser.EPSILON_SYMBOL, 0); }
		public List<TerminalNode> EQUAL_SYMBOL() { return getTokens(GoogleSQLParser.EQUAL_SYMBOL); }
		public TerminalNode EQUAL_SYMBOL(int i) {
			return getToken(GoogleSQLParser.EQUAL_SYMBOL, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(GoogleSQLParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(GoogleSQLParser.COMMA_SYMBOL, i);
		}
		public TerminalNode DELTA_SYMBOL() { return getToken(GoogleSQLParser.DELTA_SYMBOL, 0); }
		public TerminalNode PRIVACY_UNIT_COLUMN_SYMBOL() { return getToken(GoogleSQLParser.PRIVACY_UNIT_COLUMN_SYMBOL, 0); }
		public TerminalNode MAX_GROUPS_CONTRIBUTED_SYMBOL() { return getToken(GoogleSQLParser.MAX_GROUPS_CONTRIBUTED_SYMBOL, 0); }
		public Privacy_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privacy_parameters; }
	}

	public final Privacy_parametersContext privacy_parameters() throws RecognitionException {
		Privacy_parametersContext _localctx = new Privacy_parametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_privacy_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(EPSILON_SYMBOL);
			setState(598);
			match(EQUAL_SYMBOL);
			setState(599);
			expression();
			setState(600);
			match(COMMA_SYMBOL);
			setState(601);
			match(DELTA_SYMBOL);
			setState(602);
			match(EQUAL_SYMBOL);
			setState(603);
			expression();
			setState(604);
			match(COMMA_SYMBOL);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAX_GROUPS_CONTRIBUTED_SYMBOL) {
				{
				setState(605);
				match(MAX_GROUPS_CONTRIBUTED_SYMBOL);
				setState(606);
				match(EQUAL_SYMBOL);
				setState(607);
				expression();
				setState(608);
				match(COMMA_SYMBOL);
				}
			}

			setState(612);
			match(PRIVACY_UNIT_COLUMN_SYMBOL);
			setState(613);
			match(EQUAL_SYMBOL);
			setState(614);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_statementContext extends ParserRuleContext {
		public TerminalNode WITH_SYMBOL() { return getToken(GoogleSQLParser.WITH_SYMBOL, 0); }
		public List<CteContext> cte() {
			return getRuleContexts(CteContext.class);
		}
		public CteContext cte(int i) {
			return getRuleContext(CteContext.class,i);
		}
		public TerminalNode RECURSIVE_SYMBOL() { return getToken(GoogleSQLParser.RECURSIVE_SYMBOL, 0); }
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(GoogleSQLParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(GoogleSQLParser.COMMA_SYMBOL, i);
		}
		public With_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_statement; }
	}

	public final With_statementContext with_statement() throws RecognitionException {
		With_statementContext _localctx = new With_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_with_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(WITH_SYMBOL);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE_SYMBOL) {
				{
				setState(617);
				match(RECURSIVE_SYMBOL);
				}
			}

			setState(620);
			cte();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(621);
				match(COMMA_SYMBOL);
				setState(622);
				cte();
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CteContext extends ParserRuleContext {
		public Non_recursive_cteContext non_recursive_cte() {
			return getRuleContext(Non_recursive_cteContext.class,0);
		}
		public Recursive_cteContext recursive_cte() {
			return getRuleContext(Recursive_cteContext.class,0);
		}
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_cte);
		try {
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				non_recursive_cte();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				recursive_cte();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Non_recursive_cteContext extends ParserRuleContext {
		public Cte_nameContext cte_name() {
			return getRuleContext(Cte_nameContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(GoogleSQLParser.AS_SYMBOL, 0); }
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public Query_exprContext query_expr() {
			return getRuleContext(Query_exprContext.class,0);
		}
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public Non_recursive_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_recursive_cte; }
	}

	public final Non_recursive_cteContext non_recursive_cte() throws RecognitionException {
		Non_recursive_cteContext _localctx = new Non_recursive_cteContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_non_recursive_cte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			cte_name();
			setState(633);
			match(AS_SYMBOL);
			setState(634);
			match(LR_BRACKET_SYMBOL);
			setState(635);
			query_expr(0);
			setState(636);
			match(RR_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Recursive_cteContext extends ParserRuleContext {
		public Cte_nameContext cte_name() {
			return getRuleContext(Cte_nameContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(GoogleSQLParser.AS_SYMBOL, 0); }
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public Recursive_union_operationContext recursive_union_operation() {
			return getRuleContext(Recursive_union_operationContext.class,0);
		}
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public Recursive_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_cte; }
	}

	public final Recursive_cteContext recursive_cte() throws RecognitionException {
		Recursive_cteContext _localctx = new Recursive_cteContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_recursive_cte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			cte_name();
			setState(639);
			match(AS_SYMBOL);
			setState(640);
			match(LR_BRACKET_SYMBOL);
			setState(641);
			recursive_union_operation();
			setState(642);
			match(RR_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Recursive_union_operationContext extends ParserRuleContext {
		public Base_termContext base_term() {
			return getRuleContext(Base_termContext.class,0);
		}
		public Union_operatorContext union_operator() {
			return getRuleContext(Union_operatorContext.class,0);
		}
		public Recursive_termContext recursive_term() {
			return getRuleContext(Recursive_termContext.class,0);
		}
		public Recursive_union_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_union_operation; }
	}

	public final Recursive_union_operationContext recursive_union_operation() throws RecognitionException {
		Recursive_union_operationContext _localctx = new Recursive_union_operationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_recursive_union_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			base_term();
			setState(645);
			union_operator();
			setState(646);
			recursive_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Base_termContext extends ParserRuleContext {
		public Query_exprContext query_expr() {
			return getRuleContext(Query_exprContext.class,0);
		}
		public Base_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_term; }
	}

	public final Base_termContext base_term() throws RecognitionException {
		Base_termContext _localctx = new Base_termContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_base_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			query_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_operatorContext extends ParserRuleContext {
		public TerminalNode UNION_SYMBOL() { return getToken(GoogleSQLParser.UNION_SYMBOL, 0); }
		public TerminalNode ALL_SYMBOL() { return getToken(GoogleSQLParser.ALL_SYMBOL, 0); }
		public Union_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_operator; }
	}

	public final Union_operatorContext union_operator() throws RecognitionException {
		Union_operatorContext _localctx = new Union_operatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_union_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(UNION_SYMBOL);
			setState(651);
			match(ALL_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Recursive_termContext extends ParserRuleContext {
		public Query_exprContext query_expr() {
			return getRuleContext(Query_exprContext.class,0);
		}
		public Recursive_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_term; }
	}

	public final Recursive_termContext recursive_term() throws RecognitionException {
		Recursive_termContext _localctx = new Recursive_termContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_recursive_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			query_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression_higher_prec_than_andContext expression_higher_prec_than_and() {
			return getRuleContext(Expression_higher_prec_than_andContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			expression_higher_prec_than_and();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_higher_prec_than_andContext extends ParserRuleContext {
		public Unparenthesized_expression_higher_prec_than_andContext unparenthesized_expression_higher_prec_than_and() {
			return getRuleContext(Unparenthesized_expression_higher_prec_than_andContext.class,0);
		}
		public Expression_higher_prec_than_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_higher_prec_than_and; }
	}

	public final Expression_higher_prec_than_andContext expression_higher_prec_than_and() throws RecognitionException {
		Expression_higher_prec_than_andContext _localctx = new Expression_higher_prec_than_andContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expression_higher_prec_than_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			unparenthesized_expression_higher_prec_than_and();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unparenthesized_expression_higher_prec_than_andContext extends ParserRuleContext {
		public TerminalNode NULL_SYMBOL() { return getToken(GoogleSQLParser.NULL_SYMBOL, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Bytes_literalContext bytes_literal() {
			return getRuleContext(Bytes_literalContext.class,0);
		}
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Bignumeric_literalContext bignumeric_literal() {
			return getRuleContext(Bignumeric_literalContext.class,0);
		}
		public Json_literalContext json_literal() {
			return getRuleContext(Json_literalContext.class,0);
		}
		public Floating_point_literalContext floating_point_literal() {
			return getRuleContext(Floating_point_literalContext.class,0);
		}
		public Date_or_time_literalContext date_or_time_literal() {
			return getRuleContext(Date_or_time_literalContext.class,0);
		}
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public Parameter_expressionContext parameter_expression() {
			return getRuleContext(Parameter_expressionContext.class,0);
		}
		public System_variable_expressionContext system_variable_expression() {
			return getRuleContext(System_variable_expressionContext.class,0);
		}
		public Array_constructorContext array_constructor() {
			return getRuleContext(Array_constructorContext.class,0);
		}
		public Unparenthesized_expression_higher_prec_than_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unparenthesized_expression_higher_prec_than_and; }
	}

	public final Unparenthesized_expression_higher_prec_than_andContext unparenthesized_expression_higher_prec_than_and() throws RecognitionException {
		Unparenthesized_expression_higher_prec_than_andContext _localctx = new Unparenthesized_expression_higher_prec_than_andContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unparenthesized_expression_higher_prec_than_and);
		try {
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(NULL_SYMBOL);
				}
				break;
			case TRUE_SYMBOL:
			case FALSE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				boolean_literal();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				string_literal(0);
				}
				break;
			case BYTES_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				bytes_literal(0);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(663);
				integer_literal();
				}
				break;
			case NUMERIC_SYMBOL:
			case DECIMAL_SYMBOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(664);
				numeric_literal();
				}
				break;
			case BIGNUMERIC_SYMBOL:
			case BIGDECIMAL_SYMBOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(665);
				bignumeric_literal();
				}
				break;
			case JSON_SYMBOL:
				enterOuterAlt(_localctx, 8);
				{
				setState(666);
				json_literal();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 9);
				{
				setState(667);
				floating_point_literal();
				}
				break;
			case DATE_SYMBOL:
			case TIME_SYMBOL:
			case DATETIME_SYMBOL:
			case TIMESTAMP_SYMBOL:
				enterOuterAlt(_localctx, 10);
				{
				setState(668);
				date_or_time_literal();
				}
				break;
			case RANGE_SYMBOL:
				enterOuterAlt(_localctx, 11);
				{
				setState(669);
				range_literal();
				}
				break;
			case QUESTION_SYMBOL:
			case AT_SYMBOL:
				enterOuterAlt(_localctx, 12);
				{
				setState(670);
				parameter_expression();
				}
				break;
			case ATAT_SYMBOL:
				enterOuterAlt(_localctx, 13);
				{
				setState(671);
				system_variable_expression();
				}
				break;
			case ARRAY_SYMBOL:
			case LS_BRACKET_SYMBOL:
				enterOuterAlt(_localctx, 14);
				{
				setState(672);
				array_constructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_constructorContext extends ParserRuleContext {
		public Array_constructor_prefix_no_expressionsContext array_constructor_prefix_no_expressions() {
			return getRuleContext(Array_constructor_prefix_no_expressionsContext.class,0);
		}
		public TerminalNode RS_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RS_BRACKET_SYMBOL, 0); }
		public Array_constructor_prefixContext array_constructor_prefix() {
			return getRuleContext(Array_constructor_prefixContext.class,0);
		}
		public Array_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_constructor; }
	}

	public final Array_constructorContext array_constructor() throws RecognitionException {
		Array_constructorContext _localctx = new Array_constructorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_array_constructor);
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				array_constructor_prefix_no_expressions();
				setState(676);
				match(RS_BRACKET_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				array_constructor_prefix(0);
				setState(679);
				match(RS_BRACKET_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_constructor_prefixContext extends ParserRuleContext {
		public Array_constructor_prefix_no_expressionsContext array_constructor_prefix_no_expressions() {
			return getRuleContext(Array_constructor_prefix_no_expressionsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_constructor_prefixContext array_constructor_prefix() {
			return getRuleContext(Array_constructor_prefixContext.class,0);
		}
		public TerminalNode COMMA_SYMBOL() { return getToken(GoogleSQLParser.COMMA_SYMBOL, 0); }
		public Array_constructor_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_constructor_prefix; }
	}

	public final Array_constructor_prefixContext array_constructor_prefix() throws RecognitionException {
		return array_constructor_prefix(0);
	}

	private Array_constructor_prefixContext array_constructor_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_constructor_prefixContext _localctx = new Array_constructor_prefixContext(_ctx, _parentState);
		Array_constructor_prefixContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_array_constructor_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(684);
			array_constructor_prefix_no_expressions();
			setState(685);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(692);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Array_constructor_prefixContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_array_constructor_prefix);
					setState(687);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(688);
					match(COMMA_SYMBOL);
					setState(689);
					expression();
					}
					} 
				}
				setState(694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_constructor_prefix_no_expressionsContext extends ParserRuleContext {
		public TerminalNode ARRAY_SYMBOL() { return getToken(GoogleSQLParser.ARRAY_SYMBOL, 0); }
		public TerminalNode LS_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LS_BRACKET_SYMBOL, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Array_constructor_prefix_no_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_constructor_prefix_no_expressions; }
	}

	public final Array_constructor_prefix_no_expressionsContext array_constructor_prefix_no_expressions() throws RecognitionException {
		Array_constructor_prefix_no_expressionsContext _localctx = new Array_constructor_prefix_no_expressionsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_array_constructor_prefix_no_expressions);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(ARRAY_SYMBOL);
				setState(696);
				match(LS_BRACKET_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				match(LS_BRACKET_SYMBOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(698);
				array_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_literalContext extends ParserRuleContext {
		public Range_typeContext range_type() {
			return getRuleContext(Range_typeContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Range_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_literal; }
	}

	public final Range_literalContext range_literal() throws RecognitionException {
		Range_literalContext _localctx = new Range_literalContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			range_type();
			setState(702);
			string_literal(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_typeContext extends ParserRuleContext {
		public TerminalNode RANGE_SYMBOL() { return getToken(GoogleSQLParser.RANGE_SYMBOL, 0); }
		public Template_type_openContext template_type_open() {
			return getRuleContext(Template_type_openContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Template_type_closeContext template_type_close() {
			return getRuleContext(Template_type_closeContext.class,0);
		}
		public Range_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_type; }
	}

	public final Range_typeContext range_type() throws RecognitionException {
		Range_typeContext _localctx = new Range_typeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_range_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(RANGE_SYMBOL);
			setState(705);
			template_type_open();
			setState(706);
			type();
			setState(707);
			template_type_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Raw_typeContext raw_type() {
			return getRuleContext(Raw_typeContext.class,0);
		}
		public Opt_type_parametersContext opt_type_parameters() {
			return getRuleContext(Opt_type_parametersContext.class,0);
		}
		public Collate_clauseContext collate_clause() {
			return getRuleContext(Collate_clauseContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			raw_type();
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(710);
				opt_type_parameters();
				}
				break;
			}
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(713);
				collate_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Collate_clauseContext extends ParserRuleContext {
		public TerminalNode COLLATE_SYMBOL() { return getToken(GoogleSQLParser.COLLATE_SYMBOL, 0); }
		public String_literal_or_parameterContext string_literal_or_parameter() {
			return getRuleContext(String_literal_or_parameterContext.class,0);
		}
		public Collate_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collate_clause; }
	}

	public final Collate_clauseContext collate_clause() throws RecognitionException {
		Collate_clauseContext _localctx = new Collate_clauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_collate_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(COLLATE_SYMBOL);
			setState(717);
			string_literal_or_parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literal_or_parameterContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Parameter_expressionContext parameter_expression() {
			return getRuleContext(Parameter_expressionContext.class,0);
		}
		public System_variable_expressionContext system_variable_expression() {
			return getRuleContext(System_variable_expressionContext.class,0);
		}
		public String_literal_or_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal_or_parameter; }
	}

	public final String_literal_or_parameterContext string_literal_or_parameter() throws RecognitionException {
		String_literal_or_parameterContext _localctx = new String_literal_or_parameterContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_string_literal_or_parameter);
		try {
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				string_literal(0);
				}
				break;
			case QUESTION_SYMBOL:
			case AT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				parameter_expression();
				}
				break;
			case ATAT_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(721);
				system_variable_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class System_variable_expressionContext extends ParserRuleContext {
		public TerminalNode ATAT_SYMBOL() { return getToken(GoogleSQLParser.ATAT_SYMBOL, 0); }
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public System_variable_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_variable_expression; }
	}

	public final System_variable_expressionContext system_variable_expression() throws RecognitionException {
		System_variable_expressionContext _localctx = new System_variable_expressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_system_variable_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(ATAT_SYMBOL);
			setState(725);
			path_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_expressionContext extends ParserRuleContext {
		public Named_parameter_expressionContext named_parameter_expression() {
			return getRuleContext(Named_parameter_expressionContext.class,0);
		}
		public TerminalNode QUESTION_SYMBOL() { return getToken(GoogleSQLParser.QUESTION_SYMBOL, 0); }
		public Parameter_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_expression; }
	}

	public final Parameter_expressionContext parameter_expression() throws RecognitionException {
		Parameter_expressionContext _localctx = new Parameter_expressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_parameter_expression);
		try {
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				named_parameter_expression();
				}
				break;
			case QUESTION_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				match(QUESTION_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Named_parameter_expressionContext extends ParserRuleContext {
		public TerminalNode AT_SYMBOL() { return getToken(GoogleSQLParser.AT_SYMBOL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Named_parameter_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_parameter_expression; }
	}

	public final Named_parameter_expressionContext named_parameter_expression() throws RecognitionException {
		Named_parameter_expressionContext _localctx = new Named_parameter_expressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_named_parameter_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(AT_SYMBOL);
			setState(732);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opt_type_parametersContext extends ParserRuleContext {
		public Type_parameters_prefixContext type_parameters_prefix() {
			return getRuleContext(Type_parameters_prefixContext.class,0);
		}
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public TerminalNode COMMA_SYMBOL() { return getToken(GoogleSQLParser.COMMA_SYMBOL, 0); }
		public Opt_type_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_type_parameters; }
	}

	public final Opt_type_parametersContext opt_type_parameters() throws RecognitionException {
		Opt_type_parametersContext _localctx = new Opt_type_parametersContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_opt_type_parameters);
		try {
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				type_parameters_prefix(0);
				setState(735);
				match(RR_BRACKET_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				type_parameters_prefix(0);
				setState(738);
				match(COMMA_SYMBOL);
				setState(739);
				match(RR_BRACKET_SYMBOL);

						p.NotifyErrorListeners("Syntax error: Trailing comma in type parameters list is not allowed.", nil, nil);
					
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_parameters_prefixContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public Type_parameterContext type_parameter() {
			return getRuleContext(Type_parameterContext.class,0);
		}
		public Type_parameters_prefixContext type_parameters_prefix() {
			return getRuleContext(Type_parameters_prefixContext.class,0);
		}
		public TerminalNode COMMA_SYMBOL() { return getToken(GoogleSQLParser.COMMA_SYMBOL, 0); }
		public Type_parameters_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameters_prefix; }
	}

	public final Type_parameters_prefixContext type_parameters_prefix() throws RecognitionException {
		return type_parameters_prefix(0);
	}

	private Type_parameters_prefixContext type_parameters_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_parameters_prefixContext _localctx = new Type_parameters_prefixContext(_ctx, _parentState);
		Type_parameters_prefixContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_type_parameters_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(745);
			match(LR_BRACKET_SYMBOL);
			setState(746);
			type_parameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_parameters_prefixContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_parameters_prefix);
					setState(748);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(749);
					match(COMMA_SYMBOL);
					setState(750);
					type_parameter();
					}
					} 
				}
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_parameterContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Bytes_literalContext bytes_literal() {
			return getRuleContext(Bytes_literalContext.class,0);
		}
		public Floating_point_literalContext floating_point_literal() {
			return getRuleContext(Floating_point_literalContext.class,0);
		}
		public TerminalNode MAX_SYMBOL() { return getToken(GoogleSQLParser.MAX_SYMBOL, 0); }
		public Type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter; }
	}

	public final Type_parameterContext type_parameter() throws RecognitionException {
		Type_parameterContext _localctx = new Type_parameterContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_type_parameter);
		try {
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				integer_literal();
				}
				break;
			case TRUE_SYMBOL:
			case FALSE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				boolean_literal();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				string_literal(0);
				}
				break;
			case BYTES_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(759);
				bytes_literal(0);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(760);
				floating_point_literal();
				}
				break;
			case MAX_SYMBOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(761);
				match(MAX_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raw_typeContext extends ParserRuleContext {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Range_typeContext range_type() {
			return getRuleContext(Range_typeContext.class,0);
		}
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public Map_typeContext map_type() {
			return getRuleContext(Map_typeContext.class,0);
		}
		public Raw_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_type; }
	}

	public final Raw_typeContext raw_type() throws RecognitionException {
		Raw_typeContext _localctx = new Raw_typeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_raw_type);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				array_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				struct_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				type_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				range_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(768);
				function_type();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(769);
				map_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Map_typeContext extends ParserRuleContext {
		public TypeContext key_type;
		public TypeContext value_type;
		public TerminalNode MAP_SYMBOL() { return getToken(GoogleSQLParser.MAP_SYMBOL, 0); }
		public Template_type_openContext template_type_open() {
			return getRuleContext(Template_type_openContext.class,0);
		}
		public TerminalNode COMMA_SYMBOL() { return getToken(GoogleSQLParser.COMMA_SYMBOL, 0); }
		public Template_type_closeContext template_type_close() {
			return getRuleContext(Template_type_closeContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Map_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_type; }
	}

	public final Map_typeContext map_type() throws RecognitionException {
		Map_typeContext _localctx = new Map_typeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_map_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(MAP_SYMBOL);
			setState(773);
			template_type_open();
			setState(774);
			((Map_typeContext)_localctx).key_type = type();
			setState(775);
			match(COMMA_SYMBOL);
			setState(776);
			((Map_typeContext)_localctx).value_type = type();
			setState(777);
			template_type_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_typeContext extends ParserRuleContext {
		public TypeContext return_type;
		public TypeContext arg_type;
		public Function_type_prefixContext arg_list;
		public TerminalNode FUNCTION_SYMBOL() { return getToken(GoogleSQLParser.FUNCTION_SYMBOL, 0); }
		public Template_type_openContext template_type_open() {
			return getRuleContext(Template_type_openContext.class,0);
		}
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public TerminalNode RR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.RR_BRACKET_SYMBOL, 0); }
		public TerminalNode FUNCTION_RETURN() { return getToken(GoogleSQLParser.FUNCTION_RETURN, 0); }
		public Template_type_closeContext template_type_close() {
			return getRuleContext(Template_type_closeContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Function_type_prefixContext function_type_prefix() {
			return getRuleContext(Function_type_prefixContext.class,0);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_function_type);
		try {
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				match(FUNCTION_SYMBOL);
				setState(780);
				template_type_open();
				setState(781);
				match(LR_BRACKET_SYMBOL);
				setState(782);
				match(RR_BRACKET_SYMBOL);
				setState(783);
				match(FUNCTION_RETURN);
				setState(784);
				((Function_typeContext)_localctx).return_type = type();
				setState(785);
				template_type_close();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				match(FUNCTION_SYMBOL);
				setState(788);
				template_type_open();
				setState(789);
				((Function_typeContext)_localctx).arg_type = type();
				setState(790);
				match(FUNCTION_RETURN);
				setState(791);
				((Function_typeContext)_localctx).return_type = type();
				setState(792);
				template_type_close();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(794);
				((Function_typeContext)_localctx).arg_list = function_type_prefix(0);
				setState(795);
				match(RR_BRACKET_SYMBOL);
				setState(796);
				match(FUNCTION_RETURN);
				setState(797);
				((Function_typeContext)_localctx).return_type = type();
				setState(798);
				template_type_close();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_type_prefixContext extends ParserRuleContext {
		public TerminalNode FUNCTION_SYMBOL() { return getToken(GoogleSQLParser.FUNCTION_SYMBOL, 0); }
		public Template_type_openContext template_type_open() {
			return getRuleContext(Template_type_openContext.class,0);
		}
		public TerminalNode LR_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LR_BRACKET_SYMBOL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_type_prefixContext function_type_prefix() {
			return getRuleContext(Function_type_prefixContext.class,0);
		}
		public TerminalNode COMMA_SYMBOL() { return getToken(GoogleSQLParser.COMMA_SYMBOL, 0); }
		public Function_type_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_prefix; }
	}

	public final Function_type_prefixContext function_type_prefix() throws RecognitionException {
		return function_type_prefix(0);
	}

	private Function_type_prefixContext function_type_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_type_prefixContext _localctx = new Function_type_prefixContext(_ctx, _parentState);
		Function_type_prefixContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_function_type_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(803);
			match(FUNCTION_SYMBOL);
			setState(804);
			template_type_open();
			setState(805);
			match(LR_BRACKET_SYMBOL);
			setState(806);
			type();
			}
			_ctx.stop = _input.LT(-1);
			setState(813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_type_prefixContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_type_prefix);
					setState(808);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(809);
					match(COMMA_SYMBOL);
					setState(810);
					type();
					}
					} 
				}
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public TerminalNode INTERVAL_SYMBOL() { return getToken(GoogleSQLParser.INTERVAL_SYMBOL, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_type_name);
		try {
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCLUDE_SYMBOL:
			case OFFSET_SYMBOL:
			case OPTIONS_SYMBOL:
			case PERCENT_SYMBOL:
			case PIVOT_SYMBOL:
			case REPLACE_SYMBOL:
			case UNPIVOT_SYMBOL:
			case SYSTEM_SYMBOL:
			case SYSTEM_TIME_SYMBOL:
			case VALUE_SYMBOL:
			case NUMERIC_SYMBOL:
			case DECIMAL_SYMBOL:
			case BIGNUMERIC_SYMBOL:
			case BIGDECIMAL_SYMBOL:
			case JSON_SYMBOL:
			case DATE_SYMBOL:
			case TIME_SYMBOL:
			case DATETIME_SYMBOL:
			case TIMESTAMP_SYMBOL:
			case SIMPLE_SYMBOL:
			case ABORT_SYMBOL:
			case ACCESS_SYMBOL:
			case ACTION_SYMBOL:
			case AGGREGATE_SYMBOL:
			case ADD_SYMBOL:
			case ALTER_SYMBOL:
			case ALWAYS_SYMBOL:
			case ANALYZE_SYMBOL:
			case APPROX_SYMBOL:
			case ARE_SYMBOL:
			case ASSERT_SYMBOL:
			case BATCH_SYMBOL:
			case BEGIN_SYMBOL:
			case BREAK_SYMBOL:
			case CALL_SYMBOL:
			case CASCADE_SYMBOL:
			case CHECK_SYMBOL:
			case CLAMPED_SYMBOL:
			case CLONE_SYMBOL:
			case COPY_SYMBOL:
			case CLUSTER_SYMBOL:
			case COLUMN_SYMBOL:
			case COLUMNS_SYMBOL:
			case COMMIT_SYMBOL:
			case CONNECTION_SYMBOL:
			case CONSTANT_SYMBOL:
			case CONSTRAINT_SYMBOL:
			case CONTINUE_SYMBOL:
			case CORRESPONDING_SYMBOL:
			case CYCLE_SYMBOL:
			case DATA_SYMBOL:
			case DATABASE_SYMBOL:
			case DECLARE_SYMBOL:
			case DEFINER_SYMBOL:
			case DELETE_SYMBOL:
			case DELETION_SYMBOL:
			case DEPTH_SYMBOL:
			case DESCRIBE_SYMBOL:
			case DETERMINISTIC_SYMBOL:
			case DO_SYMBOL:
			case DROP_SYMBOL:
			case ELSEIF_SYMBOL:
			case ENFORCED_SYMBOL:
			case ERROR_SYMBOL:
			case EXCEPTION_SYMBOL:
			case EXECUTE_SYMBOL:
			case EXPLAIN_SYMBOL:
			case EXPORT_SYMBOL:
			case EXTEND_SYMBOL:
			case EXTERNAL_SYMBOL:
			case FILES_SYMBOL:
			case FILTER_SYMBOL:
			case FILL_SYMBOL:
			case FIRST_SYMBOL:
			case FOREIGN_SYMBOL:
			case FORMAT_SYMBOL:
			case FUNCTION_SYMBOL:
			case GENERATED_SYMBOL:
			case GRANT_SYMBOL:
			case GROUP_ROWS_SYMBOL:
			case HIDDEN_SYMBOL:
			case IDENTITY_SYMBOL:
			case IMMEDIATE_SYMBOL:
			case IMMUTABLE_SYMBOL:
			case IMPORT_SYMBOL:
			case INCREMENT_SYMBOL:
			case INDEX_SYMBOL:
			case INOUT_SYMBOL:
			case INPUT_SYMBOL:
			case INSERT_SYMBOL:
			case INVOKER_SYMBOL:
			case ISOLATION_SYMBOL:
			case ITERATE_SYMBOL:
			case KEY_SYMBOL:
			case LANGUAGE_SYMBOL:
			case LAST_SYMBOL:
			case LEAVE_SYMBOL:
			case LEVEL_SYMBOL:
			case LOAD_SYMBOL:
			case LOOP_SYMBOL:
			case MACRO_SYMBOL:
			case MAP_SYMBOL:
			case MATCH_SYMBOL:
			case KW_MATCH_RECOGNIZE_NONRESERVED_SYMBOL:
			case MATCHED_SYMBOL:
			case MATERIALIZED_SYMBOL:
			case MAX_SYMBOL:
			case MAXVALUE_SYMBOL:
			case MEASURES_SYMBOL:
			case MESSAGE_SYMBOL:
			case METADATA_SYMBOL:
			case MIN_SYMBOL:
			case MINVALUE_SYMBOL:
			case MODEL_SYMBOL:
			case MODULE_SYMBOL:
			case ONLY_SYMBOL:
			case OUT_SYMBOL:
			case OUTPUT_SYMBOL:
			case OVERWRITE_SYMBOL:
			case PARTITIONS_SYMBOL:
			case PATTERN_SYMBOL:
			case POLICIES_SYMBOL:
			case POLICY_SYMBOL:
			case PRIMARY_SYMBOL:
			case PRIVATE_SYMBOL:
			case PRIVILEGE_SYMBOL:
			case PRIVILEGES_SYMBOL:
			case PROCEDURE_SYMBOL:
			case PROJECT_SYMBOL:
			case PUBLIC_SYMBOL:
			case RAISE_SYMBOL:
			case READ_SYMBOL:
			case REFERENCES_SYMBOL:
			case REMOTE_SYMBOL:
			case REMOVE_SYMBOL:
			case RENAME_SYMBOL:
			case REPEAT_SYMBOL:
			case REPEATABLE_SYMBOL:
			case REPLACE_FIELDS_SYMBOL:
			case REPLICA_SYMBOL:
			case REPORT_SYMBOL:
			case RESTRICT_SYMBOL:
			case RESTRICTION_SYMBOL:
			case RETURNS_SYMBOL:
			case RETURN_SYMBOL:
			case REVOKE_SYMBOL:
			case ROLLBACK_SYMBOL:
			case ROW_SYMBOL:
			case RUN_SYMBOL:
			case SAFE_CAST_SYMBOL:
			case SCHEMA_SYMBOL:
			case SEARCH_SYMBOL:
			case SECURITY_SYMBOL:
			case SEQUENCE_SYMBOL:
			case SETS_SYMBOL:
			case SHOW_SYMBOL:
			case SNAPSHOT_SYMBOL:
			case SOURCE_SYMBOL:
			case SQL_SYMBOL:
			case STABLE_SYMBOL:
			case START_SYMBOL:
			case STATIC_DESCRIBE_SYMBOL:
			case STORED_SYMBOL:
			case STORING_SYMBOL:
			case STRICT_SYMBOL:
			case TABLE_SYMBOL:
			case TABLES_SYMBOL:
			case TARGET_SYMBOL:
			case TEMP_SYMBOL:
			case TEMPORARY_SYMBOL:
			case TRANSACTION_SYMBOL:
			case TRANSFORM_SYMBOL:
			case TRUNCATE_SYMBOL:
			case TYPE_SYMBOL:
			case UNDROP_SYMBOL:
			case UNIQUE_SYMBOL:
			case UNKNOWN_SYMBOL:
			case UNTIL_SYMBOL:
			case UPDATE_SYMBOL:
			case VALUES_SYMBOL:
			case VECTOR_SYMBOL:
			case VIEW_SYMBOL:
			case VIEWS_SYMBOL:
			case VOLATILE_SYMBOL:
			case WEIGHT_SYMBOL:
			case WHILE_SYMBOL:
			case WRITE_SYMBOL:
			case ZONE_SYMBOL:
			case DESCRIPTOR_SYMBOL:
			case INTERLEAVE_SYMBOL:
			case NULL_FILTERED_SYMBOL:
			case PARENT_SYMBOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				path_expression(0);
				}
				break;
			case INTERVAL_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				match(INTERVAL_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Path_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public TerminalNode DOT_SYMBOL() { return getToken(GoogleSQLParser.DOT_SYMBOL, 0); }
		public Path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_expression; }
	}

	public final Path_expressionContext path_expression() throws RecognitionException {
		return path_expression(0);
	}

	private Path_expressionContext path_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Path_expressionContext _localctx = new Path_expressionContext(_ctx, _parentState);
		Path_expressionContext _prevctx = _localctx;
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_path_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(821);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(828);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Path_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_path_expression);
					setState(823);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(824);
					match(DOT_SYMBOL);
					setState(825);
					identifier();
					}
					} 
				}
				setState(830);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public Token_identifierContext token_identifier() {
			return getRuleContext(Token_identifierContext.class,0);
		}
		public Keyword_as_identifierContext keyword_as_identifier() {
			return getRuleContext(Keyword_as_identifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_identifier);
		try {
			setState(833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				token_identifier();
				}
				break;
			case INCLUDE_SYMBOL:
			case OFFSET_SYMBOL:
			case OPTIONS_SYMBOL:
			case PERCENT_SYMBOL:
			case PIVOT_SYMBOL:
			case REPLACE_SYMBOL:
			case UNPIVOT_SYMBOL:
			case SYSTEM_SYMBOL:
			case SYSTEM_TIME_SYMBOL:
			case VALUE_SYMBOL:
			case NUMERIC_SYMBOL:
			case DECIMAL_SYMBOL:
			case BIGNUMERIC_SYMBOL:
			case BIGDECIMAL_SYMBOL:
			case JSON_SYMBOL:
			case DATE_SYMBOL:
			case TIME_SYMBOL:
			case DATETIME_SYMBOL:
			case TIMESTAMP_SYMBOL:
			case SIMPLE_SYMBOL:
			case ABORT_SYMBOL:
			case ACCESS_SYMBOL:
			case ACTION_SYMBOL:
			case AGGREGATE_SYMBOL:
			case ADD_SYMBOL:
			case ALTER_SYMBOL:
			case ALWAYS_SYMBOL:
			case ANALYZE_SYMBOL:
			case APPROX_SYMBOL:
			case ARE_SYMBOL:
			case ASSERT_SYMBOL:
			case BATCH_SYMBOL:
			case BEGIN_SYMBOL:
			case BREAK_SYMBOL:
			case CALL_SYMBOL:
			case CASCADE_SYMBOL:
			case CHECK_SYMBOL:
			case CLAMPED_SYMBOL:
			case CLONE_SYMBOL:
			case COPY_SYMBOL:
			case CLUSTER_SYMBOL:
			case COLUMN_SYMBOL:
			case COLUMNS_SYMBOL:
			case COMMIT_SYMBOL:
			case CONNECTION_SYMBOL:
			case CONSTANT_SYMBOL:
			case CONSTRAINT_SYMBOL:
			case CONTINUE_SYMBOL:
			case CORRESPONDING_SYMBOL:
			case CYCLE_SYMBOL:
			case DATA_SYMBOL:
			case DATABASE_SYMBOL:
			case DECLARE_SYMBOL:
			case DEFINER_SYMBOL:
			case DELETE_SYMBOL:
			case DELETION_SYMBOL:
			case DEPTH_SYMBOL:
			case DESCRIBE_SYMBOL:
			case DETERMINISTIC_SYMBOL:
			case DO_SYMBOL:
			case DROP_SYMBOL:
			case ELSEIF_SYMBOL:
			case ENFORCED_SYMBOL:
			case ERROR_SYMBOL:
			case EXCEPTION_SYMBOL:
			case EXECUTE_SYMBOL:
			case EXPLAIN_SYMBOL:
			case EXPORT_SYMBOL:
			case EXTEND_SYMBOL:
			case EXTERNAL_SYMBOL:
			case FILES_SYMBOL:
			case FILTER_SYMBOL:
			case FILL_SYMBOL:
			case FIRST_SYMBOL:
			case FOREIGN_SYMBOL:
			case FORMAT_SYMBOL:
			case FUNCTION_SYMBOL:
			case GENERATED_SYMBOL:
			case GRANT_SYMBOL:
			case GROUP_ROWS_SYMBOL:
			case HIDDEN_SYMBOL:
			case IDENTITY_SYMBOL:
			case IMMEDIATE_SYMBOL:
			case IMMUTABLE_SYMBOL:
			case IMPORT_SYMBOL:
			case INCREMENT_SYMBOL:
			case INDEX_SYMBOL:
			case INOUT_SYMBOL:
			case INPUT_SYMBOL:
			case INSERT_SYMBOL:
			case INVOKER_SYMBOL:
			case ISOLATION_SYMBOL:
			case ITERATE_SYMBOL:
			case KEY_SYMBOL:
			case LANGUAGE_SYMBOL:
			case LAST_SYMBOL:
			case LEAVE_SYMBOL:
			case LEVEL_SYMBOL:
			case LOAD_SYMBOL:
			case LOOP_SYMBOL:
			case MACRO_SYMBOL:
			case MAP_SYMBOL:
			case MATCH_SYMBOL:
			case KW_MATCH_RECOGNIZE_NONRESERVED_SYMBOL:
			case MATCHED_SYMBOL:
			case MATERIALIZED_SYMBOL:
			case MAX_SYMBOL:
			case MAXVALUE_SYMBOL:
			case MEASURES_SYMBOL:
			case MESSAGE_SYMBOL:
			case METADATA_SYMBOL:
			case MIN_SYMBOL:
			case MINVALUE_SYMBOL:
			case MODEL_SYMBOL:
			case MODULE_SYMBOL:
			case ONLY_SYMBOL:
			case OUT_SYMBOL:
			case OUTPUT_SYMBOL:
			case OVERWRITE_SYMBOL:
			case PARTITIONS_SYMBOL:
			case PATTERN_SYMBOL:
			case POLICIES_SYMBOL:
			case POLICY_SYMBOL:
			case PRIMARY_SYMBOL:
			case PRIVATE_SYMBOL:
			case PRIVILEGE_SYMBOL:
			case PRIVILEGES_SYMBOL:
			case PROCEDURE_SYMBOL:
			case PROJECT_SYMBOL:
			case PUBLIC_SYMBOL:
			case RAISE_SYMBOL:
			case READ_SYMBOL:
			case REFERENCES_SYMBOL:
			case REMOTE_SYMBOL:
			case REMOVE_SYMBOL:
			case RENAME_SYMBOL:
			case REPEAT_SYMBOL:
			case REPEATABLE_SYMBOL:
			case REPLACE_FIELDS_SYMBOL:
			case REPLICA_SYMBOL:
			case REPORT_SYMBOL:
			case RESTRICT_SYMBOL:
			case RESTRICTION_SYMBOL:
			case RETURNS_SYMBOL:
			case RETURN_SYMBOL:
			case REVOKE_SYMBOL:
			case ROLLBACK_SYMBOL:
			case ROW_SYMBOL:
			case RUN_SYMBOL:
			case SAFE_CAST_SYMBOL:
			case SCHEMA_SYMBOL:
			case SEARCH_SYMBOL:
			case SECURITY_SYMBOL:
			case SEQUENCE_SYMBOL:
			case SETS_SYMBOL:
			case SHOW_SYMBOL:
			case SNAPSHOT_SYMBOL:
			case SOURCE_SYMBOL:
			case SQL_SYMBOL:
			case STABLE_SYMBOL:
			case START_SYMBOL:
			case STATIC_DESCRIBE_SYMBOL:
			case STORED_SYMBOL:
			case STORING_SYMBOL:
			case STRICT_SYMBOL:
			case TABLE_SYMBOL:
			case TABLES_SYMBOL:
			case TARGET_SYMBOL:
			case TEMP_SYMBOL:
			case TEMPORARY_SYMBOL:
			case TRANSACTION_SYMBOL:
			case TRANSFORM_SYMBOL:
			case TRUNCATE_SYMBOL:
			case TYPE_SYMBOL:
			case UNDROP_SYMBOL:
			case UNIQUE_SYMBOL:
			case UNKNOWN_SYMBOL:
			case UNTIL_SYMBOL:
			case UPDATE_SYMBOL:
			case VALUES_SYMBOL:
			case VECTOR_SYMBOL:
			case VIEW_SYMBOL:
			case VIEWS_SYMBOL:
			case VOLATILE_SYMBOL:
			case WEIGHT_SYMBOL:
			case WHILE_SYMBOL:
			case WRITE_SYMBOL:
			case ZONE_SYMBOL:
			case DESCRIPTOR_SYMBOL:
			case INTERLEAVE_SYMBOL:
			case NULL_FILTERED_SYMBOL:
			case PARENT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				keyword_as_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Keyword_as_identifierContext extends ParserRuleContext {
		public Common_keyword_as_identifierContext common_keyword_as_identifier() {
			return getRuleContext(Common_keyword_as_identifierContext.class,0);
		}
		public TerminalNode SIMPLE_SYMBOL() { return getToken(GoogleSQLParser.SIMPLE_SYMBOL, 0); }
		public Keyword_as_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_as_identifier; }
	}

	public final Keyword_as_identifierContext keyword_as_identifier() throws RecognitionException {
		Keyword_as_identifierContext _localctx = new Keyword_as_identifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_keyword_as_identifier);
		try {
			setState(837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCLUDE_SYMBOL:
			case OFFSET_SYMBOL:
			case OPTIONS_SYMBOL:
			case PERCENT_SYMBOL:
			case PIVOT_SYMBOL:
			case REPLACE_SYMBOL:
			case UNPIVOT_SYMBOL:
			case SYSTEM_SYMBOL:
			case SYSTEM_TIME_SYMBOL:
			case VALUE_SYMBOL:
			case NUMERIC_SYMBOL:
			case DECIMAL_SYMBOL:
			case BIGNUMERIC_SYMBOL:
			case BIGDECIMAL_SYMBOL:
			case JSON_SYMBOL:
			case DATE_SYMBOL:
			case TIME_SYMBOL:
			case DATETIME_SYMBOL:
			case TIMESTAMP_SYMBOL:
			case ABORT_SYMBOL:
			case ACCESS_SYMBOL:
			case ACTION_SYMBOL:
			case AGGREGATE_SYMBOL:
			case ADD_SYMBOL:
			case ALTER_SYMBOL:
			case ALWAYS_SYMBOL:
			case ANALYZE_SYMBOL:
			case APPROX_SYMBOL:
			case ARE_SYMBOL:
			case ASSERT_SYMBOL:
			case BATCH_SYMBOL:
			case BEGIN_SYMBOL:
			case BREAK_SYMBOL:
			case CALL_SYMBOL:
			case CASCADE_SYMBOL:
			case CHECK_SYMBOL:
			case CLAMPED_SYMBOL:
			case CLONE_SYMBOL:
			case COPY_SYMBOL:
			case CLUSTER_SYMBOL:
			case COLUMN_SYMBOL:
			case COLUMNS_SYMBOL:
			case COMMIT_SYMBOL:
			case CONNECTION_SYMBOL:
			case CONSTANT_SYMBOL:
			case CONSTRAINT_SYMBOL:
			case CONTINUE_SYMBOL:
			case CORRESPONDING_SYMBOL:
			case CYCLE_SYMBOL:
			case DATA_SYMBOL:
			case DATABASE_SYMBOL:
			case DECLARE_SYMBOL:
			case DEFINER_SYMBOL:
			case DELETE_SYMBOL:
			case DELETION_SYMBOL:
			case DEPTH_SYMBOL:
			case DESCRIBE_SYMBOL:
			case DETERMINISTIC_SYMBOL:
			case DO_SYMBOL:
			case DROP_SYMBOL:
			case ELSEIF_SYMBOL:
			case ENFORCED_SYMBOL:
			case ERROR_SYMBOL:
			case EXCEPTION_SYMBOL:
			case EXECUTE_SYMBOL:
			case EXPLAIN_SYMBOL:
			case EXPORT_SYMBOL:
			case EXTEND_SYMBOL:
			case EXTERNAL_SYMBOL:
			case FILES_SYMBOL:
			case FILTER_SYMBOL:
			case FILL_SYMBOL:
			case FIRST_SYMBOL:
			case FOREIGN_SYMBOL:
			case FORMAT_SYMBOL:
			case FUNCTION_SYMBOL:
			case GENERATED_SYMBOL:
			case GRANT_SYMBOL:
			case GROUP_ROWS_SYMBOL:
			case HIDDEN_SYMBOL:
			case IDENTITY_SYMBOL:
			case IMMEDIATE_SYMBOL:
			case IMMUTABLE_SYMBOL:
			case IMPORT_SYMBOL:
			case INCREMENT_SYMBOL:
			case INDEX_SYMBOL:
			case INOUT_SYMBOL:
			case INPUT_SYMBOL:
			case INSERT_SYMBOL:
			case INVOKER_SYMBOL:
			case ISOLATION_SYMBOL:
			case ITERATE_SYMBOL:
			case KEY_SYMBOL:
			case LANGUAGE_SYMBOL:
			case LAST_SYMBOL:
			case LEAVE_SYMBOL:
			case LEVEL_SYMBOL:
			case LOAD_SYMBOL:
			case LOOP_SYMBOL:
			case MACRO_SYMBOL:
			case MAP_SYMBOL:
			case MATCH_SYMBOL:
			case KW_MATCH_RECOGNIZE_NONRESERVED_SYMBOL:
			case MATCHED_SYMBOL:
			case MATERIALIZED_SYMBOL:
			case MAX_SYMBOL:
			case MAXVALUE_SYMBOL:
			case MEASURES_SYMBOL:
			case MESSAGE_SYMBOL:
			case METADATA_SYMBOL:
			case MIN_SYMBOL:
			case MINVALUE_SYMBOL:
			case MODEL_SYMBOL:
			case MODULE_SYMBOL:
			case ONLY_SYMBOL:
			case OUT_SYMBOL:
			case OUTPUT_SYMBOL:
			case OVERWRITE_SYMBOL:
			case PARTITIONS_SYMBOL:
			case PATTERN_SYMBOL:
			case POLICIES_SYMBOL:
			case POLICY_SYMBOL:
			case PRIMARY_SYMBOL:
			case PRIVATE_SYMBOL:
			case PRIVILEGE_SYMBOL:
			case PRIVILEGES_SYMBOL:
			case PROCEDURE_SYMBOL:
			case PROJECT_SYMBOL:
			case PUBLIC_SYMBOL:
			case RAISE_SYMBOL:
			case READ_SYMBOL:
			case REFERENCES_SYMBOL:
			case REMOTE_SYMBOL:
			case REMOVE_SYMBOL:
			case RENAME_SYMBOL:
			case REPEAT_SYMBOL:
			case REPEATABLE_SYMBOL:
			case REPLACE_FIELDS_SYMBOL:
			case REPLICA_SYMBOL:
			case REPORT_SYMBOL:
			case RESTRICT_SYMBOL:
			case RESTRICTION_SYMBOL:
			case RETURNS_SYMBOL:
			case RETURN_SYMBOL:
			case REVOKE_SYMBOL:
			case ROLLBACK_SYMBOL:
			case ROW_SYMBOL:
			case RUN_SYMBOL:
			case SAFE_CAST_SYMBOL:
			case SCHEMA_SYMBOL:
			case SEARCH_SYMBOL:
			case SECURITY_SYMBOL:
			case SEQUENCE_SYMBOL:
			case SETS_SYMBOL:
			case SHOW_SYMBOL:
			case SNAPSHOT_SYMBOL:
			case SOURCE_SYMBOL:
			case SQL_SYMBOL:
			case STABLE_SYMBOL:
			case START_SYMBOL:
			case STATIC_DESCRIBE_SYMBOL:
			case STORED_SYMBOL:
			case STORING_SYMBOL:
			case STRICT_SYMBOL:
			case TABLE_SYMBOL:
			case TABLES_SYMBOL:
			case TARGET_SYMBOL:
			case TEMP_SYMBOL:
			case TEMPORARY_SYMBOL:
			case TRANSACTION_SYMBOL:
			case TRANSFORM_SYMBOL:
			case TRUNCATE_SYMBOL:
			case TYPE_SYMBOL:
			case UNDROP_SYMBOL:
			case UNIQUE_SYMBOL:
			case UNKNOWN_SYMBOL:
			case UNTIL_SYMBOL:
			case UPDATE_SYMBOL:
			case VALUES_SYMBOL:
			case VECTOR_SYMBOL:
			case VIEW_SYMBOL:
			case VIEWS_SYMBOL:
			case VOLATILE_SYMBOL:
			case WEIGHT_SYMBOL:
			case WHILE_SYMBOL:
			case WRITE_SYMBOL:
			case ZONE_SYMBOL:
			case DESCRIPTOR_SYMBOL:
			case INTERLEAVE_SYMBOL:
			case NULL_FILTERED_SYMBOL:
			case PARENT_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				common_keyword_as_identifier();
				}
				break;
			case SIMPLE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				match(SIMPLE_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_keyword_as_identifierContext extends ParserRuleContext {
		public TerminalNode ABORT_SYMBOL() { return getToken(GoogleSQLParser.ABORT_SYMBOL, 0); }
		public TerminalNode ACCESS_SYMBOL() { return getToken(GoogleSQLParser.ACCESS_SYMBOL, 0); }
		public TerminalNode ACTION_SYMBOL() { return getToken(GoogleSQLParser.ACTION_SYMBOL, 0); }
		public TerminalNode AGGREGATE_SYMBOL() { return getToken(GoogleSQLParser.AGGREGATE_SYMBOL, 0); }
		public TerminalNode ADD_SYMBOL() { return getToken(GoogleSQLParser.ADD_SYMBOL, 0); }
		public TerminalNode ALTER_SYMBOL() { return getToken(GoogleSQLParser.ALTER_SYMBOL, 0); }
		public TerminalNode ALWAYS_SYMBOL() { return getToken(GoogleSQLParser.ALWAYS_SYMBOL, 0); }
		public TerminalNode ANALYZE_SYMBOL() { return getToken(GoogleSQLParser.ANALYZE_SYMBOL, 0); }
		public TerminalNode APPROX_SYMBOL() { return getToken(GoogleSQLParser.APPROX_SYMBOL, 0); }
		public TerminalNode ARE_SYMBOL() { return getToken(GoogleSQLParser.ARE_SYMBOL, 0); }
		public TerminalNode ASSERT_SYMBOL() { return getToken(GoogleSQLParser.ASSERT_SYMBOL, 0); }
		public TerminalNode BATCH_SYMBOL() { return getToken(GoogleSQLParser.BATCH_SYMBOL, 0); }
		public TerminalNode BEGIN_SYMBOL() { return getToken(GoogleSQLParser.BEGIN_SYMBOL, 0); }
		public TerminalNode BIGDECIMAL_SYMBOL() { return getToken(GoogleSQLParser.BIGDECIMAL_SYMBOL, 0); }
		public TerminalNode BIGNUMERIC_SYMBOL() { return getToken(GoogleSQLParser.BIGNUMERIC_SYMBOL, 0); }
		public TerminalNode BREAK_SYMBOL() { return getToken(GoogleSQLParser.BREAK_SYMBOL, 0); }
		public TerminalNode CALL_SYMBOL() { return getToken(GoogleSQLParser.CALL_SYMBOL, 0); }
		public TerminalNode CASCADE_SYMBOL() { return getToken(GoogleSQLParser.CASCADE_SYMBOL, 0); }
		public TerminalNode CHECK_SYMBOL() { return getToken(GoogleSQLParser.CHECK_SYMBOL, 0); }
		public TerminalNode CLAMPED_SYMBOL() { return getToken(GoogleSQLParser.CLAMPED_SYMBOL, 0); }
		public TerminalNode CLONE_SYMBOL() { return getToken(GoogleSQLParser.CLONE_SYMBOL, 0); }
		public TerminalNode COPY_SYMBOL() { return getToken(GoogleSQLParser.COPY_SYMBOL, 0); }
		public TerminalNode CLUSTER_SYMBOL() { return getToken(GoogleSQLParser.CLUSTER_SYMBOL, 0); }
		public TerminalNode COLUMN_SYMBOL() { return getToken(GoogleSQLParser.COLUMN_SYMBOL, 0); }
		public TerminalNode COLUMNS_SYMBOL() { return getToken(GoogleSQLParser.COLUMNS_SYMBOL, 0); }
		public TerminalNode COMMIT_SYMBOL() { return getToken(GoogleSQLParser.COMMIT_SYMBOL, 0); }
		public TerminalNode CONNECTION_SYMBOL() { return getToken(GoogleSQLParser.CONNECTION_SYMBOL, 0); }
		public TerminalNode CONSTANT_SYMBOL() { return getToken(GoogleSQLParser.CONSTANT_SYMBOL, 0); }
		public TerminalNode CONSTRAINT_SYMBOL() { return getToken(GoogleSQLParser.CONSTRAINT_SYMBOL, 0); }
		public TerminalNode CONTINUE_SYMBOL() { return getToken(GoogleSQLParser.CONTINUE_SYMBOL, 0); }
		public TerminalNode CORRESPONDING_SYMBOL() { return getToken(GoogleSQLParser.CORRESPONDING_SYMBOL, 0); }
		public TerminalNode CYCLE_SYMBOL() { return getToken(GoogleSQLParser.CYCLE_SYMBOL, 0); }
		public TerminalNode DATA_SYMBOL() { return getToken(GoogleSQLParser.DATA_SYMBOL, 0); }
		public TerminalNode DATABASE_SYMBOL() { return getToken(GoogleSQLParser.DATABASE_SYMBOL, 0); }
		public TerminalNode DATE_SYMBOL() { return getToken(GoogleSQLParser.DATE_SYMBOL, 0); }
		public TerminalNode DATETIME_SYMBOL() { return getToken(GoogleSQLParser.DATETIME_SYMBOL, 0); }
		public TerminalNode DECIMAL_SYMBOL() { return getToken(GoogleSQLParser.DECIMAL_SYMBOL, 0); }
		public TerminalNode DECLARE_SYMBOL() { return getToken(GoogleSQLParser.DECLARE_SYMBOL, 0); }
		public TerminalNode DEFINER_SYMBOL() { return getToken(GoogleSQLParser.DEFINER_SYMBOL, 0); }
		public TerminalNode DELETE_SYMBOL() { return getToken(GoogleSQLParser.DELETE_SYMBOL, 0); }
		public TerminalNode DELETION_SYMBOL() { return getToken(GoogleSQLParser.DELETION_SYMBOL, 0); }
		public TerminalNode DEPTH_SYMBOL() { return getToken(GoogleSQLParser.DEPTH_SYMBOL, 0); }
		public TerminalNode DESCRIBE_SYMBOL() { return getToken(GoogleSQLParser.DESCRIBE_SYMBOL, 0); }
		public TerminalNode DETERMINISTIC_SYMBOL() { return getToken(GoogleSQLParser.DETERMINISTIC_SYMBOL, 0); }
		public TerminalNode DO_SYMBOL() { return getToken(GoogleSQLParser.DO_SYMBOL, 0); }
		public TerminalNode DROP_SYMBOL() { return getToken(GoogleSQLParser.DROP_SYMBOL, 0); }
		public TerminalNode ELSEIF_SYMBOL() { return getToken(GoogleSQLParser.ELSEIF_SYMBOL, 0); }
		public TerminalNode ENFORCED_SYMBOL() { return getToken(GoogleSQLParser.ENFORCED_SYMBOL, 0); }
		public TerminalNode ERROR_SYMBOL() { return getToken(GoogleSQLParser.ERROR_SYMBOL, 0); }
		public TerminalNode EXCEPTION_SYMBOL() { return getToken(GoogleSQLParser.EXCEPTION_SYMBOL, 0); }
		public TerminalNode EXECUTE_SYMBOL() { return getToken(GoogleSQLParser.EXECUTE_SYMBOL, 0); }
		public TerminalNode EXPLAIN_SYMBOL() { return getToken(GoogleSQLParser.EXPLAIN_SYMBOL, 0); }
		public TerminalNode EXPORT_SYMBOL() { return getToken(GoogleSQLParser.EXPORT_SYMBOL, 0); }
		public TerminalNode EXTEND_SYMBOL() { return getToken(GoogleSQLParser.EXTEND_SYMBOL, 0); }
		public TerminalNode EXTERNAL_SYMBOL() { return getToken(GoogleSQLParser.EXTERNAL_SYMBOL, 0); }
		public TerminalNode FILES_SYMBOL() { return getToken(GoogleSQLParser.FILES_SYMBOL, 0); }
		public TerminalNode FILTER_SYMBOL() { return getToken(GoogleSQLParser.FILTER_SYMBOL, 0); }
		public TerminalNode FILL_SYMBOL() { return getToken(GoogleSQLParser.FILL_SYMBOL, 0); }
		public TerminalNode FIRST_SYMBOL() { return getToken(GoogleSQLParser.FIRST_SYMBOL, 0); }
		public TerminalNode FOREIGN_SYMBOL() { return getToken(GoogleSQLParser.FOREIGN_SYMBOL, 0); }
		public TerminalNode FORMAT_SYMBOL() { return getToken(GoogleSQLParser.FORMAT_SYMBOL, 0); }
		public TerminalNode FUNCTION_SYMBOL() { return getToken(GoogleSQLParser.FUNCTION_SYMBOL, 0); }
		public TerminalNode GENERATED_SYMBOL() { return getToken(GoogleSQLParser.GENERATED_SYMBOL, 0); }
		public TerminalNode GRANT_SYMBOL() { return getToken(GoogleSQLParser.GRANT_SYMBOL, 0); }
		public TerminalNode GROUP_ROWS_SYMBOL() { return getToken(GoogleSQLParser.GROUP_ROWS_SYMBOL, 0); }
		public TerminalNode HIDDEN_SYMBOL() { return getToken(GoogleSQLParser.HIDDEN_SYMBOL, 0); }
		public TerminalNode IDENTITY_SYMBOL() { return getToken(GoogleSQLParser.IDENTITY_SYMBOL, 0); }
		public TerminalNode IMMEDIATE_SYMBOL() { return getToken(GoogleSQLParser.IMMEDIATE_SYMBOL, 0); }
		public TerminalNode IMMUTABLE_SYMBOL() { return getToken(GoogleSQLParser.IMMUTABLE_SYMBOL, 0); }
		public TerminalNode IMPORT_SYMBOL() { return getToken(GoogleSQLParser.IMPORT_SYMBOL, 0); }
		public TerminalNode INCLUDE_SYMBOL() { return getToken(GoogleSQLParser.INCLUDE_SYMBOL, 0); }
		public TerminalNode INCREMENT_SYMBOL() { return getToken(GoogleSQLParser.INCREMENT_SYMBOL, 0); }
		public TerminalNode INDEX_SYMBOL() { return getToken(GoogleSQLParser.INDEX_SYMBOL, 0); }
		public TerminalNode INOUT_SYMBOL() { return getToken(GoogleSQLParser.INOUT_SYMBOL, 0); }
		public TerminalNode INPUT_SYMBOL() { return getToken(GoogleSQLParser.INPUT_SYMBOL, 0); }
		public TerminalNode INSERT_SYMBOL() { return getToken(GoogleSQLParser.INSERT_SYMBOL, 0); }
		public TerminalNode INVOKER_SYMBOL() { return getToken(GoogleSQLParser.INVOKER_SYMBOL, 0); }
		public TerminalNode ISOLATION_SYMBOL() { return getToken(GoogleSQLParser.ISOLATION_SYMBOL, 0); }
		public TerminalNode ITERATE_SYMBOL() { return getToken(GoogleSQLParser.ITERATE_SYMBOL, 0); }
		public TerminalNode JSON_SYMBOL() { return getToken(GoogleSQLParser.JSON_SYMBOL, 0); }
		public TerminalNode KEY_SYMBOL() { return getToken(GoogleSQLParser.KEY_SYMBOL, 0); }
		public TerminalNode LANGUAGE_SYMBOL() { return getToken(GoogleSQLParser.LANGUAGE_SYMBOL, 0); }
		public TerminalNode LAST_SYMBOL() { return getToken(GoogleSQLParser.LAST_SYMBOL, 0); }
		public TerminalNode LEAVE_SYMBOL() { return getToken(GoogleSQLParser.LEAVE_SYMBOL, 0); }
		public TerminalNode LEVEL_SYMBOL() { return getToken(GoogleSQLParser.LEVEL_SYMBOL, 0); }
		public TerminalNode LOAD_SYMBOL() { return getToken(GoogleSQLParser.LOAD_SYMBOL, 0); }
		public TerminalNode LOOP_SYMBOL() { return getToken(GoogleSQLParser.LOOP_SYMBOL, 0); }
		public TerminalNode MACRO_SYMBOL() { return getToken(GoogleSQLParser.MACRO_SYMBOL, 0); }
		public TerminalNode MAP_SYMBOL() { return getToken(GoogleSQLParser.MAP_SYMBOL, 0); }
		public TerminalNode MATCH_SYMBOL() { return getToken(GoogleSQLParser.MATCH_SYMBOL, 0); }
		public TerminalNode KW_MATCH_RECOGNIZE_NONRESERVED_SYMBOL() { return getToken(GoogleSQLParser.KW_MATCH_RECOGNIZE_NONRESERVED_SYMBOL, 0); }
		public TerminalNode MATCHED_SYMBOL() { return getToken(GoogleSQLParser.MATCHED_SYMBOL, 0); }
		public TerminalNode MATERIALIZED_SYMBOL() { return getToken(GoogleSQLParser.MATERIALIZED_SYMBOL, 0); }
		public TerminalNode MAX_SYMBOL() { return getToken(GoogleSQLParser.MAX_SYMBOL, 0); }
		public TerminalNode MAXVALUE_SYMBOL() { return getToken(GoogleSQLParser.MAXVALUE_SYMBOL, 0); }
		public TerminalNode MEASURES_SYMBOL() { return getToken(GoogleSQLParser.MEASURES_SYMBOL, 0); }
		public TerminalNode MESSAGE_SYMBOL() { return getToken(GoogleSQLParser.MESSAGE_SYMBOL, 0); }
		public TerminalNode METADATA_SYMBOL() { return getToken(GoogleSQLParser.METADATA_SYMBOL, 0); }
		public TerminalNode MIN_SYMBOL() { return getToken(GoogleSQLParser.MIN_SYMBOL, 0); }
		public TerminalNode MINVALUE_SYMBOL() { return getToken(GoogleSQLParser.MINVALUE_SYMBOL, 0); }
		public TerminalNode MODEL_SYMBOL() { return getToken(GoogleSQLParser.MODEL_SYMBOL, 0); }
		public TerminalNode MODULE_SYMBOL() { return getToken(GoogleSQLParser.MODULE_SYMBOL, 0); }
		public TerminalNode NUMERIC_SYMBOL() { return getToken(GoogleSQLParser.NUMERIC_SYMBOL, 0); }
		public TerminalNode OFFSET_SYMBOL() { return getToken(GoogleSQLParser.OFFSET_SYMBOL, 0); }
		public TerminalNode ONLY_SYMBOL() { return getToken(GoogleSQLParser.ONLY_SYMBOL, 0); }
		public TerminalNode OPTIONS_SYMBOL() { return getToken(GoogleSQLParser.OPTIONS_SYMBOL, 0); }
		public TerminalNode OUT_SYMBOL() { return getToken(GoogleSQLParser.OUT_SYMBOL, 0); }
		public TerminalNode OUTPUT_SYMBOL() { return getToken(GoogleSQLParser.OUTPUT_SYMBOL, 0); }
		public TerminalNode OVERWRITE_SYMBOL() { return getToken(GoogleSQLParser.OVERWRITE_SYMBOL, 0); }
		public TerminalNode PARTITIONS_SYMBOL() { return getToken(GoogleSQLParser.PARTITIONS_SYMBOL, 0); }
		public TerminalNode PATTERN_SYMBOL() { return getToken(GoogleSQLParser.PATTERN_SYMBOL, 0); }
		public TerminalNode PERCENT_SYMBOL() { return getToken(GoogleSQLParser.PERCENT_SYMBOL, 0); }
		public TerminalNode PIVOT_SYMBOL() { return getToken(GoogleSQLParser.PIVOT_SYMBOL, 0); }
		public TerminalNode POLICIES_SYMBOL() { return getToken(GoogleSQLParser.POLICIES_SYMBOL, 0); }
		public TerminalNode POLICY_SYMBOL() { return getToken(GoogleSQLParser.POLICY_SYMBOL, 0); }
		public TerminalNode PRIMARY_SYMBOL() { return getToken(GoogleSQLParser.PRIMARY_SYMBOL, 0); }
		public TerminalNode PRIVATE_SYMBOL() { return getToken(GoogleSQLParser.PRIVATE_SYMBOL, 0); }
		public TerminalNode PRIVILEGE_SYMBOL() { return getToken(GoogleSQLParser.PRIVILEGE_SYMBOL, 0); }
		public TerminalNode PRIVILEGES_SYMBOL() { return getToken(GoogleSQLParser.PRIVILEGES_SYMBOL, 0); }
		public TerminalNode PROCEDURE_SYMBOL() { return getToken(GoogleSQLParser.PROCEDURE_SYMBOL, 0); }
		public TerminalNode PROJECT_SYMBOL() { return getToken(GoogleSQLParser.PROJECT_SYMBOL, 0); }
		public TerminalNode PUBLIC_SYMBOL() { return getToken(GoogleSQLParser.PUBLIC_SYMBOL, 0); }
		public TerminalNode RAISE_SYMBOL() { return getToken(GoogleSQLParser.RAISE_SYMBOL, 0); }
		public TerminalNode READ_SYMBOL() { return getToken(GoogleSQLParser.READ_SYMBOL, 0); }
		public TerminalNode REFERENCES_SYMBOL() { return getToken(GoogleSQLParser.REFERENCES_SYMBOL, 0); }
		public TerminalNode REMOTE_SYMBOL() { return getToken(GoogleSQLParser.REMOTE_SYMBOL, 0); }
		public TerminalNode REMOVE_SYMBOL() { return getToken(GoogleSQLParser.REMOVE_SYMBOL, 0); }
		public TerminalNode RENAME_SYMBOL() { return getToken(GoogleSQLParser.RENAME_SYMBOL, 0); }
		public TerminalNode REPEAT_SYMBOL() { return getToken(GoogleSQLParser.REPEAT_SYMBOL, 0); }
		public TerminalNode REPEATABLE_SYMBOL() { return getToken(GoogleSQLParser.REPEATABLE_SYMBOL, 0); }
		public TerminalNode REPLACE_SYMBOL() { return getToken(GoogleSQLParser.REPLACE_SYMBOL, 0); }
		public TerminalNode REPLACE_FIELDS_SYMBOL() { return getToken(GoogleSQLParser.REPLACE_FIELDS_SYMBOL, 0); }
		public TerminalNode REPLICA_SYMBOL() { return getToken(GoogleSQLParser.REPLICA_SYMBOL, 0); }
		public TerminalNode REPORT_SYMBOL() { return getToken(GoogleSQLParser.REPORT_SYMBOL, 0); }
		public TerminalNode RESTRICT_SYMBOL() { return getToken(GoogleSQLParser.RESTRICT_SYMBOL, 0); }
		public TerminalNode RESTRICTION_SYMBOL() { return getToken(GoogleSQLParser.RESTRICTION_SYMBOL, 0); }
		public TerminalNode RETURNS_SYMBOL() { return getToken(GoogleSQLParser.RETURNS_SYMBOL, 0); }
		public TerminalNode RETURN_SYMBOL() { return getToken(GoogleSQLParser.RETURN_SYMBOL, 0); }
		public TerminalNode REVOKE_SYMBOL() { return getToken(GoogleSQLParser.REVOKE_SYMBOL, 0); }
		public TerminalNode ROLLBACK_SYMBOL() { return getToken(GoogleSQLParser.ROLLBACK_SYMBOL, 0); }
		public TerminalNode ROW_SYMBOL() { return getToken(GoogleSQLParser.ROW_SYMBOL, 0); }
		public TerminalNode RUN_SYMBOL() { return getToken(GoogleSQLParser.RUN_SYMBOL, 0); }
		public TerminalNode SAFE_CAST_SYMBOL() { return getToken(GoogleSQLParser.SAFE_CAST_SYMBOL, 0); }
		public TerminalNode SCHEMA_SYMBOL() { return getToken(GoogleSQLParser.SCHEMA_SYMBOL, 0); }
		public TerminalNode SEARCH_SYMBOL() { return getToken(GoogleSQLParser.SEARCH_SYMBOL, 0); }
		public TerminalNode SECURITY_SYMBOL() { return getToken(GoogleSQLParser.SECURITY_SYMBOL, 0); }
		public TerminalNode SEQUENCE_SYMBOL() { return getToken(GoogleSQLParser.SEQUENCE_SYMBOL, 0); }
		public TerminalNode SETS_SYMBOL() { return getToken(GoogleSQLParser.SETS_SYMBOL, 0); }
		public TerminalNode SHOW_SYMBOL() { return getToken(GoogleSQLParser.SHOW_SYMBOL, 0); }
		public TerminalNode SNAPSHOT_SYMBOL() { return getToken(GoogleSQLParser.SNAPSHOT_SYMBOL, 0); }
		public TerminalNode SOURCE_SYMBOL() { return getToken(GoogleSQLParser.SOURCE_SYMBOL, 0); }
		public TerminalNode SQL_SYMBOL() { return getToken(GoogleSQLParser.SQL_SYMBOL, 0); }
		public TerminalNode STABLE_SYMBOL() { return getToken(GoogleSQLParser.STABLE_SYMBOL, 0); }
		public TerminalNode START_SYMBOL() { return getToken(GoogleSQLParser.START_SYMBOL, 0); }
		public TerminalNode STATIC_DESCRIBE_SYMBOL() { return getToken(GoogleSQLParser.STATIC_DESCRIBE_SYMBOL, 0); }
		public TerminalNode STORED_SYMBOL() { return getToken(GoogleSQLParser.STORED_SYMBOL, 0); }
		public TerminalNode STORING_SYMBOL() { return getToken(GoogleSQLParser.STORING_SYMBOL, 0); }
		public TerminalNode STRICT_SYMBOL() { return getToken(GoogleSQLParser.STRICT_SYMBOL, 0); }
		public TerminalNode SYSTEM_SYMBOL() { return getToken(GoogleSQLParser.SYSTEM_SYMBOL, 0); }
		public TerminalNode SYSTEM_TIME_SYMBOL() { return getToken(GoogleSQLParser.SYSTEM_TIME_SYMBOL, 0); }
		public TerminalNode TABLE_SYMBOL() { return getToken(GoogleSQLParser.TABLE_SYMBOL, 0); }
		public TerminalNode TABLES_SYMBOL() { return getToken(GoogleSQLParser.TABLES_SYMBOL, 0); }
		public TerminalNode TARGET_SYMBOL() { return getToken(GoogleSQLParser.TARGET_SYMBOL, 0); }
		public TerminalNode TEMP_SYMBOL() { return getToken(GoogleSQLParser.TEMP_SYMBOL, 0); }
		public TerminalNode TEMPORARY_SYMBOL() { return getToken(GoogleSQLParser.TEMPORARY_SYMBOL, 0); }
		public TerminalNode TIME_SYMBOL() { return getToken(GoogleSQLParser.TIME_SYMBOL, 0); }
		public TerminalNode TIMESTAMP_SYMBOL() { return getToken(GoogleSQLParser.TIMESTAMP_SYMBOL, 0); }
		public TerminalNode TRANSACTION_SYMBOL() { return getToken(GoogleSQLParser.TRANSACTION_SYMBOL, 0); }
		public TerminalNode TRANSFORM_SYMBOL() { return getToken(GoogleSQLParser.TRANSFORM_SYMBOL, 0); }
		public TerminalNode TRUNCATE_SYMBOL() { return getToken(GoogleSQLParser.TRUNCATE_SYMBOL, 0); }
		public TerminalNode TYPE_SYMBOL() { return getToken(GoogleSQLParser.TYPE_SYMBOL, 0); }
		public TerminalNode UNDROP_SYMBOL() { return getToken(GoogleSQLParser.UNDROP_SYMBOL, 0); }
		public TerminalNode UNIQUE_SYMBOL() { return getToken(GoogleSQLParser.UNIQUE_SYMBOL, 0); }
		public TerminalNode UNKNOWN_SYMBOL() { return getToken(GoogleSQLParser.UNKNOWN_SYMBOL, 0); }
		public TerminalNode UNPIVOT_SYMBOL() { return getToken(GoogleSQLParser.UNPIVOT_SYMBOL, 0); }
		public TerminalNode UNTIL_SYMBOL() { return getToken(GoogleSQLParser.UNTIL_SYMBOL, 0); }
		public TerminalNode UPDATE_SYMBOL() { return getToken(GoogleSQLParser.UPDATE_SYMBOL, 0); }
		public TerminalNode VALUE_SYMBOL() { return getToken(GoogleSQLParser.VALUE_SYMBOL, 0); }
		public TerminalNode VALUES_SYMBOL() { return getToken(GoogleSQLParser.VALUES_SYMBOL, 0); }
		public TerminalNode VECTOR_SYMBOL() { return getToken(GoogleSQLParser.VECTOR_SYMBOL, 0); }
		public TerminalNode VIEW_SYMBOL() { return getToken(GoogleSQLParser.VIEW_SYMBOL, 0); }
		public TerminalNode VIEWS_SYMBOL() { return getToken(GoogleSQLParser.VIEWS_SYMBOL, 0); }
		public TerminalNode VOLATILE_SYMBOL() { return getToken(GoogleSQLParser.VOLATILE_SYMBOL, 0); }
		public TerminalNode WEIGHT_SYMBOL() { return getToken(GoogleSQLParser.WEIGHT_SYMBOL, 0); }
		public TerminalNode WHILE_SYMBOL() { return getToken(GoogleSQLParser.WHILE_SYMBOL, 0); }
		public TerminalNode WRITE_SYMBOL() { return getToken(GoogleSQLParser.WRITE_SYMBOL, 0); }
		public TerminalNode ZONE_SYMBOL() { return getToken(GoogleSQLParser.ZONE_SYMBOL, 0); }
		public TerminalNode DESCRIPTOR_SYMBOL() { return getToken(GoogleSQLParser.DESCRIPTOR_SYMBOL, 0); }
		public TerminalNode INTERLEAVE_SYMBOL() { return getToken(GoogleSQLParser.INTERLEAVE_SYMBOL, 0); }
		public TerminalNode NULL_FILTERED_SYMBOL() { return getToken(GoogleSQLParser.NULL_FILTERED_SYMBOL, 0); }
		public TerminalNode PARENT_SYMBOL() { return getToken(GoogleSQLParser.PARENT_SYMBOL, 0); }
		public Common_keyword_as_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_keyword_as_identifier; }
	}

	public final Common_keyword_as_identifierContext common_keyword_as_identifier() throws RecognitionException {
		Common_keyword_as_identifierContext _localctx = new Common_keyword_as_identifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_common_keyword_as_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9002991175976091648L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -1L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & -1L) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & 17592186044415L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Token_identifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GoogleSQLParser.IDENTIFIER, 0); }
		public Token_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_identifier; }
	}

	public final Token_identifierContext token_identifier() throws RecognitionException {
		Token_identifierContext _localctx = new Token_identifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_token_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_typeContext extends ParserRuleContext {
		public TerminalNode STRUCT_SYMBOL() { return getToken(GoogleSQLParser.STRUCT_SYMBOL, 0); }
		public Template_type_openContext template_type_open() {
			return getRuleContext(Template_type_openContext.class,0);
		}
		public Template_type_closeContext template_type_close() {
			return getRuleContext(Template_type_closeContext.class,0);
		}
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(STRUCT_SYMBOL);
			setState(844);
			template_type_open();
			setState(845);
			template_type_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode ARRAY_SYMBOL() { return getToken(GoogleSQLParser.ARRAY_SYMBOL, 0); }
		public Template_type_openContext template_type_open() {
			return getRuleContext(Template_type_openContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Template_type_closeContext template_type_close() {
			return getRuleContext(Template_type_closeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(ARRAY_SYMBOL);
			setState(848);
			template_type_open();
			setState(849);
			type();
			setState(850);
			template_type_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Template_type_openContext extends ParserRuleContext {
		public TerminalNode LT_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.LT_BRACKET_SYMBOL, 0); }
		public Template_type_openContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_type_open; }
	}

	public final Template_type_openContext template_type_open() throws RecognitionException {
		Template_type_openContext _localctx = new Template_type_openContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_template_type_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(LT_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Template_type_closeContext extends ParserRuleContext {
		public TerminalNode GT_BRACKET_SYMBOL() { return getToken(GoogleSQLParser.GT_BRACKET_SYMBOL, 0); }
		public Template_type_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_type_close; }
	}

	public final Template_type_closeContext template_type_close() throws RecognitionException {
		Template_type_closeContext _localctx = new Template_type_closeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_template_type_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(GT_BRACKET_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Date_or_time_literalContext extends ParserRuleContext {
		public Date_or_time_literal_kindContext date_or_time_literal_kind() {
			return getRuleContext(Date_or_time_literal_kindContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Date_or_time_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_or_time_literal; }
	}

	public final Date_or_time_literalContext date_or_time_literal() throws RecognitionException {
		Date_or_time_literalContext _localctx = new Date_or_time_literalContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_date_or_time_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			date_or_time_literal_kind();
			setState(857);
			string_literal(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Date_or_time_literal_kindContext extends ParserRuleContext {
		public TerminalNode DATE_SYMBOL() { return getToken(GoogleSQLParser.DATE_SYMBOL, 0); }
		public TerminalNode TIME_SYMBOL() { return getToken(GoogleSQLParser.TIME_SYMBOL, 0); }
		public TerminalNode DATETIME_SYMBOL() { return getToken(GoogleSQLParser.DATETIME_SYMBOL, 0); }
		public TerminalNode TIMESTAMP_SYMBOL() { return getToken(GoogleSQLParser.TIMESTAMP_SYMBOL, 0); }
		public Date_or_time_literal_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_or_time_literal_kind; }
	}

	public final Date_or_time_literal_kindContext date_or_time_literal_kind() throws RecognitionException {
		Date_or_time_literal_kindContext _localctx = new Date_or_time_literal_kindContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_date_or_time_literal_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8646911284551352320L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Floating_point_literalContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(GoogleSQLParser.FLOAT, 0); }
		public Floating_point_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_literal; }
	}

	public final Floating_point_literalContext floating_point_literal() throws RecognitionException {
		Floating_point_literalContext _localctx = new Floating_point_literalContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_floating_point_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Json_literalContext extends ParserRuleContext {
		public TerminalNode JSON_SYMBOL() { return getToken(GoogleSQLParser.JSON_SYMBOL, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Json_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_literal; }
	}

	public final Json_literalContext json_literal() throws RecognitionException {
		Json_literalContext _localctx = new Json_literalContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_json_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(JSON_SYMBOL);
			setState(864);
			string_literal(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bignumeric_literalContext extends ParserRuleContext {
		public Bignumeric_literal_prefixContext bignumeric_literal_prefix() {
			return getRuleContext(Bignumeric_literal_prefixContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Bignumeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bignumeric_literal; }
	}

	public final Bignumeric_literalContext bignumeric_literal() throws RecognitionException {
		Bignumeric_literalContext _localctx = new Bignumeric_literalContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_bignumeric_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			bignumeric_literal_prefix();
			setState(867);
			string_literal(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bignumeric_literal_prefixContext extends ParserRuleContext {
		public TerminalNode BIGNUMERIC_SYMBOL() { return getToken(GoogleSQLParser.BIGNUMERIC_SYMBOL, 0); }
		public TerminalNode BIGDECIMAL_SYMBOL() { return getToken(GoogleSQLParser.BIGDECIMAL_SYMBOL, 0); }
		public Bignumeric_literal_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bignumeric_literal_prefix; }
	}

	public final Bignumeric_literal_prefixContext bignumeric_literal_prefix() throws RecognitionException {
		Bignumeric_literal_prefixContext _localctx = new Bignumeric_literal_prefixContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_bignumeric_literal_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_la = _input.LA(1);
			if ( !(_la==BIGNUMERIC_SYMBOL || _la==BIGDECIMAL_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_literalContext extends ParserRuleContext {
		public Numeric_literal_prefixContext numeric_literal_prefix() {
			return getRuleContext(Numeric_literal_prefixContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_numeric_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			numeric_literal_prefix();
			setState(872);
			string_literal(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_literal_prefixContext extends ParserRuleContext {
		public TerminalNode NUMERIC_SYMBOL() { return getToken(GoogleSQLParser.NUMERIC_SYMBOL, 0); }
		public TerminalNode DECIMAL_SYMBOL() { return getToken(GoogleSQLParser.DECIMAL_SYMBOL, 0); }
		public Numeric_literal_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal_prefix; }
	}

	public final Numeric_literal_prefixContext numeric_literal_prefix() throws RecognitionException {
		Numeric_literal_prefixContext _localctx = new Numeric_literal_prefixContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_numeric_literal_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_la = _input.LA(1);
			if ( !(_la==NUMERIC_SYMBOL || _la==DECIMAL_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(GoogleSQLParser.INTEGER_LITERAL, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_integer_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bytes_literalContext extends ParserRuleContext {
		public Bytes_literal_componentContext bytes_literal_component() {
			return getRuleContext(Bytes_literal_componentContext.class,0);
		}
		public Bytes_literalContext bytes_literal() {
			return getRuleContext(Bytes_literalContext.class,0);
		}
		public String_literal_componentContext string_literal_component() {
			return getRuleContext(String_literal_componentContext.class,0);
		}
		public Bytes_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytes_literal; }
	}

	public final Bytes_literalContext bytes_literal() throws RecognitionException {
		return bytes_literal(0);
	}

	private Bytes_literalContext bytes_literal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bytes_literalContext _localctx = new Bytes_literalContext(_ctx, _parentState);
		Bytes_literalContext _prevctx = _localctx;
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_bytes_literal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(879);
			bytes_literal_component();
			}
			_ctx.stop = _input.LT(-1);
			setState(891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(889);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						_localctx = new Bytes_literalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bytes_literal);
						setState(881);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(882);
						bytes_literal_component();
										
						                  literalStopIndex, componentStartIndex := localctx.Bytes_literal().GetStop().GetStop(), localctx.Bytes_literal_component().GetStart().GetStart()
						                  if literalStopIndex + 1 == componentStartIndex {
						                      p.NotifyErrorListeners("Syntax error: concatenated bytes literals must be separated by whitespace or comments.", nil, nil)
						                  }
						              
						}
						break;
					case 2:
						{
						_localctx = new Bytes_literalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bytes_literal);
						setState(885);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(886);
						string_literal_component();
						p.NotifyErrorListeners("Syntax error: string and bytes literals cannot be concatenated.", nil, nil);
						          		
						}
						break;
					}
					} 
				}
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE_SYMBOL() { return getToken(GoogleSQLParser.TRUE_SYMBOL, 0); }
		public TerminalNode FALSE_SYMBOL() { return getToken(GoogleSQLParser.FALSE_SYMBOL, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_la = _input.LA(1);
			if ( !(_la==TRUE_SYMBOL || _la==FALSE_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public String_literal_componentContext string_literal_component() {
			return getRuleContext(String_literal_componentContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Bytes_literal_componentContext bytes_literal_component() {
			return getRuleContext(Bytes_literal_componentContext.class,0);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	}

	public final String_literalContext string_literal() throws RecognitionException {
		return string_literal(0);
	}

	private String_literalContext string_literal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_literalContext _localctx = new String_literalContext(_ctx, _parentState);
		String_literalContext _prevctx = _localctx;
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_string_literal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(897);
			string_literal_component();
			}
			_ctx.stop = _input.LT(-1);
			setState(909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(907);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						_localctx = new String_literalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_literal);
						setState(899);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(900);
						string_literal_component();
										
						                  literalStopIndex, componentStartIndex := localctx.String_literal().GetStop().GetStop(), localctx.String_literal_component().GetStart().GetStart()
						                  if literalStopIndex + 1 == componentStartIndex {
						                      p.NotifyErrorListeners("Syntax error: concatenated string literals must be separated by whitespace or comments.", nil, nil)
						                  }
						              
						}
						break;
					case 2:
						{
						_localctx = new String_literalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_literal);
						setState(903);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(904);
						bytes_literal_component();
						p.NotifyErrorListeners("Syntax error: string and bytes literals cannot be concatenated.", nil, nil);
						          		
						}
						break;
					}
					} 
				}
				setState(911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literal_componentContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(GoogleSQLParser.STRING_LITERAL, 0); }
		public String_literal_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal_component; }
	}

	public final String_literal_componentContext string_literal_component() throws RecognitionException {
		String_literal_componentContext _localctx = new String_literal_componentContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_string_literal_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bytes_literal_componentContext extends ParserRuleContext {
		public TerminalNode BYTES_LITERAL() { return getToken(GoogleSQLParser.BYTES_LITERAL, 0); }
		public Bytes_literal_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytes_literal_component; }
	}

	public final Bytes_literal_componentContext bytes_literal_component() throws RecognitionException {
		Bytes_literal_componentContext _localctx = new Bytes_literal_componentContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_bytes_literal_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(BYTES_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CountContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count; }
	}

	public final CountContext count() throws RecognitionException {
		CountContext _localctx = new CountContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Skip_rowsContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Skip_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_rows; }
	}

	public final Skip_rowsContext skip_rows() throws RecognitionException {
		Skip_rowsContext _localctx = new Skip_rowsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_skip_rows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GoogleSQLParser.ID, 0); }
		public TerminalNode QUOTED_ID() { return getToken(GoogleSQLParser.QUOTED_ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_ID || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cte_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Cte_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_name; }
	}

	public final Cte_nameContext cte_name() throws RecognitionException {
		Cte_nameContext _localctx = new Cte_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_cte_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alias_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_name; }
	}

	public final Alias_nameContext alias_name() throws RecognitionException {
		Alias_nameContext _localctx = new Alias_nameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Float_typeContext float_type() {
			return getRuleContext(Float_typeContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_number);
		try {
			setState(932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				integer_type();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				float_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Integer_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GoogleSQLParser.INT, 0); }
		public Integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_type; }
	}

	public final Integer_typeContext integer_type() throws RecognitionException {
		Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_integer_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Float_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(GoogleSQLParser.FLOAT, 0); }
		public Float_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_type; }
	}

	public final Float_typeContext float_type() throws RecognitionException {
		Float_typeContext _localctx = new Float_typeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_float_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return query_expr_sempred((Query_exprContext)_localctx, predIndex);
		case 26:
			return from_item_sempred((From_itemContext)_localctx, predIndex);
		case 57:
			return array_constructor_prefix_sempred((Array_constructor_prefixContext)_localctx, predIndex);
		case 68:
			return type_parameters_prefix_sempred((Type_parameters_prefixContext)_localctx, predIndex);
		case 73:
			return function_type_prefix_sempred((Function_type_prefixContext)_localctx, predIndex);
		case 75:
			return path_expression_sempred((Path_expressionContext)_localctx, predIndex);
		case 93:
			return bytes_literal_sempred((Bytes_literalContext)_localctx, predIndex);
		case 95:
			return string_literal_sempred((String_literalContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean query_expr_sempred(Query_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean from_item_sempred(From_itemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean array_constructor_prefix_sempred(Array_constructor_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_parameters_prefix_sempred(Type_parameters_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_type_prefix_sempred(Function_type_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean path_expression_sempred(Path_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bytes_literal_sempred(Bytes_literalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean string_literal_sempred(String_literalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0117\u03ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00df\b\u0001\n"+
		"\u0001\f\u0001\u00e2\t\u0001\u0001\u0001\u0003\u0001\u00e5\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00ed\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00f4\b\u0004\u0001\u0004\u0003\u0004\u00f7\b\u0004"+
		"\u0001\u0004\u0003\u0004\u00fa\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0100\b\u0004\u0001\u0004\u0003\u0004\u0103\b"+
		"\u0004\u0005\u0004\u0105\b\u0004\n\u0004\f\u0004\u0108\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0118\b\b\n\b\f\b\u011b\t\b\u0001\t\u0001\t\u0003\t\u011f\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0127\b\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u012b\b\u000b\u0001\u000b\u0003\u000b\u012e"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0132\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0136\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u013c\b\f\u0001\f\u0003\f\u013f\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u014d\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0152\b\u000e\u0001\u000e\u0003\u000e\u0155\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u016a\b\u0011\n\u0011\f\u0011\u016d\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0172\b\u0012\n\u0012\f\u0012\u0175"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0179\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u018a\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u018f\b\u0016\n\u0016\f\u0016\u0192\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0196\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u019b\b\u0018\n\u0018\f\u0018\u019e\t\u0018\u0001\u0019"+
		"\u0003\u0019\u01a1\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u01a6\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01ad\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01b9\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u01c1\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01c6\b\u001a\u0003\u001a\u01c8\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01d3\b\u001a\n\u001a\f\u001a"+
		"\u01d6\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01dc\b\u001b\u0001\u001b\u0003\u001b\u01df\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01e4\b\u001b\u0003\u001b\u01e6\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01eb\b\u001c\u0001\u001d"+
		"\u0003\u001d\u01ee\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u01f3\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01f8\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01fd\b\u001d\u0001"+
		"\u001d\u0003\u001d\u0200\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0204"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0005!\u0211\b!\n!\f!\u0214\t!\u0001\"\u0001"+
		"\"\u0003\"\u0218\b\"\u0001#\u0001#\u0003#\u021c\b#\u0001$\u0001$\u0001"+
		"$\u0003$\u0221\b$\u0001$\u0001$\u0003$\u0225\b$\u0001$\u0003$\u0228\b"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0005\'\u0237\b\'\n\'\f\'\u023a\t\'\u0001(\u0001"+
		"(\u0001(\u0005(\u023f\b(\n(\f(\u0242\t(\u0001)\u0001)\u0003)\u0246\b)"+
		"\u0001)\u0001)\u0001*\u0003*\u024b\b*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0263\b,\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0003-\u026b\b-\u0001-\u0001-\u0001"+
		"-\u0005-\u0270\b-\n-\f-\u0273\t-\u0001.\u0001.\u0003.\u0277\b.\u0001/"+
		"\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00011\u00011\u00011\u00011\u00012\u00012\u00013\u00013\u0001"+
		"3\u00014\u00014\u00015\u00015\u00016\u00016\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00037\u02a2\b7\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u02aa"+
		"\b8\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00059\u02b3\b9\n"+
		"9\f9\u02b6\t9\u0001:\u0001:\u0001:\u0001:\u0003:\u02bc\b:\u0001;\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0003=\u02c8"+
		"\b=\u0001=\u0003=\u02cb\b=\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0003"+
		"?\u02d3\b?\u0001@\u0001@\u0001@\u0001A\u0001A\u0003A\u02da\bA\u0001B\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003"+
		"C\u02e7\bC\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0005D\u02f0"+
		"\bD\nD\fD\u02f3\tD\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u02fb"+
		"\bE\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u0303\bF\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u0321\bH\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0005I\u032c\bI\nI"+
		"\fI\u032f\tI\u0001J\u0001J\u0003J\u0333\bJ\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0005K\u033b\bK\nK\fK\u033e\tK\u0001L\u0001L\u0003L\u0342"+
		"\bL\u0001M\u0001M\u0003M\u0346\bM\u0001N\u0001N\u0001O\u0001O\u0001P\u0001"+
		"P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001"+
		"S\u0001S\u0001T\u0001T\u0001T\u0001U\u0001U\u0001V\u0001V\u0001W\u0001"+
		"W\u0001W\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001"+
		"[\u0001[\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0005]\u037a\b]\n]\f]\u037d\t]\u0001^\u0001"+
		"^\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0005_\u038c\b_\n_\f_\u038f\t_\u0001`\u0001`\u0001a\u0001a\u0001"+
		"b\u0001b\u0001c\u0001c\u0001d\u0001d\u0001e\u0001e\u0001f\u0001f\u0001"+
		"g\u0001g\u0001h\u0001h\u0001i\u0001i\u0003i\u03a5\bi\u0001j\u0001j\u0001"+
		"k\u0001k\u0001k\u0000\b\b4r\u0088\u0092\u0096\u00ba\u00bel\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u0000\t\u0002\u0000\u0004\u0004\t\t\u0002\u0000"+
		"\u0002\u0002\u000b\u000b\u0002\u0000))00\n\u0000\u0013\u0013\u001c\u001c"+
		"\u001e\u001e!\"&\'*+0047:>B\u00ed\u0001\u0000;>\u0001\u000067\u0001\u0000"+
		"45\u0001\u000023\u0001\u0000\u0105\u0106\u03b2\u0000\u00d8\u0001\u0000"+
		"\u0000\u0000\u0002\u00db\u0001\u0000\u0000\u0000\u0004\u00e6\u0001\u0000"+
		"\u0000\u0000\u0006\u00e8\u0001\u0000\u0000\u0000\b\u00ea\u0001\u0000\u0000"+
		"\u0000\n\u0109\u0001\u0000\u0000\u0000\f\u010b\u0001\u0000\u0000\u0000"+
		"\u000e\u0110\u0001\u0000\u0000\u0000\u0010\u0114\u0001\u0000\u0000\u0000"+
		"\u0012\u011c\u0001\u0000\u0000\u0000\u0014\u0126\u0001\u0000\u0000\u0000"+
		"\u0016\u0128\u0001\u0000\u0000\u0000\u0018\u0137\u0001\u0000\u0000\u0000"+
		"\u001a\u0140\u0001\u0000\u0000\u0000\u001c\u0147\u0001\u0000\u0000\u0000"+
		"\u001e\u0156\u0001\u0000\u0000\u0000 \u015e\u0001\u0000\u0000\u0000\""+
		"\u0166\u0001\u0000\u0000\u0000$\u016e\u0001\u0000\u0000\u0000&\u0176\u0001"+
		"\u0000\u0000\u0000(\u017a\u0001\u0000\u0000\u0000*\u017e\u0001\u0000\u0000"+
		"\u0000,\u018b\u0001\u0000\u0000\u0000.\u0193\u0001\u0000\u0000\u00000"+
		"\u0197\u0001\u0000\u0000\u00002\u01a0\u0001\u0000\u0000\u00004\u01c7\u0001"+
		"\u0000\u0000\u00006\u01de\u0001\u0000\u0000\u00008\u01ea\u0001\u0000\u0000"+
		"\u0000:\u01ff\u0001\u0000\u0000\u0000<\u0203\u0001\u0000\u0000\u0000>"+
		"\u0205\u0001\u0000\u0000\u0000@\u0208\u0001\u0000\u0000\u0000B\u020d\u0001"+
		"\u0000\u0000\u0000D\u0217\u0001\u0000\u0000\u0000F\u0219\u0001\u0000\u0000"+
		"\u0000H\u0220\u0001\u0000\u0000\u0000J\u0229\u0001\u0000\u0000\u0000L"+
		"\u022e\u0001\u0000\u0000\u0000N\u0233\u0001\u0000\u0000\u0000P\u023b\u0001"+
		"\u0000\u0000\u0000R\u0243\u0001\u0000\u0000\u0000T\u024a\u0001\u0000\u0000"+
		"\u0000V\u024e\u0001\u0000\u0000\u0000X\u0255\u0001\u0000\u0000\u0000Z"+
		"\u0268\u0001\u0000\u0000\u0000\\\u0276\u0001\u0000\u0000\u0000^\u0278"+
		"\u0001\u0000\u0000\u0000`\u027e\u0001\u0000\u0000\u0000b\u0284\u0001\u0000"+
		"\u0000\u0000d\u0288\u0001\u0000\u0000\u0000f\u028a\u0001\u0000\u0000\u0000"+
		"h\u028d\u0001\u0000\u0000\u0000j\u028f\u0001\u0000\u0000\u0000l\u0291"+
		"\u0001\u0000\u0000\u0000n\u02a1\u0001\u0000\u0000\u0000p\u02a9\u0001\u0000"+
		"\u0000\u0000r\u02ab\u0001\u0000\u0000\u0000t\u02bb\u0001\u0000\u0000\u0000"+
		"v\u02bd\u0001\u0000\u0000\u0000x\u02c0\u0001\u0000\u0000\u0000z\u02c5"+
		"\u0001\u0000\u0000\u0000|\u02cc\u0001\u0000\u0000\u0000~\u02d2\u0001\u0000"+
		"\u0000\u0000\u0080\u02d4\u0001\u0000\u0000\u0000\u0082\u02d9\u0001\u0000"+
		"\u0000\u0000\u0084\u02db\u0001\u0000\u0000\u0000\u0086\u02e6\u0001\u0000"+
		"\u0000\u0000\u0088\u02e8\u0001\u0000\u0000\u0000\u008a\u02fa\u0001\u0000"+
		"\u0000\u0000\u008c\u0302\u0001\u0000\u0000\u0000\u008e\u0304\u0001\u0000"+
		"\u0000\u0000\u0090\u0320\u0001\u0000\u0000\u0000\u0092\u0322\u0001\u0000"+
		"\u0000\u0000\u0094\u0332\u0001\u0000\u0000\u0000\u0096\u0334\u0001\u0000"+
		"\u0000\u0000\u0098\u0341\u0001\u0000\u0000\u0000\u009a\u0345\u0001\u0000"+
		"\u0000\u0000\u009c\u0347\u0001\u0000\u0000\u0000\u009e\u0349\u0001\u0000"+
		"\u0000\u0000\u00a0\u034b\u0001\u0000\u0000\u0000\u00a2\u034f\u0001\u0000"+
		"\u0000\u0000\u00a4\u0354\u0001\u0000\u0000\u0000\u00a6\u0356\u0001\u0000"+
		"\u0000\u0000\u00a8\u0358\u0001\u0000\u0000\u0000\u00aa\u035b\u0001\u0000"+
		"\u0000\u0000\u00ac\u035d\u0001\u0000\u0000\u0000\u00ae\u035f\u0001\u0000"+
		"\u0000\u0000\u00b0\u0362\u0001\u0000\u0000\u0000\u00b2\u0365\u0001\u0000"+
		"\u0000\u0000\u00b4\u0367\u0001\u0000\u0000\u0000\u00b6\u036a\u0001\u0000"+
		"\u0000\u0000\u00b8\u036c\u0001\u0000\u0000\u0000\u00ba\u036e\u0001\u0000"+
		"\u0000\u0000\u00bc\u037e\u0001\u0000\u0000\u0000\u00be\u0380\u0001\u0000"+
		"\u0000\u0000\u00c0\u0390\u0001\u0000\u0000\u0000\u00c2\u0392\u0001\u0000"+
		"\u0000\u0000\u00c4\u0394\u0001\u0000\u0000\u0000\u00c6\u0396\u0001\u0000"+
		"\u0000\u0000\u00c8\u0398\u0001\u0000\u0000\u0000\u00ca\u039a\u0001\u0000"+
		"\u0000\u0000\u00cc\u039c\u0001\u0000\u0000\u0000\u00ce\u039e\u0001\u0000"+
		"\u0000\u0000\u00d0\u03a0\u0001\u0000\u0000\u0000\u00d2\u03a4\u0001\u0000"+
		"\u0000\u0000\u00d4\u03a6\u0001\u0000\u0000\u0000\u00d6\u03a8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0003\u0002\u0001\u0000\u00d9\u00da\u0005\u0000"+
		"\u0000\u0001\u00da\u0001\u0001\u0000\u0000\u0000\u00db\u00e0\u0003\u0004"+
		"\u0002\u0000\u00dc\u00dd\u0005\u00fb\u0000\u0000\u00dd\u00df\u0003\u0004"+
		"\u0002\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e5\u0005\u00fb\u0000\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u0003\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0003\u0006\u0003\u0000\u00e7\u0005\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0003\b\u0004\u0000\u00e9\u0007\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ec\u0006\u0004\uffff\uffff\u0000\u00eb\u00ed\u0003Z-\u0000"+
		"\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f3\u0001\u0000\u0000\u0000\u00ee\u00f4\u0003\u0016\u000b\u0000"+
		"\u00ef\u00f0\u0005\u00f7\u0000\u0000\u00f0\u00f1\u0003\b\u0004\u0000\u00f1"+
		"\u00f2\u0005\u00f8\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f7\u0003\u000e\u0007\u0000\u00f6"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003\f\u0006\u0000\u00f9\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u0106"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\n\u0001\u0000\u0000\u00fc\u00fd\u0003"+
		"\u0014\n\u0000\u00fd\u00ff\u0003\b\u0004\u0000\u00fe\u0100\u0003\u000e"+
		"\u0007\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u0103\u0003\f\u0006"+
		"\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00fb\u0001\u0000\u0000"+
		"\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\t\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0003\u0016\u000b\u0000"+
		"\u010a\u000b\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0017\u0000\u0000"+
		"\u010c\u010d\u0003\u00c4b\u0000\u010d\u010e\u0005\u001c\u0000\u0000\u010e"+
		"\u010f\u0003\u00c6c\u0000\u010f\r\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0005\u001f\u0000\u0000\u0111\u0112\u0005\u0005\u0000\u0000\u0112\u0113"+
		"\u0003\u0010\b\u0000\u0113\u000f\u0001\u0000\u0000\u0000\u0114\u0119\u0003"+
		"\u0012\t\u0000\u0115\u0116\u0005\u00f0\u0000\u0000\u0116\u0118\u0003\u0012"+
		"\t\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u0011\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011c\u011e\u0003j5\u0000\u011d\u011f\u0007\u0000\u0000\u0000\u011e"+
		"\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0013\u0001\u0000\u0000\u0000\u0120\u0121\u0005-\u0000\u0000\u0121\u0127"+
		"\u0007\u0001\u0000\u0000\u0122\u0123\u0005\u0015\u0000\u0000\u0123\u0127"+
		"\u0005\u000b\u0000\u0000\u0124\u0125\u0005\r\u0000\u0000\u0125\u0127\u0005"+
		"\u000b\u0000\u0000\u0126\u0120\u0001\u0000\u0000\u0000\u0126\u0122\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0015\u0001"+
		"\u0000\u0000\u0000\u0128\u012a\u0005(\u0000\u0000\u0129\u012b\u0003V+"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012e\u0007\u0001\u0000"+
		"\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u0003\u0000"+
		"\u0000\u0130\u0132\u0007\u0002\u0000\u0000\u0131\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u0133\u0135\u0003B!\u0000\u0134\u0136\u0003\u0018\f\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\u0017\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u0010\u0000\u0000\u0138"+
		"\u013b\u00034\u001a\u0000\u0139\u013c\u0003*\u0015\u0000\u013a\u013c\u0003"+
		"\u001c\u000e\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013a\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001"+
		"\u0000\u0000\u0000\u013d\u013f\u0003\u001a\r\u0000\u013e\u013d\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0019\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0005,\u0000\u0000\u0141\u0142\u0005*\u0000\u0000"+
		"\u0142\u0143\u0005\u00f7\u0000\u0000\u0143\u0144\u0003\u00d4j\u0000\u0144"+
		"\u0145\u0005!\u0000\u0000\u0145\u0146\u0005\u00f8\u0000\u0000\u0146\u001b"+
		"\u0001\u0000\u0000\u0000\u0147\u014c\u0005\'\u0000\u0000\u0148\u0149\u0005"+
		"\u0013\u0000\u0000\u0149\u014d\u0005\u001a\u0000\u0000\u014a\u014b\u0005"+
		"\u000e\u0000\u0000\u014b\u014d\u0005\u001a\u0000\u0000\u014c\u0148\u0001"+
		"\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0151\u0005"+
		"\u00f7\u0000\u0000\u014f\u0152\u0003\u001e\u000f\u0000\u0150\u0152\u0003"+
		" \u0010\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0150\u0001\u0000"+
		"\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0155\u0003T*\u0000"+
		"\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000"+
		"\u0155\u001d\u0001\u0000\u0000\u0000\u0156\u0157\u0003\u00ccf\u0000\u0157"+
		"\u0158\u0005\u000f\u0000\u0000\u0158\u0159\u0003\u00ccf\u0000\u0159\u015a"+
		"\u0005\u0012\u0000\u0000\u015a\u015b\u0005\u00f7\u0000\u0000\u015b\u015c"+
		"\u0003$\u0012\u0000\u015c\u015d\u0005\u00f8\u0000\u0000\u015d\u001f\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0003\"\u0011\u0000\u015f\u0160\u0005\u000f"+
		"\u0000\u0000\u0160\u0161\u0003\u00ccf\u0000\u0161\u0162\u0005\u0012\u0000"+
		"\u0000\u0162\u0163\u0005\u00f7\u0000\u0000\u0163\u0164\u0003(\u0014\u0000"+
		"\u0164\u0165\u0005\u00f8\u0000\u0000\u0165!\u0001\u0000\u0000\u0000\u0166"+
		"\u016b\u0003\u00ccf\u0000\u0167\u0168\u0005\u00f0\u0000\u0000\u0168\u016a"+
		"\u0003\u00ccf\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016d\u0001"+
		"\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001"+
		"\u0000\u0000\u0000\u016c#\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000"+
		"\u0000\u0000\u016e\u0173\u0003&\u0013\u0000\u016f\u0170\u0005\u00f0\u0000"+
		"\u0000\u0170\u0172\u0003&\u0013\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0001\u0000\u0000\u0000\u0174%\u0001\u0000\u0000\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0176\u0178\u0003\u00ccf\u0000\u0177\u0179"+
		"\u0003T*\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000"+
		"\u0000\u0000\u0179\'\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u00f7\u0000"+
		"\u0000\u017b\u017c\u0003$\u0012\u0000\u017c\u017d\u0005\u00f8\u0000\u0000"+
		"\u017d)\u0001\u0000\u0000\u0000\u017e\u017f\u0005\"\u0000\u0000\u017f"+
		"\u0180\u0005\u00f7\u0000\u0000\u0180\u0181\u00030\u0018\u0000\u0181\u0182"+
		"\u0005\u000f\u0000\u0000\u0182\u0183\u0003\u00ccf\u0000\u0183\u0184\u0005"+
		"\u0012\u0000\u0000\u0184\u0185\u0005\u00f7\u0000\u0000\u0185\u0186\u0003"+
		",\u0016\u0000\u0186\u0187\u0005\u00f8\u0000\u0000\u0187\u0189\u0005\u00f8"+
		"\u0000\u0000\u0188\u018a\u0003T*\u0000\u0189\u0188\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u018a+\u0001\u0000\u0000\u0000\u018b"+
		"\u0190\u0003.\u0017\u0000\u018c\u018d\u0005\u00f0\u0000\u0000\u018d\u018f"+
		"\u0003.\u0017\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0192\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191-\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0193\u0195\u0003\u00ccf\u0000\u0194\u0196\u0003T*\u0000"+
		"\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000"+
		"\u0196/\u0001\u0000\u0000\u0000\u0197\u019c\u00032\u0019\u0000\u0198\u0199"+
		"\u0005\u00f0\u0000\u0000\u0199\u019b\u00032\u0019\u0000\u019a\u0198\u0001"+
		"\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d1\u0001\u0000"+
		"\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a1\u0003T*\u0000"+
		"\u01a0\u019f\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a13\u0001\u0000\u0000\u0000\u01a2\u01a3\u0006\u001a\uffff\uffff\u0000"+
		"\u01a3\u01a5\u0003\u00d0h\u0000\u01a4\u01a6\u0003T*\u0000\u01a5\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01ac"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\u000f\u0000\u0000\u01a8\u01a9"+
		"\u0005+\u0000\u0000\u01a9\u01aa\u0005\u0003\u0000\u0000\u01aa\u01ab\u0005"+
		"\u001b\u0000\u0000\u01ab\u01ad\u0003j5\u0000\u01ac\u01a7\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01c8\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b8\u0005\u00f7\u0000\u0000\u01af\u01b0\u00034\u001a\u0000"+
		"\u01b0\u01b1\u00038\u001c\u0000\u01b1\u01b2\u00034\u001a\u0000\u01b2\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b4\u00034\u001a\u0000\u01b4\u01b5\u0003"+
		":\u001d\u0000\u01b5\u01b6\u00034\u001a\u0000\u01b6\u01b7\u0003<\u001e"+
		"\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01af\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b3\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0005\u00f8\u0000\u0000\u01bb\u01c8\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bd\u0005\u00f7\u0000\u0000\u01bd\u01be\u0003\b\u0004\u0000"+
		"\u01be\u01c0\u0005\u00f8\u0000\u0000\u01bf\u01c1\u0003T*\u0000\u01c0\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c8\u00036\u001b\u0000\u01c3\u01c5\u0003"+
		"\u00cae\u0000\u01c4\u01c6\u0003T*\u0000\u01c5\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c7\u01a2\u0001\u0000\u0000\u0000\u01c7\u01ae\u0001\u0000\u0000"+
		"\u0000\u01c7\u01bc\u0001\u0000\u0000\u0000\u01c7\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c3\u0001\u0000\u0000\u0000\u01c8\u01d4\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\n\u0006\u0000\u0000\u01ca\u01cb\u00038\u001c\u0000"+
		"\u01cb\u01cc\u00034\u001a\u0007\u01cc\u01d3\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\n\u0005\u0000\u0000\u01ce\u01cf\u0003:\u001d\u0000\u01cf\u01d0"+
		"\u00034\u001a\u0000\u01d0\u01d1\u0003<\u001e\u0000\u01d1\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d2\u01c9\u0001\u0000\u0000\u0000\u01d2\u01cd\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d55\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005.\u0000\u0000"+
		"\u01d8\u01d9\u0005\u00f7\u0000\u0000\u01d9\u01db\u0005\u00f8\u0000\u0000"+
		"\u01da\u01dc\u0003T*\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0001\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01df"+
		"\u0003T*\u0000\u01de\u01d7\u0001\u0000\u0000\u0000\u01de\u01dd\u0001\u0000"+
		"\u0000\u0000\u01df\u01e5\u0001\u0000\u0000\u0000\u01e0\u01e1\u00051\u0000"+
		"\u0000\u01e1\u01e3\u0005\u001c\u0000\u0000\u01e2\u01e4\u0003T*\u0000\u01e3"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e5\u01e0\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e67\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0005\u0006\u0000\u0000\u01e8\u01eb\u0005\u0007\u0000\u0000\u01e9\u01eb"+
		"\u0005\u00f0\u0000\u0000\u01ea\u01e7\u0001\u0000\u0000\u0000\u01ea\u01e9"+
		"\u0001\u0000\u0000\u0000\u01eb9\u0001\u0000\u0000\u0000\u01ec\u01ee\u0005"+
		"\u0014\u0000\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u0200\u0005"+
		"\u0007\u0000\u0000\u01f0\u01f2\u0005\u0011\u0000\u0000\u01f1\u01f3\u0005"+
		" \u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u0200\u0005\u0007"+
		"\u0000\u0000\u01f5\u01f7\u0005\u0016\u0000\u0000\u01f6\u01f8\u0005 \u0000"+
		"\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u0200\u0005\u0007\u0000"+
		"\u0000\u01fa\u01fc\u0005$\u0000\u0000\u01fb\u01fd\u0005 \u0000\u0000\u01fc"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fe\u0200\u0005\u0007\u0000\u0000\u01ff"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ff\u01f0\u0001\u0000\u0000\u0000\u01ff"+
		"\u01f5\u0001\u0000\u0000\u0000\u01ff\u01fa\u0001\u0000\u0000\u0000\u0200"+
		";\u0001\u0000\u0000\u0000\u0201\u0204\u0003>\u001f\u0000\u0202\u0204\u0003"+
		"@ \u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0202\u0001\u0000\u0000"+
		"\u0000\u0204=\u0001\u0000\u0000\u0000\u0205\u0206\u0005\u001d\u0000\u0000"+
		"\u0206\u0207\u0003j5\u0000\u0207?\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0005/\u0000\u0000\u0209\u020a\u0005\u00f7\u0000\u0000\u020a\u020b\u0003"+
		"N\'\u0000\u020b\u020c\u0005\u00f8\u0000\u0000\u020cA\u0001\u0000\u0000"+
		"\u0000\u020d\u0212\u0003D\"\u0000\u020e\u020f\u0005\u00f0\u0000\u0000"+
		"\u020f\u0211\u0003D\"\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211"+
		"\u0214\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0001\u0000\u0000\u0000\u0213C\u0001\u0000\u0000\u0000\u0214\u0212"+
		"\u0001\u0000\u0000\u0000\u0215\u0218\u0003H$\u0000\u0216\u0218\u0003F"+
		"#\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0216\u0001\u0000\u0000"+
		"\u0000\u0218E\u0001\u0000\u0000\u0000\u0219\u021b\u0003j5\u0000\u021a"+
		"\u021c\u0003T*\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021b\u021c\u0001"+
		"\u0000\u0000\u0000\u021cG\u0001\u0000\u0000\u0000\u021d\u021e\u0003j5"+
		"\u0000\u021e\u021f\u0005\u00f1\u0000\u0000\u021f\u0221\u0001\u0000\u0000"+
		"\u0000\u0220\u021d\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0224\u0005\u00ef\u0000"+
		"\u0000\u0223\u0225\u0003J%\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0001\u0000\u0000\u0000\u0225\u0227\u0001\u0000\u0000\u0000\u0226"+
		"\u0228\u0003L&\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0227\u0228\u0001"+
		"\u0000\u0000\u0000\u0228I\u0001\u0000\u0000\u0000\u0229\u022a\u0005\r"+
		"\u0000\u0000\u022a\u022b\u0005\u00f7\u0000\u0000\u022b\u022c\u0003N\'"+
		"\u0000\u022c\u022d\u0005\u00f8\u0000\u0000\u022dK\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0005&\u0000\u0000\u022f\u0230\u0005\u00f7\u0000\u0000\u0230"+
		"\u0231\u0003P(\u0000\u0231\u0232\u0005\u00f8\u0000\u0000\u0232M\u0001"+
		"\u0000\u0000\u0000\u0233\u0238\u0003\u00ccf\u0000\u0234\u0235\u0005\u00f0"+
		"\u0000\u0000\u0235\u0237\u0003\u00ccf\u0000\u0236\u0234\u0001\u0000\u0000"+
		"\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000\u0000"+
		"\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239O\u0001\u0000\u0000\u0000"+
		"\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u0240\u0003R)\u0000\u023c\u023d"+
		"\u0005\u00f0\u0000\u0000\u023d\u023f\u0003R)\u0000\u023e\u023c\u0001\u0000"+
		"\u0000\u0000\u023f\u0242\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000"+
		"\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241Q\u0001\u0000\u0000"+
		"\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0243\u0245\u0003j5\u0000\u0244"+
		"\u0246\u0005\u0003\u0000\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0245"+
		"\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247"+
		"\u0248\u0003\u00ccf\u0000\u0248S\u0001\u0000\u0000\u0000\u0249\u024b\u0005"+
		"\u0003\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024a\u024b\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024d\u0003"+
		"\u00ceg\u0000\u024dU\u0001\u0000\u0000\u0000\u024e\u024f\u00051\u0000"+
		"\u0000\u024f\u0250\u0005\n\u0000\u0000\u0250\u0251\u0005\u001e\u0000\u0000"+
		"\u0251\u0252\u0005\u00f7\u0000\u0000\u0252\u0253\u0003X,\u0000\u0253\u0254"+
		"\u0005\u00f8\u0000\u0000\u0254W\u0001\u0000\u0000\u0000\u0255\u0256\u0005"+
		"\f\u0000\u0000\u0256\u0257\u0005\u00f2\u0000\u0000\u0257\u0258\u0003j"+
		"5\u0000\u0258\u0259\u0005\u00f0\u0000\u0000\u0259\u025a\u0005\b\u0000"+
		"\u0000\u025a\u025b\u0005\u00f2\u0000\u0000\u025b\u025c\u0003j5\u0000\u025c"+
		"\u0262\u0005\u00f0\u0000\u0000\u025d\u025e\u0005\u0018\u0000\u0000\u025e"+
		"\u025f\u0005\u00f2\u0000\u0000\u025f\u0260\u0003j5\u0000\u0260\u0261\u0005"+
		"\u00f0\u0000\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u025d\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0264\u0001"+
		"\u0000\u0000\u0000\u0264\u0265\u0005#\u0000\u0000\u0265\u0266\u0005\u00f2"+
		"\u0000\u0000\u0266\u0267\u0003j5\u0000\u0267Y\u0001\u0000\u0000\u0000"+
		"\u0268\u026a\u00051\u0000\u0000\u0269\u026b\u0005%\u0000\u0000\u026a\u0269"+
		"\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c"+
		"\u0001\u0000\u0000\u0000\u026c\u0271\u0003\\.\u0000\u026d\u026e\u0005"+
		"\u00f0\u0000\u0000\u026e\u0270\u0003\\.\u0000\u026f\u026d\u0001\u0000"+
		"\u0000\u0000\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272[\u0001\u0000\u0000"+
		"\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0277\u0003^/\u0000\u0275"+
		"\u0277\u0003`0\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0276\u0275\u0001"+
		"\u0000\u0000\u0000\u0277]\u0001\u0000\u0000\u0000\u0278\u0279\u0003\u00ca"+
		"e\u0000\u0279\u027a\u0005\u0003\u0000\u0000\u027a\u027b\u0005\u00f7\u0000"+
		"\u0000\u027b\u027c\u0003\b\u0004\u0000\u027c\u027d\u0005\u00f8\u0000\u0000"+
		"\u027d_\u0001\u0000\u0000\u0000\u027e\u027f\u0003\u00cae\u0000\u027f\u0280"+
		"\u0005\u0003\u0000\u0000\u0280\u0281\u0005\u00f7\u0000\u0000\u0281\u0282"+
		"\u0003b1\u0000\u0282\u0283\u0005\u00f8\u0000\u0000\u0283a\u0001\u0000"+
		"\u0000\u0000\u0284\u0285\u0003d2\u0000\u0285\u0286\u0003f3\u0000\u0286"+
		"\u0287\u0003h4\u0000\u0287c\u0001\u0000\u0000\u0000\u0288\u0289\u0003"+
		"\b\u0004\u0000\u0289e\u0001\u0000\u0000\u0000\u028a\u028b\u0005-\u0000"+
		"\u0000\u028b\u028c\u0005\u0002\u0000\u0000\u028cg\u0001\u0000\u0000\u0000"+
		"\u028d\u028e\u0003\b\u0004\u0000\u028ei\u0001\u0000\u0000\u0000\u028f"+
		"\u0290\u0003l6\u0000\u0290k\u0001\u0000\u0000\u0000\u0291\u0292\u0003"+
		"n7\u0000\u0292m\u0001\u0000\u0000\u0000\u0293\u02a2\u0005\u0019\u0000"+
		"\u0000\u0294\u02a2\u0003\u00bc^\u0000\u0295\u02a2\u0003\u00be_\u0000\u0296"+
		"\u02a2\u0003\u00ba]\u0000\u0297\u02a2\u0003\u00b8\\\u0000\u0298\u02a2"+
		"\u0003\u00b4Z\u0000\u0299\u02a2\u0003\u00b0X\u0000\u029a\u02a2\u0003\u00ae"+
		"W\u0000\u029b\u02a2\u0003\u00acV\u0000\u029c\u02a2\u0003\u00a8T\u0000"+
		"\u029d\u02a2\u0003v;\u0000\u029e\u02a2\u0003\u0082A\u0000\u029f\u02a2"+
		"\u0003\u0080@\u0000\u02a0\u02a2\u0003p8\u0000\u02a1\u0293\u0001\u0000"+
		"\u0000\u0000\u02a1\u0294\u0001\u0000\u0000\u0000\u02a1\u0295\u0001\u0000"+
		"\u0000\u0000\u02a1\u0296\u0001\u0000\u0000\u0000\u02a1\u0297\u0001\u0000"+
		"\u0000\u0000\u02a1\u0298\u0001\u0000\u0000\u0000\u02a1\u0299\u0001\u0000"+
		"\u0000\u0000\u02a1\u029a\u0001\u0000\u0000\u0000\u02a1\u029b\u0001\u0000"+
		"\u0000\u0000\u02a1\u029c\u0001\u0000\u0000\u0000\u02a1\u029d\u0001\u0000"+
		"\u0000\u0000\u02a1\u029e\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a2o\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a4\u0003t:\u0000\u02a4\u02a5\u0005\u00fa\u0000\u0000\u02a5"+
		"\u02aa\u0001\u0000\u0000\u0000\u02a6\u02a7\u0003r9\u0000\u02a7\u02a8\u0005"+
		"\u00fa\u0000\u0000\u02a8\u02aa\u0001\u0000\u0000\u0000\u02a9\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a9\u02a6\u0001\u0000\u0000\u0000\u02aaq\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ac\u00069\uffff\uffff\u0000\u02ac\u02ad\u0003t:"+
		"\u0000\u02ad\u02ae\u0003j5\u0000\u02ae\u02b4\u0001\u0000\u0000\u0000\u02af"+
		"\u02b0\n\u0001\u0000\u0000\u02b0\u02b1\u0005\u00f0\u0000\u0000\u02b1\u02b3"+
		"\u0003j5\u0000\u02b2\u02af\u0001\u0000\u0000\u0000\u02b3\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b5s\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0005\u0001\u0000\u0000\u02b8\u02bc\u0005\u00f9\u0000"+
		"\u0000\u02b9\u02bc\u0005\u00f9\u0000\u0000\u02ba\u02bc\u0003\u00a2Q\u0000"+
		"\u02bb\u02b7\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000"+
		"\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bcu\u0001\u0000\u0000\u0000\u02bd"+
		"\u02be\u0003x<\u0000\u02be\u02bf\u0003\u00be_\u0000\u02bfw\u0001\u0000"+
		"\u0000\u0000\u02c0\u02c1\u0005?\u0000\u0000\u02c1\u02c2\u0003\u00a4R\u0000"+
		"\u02c2\u02c3\u0003z=\u0000\u02c3\u02c4\u0003\u00a6S\u0000\u02c4y\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c7\u0003\u008cF\u0000\u02c6\u02c8\u0003\u0086"+
		"C\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000"+
		"\u0000\u02c8\u02ca\u0001\u0000\u0000\u0000\u02c9\u02cb\u0003|>\u0000\u02ca"+
		"\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb"+
		"{\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005\u00ee\u0000\u0000\u02cd\u02ce"+
		"\u0003~?\u0000\u02ce}\u0001\u0000\u0000\u0000\u02cf\u02d3\u0003\u00be"+
		"_\u0000\u02d0\u02d3\u0003\u0082A\u0000\u02d1\u02d3\u0003\u0080@\u0000"+
		"\u02d2\u02cf\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d3\u007f\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d5\u0005\u0104\u0000\u0000\u02d5\u02d6\u0003\u0096K\u0000\u02d6"+
		"\u0081\u0001\u0000\u0000\u0000\u02d7\u02da\u0003\u0084B\u0000\u02d8\u02da"+
		"\u0005\u0102\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02d8"+
		"\u0001\u0000\u0000\u0000\u02da\u0083\u0001\u0000\u0000\u0000\u02db\u02dc"+
		"\u0005\u0103\u0000\u0000\u02dc\u02dd\u0003\u0098L\u0000\u02dd\u0085\u0001"+
		"\u0000\u0000\u0000\u02de\u02df\u0003\u0088D\u0000\u02df\u02e0\u0005\u00f8"+
		"\u0000\u0000\u02e0\u02e7\u0001\u0000\u0000\u0000\u02e1\u02e2\u0003\u0088"+
		"D\u0000\u02e2\u02e3\u0005\u00f0\u0000\u0000\u02e3\u02e4\u0005\u00f8\u0000"+
		"\u0000\u02e4\u02e5\u0006C\uffff\uffff\u0000\u02e5\u02e7\u0001\u0000\u0000"+
		"\u0000\u02e6\u02de\u0001\u0000\u0000\u0000\u02e6\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e7\u0087\u0001\u0000\u0000\u0000\u02e8\u02e9\u0006D\uffff\uffff"+
		"\u0000\u02e9\u02ea\u0005\u00f7\u0000\u0000\u02ea\u02eb\u0003\u008aE\u0000"+
		"\u02eb\u02f1\u0001\u0000\u0000\u0000\u02ec\u02ed\n\u0001\u0000\u0000\u02ed"+
		"\u02ee\u0005\u00f0\u0000\u0000\u02ee\u02f0\u0003\u008aE\u0000\u02ef\u02ec"+
		"\u0001\u0000\u0000\u0000\u02f0\u02f3\u0001\u0000\u0000\u0000\u02f1\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u0089"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f4\u02fb"+
		"\u0003\u00b8\\\u0000\u02f5\u02fb\u0003\u00bc^\u0000\u02f6\u02fb\u0003"+
		"\u00be_\u0000\u02f7\u02fb\u0003\u00ba]\u0000\u02f8\u02fb\u0003\u00acV"+
		"\u0000\u02f9\u02fb\u0005\u0098\u0000\u0000\u02fa\u02f4\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f5\u0001\u0000\u0000\u0000\u02fa\u02f6\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f7\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fb\u008b\u0001\u0000\u0000"+
		"\u0000\u02fc\u0303\u0003\u00a2Q\u0000\u02fd\u0303\u0003\u00a0P\u0000\u02fe"+
		"\u0303\u0003\u0094J\u0000\u02ff\u0303\u0003x<\u0000\u0300\u0303\u0003"+
		"\u0090H\u0000\u0301\u0303\u0003\u008eG\u0000\u0302\u02fc\u0001\u0000\u0000"+
		"\u0000\u0302\u02fd\u0001\u0000\u0000\u0000\u0302\u02fe\u0001\u0000\u0000"+
		"\u0000\u0302\u02ff\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000"+
		"\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0303\u008d\u0001\u0000\u0000"+
		"\u0000\u0304\u0305\u0005\u0093\u0000\u0000\u0305\u0306\u0003\u00a4R\u0000"+
		"\u0306\u0307\u0003z=\u0000\u0307\u0308\u0005\u00f0\u0000\u0000\u0308\u0309"+
		"\u0003z=\u0000\u0309\u030a\u0003\u00a6S\u0000\u030a\u008f\u0001\u0000"+
		"\u0000\u0000\u030b\u030c\u0005z\u0000\u0000\u030c\u030d\u0003\u00a4R\u0000"+
		"\u030d\u030e\u0005\u00f7\u0000\u0000\u030e\u030f\u0005\u00f8\u0000\u0000"+
		"\u030f\u0310\u0005\u0116\u0000\u0000\u0310\u0311\u0003z=\u0000\u0311\u0312"+
		"\u0003\u00a6S\u0000\u0312\u0321\u0001\u0000\u0000\u0000\u0313\u0314\u0005"+
		"z\u0000\u0000\u0314\u0315\u0003\u00a4R\u0000\u0315\u0316\u0003z=\u0000"+
		"\u0316\u0317\u0005\u0116\u0000\u0000\u0317\u0318\u0003z=\u0000\u0318\u0319"+
		"\u0003\u00a6S\u0000\u0319\u0321\u0001\u0000\u0000\u0000\u031a\u031b\u0003"+
		"\u0092I\u0000\u031b\u031c\u0005\u00f8\u0000\u0000\u031c\u031d\u0005\u0116"+
		"\u0000\u0000\u031d\u031e\u0003z=\u0000\u031e\u031f\u0003\u00a6S\u0000"+
		"\u031f\u0321\u0001\u0000\u0000\u0000\u0320\u030b\u0001\u0000\u0000\u0000"+
		"\u0320\u0313\u0001\u0000\u0000\u0000\u0320\u031a\u0001\u0000\u0000\u0000"+
		"\u0321\u0091\u0001\u0000\u0000\u0000\u0322\u0323\u0006I\uffff\uffff\u0000"+
		"\u0323\u0324\u0005z\u0000\u0000\u0324\u0325\u0003\u00a4R\u0000\u0325\u0326"+
		"\u0005\u00f7\u0000\u0000\u0326\u0327\u0003z=\u0000\u0327\u032d\u0001\u0000"+
		"\u0000\u0000\u0328\u0329\n\u0001\u0000\u0000\u0329\u032a\u0005\u00f0\u0000"+
		"\u0000\u032a\u032c\u0003z=\u0000\u032b\u0328\u0001\u0000\u0000\u0000\u032c"+
		"\u032f\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032d"+
		"\u032e\u0001\u0000\u0000\u0000\u032e\u0093\u0001\u0000\u0000\u0000\u032f"+
		"\u032d\u0001\u0000\u0000\u0000\u0330\u0333\u0003\u0096K\u0000\u0331\u0333"+
		"\u0005@\u0000\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0332\u0331\u0001"+
		"\u0000\u0000\u0000\u0333\u0095\u0001\u0000\u0000\u0000\u0334\u0335\u0006"+
		"K\uffff\uffff\u0000\u0335\u0336\u0003\u0098L\u0000\u0336\u033c\u0001\u0000"+
		"\u0000\u0000\u0337\u0338\n\u0001\u0000\u0000\u0338\u0339\u0005\u00f1\u0000"+
		"\u0000\u0339\u033b\u0003\u0098L\u0000\u033a\u0337\u0001\u0000\u0000\u0000"+
		"\u033b\u033e\u0001\u0000\u0000\u0000\u033c\u033a\u0001\u0000\u0000\u0000"+
		"\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u0097\u0001\u0000\u0000\u0000"+
		"\u033e\u033c\u0001\u0000\u0000\u0000\u033f\u0342\u0003\u009eO\u0000\u0340"+
		"\u0342\u0003\u009aM\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0341\u0340"+
		"\u0001\u0000\u0000\u0000\u0342\u0099\u0001\u0000\u0000\u0000\u0343\u0346"+
		"\u0003\u009cN\u0000\u0344\u0346\u0005A\u0000\u0000\u0345\u0343\u0001\u0000"+
		"\u0000\u0000\u0345\u0344\u0001\u0000\u0000\u0000\u0346\u009b\u0001\u0000"+
		"\u0000\u0000\u0347\u0348\u0007\u0003\u0000\u0000\u0348\u009d\u0001\u0000"+
		"\u0000\u0000\u0349\u034a\u0005\u0114\u0000\u0000\u034a\u009f\u0001\u0000"+
		"\u0000\u0000\u034b\u034c\u0005)\u0000\u0000\u034c\u034d\u0003\u00a4R\u0000"+
		"\u034d\u034e\u0003\u00a6S\u0000\u034e\u00a1\u0001\u0000\u0000\u0000\u034f"+
		"\u0350\u0005\u0001\u0000\u0000\u0350\u0351\u0003\u00a4R\u0000\u0351\u0352"+
		"\u0003z=\u0000\u0352\u0353\u0003\u00a6S\u0000\u0353\u00a3\u0001\u0000"+
		"\u0000\u0000\u0354\u0355\u0005\u00f5\u0000\u0000\u0355\u00a5\u0001\u0000"+
		"\u0000\u0000\u0356\u0357\u0005\u00f6\u0000\u0000\u0357\u00a7\u0001\u0000"+
		"\u0000\u0000\u0358\u0359\u0003\u00aaU\u0000\u0359\u035a\u0003\u00be_\u0000"+
		"\u035a\u00a9\u0001\u0000\u0000\u0000\u035b\u035c\u0007\u0004\u0000\u0000"+
		"\u035c\u00ab\u0001\u0000\u0000\u0000\u035d\u035e\u0005\u0108\u0000\u0000"+
		"\u035e\u00ad\u0001\u0000\u0000\u0000\u035f\u0360\u0005:\u0000\u0000\u0360"+
		"\u0361\u0003\u00be_\u0000\u0361\u00af\u0001\u0000\u0000\u0000\u0362\u0363"+
		"\u0003\u00b2Y\u0000\u0363\u0364\u0003\u00be_\u0000\u0364\u00b1\u0001\u0000"+
		"\u0000\u0000\u0365\u0366\u0007\u0005\u0000\u0000\u0366\u00b3\u0001\u0000"+
		"\u0000\u0000\u0367\u0368\u0003\u00b6[\u0000\u0368\u0369\u0003\u00be_\u0000"+
		"\u0369\u00b5\u0001\u0000\u0000\u0000\u036a\u036b\u0007\u0006\u0000\u0000"+
		"\u036b\u00b7\u0001\u0000\u0000\u0000\u036c\u036d\u0005\u0113\u0000\u0000"+
		"\u036d\u00b9\u0001\u0000\u0000\u0000\u036e\u036f\u0006]\uffff\uffff\u0000"+
		"\u036f\u0370\u0003\u00c2a\u0000\u0370\u037b\u0001\u0000\u0000\u0000\u0371"+
		"\u0372\n\u0002\u0000\u0000\u0372\u0373\u0003\u00c2a\u0000\u0373\u0374"+
		"\u0006]\uffff\uffff\u0000\u0374\u037a\u0001\u0000\u0000\u0000\u0375\u0376"+
		"\n\u0001\u0000\u0000\u0376\u0377\u0003\u00c0`\u0000\u0377\u0378\u0006"+
		"]\uffff\uffff\u0000\u0378\u037a\u0001\u0000\u0000\u0000\u0379\u0371\u0001"+
		"\u0000\u0000\u0000\u0379\u0375\u0001\u0000\u0000\u0000\u037a\u037d\u0001"+
		"\u0000\u0000\u0000\u037b\u0379\u0001\u0000\u0000\u0000\u037b\u037c\u0001"+
		"\u0000\u0000\u0000\u037c\u00bb\u0001\u0000\u0000\u0000\u037d\u037b\u0001"+
		"\u0000\u0000\u0000\u037e\u037f\u0007\u0007\u0000\u0000\u037f\u00bd\u0001"+
		"\u0000\u0000\u0000\u0380\u0381\u0006_\uffff\uffff\u0000\u0381\u0382\u0003"+
		"\u00c0`\u0000\u0382\u038d\u0001\u0000\u0000\u0000\u0383\u0384\n\u0002"+
		"\u0000\u0000\u0384\u0385\u0003\u00c0`\u0000\u0385\u0386\u0006_\uffff\uffff"+
		"\u0000\u0386\u038c\u0001\u0000\u0000\u0000\u0387\u0388\n\u0001\u0000\u0000"+
		"\u0388\u0389\u0003\u00c2a\u0000\u0389\u038a\u0006_\uffff\uffff\u0000\u038a"+
		"\u038c\u0001\u0000\u0000\u0000\u038b\u0383\u0001\u0000\u0000\u0000\u038b"+
		"\u0387\u0001\u0000\u0000\u0000\u038c\u038f\u0001\u0000\u0000\u0000\u038d"+
		"\u038b\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e"+
		"\u00bf\u0001\u0000\u0000\u0000\u038f\u038d\u0001\u0000\u0000\u0000\u0390"+
		"\u0391\u0005\u0109\u0000\u0000\u0391\u00c1\u0001\u0000\u0000\u0000\u0392"+
		"\u0393\u0005\u010a\u0000\u0000\u0393\u00c3\u0001\u0000\u0000\u0000\u0394"+
		"\u0395\u0003\u00d2i\u0000\u0395\u00c5\u0001\u0000\u0000\u0000\u0396\u0397"+
		"\u0003\u00d2i\u0000\u0397\u00c7\u0001\u0000\u0000\u0000\u0398\u0399\u0007"+
		"\b\u0000\u0000\u0399\u00c9\u0001\u0000\u0000\u0000\u039a\u039b\u0003\u00c8"+
		"d\u0000\u039b\u00cb\u0001\u0000\u0000\u0000\u039c\u039d\u0003\u00c8d\u0000"+
		"\u039d\u00cd\u0001\u0000\u0000\u0000\u039e\u039f\u0003\u00c8d\u0000\u039f"+
		"\u00cf\u0001\u0000\u0000\u0000\u03a0\u03a1\u0003\u00c8d\u0000\u03a1\u00d1"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a5\u0003\u00d4j\u0000\u03a3\u03a5\u0003"+
		"\u00d6k\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a4\u03a3\u0001\u0000"+
		"\u0000\u0000\u03a5\u00d3\u0001\u0000\u0000\u0000\u03a6\u03a7\u0005\u0107"+
		"\u0000\u0000\u03a7\u00d5\u0001\u0000\u0000\u0000\u03a8\u03a9\u0005\u0108"+
		"\u0000\u0000\u03a9\u00d7\u0001\u0000\u0000\u0000U\u00e0\u00e4\u00ec\u00f3"+
		"\u00f6\u00f9\u00ff\u0102\u0106\u0119\u011e\u0126\u012a\u012d\u0131\u0135"+
		"\u013b\u013e\u014c\u0151\u0154\u016b\u0173\u0178\u0189\u0190\u0195\u019c"+
		"\u01a0\u01a5\u01ac\u01b8\u01c0\u01c5\u01c7\u01d2\u01d4\u01db\u01de\u01e3"+
		"\u01e5\u01ea\u01ed\u01f2\u01f7\u01fc\u01ff\u0203\u0212\u0217\u021b\u0220"+
		"\u0224\u0227\u0238\u0240\u0245\u024a\u0262\u026a\u0271\u0276\u02a1\u02a9"+
		"\u02b4\u02bb\u02c7\u02ca\u02d2\u02d9\u02e6\u02f1\u02fa\u0302\u0320\u032d"+
		"\u0332\u033c\u0341\u0345\u0379\u037b\u038b\u038d\u03a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}