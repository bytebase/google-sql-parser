// Code generated from GoogleSQLParser.g4 by ANTLR 4.13.1. DO NOT EDIT.

package parser // GoogleSQLParser
import "github.com/antlr4-go/antlr/v4"

type BaseGoogleSQLParserVisitor struct {
	*antlr.BaseParseTreeVisitor
}

func (v *BaseGoogleSQLParserVisitor) VisitRoot(ctx *RootContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStmts(ctx *StmtsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStmt(ctx *StmtContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitQuery_statement(ctx *Query_statementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitQuery_expr(ctx *Query_exprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitQuery_primary(ctx *Query_primaryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitLimit_clause(ctx *Limit_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOrder_by_clause(ctx *Order_by_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOrder_by_expr_list(ctx *Order_by_expr_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOrder_by_expr_list_item(ctx *Order_by_expr_list_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSet_operator(ctx *Set_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect(ctx *SelectContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFrom_clause(ctx *From_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTablesample_operator(ctx *Tablesample_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnpivot_operator(ctx *Unpivot_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSingle_column_unpivot(ctx *Single_column_unpivotContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitMulti_column_unpivot(ctx *Multi_column_unpivotContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitValues_column_set(ctx *Values_column_setContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitColumns_to_unpivot_list(ctx *Columns_to_unpivot_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitColumns_to_unpivot_item(ctx *Columns_to_unpivot_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitColumn_sets_to_unpivot(ctx *Column_sets_to_unpivotContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPivot_operator(ctx *Pivot_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPivot_column_as_alias_list(ctx *Pivot_column_as_alias_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPivot_column_as_alias_list_item(ctx *Pivot_column_as_alias_list_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitAggregate_function_call_as_alias_list(ctx *Aggregate_function_call_as_alias_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitAggregate_function_call_as_alias_list_item(ctx *Aggregate_function_call_as_alias_list_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFrom_item(ctx *From_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnnest_operator(ctx *Unnest_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCross_join_operator(ctx *Cross_join_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitConditional_join_operator(ctx *Conditional_join_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitJoin_condition(ctx *Join_conditionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOn_clause(ctx *On_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUsing_clause(ctx *Using_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_list(ctx *Select_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_list_item(ctx *Select_list_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_expression(ctx *Select_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_all(ctx *Select_allContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_all_except_clause(ctx *Select_all_except_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_all_replace_clause(ctx *Select_all_replace_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitColumn_name_list(ctx *Column_name_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExpr_as_alias_list(ctx *Expr_as_alias_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExpr_as_alias_item(ctx *Expr_as_alias_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitAs_alias(ctx *As_aliasContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitDifferential_privacy_clause(ctx *Differential_privacy_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPrivacy_parameters(ctx *Privacy_parametersContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWith_statement(ctx *With_statementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCte(ctx *CteContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitNon_recursive_cte(ctx *Non_recursive_cteContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRecursive_cte(ctx *Recursive_cteContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRecursive_union_operation(ctx *Recursive_union_operationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBase_term(ctx *Base_termContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnion_operator(ctx *Union_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRecursive_term(ctx *Recursive_termContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExpression(ctx *ExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExpression_higher_prec_than_and(ctx *Expression_higher_prec_than_andContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnparenthesized_expression_higher_prec_than_and(ctx *Unparenthesized_expression_higher_prec_than_andContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitArray_constructor(ctx *Array_constructorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitArray_constructor_prefix(ctx *Array_constructor_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitArray_constructor_prefix_no_expressions(ctx *Array_constructor_prefix_no_expressionsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRange_literal(ctx *Range_literalContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRange_type(ctx *Range_typeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitType(ctx *TypeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCollate_clause(ctx *Collate_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitString_literal_or_parameter(ctx *String_literal_or_parameterContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSystem_variable_expression(ctx *System_variable_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitParameter_expression(ctx *Parameter_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitNamed_parameter_expression(ctx *Named_parameter_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_type_parameters(ctx *Opt_type_parametersContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitType_parameters_prefix(ctx *Type_parameters_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitType_parameter(ctx *Type_parameterContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRaw_type(ctx *Raw_typeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitMap_type(ctx *Map_typeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFunction_type(ctx *Function_typeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFunction_type_prefix(ctx *Function_type_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitType_name(ctx *Type_nameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPath_expression(ctx *Path_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitIdentifier(ctx *IdentifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitKeyword_as_identifier(ctx *Keyword_as_identifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCommon_keyword_as_identifier(ctx *Common_keyword_as_identifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitToken_identifier(ctx *Token_identifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStruct_type(ctx *Struct_typeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitArray_type(ctx *Array_typeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTemplate_type_open(ctx *Template_type_openContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTemplate_type_close(ctx *Template_type_closeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitDate_or_time_literal(ctx *Date_or_time_literalContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitDate_or_time_literal_kind(ctx *Date_or_time_literal_kindContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFloating_point_literal(ctx *Floating_point_literalContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitJson_literal(ctx *Json_literalContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBignumeric_literal(ctx *Bignumeric_literalContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBignumeric_literal_prefix(ctx *Bignumeric_literal_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitNumeric_literal(ctx *Numeric_literalContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitNumeric_literal_prefix(ctx *Numeric_literal_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitInteger_literal(ctx *Integer_literalContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBytes_literal(ctx *Bytes_literalContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBoolean_literal(ctx *Boolean_literalContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitString_literal(ctx *String_literalContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitString_literal_component(ctx *String_literal_componentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBytes_literal_component(ctx *Bytes_literal_componentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCount(ctx *CountContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSkip_rows(ctx *Skip_rowsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitName(ctx *NameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCte_name(ctx *Cte_nameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitColumn_name(ctx *Column_nameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitAlias_name(ctx *Alias_nameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTable_name(ctx *Table_nameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitNumber(ctx *NumberContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitInteger_type(ctx *Integer_typeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFloat_type(ctx *Float_typeContext) interface{} {
	return v.VisitChildren(ctx)
}
