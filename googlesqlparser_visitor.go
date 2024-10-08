// Code generated from GoogleSQLParser.g4 by ANTLR 4.13.1. DO NOT EDIT.

package parser // GoogleSQLParser
import "github.com/antlr4-go/antlr/v4"

// A complete Visitor for a parse tree produced by GoogleSQLParser.
type GoogleSQLParserVisitor interface {
	antlr.ParseTreeVisitor

	// Visit a parse tree produced by GoogleSQLParser#root.
	VisitRoot(ctx *RootContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#stmts.
	VisitStmts(ctx *StmtsContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#stmt.
	VisitStmt(ctx *StmtContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#query_statement.
	VisitQuery_statement(ctx *Query_statementContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#query_expr.
	VisitQuery_expr(ctx *Query_exprContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#query_primary.
	VisitQuery_primary(ctx *Query_primaryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#limit_clause.
	VisitLimit_clause(ctx *Limit_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#order_by_clause.
	VisitOrder_by_clause(ctx *Order_by_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#order_by_expr_list.
	VisitOrder_by_expr_list(ctx *Order_by_expr_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#order_by_expr_list_item.
	VisitOrder_by_expr_list_item(ctx *Order_by_expr_list_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#set_operator.
	VisitSet_operator(ctx *Set_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select.
	VisitSelect(ctx *SelectContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#from_clause.
	VisitFrom_clause(ctx *From_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#tablesample_operator.
	VisitTablesample_operator(ctx *Tablesample_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unpivot_operator.
	VisitUnpivot_operator(ctx *Unpivot_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#single_column_unpivot.
	VisitSingle_column_unpivot(ctx *Single_column_unpivotContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#multi_column_unpivot.
	VisitMulti_column_unpivot(ctx *Multi_column_unpivotContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#values_column_set.
	VisitValues_column_set(ctx *Values_column_setContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#columns_to_unpivot_list.
	VisitColumns_to_unpivot_list(ctx *Columns_to_unpivot_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#columns_to_unpivot_item.
	VisitColumns_to_unpivot_item(ctx *Columns_to_unpivot_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#column_sets_to_unpivot.
	VisitColumn_sets_to_unpivot(ctx *Column_sets_to_unpivotContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#pivot_operator.
	VisitPivot_operator(ctx *Pivot_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#pivot_column_as_alias_list.
	VisitPivot_column_as_alias_list(ctx *Pivot_column_as_alias_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#pivot_column_as_alias_list_item.
	VisitPivot_column_as_alias_list_item(ctx *Pivot_column_as_alias_list_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#aggregate_function_call_as_alias_list.
	VisitAggregate_function_call_as_alias_list(ctx *Aggregate_function_call_as_alias_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#aggregate_function_call_as_alias_list_item.
	VisitAggregate_function_call_as_alias_list_item(ctx *Aggregate_function_call_as_alias_list_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#from_item.
	VisitFrom_item(ctx *From_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unnest_operator.
	VisitUnnest_operator(ctx *Unnest_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#cross_join_operator.
	VisitCross_join_operator(ctx *Cross_join_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#conditional_join_operator.
	VisitConditional_join_operator(ctx *Conditional_join_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#join_condition.
	VisitJoin_condition(ctx *Join_conditionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#on_clause.
	VisitOn_clause(ctx *On_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#using_clause.
	VisitUsing_clause(ctx *Using_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_list.
	VisitSelect_list(ctx *Select_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_list_item.
	VisitSelect_list_item(ctx *Select_list_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_expression.
	VisitSelect_expression(ctx *Select_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_all.
	VisitSelect_all(ctx *Select_allContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_all_except_clause.
	VisitSelect_all_except_clause(ctx *Select_all_except_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_all_replace_clause.
	VisitSelect_all_replace_clause(ctx *Select_all_replace_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#column_name_list.
	VisitColumn_name_list(ctx *Column_name_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#expr_as_alias_list.
	VisitExpr_as_alias_list(ctx *Expr_as_alias_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#expr_as_alias_item.
	VisitExpr_as_alias_item(ctx *Expr_as_alias_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#as_alias.
	VisitAs_alias(ctx *As_aliasContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#differential_privacy_clause.
	VisitDifferential_privacy_clause(ctx *Differential_privacy_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#privacy_parameters.
	VisitPrivacy_parameters(ctx *Privacy_parametersContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#with_statement.
	VisitWith_statement(ctx *With_statementContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#cte.
	VisitCte(ctx *CteContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#non_recursive_cte.
	VisitNon_recursive_cte(ctx *Non_recursive_cteContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#recursive_cte.
	VisitRecursive_cte(ctx *Recursive_cteContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#recursive_union_operation.
	VisitRecursive_union_operation(ctx *Recursive_union_operationContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#base_term.
	VisitBase_term(ctx *Base_termContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#union_operator.
	VisitUnion_operator(ctx *Union_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#recursive_term.
	VisitRecursive_term(ctx *Recursive_termContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#expression.
	VisitExpression(ctx *ExpressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#expression_higher_prec_than_and.
	VisitExpression_higher_prec_than_and(ctx *Expression_higher_prec_than_andContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unparenthesized_expression_higher_prec_than_and.
	VisitUnparenthesized_expression_higher_prec_than_and(ctx *Unparenthesized_expression_higher_prec_than_andContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#array_constructor.
	VisitArray_constructor(ctx *Array_constructorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#array_constructor_prefix.
	VisitArray_constructor_prefix(ctx *Array_constructor_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#array_constructor_prefix_no_expressions.
	VisitArray_constructor_prefix_no_expressions(ctx *Array_constructor_prefix_no_expressionsContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#range_literal.
	VisitRange_literal(ctx *Range_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#range_type.
	VisitRange_type(ctx *Range_typeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#type.
	VisitType(ctx *TypeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#collate_clause.
	VisitCollate_clause(ctx *Collate_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#string_literal_or_parameter.
	VisitString_literal_or_parameter(ctx *String_literal_or_parameterContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#system_variable_expression.
	VisitSystem_variable_expression(ctx *System_variable_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#parameter_expression.
	VisitParameter_expression(ctx *Parameter_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#named_parameter_expression.
	VisitNamed_parameter_expression(ctx *Named_parameter_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_type_parameters.
	VisitOpt_type_parameters(ctx *Opt_type_parametersContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#type_parameters_prefix.
	VisitType_parameters_prefix(ctx *Type_parameters_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#type_parameter.
	VisitType_parameter(ctx *Type_parameterContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#raw_type.
	VisitRaw_type(ctx *Raw_typeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#map_type.
	VisitMap_type(ctx *Map_typeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#function_type.
	VisitFunction_type(ctx *Function_typeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#function_type_prefix.
	VisitFunction_type_prefix(ctx *Function_type_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#type_name.
	VisitType_name(ctx *Type_nameContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#path_expression.
	VisitPath_expression(ctx *Path_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#identifier.
	VisitIdentifier(ctx *IdentifierContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#keyword_as_identifier.
	VisitKeyword_as_identifier(ctx *Keyword_as_identifierContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#common_keyword_as_identifier.
	VisitCommon_keyword_as_identifier(ctx *Common_keyword_as_identifierContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#token_identifier.
	VisitToken_identifier(ctx *Token_identifierContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#struct_type.
	VisitStruct_type(ctx *Struct_typeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#array_type.
	VisitArray_type(ctx *Array_typeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#template_type_open.
	VisitTemplate_type_open(ctx *Template_type_openContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#template_type_close.
	VisitTemplate_type_close(ctx *Template_type_closeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#date_or_time_literal.
	VisitDate_or_time_literal(ctx *Date_or_time_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#date_or_time_literal_kind.
	VisitDate_or_time_literal_kind(ctx *Date_or_time_literal_kindContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#floating_point_literal.
	VisitFloating_point_literal(ctx *Floating_point_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#json_literal.
	VisitJson_literal(ctx *Json_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#bignumeric_literal.
	VisitBignumeric_literal(ctx *Bignumeric_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#bignumeric_literal_prefix.
	VisitBignumeric_literal_prefix(ctx *Bignumeric_literal_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#numeric_literal.
	VisitNumeric_literal(ctx *Numeric_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#numeric_literal_prefix.
	VisitNumeric_literal_prefix(ctx *Numeric_literal_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#integer_literal.
	VisitInteger_literal(ctx *Integer_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#bytes_literal.
	VisitBytes_literal(ctx *Bytes_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#boolean_literal.
	VisitBoolean_literal(ctx *Boolean_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#string_literal.
	VisitString_literal(ctx *String_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#string_literal_component.
	VisitString_literal_component(ctx *String_literal_componentContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#bytes_literal_component.
	VisitBytes_literal_component(ctx *Bytes_literal_componentContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#count.
	VisitCount(ctx *CountContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#skip_rows.
	VisitSkip_rows(ctx *Skip_rowsContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#name.
	VisitName(ctx *NameContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#cte_name.
	VisitCte_name(ctx *Cte_nameContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#column_name.
	VisitColumn_name(ctx *Column_nameContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#alias_name.
	VisitAlias_name(ctx *Alias_nameContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#table_name.
	VisitTable_name(ctx *Table_nameContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#number.
	VisitNumber(ctx *NumberContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#integer_type.
	VisitInteger_type(ctx *Integer_typeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#float_type.
	VisitFloat_type(ctx *Float_typeContext) interface{}
}
