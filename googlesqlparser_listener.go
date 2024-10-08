// Code generated from GoogleSQLParser.g4 by ANTLR 4.13.1. DO NOT EDIT.

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

	// EnterQuery_statement is called when entering the query_statement production.
	EnterQuery_statement(c *Query_statementContext)

	// EnterQuery_expr is called when entering the query_expr production.
	EnterQuery_expr(c *Query_exprContext)

	// EnterQuery_primary is called when entering the query_primary production.
	EnterQuery_primary(c *Query_primaryContext)

	// EnterLimit_clause is called when entering the limit_clause production.
	EnterLimit_clause(c *Limit_clauseContext)

	// EnterOrder_by_clause is called when entering the order_by_clause production.
	EnterOrder_by_clause(c *Order_by_clauseContext)

	// EnterOrder_by_expr_list is called when entering the order_by_expr_list production.
	EnterOrder_by_expr_list(c *Order_by_expr_listContext)

	// EnterOrder_by_expr_list_item is called when entering the order_by_expr_list_item production.
	EnterOrder_by_expr_list_item(c *Order_by_expr_list_itemContext)

	// EnterSet_operator is called when entering the set_operator production.
	EnterSet_operator(c *Set_operatorContext)

	// EnterSelect is called when entering the select production.
	EnterSelect(c *SelectContext)

	// EnterFrom_clause is called when entering the from_clause production.
	EnterFrom_clause(c *From_clauseContext)

	// EnterTablesample_operator is called when entering the tablesample_operator production.
	EnterTablesample_operator(c *Tablesample_operatorContext)

	// EnterUnpivot_operator is called when entering the unpivot_operator production.
	EnterUnpivot_operator(c *Unpivot_operatorContext)

	// EnterSingle_column_unpivot is called when entering the single_column_unpivot production.
	EnterSingle_column_unpivot(c *Single_column_unpivotContext)

	// EnterMulti_column_unpivot is called when entering the multi_column_unpivot production.
	EnterMulti_column_unpivot(c *Multi_column_unpivotContext)

	// EnterValues_column_set is called when entering the values_column_set production.
	EnterValues_column_set(c *Values_column_setContext)

	// EnterColumns_to_unpivot_list is called when entering the columns_to_unpivot_list production.
	EnterColumns_to_unpivot_list(c *Columns_to_unpivot_listContext)

	// EnterColumns_to_unpivot_item is called when entering the columns_to_unpivot_item production.
	EnterColumns_to_unpivot_item(c *Columns_to_unpivot_itemContext)

	// EnterColumn_sets_to_unpivot is called when entering the column_sets_to_unpivot production.
	EnterColumn_sets_to_unpivot(c *Column_sets_to_unpivotContext)

	// EnterPivot_operator is called when entering the pivot_operator production.
	EnterPivot_operator(c *Pivot_operatorContext)

	// EnterPivot_column_as_alias_list is called when entering the pivot_column_as_alias_list production.
	EnterPivot_column_as_alias_list(c *Pivot_column_as_alias_listContext)

	// EnterPivot_column_as_alias_list_item is called when entering the pivot_column_as_alias_list_item production.
	EnterPivot_column_as_alias_list_item(c *Pivot_column_as_alias_list_itemContext)

	// EnterAggregate_function_call_as_alias_list is called when entering the aggregate_function_call_as_alias_list production.
	EnterAggregate_function_call_as_alias_list(c *Aggregate_function_call_as_alias_listContext)

	// EnterAggregate_function_call_as_alias_list_item is called when entering the aggregate_function_call_as_alias_list_item production.
	EnterAggregate_function_call_as_alias_list_item(c *Aggregate_function_call_as_alias_list_itemContext)

	// EnterFrom_item is called when entering the from_item production.
	EnterFrom_item(c *From_itemContext)

	// EnterUnnest_operator is called when entering the unnest_operator production.
	EnterUnnest_operator(c *Unnest_operatorContext)

	// EnterCross_join_operator is called when entering the cross_join_operator production.
	EnterCross_join_operator(c *Cross_join_operatorContext)

	// EnterConditional_join_operator is called when entering the conditional_join_operator production.
	EnterConditional_join_operator(c *Conditional_join_operatorContext)

	// EnterJoin_condition is called when entering the join_condition production.
	EnterJoin_condition(c *Join_conditionContext)

	// EnterOn_clause is called when entering the on_clause production.
	EnterOn_clause(c *On_clauseContext)

	// EnterUsing_clause is called when entering the using_clause production.
	EnterUsing_clause(c *Using_clauseContext)

	// EnterSelect_list is called when entering the select_list production.
	EnterSelect_list(c *Select_listContext)

	// EnterSelect_list_item is called when entering the select_list_item production.
	EnterSelect_list_item(c *Select_list_itemContext)

	// EnterSelect_expression is called when entering the select_expression production.
	EnterSelect_expression(c *Select_expressionContext)

	// EnterSelect_all is called when entering the select_all production.
	EnterSelect_all(c *Select_allContext)

	// EnterSelect_all_except_clause is called when entering the select_all_except_clause production.
	EnterSelect_all_except_clause(c *Select_all_except_clauseContext)

	// EnterSelect_all_replace_clause is called when entering the select_all_replace_clause production.
	EnterSelect_all_replace_clause(c *Select_all_replace_clauseContext)

	// EnterColumn_name_list is called when entering the column_name_list production.
	EnterColumn_name_list(c *Column_name_listContext)

	// EnterExpr_as_alias_list is called when entering the expr_as_alias_list production.
	EnterExpr_as_alias_list(c *Expr_as_alias_listContext)

	// EnterExpr_as_alias_item is called when entering the expr_as_alias_item production.
	EnterExpr_as_alias_item(c *Expr_as_alias_itemContext)

	// EnterAs_alias is called when entering the as_alias production.
	EnterAs_alias(c *As_aliasContext)

	// EnterDifferential_privacy_clause is called when entering the differential_privacy_clause production.
	EnterDifferential_privacy_clause(c *Differential_privacy_clauseContext)

	// EnterPrivacy_parameters is called when entering the privacy_parameters production.
	EnterPrivacy_parameters(c *Privacy_parametersContext)

	// EnterWith_statement is called when entering the with_statement production.
	EnterWith_statement(c *With_statementContext)

	// EnterCte is called when entering the cte production.
	EnterCte(c *CteContext)

	// EnterNon_recursive_cte is called when entering the non_recursive_cte production.
	EnterNon_recursive_cte(c *Non_recursive_cteContext)

	// EnterRecursive_cte is called when entering the recursive_cte production.
	EnterRecursive_cte(c *Recursive_cteContext)

	// EnterRecursive_union_operation is called when entering the recursive_union_operation production.
	EnterRecursive_union_operation(c *Recursive_union_operationContext)

	// EnterBase_term is called when entering the base_term production.
	EnterBase_term(c *Base_termContext)

	// EnterUnion_operator is called when entering the union_operator production.
	EnterUnion_operator(c *Union_operatorContext)

	// EnterRecursive_term is called when entering the recursive_term production.
	EnterRecursive_term(c *Recursive_termContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterExpression_higher_prec_than_and is called when entering the expression_higher_prec_than_and production.
	EnterExpression_higher_prec_than_and(c *Expression_higher_prec_than_andContext)

	// EnterUnparenthesized_expression_higher_prec_than_and is called when entering the unparenthesized_expression_higher_prec_than_and production.
	EnterUnparenthesized_expression_higher_prec_than_and(c *Unparenthesized_expression_higher_prec_than_andContext)

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

	// EnterBoolean_literal is called when entering the boolean_literal production.
	EnterBoolean_literal(c *Boolean_literalContext)

	// EnterString_literal is called when entering the string_literal production.
	EnterString_literal(c *String_literalContext)

	// EnterString_literal_component is called when entering the string_literal_component production.
	EnterString_literal_component(c *String_literal_componentContext)

	// EnterBytes_literal_component is called when entering the bytes_literal_component production.
	EnterBytes_literal_component(c *Bytes_literal_componentContext)

	// EnterCount is called when entering the count production.
	EnterCount(c *CountContext)

	// EnterSkip_rows is called when entering the skip_rows production.
	EnterSkip_rows(c *Skip_rowsContext)

	// EnterName is called when entering the name production.
	EnterName(c *NameContext)

	// EnterCte_name is called when entering the cte_name production.
	EnterCte_name(c *Cte_nameContext)

	// EnterColumn_name is called when entering the column_name production.
	EnterColumn_name(c *Column_nameContext)

	// EnterAlias_name is called when entering the alias_name production.
	EnterAlias_name(c *Alias_nameContext)

	// EnterTable_name is called when entering the table_name production.
	EnterTable_name(c *Table_nameContext)

	// EnterNumber is called when entering the number production.
	EnterNumber(c *NumberContext)

	// EnterInteger_type is called when entering the integer_type production.
	EnterInteger_type(c *Integer_typeContext)

	// EnterFloat_type is called when entering the float_type production.
	EnterFloat_type(c *Float_typeContext)

	// ExitRoot is called when exiting the root production.
	ExitRoot(c *RootContext)

	// ExitStmts is called when exiting the stmts production.
	ExitStmts(c *StmtsContext)

	// ExitStmt is called when exiting the stmt production.
	ExitStmt(c *StmtContext)

	// ExitQuery_statement is called when exiting the query_statement production.
	ExitQuery_statement(c *Query_statementContext)

	// ExitQuery_expr is called when exiting the query_expr production.
	ExitQuery_expr(c *Query_exprContext)

	// ExitQuery_primary is called when exiting the query_primary production.
	ExitQuery_primary(c *Query_primaryContext)

	// ExitLimit_clause is called when exiting the limit_clause production.
	ExitLimit_clause(c *Limit_clauseContext)

	// ExitOrder_by_clause is called when exiting the order_by_clause production.
	ExitOrder_by_clause(c *Order_by_clauseContext)

	// ExitOrder_by_expr_list is called when exiting the order_by_expr_list production.
	ExitOrder_by_expr_list(c *Order_by_expr_listContext)

	// ExitOrder_by_expr_list_item is called when exiting the order_by_expr_list_item production.
	ExitOrder_by_expr_list_item(c *Order_by_expr_list_itemContext)

	// ExitSet_operator is called when exiting the set_operator production.
	ExitSet_operator(c *Set_operatorContext)

	// ExitSelect is called when exiting the select production.
	ExitSelect(c *SelectContext)

	// ExitFrom_clause is called when exiting the from_clause production.
	ExitFrom_clause(c *From_clauseContext)

	// ExitTablesample_operator is called when exiting the tablesample_operator production.
	ExitTablesample_operator(c *Tablesample_operatorContext)

	// ExitUnpivot_operator is called when exiting the unpivot_operator production.
	ExitUnpivot_operator(c *Unpivot_operatorContext)

	// ExitSingle_column_unpivot is called when exiting the single_column_unpivot production.
	ExitSingle_column_unpivot(c *Single_column_unpivotContext)

	// ExitMulti_column_unpivot is called when exiting the multi_column_unpivot production.
	ExitMulti_column_unpivot(c *Multi_column_unpivotContext)

	// ExitValues_column_set is called when exiting the values_column_set production.
	ExitValues_column_set(c *Values_column_setContext)

	// ExitColumns_to_unpivot_list is called when exiting the columns_to_unpivot_list production.
	ExitColumns_to_unpivot_list(c *Columns_to_unpivot_listContext)

	// ExitColumns_to_unpivot_item is called when exiting the columns_to_unpivot_item production.
	ExitColumns_to_unpivot_item(c *Columns_to_unpivot_itemContext)

	// ExitColumn_sets_to_unpivot is called when exiting the column_sets_to_unpivot production.
	ExitColumn_sets_to_unpivot(c *Column_sets_to_unpivotContext)

	// ExitPivot_operator is called when exiting the pivot_operator production.
	ExitPivot_operator(c *Pivot_operatorContext)

	// ExitPivot_column_as_alias_list is called when exiting the pivot_column_as_alias_list production.
	ExitPivot_column_as_alias_list(c *Pivot_column_as_alias_listContext)

	// ExitPivot_column_as_alias_list_item is called when exiting the pivot_column_as_alias_list_item production.
	ExitPivot_column_as_alias_list_item(c *Pivot_column_as_alias_list_itemContext)

	// ExitAggregate_function_call_as_alias_list is called when exiting the aggregate_function_call_as_alias_list production.
	ExitAggregate_function_call_as_alias_list(c *Aggregate_function_call_as_alias_listContext)

	// ExitAggregate_function_call_as_alias_list_item is called when exiting the aggregate_function_call_as_alias_list_item production.
	ExitAggregate_function_call_as_alias_list_item(c *Aggregate_function_call_as_alias_list_itemContext)

	// ExitFrom_item is called when exiting the from_item production.
	ExitFrom_item(c *From_itemContext)

	// ExitUnnest_operator is called when exiting the unnest_operator production.
	ExitUnnest_operator(c *Unnest_operatorContext)

	// ExitCross_join_operator is called when exiting the cross_join_operator production.
	ExitCross_join_operator(c *Cross_join_operatorContext)

	// ExitConditional_join_operator is called when exiting the conditional_join_operator production.
	ExitConditional_join_operator(c *Conditional_join_operatorContext)

	// ExitJoin_condition is called when exiting the join_condition production.
	ExitJoin_condition(c *Join_conditionContext)

	// ExitOn_clause is called when exiting the on_clause production.
	ExitOn_clause(c *On_clauseContext)

	// ExitUsing_clause is called when exiting the using_clause production.
	ExitUsing_clause(c *Using_clauseContext)

	// ExitSelect_list is called when exiting the select_list production.
	ExitSelect_list(c *Select_listContext)

	// ExitSelect_list_item is called when exiting the select_list_item production.
	ExitSelect_list_item(c *Select_list_itemContext)

	// ExitSelect_expression is called when exiting the select_expression production.
	ExitSelect_expression(c *Select_expressionContext)

	// ExitSelect_all is called when exiting the select_all production.
	ExitSelect_all(c *Select_allContext)

	// ExitSelect_all_except_clause is called when exiting the select_all_except_clause production.
	ExitSelect_all_except_clause(c *Select_all_except_clauseContext)

	// ExitSelect_all_replace_clause is called when exiting the select_all_replace_clause production.
	ExitSelect_all_replace_clause(c *Select_all_replace_clauseContext)

	// ExitColumn_name_list is called when exiting the column_name_list production.
	ExitColumn_name_list(c *Column_name_listContext)

	// ExitExpr_as_alias_list is called when exiting the expr_as_alias_list production.
	ExitExpr_as_alias_list(c *Expr_as_alias_listContext)

	// ExitExpr_as_alias_item is called when exiting the expr_as_alias_item production.
	ExitExpr_as_alias_item(c *Expr_as_alias_itemContext)

	// ExitAs_alias is called when exiting the as_alias production.
	ExitAs_alias(c *As_aliasContext)

	// ExitDifferential_privacy_clause is called when exiting the differential_privacy_clause production.
	ExitDifferential_privacy_clause(c *Differential_privacy_clauseContext)

	// ExitPrivacy_parameters is called when exiting the privacy_parameters production.
	ExitPrivacy_parameters(c *Privacy_parametersContext)

	// ExitWith_statement is called when exiting the with_statement production.
	ExitWith_statement(c *With_statementContext)

	// ExitCte is called when exiting the cte production.
	ExitCte(c *CteContext)

	// ExitNon_recursive_cte is called when exiting the non_recursive_cte production.
	ExitNon_recursive_cte(c *Non_recursive_cteContext)

	// ExitRecursive_cte is called when exiting the recursive_cte production.
	ExitRecursive_cte(c *Recursive_cteContext)

	// ExitRecursive_union_operation is called when exiting the recursive_union_operation production.
	ExitRecursive_union_operation(c *Recursive_union_operationContext)

	// ExitBase_term is called when exiting the base_term production.
	ExitBase_term(c *Base_termContext)

	// ExitUnion_operator is called when exiting the union_operator production.
	ExitUnion_operator(c *Union_operatorContext)

	// ExitRecursive_term is called when exiting the recursive_term production.
	ExitRecursive_term(c *Recursive_termContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitExpression_higher_prec_than_and is called when exiting the expression_higher_prec_than_and production.
	ExitExpression_higher_prec_than_and(c *Expression_higher_prec_than_andContext)

	// ExitUnparenthesized_expression_higher_prec_than_and is called when exiting the unparenthesized_expression_higher_prec_than_and production.
	ExitUnparenthesized_expression_higher_prec_than_and(c *Unparenthesized_expression_higher_prec_than_andContext)

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

	// ExitBoolean_literal is called when exiting the boolean_literal production.
	ExitBoolean_literal(c *Boolean_literalContext)

	// ExitString_literal is called when exiting the string_literal production.
	ExitString_literal(c *String_literalContext)

	// ExitString_literal_component is called when exiting the string_literal_component production.
	ExitString_literal_component(c *String_literal_componentContext)

	// ExitBytes_literal_component is called when exiting the bytes_literal_component production.
	ExitBytes_literal_component(c *Bytes_literal_componentContext)

	// ExitCount is called when exiting the count production.
	ExitCount(c *CountContext)

	// ExitSkip_rows is called when exiting the skip_rows production.
	ExitSkip_rows(c *Skip_rowsContext)

	// ExitName is called when exiting the name production.
	ExitName(c *NameContext)

	// ExitCte_name is called when exiting the cte_name production.
	ExitCte_name(c *Cte_nameContext)

	// ExitColumn_name is called when exiting the column_name production.
	ExitColumn_name(c *Column_nameContext)

	// ExitAlias_name is called when exiting the alias_name production.
	ExitAlias_name(c *Alias_nameContext)

	// ExitTable_name is called when exiting the table_name production.
	ExitTable_name(c *Table_nameContext)

	// ExitNumber is called when exiting the number production.
	ExitNumber(c *NumberContext)

	// ExitInteger_type is called when exiting the integer_type production.
	ExitInteger_type(c *Integer_typeContext)

	// ExitFloat_type is called when exiting the float_type production.
	ExitFloat_type(c *Float_typeContext)
}
