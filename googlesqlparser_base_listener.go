// Code generated from GoogleSQLParser.g4 by ANTLR 4.13.1. DO NOT EDIT.

package parser // GoogleSQLParser
import "github.com/antlr4-go/antlr/v4"

// BaseGoogleSQLParserListener is a complete listener for a parse tree produced by GoogleSQLParser.
type BaseGoogleSQLParserListener struct{}

var _ GoogleSQLParserListener = &BaseGoogleSQLParserListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseGoogleSQLParserListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseGoogleSQLParserListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseGoogleSQLParserListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseGoogleSQLParserListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterRoot is called when production root is entered.
func (s *BaseGoogleSQLParserListener) EnterRoot(ctx *RootContext) {}

// ExitRoot is called when production root is exited.
func (s *BaseGoogleSQLParserListener) ExitRoot(ctx *RootContext) {}

// EnterStmts is called when production stmts is entered.
func (s *BaseGoogleSQLParserListener) EnterStmts(ctx *StmtsContext) {}

// ExitStmts is called when production stmts is exited.
func (s *BaseGoogleSQLParserListener) ExitStmts(ctx *StmtsContext) {}

// EnterStmt is called when production stmt is entered.
func (s *BaseGoogleSQLParserListener) EnterStmt(ctx *StmtContext) {}

// ExitStmt is called when production stmt is exited.
func (s *BaseGoogleSQLParserListener) ExitStmt(ctx *StmtContext) {}

// EnterQuery_statement is called when production query_statement is entered.
func (s *BaseGoogleSQLParserListener) EnterQuery_statement(ctx *Query_statementContext) {}

// ExitQuery_statement is called when production query_statement is exited.
func (s *BaseGoogleSQLParserListener) ExitQuery_statement(ctx *Query_statementContext) {}

// EnterQuery_expr is called when production query_expr is entered.
func (s *BaseGoogleSQLParserListener) EnterQuery_expr(ctx *Query_exprContext) {}

// ExitQuery_expr is called when production query_expr is exited.
func (s *BaseGoogleSQLParserListener) ExitQuery_expr(ctx *Query_exprContext) {}

// EnterQuery_primary is called when production query_primary is entered.
func (s *BaseGoogleSQLParserListener) EnterQuery_primary(ctx *Query_primaryContext) {}

// ExitQuery_primary is called when production query_primary is exited.
func (s *BaseGoogleSQLParserListener) ExitQuery_primary(ctx *Query_primaryContext) {}

// EnterLimit_clause is called when production limit_clause is entered.
func (s *BaseGoogleSQLParserListener) EnterLimit_clause(ctx *Limit_clauseContext) {}

// ExitLimit_clause is called when production limit_clause is exited.
func (s *BaseGoogleSQLParserListener) ExitLimit_clause(ctx *Limit_clauseContext) {}

// EnterOrder_by_clause is called when production order_by_clause is entered.
func (s *BaseGoogleSQLParserListener) EnterOrder_by_clause(ctx *Order_by_clauseContext) {}

// ExitOrder_by_clause is called when production order_by_clause is exited.
func (s *BaseGoogleSQLParserListener) ExitOrder_by_clause(ctx *Order_by_clauseContext) {}

// EnterOrder_by_expr_list is called when production order_by_expr_list is entered.
func (s *BaseGoogleSQLParserListener) EnterOrder_by_expr_list(ctx *Order_by_expr_listContext) {}

// ExitOrder_by_expr_list is called when production order_by_expr_list is exited.
func (s *BaseGoogleSQLParserListener) ExitOrder_by_expr_list(ctx *Order_by_expr_listContext) {}

// EnterOrder_by_expr_list_item is called when production order_by_expr_list_item is entered.
func (s *BaseGoogleSQLParserListener) EnterOrder_by_expr_list_item(ctx *Order_by_expr_list_itemContext) {
}

// ExitOrder_by_expr_list_item is called when production order_by_expr_list_item is exited.
func (s *BaseGoogleSQLParserListener) ExitOrder_by_expr_list_item(ctx *Order_by_expr_list_itemContext) {
}

// EnterSet_operator is called when production set_operator is entered.
func (s *BaseGoogleSQLParserListener) EnterSet_operator(ctx *Set_operatorContext) {}

// ExitSet_operator is called when production set_operator is exited.
func (s *BaseGoogleSQLParserListener) ExitSet_operator(ctx *Set_operatorContext) {}

// EnterSelect is called when production select is entered.
func (s *BaseGoogleSQLParserListener) EnterSelect(ctx *SelectContext) {}

// ExitSelect is called when production select is exited.
func (s *BaseGoogleSQLParserListener) ExitSelect(ctx *SelectContext) {}

// EnterFrom_clause is called when production from_clause is entered.
func (s *BaseGoogleSQLParserListener) EnterFrom_clause(ctx *From_clauseContext) {}

// ExitFrom_clause is called when production from_clause is exited.
func (s *BaseGoogleSQLParserListener) ExitFrom_clause(ctx *From_clauseContext) {}

// EnterTablesample_operator is called when production tablesample_operator is entered.
func (s *BaseGoogleSQLParserListener) EnterTablesample_operator(ctx *Tablesample_operatorContext) {}

// ExitTablesample_operator is called when production tablesample_operator is exited.
func (s *BaseGoogleSQLParserListener) ExitTablesample_operator(ctx *Tablesample_operatorContext) {}

// EnterUnpivot_operator is called when production unpivot_operator is entered.
func (s *BaseGoogleSQLParserListener) EnterUnpivot_operator(ctx *Unpivot_operatorContext) {}

// ExitUnpivot_operator is called when production unpivot_operator is exited.
func (s *BaseGoogleSQLParserListener) ExitUnpivot_operator(ctx *Unpivot_operatorContext) {}

// EnterSingle_column_unpivot is called when production single_column_unpivot is entered.
func (s *BaseGoogleSQLParserListener) EnterSingle_column_unpivot(ctx *Single_column_unpivotContext) {}

// ExitSingle_column_unpivot is called when production single_column_unpivot is exited.
func (s *BaseGoogleSQLParserListener) ExitSingle_column_unpivot(ctx *Single_column_unpivotContext) {}

// EnterMulti_column_unpivot is called when production multi_column_unpivot is entered.
func (s *BaseGoogleSQLParserListener) EnterMulti_column_unpivot(ctx *Multi_column_unpivotContext) {}

// ExitMulti_column_unpivot is called when production multi_column_unpivot is exited.
func (s *BaseGoogleSQLParserListener) ExitMulti_column_unpivot(ctx *Multi_column_unpivotContext) {}

// EnterValues_column_set is called when production values_column_set is entered.
func (s *BaseGoogleSQLParserListener) EnterValues_column_set(ctx *Values_column_setContext) {}

// ExitValues_column_set is called when production values_column_set is exited.
func (s *BaseGoogleSQLParserListener) ExitValues_column_set(ctx *Values_column_setContext) {}

// EnterColumns_to_unpivot_list is called when production columns_to_unpivot_list is entered.
func (s *BaseGoogleSQLParserListener) EnterColumns_to_unpivot_list(ctx *Columns_to_unpivot_listContext) {
}

// ExitColumns_to_unpivot_list is called when production columns_to_unpivot_list is exited.
func (s *BaseGoogleSQLParserListener) ExitColumns_to_unpivot_list(ctx *Columns_to_unpivot_listContext) {
}

// EnterColumns_to_unpivot_item is called when production columns_to_unpivot_item is entered.
func (s *BaseGoogleSQLParserListener) EnterColumns_to_unpivot_item(ctx *Columns_to_unpivot_itemContext) {
}

// ExitColumns_to_unpivot_item is called when production columns_to_unpivot_item is exited.
func (s *BaseGoogleSQLParserListener) ExitColumns_to_unpivot_item(ctx *Columns_to_unpivot_itemContext) {
}

// EnterColumn_sets_to_unpivot is called when production column_sets_to_unpivot is entered.
func (s *BaseGoogleSQLParserListener) EnterColumn_sets_to_unpivot(ctx *Column_sets_to_unpivotContext) {
}

// ExitColumn_sets_to_unpivot is called when production column_sets_to_unpivot is exited.
func (s *BaseGoogleSQLParserListener) ExitColumn_sets_to_unpivot(ctx *Column_sets_to_unpivotContext) {
}

// EnterPivot_operator is called when production pivot_operator is entered.
func (s *BaseGoogleSQLParserListener) EnterPivot_operator(ctx *Pivot_operatorContext) {}

// ExitPivot_operator is called when production pivot_operator is exited.
func (s *BaseGoogleSQLParserListener) ExitPivot_operator(ctx *Pivot_operatorContext) {}

// EnterPivot_column_as_alias_list is called when production pivot_column_as_alias_list is entered.
func (s *BaseGoogleSQLParserListener) EnterPivot_column_as_alias_list(ctx *Pivot_column_as_alias_listContext) {
}

// ExitPivot_column_as_alias_list is called when production pivot_column_as_alias_list is exited.
func (s *BaseGoogleSQLParserListener) ExitPivot_column_as_alias_list(ctx *Pivot_column_as_alias_listContext) {
}

// EnterPivot_column_as_alias_list_item is called when production pivot_column_as_alias_list_item is entered.
func (s *BaseGoogleSQLParserListener) EnterPivot_column_as_alias_list_item(ctx *Pivot_column_as_alias_list_itemContext) {
}

// ExitPivot_column_as_alias_list_item is called when production pivot_column_as_alias_list_item is exited.
func (s *BaseGoogleSQLParserListener) ExitPivot_column_as_alias_list_item(ctx *Pivot_column_as_alias_list_itemContext) {
}

// EnterAggregate_function_call_as_alias_list is called when production aggregate_function_call_as_alias_list is entered.
func (s *BaseGoogleSQLParserListener) EnterAggregate_function_call_as_alias_list(ctx *Aggregate_function_call_as_alias_listContext) {
}

// ExitAggregate_function_call_as_alias_list is called when production aggregate_function_call_as_alias_list is exited.
func (s *BaseGoogleSQLParserListener) ExitAggregate_function_call_as_alias_list(ctx *Aggregate_function_call_as_alias_listContext) {
}

// EnterAggregate_function_call_as_alias_list_item is called when production aggregate_function_call_as_alias_list_item is entered.
func (s *BaseGoogleSQLParserListener) EnterAggregate_function_call_as_alias_list_item(ctx *Aggregate_function_call_as_alias_list_itemContext) {
}

// ExitAggregate_function_call_as_alias_list_item is called when production aggregate_function_call_as_alias_list_item is exited.
func (s *BaseGoogleSQLParserListener) ExitAggregate_function_call_as_alias_list_item(ctx *Aggregate_function_call_as_alias_list_itemContext) {
}

// EnterFrom_item is called when production from_item is entered.
func (s *BaseGoogleSQLParserListener) EnterFrom_item(ctx *From_itemContext) {}

// ExitFrom_item is called when production from_item is exited.
func (s *BaseGoogleSQLParserListener) ExitFrom_item(ctx *From_itemContext) {}

// EnterUnnest_operator is called when production unnest_operator is entered.
func (s *BaseGoogleSQLParserListener) EnterUnnest_operator(ctx *Unnest_operatorContext) {}

// ExitUnnest_operator is called when production unnest_operator is exited.
func (s *BaseGoogleSQLParserListener) ExitUnnest_operator(ctx *Unnest_operatorContext) {}

// EnterCross_join_operator is called when production cross_join_operator is entered.
func (s *BaseGoogleSQLParserListener) EnterCross_join_operator(ctx *Cross_join_operatorContext) {}

// ExitCross_join_operator is called when production cross_join_operator is exited.
func (s *BaseGoogleSQLParserListener) ExitCross_join_operator(ctx *Cross_join_operatorContext) {}

// EnterConditional_join_operator is called when production conditional_join_operator is entered.
func (s *BaseGoogleSQLParserListener) EnterConditional_join_operator(ctx *Conditional_join_operatorContext) {
}

// ExitConditional_join_operator is called when production conditional_join_operator is exited.
func (s *BaseGoogleSQLParserListener) ExitConditional_join_operator(ctx *Conditional_join_operatorContext) {
}

// EnterJoin_condition is called when production join_condition is entered.
func (s *BaseGoogleSQLParserListener) EnterJoin_condition(ctx *Join_conditionContext) {}

// ExitJoin_condition is called when production join_condition is exited.
func (s *BaseGoogleSQLParserListener) ExitJoin_condition(ctx *Join_conditionContext) {}

// EnterOn_clause is called when production on_clause is entered.
func (s *BaseGoogleSQLParserListener) EnterOn_clause(ctx *On_clauseContext) {}

// ExitOn_clause is called when production on_clause is exited.
func (s *BaseGoogleSQLParserListener) ExitOn_clause(ctx *On_clauseContext) {}

// EnterUsing_clause is called when production using_clause is entered.
func (s *BaseGoogleSQLParserListener) EnterUsing_clause(ctx *Using_clauseContext) {}

// ExitUsing_clause is called when production using_clause is exited.
func (s *BaseGoogleSQLParserListener) ExitUsing_clause(ctx *Using_clauseContext) {}

// EnterSelect_list is called when production select_list is entered.
func (s *BaseGoogleSQLParserListener) EnterSelect_list(ctx *Select_listContext) {}

// ExitSelect_list is called when production select_list is exited.
func (s *BaseGoogleSQLParserListener) ExitSelect_list(ctx *Select_listContext) {}

// EnterSelect_list_item is called when production select_list_item is entered.
func (s *BaseGoogleSQLParserListener) EnterSelect_list_item(ctx *Select_list_itemContext) {}

// ExitSelect_list_item is called when production select_list_item is exited.
func (s *BaseGoogleSQLParserListener) ExitSelect_list_item(ctx *Select_list_itemContext) {}

// EnterSelect_expression is called when production select_expression is entered.
func (s *BaseGoogleSQLParserListener) EnterSelect_expression(ctx *Select_expressionContext) {}

// ExitSelect_expression is called when production select_expression is exited.
func (s *BaseGoogleSQLParserListener) ExitSelect_expression(ctx *Select_expressionContext) {}

// EnterSelect_all is called when production select_all is entered.
func (s *BaseGoogleSQLParserListener) EnterSelect_all(ctx *Select_allContext) {}

// ExitSelect_all is called when production select_all is exited.
func (s *BaseGoogleSQLParserListener) ExitSelect_all(ctx *Select_allContext) {}

// EnterSelect_all_except_clause is called when production select_all_except_clause is entered.
func (s *BaseGoogleSQLParserListener) EnterSelect_all_except_clause(ctx *Select_all_except_clauseContext) {
}

// ExitSelect_all_except_clause is called when production select_all_except_clause is exited.
func (s *BaseGoogleSQLParserListener) ExitSelect_all_except_clause(ctx *Select_all_except_clauseContext) {
}

// EnterSelect_all_replace_clause is called when production select_all_replace_clause is entered.
func (s *BaseGoogleSQLParserListener) EnterSelect_all_replace_clause(ctx *Select_all_replace_clauseContext) {
}

// ExitSelect_all_replace_clause is called when production select_all_replace_clause is exited.
func (s *BaseGoogleSQLParserListener) ExitSelect_all_replace_clause(ctx *Select_all_replace_clauseContext) {
}

// EnterColumn_name_list is called when production column_name_list is entered.
func (s *BaseGoogleSQLParserListener) EnterColumn_name_list(ctx *Column_name_listContext) {}

// ExitColumn_name_list is called when production column_name_list is exited.
func (s *BaseGoogleSQLParserListener) ExitColumn_name_list(ctx *Column_name_listContext) {}

// EnterExpr_as_alias_list is called when production expr_as_alias_list is entered.
func (s *BaseGoogleSQLParserListener) EnterExpr_as_alias_list(ctx *Expr_as_alias_listContext) {}

// ExitExpr_as_alias_list is called when production expr_as_alias_list is exited.
func (s *BaseGoogleSQLParserListener) ExitExpr_as_alias_list(ctx *Expr_as_alias_listContext) {}

// EnterExpr_as_alias_item is called when production expr_as_alias_item is entered.
func (s *BaseGoogleSQLParserListener) EnterExpr_as_alias_item(ctx *Expr_as_alias_itemContext) {}

// ExitExpr_as_alias_item is called when production expr_as_alias_item is exited.
func (s *BaseGoogleSQLParserListener) ExitExpr_as_alias_item(ctx *Expr_as_alias_itemContext) {}

// EnterAs_alias is called when production as_alias is entered.
func (s *BaseGoogleSQLParserListener) EnterAs_alias(ctx *As_aliasContext) {}

// ExitAs_alias is called when production as_alias is exited.
func (s *BaseGoogleSQLParserListener) ExitAs_alias(ctx *As_aliasContext) {}

// EnterDifferential_privacy_clause is called when production differential_privacy_clause is entered.
func (s *BaseGoogleSQLParserListener) EnterDifferential_privacy_clause(ctx *Differential_privacy_clauseContext) {
}

// ExitDifferential_privacy_clause is called when production differential_privacy_clause is exited.
func (s *BaseGoogleSQLParserListener) ExitDifferential_privacy_clause(ctx *Differential_privacy_clauseContext) {
}

// EnterPrivacy_parameters is called when production privacy_parameters is entered.
func (s *BaseGoogleSQLParserListener) EnterPrivacy_parameters(ctx *Privacy_parametersContext) {}

// ExitPrivacy_parameters is called when production privacy_parameters is exited.
func (s *BaseGoogleSQLParserListener) ExitPrivacy_parameters(ctx *Privacy_parametersContext) {}

// EnterWith_statement is called when production with_statement is entered.
func (s *BaseGoogleSQLParserListener) EnterWith_statement(ctx *With_statementContext) {}

// ExitWith_statement is called when production with_statement is exited.
func (s *BaseGoogleSQLParserListener) ExitWith_statement(ctx *With_statementContext) {}

// EnterCte is called when production cte is entered.
func (s *BaseGoogleSQLParserListener) EnterCte(ctx *CteContext) {}

// ExitCte is called when production cte is exited.
func (s *BaseGoogleSQLParserListener) ExitCte(ctx *CteContext) {}

// EnterNon_recursive_cte is called when production non_recursive_cte is entered.
func (s *BaseGoogleSQLParserListener) EnterNon_recursive_cte(ctx *Non_recursive_cteContext) {}

// ExitNon_recursive_cte is called when production non_recursive_cte is exited.
func (s *BaseGoogleSQLParserListener) ExitNon_recursive_cte(ctx *Non_recursive_cteContext) {}

// EnterRecursive_cte is called when production recursive_cte is entered.
func (s *BaseGoogleSQLParserListener) EnterRecursive_cte(ctx *Recursive_cteContext) {}

// ExitRecursive_cte is called when production recursive_cte is exited.
func (s *BaseGoogleSQLParserListener) ExitRecursive_cte(ctx *Recursive_cteContext) {}

// EnterRecursive_union_operation is called when production recursive_union_operation is entered.
func (s *BaseGoogleSQLParserListener) EnterRecursive_union_operation(ctx *Recursive_union_operationContext) {
}

// ExitRecursive_union_operation is called when production recursive_union_operation is exited.
func (s *BaseGoogleSQLParserListener) ExitRecursive_union_operation(ctx *Recursive_union_operationContext) {
}

// EnterBase_term is called when production base_term is entered.
func (s *BaseGoogleSQLParserListener) EnterBase_term(ctx *Base_termContext) {}

// ExitBase_term is called when production base_term is exited.
func (s *BaseGoogleSQLParserListener) ExitBase_term(ctx *Base_termContext) {}

// EnterUnion_operator is called when production union_operator is entered.
func (s *BaseGoogleSQLParserListener) EnterUnion_operator(ctx *Union_operatorContext) {}

// ExitUnion_operator is called when production union_operator is exited.
func (s *BaseGoogleSQLParserListener) ExitUnion_operator(ctx *Union_operatorContext) {}

// EnterRecursive_term is called when production recursive_term is entered.
func (s *BaseGoogleSQLParserListener) EnterRecursive_term(ctx *Recursive_termContext) {}

// ExitRecursive_term is called when production recursive_term is exited.
func (s *BaseGoogleSQLParserListener) ExitRecursive_term(ctx *Recursive_termContext) {}

// EnterExpression is called when production expression is entered.
func (s *BaseGoogleSQLParserListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseGoogleSQLParserListener) ExitExpression(ctx *ExpressionContext) {}

// EnterExpression_higher_prec_than_and is called when production expression_higher_prec_than_and is entered.
func (s *BaseGoogleSQLParserListener) EnterExpression_higher_prec_than_and(ctx *Expression_higher_prec_than_andContext) {
}

// ExitExpression_higher_prec_than_and is called when production expression_higher_prec_than_and is exited.
func (s *BaseGoogleSQLParserListener) ExitExpression_higher_prec_than_and(ctx *Expression_higher_prec_than_andContext) {
}

// EnterUnparenthesized_expression_higher_prec_than_and is called when production unparenthesized_expression_higher_prec_than_and is entered.
func (s *BaseGoogleSQLParserListener) EnterUnparenthesized_expression_higher_prec_than_and(ctx *Unparenthesized_expression_higher_prec_than_andContext) {
}

// ExitUnparenthesized_expression_higher_prec_than_and is called when production unparenthesized_expression_higher_prec_than_and is exited.
func (s *BaseGoogleSQLParserListener) ExitUnparenthesized_expression_higher_prec_than_and(ctx *Unparenthesized_expression_higher_prec_than_andContext) {
}

// EnterArray_constructor is called when production array_constructor is entered.
func (s *BaseGoogleSQLParserListener) EnterArray_constructor(ctx *Array_constructorContext) {}

// ExitArray_constructor is called when production array_constructor is exited.
func (s *BaseGoogleSQLParserListener) ExitArray_constructor(ctx *Array_constructorContext) {}

// EnterArray_constructor_prefix is called when production array_constructor_prefix is entered.
func (s *BaseGoogleSQLParserListener) EnterArray_constructor_prefix(ctx *Array_constructor_prefixContext) {
}

// ExitArray_constructor_prefix is called when production array_constructor_prefix is exited.
func (s *BaseGoogleSQLParserListener) ExitArray_constructor_prefix(ctx *Array_constructor_prefixContext) {
}

// EnterArray_constructor_prefix_no_expressions is called when production array_constructor_prefix_no_expressions is entered.
func (s *BaseGoogleSQLParserListener) EnterArray_constructor_prefix_no_expressions(ctx *Array_constructor_prefix_no_expressionsContext) {
}

// ExitArray_constructor_prefix_no_expressions is called when production array_constructor_prefix_no_expressions is exited.
func (s *BaseGoogleSQLParserListener) ExitArray_constructor_prefix_no_expressions(ctx *Array_constructor_prefix_no_expressionsContext) {
}

// EnterRange_literal is called when production range_literal is entered.
func (s *BaseGoogleSQLParserListener) EnterRange_literal(ctx *Range_literalContext) {}

// ExitRange_literal is called when production range_literal is exited.
func (s *BaseGoogleSQLParserListener) ExitRange_literal(ctx *Range_literalContext) {}

// EnterRange_type is called when production range_type is entered.
func (s *BaseGoogleSQLParserListener) EnterRange_type(ctx *Range_typeContext) {}

// ExitRange_type is called when production range_type is exited.
func (s *BaseGoogleSQLParserListener) ExitRange_type(ctx *Range_typeContext) {}

// EnterType is called when production type is entered.
func (s *BaseGoogleSQLParserListener) EnterType(ctx *TypeContext) {}

// ExitType is called when production type is exited.
func (s *BaseGoogleSQLParserListener) ExitType(ctx *TypeContext) {}

// EnterCollate_clause is called when production collate_clause is entered.
func (s *BaseGoogleSQLParserListener) EnterCollate_clause(ctx *Collate_clauseContext) {}

// ExitCollate_clause is called when production collate_clause is exited.
func (s *BaseGoogleSQLParserListener) ExitCollate_clause(ctx *Collate_clauseContext) {}

// EnterString_literal_or_parameter is called when production string_literal_or_parameter is entered.
func (s *BaseGoogleSQLParserListener) EnterString_literal_or_parameter(ctx *String_literal_or_parameterContext) {
}

// ExitString_literal_or_parameter is called when production string_literal_or_parameter is exited.
func (s *BaseGoogleSQLParserListener) ExitString_literal_or_parameter(ctx *String_literal_or_parameterContext) {
}

// EnterSystem_variable_expression is called when production system_variable_expression is entered.
func (s *BaseGoogleSQLParserListener) EnterSystem_variable_expression(ctx *System_variable_expressionContext) {
}

// ExitSystem_variable_expression is called when production system_variable_expression is exited.
func (s *BaseGoogleSQLParserListener) ExitSystem_variable_expression(ctx *System_variable_expressionContext) {
}

// EnterParameter_expression is called when production parameter_expression is entered.
func (s *BaseGoogleSQLParserListener) EnterParameter_expression(ctx *Parameter_expressionContext) {}

// ExitParameter_expression is called when production parameter_expression is exited.
func (s *BaseGoogleSQLParserListener) ExitParameter_expression(ctx *Parameter_expressionContext) {}

// EnterNamed_parameter_expression is called when production named_parameter_expression is entered.
func (s *BaseGoogleSQLParserListener) EnterNamed_parameter_expression(ctx *Named_parameter_expressionContext) {
}

// ExitNamed_parameter_expression is called when production named_parameter_expression is exited.
func (s *BaseGoogleSQLParserListener) ExitNamed_parameter_expression(ctx *Named_parameter_expressionContext) {
}

// EnterOpt_type_parameters is called when production opt_type_parameters is entered.
func (s *BaseGoogleSQLParserListener) EnterOpt_type_parameters(ctx *Opt_type_parametersContext) {}

// ExitOpt_type_parameters is called when production opt_type_parameters is exited.
func (s *BaseGoogleSQLParserListener) ExitOpt_type_parameters(ctx *Opt_type_parametersContext) {}

// EnterType_parameters_prefix is called when production type_parameters_prefix is entered.
func (s *BaseGoogleSQLParserListener) EnterType_parameters_prefix(ctx *Type_parameters_prefixContext) {
}

// ExitType_parameters_prefix is called when production type_parameters_prefix is exited.
func (s *BaseGoogleSQLParserListener) ExitType_parameters_prefix(ctx *Type_parameters_prefixContext) {
}

// EnterType_parameter is called when production type_parameter is entered.
func (s *BaseGoogleSQLParserListener) EnterType_parameter(ctx *Type_parameterContext) {}

// ExitType_parameter is called when production type_parameter is exited.
func (s *BaseGoogleSQLParserListener) ExitType_parameter(ctx *Type_parameterContext) {}

// EnterRaw_type is called when production raw_type is entered.
func (s *BaseGoogleSQLParserListener) EnterRaw_type(ctx *Raw_typeContext) {}

// ExitRaw_type is called when production raw_type is exited.
func (s *BaseGoogleSQLParserListener) ExitRaw_type(ctx *Raw_typeContext) {}

// EnterMap_type is called when production map_type is entered.
func (s *BaseGoogleSQLParserListener) EnterMap_type(ctx *Map_typeContext) {}

// ExitMap_type is called when production map_type is exited.
func (s *BaseGoogleSQLParserListener) ExitMap_type(ctx *Map_typeContext) {}

// EnterFunction_type is called when production function_type is entered.
func (s *BaseGoogleSQLParserListener) EnterFunction_type(ctx *Function_typeContext) {}

// ExitFunction_type is called when production function_type is exited.
func (s *BaseGoogleSQLParserListener) ExitFunction_type(ctx *Function_typeContext) {}

// EnterFunction_type_prefix is called when production function_type_prefix is entered.
func (s *BaseGoogleSQLParserListener) EnterFunction_type_prefix(ctx *Function_type_prefixContext) {}

// ExitFunction_type_prefix is called when production function_type_prefix is exited.
func (s *BaseGoogleSQLParserListener) ExitFunction_type_prefix(ctx *Function_type_prefixContext) {}

// EnterType_name is called when production type_name is entered.
func (s *BaseGoogleSQLParserListener) EnterType_name(ctx *Type_nameContext) {}

// ExitType_name is called when production type_name is exited.
func (s *BaseGoogleSQLParserListener) ExitType_name(ctx *Type_nameContext) {}

// EnterPath_expression is called when production path_expression is entered.
func (s *BaseGoogleSQLParserListener) EnterPath_expression(ctx *Path_expressionContext) {}

// ExitPath_expression is called when production path_expression is exited.
func (s *BaseGoogleSQLParserListener) ExitPath_expression(ctx *Path_expressionContext) {}

// EnterIdentifier is called when production identifier is entered.
func (s *BaseGoogleSQLParserListener) EnterIdentifier(ctx *IdentifierContext) {}

// ExitIdentifier is called when production identifier is exited.
func (s *BaseGoogleSQLParserListener) ExitIdentifier(ctx *IdentifierContext) {}

// EnterKeyword_as_identifier is called when production keyword_as_identifier is entered.
func (s *BaseGoogleSQLParserListener) EnterKeyword_as_identifier(ctx *Keyword_as_identifierContext) {}

// ExitKeyword_as_identifier is called when production keyword_as_identifier is exited.
func (s *BaseGoogleSQLParserListener) ExitKeyword_as_identifier(ctx *Keyword_as_identifierContext) {}

// EnterCommon_keyword_as_identifier is called when production common_keyword_as_identifier is entered.
func (s *BaseGoogleSQLParserListener) EnterCommon_keyword_as_identifier(ctx *Common_keyword_as_identifierContext) {
}

// ExitCommon_keyword_as_identifier is called when production common_keyword_as_identifier is exited.
func (s *BaseGoogleSQLParserListener) ExitCommon_keyword_as_identifier(ctx *Common_keyword_as_identifierContext) {
}

// EnterToken_identifier is called when production token_identifier is entered.
func (s *BaseGoogleSQLParserListener) EnterToken_identifier(ctx *Token_identifierContext) {}

// ExitToken_identifier is called when production token_identifier is exited.
func (s *BaseGoogleSQLParserListener) ExitToken_identifier(ctx *Token_identifierContext) {}

// EnterStruct_type is called when production struct_type is entered.
func (s *BaseGoogleSQLParserListener) EnterStruct_type(ctx *Struct_typeContext) {}

// ExitStruct_type is called when production struct_type is exited.
func (s *BaseGoogleSQLParserListener) ExitStruct_type(ctx *Struct_typeContext) {}

// EnterArray_type is called when production array_type is entered.
func (s *BaseGoogleSQLParserListener) EnterArray_type(ctx *Array_typeContext) {}

// ExitArray_type is called when production array_type is exited.
func (s *BaseGoogleSQLParserListener) ExitArray_type(ctx *Array_typeContext) {}

// EnterTemplate_type_open is called when production template_type_open is entered.
func (s *BaseGoogleSQLParserListener) EnterTemplate_type_open(ctx *Template_type_openContext) {}

// ExitTemplate_type_open is called when production template_type_open is exited.
func (s *BaseGoogleSQLParserListener) ExitTemplate_type_open(ctx *Template_type_openContext) {}

// EnterTemplate_type_close is called when production template_type_close is entered.
func (s *BaseGoogleSQLParserListener) EnterTemplate_type_close(ctx *Template_type_closeContext) {}

// ExitTemplate_type_close is called when production template_type_close is exited.
func (s *BaseGoogleSQLParserListener) ExitTemplate_type_close(ctx *Template_type_closeContext) {}

// EnterDate_or_time_literal is called when production date_or_time_literal is entered.
func (s *BaseGoogleSQLParserListener) EnterDate_or_time_literal(ctx *Date_or_time_literalContext) {}

// ExitDate_or_time_literal is called when production date_or_time_literal is exited.
func (s *BaseGoogleSQLParserListener) ExitDate_or_time_literal(ctx *Date_or_time_literalContext) {}

// EnterDate_or_time_literal_kind is called when production date_or_time_literal_kind is entered.
func (s *BaseGoogleSQLParserListener) EnterDate_or_time_literal_kind(ctx *Date_or_time_literal_kindContext) {
}

// ExitDate_or_time_literal_kind is called when production date_or_time_literal_kind is exited.
func (s *BaseGoogleSQLParserListener) ExitDate_or_time_literal_kind(ctx *Date_or_time_literal_kindContext) {
}

// EnterFloating_point_literal is called when production floating_point_literal is entered.
func (s *BaseGoogleSQLParserListener) EnterFloating_point_literal(ctx *Floating_point_literalContext) {
}

// ExitFloating_point_literal is called when production floating_point_literal is exited.
func (s *BaseGoogleSQLParserListener) ExitFloating_point_literal(ctx *Floating_point_literalContext) {
}

// EnterJson_literal is called when production json_literal is entered.
func (s *BaseGoogleSQLParserListener) EnterJson_literal(ctx *Json_literalContext) {}

// ExitJson_literal is called when production json_literal is exited.
func (s *BaseGoogleSQLParserListener) ExitJson_literal(ctx *Json_literalContext) {}

// EnterBignumeric_literal is called when production bignumeric_literal is entered.
func (s *BaseGoogleSQLParserListener) EnterBignumeric_literal(ctx *Bignumeric_literalContext) {}

// ExitBignumeric_literal is called when production bignumeric_literal is exited.
func (s *BaseGoogleSQLParserListener) ExitBignumeric_literal(ctx *Bignumeric_literalContext) {}

// EnterBignumeric_literal_prefix is called when production bignumeric_literal_prefix is entered.
func (s *BaseGoogleSQLParserListener) EnterBignumeric_literal_prefix(ctx *Bignumeric_literal_prefixContext) {
}

// ExitBignumeric_literal_prefix is called when production bignumeric_literal_prefix is exited.
func (s *BaseGoogleSQLParserListener) ExitBignumeric_literal_prefix(ctx *Bignumeric_literal_prefixContext) {
}

// EnterNumeric_literal is called when production numeric_literal is entered.
func (s *BaseGoogleSQLParserListener) EnterNumeric_literal(ctx *Numeric_literalContext) {}

// ExitNumeric_literal is called when production numeric_literal is exited.
func (s *BaseGoogleSQLParserListener) ExitNumeric_literal(ctx *Numeric_literalContext) {}

// EnterNumeric_literal_prefix is called when production numeric_literal_prefix is entered.
func (s *BaseGoogleSQLParserListener) EnterNumeric_literal_prefix(ctx *Numeric_literal_prefixContext) {
}

// ExitNumeric_literal_prefix is called when production numeric_literal_prefix is exited.
func (s *BaseGoogleSQLParserListener) ExitNumeric_literal_prefix(ctx *Numeric_literal_prefixContext) {
}

// EnterInteger_literal is called when production integer_literal is entered.
func (s *BaseGoogleSQLParserListener) EnterInteger_literal(ctx *Integer_literalContext) {}

// ExitInteger_literal is called when production integer_literal is exited.
func (s *BaseGoogleSQLParserListener) ExitInteger_literal(ctx *Integer_literalContext) {}

// EnterBytes_literal is called when production bytes_literal is entered.
func (s *BaseGoogleSQLParserListener) EnterBytes_literal(ctx *Bytes_literalContext) {}

// ExitBytes_literal is called when production bytes_literal is exited.
func (s *BaseGoogleSQLParserListener) ExitBytes_literal(ctx *Bytes_literalContext) {}

// EnterBoolean_literal is called when production boolean_literal is entered.
func (s *BaseGoogleSQLParserListener) EnterBoolean_literal(ctx *Boolean_literalContext) {}

// ExitBoolean_literal is called when production boolean_literal is exited.
func (s *BaseGoogleSQLParserListener) ExitBoolean_literal(ctx *Boolean_literalContext) {}

// EnterString_literal is called when production string_literal is entered.
func (s *BaseGoogleSQLParserListener) EnterString_literal(ctx *String_literalContext) {}

// ExitString_literal is called when production string_literal is exited.
func (s *BaseGoogleSQLParserListener) ExitString_literal(ctx *String_literalContext) {}

// EnterString_literal_component is called when production string_literal_component is entered.
func (s *BaseGoogleSQLParserListener) EnterString_literal_component(ctx *String_literal_componentContext) {
}

// ExitString_literal_component is called when production string_literal_component is exited.
func (s *BaseGoogleSQLParserListener) ExitString_literal_component(ctx *String_literal_componentContext) {
}

// EnterBytes_literal_component is called when production bytes_literal_component is entered.
func (s *BaseGoogleSQLParserListener) EnterBytes_literal_component(ctx *Bytes_literal_componentContext) {
}

// ExitBytes_literal_component is called when production bytes_literal_component is exited.
func (s *BaseGoogleSQLParserListener) ExitBytes_literal_component(ctx *Bytes_literal_componentContext) {
}

// EnterCount is called when production count is entered.
func (s *BaseGoogleSQLParserListener) EnterCount(ctx *CountContext) {}

// ExitCount is called when production count is exited.
func (s *BaseGoogleSQLParserListener) ExitCount(ctx *CountContext) {}

// EnterSkip_rows is called when production skip_rows is entered.
func (s *BaseGoogleSQLParserListener) EnterSkip_rows(ctx *Skip_rowsContext) {}

// ExitSkip_rows is called when production skip_rows is exited.
func (s *BaseGoogleSQLParserListener) ExitSkip_rows(ctx *Skip_rowsContext) {}

// EnterName is called when production name is entered.
func (s *BaseGoogleSQLParserListener) EnterName(ctx *NameContext) {}

// ExitName is called when production name is exited.
func (s *BaseGoogleSQLParserListener) ExitName(ctx *NameContext) {}

// EnterCte_name is called when production cte_name is entered.
func (s *BaseGoogleSQLParserListener) EnterCte_name(ctx *Cte_nameContext) {}

// ExitCte_name is called when production cte_name is exited.
func (s *BaseGoogleSQLParserListener) ExitCte_name(ctx *Cte_nameContext) {}

// EnterColumn_name is called when production column_name is entered.
func (s *BaseGoogleSQLParserListener) EnterColumn_name(ctx *Column_nameContext) {}

// ExitColumn_name is called when production column_name is exited.
func (s *BaseGoogleSQLParserListener) ExitColumn_name(ctx *Column_nameContext) {}

// EnterAlias_name is called when production alias_name is entered.
func (s *BaseGoogleSQLParserListener) EnterAlias_name(ctx *Alias_nameContext) {}

// ExitAlias_name is called when production alias_name is exited.
func (s *BaseGoogleSQLParserListener) ExitAlias_name(ctx *Alias_nameContext) {}

// EnterTable_name is called when production table_name is entered.
func (s *BaseGoogleSQLParserListener) EnterTable_name(ctx *Table_nameContext) {}

// ExitTable_name is called when production table_name is exited.
func (s *BaseGoogleSQLParserListener) ExitTable_name(ctx *Table_nameContext) {}

// EnterNumber is called when production number is entered.
func (s *BaseGoogleSQLParserListener) EnterNumber(ctx *NumberContext) {}

// ExitNumber is called when production number is exited.
func (s *BaseGoogleSQLParserListener) ExitNumber(ctx *NumberContext) {}

// EnterInteger_type is called when production integer_type is entered.
func (s *BaseGoogleSQLParserListener) EnterInteger_type(ctx *Integer_typeContext) {}

// ExitInteger_type is called when production integer_type is exited.
func (s *BaseGoogleSQLParserListener) ExitInteger_type(ctx *Integer_typeContext) {}

// EnterFloat_type is called when production float_type is entered.
func (s *BaseGoogleSQLParserListener) EnterFloat_type(ctx *Float_typeContext) {}

// ExitFloat_type is called when production float_type is exited.
func (s *BaseGoogleSQLParserListener) ExitFloat_type(ctx *Float_typeContext) {}
