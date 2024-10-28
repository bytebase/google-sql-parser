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

func (v *BaseGoogleSQLParserVisitor) VisitQuery(ctx *QueryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitQuery_without_pipe_operators(ctx *Query_without_pipe_operatorsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBad_keyword_after_from_query(ctx *Bad_keyword_after_from_queryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBad_keyword_after_from_query_allows_parens(ctx *Bad_keyword_after_from_query_allows_parensContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWith_clause_with_trailing_comma(ctx *With_clause_with_trailing_commaContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_or_from_keyword(ctx *Select_or_from_keywordContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitQuery_primary_or_set_operation(ctx *Query_primary_or_set_operationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitQuery_set_operation(ctx *Query_set_operationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitQuery_set_operation_prefix(ctx *Query_set_operation_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitQuery_set_operation_item(ctx *Query_set_operation_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitQuery_primary(ctx *Query_primaryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSet_operation_metadata(ctx *Set_operation_metadataContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_column_match_suffix(ctx *Opt_column_match_suffixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_strict(ctx *Opt_strictContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitAll_or_distinct(ctx *All_or_distinctContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitQuery_set_operation_type(ctx *Query_set_operation_typeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_corresponding_outer_mode(ctx *Opt_corresponding_outer_modeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_outer(ctx *Opt_outerContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWith_clause(ctx *With_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitAliased_query(ctx *Aliased_queryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_aliased_query_modifiers(ctx *Opt_aliased_query_modifiersContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRecursion_depth_modifier(ctx *Recursion_depth_modifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPossibly_unbounded_int_literal_or_parameter(ctx *Possibly_unbounded_int_literal_or_parameterContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitInt_literal_or_parameter(ctx *Int_literal_or_parameterContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOrder_by_clause(ctx *Order_by_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOrder_by_clause_prefix(ctx *Order_by_clause_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOrdering_expression(ctx *Ordering_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect(ctx *SelectContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_clauses_following_from(ctx *Opt_clauses_following_fromContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_clauses_following_where(ctx *Opt_clauses_following_whereContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_clauses_following_group_by(ctx *Opt_clauses_following_group_byContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWindow_clause(ctx *Window_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWindow_clause_prefix(ctx *Window_clause_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWindow_definition(ctx *Window_definitionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWhere_clause(ctx *Where_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitHaving_clause(ctx *Having_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitGroup_by_clause(ctx *Group_by_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitGroup_by_all(ctx *Group_by_allContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_clause(ctx *Select_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_select_as_clause(ctx *Opt_select_as_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_select_with(ctx *Opt_select_withContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFrom_clause(ctx *From_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFrom_clause_contents(ctx *From_clause_contentsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFrom_clause_contents_suffix(ctx *From_clause_contents_suffixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTable_primary(ctx *Table_primaryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTvf_with_suffixes(ctx *Tvf_with_suffixesContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPivot_or_unpivot_clause_and_aliases(ctx *Pivot_or_unpivot_clause_and_aliasesContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitAs_alias(ctx *As_aliasContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSample_clause(ctx *Sample_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_sample_clause_suffix(ctx *Opt_sample_clause_suffixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRepeatable_clause(ctx *Repeatable_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPossibly_cast_int_literal_or_parameter(ctx *Possibly_cast_int_literal_or_parameterContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCast_int_literal_or_parameter(ctx *Cast_int_literal_or_parameterContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSample_size(ctx *Sample_sizeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSample_size_value(ctx *Sample_size_valueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSample_size_unit(ctx *Sample_size_unitContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPartition_by_clause_prefix_no_hint(ctx *Partition_by_clause_prefix_no_hintContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitMatch_recognize_clause(ctx *Match_recognize_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRow_pattern_expr(ctx *Row_pattern_exprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRow_pattern_concatenation(ctx *Row_pattern_concatenationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRow_pattern_factor(ctx *Row_pattern_factorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_list_prefix_with_as_aliases(ctx *Select_list_prefix_with_as_aliasesContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_column_expr_with_as_alias(ctx *Select_column_expr_with_as_aliasContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTable_subquery(ctx *Table_subqueryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitJoin(ctx *JoinContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitJoin_item(ctx *Join_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOn_or_using_clause_list(ctx *On_or_using_clause_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOn_or_using_clause(ctx *On_or_using_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUsing_clause(ctx *Using_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitJoin_hint(ctx *Join_hintContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTable_path_expression(ctx *Table_path_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_at_system_time(ctx *Opt_at_system_timeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_with_offset_and_alias(ctx *Opt_with_offset_and_aliasContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_pivot_or_unpivot_clause_and_alias(ctx *Opt_pivot_or_unpivot_clause_and_aliasContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTable_path_expression_base(ctx *Table_path_expression_baseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitMaybe_slashed_or_dashed_path_expression(ctx *Maybe_slashed_or_dashed_path_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitMaybe_dashed_path_expression(ctx *Maybe_dashed_path_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitDashed_path_expression(ctx *Dashed_path_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitDashed_identifier(ctx *Dashed_identifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSlashed_identifier(ctx *Slashed_identifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitIdentifier_or_integer(ctx *Identifier_or_integerContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSlashed_identifier_separator(ctx *Slashed_identifier_separatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSlashed_path_expression(ctx *Slashed_path_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnnest_expression(ctx *Unnest_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnnest_expression_prefix(ctx *Unnest_expression_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_array_zip_mode(ctx *Opt_array_zip_modeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExpression_with_opt_alias(ctx *Expression_with_opt_aliasContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTvf_prefix(ctx *Tvf_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTvf_argument(ctx *Tvf_argumentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitConnection_clause(ctx *Connection_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPath_expression_or_default(ctx *Path_expression_or_defaultContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitDescriptor_argument(ctx *Descriptor_argumentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitDescriptor_column_list(ctx *Descriptor_column_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitDescriptor_column(ctx *Descriptor_columnContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTable_clause(ctx *Table_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitModel_clause(ctx *Model_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitQualify_clause_nonreserved(ctx *Qualify_clause_nonreservedContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnpivot_clause(ctx *Unpivot_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnpivot_in_item_list(ctx *Unpivot_in_item_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnpivot_in_item_list_prefix(ctx *Unpivot_in_item_list_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnpivot_in_item(ctx *Unpivot_in_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_as_string_or_integer(ctx *Opt_as_string_or_integerContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPath_expression_list_with_opt_parens(ctx *Path_expression_list_with_opt_parensContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPath_expression_list(ctx *Path_expression_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnpivot_nulls_filter(ctx *Unpivot_nulls_filterContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPivot_clause(ctx *Pivot_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPivot_expression_list(ctx *Pivot_expression_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPivot_expression(ctx *Pivot_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPivot_value_list(ctx *Pivot_value_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPivot_value(ctx *Pivot_valueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitTvf_prefix_no_args(ctx *Tvf_prefix_no_argsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitJoin_type(ctx *Join_typeContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_natural(ctx *Opt_naturalContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOn_clause(ctx *On_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_list(ctx *Select_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_list_item(ctx *Select_list_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_column_star(ctx *Select_column_starContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_column_expr(ctx *Select_column_exprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSelect_column_dot_star(ctx *Select_column_dot_starContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStar_modifiers(ctx *Star_modifiersContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStar_except_list(ctx *Star_except_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStar_except_list_prefix(ctx *Star_except_list_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStar_modifiers_with_replace_prefix(ctx *Star_modifiers_with_replace_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStar_replace_item(ctx *Star_replace_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExpression(ctx *ExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExpression_higher_prec_than_and(ctx *Expression_higher_prec_than_andContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExpression_maybe_parenthesized_not_a_query(ctx *Expression_maybe_parenthesized_not_a_queryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitParenthesized_in_rhs(ctx *Parenthesized_in_rhsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitUnary_operator(ctx *Unary_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitComparative_operator(ctx *Comparative_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitShift_operator(ctx *Shift_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitAdditive_operator(ctx *Additive_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitMultiplicative_operator(ctx *Multiplicative_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitIs_operator(ctx *Is_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBetween_operator(ctx *Between_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitIn_operator(ctx *In_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitDistinct_operator(ctx *Distinct_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitParenthesized_query(ctx *Parenthesized_queryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitParenthesized_expression_not_a_query(ctx *Parenthesized_expression_not_a_queryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitParenthesized_anysomeall_list_in_rhs(ctx *Parenthesized_anysomeall_list_in_rhsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitAnd_expression(ctx *And_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitIn_list_two_or_more_prefix(ctx *In_list_two_or_more_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitAny_some_all(ctx *Any_some_allContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitLike_operator(ctx *Like_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExpression_subquery_with_keyword(ctx *Expression_subquery_with_keywordContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStruct_constructor(ctx *Struct_constructorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStruct_constructor_prefix_with_keyword(ctx *Struct_constructor_prefix_with_keywordContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStruct_constructor_arg(ctx *Struct_constructor_argContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStruct_constructor_prefix_without_keyword(ctx *Struct_constructor_prefix_without_keywordContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStruct_constructor_prefix_with_keyword_no_arg(ctx *Struct_constructor_prefix_with_keyword_no_argContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitInterval_expression(ctx *Interval_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFunction_call_expression_with_clauses(ctx *Function_call_expression_with_clausesContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFunction_call_expression_with_clauses_suffix(ctx *Function_call_expression_with_clauses_suffixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOver_clause(ctx *Over_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWindow_specification(ctx *Window_specificationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_window_frame_clause(ctx *Opt_window_frame_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWindow_frame_bound(ctx *Window_frame_boundContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPreceding_or_following(ctx *Preceding_or_followingContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFrame_unit(ctx *Frame_unitContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPartition_by_clause(ctx *Partition_by_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitPartition_by_clause_prefix(ctx *Partition_by_clause_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWith_group_rows(ctx *With_group_rowsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWith_report_modifier(ctx *With_report_modifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitClamped_between_modifier(ctx *Clamped_between_modifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWith_report_format(ctx *With_report_formatContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOptions_list(ctx *Options_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOptions_list_prefix(ctx *Options_list_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOptions_entry(ctx *Options_entryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExpression_or_proto(ctx *Expression_or_protoContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOptions_assignment_operator(ctx *Options_assignment_operatorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_null_handling_modifier(ctx *Opt_null_handling_modifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFunction_call_argument(ctx *Function_call_argumentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitSequence_arg(ctx *Sequence_argContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitNamed_argument(ctx *Named_argumentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitLambda_argument(ctx *Lambda_argumentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitLambda_argument_list(ctx *Lambda_argument_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitLimit_offset_clause(ctx *Limit_offset_clauseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_having_or_group_by_modifier(ctx *Opt_having_or_group_by_modifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitGroup_by_clause_prefix(ctx *Group_by_clause_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitGroup_by_preamble(ctx *Group_by_preambleContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_and_order(ctx *Opt_and_orderContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitHint(ctx *HintContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitHint_with_body(ctx *Hint_with_bodyContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitHint_with_body_prefix(ctx *Hint_with_body_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitHint_entry(ctx *Hint_entryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitIdentifier_in_hints(ctx *Identifier_in_hintsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExtra_identifier_in_hints_name(ctx *Extra_identifier_in_hints_nameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitGrouping_item(ctx *Grouping_itemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitGrouping_set_list(ctx *Grouping_set_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitGrouping_set(ctx *Grouping_setContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCube_list(ctx *Cube_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitRollup_list(ctx *Rollup_listContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_as_alias_with_required_as(ctx *Opt_as_alias_with_required_asContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_grouping_item_order(ctx *Opt_grouping_item_orderContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_selection_item_order(ctx *Opt_selection_item_orderContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitAsc_or_desc(ctx *Asc_or_descContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitNull_order(ctx *Null_orderContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitFunction_name_from_keyword(ctx *Function_name_from_keywordContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitReplace_fields_expression(ctx *Replace_fields_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitReplace_fields_prefix(ctx *Replace_fields_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitReplace_fields_arg(ctx *Replace_fields_argContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitGeneralized_path_expression(ctx *Generalized_path_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitGeneralized_extension_path(ctx *Generalized_extension_pathContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWith_expression(ctx *With_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWith_expression_variable_prefix(ctx *With_expression_variable_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitWith_expression_variable(ctx *With_expression_variableContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExtract_expression(ctx *Extract_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitExtract_expression_base(ctx *Extract_expression_baseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_format(ctx *Opt_formatContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitOpt_at_time_zone(ctx *Opt_at_time_zoneContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCast_expression(ctx *Cast_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCase_expression(ctx *Case_expressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCase_expression_prefix(ctx *Case_expression_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCase_value_expression_prefix(ctx *Case_value_expression_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitCase_no_value_expression_prefix(ctx *Case_no_value_expression_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStruct_braced_constructor(ctx *Struct_braced_constructorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBraced_new_constructor(ctx *Braced_new_constructorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBraced_constructor(ctx *Braced_constructorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBraced_constructor_start(ctx *Braced_constructor_startContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBraced_constructor_prefix(ctx *Braced_constructor_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBraced_constructor_field(ctx *Braced_constructor_fieldContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBraced_constructor_lhs(ctx *Braced_constructor_lhsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBraced_constructor_field_value(ctx *Braced_constructor_field_valueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitBraced_constructor_extension(ctx *Braced_constructor_extensionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitNew_constructor(ctx *New_constructorContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitNew_constructor_prefix(ctx *New_constructor_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitNew_constructor_prefix_no_arg(ctx *New_constructor_prefix_no_argContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitNew_constructor_arg(ctx *New_constructor_argContext) interface{} {
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

func (v *BaseGoogleSQLParserVisitor) VisitStruct_type_prefix(ctx *Struct_type_prefixContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseGoogleSQLParserVisitor) VisitStruct_field(ctx *Struct_fieldContext) interface{} {
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

func (v *BaseGoogleSQLParserVisitor) VisitNull_literal(ctx *Null_literalContext) interface{} {
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
