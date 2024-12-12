// Code generated from GoogleSQLParser.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // GoogleSQLParser
import "github.com/antlr4-go/antlr/v4"

// GoogleSQLParserListener is a complete listener for a parse tree produced by GoogleSQLParser.
type GoogleSQLParserListener interface {
	antlr.ParseTreeListener

	// EnterRoot is called when entering the root production.
	EnterRoot(c *RootContext)

	// EnterStmts is called when entering the stmts production.
	EnterStmts(c *StmtsContext)

	// EnterStmt is called when entering the stmt production.
	EnterStmt(c *StmtContext)

	// EnterStatement_level_hint is called when entering the statement_level_hint production.
	EnterStatement_level_hint(c *Statement_level_hintContext)

	// EnterQuery_statement is called when entering the query_statement production.
	EnterQuery_statement(c *Query_statementContext)

	// EnterDml_statement is called when entering the dml_statement production.
	EnterDml_statement(c *Dml_statementContext)

	// EnterInsert_statement is called when entering the insert_statement production.
	EnterInsert_statement(c *Insert_statementContext)

	// EnterOpt_returning_clause is called when entering the opt_returning_clause production.
	EnterOpt_returning_clause(c *Opt_returning_clauseContext)

	// EnterOpt_assert_rows_modified is called when entering the opt_assert_rows_modified production.
	EnterOpt_assert_rows_modified(c *Opt_assert_rows_modifiedContext)

	// EnterInsert_values_or_query is called when entering the insert_values_or_query production.
	EnterInsert_values_or_query(c *Insert_values_or_queryContext)

	// EnterInsert_values_list is called when entering the insert_values_list production.
	EnterInsert_values_list(c *Insert_values_listContext)

	// EnterInsert_values_row is called when entering the insert_values_row production.
	EnterInsert_values_row(c *Insert_values_rowContext)

	// EnterExpression_or_default is called when entering the expression_or_default production.
	EnterExpression_or_default(c *Expression_or_defaultContext)

	// EnterInsert_statement_prefix is called when entering the insert_statement_prefix production.
	EnterInsert_statement_prefix(c *Insert_statement_prefixContext)

	// EnterMaybe_dashed_generalized_path_expression is called when entering the maybe_dashed_generalized_path_expression production.
	EnterMaybe_dashed_generalized_path_expression(c *Maybe_dashed_generalized_path_expressionContext)

	// EnterOpt_into is called when entering the opt_into production.
	EnterOpt_into(c *Opt_intoContext)

	// EnterOpt_or_ignore_replace_update is called when entering the opt_or_ignore_replace_update production.
	EnterOpt_or_ignore_replace_update(c *Opt_or_ignore_replace_updateContext)

	// EnterAlter_statement is called when entering the alter_statement production.
	EnterAlter_statement(c *Alter_statementContext)

	// EnterAnalyze_statement is called when entering the analyze_statement production.
	EnterAnalyze_statement(c *Analyze_statementContext)

	// EnterAssert_statement is called when entering the assert_statement production.
	EnterAssert_statement(c *Assert_statementContext)

	// EnterAux_load_data_statement is called when entering the aux_load_data_statement production.
	EnterAux_load_data_statement(c *Aux_load_data_statementContext)

	// EnterClone_data_statement is called when entering the clone_data_statement production.
	EnterClone_data_statement(c *Clone_data_statementContext)

	// EnterClone_data_source_list is called when entering the clone_data_source_list production.
	EnterClone_data_source_list(c *Clone_data_source_listContext)

	// EnterClone_data_source is called when entering the clone_data_source production.
	EnterClone_data_source(c *Clone_data_sourceContext)

	// EnterOpt_external_table_with_clauses is called when entering the opt_external_table_with_clauses production.
	EnterOpt_external_table_with_clauses(c *Opt_external_table_with_clausesContext)

	// EnterWith_connection_clause is called when entering the with_connection_clause production.
	EnterWith_connection_clause(c *With_connection_clauseContext)

	// EnterWith_partition_columns_clause is called when entering the with_partition_columns_clause production.
	EnterWith_partition_columns_clause(c *With_partition_columns_clauseContext)

	// EnterAux_load_data_from_files_options_list is called when entering the aux_load_data_from_files_options_list production.
	EnterAux_load_data_from_files_options_list(c *Aux_load_data_from_files_options_listContext)

	// EnterCluster_by_clause_prefix_no_hint is called when entering the cluster_by_clause_prefix_no_hint production.
	EnterCluster_by_clause_prefix_no_hint(c *Cluster_by_clause_prefix_no_hintContext)

	// EnterLoad_data_partitions_clause is called when entering the load_data_partitions_clause production.
	EnterLoad_data_partitions_clause(c *Load_data_partitions_clauseContext)

	// EnterMaybe_dashed_path_expression_with_scope is called when entering the maybe_dashed_path_expression_with_scope production.
	EnterMaybe_dashed_path_expression_with_scope(c *Maybe_dashed_path_expression_with_scopeContext)

	// EnterTable_element_list is called when entering the table_element_list production.
	EnterTable_element_list(c *Table_element_listContext)

	// EnterTable_element is called when entering the table_element production.
	EnterTable_element(c *Table_elementContext)

	// EnterTable_constraint_definition is called when entering the table_constraint_definition production.
	EnterTable_constraint_definition(c *Table_constraint_definitionContext)

	// EnterAppend_or_overwrite is called when entering the append_or_overwrite production.
	EnterAppend_or_overwrite(c *Append_or_overwriteContext)

	// EnterOpt_description is called when entering the opt_description production.
	EnterOpt_description(c *Opt_descriptionContext)

	// EnterTable_and_column_info_list is called when entering the table_and_column_info_list production.
	EnterTable_and_column_info_list(c *Table_and_column_info_listContext)

	// EnterTable_and_column_info is called when entering the table_and_column_info production.
	EnterTable_and_column_info(c *Table_and_column_infoContext)

	// EnterRow_access_policy_alter_action_list is called when entering the row_access_policy_alter_action_list production.
	EnterRow_access_policy_alter_action_list(c *Row_access_policy_alter_action_listContext)

	// EnterRow_access_policy_alter_action is called when entering the row_access_policy_alter_action production.
	EnterRow_access_policy_alter_action(c *Row_access_policy_alter_actionContext)

	// EnterGrant_to_clause is called when entering the grant_to_clause production.
	EnterGrant_to_clause(c *Grant_to_clauseContext)

	// EnterGrantee_list is called when entering the grantee_list production.
	EnterGrantee_list(c *Grantee_listContext)

	// EnterPrivilege_list is called when entering the privilege_list production.
	EnterPrivilege_list(c *Privilege_listContext)

	// EnterPrivilege is called when entering the privilege production.
	EnterPrivilege(c *PrivilegeContext)

	// EnterPath_expression_list_with_parens is called when entering the path_expression_list_with_parens production.
	EnterPath_expression_list_with_parens(c *Path_expression_list_with_parensContext)

	// EnterPrivilege_name is called when entering the privilege_name production.
	EnterPrivilege_name(c *Privilege_nameContext)

	// EnterGeneric_entity_type is called when entering the generic_entity_type production.
	EnterGeneric_entity_type(c *Generic_entity_typeContext)

	// EnterGeneric_entity_type_unchecked is called when entering the generic_entity_type_unchecked production.
	EnterGeneric_entity_type_unchecked(c *Generic_entity_type_uncheckedContext)

	// EnterSchema_object_kind is called when entering the schema_object_kind production.
	EnterSchema_object_kind(c *Schema_object_kindContext)

	// EnterAlter_action_list is called when entering the alter_action_list production.
	EnterAlter_action_list(c *Alter_action_listContext)

	// EnterAlter_action is called when entering the alter_action production.
	EnterAlter_action(c *Alter_actionContext)

	// EnterSpanner_set_on_delete_action is called when entering the spanner_set_on_delete_action production.
	EnterSpanner_set_on_delete_action(c *Spanner_set_on_delete_actionContext)

	// EnterSpanner_alter_column_action is called when entering the spanner_alter_column_action production.
	EnterSpanner_alter_column_action(c *Spanner_alter_column_actionContext)

	// EnterSpanner_generated_or_default is called when entering the spanner_generated_or_default production.
	EnterSpanner_generated_or_default(c *Spanner_generated_or_defaultContext)

	// EnterGeneric_sub_entity_type is called when entering the generic_sub_entity_type production.
	EnterGeneric_sub_entity_type(c *Generic_sub_entity_typeContext)

	// EnterSub_entity_type_identifier is called when entering the sub_entity_type_identifier production.
	EnterSub_entity_type_identifier(c *Sub_entity_type_identifierContext)

	// EnterFill_using_expression is called when entering the fill_using_expression production.
	EnterFill_using_expression(c *Fill_using_expressionContext)

	// EnterColumn_position is called when entering the column_position production.
	EnterColumn_position(c *Column_positionContext)

	// EnterTable_column_definition is called when entering the table_column_definition production.
	EnterTable_column_definition(c *Table_column_definitionContext)

	// EnterColumn_attributes is called when entering the column_attributes production.
	EnterColumn_attributes(c *Column_attributesContext)

	// EnterColumn_attribute is called when entering the column_attribute production.
	EnterColumn_attribute(c *Column_attributeContext)

	// EnterPrimary_key_column_attribute is called when entering the primary_key_column_attribute production.
	EnterPrimary_key_column_attribute(c *Primary_key_column_attributeContext)

	// EnterForeign_key_column_attribute is called when entering the foreign_key_column_attribute production.
	EnterForeign_key_column_attribute(c *Foreign_key_column_attributeContext)

	// EnterHidden_column_attribute is called when entering the hidden_column_attribute production.
	EnterHidden_column_attribute(c *Hidden_column_attributeContext)

	// EnterOpt_constraint_identity is called when entering the opt_constraint_identity production.
	EnterOpt_constraint_identity(c *Opt_constraint_identityContext)

	// EnterTable_column_schema is called when entering the table_column_schema production.
	EnterTable_column_schema(c *Table_column_schemaContext)

	// EnterOpt_column_info is called when entering the opt_column_info production.
	EnterOpt_column_info(c *Opt_column_infoContext)

	// EnterInvalid_generated_column is called when entering the invalid_generated_column production.
	EnterInvalid_generated_column(c *Invalid_generated_columnContext)

	// EnterInvalid_default_column is called when entering the invalid_default_column production.
	EnterInvalid_default_column(c *Invalid_default_columnContext)

	// EnterDefault_column_info is called when entering the default_column_info production.
	EnterDefault_column_info(c *Default_column_infoContext)

	// EnterGenerated_column_info is called when entering the generated_column_info production.
	EnterGenerated_column_info(c *Generated_column_infoContext)

	// EnterIdentity_column_info is called when entering the identity_column_info production.
	EnterIdentity_column_info(c *Identity_column_infoContext)

	// EnterOpt_start_with is called when entering the opt_start_with production.
	EnterOpt_start_with(c *Opt_start_withContext)

	// EnterOpt_increment_by is called when entering the opt_increment_by production.
	EnterOpt_increment_by(c *Opt_increment_byContext)

	// EnterOpt_maxvalue is called when entering the opt_maxvalue production.
	EnterOpt_maxvalue(c *Opt_maxvalueContext)

	// EnterOpt_minvalue is called when entering the opt_minvalue production.
	EnterOpt_minvalue(c *Opt_minvalueContext)

	// EnterOpt_cycle is called when entering the opt_cycle production.
	EnterOpt_cycle(c *Opt_cycleContext)

	// EnterSigned_numeric_literal is called when entering the signed_numeric_literal production.
	EnterSigned_numeric_literal(c *Signed_numeric_literalContext)

	// EnterStored_mode is called when entering the stored_mode production.
	EnterStored_mode(c *Stored_modeContext)

	// EnterGenerated_mode is called when entering the generated_mode production.
	EnterGenerated_mode(c *Generated_modeContext)

	// EnterColumn_schema_inner is called when entering the column_schema_inner production.
	EnterColumn_schema_inner(c *Column_schema_innerContext)

	// EnterRaw_column_schema_inner is called when entering the raw_column_schema_inner production.
	EnterRaw_column_schema_inner(c *Raw_column_schema_innerContext)

	// EnterRange_column_schema_inner is called when entering the range_column_schema_inner production.
	EnterRange_column_schema_inner(c *Range_column_schema_innerContext)

	// EnterStruct_column_schema_inner is called when entering the struct_column_schema_inner production.
	EnterStruct_column_schema_inner(c *Struct_column_schema_innerContext)

	// EnterStruct_column_field is called when entering the struct_column_field production.
	EnterStruct_column_field(c *Struct_column_fieldContext)

	// EnterSimple_column_schema_inner is called when entering the simple_column_schema_inner production.
	EnterSimple_column_schema_inner(c *Simple_column_schema_innerContext)

	// EnterArray_column_schema_inner is called when entering the array_column_schema_inner production.
	EnterArray_column_schema_inner(c *Array_column_schema_innerContext)

	// EnterField_schema is called when entering the field_schema production.
	EnterField_schema(c *Field_schemaContext)

	// EnterOpt_field_attributes is called when entering the opt_field_attributes production.
	EnterOpt_field_attributes(c *Opt_field_attributesContext)

	// EnterNot_null_column_attribute is called when entering the not_null_column_attribute production.
	EnterNot_null_column_attribute(c *Not_null_column_attributeContext)

	// EnterPrimary_key_or_table_constraint_spec is called when entering the primary_key_or_table_constraint_spec production.
	EnterPrimary_key_or_table_constraint_spec(c *Primary_key_or_table_constraint_specContext)

	// EnterOpt_if_not_exists is called when entering the opt_if_not_exists production.
	EnterOpt_if_not_exists(c *Opt_if_not_existsContext)

	// EnterPrimary_key_spec is called when entering the primary_key_spec production.
	EnterPrimary_key_spec(c *Primary_key_specContext)

	// EnterPrimary_key_element_list is called when entering the primary_key_element_list production.
	EnterPrimary_key_element_list(c *Primary_key_element_listContext)

	// EnterPrimary_key_element is called when entering the primary_key_element production.
	EnterPrimary_key_element(c *Primary_key_elementContext)

	// EnterTable_constraint_spec is called when entering the table_constraint_spec production.
	EnterTable_constraint_spec(c *Table_constraint_specContext)

	// EnterForeign_key_reference is called when entering the foreign_key_reference production.
	EnterForeign_key_reference(c *Foreign_key_referenceContext)

	// EnterOpt_foreign_key_action is called when entering the opt_foreign_key_action production.
	EnterOpt_foreign_key_action(c *Opt_foreign_key_actionContext)

	// EnterForeign_key_on_update is called when entering the foreign_key_on_update production.
	EnterForeign_key_on_update(c *Foreign_key_on_updateContext)

	// EnterForeign_key_on_delete is called when entering the foreign_key_on_delete production.
	EnterForeign_key_on_delete(c *Foreign_key_on_deleteContext)

	// EnterForeign_key_action is called when entering the foreign_key_action production.
	EnterForeign_key_action(c *Foreign_key_actionContext)

	// EnterOpt_foreign_key_match is called when entering the opt_foreign_key_match production.
	EnterOpt_foreign_key_match(c *Opt_foreign_key_matchContext)

	// EnterForeign_key_match_mode is called when entering the foreign_key_match_mode production.
	EnterForeign_key_match_mode(c *Foreign_key_match_modeContext)

	// EnterColumn_list is called when entering the column_list production.
	EnterColumn_list(c *Column_listContext)

	// EnterOpt_options_list is called when entering the opt_options_list production.
	EnterOpt_options_list(c *Opt_options_listContext)

	// EnterConstraint_enforcement is called when entering the constraint_enforcement production.
	EnterConstraint_enforcement(c *Constraint_enforcementContext)

	// EnterGeneric_entity_body is called when entering the generic_entity_body production.
	EnterGeneric_entity_body(c *Generic_entity_bodyContext)

	// EnterOpt_if_exists is called when entering the opt_if_exists production.
	EnterOpt_if_exists(c *Opt_if_existsContext)

	// EnterTable_or_table_function is called when entering the table_or_table_function production.
	EnterTable_or_table_function(c *Table_or_table_functionContext)

	// EnterQuery is called when entering the query production.
	EnterQuery(c *QueryContext)

	// EnterQuery_without_pipe_operators is called when entering the query_without_pipe_operators production.
	EnterQuery_without_pipe_operators(c *Query_without_pipe_operatorsContext)

	// EnterBad_keyword_after_from_query is called when entering the bad_keyword_after_from_query production.
	EnterBad_keyword_after_from_query(c *Bad_keyword_after_from_queryContext)

	// EnterBad_keyword_after_from_query_allows_parens is called when entering the bad_keyword_after_from_query_allows_parens production.
	EnterBad_keyword_after_from_query_allows_parens(c *Bad_keyword_after_from_query_allows_parensContext)

	// EnterWith_clause_with_trailing_comma is called when entering the with_clause_with_trailing_comma production.
	EnterWith_clause_with_trailing_comma(c *With_clause_with_trailing_commaContext)

	// EnterSelect_or_from_keyword is called when entering the select_or_from_keyword production.
	EnterSelect_or_from_keyword(c *Select_or_from_keywordContext)

	// EnterQuery_primary_or_set_operation is called when entering the query_primary_or_set_operation production.
	EnterQuery_primary_or_set_operation(c *Query_primary_or_set_operationContext)

	// EnterQuery_set_operation is called when entering the query_set_operation production.
	EnterQuery_set_operation(c *Query_set_operationContext)

	// EnterQuery_set_operation_prefix is called when entering the query_set_operation_prefix production.
	EnterQuery_set_operation_prefix(c *Query_set_operation_prefixContext)

	// EnterQuery_set_operation_item is called when entering the query_set_operation_item production.
	EnterQuery_set_operation_item(c *Query_set_operation_itemContext)

	// EnterQuery_primary is called when entering the query_primary production.
	EnterQuery_primary(c *Query_primaryContext)

	// EnterSet_operation_metadata is called when entering the set_operation_metadata production.
	EnterSet_operation_metadata(c *Set_operation_metadataContext)

	// EnterOpt_column_match_suffix is called when entering the opt_column_match_suffix production.
	EnterOpt_column_match_suffix(c *Opt_column_match_suffixContext)

	// EnterOpt_strict is called when entering the opt_strict production.
	EnterOpt_strict(c *Opt_strictContext)

	// EnterAll_or_distinct is called when entering the all_or_distinct production.
	EnterAll_or_distinct(c *All_or_distinctContext)

	// EnterQuery_set_operation_type is called when entering the query_set_operation_type production.
	EnterQuery_set_operation_type(c *Query_set_operation_typeContext)

	// EnterOpt_corresponding_outer_mode is called when entering the opt_corresponding_outer_mode production.
	EnterOpt_corresponding_outer_mode(c *Opt_corresponding_outer_modeContext)

	// EnterOpt_outer is called when entering the opt_outer production.
	EnterOpt_outer(c *Opt_outerContext)

	// EnterWith_clause is called when entering the with_clause production.
	EnterWith_clause(c *With_clauseContext)

	// EnterAliased_query is called when entering the aliased_query production.
	EnterAliased_query(c *Aliased_queryContext)

	// EnterOpt_aliased_query_modifiers is called when entering the opt_aliased_query_modifiers production.
	EnterOpt_aliased_query_modifiers(c *Opt_aliased_query_modifiersContext)

	// EnterRecursion_depth_modifier is called when entering the recursion_depth_modifier production.
	EnterRecursion_depth_modifier(c *Recursion_depth_modifierContext)

	// EnterPossibly_unbounded_int_literal_or_parameter is called when entering the possibly_unbounded_int_literal_or_parameter production.
	EnterPossibly_unbounded_int_literal_or_parameter(c *Possibly_unbounded_int_literal_or_parameterContext)

	// EnterInt_literal_or_parameter is called when entering the int_literal_or_parameter production.
	EnterInt_literal_or_parameter(c *Int_literal_or_parameterContext)

	// EnterOrder_by_clause is called when entering the order_by_clause production.
	EnterOrder_by_clause(c *Order_by_clauseContext)

	// EnterOrder_by_clause_prefix is called when entering the order_by_clause_prefix production.
	EnterOrder_by_clause_prefix(c *Order_by_clause_prefixContext)

	// EnterOrdering_expression is called when entering the ordering_expression production.
	EnterOrdering_expression(c *Ordering_expressionContext)

	// EnterSelect is called when entering the select production.
	EnterSelect(c *SelectContext)

	// EnterOpt_clauses_following_from is called when entering the opt_clauses_following_from production.
	EnterOpt_clauses_following_from(c *Opt_clauses_following_fromContext)

	// EnterOpt_clauses_following_where is called when entering the opt_clauses_following_where production.
	EnterOpt_clauses_following_where(c *Opt_clauses_following_whereContext)

	// EnterOpt_clauses_following_group_by is called when entering the opt_clauses_following_group_by production.
	EnterOpt_clauses_following_group_by(c *Opt_clauses_following_group_byContext)

	// EnterWindow_clause is called when entering the window_clause production.
	EnterWindow_clause(c *Window_clauseContext)

	// EnterWindow_clause_prefix is called when entering the window_clause_prefix production.
	EnterWindow_clause_prefix(c *Window_clause_prefixContext)

	// EnterWindow_definition is called when entering the window_definition production.
	EnterWindow_definition(c *Window_definitionContext)

	// EnterWhere_clause is called when entering the where_clause production.
	EnterWhere_clause(c *Where_clauseContext)

	// EnterHaving_clause is called when entering the having_clause production.
	EnterHaving_clause(c *Having_clauseContext)

	// EnterGroup_by_clause is called when entering the group_by_clause production.
	EnterGroup_by_clause(c *Group_by_clauseContext)

	// EnterGroup_by_all is called when entering the group_by_all production.
	EnterGroup_by_all(c *Group_by_allContext)

	// EnterSelect_clause is called when entering the select_clause production.
	EnterSelect_clause(c *Select_clauseContext)

	// EnterOpt_select_as_clause is called when entering the opt_select_as_clause production.
	EnterOpt_select_as_clause(c *Opt_select_as_clauseContext)

	// EnterOpt_select_with is called when entering the opt_select_with production.
	EnterOpt_select_with(c *Opt_select_withContext)

	// EnterFrom_clause is called when entering the from_clause production.
	EnterFrom_clause(c *From_clauseContext)

	// EnterFrom_clause_contents is called when entering the from_clause_contents production.
	EnterFrom_clause_contents(c *From_clause_contentsContext)

	// EnterFrom_clause_contents_suffix is called when entering the from_clause_contents_suffix production.
	EnterFrom_clause_contents_suffix(c *From_clause_contents_suffixContext)

	// EnterTable_primary is called when entering the table_primary production.
	EnterTable_primary(c *Table_primaryContext)

	// EnterTvf_with_suffixes is called when entering the tvf_with_suffixes production.
	EnterTvf_with_suffixes(c *Tvf_with_suffixesContext)

	// EnterPivot_or_unpivot_clause_and_aliases is called when entering the pivot_or_unpivot_clause_and_aliases production.
	EnterPivot_or_unpivot_clause_and_aliases(c *Pivot_or_unpivot_clause_and_aliasesContext)

	// EnterAs_alias is called when entering the as_alias production.
	EnterAs_alias(c *As_aliasContext)

	// EnterSample_clause is called when entering the sample_clause production.
	EnterSample_clause(c *Sample_clauseContext)

	// EnterOpt_sample_clause_suffix is called when entering the opt_sample_clause_suffix production.
	EnterOpt_sample_clause_suffix(c *Opt_sample_clause_suffixContext)

	// EnterRepeatable_clause is called when entering the repeatable_clause production.
	EnterRepeatable_clause(c *Repeatable_clauseContext)

	// EnterPossibly_cast_int_literal_or_parameter is called when entering the possibly_cast_int_literal_or_parameter production.
	EnterPossibly_cast_int_literal_or_parameter(c *Possibly_cast_int_literal_or_parameterContext)

	// EnterCast_int_literal_or_parameter is called when entering the cast_int_literal_or_parameter production.
	EnterCast_int_literal_or_parameter(c *Cast_int_literal_or_parameterContext)

	// EnterSample_size is called when entering the sample_size production.
	EnterSample_size(c *Sample_sizeContext)

	// EnterSample_size_value is called when entering the sample_size_value production.
	EnterSample_size_value(c *Sample_size_valueContext)

	// EnterSample_size_unit is called when entering the sample_size_unit production.
	EnterSample_size_unit(c *Sample_size_unitContext)

	// EnterPartition_by_clause_prefix_no_hint is called when entering the partition_by_clause_prefix_no_hint production.
	EnterPartition_by_clause_prefix_no_hint(c *Partition_by_clause_prefix_no_hintContext)

	// EnterMatch_recognize_clause is called when entering the match_recognize_clause production.
	EnterMatch_recognize_clause(c *Match_recognize_clauseContext)

	// EnterRow_pattern_expr is called when entering the row_pattern_expr production.
	EnterRow_pattern_expr(c *Row_pattern_exprContext)

	// EnterRow_pattern_concatenation is called when entering the row_pattern_concatenation production.
	EnterRow_pattern_concatenation(c *Row_pattern_concatenationContext)

	// EnterRow_pattern_factor is called when entering the row_pattern_factor production.
	EnterRow_pattern_factor(c *Row_pattern_factorContext)

	// EnterSelect_list_prefix_with_as_aliases is called when entering the select_list_prefix_with_as_aliases production.
	EnterSelect_list_prefix_with_as_aliases(c *Select_list_prefix_with_as_aliasesContext)

	// EnterSelect_column_expr_with_as_alias is called when entering the select_column_expr_with_as_alias production.
	EnterSelect_column_expr_with_as_alias(c *Select_column_expr_with_as_aliasContext)

	// EnterTable_subquery is called when entering the table_subquery production.
	EnterTable_subquery(c *Table_subqueryContext)

	// EnterJoin is called when entering the join production.
	EnterJoin(c *JoinContext)

	// EnterJoin_item is called when entering the join_item production.
	EnterJoin_item(c *Join_itemContext)

	// EnterOn_or_using_clause_list is called when entering the on_or_using_clause_list production.
	EnterOn_or_using_clause_list(c *On_or_using_clause_listContext)

	// EnterOn_or_using_clause is called when entering the on_or_using_clause production.
	EnterOn_or_using_clause(c *On_or_using_clauseContext)

	// EnterUsing_clause is called when entering the using_clause production.
	EnterUsing_clause(c *Using_clauseContext)

	// EnterJoin_hint is called when entering the join_hint production.
	EnterJoin_hint(c *Join_hintContext)

	// EnterTable_path_expression is called when entering the table_path_expression production.
	EnterTable_path_expression(c *Table_path_expressionContext)

	// EnterOpt_at_system_time is called when entering the opt_at_system_time production.
	EnterOpt_at_system_time(c *Opt_at_system_timeContext)

	// EnterOpt_with_offset_and_alias is called when entering the opt_with_offset_and_alias production.
	EnterOpt_with_offset_and_alias(c *Opt_with_offset_and_aliasContext)

	// EnterOpt_pivot_or_unpivot_clause_and_alias is called when entering the opt_pivot_or_unpivot_clause_and_alias production.
	EnterOpt_pivot_or_unpivot_clause_and_alias(c *Opt_pivot_or_unpivot_clause_and_aliasContext)

	// EnterTable_path_expression_base is called when entering the table_path_expression_base production.
	EnterTable_path_expression_base(c *Table_path_expression_baseContext)

	// EnterMaybe_slashed_or_dashed_path_expression is called when entering the maybe_slashed_or_dashed_path_expression production.
	EnterMaybe_slashed_or_dashed_path_expression(c *Maybe_slashed_or_dashed_path_expressionContext)

	// EnterMaybe_dashed_path_expression is called when entering the maybe_dashed_path_expression production.
	EnterMaybe_dashed_path_expression(c *Maybe_dashed_path_expressionContext)

	// EnterDashed_path_expression is called when entering the dashed_path_expression production.
	EnterDashed_path_expression(c *Dashed_path_expressionContext)

	// EnterDashed_identifier is called when entering the dashed_identifier production.
	EnterDashed_identifier(c *Dashed_identifierContext)

	// EnterSlashed_identifier is called when entering the slashed_identifier production.
	EnterSlashed_identifier(c *Slashed_identifierContext)

	// EnterIdentifier_or_integer is called when entering the identifier_or_integer production.
	EnterIdentifier_or_integer(c *Identifier_or_integerContext)

	// EnterSlashed_identifier_separator is called when entering the slashed_identifier_separator production.
	EnterSlashed_identifier_separator(c *Slashed_identifier_separatorContext)

	// EnterSlashed_path_expression is called when entering the slashed_path_expression production.
	EnterSlashed_path_expression(c *Slashed_path_expressionContext)

	// EnterUnnest_expression is called when entering the unnest_expression production.
	EnterUnnest_expression(c *Unnest_expressionContext)

	// EnterUnnest_expression_prefix is called when entering the unnest_expression_prefix production.
	EnterUnnest_expression_prefix(c *Unnest_expression_prefixContext)

	// EnterOpt_array_zip_mode is called when entering the opt_array_zip_mode production.
	EnterOpt_array_zip_mode(c *Opt_array_zip_modeContext)

	// EnterExpression_with_opt_alias is called when entering the expression_with_opt_alias production.
	EnterExpression_with_opt_alias(c *Expression_with_opt_aliasContext)

	// EnterTvf_prefix is called when entering the tvf_prefix production.
	EnterTvf_prefix(c *Tvf_prefixContext)

	// EnterTvf_argument is called when entering the tvf_argument production.
	EnterTvf_argument(c *Tvf_argumentContext)

	// EnterConnection_clause is called when entering the connection_clause production.
	EnterConnection_clause(c *Connection_clauseContext)

	// EnterPath_expression_or_default is called when entering the path_expression_or_default production.
	EnterPath_expression_or_default(c *Path_expression_or_defaultContext)

	// EnterDescriptor_argument is called when entering the descriptor_argument production.
	EnterDescriptor_argument(c *Descriptor_argumentContext)

	// EnterDescriptor_column_list is called when entering the descriptor_column_list production.
	EnterDescriptor_column_list(c *Descriptor_column_listContext)

	// EnterDescriptor_column is called when entering the descriptor_column production.
	EnterDescriptor_column(c *Descriptor_columnContext)

	// EnterTable_clause is called when entering the table_clause production.
	EnterTable_clause(c *Table_clauseContext)

	// EnterModel_clause is called when entering the model_clause production.
	EnterModel_clause(c *Model_clauseContext)

	// EnterQualify_clause_nonreserved is called when entering the qualify_clause_nonreserved production.
	EnterQualify_clause_nonreserved(c *Qualify_clause_nonreservedContext)

	// EnterUnpivot_clause is called when entering the unpivot_clause production.
	EnterUnpivot_clause(c *Unpivot_clauseContext)

	// EnterUnpivot_in_item_list is called when entering the unpivot_in_item_list production.
	EnterUnpivot_in_item_list(c *Unpivot_in_item_listContext)

	// EnterUnpivot_in_item_list_prefix is called when entering the unpivot_in_item_list_prefix production.
	EnterUnpivot_in_item_list_prefix(c *Unpivot_in_item_list_prefixContext)

	// EnterUnpivot_in_item is called when entering the unpivot_in_item production.
	EnterUnpivot_in_item(c *Unpivot_in_itemContext)

	// EnterOpt_as_string_or_integer is called when entering the opt_as_string_or_integer production.
	EnterOpt_as_string_or_integer(c *Opt_as_string_or_integerContext)

	// EnterPath_expression_list_with_opt_parens is called when entering the path_expression_list_with_opt_parens production.
	EnterPath_expression_list_with_opt_parens(c *Path_expression_list_with_opt_parensContext)

	// EnterPath_expression_list is called when entering the path_expression_list production.
	EnterPath_expression_list(c *Path_expression_listContext)

	// EnterUnpivot_nulls_filter is called when entering the unpivot_nulls_filter production.
	EnterUnpivot_nulls_filter(c *Unpivot_nulls_filterContext)

	// EnterPivot_clause is called when entering the pivot_clause production.
	EnterPivot_clause(c *Pivot_clauseContext)

	// EnterPivot_expression_list is called when entering the pivot_expression_list production.
	EnterPivot_expression_list(c *Pivot_expression_listContext)

	// EnterPivot_expression is called when entering the pivot_expression production.
	EnterPivot_expression(c *Pivot_expressionContext)

	// EnterPivot_value_list is called when entering the pivot_value_list production.
	EnterPivot_value_list(c *Pivot_value_listContext)

	// EnterPivot_value is called when entering the pivot_value production.
	EnterPivot_value(c *Pivot_valueContext)

	// EnterTvf_prefix_no_args is called when entering the tvf_prefix_no_args production.
	EnterTvf_prefix_no_args(c *Tvf_prefix_no_argsContext)

	// EnterJoin_type is called when entering the join_type production.
	EnterJoin_type(c *Join_typeContext)

	// EnterOpt_natural is called when entering the opt_natural production.
	EnterOpt_natural(c *Opt_naturalContext)

	// EnterOn_clause is called when entering the on_clause production.
	EnterOn_clause(c *On_clauseContext)

	// EnterSelect_list is called when entering the select_list production.
	EnterSelect_list(c *Select_listContext)

	// EnterSelect_list_item is called when entering the select_list_item production.
	EnterSelect_list_item(c *Select_list_itemContext)

	// EnterSelect_column_star is called when entering the select_column_star production.
	EnterSelect_column_star(c *Select_column_starContext)

	// EnterSelect_column_expr is called when entering the select_column_expr production.
	EnterSelect_column_expr(c *Select_column_exprContext)

	// EnterSelect_column_dot_star is called when entering the select_column_dot_star production.
	EnterSelect_column_dot_star(c *Select_column_dot_starContext)

	// EnterStar_modifiers is called when entering the star_modifiers production.
	EnterStar_modifiers(c *Star_modifiersContext)

	// EnterStar_except_list is called when entering the star_except_list production.
	EnterStar_except_list(c *Star_except_listContext)

	// EnterStar_replace_list is called when entering the star_replace_list production.
	EnterStar_replace_list(c *Star_replace_listContext)

	// EnterStar_replace_item is called when entering the star_replace_item production.
	EnterStar_replace_item(c *Star_replace_itemContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterExpression_higher_prec_than_and is called when entering the expression_higher_prec_than_and production.
	EnterExpression_higher_prec_than_and(c *Expression_higher_prec_than_andContext)

	// EnterExpression_maybe_parenthesized_not_a_query is called when entering the expression_maybe_parenthesized_not_a_query production.
	EnterExpression_maybe_parenthesized_not_a_query(c *Expression_maybe_parenthesized_not_a_queryContext)

	// EnterParenthesized_in_rhs is called when entering the parenthesized_in_rhs production.
	EnterParenthesized_in_rhs(c *Parenthesized_in_rhsContext)

	// EnterUnary_operator is called when entering the unary_operator production.
	EnterUnary_operator(c *Unary_operatorContext)

	// EnterComparative_operator is called when entering the comparative_operator production.
	EnterComparative_operator(c *Comparative_operatorContext)

	// EnterShift_operator is called when entering the shift_operator production.
	EnterShift_operator(c *Shift_operatorContext)

	// EnterAdditive_operator is called when entering the additive_operator production.
	EnterAdditive_operator(c *Additive_operatorContext)

	// EnterMultiplicative_operator is called when entering the multiplicative_operator production.
	EnterMultiplicative_operator(c *Multiplicative_operatorContext)

	// EnterIs_operator is called when entering the is_operator production.
	EnterIs_operator(c *Is_operatorContext)

	// EnterBetween_operator is called when entering the between_operator production.
	EnterBetween_operator(c *Between_operatorContext)

	// EnterIn_operator is called when entering the in_operator production.
	EnterIn_operator(c *In_operatorContext)

	// EnterDistinct_operator is called when entering the distinct_operator production.
	EnterDistinct_operator(c *Distinct_operatorContext)

	// EnterParenthesized_query is called when entering the parenthesized_query production.
	EnterParenthesized_query(c *Parenthesized_queryContext)

	// EnterParenthesized_expression_not_a_query is called when entering the parenthesized_expression_not_a_query production.
	EnterParenthesized_expression_not_a_query(c *Parenthesized_expression_not_a_queryContext)

	// EnterParenthesized_anysomeall_list_in_rhs is called when entering the parenthesized_anysomeall_list_in_rhs production.
	EnterParenthesized_anysomeall_list_in_rhs(c *Parenthesized_anysomeall_list_in_rhsContext)

	// EnterAnd_expression is called when entering the and_expression production.
	EnterAnd_expression(c *And_expressionContext)

	// EnterIn_list_two_or_more_prefix is called when entering the in_list_two_or_more_prefix production.
	EnterIn_list_two_or_more_prefix(c *In_list_two_or_more_prefixContext)

	// EnterAny_some_all is called when entering the any_some_all production.
	EnterAny_some_all(c *Any_some_allContext)

	// EnterLike_operator is called when entering the like_operator production.
	EnterLike_operator(c *Like_operatorContext)

	// EnterExpression_subquery_with_keyword is called when entering the expression_subquery_with_keyword production.
	EnterExpression_subquery_with_keyword(c *Expression_subquery_with_keywordContext)

	// EnterStruct_constructor is called when entering the struct_constructor production.
	EnterStruct_constructor(c *Struct_constructorContext)

	// EnterStruct_constructor_prefix_with_keyword is called when entering the struct_constructor_prefix_with_keyword production.
	EnterStruct_constructor_prefix_with_keyword(c *Struct_constructor_prefix_with_keywordContext)

	// EnterStruct_constructor_arg is called when entering the struct_constructor_arg production.
	EnterStruct_constructor_arg(c *Struct_constructor_argContext)

	// EnterStruct_constructor_prefix_without_keyword is called when entering the struct_constructor_prefix_without_keyword production.
	EnterStruct_constructor_prefix_without_keyword(c *Struct_constructor_prefix_without_keywordContext)

	// EnterStruct_constructor_prefix_with_keyword_no_arg is called when entering the struct_constructor_prefix_with_keyword_no_arg production.
	EnterStruct_constructor_prefix_with_keyword_no_arg(c *Struct_constructor_prefix_with_keyword_no_argContext)

	// EnterInterval_expression is called when entering the interval_expression production.
	EnterInterval_expression(c *Interval_expressionContext)

	// EnterFunction_call_expression_with_clauses is called when entering the function_call_expression_with_clauses production.
	EnterFunction_call_expression_with_clauses(c *Function_call_expression_with_clausesContext)

	// EnterFunction_call_expression_with_clauses_suffix is called when entering the function_call_expression_with_clauses_suffix production.
	EnterFunction_call_expression_with_clauses_suffix(c *Function_call_expression_with_clauses_suffixContext)

	// EnterOver_clause is called when entering the over_clause production.
	EnterOver_clause(c *Over_clauseContext)

	// EnterWindow_specification is called when entering the window_specification production.
	EnterWindow_specification(c *Window_specificationContext)

	// EnterOpt_window_frame_clause is called when entering the opt_window_frame_clause production.
	EnterOpt_window_frame_clause(c *Opt_window_frame_clauseContext)

	// EnterWindow_frame_bound is called when entering the window_frame_bound production.
	EnterWindow_frame_bound(c *Window_frame_boundContext)

	// EnterPreceding_or_following is called when entering the preceding_or_following production.
	EnterPreceding_or_following(c *Preceding_or_followingContext)

	// EnterFrame_unit is called when entering the frame_unit production.
	EnterFrame_unit(c *Frame_unitContext)

	// EnterPartition_by_clause is called when entering the partition_by_clause production.
	EnterPartition_by_clause(c *Partition_by_clauseContext)

	// EnterPartition_by_clause_prefix is called when entering the partition_by_clause_prefix production.
	EnterPartition_by_clause_prefix(c *Partition_by_clause_prefixContext)

	// EnterWith_group_rows is called when entering the with_group_rows production.
	EnterWith_group_rows(c *With_group_rowsContext)

	// EnterWith_report_modifier is called when entering the with_report_modifier production.
	EnterWith_report_modifier(c *With_report_modifierContext)

	// EnterClamped_between_modifier is called when entering the clamped_between_modifier production.
	EnterClamped_between_modifier(c *Clamped_between_modifierContext)

	// EnterWith_report_format is called when entering the with_report_format production.
	EnterWith_report_format(c *With_report_formatContext)

	// EnterOptions_list is called when entering the options_list production.
	EnterOptions_list(c *Options_listContext)

	// EnterOptions_list_prefix is called when entering the options_list_prefix production.
	EnterOptions_list_prefix(c *Options_list_prefixContext)

	// EnterOptions_entry is called when entering the options_entry production.
	EnterOptions_entry(c *Options_entryContext)

	// EnterExpression_or_proto is called when entering the expression_or_proto production.
	EnterExpression_or_proto(c *Expression_or_protoContext)

	// EnterOptions_assignment_operator is called when entering the options_assignment_operator production.
	EnterOptions_assignment_operator(c *Options_assignment_operatorContext)

	// EnterOpt_null_handling_modifier is called when entering the opt_null_handling_modifier production.
	EnterOpt_null_handling_modifier(c *Opt_null_handling_modifierContext)

	// EnterFunction_call_argument is called when entering the function_call_argument production.
	EnterFunction_call_argument(c *Function_call_argumentContext)

	// EnterSequence_arg is called when entering the sequence_arg production.
	EnterSequence_arg(c *Sequence_argContext)

	// EnterNamed_argument is called when entering the named_argument production.
	EnterNamed_argument(c *Named_argumentContext)

	// EnterLambda_argument is called when entering the lambda_argument production.
	EnterLambda_argument(c *Lambda_argumentContext)

	// EnterLambda_argument_list is called when entering the lambda_argument_list production.
	EnterLambda_argument_list(c *Lambda_argument_listContext)

	// EnterLimit_offset_clause is called when entering the limit_offset_clause production.
	EnterLimit_offset_clause(c *Limit_offset_clauseContext)

	// EnterOpt_having_or_group_by_modifier is called when entering the opt_having_or_group_by_modifier production.
	EnterOpt_having_or_group_by_modifier(c *Opt_having_or_group_by_modifierContext)

	// EnterGroup_by_clause_prefix is called when entering the group_by_clause_prefix production.
	EnterGroup_by_clause_prefix(c *Group_by_clause_prefixContext)

	// EnterGroup_by_preamble is called when entering the group_by_preamble production.
	EnterGroup_by_preamble(c *Group_by_preambleContext)

	// EnterOpt_and_order is called when entering the opt_and_order production.
	EnterOpt_and_order(c *Opt_and_orderContext)

	// EnterHint is called when entering the hint production.
	EnterHint(c *HintContext)

	// EnterHint_with_body is called when entering the hint_with_body production.
	EnterHint_with_body(c *Hint_with_bodyContext)

	// EnterHint_with_body_prefix is called when entering the hint_with_body_prefix production.
	EnterHint_with_body_prefix(c *Hint_with_body_prefixContext)

	// EnterHint_entry is called when entering the hint_entry production.
	EnterHint_entry(c *Hint_entryContext)

	// EnterIdentifier_in_hints is called when entering the identifier_in_hints production.
	EnterIdentifier_in_hints(c *Identifier_in_hintsContext)

	// EnterExtra_identifier_in_hints_name is called when entering the extra_identifier_in_hints_name production.
	EnterExtra_identifier_in_hints_name(c *Extra_identifier_in_hints_nameContext)

	// EnterGrouping_item is called when entering the grouping_item production.
	EnterGrouping_item(c *Grouping_itemContext)

	// EnterGrouping_set_list is called when entering the grouping_set_list production.
	EnterGrouping_set_list(c *Grouping_set_listContext)

	// EnterGrouping_set is called when entering the grouping_set production.
	EnterGrouping_set(c *Grouping_setContext)

	// EnterCube_list is called when entering the cube_list production.
	EnterCube_list(c *Cube_listContext)

	// EnterRollup_list is called when entering the rollup_list production.
	EnterRollup_list(c *Rollup_listContext)

	// EnterOpt_as_alias_with_required_as is called when entering the opt_as_alias_with_required_as production.
	EnterOpt_as_alias_with_required_as(c *Opt_as_alias_with_required_asContext)

	// EnterOpt_grouping_item_order is called when entering the opt_grouping_item_order production.
	EnterOpt_grouping_item_order(c *Opt_grouping_item_orderContext)

	// EnterOpt_selection_item_order is called when entering the opt_selection_item_order production.
	EnterOpt_selection_item_order(c *Opt_selection_item_orderContext)

	// EnterAsc_or_desc is called when entering the asc_or_desc production.
	EnterAsc_or_desc(c *Asc_or_descContext)

	// EnterNull_order is called when entering the null_order production.
	EnterNull_order(c *Null_orderContext)

	// EnterFunction_name_from_keyword is called when entering the function_name_from_keyword production.
	EnterFunction_name_from_keyword(c *Function_name_from_keywordContext)

	// EnterReplace_fields_expression is called when entering the replace_fields_expression production.
	EnterReplace_fields_expression(c *Replace_fields_expressionContext)

	// EnterReplace_fields_prefix is called when entering the replace_fields_prefix production.
	EnterReplace_fields_prefix(c *Replace_fields_prefixContext)

	// EnterReplace_fields_arg is called when entering the replace_fields_arg production.
	EnterReplace_fields_arg(c *Replace_fields_argContext)

	// EnterGeneralized_path_expression is called when entering the generalized_path_expression production.
	EnterGeneralized_path_expression(c *Generalized_path_expressionContext)

	// EnterGeneralized_extension_path is called when entering the generalized_extension_path production.
	EnterGeneralized_extension_path(c *Generalized_extension_pathContext)

	// EnterWith_expression is called when entering the with_expression production.
	EnterWith_expression(c *With_expressionContext)

	// EnterWith_expression_variable_prefix is called when entering the with_expression_variable_prefix production.
	EnterWith_expression_variable_prefix(c *With_expression_variable_prefixContext)

	// EnterWith_expression_variable is called when entering the with_expression_variable production.
	EnterWith_expression_variable(c *With_expression_variableContext)

	// EnterExtract_expression is called when entering the extract_expression production.
	EnterExtract_expression(c *Extract_expressionContext)

	// EnterExtract_expression_base is called when entering the extract_expression_base production.
	EnterExtract_expression_base(c *Extract_expression_baseContext)

	// EnterOpt_format is called when entering the opt_format production.
	EnterOpt_format(c *Opt_formatContext)

	// EnterOpt_at_time_zone is called when entering the opt_at_time_zone production.
	EnterOpt_at_time_zone(c *Opt_at_time_zoneContext)

	// EnterCast_expression is called when entering the cast_expression production.
	EnterCast_expression(c *Cast_expressionContext)

	// EnterCase_expression is called when entering the case_expression production.
	EnterCase_expression(c *Case_expressionContext)

	// EnterCase_expression_prefix is called when entering the case_expression_prefix production.
	EnterCase_expression_prefix(c *Case_expression_prefixContext)

	// EnterCase_value_expression_prefix is called when entering the case_value_expression_prefix production.
	EnterCase_value_expression_prefix(c *Case_value_expression_prefixContext)

	// EnterCase_no_value_expression_prefix is called when entering the case_no_value_expression_prefix production.
	EnterCase_no_value_expression_prefix(c *Case_no_value_expression_prefixContext)

	// EnterStruct_braced_constructor is called when entering the struct_braced_constructor production.
	EnterStruct_braced_constructor(c *Struct_braced_constructorContext)

	// EnterBraced_new_constructor is called when entering the braced_new_constructor production.
	EnterBraced_new_constructor(c *Braced_new_constructorContext)

	// EnterBraced_constructor is called when entering the braced_constructor production.
	EnterBraced_constructor(c *Braced_constructorContext)

	// EnterBraced_constructor_start is called when entering the braced_constructor_start production.
	EnterBraced_constructor_start(c *Braced_constructor_startContext)

	// EnterBraced_constructor_prefix is called when entering the braced_constructor_prefix production.
	EnterBraced_constructor_prefix(c *Braced_constructor_prefixContext)

	// EnterBraced_constructor_field is called when entering the braced_constructor_field production.
	EnterBraced_constructor_field(c *Braced_constructor_fieldContext)

	// EnterBraced_constructor_lhs is called when entering the braced_constructor_lhs production.
	EnterBraced_constructor_lhs(c *Braced_constructor_lhsContext)

	// EnterBraced_constructor_field_value is called when entering the braced_constructor_field_value production.
	EnterBraced_constructor_field_value(c *Braced_constructor_field_valueContext)

	// EnterBraced_constructor_extension is called when entering the braced_constructor_extension production.
	EnterBraced_constructor_extension(c *Braced_constructor_extensionContext)

	// EnterNew_constructor is called when entering the new_constructor production.
	EnterNew_constructor(c *New_constructorContext)

	// EnterNew_constructor_prefix is called when entering the new_constructor_prefix production.
	EnterNew_constructor_prefix(c *New_constructor_prefixContext)

	// EnterNew_constructor_prefix_no_arg is called when entering the new_constructor_prefix_no_arg production.
	EnterNew_constructor_prefix_no_arg(c *New_constructor_prefix_no_argContext)

	// EnterNew_constructor_arg is called when entering the new_constructor_arg production.
	EnterNew_constructor_arg(c *New_constructor_argContext)

	// EnterArray_constructor is called when entering the array_constructor production.
	EnterArray_constructor(c *Array_constructorContext)

	// EnterArray_constructor_prefix is called when entering the array_constructor_prefix production.
	EnterArray_constructor_prefix(c *Array_constructor_prefixContext)

	// EnterArray_constructor_prefix_no_expressions is called when entering the array_constructor_prefix_no_expressions production.
	EnterArray_constructor_prefix_no_expressions(c *Array_constructor_prefix_no_expressionsContext)

	// EnterRange_literal is called when entering the range_literal production.
	EnterRange_literal(c *Range_literalContext)

	// EnterRange_type is called when entering the range_type production.
	EnterRange_type(c *Range_typeContext)

	// EnterType is called when entering the type production.
	EnterType(c *TypeContext)

	// EnterCollate_clause is called when entering the collate_clause production.
	EnterCollate_clause(c *Collate_clauseContext)

	// EnterString_literal_or_parameter is called when entering the string_literal_or_parameter production.
	EnterString_literal_or_parameter(c *String_literal_or_parameterContext)

	// EnterSystem_variable_expression is called when entering the system_variable_expression production.
	EnterSystem_variable_expression(c *System_variable_expressionContext)

	// EnterParameter_expression is called when entering the parameter_expression production.
	EnterParameter_expression(c *Parameter_expressionContext)

	// EnterNamed_parameter_expression is called when entering the named_parameter_expression production.
	EnterNamed_parameter_expression(c *Named_parameter_expressionContext)

	// EnterOpt_type_parameters is called when entering the opt_type_parameters production.
	EnterOpt_type_parameters(c *Opt_type_parametersContext)

	// EnterType_parameters_prefix is called when entering the type_parameters_prefix production.
	EnterType_parameters_prefix(c *Type_parameters_prefixContext)

	// EnterType_parameter is called when entering the type_parameter production.
	EnterType_parameter(c *Type_parameterContext)

	// EnterRaw_type is called when entering the raw_type production.
	EnterRaw_type(c *Raw_typeContext)

	// EnterMap_type is called when entering the map_type production.
	EnterMap_type(c *Map_typeContext)

	// EnterFunction_type is called when entering the function_type production.
	EnterFunction_type(c *Function_typeContext)

	// EnterFunction_type_prefix is called when entering the function_type_prefix production.
	EnterFunction_type_prefix(c *Function_type_prefixContext)

	// EnterType_name is called when entering the type_name production.
	EnterType_name(c *Type_nameContext)

	// EnterPath_expression is called when entering the path_expression production.
	EnterPath_expression(c *Path_expressionContext)

	// EnterIdentifier is called when entering the identifier production.
	EnterIdentifier(c *IdentifierContext)

	// EnterKeyword_as_identifier is called when entering the keyword_as_identifier production.
	EnterKeyword_as_identifier(c *Keyword_as_identifierContext)

	// EnterCommon_keyword_as_identifier is called when entering the common_keyword_as_identifier production.
	EnterCommon_keyword_as_identifier(c *Common_keyword_as_identifierContext)

	// EnterToken_identifier is called when entering the token_identifier production.
	EnterToken_identifier(c *Token_identifierContext)

	// EnterStruct_type is called when entering the struct_type production.
	EnterStruct_type(c *Struct_typeContext)

	// EnterStruct_type_prefix is called when entering the struct_type_prefix production.
	EnterStruct_type_prefix(c *Struct_type_prefixContext)

	// EnterStruct_field is called when entering the struct_field production.
	EnterStruct_field(c *Struct_fieldContext)

	// EnterArray_type is called when entering the array_type production.
	EnterArray_type(c *Array_typeContext)

	// EnterTemplate_type_open is called when entering the template_type_open production.
	EnterTemplate_type_open(c *Template_type_openContext)

	// EnterTemplate_type_close is called when entering the template_type_close production.
	EnterTemplate_type_close(c *Template_type_closeContext)

	// EnterDate_or_time_literal is called when entering the date_or_time_literal production.
	EnterDate_or_time_literal(c *Date_or_time_literalContext)

	// EnterDate_or_time_literal_kind is called when entering the date_or_time_literal_kind production.
	EnterDate_or_time_literal_kind(c *Date_or_time_literal_kindContext)

	// EnterFloating_point_literal is called when entering the floating_point_literal production.
	EnterFloating_point_literal(c *Floating_point_literalContext)

	// EnterJson_literal is called when entering the json_literal production.
	EnterJson_literal(c *Json_literalContext)

	// EnterBignumeric_literal is called when entering the bignumeric_literal production.
	EnterBignumeric_literal(c *Bignumeric_literalContext)

	// EnterBignumeric_literal_prefix is called when entering the bignumeric_literal_prefix production.
	EnterBignumeric_literal_prefix(c *Bignumeric_literal_prefixContext)

	// EnterNumeric_literal is called when entering the numeric_literal production.
	EnterNumeric_literal(c *Numeric_literalContext)

	// EnterNumeric_literal_prefix is called when entering the numeric_literal_prefix production.
	EnterNumeric_literal_prefix(c *Numeric_literal_prefixContext)

	// EnterInteger_literal is called when entering the integer_literal production.
	EnterInteger_literal(c *Integer_literalContext)

	// EnterBytes_literal is called when entering the bytes_literal production.
	EnterBytes_literal(c *Bytes_literalContext)

	// EnterNull_literal is called when entering the null_literal production.
	EnterNull_literal(c *Null_literalContext)

	// EnterBoolean_literal is called when entering the boolean_literal production.
	EnterBoolean_literal(c *Boolean_literalContext)

	// EnterString_literal is called when entering the string_literal production.
	EnterString_literal(c *String_literalContext)

	// EnterString_literal_component is called when entering the string_literal_component production.
	EnterString_literal_component(c *String_literal_componentContext)

	// EnterBytes_literal_component is called when entering the bytes_literal_component production.
	EnterBytes_literal_component(c *Bytes_literal_componentContext)

	// ExitRoot is called when exiting the root production.
	ExitRoot(c *RootContext)

	// ExitStmts is called when exiting the stmts production.
	ExitStmts(c *StmtsContext)

	// ExitStmt is called when exiting the stmt production.
	ExitStmt(c *StmtContext)

	// ExitStatement_level_hint is called when exiting the statement_level_hint production.
	ExitStatement_level_hint(c *Statement_level_hintContext)

	// ExitQuery_statement is called when exiting the query_statement production.
	ExitQuery_statement(c *Query_statementContext)

	// ExitDml_statement is called when exiting the dml_statement production.
	ExitDml_statement(c *Dml_statementContext)

	// ExitInsert_statement is called when exiting the insert_statement production.
	ExitInsert_statement(c *Insert_statementContext)

	// ExitOpt_returning_clause is called when exiting the opt_returning_clause production.
	ExitOpt_returning_clause(c *Opt_returning_clauseContext)

	// ExitOpt_assert_rows_modified is called when exiting the opt_assert_rows_modified production.
	ExitOpt_assert_rows_modified(c *Opt_assert_rows_modifiedContext)

	// ExitInsert_values_or_query is called when exiting the insert_values_or_query production.
	ExitInsert_values_or_query(c *Insert_values_or_queryContext)

	// ExitInsert_values_list is called when exiting the insert_values_list production.
	ExitInsert_values_list(c *Insert_values_listContext)

	// ExitInsert_values_row is called when exiting the insert_values_row production.
	ExitInsert_values_row(c *Insert_values_rowContext)

	// ExitExpression_or_default is called when exiting the expression_or_default production.
	ExitExpression_or_default(c *Expression_or_defaultContext)

	// ExitInsert_statement_prefix is called when exiting the insert_statement_prefix production.
	ExitInsert_statement_prefix(c *Insert_statement_prefixContext)

	// ExitMaybe_dashed_generalized_path_expression is called when exiting the maybe_dashed_generalized_path_expression production.
	ExitMaybe_dashed_generalized_path_expression(c *Maybe_dashed_generalized_path_expressionContext)

	// ExitOpt_into is called when exiting the opt_into production.
	ExitOpt_into(c *Opt_intoContext)

	// ExitOpt_or_ignore_replace_update is called when exiting the opt_or_ignore_replace_update production.
	ExitOpt_or_ignore_replace_update(c *Opt_or_ignore_replace_updateContext)

	// ExitAlter_statement is called when exiting the alter_statement production.
	ExitAlter_statement(c *Alter_statementContext)

	// ExitAnalyze_statement is called when exiting the analyze_statement production.
	ExitAnalyze_statement(c *Analyze_statementContext)

	// ExitAssert_statement is called when exiting the assert_statement production.
	ExitAssert_statement(c *Assert_statementContext)

	// ExitAux_load_data_statement is called when exiting the aux_load_data_statement production.
	ExitAux_load_data_statement(c *Aux_load_data_statementContext)

	// ExitClone_data_statement is called when exiting the clone_data_statement production.
	ExitClone_data_statement(c *Clone_data_statementContext)

	// ExitClone_data_source_list is called when exiting the clone_data_source_list production.
	ExitClone_data_source_list(c *Clone_data_source_listContext)

	// ExitClone_data_source is called when exiting the clone_data_source production.
	ExitClone_data_source(c *Clone_data_sourceContext)

	// ExitOpt_external_table_with_clauses is called when exiting the opt_external_table_with_clauses production.
	ExitOpt_external_table_with_clauses(c *Opt_external_table_with_clausesContext)

	// ExitWith_connection_clause is called when exiting the with_connection_clause production.
	ExitWith_connection_clause(c *With_connection_clauseContext)

	// ExitWith_partition_columns_clause is called when exiting the with_partition_columns_clause production.
	ExitWith_partition_columns_clause(c *With_partition_columns_clauseContext)

	// ExitAux_load_data_from_files_options_list is called when exiting the aux_load_data_from_files_options_list production.
	ExitAux_load_data_from_files_options_list(c *Aux_load_data_from_files_options_listContext)

	// ExitCluster_by_clause_prefix_no_hint is called when exiting the cluster_by_clause_prefix_no_hint production.
	ExitCluster_by_clause_prefix_no_hint(c *Cluster_by_clause_prefix_no_hintContext)

	// ExitLoad_data_partitions_clause is called when exiting the load_data_partitions_clause production.
	ExitLoad_data_partitions_clause(c *Load_data_partitions_clauseContext)

	// ExitMaybe_dashed_path_expression_with_scope is called when exiting the maybe_dashed_path_expression_with_scope production.
	ExitMaybe_dashed_path_expression_with_scope(c *Maybe_dashed_path_expression_with_scopeContext)

	// ExitTable_element_list is called when exiting the table_element_list production.
	ExitTable_element_list(c *Table_element_listContext)

	// ExitTable_element is called when exiting the table_element production.
	ExitTable_element(c *Table_elementContext)

	// ExitTable_constraint_definition is called when exiting the table_constraint_definition production.
	ExitTable_constraint_definition(c *Table_constraint_definitionContext)

	// ExitAppend_or_overwrite is called when exiting the append_or_overwrite production.
	ExitAppend_or_overwrite(c *Append_or_overwriteContext)

	// ExitOpt_description is called when exiting the opt_description production.
	ExitOpt_description(c *Opt_descriptionContext)

	// ExitTable_and_column_info_list is called when exiting the table_and_column_info_list production.
	ExitTable_and_column_info_list(c *Table_and_column_info_listContext)

	// ExitTable_and_column_info is called when exiting the table_and_column_info production.
	ExitTable_and_column_info(c *Table_and_column_infoContext)

	// ExitRow_access_policy_alter_action_list is called when exiting the row_access_policy_alter_action_list production.
	ExitRow_access_policy_alter_action_list(c *Row_access_policy_alter_action_listContext)

	// ExitRow_access_policy_alter_action is called when exiting the row_access_policy_alter_action production.
	ExitRow_access_policy_alter_action(c *Row_access_policy_alter_actionContext)

	// ExitGrant_to_clause is called when exiting the grant_to_clause production.
	ExitGrant_to_clause(c *Grant_to_clauseContext)

	// ExitGrantee_list is called when exiting the grantee_list production.
	ExitGrantee_list(c *Grantee_listContext)

	// ExitPrivilege_list is called when exiting the privilege_list production.
	ExitPrivilege_list(c *Privilege_listContext)

	// ExitPrivilege is called when exiting the privilege production.
	ExitPrivilege(c *PrivilegeContext)

	// ExitPath_expression_list_with_parens is called when exiting the path_expression_list_with_parens production.
	ExitPath_expression_list_with_parens(c *Path_expression_list_with_parensContext)

	// ExitPrivilege_name is called when exiting the privilege_name production.
	ExitPrivilege_name(c *Privilege_nameContext)

	// ExitGeneric_entity_type is called when exiting the generic_entity_type production.
	ExitGeneric_entity_type(c *Generic_entity_typeContext)

	// ExitGeneric_entity_type_unchecked is called when exiting the generic_entity_type_unchecked production.
	ExitGeneric_entity_type_unchecked(c *Generic_entity_type_uncheckedContext)

	// ExitSchema_object_kind is called when exiting the schema_object_kind production.
	ExitSchema_object_kind(c *Schema_object_kindContext)

	// ExitAlter_action_list is called when exiting the alter_action_list production.
	ExitAlter_action_list(c *Alter_action_listContext)

	// ExitAlter_action is called when exiting the alter_action production.
	ExitAlter_action(c *Alter_actionContext)

	// ExitSpanner_set_on_delete_action is called when exiting the spanner_set_on_delete_action production.
	ExitSpanner_set_on_delete_action(c *Spanner_set_on_delete_actionContext)

	// ExitSpanner_alter_column_action is called when exiting the spanner_alter_column_action production.
	ExitSpanner_alter_column_action(c *Spanner_alter_column_actionContext)

	// ExitSpanner_generated_or_default is called when exiting the spanner_generated_or_default production.
	ExitSpanner_generated_or_default(c *Spanner_generated_or_defaultContext)

	// ExitGeneric_sub_entity_type is called when exiting the generic_sub_entity_type production.
	ExitGeneric_sub_entity_type(c *Generic_sub_entity_typeContext)

	// ExitSub_entity_type_identifier is called when exiting the sub_entity_type_identifier production.
	ExitSub_entity_type_identifier(c *Sub_entity_type_identifierContext)

	// ExitFill_using_expression is called when exiting the fill_using_expression production.
	ExitFill_using_expression(c *Fill_using_expressionContext)

	// ExitColumn_position is called when exiting the column_position production.
	ExitColumn_position(c *Column_positionContext)

	// ExitTable_column_definition is called when exiting the table_column_definition production.
	ExitTable_column_definition(c *Table_column_definitionContext)

	// ExitColumn_attributes is called when exiting the column_attributes production.
	ExitColumn_attributes(c *Column_attributesContext)

	// ExitColumn_attribute is called when exiting the column_attribute production.
	ExitColumn_attribute(c *Column_attributeContext)

	// ExitPrimary_key_column_attribute is called when exiting the primary_key_column_attribute production.
	ExitPrimary_key_column_attribute(c *Primary_key_column_attributeContext)

	// ExitForeign_key_column_attribute is called when exiting the foreign_key_column_attribute production.
	ExitForeign_key_column_attribute(c *Foreign_key_column_attributeContext)

	// ExitHidden_column_attribute is called when exiting the hidden_column_attribute production.
	ExitHidden_column_attribute(c *Hidden_column_attributeContext)

	// ExitOpt_constraint_identity is called when exiting the opt_constraint_identity production.
	ExitOpt_constraint_identity(c *Opt_constraint_identityContext)

	// ExitTable_column_schema is called when exiting the table_column_schema production.
	ExitTable_column_schema(c *Table_column_schemaContext)

	// ExitOpt_column_info is called when exiting the opt_column_info production.
	ExitOpt_column_info(c *Opt_column_infoContext)

	// ExitInvalid_generated_column is called when exiting the invalid_generated_column production.
	ExitInvalid_generated_column(c *Invalid_generated_columnContext)

	// ExitInvalid_default_column is called when exiting the invalid_default_column production.
	ExitInvalid_default_column(c *Invalid_default_columnContext)

	// ExitDefault_column_info is called when exiting the default_column_info production.
	ExitDefault_column_info(c *Default_column_infoContext)

	// ExitGenerated_column_info is called when exiting the generated_column_info production.
	ExitGenerated_column_info(c *Generated_column_infoContext)

	// ExitIdentity_column_info is called when exiting the identity_column_info production.
	ExitIdentity_column_info(c *Identity_column_infoContext)

	// ExitOpt_start_with is called when exiting the opt_start_with production.
	ExitOpt_start_with(c *Opt_start_withContext)

	// ExitOpt_increment_by is called when exiting the opt_increment_by production.
	ExitOpt_increment_by(c *Opt_increment_byContext)

	// ExitOpt_maxvalue is called when exiting the opt_maxvalue production.
	ExitOpt_maxvalue(c *Opt_maxvalueContext)

	// ExitOpt_minvalue is called when exiting the opt_minvalue production.
	ExitOpt_minvalue(c *Opt_minvalueContext)

	// ExitOpt_cycle is called when exiting the opt_cycle production.
	ExitOpt_cycle(c *Opt_cycleContext)

	// ExitSigned_numeric_literal is called when exiting the signed_numeric_literal production.
	ExitSigned_numeric_literal(c *Signed_numeric_literalContext)

	// ExitStored_mode is called when exiting the stored_mode production.
	ExitStored_mode(c *Stored_modeContext)

	// ExitGenerated_mode is called when exiting the generated_mode production.
	ExitGenerated_mode(c *Generated_modeContext)

	// ExitColumn_schema_inner is called when exiting the column_schema_inner production.
	ExitColumn_schema_inner(c *Column_schema_innerContext)

	// ExitRaw_column_schema_inner is called when exiting the raw_column_schema_inner production.
	ExitRaw_column_schema_inner(c *Raw_column_schema_innerContext)

	// ExitRange_column_schema_inner is called when exiting the range_column_schema_inner production.
	ExitRange_column_schema_inner(c *Range_column_schema_innerContext)

	// ExitStruct_column_schema_inner is called when exiting the struct_column_schema_inner production.
	ExitStruct_column_schema_inner(c *Struct_column_schema_innerContext)

	// ExitStruct_column_field is called when exiting the struct_column_field production.
	ExitStruct_column_field(c *Struct_column_fieldContext)

	// ExitSimple_column_schema_inner is called when exiting the simple_column_schema_inner production.
	ExitSimple_column_schema_inner(c *Simple_column_schema_innerContext)

	// ExitArray_column_schema_inner is called when exiting the array_column_schema_inner production.
	ExitArray_column_schema_inner(c *Array_column_schema_innerContext)

	// ExitField_schema is called when exiting the field_schema production.
	ExitField_schema(c *Field_schemaContext)

	// ExitOpt_field_attributes is called when exiting the opt_field_attributes production.
	ExitOpt_field_attributes(c *Opt_field_attributesContext)

	// ExitNot_null_column_attribute is called when exiting the not_null_column_attribute production.
	ExitNot_null_column_attribute(c *Not_null_column_attributeContext)

	// ExitPrimary_key_or_table_constraint_spec is called when exiting the primary_key_or_table_constraint_spec production.
	ExitPrimary_key_or_table_constraint_spec(c *Primary_key_or_table_constraint_specContext)

	// ExitOpt_if_not_exists is called when exiting the opt_if_not_exists production.
	ExitOpt_if_not_exists(c *Opt_if_not_existsContext)

	// ExitPrimary_key_spec is called when exiting the primary_key_spec production.
	ExitPrimary_key_spec(c *Primary_key_specContext)

	// ExitPrimary_key_element_list is called when exiting the primary_key_element_list production.
	ExitPrimary_key_element_list(c *Primary_key_element_listContext)

	// ExitPrimary_key_element is called when exiting the primary_key_element production.
	ExitPrimary_key_element(c *Primary_key_elementContext)

	// ExitTable_constraint_spec is called when exiting the table_constraint_spec production.
	ExitTable_constraint_spec(c *Table_constraint_specContext)

	// ExitForeign_key_reference is called when exiting the foreign_key_reference production.
	ExitForeign_key_reference(c *Foreign_key_referenceContext)

	// ExitOpt_foreign_key_action is called when exiting the opt_foreign_key_action production.
	ExitOpt_foreign_key_action(c *Opt_foreign_key_actionContext)

	// ExitForeign_key_on_update is called when exiting the foreign_key_on_update production.
	ExitForeign_key_on_update(c *Foreign_key_on_updateContext)

	// ExitForeign_key_on_delete is called when exiting the foreign_key_on_delete production.
	ExitForeign_key_on_delete(c *Foreign_key_on_deleteContext)

	// ExitForeign_key_action is called when exiting the foreign_key_action production.
	ExitForeign_key_action(c *Foreign_key_actionContext)

	// ExitOpt_foreign_key_match is called when exiting the opt_foreign_key_match production.
	ExitOpt_foreign_key_match(c *Opt_foreign_key_matchContext)

	// ExitForeign_key_match_mode is called when exiting the foreign_key_match_mode production.
	ExitForeign_key_match_mode(c *Foreign_key_match_modeContext)

	// ExitColumn_list is called when exiting the column_list production.
	ExitColumn_list(c *Column_listContext)

	// ExitOpt_options_list is called when exiting the opt_options_list production.
	ExitOpt_options_list(c *Opt_options_listContext)

	// ExitConstraint_enforcement is called when exiting the constraint_enforcement production.
	ExitConstraint_enforcement(c *Constraint_enforcementContext)

	// ExitGeneric_entity_body is called when exiting the generic_entity_body production.
	ExitGeneric_entity_body(c *Generic_entity_bodyContext)

	// ExitOpt_if_exists is called when exiting the opt_if_exists production.
	ExitOpt_if_exists(c *Opt_if_existsContext)

	// ExitTable_or_table_function is called when exiting the table_or_table_function production.
	ExitTable_or_table_function(c *Table_or_table_functionContext)

	// ExitQuery is called when exiting the query production.
	ExitQuery(c *QueryContext)

	// ExitQuery_without_pipe_operators is called when exiting the query_without_pipe_operators production.
	ExitQuery_without_pipe_operators(c *Query_without_pipe_operatorsContext)

	// ExitBad_keyword_after_from_query is called when exiting the bad_keyword_after_from_query production.
	ExitBad_keyword_after_from_query(c *Bad_keyword_after_from_queryContext)

	// ExitBad_keyword_after_from_query_allows_parens is called when exiting the bad_keyword_after_from_query_allows_parens production.
	ExitBad_keyword_after_from_query_allows_parens(c *Bad_keyword_after_from_query_allows_parensContext)

	// ExitWith_clause_with_trailing_comma is called when exiting the with_clause_with_trailing_comma production.
	ExitWith_clause_with_trailing_comma(c *With_clause_with_trailing_commaContext)

	// ExitSelect_or_from_keyword is called when exiting the select_or_from_keyword production.
	ExitSelect_or_from_keyword(c *Select_or_from_keywordContext)

	// ExitQuery_primary_or_set_operation is called when exiting the query_primary_or_set_operation production.
	ExitQuery_primary_or_set_operation(c *Query_primary_or_set_operationContext)

	// ExitQuery_set_operation is called when exiting the query_set_operation production.
	ExitQuery_set_operation(c *Query_set_operationContext)

	// ExitQuery_set_operation_prefix is called when exiting the query_set_operation_prefix production.
	ExitQuery_set_operation_prefix(c *Query_set_operation_prefixContext)

	// ExitQuery_set_operation_item is called when exiting the query_set_operation_item production.
	ExitQuery_set_operation_item(c *Query_set_operation_itemContext)

	// ExitQuery_primary is called when exiting the query_primary production.
	ExitQuery_primary(c *Query_primaryContext)

	// ExitSet_operation_metadata is called when exiting the set_operation_metadata production.
	ExitSet_operation_metadata(c *Set_operation_metadataContext)

	// ExitOpt_column_match_suffix is called when exiting the opt_column_match_suffix production.
	ExitOpt_column_match_suffix(c *Opt_column_match_suffixContext)

	// ExitOpt_strict is called when exiting the opt_strict production.
	ExitOpt_strict(c *Opt_strictContext)

	// ExitAll_or_distinct is called when exiting the all_or_distinct production.
	ExitAll_or_distinct(c *All_or_distinctContext)

	// ExitQuery_set_operation_type is called when exiting the query_set_operation_type production.
	ExitQuery_set_operation_type(c *Query_set_operation_typeContext)

	// ExitOpt_corresponding_outer_mode is called when exiting the opt_corresponding_outer_mode production.
	ExitOpt_corresponding_outer_mode(c *Opt_corresponding_outer_modeContext)

	// ExitOpt_outer is called when exiting the opt_outer production.
	ExitOpt_outer(c *Opt_outerContext)

	// ExitWith_clause is called when exiting the with_clause production.
	ExitWith_clause(c *With_clauseContext)

	// ExitAliased_query is called when exiting the aliased_query production.
	ExitAliased_query(c *Aliased_queryContext)

	// ExitOpt_aliased_query_modifiers is called when exiting the opt_aliased_query_modifiers production.
	ExitOpt_aliased_query_modifiers(c *Opt_aliased_query_modifiersContext)

	// ExitRecursion_depth_modifier is called when exiting the recursion_depth_modifier production.
	ExitRecursion_depth_modifier(c *Recursion_depth_modifierContext)

	// ExitPossibly_unbounded_int_literal_or_parameter is called when exiting the possibly_unbounded_int_literal_or_parameter production.
	ExitPossibly_unbounded_int_literal_or_parameter(c *Possibly_unbounded_int_literal_or_parameterContext)

	// ExitInt_literal_or_parameter is called when exiting the int_literal_or_parameter production.
	ExitInt_literal_or_parameter(c *Int_literal_or_parameterContext)

	// ExitOrder_by_clause is called when exiting the order_by_clause production.
	ExitOrder_by_clause(c *Order_by_clauseContext)

	// ExitOrder_by_clause_prefix is called when exiting the order_by_clause_prefix production.
	ExitOrder_by_clause_prefix(c *Order_by_clause_prefixContext)

	// ExitOrdering_expression is called when exiting the ordering_expression production.
	ExitOrdering_expression(c *Ordering_expressionContext)

	// ExitSelect is called when exiting the select production.
	ExitSelect(c *SelectContext)

	// ExitOpt_clauses_following_from is called when exiting the opt_clauses_following_from production.
	ExitOpt_clauses_following_from(c *Opt_clauses_following_fromContext)

	// ExitOpt_clauses_following_where is called when exiting the opt_clauses_following_where production.
	ExitOpt_clauses_following_where(c *Opt_clauses_following_whereContext)

	// ExitOpt_clauses_following_group_by is called when exiting the opt_clauses_following_group_by production.
	ExitOpt_clauses_following_group_by(c *Opt_clauses_following_group_byContext)

	// ExitWindow_clause is called when exiting the window_clause production.
	ExitWindow_clause(c *Window_clauseContext)

	// ExitWindow_clause_prefix is called when exiting the window_clause_prefix production.
	ExitWindow_clause_prefix(c *Window_clause_prefixContext)

	// ExitWindow_definition is called when exiting the window_definition production.
	ExitWindow_definition(c *Window_definitionContext)

	// ExitWhere_clause is called when exiting the where_clause production.
	ExitWhere_clause(c *Where_clauseContext)

	// ExitHaving_clause is called when exiting the having_clause production.
	ExitHaving_clause(c *Having_clauseContext)

	// ExitGroup_by_clause is called when exiting the group_by_clause production.
	ExitGroup_by_clause(c *Group_by_clauseContext)

	// ExitGroup_by_all is called when exiting the group_by_all production.
	ExitGroup_by_all(c *Group_by_allContext)

	// ExitSelect_clause is called when exiting the select_clause production.
	ExitSelect_clause(c *Select_clauseContext)

	// ExitOpt_select_as_clause is called when exiting the opt_select_as_clause production.
	ExitOpt_select_as_clause(c *Opt_select_as_clauseContext)

	// ExitOpt_select_with is called when exiting the opt_select_with production.
	ExitOpt_select_with(c *Opt_select_withContext)

	// ExitFrom_clause is called when exiting the from_clause production.
	ExitFrom_clause(c *From_clauseContext)

	// ExitFrom_clause_contents is called when exiting the from_clause_contents production.
	ExitFrom_clause_contents(c *From_clause_contentsContext)

	// ExitFrom_clause_contents_suffix is called when exiting the from_clause_contents_suffix production.
	ExitFrom_clause_contents_suffix(c *From_clause_contents_suffixContext)

	// ExitTable_primary is called when exiting the table_primary production.
	ExitTable_primary(c *Table_primaryContext)

	// ExitTvf_with_suffixes is called when exiting the tvf_with_suffixes production.
	ExitTvf_with_suffixes(c *Tvf_with_suffixesContext)

	// ExitPivot_or_unpivot_clause_and_aliases is called when exiting the pivot_or_unpivot_clause_and_aliases production.
	ExitPivot_or_unpivot_clause_and_aliases(c *Pivot_or_unpivot_clause_and_aliasesContext)

	// ExitAs_alias is called when exiting the as_alias production.
	ExitAs_alias(c *As_aliasContext)

	// ExitSample_clause is called when exiting the sample_clause production.
	ExitSample_clause(c *Sample_clauseContext)

	// ExitOpt_sample_clause_suffix is called when exiting the opt_sample_clause_suffix production.
	ExitOpt_sample_clause_suffix(c *Opt_sample_clause_suffixContext)

	// ExitRepeatable_clause is called when exiting the repeatable_clause production.
	ExitRepeatable_clause(c *Repeatable_clauseContext)

	// ExitPossibly_cast_int_literal_or_parameter is called when exiting the possibly_cast_int_literal_or_parameter production.
	ExitPossibly_cast_int_literal_or_parameter(c *Possibly_cast_int_literal_or_parameterContext)

	// ExitCast_int_literal_or_parameter is called when exiting the cast_int_literal_or_parameter production.
	ExitCast_int_literal_or_parameter(c *Cast_int_literal_or_parameterContext)

	// ExitSample_size is called when exiting the sample_size production.
	ExitSample_size(c *Sample_sizeContext)

	// ExitSample_size_value is called when exiting the sample_size_value production.
	ExitSample_size_value(c *Sample_size_valueContext)

	// ExitSample_size_unit is called when exiting the sample_size_unit production.
	ExitSample_size_unit(c *Sample_size_unitContext)

	// ExitPartition_by_clause_prefix_no_hint is called when exiting the partition_by_clause_prefix_no_hint production.
	ExitPartition_by_clause_prefix_no_hint(c *Partition_by_clause_prefix_no_hintContext)

	// ExitMatch_recognize_clause is called when exiting the match_recognize_clause production.
	ExitMatch_recognize_clause(c *Match_recognize_clauseContext)

	// ExitRow_pattern_expr is called when exiting the row_pattern_expr production.
	ExitRow_pattern_expr(c *Row_pattern_exprContext)

	// ExitRow_pattern_concatenation is called when exiting the row_pattern_concatenation production.
	ExitRow_pattern_concatenation(c *Row_pattern_concatenationContext)

	// ExitRow_pattern_factor is called when exiting the row_pattern_factor production.
	ExitRow_pattern_factor(c *Row_pattern_factorContext)

	// ExitSelect_list_prefix_with_as_aliases is called when exiting the select_list_prefix_with_as_aliases production.
	ExitSelect_list_prefix_with_as_aliases(c *Select_list_prefix_with_as_aliasesContext)

	// ExitSelect_column_expr_with_as_alias is called when exiting the select_column_expr_with_as_alias production.
	ExitSelect_column_expr_with_as_alias(c *Select_column_expr_with_as_aliasContext)

	// ExitTable_subquery is called when exiting the table_subquery production.
	ExitTable_subquery(c *Table_subqueryContext)

	// ExitJoin is called when exiting the join production.
	ExitJoin(c *JoinContext)

	// ExitJoin_item is called when exiting the join_item production.
	ExitJoin_item(c *Join_itemContext)

	// ExitOn_or_using_clause_list is called when exiting the on_or_using_clause_list production.
	ExitOn_or_using_clause_list(c *On_or_using_clause_listContext)

	// ExitOn_or_using_clause is called when exiting the on_or_using_clause production.
	ExitOn_or_using_clause(c *On_or_using_clauseContext)

	// ExitUsing_clause is called when exiting the using_clause production.
	ExitUsing_clause(c *Using_clauseContext)

	// ExitJoin_hint is called when exiting the join_hint production.
	ExitJoin_hint(c *Join_hintContext)

	// ExitTable_path_expression is called when exiting the table_path_expression production.
	ExitTable_path_expression(c *Table_path_expressionContext)

	// ExitOpt_at_system_time is called when exiting the opt_at_system_time production.
	ExitOpt_at_system_time(c *Opt_at_system_timeContext)

	// ExitOpt_with_offset_and_alias is called when exiting the opt_with_offset_and_alias production.
	ExitOpt_with_offset_and_alias(c *Opt_with_offset_and_aliasContext)

	// ExitOpt_pivot_or_unpivot_clause_and_alias is called when exiting the opt_pivot_or_unpivot_clause_and_alias production.
	ExitOpt_pivot_or_unpivot_clause_and_alias(c *Opt_pivot_or_unpivot_clause_and_aliasContext)

	// ExitTable_path_expression_base is called when exiting the table_path_expression_base production.
	ExitTable_path_expression_base(c *Table_path_expression_baseContext)

	// ExitMaybe_slashed_or_dashed_path_expression is called when exiting the maybe_slashed_or_dashed_path_expression production.
	ExitMaybe_slashed_or_dashed_path_expression(c *Maybe_slashed_or_dashed_path_expressionContext)

	// ExitMaybe_dashed_path_expression is called when exiting the maybe_dashed_path_expression production.
	ExitMaybe_dashed_path_expression(c *Maybe_dashed_path_expressionContext)

	// ExitDashed_path_expression is called when exiting the dashed_path_expression production.
	ExitDashed_path_expression(c *Dashed_path_expressionContext)

	// ExitDashed_identifier is called when exiting the dashed_identifier production.
	ExitDashed_identifier(c *Dashed_identifierContext)

	// ExitSlashed_identifier is called when exiting the slashed_identifier production.
	ExitSlashed_identifier(c *Slashed_identifierContext)

	// ExitIdentifier_or_integer is called when exiting the identifier_or_integer production.
	ExitIdentifier_or_integer(c *Identifier_or_integerContext)

	// ExitSlashed_identifier_separator is called when exiting the slashed_identifier_separator production.
	ExitSlashed_identifier_separator(c *Slashed_identifier_separatorContext)

	// ExitSlashed_path_expression is called when exiting the slashed_path_expression production.
	ExitSlashed_path_expression(c *Slashed_path_expressionContext)

	// ExitUnnest_expression is called when exiting the unnest_expression production.
	ExitUnnest_expression(c *Unnest_expressionContext)

	// ExitUnnest_expression_prefix is called when exiting the unnest_expression_prefix production.
	ExitUnnest_expression_prefix(c *Unnest_expression_prefixContext)

	// ExitOpt_array_zip_mode is called when exiting the opt_array_zip_mode production.
	ExitOpt_array_zip_mode(c *Opt_array_zip_modeContext)

	// ExitExpression_with_opt_alias is called when exiting the expression_with_opt_alias production.
	ExitExpression_with_opt_alias(c *Expression_with_opt_aliasContext)

	// ExitTvf_prefix is called when exiting the tvf_prefix production.
	ExitTvf_prefix(c *Tvf_prefixContext)

	// ExitTvf_argument is called when exiting the tvf_argument production.
	ExitTvf_argument(c *Tvf_argumentContext)

	// ExitConnection_clause is called when exiting the connection_clause production.
	ExitConnection_clause(c *Connection_clauseContext)

	// ExitPath_expression_or_default is called when exiting the path_expression_or_default production.
	ExitPath_expression_or_default(c *Path_expression_or_defaultContext)

	// ExitDescriptor_argument is called when exiting the descriptor_argument production.
	ExitDescriptor_argument(c *Descriptor_argumentContext)

	// ExitDescriptor_column_list is called when exiting the descriptor_column_list production.
	ExitDescriptor_column_list(c *Descriptor_column_listContext)

	// ExitDescriptor_column is called when exiting the descriptor_column production.
	ExitDescriptor_column(c *Descriptor_columnContext)

	// ExitTable_clause is called when exiting the table_clause production.
	ExitTable_clause(c *Table_clauseContext)

	// ExitModel_clause is called when exiting the model_clause production.
	ExitModel_clause(c *Model_clauseContext)

	// ExitQualify_clause_nonreserved is called when exiting the qualify_clause_nonreserved production.
	ExitQualify_clause_nonreserved(c *Qualify_clause_nonreservedContext)

	// ExitUnpivot_clause is called when exiting the unpivot_clause production.
	ExitUnpivot_clause(c *Unpivot_clauseContext)

	// ExitUnpivot_in_item_list is called when exiting the unpivot_in_item_list production.
	ExitUnpivot_in_item_list(c *Unpivot_in_item_listContext)

	// ExitUnpivot_in_item_list_prefix is called when exiting the unpivot_in_item_list_prefix production.
	ExitUnpivot_in_item_list_prefix(c *Unpivot_in_item_list_prefixContext)

	// ExitUnpivot_in_item is called when exiting the unpivot_in_item production.
	ExitUnpivot_in_item(c *Unpivot_in_itemContext)

	// ExitOpt_as_string_or_integer is called when exiting the opt_as_string_or_integer production.
	ExitOpt_as_string_or_integer(c *Opt_as_string_or_integerContext)

	// ExitPath_expression_list_with_opt_parens is called when exiting the path_expression_list_with_opt_parens production.
	ExitPath_expression_list_with_opt_parens(c *Path_expression_list_with_opt_parensContext)

	// ExitPath_expression_list is called when exiting the path_expression_list production.
	ExitPath_expression_list(c *Path_expression_listContext)

	// ExitUnpivot_nulls_filter is called when exiting the unpivot_nulls_filter production.
	ExitUnpivot_nulls_filter(c *Unpivot_nulls_filterContext)

	// ExitPivot_clause is called when exiting the pivot_clause production.
	ExitPivot_clause(c *Pivot_clauseContext)

	// ExitPivot_expression_list is called when exiting the pivot_expression_list production.
	ExitPivot_expression_list(c *Pivot_expression_listContext)

	// ExitPivot_expression is called when exiting the pivot_expression production.
	ExitPivot_expression(c *Pivot_expressionContext)

	// ExitPivot_value_list is called when exiting the pivot_value_list production.
	ExitPivot_value_list(c *Pivot_value_listContext)

	// ExitPivot_value is called when exiting the pivot_value production.
	ExitPivot_value(c *Pivot_valueContext)

	// ExitTvf_prefix_no_args is called when exiting the tvf_prefix_no_args production.
	ExitTvf_prefix_no_args(c *Tvf_prefix_no_argsContext)

	// ExitJoin_type is called when exiting the join_type production.
	ExitJoin_type(c *Join_typeContext)

	// ExitOpt_natural is called when exiting the opt_natural production.
	ExitOpt_natural(c *Opt_naturalContext)

	// ExitOn_clause is called when exiting the on_clause production.
	ExitOn_clause(c *On_clauseContext)

	// ExitSelect_list is called when exiting the select_list production.
	ExitSelect_list(c *Select_listContext)

	// ExitSelect_list_item is called when exiting the select_list_item production.
	ExitSelect_list_item(c *Select_list_itemContext)

	// ExitSelect_column_star is called when exiting the select_column_star production.
	ExitSelect_column_star(c *Select_column_starContext)

	// ExitSelect_column_expr is called when exiting the select_column_expr production.
	ExitSelect_column_expr(c *Select_column_exprContext)

	// ExitSelect_column_dot_star is called when exiting the select_column_dot_star production.
	ExitSelect_column_dot_star(c *Select_column_dot_starContext)

	// ExitStar_modifiers is called when exiting the star_modifiers production.
	ExitStar_modifiers(c *Star_modifiersContext)

	// ExitStar_except_list is called when exiting the star_except_list production.
	ExitStar_except_list(c *Star_except_listContext)

	// ExitStar_replace_list is called when exiting the star_replace_list production.
	ExitStar_replace_list(c *Star_replace_listContext)

	// ExitStar_replace_item is called when exiting the star_replace_item production.
	ExitStar_replace_item(c *Star_replace_itemContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitExpression_higher_prec_than_and is called when exiting the expression_higher_prec_than_and production.
	ExitExpression_higher_prec_than_and(c *Expression_higher_prec_than_andContext)

	// ExitExpression_maybe_parenthesized_not_a_query is called when exiting the expression_maybe_parenthesized_not_a_query production.
	ExitExpression_maybe_parenthesized_not_a_query(c *Expression_maybe_parenthesized_not_a_queryContext)

	// ExitParenthesized_in_rhs is called when exiting the parenthesized_in_rhs production.
	ExitParenthesized_in_rhs(c *Parenthesized_in_rhsContext)

	// ExitUnary_operator is called when exiting the unary_operator production.
	ExitUnary_operator(c *Unary_operatorContext)

	// ExitComparative_operator is called when exiting the comparative_operator production.
	ExitComparative_operator(c *Comparative_operatorContext)

	// ExitShift_operator is called when exiting the shift_operator production.
	ExitShift_operator(c *Shift_operatorContext)

	// ExitAdditive_operator is called when exiting the additive_operator production.
	ExitAdditive_operator(c *Additive_operatorContext)

	// ExitMultiplicative_operator is called when exiting the multiplicative_operator production.
	ExitMultiplicative_operator(c *Multiplicative_operatorContext)

	// ExitIs_operator is called when exiting the is_operator production.
	ExitIs_operator(c *Is_operatorContext)

	// ExitBetween_operator is called when exiting the between_operator production.
	ExitBetween_operator(c *Between_operatorContext)

	// ExitIn_operator is called when exiting the in_operator production.
	ExitIn_operator(c *In_operatorContext)

	// ExitDistinct_operator is called when exiting the distinct_operator production.
	ExitDistinct_operator(c *Distinct_operatorContext)

	// ExitParenthesized_query is called when exiting the parenthesized_query production.
	ExitParenthesized_query(c *Parenthesized_queryContext)

	// ExitParenthesized_expression_not_a_query is called when exiting the parenthesized_expression_not_a_query production.
	ExitParenthesized_expression_not_a_query(c *Parenthesized_expression_not_a_queryContext)

	// ExitParenthesized_anysomeall_list_in_rhs is called when exiting the parenthesized_anysomeall_list_in_rhs production.
	ExitParenthesized_anysomeall_list_in_rhs(c *Parenthesized_anysomeall_list_in_rhsContext)

	// ExitAnd_expression is called when exiting the and_expression production.
	ExitAnd_expression(c *And_expressionContext)

	// ExitIn_list_two_or_more_prefix is called when exiting the in_list_two_or_more_prefix production.
	ExitIn_list_two_or_more_prefix(c *In_list_two_or_more_prefixContext)

	// ExitAny_some_all is called when exiting the any_some_all production.
	ExitAny_some_all(c *Any_some_allContext)

	// ExitLike_operator is called when exiting the like_operator production.
	ExitLike_operator(c *Like_operatorContext)

	// ExitExpression_subquery_with_keyword is called when exiting the expression_subquery_with_keyword production.
	ExitExpression_subquery_with_keyword(c *Expression_subquery_with_keywordContext)

	// ExitStruct_constructor is called when exiting the struct_constructor production.
	ExitStruct_constructor(c *Struct_constructorContext)

	// ExitStruct_constructor_prefix_with_keyword is called when exiting the struct_constructor_prefix_with_keyword production.
	ExitStruct_constructor_prefix_with_keyword(c *Struct_constructor_prefix_with_keywordContext)

	// ExitStruct_constructor_arg is called when exiting the struct_constructor_arg production.
	ExitStruct_constructor_arg(c *Struct_constructor_argContext)

	// ExitStruct_constructor_prefix_without_keyword is called when exiting the struct_constructor_prefix_without_keyword production.
	ExitStruct_constructor_prefix_without_keyword(c *Struct_constructor_prefix_without_keywordContext)

	// ExitStruct_constructor_prefix_with_keyword_no_arg is called when exiting the struct_constructor_prefix_with_keyword_no_arg production.
	ExitStruct_constructor_prefix_with_keyword_no_arg(c *Struct_constructor_prefix_with_keyword_no_argContext)

	// ExitInterval_expression is called when exiting the interval_expression production.
	ExitInterval_expression(c *Interval_expressionContext)

	// ExitFunction_call_expression_with_clauses is called when exiting the function_call_expression_with_clauses production.
	ExitFunction_call_expression_with_clauses(c *Function_call_expression_with_clausesContext)

	// ExitFunction_call_expression_with_clauses_suffix is called when exiting the function_call_expression_with_clauses_suffix production.
	ExitFunction_call_expression_with_clauses_suffix(c *Function_call_expression_with_clauses_suffixContext)

	// ExitOver_clause is called when exiting the over_clause production.
	ExitOver_clause(c *Over_clauseContext)

	// ExitWindow_specification is called when exiting the window_specification production.
	ExitWindow_specification(c *Window_specificationContext)

	// ExitOpt_window_frame_clause is called when exiting the opt_window_frame_clause production.
	ExitOpt_window_frame_clause(c *Opt_window_frame_clauseContext)

	// ExitWindow_frame_bound is called when exiting the window_frame_bound production.
	ExitWindow_frame_bound(c *Window_frame_boundContext)

	// ExitPreceding_or_following is called when exiting the preceding_or_following production.
	ExitPreceding_or_following(c *Preceding_or_followingContext)

	// ExitFrame_unit is called when exiting the frame_unit production.
	ExitFrame_unit(c *Frame_unitContext)

	// ExitPartition_by_clause is called when exiting the partition_by_clause production.
	ExitPartition_by_clause(c *Partition_by_clauseContext)

	// ExitPartition_by_clause_prefix is called when exiting the partition_by_clause_prefix production.
	ExitPartition_by_clause_prefix(c *Partition_by_clause_prefixContext)

	// ExitWith_group_rows is called when exiting the with_group_rows production.
	ExitWith_group_rows(c *With_group_rowsContext)

	// ExitWith_report_modifier is called when exiting the with_report_modifier production.
	ExitWith_report_modifier(c *With_report_modifierContext)

	// ExitClamped_between_modifier is called when exiting the clamped_between_modifier production.
	ExitClamped_between_modifier(c *Clamped_between_modifierContext)

	// ExitWith_report_format is called when exiting the with_report_format production.
	ExitWith_report_format(c *With_report_formatContext)

	// ExitOptions_list is called when exiting the options_list production.
	ExitOptions_list(c *Options_listContext)

	// ExitOptions_list_prefix is called when exiting the options_list_prefix production.
	ExitOptions_list_prefix(c *Options_list_prefixContext)

	// ExitOptions_entry is called when exiting the options_entry production.
	ExitOptions_entry(c *Options_entryContext)

	// ExitExpression_or_proto is called when exiting the expression_or_proto production.
	ExitExpression_or_proto(c *Expression_or_protoContext)

	// ExitOptions_assignment_operator is called when exiting the options_assignment_operator production.
	ExitOptions_assignment_operator(c *Options_assignment_operatorContext)

	// ExitOpt_null_handling_modifier is called when exiting the opt_null_handling_modifier production.
	ExitOpt_null_handling_modifier(c *Opt_null_handling_modifierContext)

	// ExitFunction_call_argument is called when exiting the function_call_argument production.
	ExitFunction_call_argument(c *Function_call_argumentContext)

	// ExitSequence_arg is called when exiting the sequence_arg production.
	ExitSequence_arg(c *Sequence_argContext)

	// ExitNamed_argument is called when exiting the named_argument production.
	ExitNamed_argument(c *Named_argumentContext)

	// ExitLambda_argument is called when exiting the lambda_argument production.
	ExitLambda_argument(c *Lambda_argumentContext)

	// ExitLambda_argument_list is called when exiting the lambda_argument_list production.
	ExitLambda_argument_list(c *Lambda_argument_listContext)

	// ExitLimit_offset_clause is called when exiting the limit_offset_clause production.
	ExitLimit_offset_clause(c *Limit_offset_clauseContext)

	// ExitOpt_having_or_group_by_modifier is called when exiting the opt_having_or_group_by_modifier production.
	ExitOpt_having_or_group_by_modifier(c *Opt_having_or_group_by_modifierContext)

	// ExitGroup_by_clause_prefix is called when exiting the group_by_clause_prefix production.
	ExitGroup_by_clause_prefix(c *Group_by_clause_prefixContext)

	// ExitGroup_by_preamble is called when exiting the group_by_preamble production.
	ExitGroup_by_preamble(c *Group_by_preambleContext)

	// ExitOpt_and_order is called when exiting the opt_and_order production.
	ExitOpt_and_order(c *Opt_and_orderContext)

	// ExitHint is called when exiting the hint production.
	ExitHint(c *HintContext)

	// ExitHint_with_body is called when exiting the hint_with_body production.
	ExitHint_with_body(c *Hint_with_bodyContext)

	// ExitHint_with_body_prefix is called when exiting the hint_with_body_prefix production.
	ExitHint_with_body_prefix(c *Hint_with_body_prefixContext)

	// ExitHint_entry is called when exiting the hint_entry production.
	ExitHint_entry(c *Hint_entryContext)

	// ExitIdentifier_in_hints is called when exiting the identifier_in_hints production.
	ExitIdentifier_in_hints(c *Identifier_in_hintsContext)

	// ExitExtra_identifier_in_hints_name is called when exiting the extra_identifier_in_hints_name production.
	ExitExtra_identifier_in_hints_name(c *Extra_identifier_in_hints_nameContext)

	// ExitGrouping_item is called when exiting the grouping_item production.
	ExitGrouping_item(c *Grouping_itemContext)

	// ExitGrouping_set_list is called when exiting the grouping_set_list production.
	ExitGrouping_set_list(c *Grouping_set_listContext)

	// ExitGrouping_set is called when exiting the grouping_set production.
	ExitGrouping_set(c *Grouping_setContext)

	// ExitCube_list is called when exiting the cube_list production.
	ExitCube_list(c *Cube_listContext)

	// ExitRollup_list is called when exiting the rollup_list production.
	ExitRollup_list(c *Rollup_listContext)

	// ExitOpt_as_alias_with_required_as is called when exiting the opt_as_alias_with_required_as production.
	ExitOpt_as_alias_with_required_as(c *Opt_as_alias_with_required_asContext)

	// ExitOpt_grouping_item_order is called when exiting the opt_grouping_item_order production.
	ExitOpt_grouping_item_order(c *Opt_grouping_item_orderContext)

	// ExitOpt_selection_item_order is called when exiting the opt_selection_item_order production.
	ExitOpt_selection_item_order(c *Opt_selection_item_orderContext)

	// ExitAsc_or_desc is called when exiting the asc_or_desc production.
	ExitAsc_or_desc(c *Asc_or_descContext)

	// ExitNull_order is called when exiting the null_order production.
	ExitNull_order(c *Null_orderContext)

	// ExitFunction_name_from_keyword is called when exiting the function_name_from_keyword production.
	ExitFunction_name_from_keyword(c *Function_name_from_keywordContext)

	// ExitReplace_fields_expression is called when exiting the replace_fields_expression production.
	ExitReplace_fields_expression(c *Replace_fields_expressionContext)

	// ExitReplace_fields_prefix is called when exiting the replace_fields_prefix production.
	ExitReplace_fields_prefix(c *Replace_fields_prefixContext)

	// ExitReplace_fields_arg is called when exiting the replace_fields_arg production.
	ExitReplace_fields_arg(c *Replace_fields_argContext)

	// ExitGeneralized_path_expression is called when exiting the generalized_path_expression production.
	ExitGeneralized_path_expression(c *Generalized_path_expressionContext)

	// ExitGeneralized_extension_path is called when exiting the generalized_extension_path production.
	ExitGeneralized_extension_path(c *Generalized_extension_pathContext)

	// ExitWith_expression is called when exiting the with_expression production.
	ExitWith_expression(c *With_expressionContext)

	// ExitWith_expression_variable_prefix is called when exiting the with_expression_variable_prefix production.
	ExitWith_expression_variable_prefix(c *With_expression_variable_prefixContext)

	// ExitWith_expression_variable is called when exiting the with_expression_variable production.
	ExitWith_expression_variable(c *With_expression_variableContext)

	// ExitExtract_expression is called when exiting the extract_expression production.
	ExitExtract_expression(c *Extract_expressionContext)

	// ExitExtract_expression_base is called when exiting the extract_expression_base production.
	ExitExtract_expression_base(c *Extract_expression_baseContext)

	// ExitOpt_format is called when exiting the opt_format production.
	ExitOpt_format(c *Opt_formatContext)

	// ExitOpt_at_time_zone is called when exiting the opt_at_time_zone production.
	ExitOpt_at_time_zone(c *Opt_at_time_zoneContext)

	// ExitCast_expression is called when exiting the cast_expression production.
	ExitCast_expression(c *Cast_expressionContext)

	// ExitCase_expression is called when exiting the case_expression production.
	ExitCase_expression(c *Case_expressionContext)

	// ExitCase_expression_prefix is called when exiting the case_expression_prefix production.
	ExitCase_expression_prefix(c *Case_expression_prefixContext)

	// ExitCase_value_expression_prefix is called when exiting the case_value_expression_prefix production.
	ExitCase_value_expression_prefix(c *Case_value_expression_prefixContext)

	// ExitCase_no_value_expression_prefix is called when exiting the case_no_value_expression_prefix production.
	ExitCase_no_value_expression_prefix(c *Case_no_value_expression_prefixContext)

	// ExitStruct_braced_constructor is called when exiting the struct_braced_constructor production.
	ExitStruct_braced_constructor(c *Struct_braced_constructorContext)

	// ExitBraced_new_constructor is called when exiting the braced_new_constructor production.
	ExitBraced_new_constructor(c *Braced_new_constructorContext)

	// ExitBraced_constructor is called when exiting the braced_constructor production.
	ExitBraced_constructor(c *Braced_constructorContext)

	// ExitBraced_constructor_start is called when exiting the braced_constructor_start production.
	ExitBraced_constructor_start(c *Braced_constructor_startContext)

	// ExitBraced_constructor_prefix is called when exiting the braced_constructor_prefix production.
	ExitBraced_constructor_prefix(c *Braced_constructor_prefixContext)

	// ExitBraced_constructor_field is called when exiting the braced_constructor_field production.
	ExitBraced_constructor_field(c *Braced_constructor_fieldContext)

	// ExitBraced_constructor_lhs is called when exiting the braced_constructor_lhs production.
	ExitBraced_constructor_lhs(c *Braced_constructor_lhsContext)

	// ExitBraced_constructor_field_value is called when exiting the braced_constructor_field_value production.
	ExitBraced_constructor_field_value(c *Braced_constructor_field_valueContext)

	// ExitBraced_constructor_extension is called when exiting the braced_constructor_extension production.
	ExitBraced_constructor_extension(c *Braced_constructor_extensionContext)

	// ExitNew_constructor is called when exiting the new_constructor production.
	ExitNew_constructor(c *New_constructorContext)

	// ExitNew_constructor_prefix is called when exiting the new_constructor_prefix production.
	ExitNew_constructor_prefix(c *New_constructor_prefixContext)

	// ExitNew_constructor_prefix_no_arg is called when exiting the new_constructor_prefix_no_arg production.
	ExitNew_constructor_prefix_no_arg(c *New_constructor_prefix_no_argContext)

	// ExitNew_constructor_arg is called when exiting the new_constructor_arg production.
	ExitNew_constructor_arg(c *New_constructor_argContext)

	// ExitArray_constructor is called when exiting the array_constructor production.
	ExitArray_constructor(c *Array_constructorContext)

	// ExitArray_constructor_prefix is called when exiting the array_constructor_prefix production.
	ExitArray_constructor_prefix(c *Array_constructor_prefixContext)

	// ExitArray_constructor_prefix_no_expressions is called when exiting the array_constructor_prefix_no_expressions production.
	ExitArray_constructor_prefix_no_expressions(c *Array_constructor_prefix_no_expressionsContext)

	// ExitRange_literal is called when exiting the range_literal production.
	ExitRange_literal(c *Range_literalContext)

	// ExitRange_type is called when exiting the range_type production.
	ExitRange_type(c *Range_typeContext)

	// ExitType is called when exiting the type production.
	ExitType(c *TypeContext)

	// ExitCollate_clause is called when exiting the collate_clause production.
	ExitCollate_clause(c *Collate_clauseContext)

	// ExitString_literal_or_parameter is called when exiting the string_literal_or_parameter production.
	ExitString_literal_or_parameter(c *String_literal_or_parameterContext)

	// ExitSystem_variable_expression is called when exiting the system_variable_expression production.
	ExitSystem_variable_expression(c *System_variable_expressionContext)

	// ExitParameter_expression is called when exiting the parameter_expression production.
	ExitParameter_expression(c *Parameter_expressionContext)

	// ExitNamed_parameter_expression is called when exiting the named_parameter_expression production.
	ExitNamed_parameter_expression(c *Named_parameter_expressionContext)

	// ExitOpt_type_parameters is called when exiting the opt_type_parameters production.
	ExitOpt_type_parameters(c *Opt_type_parametersContext)

	// ExitType_parameters_prefix is called when exiting the type_parameters_prefix production.
	ExitType_parameters_prefix(c *Type_parameters_prefixContext)

	// ExitType_parameter is called when exiting the type_parameter production.
	ExitType_parameter(c *Type_parameterContext)

	// ExitRaw_type is called when exiting the raw_type production.
	ExitRaw_type(c *Raw_typeContext)

	// ExitMap_type is called when exiting the map_type production.
	ExitMap_type(c *Map_typeContext)

	// ExitFunction_type is called when exiting the function_type production.
	ExitFunction_type(c *Function_typeContext)

	// ExitFunction_type_prefix is called when exiting the function_type_prefix production.
	ExitFunction_type_prefix(c *Function_type_prefixContext)

	// ExitType_name is called when exiting the type_name production.
	ExitType_name(c *Type_nameContext)

	// ExitPath_expression is called when exiting the path_expression production.
	ExitPath_expression(c *Path_expressionContext)

	// ExitIdentifier is called when exiting the identifier production.
	ExitIdentifier(c *IdentifierContext)

	// ExitKeyword_as_identifier is called when exiting the keyword_as_identifier production.
	ExitKeyword_as_identifier(c *Keyword_as_identifierContext)

	// ExitCommon_keyword_as_identifier is called when exiting the common_keyword_as_identifier production.
	ExitCommon_keyword_as_identifier(c *Common_keyword_as_identifierContext)

	// ExitToken_identifier is called when exiting the token_identifier production.
	ExitToken_identifier(c *Token_identifierContext)

	// ExitStruct_type is called when exiting the struct_type production.
	ExitStruct_type(c *Struct_typeContext)

	// ExitStruct_type_prefix is called when exiting the struct_type_prefix production.
	ExitStruct_type_prefix(c *Struct_type_prefixContext)

	// ExitStruct_field is called when exiting the struct_field production.
	ExitStruct_field(c *Struct_fieldContext)

	// ExitArray_type is called when exiting the array_type production.
	ExitArray_type(c *Array_typeContext)

	// ExitTemplate_type_open is called when exiting the template_type_open production.
	ExitTemplate_type_open(c *Template_type_openContext)

	// ExitTemplate_type_close is called when exiting the template_type_close production.
	ExitTemplate_type_close(c *Template_type_closeContext)

	// ExitDate_or_time_literal is called when exiting the date_or_time_literal production.
	ExitDate_or_time_literal(c *Date_or_time_literalContext)

	// ExitDate_or_time_literal_kind is called when exiting the date_or_time_literal_kind production.
	ExitDate_or_time_literal_kind(c *Date_or_time_literal_kindContext)

	// ExitFloating_point_literal is called when exiting the floating_point_literal production.
	ExitFloating_point_literal(c *Floating_point_literalContext)

	// ExitJson_literal is called when exiting the json_literal production.
	ExitJson_literal(c *Json_literalContext)

	// ExitBignumeric_literal is called when exiting the bignumeric_literal production.
	ExitBignumeric_literal(c *Bignumeric_literalContext)

	// ExitBignumeric_literal_prefix is called when exiting the bignumeric_literal_prefix production.
	ExitBignumeric_literal_prefix(c *Bignumeric_literal_prefixContext)

	// ExitNumeric_literal is called when exiting the numeric_literal production.
	ExitNumeric_literal(c *Numeric_literalContext)

	// ExitNumeric_literal_prefix is called when exiting the numeric_literal_prefix production.
	ExitNumeric_literal_prefix(c *Numeric_literal_prefixContext)

	// ExitInteger_literal is called when exiting the integer_literal production.
	ExitInteger_literal(c *Integer_literalContext)

	// ExitBytes_literal is called when exiting the bytes_literal production.
	ExitBytes_literal(c *Bytes_literalContext)

	// ExitNull_literal is called when exiting the null_literal production.
	ExitNull_literal(c *Null_literalContext)

	// ExitBoolean_literal is called when exiting the boolean_literal production.
	ExitBoolean_literal(c *Boolean_literalContext)

	// ExitString_literal is called when exiting the string_literal production.
	ExitString_literal(c *String_literalContext)

	// ExitString_literal_component is called when exiting the string_literal_component production.
	ExitString_literal_component(c *String_literal_componentContext)

	// ExitBytes_literal_component is called when exiting the bytes_literal_component production.
	ExitBytes_literal_component(c *Bytes_literal_componentContext)
}
