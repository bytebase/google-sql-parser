// Code generated from GoogleSQLParser.g4 by ANTLR 4.13.0. DO NOT EDIT.

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

	// Visit a parse tree produced by GoogleSQLParser#query.
	VisitQuery(ctx *QueryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#query_without_pipe_operators.
	VisitQuery_without_pipe_operators(ctx *Query_without_pipe_operatorsContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#bad_keyword_after_from_query.
	VisitBad_keyword_after_from_query(ctx *Bad_keyword_after_from_queryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#bad_keyword_after_from_query_allows_parens.
	VisitBad_keyword_after_from_query_allows_parens(ctx *Bad_keyword_after_from_query_allows_parensContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#with_clause_with_trailing_comma.
	VisitWith_clause_with_trailing_comma(ctx *With_clause_with_trailing_commaContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_or_from_keyword.
	VisitSelect_or_from_keyword(ctx *Select_or_from_keywordContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#query_primary_or_set_operation.
	VisitQuery_primary_or_set_operation(ctx *Query_primary_or_set_operationContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#query_set_operation.
	VisitQuery_set_operation(ctx *Query_set_operationContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#query_set_operation_prefix.
	VisitQuery_set_operation_prefix(ctx *Query_set_operation_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#query_primary.
	VisitQuery_primary(ctx *Query_primaryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#set_operation_metadata.
	VisitSet_operation_metadata(ctx *Set_operation_metadataContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_column_match_suffix.
	VisitOpt_column_match_suffix(ctx *Opt_column_match_suffixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_strict.
	VisitOpt_strict(ctx *Opt_strictContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#all_or_distinct.
	VisitAll_or_distinct(ctx *All_or_distinctContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#query_set_operation_type.
	VisitQuery_set_operation_type(ctx *Query_set_operation_typeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_corresponding_outer_mode.
	VisitOpt_corresponding_outer_mode(ctx *Opt_corresponding_outer_modeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_outer.
	VisitOpt_outer(ctx *Opt_outerContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#with_clause.
	VisitWith_clause(ctx *With_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#aliased_query.
	VisitAliased_query(ctx *Aliased_queryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_aliased_query_modifiers.
	VisitOpt_aliased_query_modifiers(ctx *Opt_aliased_query_modifiersContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#recursion_depth_modifier.
	VisitRecursion_depth_modifier(ctx *Recursion_depth_modifierContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#possibly_unbounded_int_literal_or_parameter.
	VisitPossibly_unbounded_int_literal_or_parameter(ctx *Possibly_unbounded_int_literal_or_parameterContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#int_literal_or_parameter.
	VisitInt_literal_or_parameter(ctx *Int_literal_or_parameterContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#order_by_clause.
	VisitOrder_by_clause(ctx *Order_by_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#order_by_clause_prefix.
	VisitOrder_by_clause_prefix(ctx *Order_by_clause_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#ordering_expression.
	VisitOrdering_expression(ctx *Ordering_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#order_by_expr_list.
	VisitOrder_by_expr_list(ctx *Order_by_expr_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#order_by_expr_list_item.
	VisitOrder_by_expr_list_item(ctx *Order_by_expr_list_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#set_operator.
	VisitSet_operator(ctx *Set_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select.
	VisitSelect(ctx *SelectContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_clauses_following_from.
	VisitOpt_clauses_following_from(ctx *Opt_clauses_following_fromContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_clauses_following_where.
	VisitOpt_clauses_following_where(ctx *Opt_clauses_following_whereContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_clauses_following_group_by.
	VisitOpt_clauses_following_group_by(ctx *Opt_clauses_following_group_byContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#window_clause.
	VisitWindow_clause(ctx *Window_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#window_clause_prefix.
	VisitWindow_clause_prefix(ctx *Window_clause_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#window_definition.
	VisitWindow_definition(ctx *Window_definitionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#where_clause.
	VisitWhere_clause(ctx *Where_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#having_clause.
	VisitHaving_clause(ctx *Having_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#group_by_clause.
	VisitGroup_by_clause(ctx *Group_by_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#group_by_all.
	VisitGroup_by_all(ctx *Group_by_allContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_clause.
	VisitSelect_clause(ctx *Select_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_select_as_clause.
	VisitOpt_select_as_clause(ctx *Opt_select_as_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_select_with.
	VisitOpt_select_with(ctx *Opt_select_withContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#from_clause.
	VisitFrom_clause(ctx *From_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#from_clause_contents.
	VisitFrom_clause_contents(ctx *From_clause_contentsContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#from_clause_contents_suffix.
	VisitFrom_clause_contents_suffix(ctx *From_clause_contents_suffixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#table_primary.
	VisitTable_primary(ctx *Table_primaryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#tvf_with_suffixes.
	VisitTvf_with_suffixes(ctx *Tvf_with_suffixesContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#pivot_or_unpivot_clause_and_aliases.
	VisitPivot_or_unpivot_clause_and_aliases(ctx *Pivot_or_unpivot_clause_and_aliasesContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#as_alias.
	VisitAs_alias(ctx *As_aliasContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#sample_clause.
	VisitSample_clause(ctx *Sample_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_sample_clause_suffix.
	VisitOpt_sample_clause_suffix(ctx *Opt_sample_clause_suffixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#repeatable_clause.
	VisitRepeatable_clause(ctx *Repeatable_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#possibly_cast_int_literal_or_parameter.
	VisitPossibly_cast_int_literal_or_parameter(ctx *Possibly_cast_int_literal_or_parameterContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#cast_int_literal_or_parameter.
	VisitCast_int_literal_or_parameter(ctx *Cast_int_literal_or_parameterContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#sample_size.
	VisitSample_size(ctx *Sample_sizeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#sample_size_value.
	VisitSample_size_value(ctx *Sample_size_valueContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#sample_size_unit.
	VisitSample_size_unit(ctx *Sample_size_unitContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#partition_by_clause_prefix_no_hint.
	VisitPartition_by_clause_prefix_no_hint(ctx *Partition_by_clause_prefix_no_hintContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#match_recognize_clause.
	VisitMatch_recognize_clause(ctx *Match_recognize_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#row_pattern_expr.
	VisitRow_pattern_expr(ctx *Row_pattern_exprContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#row_pattern_concatenation.
	VisitRow_pattern_concatenation(ctx *Row_pattern_concatenationContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#row_pattern_factor.
	VisitRow_pattern_factor(ctx *Row_pattern_factorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_list_prefix_with_as_aliases.
	VisitSelect_list_prefix_with_as_aliases(ctx *Select_list_prefix_with_as_aliasesContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_column_expr_with_as_alias.
	VisitSelect_column_expr_with_as_alias(ctx *Select_column_expr_with_as_aliasContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#table_subquery.
	VisitTable_subquery(ctx *Table_subqueryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#join.
	VisitJoin(ctx *JoinContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#join_item.
	VisitJoin_item(ctx *Join_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#on_or_using_clause_list.
	VisitOn_or_using_clause_list(ctx *On_or_using_clause_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#on_or_using_clause.
	VisitOn_or_using_clause(ctx *On_or_using_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#using_clause.
	VisitUsing_clause(ctx *Using_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#join_hint.
	VisitJoin_hint(ctx *Join_hintContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#table_path_expression.
	VisitTable_path_expression(ctx *Table_path_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_at_system_time.
	VisitOpt_at_system_time(ctx *Opt_at_system_timeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_with_offset_and_alias.
	VisitOpt_with_offset_and_alias(ctx *Opt_with_offset_and_aliasContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_pivot_or_unpivot_clause_and_alias.
	VisitOpt_pivot_or_unpivot_clause_and_alias(ctx *Opt_pivot_or_unpivot_clause_and_aliasContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#table_path_expression_base.
	VisitTable_path_expression_base(ctx *Table_path_expression_baseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#maybe_slashed_or_dashed_path_expression.
	VisitMaybe_slashed_or_dashed_path_expression(ctx *Maybe_slashed_or_dashed_path_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#maybe_dashed_path_expression.
	VisitMaybe_dashed_path_expression(ctx *Maybe_dashed_path_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#dashed_path_expression.
	VisitDashed_path_expression(ctx *Dashed_path_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#dashed_identifier.
	VisitDashed_identifier(ctx *Dashed_identifierContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#slashed_identifier.
	VisitSlashed_identifier(ctx *Slashed_identifierContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#identifier_or_integer.
	VisitIdentifier_or_integer(ctx *Identifier_or_integerContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#slashed_identifier_separator.
	VisitSlashed_identifier_separator(ctx *Slashed_identifier_separatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#slashed_path_expression.
	VisitSlashed_path_expression(ctx *Slashed_path_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unnest_expression.
	VisitUnnest_expression(ctx *Unnest_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unnest_expression_prefix.
	VisitUnnest_expression_prefix(ctx *Unnest_expression_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_array_zip_mode.
	VisitOpt_array_zip_mode(ctx *Opt_array_zip_modeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#expression_with_opt_alias.
	VisitExpression_with_opt_alias(ctx *Expression_with_opt_aliasContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#tvf_prefix.
	VisitTvf_prefix(ctx *Tvf_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#tvf_argument.
	VisitTvf_argument(ctx *Tvf_argumentContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#connection_clause.
	VisitConnection_clause(ctx *Connection_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#path_expression_or_default.
	VisitPath_expression_or_default(ctx *Path_expression_or_defaultContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#descriptor_argument.
	VisitDescriptor_argument(ctx *Descriptor_argumentContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#descriptor_column_list.
	VisitDescriptor_column_list(ctx *Descriptor_column_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#descriptor_column.
	VisitDescriptor_column(ctx *Descriptor_columnContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#table_clause.
	VisitTable_clause(ctx *Table_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#model_clause.
	VisitModel_clause(ctx *Model_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#qualify_clause_nonreserved.
	VisitQualify_clause_nonreserved(ctx *Qualify_clause_nonreservedContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unpivot_clause.
	VisitUnpivot_clause(ctx *Unpivot_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unpivot_in_item_list.
	VisitUnpivot_in_item_list(ctx *Unpivot_in_item_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unpivot_in_item_list_prefix.
	VisitUnpivot_in_item_list_prefix(ctx *Unpivot_in_item_list_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unpivot_in_item.
	VisitUnpivot_in_item(ctx *Unpivot_in_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_as_string_or_integer.
	VisitOpt_as_string_or_integer(ctx *Opt_as_string_or_integerContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#path_expression_list_with_opt_parens.
	VisitPath_expression_list_with_opt_parens(ctx *Path_expression_list_with_opt_parensContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#path_expression_list.
	VisitPath_expression_list(ctx *Path_expression_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unpivot_nulls_filter.
	VisitUnpivot_nulls_filter(ctx *Unpivot_nulls_filterContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#pivot_clause.
	VisitPivot_clause(ctx *Pivot_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#pivot_expression_list.
	VisitPivot_expression_list(ctx *Pivot_expression_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#pivot_expression.
	VisitPivot_expression(ctx *Pivot_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#pivot_value_list.
	VisitPivot_value_list(ctx *Pivot_value_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#pivot_value.
	VisitPivot_value(ctx *Pivot_valueContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#tvf_prefix_no_args.
	VisitTvf_prefix_no_args(ctx *Tvf_prefix_no_argsContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#join_type.
	VisitJoin_type(ctx *Join_typeContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_natural.
	VisitOpt_natural(ctx *Opt_naturalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#aggregate_function_call_as_alias_list.
	VisitAggregate_function_call_as_alias_list(ctx *Aggregate_function_call_as_alias_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#aggregate_function_call_as_alias_list_item.
	VisitAggregate_function_call_as_alias_list_item(ctx *Aggregate_function_call_as_alias_list_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unnest_operator.
	VisitUnnest_operator(ctx *Unnest_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#cross_join_operator.
	VisitCross_join_operator(ctx *Cross_join_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#conditional_join_operator.
	VisitConditional_join_operator(ctx *Conditional_join_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#on_clause.
	VisitOn_clause(ctx *On_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_list.
	VisitSelect_list(ctx *Select_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_list_item.
	VisitSelect_list_item(ctx *Select_list_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_column_star.
	VisitSelect_column_star(ctx *Select_column_starContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_column_expr.
	VisitSelect_column_expr(ctx *Select_column_exprContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#select_column_dot_star.
	VisitSelect_column_dot_star(ctx *Select_column_dot_starContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#star_modifiers.
	VisitStar_modifiers(ctx *Star_modifiersContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#star_except_list.
	VisitStar_except_list(ctx *Star_except_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#star_except_list_prefix.
	VisitStar_except_list_prefix(ctx *Star_except_list_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#star_modifiers_with_replace_prefix.
	VisitStar_modifiers_with_replace_prefix(ctx *Star_modifiers_with_replace_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#star_replace_item.
	VisitStar_replace_item(ctx *Star_replace_itemContext) interface{}

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

	// Visit a parse tree produced by GoogleSQLParser#expression_maybe_parenthesized_not_a_query.
	VisitExpression_maybe_parenthesized_not_a_query(ctx *Expression_maybe_parenthesized_not_a_queryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#parenthesized_in_rhs.
	VisitParenthesized_in_rhs(ctx *Parenthesized_in_rhsContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unary_operator.
	VisitUnary_operator(ctx *Unary_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#comparative_operator.
	VisitComparative_operator(ctx *Comparative_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#shift_operator.
	VisitShift_operator(ctx *Shift_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#additive_operator.
	VisitAdditive_operator(ctx *Additive_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#multiplicative_operator.
	VisitMultiplicative_operator(ctx *Multiplicative_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#is_operator.
	VisitIs_operator(ctx *Is_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#between_operator.
	VisitBetween_operator(ctx *Between_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#in_operator.
	VisitIn_operator(ctx *In_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#distinct_operator.
	VisitDistinct_operator(ctx *Distinct_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#parenthesized_query.
	VisitParenthesized_query(ctx *Parenthesized_queryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#parenthesized_expression_not_a_query.
	VisitParenthesized_expression_not_a_query(ctx *Parenthesized_expression_not_a_queryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#parenthesized_anysomeall_list_in_rhs.
	VisitParenthesized_anysomeall_list_in_rhs(ctx *Parenthesized_anysomeall_list_in_rhsContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#and_expression.
	VisitAnd_expression(ctx *And_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#unparenthesized_expression_higher_prec_than_and.
	VisitUnparenthesized_expression_higher_prec_than_and(ctx *Unparenthesized_expression_higher_prec_than_andContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#in_list_two_or_more_prefix.
	VisitIn_list_two_or_more_prefix(ctx *In_list_two_or_more_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#any_some_all.
	VisitAny_some_all(ctx *Any_some_allContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#like_operator.
	VisitLike_operator(ctx *Like_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#expression_subquery_with_keyword.
	VisitExpression_subquery_with_keyword(ctx *Expression_subquery_with_keywordContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#struct_constructor.
	VisitStruct_constructor(ctx *Struct_constructorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#struct_constructor_prefix_with_keyword.
	VisitStruct_constructor_prefix_with_keyword(ctx *Struct_constructor_prefix_with_keywordContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#struct_constructor_arg.
	VisitStruct_constructor_arg(ctx *Struct_constructor_argContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#struct_constructor_prefix_without_keyword.
	VisitStruct_constructor_prefix_without_keyword(ctx *Struct_constructor_prefix_without_keywordContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#struct_constructor_prefix_with_keyword_no_arg.
	VisitStruct_constructor_prefix_with_keyword_no_arg(ctx *Struct_constructor_prefix_with_keyword_no_argContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#interval_expression.
	VisitInterval_expression(ctx *Interval_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#function_call_expression_with_clauses.
	VisitFunction_call_expression_with_clauses(ctx *Function_call_expression_with_clausesContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#function_call_expression_with_clauses_suffix.
	VisitFunction_call_expression_with_clauses_suffix(ctx *Function_call_expression_with_clauses_suffixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#over_clause.
	VisitOver_clause(ctx *Over_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#window_specification.
	VisitWindow_specification(ctx *Window_specificationContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_window_frame_clause.
	VisitOpt_window_frame_clause(ctx *Opt_window_frame_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#window_frame_bound.
	VisitWindow_frame_bound(ctx *Window_frame_boundContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#preceding_or_following.
	VisitPreceding_or_following(ctx *Preceding_or_followingContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#frame_unit.
	VisitFrame_unit(ctx *Frame_unitContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#partition_by_clause.
	VisitPartition_by_clause(ctx *Partition_by_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#partition_by_clause_prefix.
	VisitPartition_by_clause_prefix(ctx *Partition_by_clause_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#with_group_rows.
	VisitWith_group_rows(ctx *With_group_rowsContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#with_report_modifier.
	VisitWith_report_modifier(ctx *With_report_modifierContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#clamped_between_modifier.
	VisitClamped_between_modifier(ctx *Clamped_between_modifierContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#with_report_format.
	VisitWith_report_format(ctx *With_report_formatContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#options_list.
	VisitOptions_list(ctx *Options_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#options_list_prefix.
	VisitOptions_list_prefix(ctx *Options_list_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#options_entry.
	VisitOptions_entry(ctx *Options_entryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#expression_or_proto.
	VisitExpression_or_proto(ctx *Expression_or_protoContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#options_assignment_operator.
	VisitOptions_assignment_operator(ctx *Options_assignment_operatorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_null_handling_modifier.
	VisitOpt_null_handling_modifier(ctx *Opt_null_handling_modifierContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#function_call_argument.
	VisitFunction_call_argument(ctx *Function_call_argumentContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#sequence_arg.
	VisitSequence_arg(ctx *Sequence_argContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#named_argument.
	VisitNamed_argument(ctx *Named_argumentContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#lambda_argument.
	VisitLambda_argument(ctx *Lambda_argumentContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#lambda_argument_list.
	VisitLambda_argument_list(ctx *Lambda_argument_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#limit_offset_clause.
	VisitLimit_offset_clause(ctx *Limit_offset_clauseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_having_or_group_by_modifier.
	VisitOpt_having_or_group_by_modifier(ctx *Opt_having_or_group_by_modifierContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#group_by_clause_prefix.
	VisitGroup_by_clause_prefix(ctx *Group_by_clause_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#group_by_preamble.
	VisitGroup_by_preamble(ctx *Group_by_preambleContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_and_order.
	VisitOpt_and_order(ctx *Opt_and_orderContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#hint.
	VisitHint(ctx *HintContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#hint_with_body.
	VisitHint_with_body(ctx *Hint_with_bodyContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#hint_with_body_prefix.
	VisitHint_with_body_prefix(ctx *Hint_with_body_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#hint_entry.
	VisitHint_entry(ctx *Hint_entryContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#identifier_in_hints.
	VisitIdentifier_in_hints(ctx *Identifier_in_hintsContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#extra_identifier_in_hints_name.
	VisitExtra_identifier_in_hints_name(ctx *Extra_identifier_in_hints_nameContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#grouping_item.
	VisitGrouping_item(ctx *Grouping_itemContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#grouping_set_list.
	VisitGrouping_set_list(ctx *Grouping_set_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#grouping_set.
	VisitGrouping_set(ctx *Grouping_setContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#cube_list.
	VisitCube_list(ctx *Cube_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#rollup_list.
	VisitRollup_list(ctx *Rollup_listContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_as_alias_with_required_as.
	VisitOpt_as_alias_with_required_as(ctx *Opt_as_alias_with_required_asContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_grouping_item_order.
	VisitOpt_grouping_item_order(ctx *Opt_grouping_item_orderContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_selection_item_order.
	VisitOpt_selection_item_order(ctx *Opt_selection_item_orderContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#asc_or_desc.
	VisitAsc_or_desc(ctx *Asc_or_descContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#null_order.
	VisitNull_order(ctx *Null_orderContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#function_name_from_keyword.
	VisitFunction_name_from_keyword(ctx *Function_name_from_keywordContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#replace_fields_expression.
	VisitReplace_fields_expression(ctx *Replace_fields_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#replace_fields_prefix.
	VisitReplace_fields_prefix(ctx *Replace_fields_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#replace_fields_arg.
	VisitReplace_fields_arg(ctx *Replace_fields_argContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#generalized_path_expression.
	VisitGeneralized_path_expression(ctx *Generalized_path_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#generalized_extension_path.
	VisitGeneralized_extension_path(ctx *Generalized_extension_pathContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#with_expression.
	VisitWith_expression(ctx *With_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#with_expression_variable_prefix.
	VisitWith_expression_variable_prefix(ctx *With_expression_variable_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#with_expression_variable.
	VisitWith_expression_variable(ctx *With_expression_variableContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#extract_expression.
	VisitExtract_expression(ctx *Extract_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#extract_expression_base.
	VisitExtract_expression_base(ctx *Extract_expression_baseContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_format.
	VisitOpt_format(ctx *Opt_formatContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#opt_at_time_zone.
	VisitOpt_at_time_zone(ctx *Opt_at_time_zoneContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#cast_expression.
	VisitCast_expression(ctx *Cast_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#case_expression.
	VisitCase_expression(ctx *Case_expressionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#case_expression_prefix.
	VisitCase_expression_prefix(ctx *Case_expression_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#case_value_expression_prefix.
	VisitCase_value_expression_prefix(ctx *Case_value_expression_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#case_no_value_expression_prefix.
	VisitCase_no_value_expression_prefix(ctx *Case_no_value_expression_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#struct_braced_constructor.
	VisitStruct_braced_constructor(ctx *Struct_braced_constructorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#braced_new_constructor.
	VisitBraced_new_constructor(ctx *Braced_new_constructorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#braced_constructor.
	VisitBraced_constructor(ctx *Braced_constructorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#braced_constructor_start.
	VisitBraced_constructor_start(ctx *Braced_constructor_startContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#braced_constructor_prefix.
	VisitBraced_constructor_prefix(ctx *Braced_constructor_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#braced_constructor_field.
	VisitBraced_constructor_field(ctx *Braced_constructor_fieldContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#braced_constructor_lhs.
	VisitBraced_constructor_lhs(ctx *Braced_constructor_lhsContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#braced_constructor_field_value.
	VisitBraced_constructor_field_value(ctx *Braced_constructor_field_valueContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#braced_constructor_extension.
	VisitBraced_constructor_extension(ctx *Braced_constructor_extensionContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#new_constructor.
	VisitNew_constructor(ctx *New_constructorContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#new_constructor_prefix.
	VisitNew_constructor_prefix(ctx *New_constructor_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#new_constructor_prefix_no_arg.
	VisitNew_constructor_prefix_no_arg(ctx *New_constructor_prefix_no_argContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#new_constructor_arg.
	VisitNew_constructor_arg(ctx *New_constructor_argContext) interface{}

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

	// Visit a parse tree produced by GoogleSQLParser#struct_type_prefix.
	VisitStruct_type_prefix(ctx *Struct_type_prefixContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#struct_field.
	VisitStruct_field(ctx *Struct_fieldContext) interface{}

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

	// Visit a parse tree produced by GoogleSQLParser#null_literal.
	VisitNull_literal(ctx *Null_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#boolean_literal.
	VisitBoolean_literal(ctx *Boolean_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#string_literal.
	VisitString_literal(ctx *String_literalContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#string_literal_component.
	VisitString_literal_component(ctx *String_literal_componentContext) interface{}

	// Visit a parse tree produced by GoogleSQLParser#bytes_literal_component.
	VisitBytes_literal_component(ctx *Bytes_literal_componentContext) interface{}
}
