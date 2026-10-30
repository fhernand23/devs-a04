// Generated from CFG_BOOLEAN_EXPRESSION.g4 by ANTLR 4.9.2
package rules;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CFG_BOOLEAN_EXPRESSIONParser}.
 */
public interface CFG_BOOLEAN_EXPRESSIONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code rootIfThen}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRootIfThen(CFG_BOOLEAN_EXPRESSIONParser.RootIfThenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rootIfThen}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRootIfThen(CFG_BOOLEAN_EXPRESSIONParser.RootIfThenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rootIf}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRootIf(CFG_BOOLEAN_EXPRESSIONParser.RootIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rootIf}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRootIf(CFG_BOOLEAN_EXPRESSIONParser.RootIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rootBooleanExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRootBooleanExpr(CFG_BOOLEAN_EXPRESSIONParser.RootBooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rootBooleanExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRootBooleanExpr(CFG_BOOLEAN_EXPRESSIONParser.RootBooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifConditionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionExpr(CFG_BOOLEAN_EXPRESSIONParser.IfConditionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifConditionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionExpr(CFG_BOOLEAN_EXPRESSIONParser.IfConditionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifConditionParExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionParExpr(CFG_BOOLEAN_EXPRESSIONParser.IfConditionParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifConditionParExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionParExpr(CFG_BOOLEAN_EXPRESSIONParser.IfConditionParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifConditionDefaultExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionDefaultExpr(CFG_BOOLEAN_EXPRESSIONParser.IfConditionDefaultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifConditionDefaultExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionDefaultExpr(CFG_BOOLEAN_EXPRESSIONParser.IfConditionDefaultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#ifThenCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfThenExpr(CFG_BOOLEAN_EXPRESSIONParser.IfThenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#ifThenCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfThenExpr(CFG_BOOLEAN_EXPRESSIONParser.IfThenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenParExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#ifThenCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfThenParExpr(CFG_BOOLEAN_EXPRESSIONParser.IfThenParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenParExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#ifThenCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfThenParExpr(CFG_BOOLEAN_EXPRESSIONParser.IfThenParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryConditionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryConditionExpr(CFG_BOOLEAN_EXPRESSIONParser.BinaryConditionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryConditionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryConditionExpr(CFG_BOOLEAN_EXPRESSIONParser.BinaryConditionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanTermExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTermExpr(CFG_BOOLEAN_EXPRESSIONParser.BooleanTermExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanTermExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTermExpr(CFG_BOOLEAN_EXPRESSIONParser.BooleanTermExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#binaryCondition}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(CFG_BOOLEAN_EXPRESSIONParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#binaryCondition}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(CFG_BOOLEAN_EXPRESSIONParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalTermExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterRelationalTermExpr(CFG_BOOLEAN_EXPRESSIONParser.RelationalTermExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalTermExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitRelationalTermExpr(CFG_BOOLEAN_EXPRESSIONParser.RelationalTermExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryTermExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTermExpr(CFG_BOOLEAN_EXPRESSIONParser.UnaryTermExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryTermExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTermExpr(CFG_BOOLEAN_EXPRESSIONParser.UnaryTermExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryCondExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#unaryCondition}.
	 * @param ctx the parse tree
	 */
	void enterUnaryCondExpr(CFG_BOOLEAN_EXPRESSIONParser.UnaryCondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryCondExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#unaryCondition}.
	 * @param ctx the parse tree
	 */
	void exitUnaryCondExpr(CFG_BOOLEAN_EXPRESSIONParser.UnaryCondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#relationalExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(CFG_BOOLEAN_EXPRESSIONParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#relationalExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(CFG_BOOLEAN_EXPRESSIONParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicElementExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionBasicTerm}.
	 * @param ctx the parse tree
	 */
	void enterBasicElementExpr(CFG_BOOLEAN_EXPRESSIONParser.BasicElementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicElementExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionBasicTerm}.
	 * @param ctx the parse tree
	 */
	void exitBasicElementExpr(CFG_BOOLEAN_EXPRESSIONParser.BasicElementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicParenthesisExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionBasicTerm}.
	 * @param ctx the parse tree
	 */
	void enterBasicParenthesisExpr(CFG_BOOLEAN_EXPRESSIONParser.BasicParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicParenthesisExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionBasicTerm}.
	 * @param ctx the parse tree
	 */
	void exitBasicParenthesisExpr(CFG_BOOLEAN_EXPRESSIONParser.BasicParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionElement}.
	 * @param ctx the parse tree
	 */
	void enterElementExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionElement}.
	 * @param ctx the parse tree
	 */
	void exitElementExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionElement}.
	 * @param ctx the parse tree
	 */
	void enterElementDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementDefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionElement}.
	 * @param ctx the parse tree
	 */
	void exitElementDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementDefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infinityExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionElement}.
	 * @param ctx the parse tree
	 */
	void enterInfinityExpr(CFG_BOOLEAN_EXPRESSIONParser.InfinityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infinityExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionElement}.
	 * @param ctx the parse tree
	 */
	void exitInfinityExpr(CFG_BOOLEAN_EXPRESSIONParser.InfinityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionResult}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(CFG_BOOLEAN_EXPRESSIONParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanExpressionResult}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(CFG_BOOLEAN_EXPRESSIONParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionInfinity}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#actionExpression}.
	 * @param ctx the parse tree
	 */
	void enterActionInfinity(CFG_BOOLEAN_EXPRESSIONParser.ActionInfinityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionInfinity}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#actionExpression}.
	 * @param ctx the parse tree
	 */
	void exitActionInfinity(CFG_BOOLEAN_EXPRESSIONParser.ActionInfinityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionElement}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#actionExpression}.
	 * @param ctx the parse tree
	 */
	void enterActionElement(CFG_BOOLEAN_EXPRESSIONParser.ActionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionElement}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#actionExpression}.
	 * @param ctx the parse tree
	 */
	void exitActionElement(CFG_BOOLEAN_EXPRESSIONParser.ActionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionElementDefinition}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#actionExpression}.
	 * @param ctx the parse tree
	 */
	void enterActionElementDefinition(CFG_BOOLEAN_EXPRESSIONParser.ActionElementDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionElementDefinition}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#actionExpression}.
	 * @param ctx the parse tree
	 */
	void exitActionElementDefinition(CFG_BOOLEAN_EXPRESSIONParser.ActionElementDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#ifSymbol}.
	 * @param ctx the parse tree
	 */
	void enterIfSymbol(CFG_BOOLEAN_EXPRESSIONParser.IfSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#ifSymbol}.
	 * @param ctx the parse tree
	 */
	void exitIfSymbol(CFG_BOOLEAN_EXPRESSIONParser.IfSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#inOtherCaseSymbol}.
	 * @param ctx the parse tree
	 */
	void enterInOtherCaseSymbol(CFG_BOOLEAN_EXPRESSIONParser.InOtherCaseSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#inOtherCaseSymbol}.
	 * @param ctx the parse tree
	 */
	void exitInOtherCaseSymbol(CFG_BOOLEAN_EXPRESSIONParser.InOtherCaseSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#unaryConditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryConditionalOperator(CFG_BOOLEAN_EXPRESSIONParser.UnaryConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#unaryConditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryConditionalOperator(CFG_BOOLEAN_EXPRESSIONParser.UnaryConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#binaryConditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryConditionalOperator(CFG_BOOLEAN_EXPRESSIONParser.BinaryConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#binaryConditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryConditionalOperator(CFG_BOOLEAN_EXPRESSIONParser.BinaryConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#binaryRelationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryRelationalOperator(CFG_BOOLEAN_EXPRESSIONParser.BinaryRelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#binaryRelationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryRelationalOperator(CFG_BOOLEAN_EXPRESSIONParser.BinaryRelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator(CFG_BOOLEAN_EXPRESSIONParser.NotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator(CFG_BOOLEAN_EXPRESSIONParser.NotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(CFG_BOOLEAN_EXPRESSIONParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(CFG_BOOLEAN_EXPRESSIONParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(CFG_BOOLEAN_EXPRESSIONParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(CFG_BOOLEAN_EXPRESSIONParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#equalToOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualToOperator(CFG_BOOLEAN_EXPRESSIONParser.EqualToOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#equalToOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualToOperator(CFG_BOOLEAN_EXPRESSIONParser.EqualToOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#notEqualToOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualToOperator(CFG_BOOLEAN_EXPRESSIONParser.NotEqualToOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#notEqualToOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualToOperator(CFG_BOOLEAN_EXPRESSIONParser.NotEqualToOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#greaterThanOperator}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOperator(CFG_BOOLEAN_EXPRESSIONParser.GreaterThanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#greaterThanOperator}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOperator(CFG_BOOLEAN_EXPRESSIONParser.GreaterThanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#lessThanOperator}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOperator(CFG_BOOLEAN_EXPRESSIONParser.LessThanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#lessThanOperator}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOperator(CFG_BOOLEAN_EXPRESSIONParser.LessThanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#greaterThanOrEqualToOperator}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualToOperator(CFG_BOOLEAN_EXPRESSIONParser.GreaterThanOrEqualToOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#greaterThanOrEqualToOperator}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualToOperator(CFG_BOOLEAN_EXPRESSIONParser.GreaterThanOrEqualToOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#lessThanOrEqualToOperator}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualToOperator(CFG_BOOLEAN_EXPRESSIONParser.LessThanOrEqualToOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#lessThanOrEqualToOperator}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualToOperator(CFG_BOOLEAN_EXPRESSIONParser.LessThanOrEqualToOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#modelSignature}.
	 * @param ctx the parse tree
	 */
	void enterModelSignature(CFG_BOOLEAN_EXPRESSIONParser.ModelSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#modelSignature}.
	 * @param ctx the parse tree
	 */
	void exitModelSignature(CFG_BOOLEAN_EXPRESSIONParser.ModelSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#modelSymbol}.
	 * @param ctx the parse tree
	 */
	void enterModelSymbol(CFG_BOOLEAN_EXPRESSIONParser.ModelSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#modelSymbol}.
	 * @param ctx the parse tree
	 */
	void exitModelSymbol(CFG_BOOLEAN_EXPRESSIONParser.ModelSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CFG_BOOLEAN_EXPRESSIONParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CFG_BOOLEAN_EXPRESSIONParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CFG_BOOLEAN_EXPRESSIONParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CFG_BOOLEAN_EXPRESSIONParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CFG_BOOLEAN_EXPRESSIONParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CFG_BOOLEAN_EXPRESSIONParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#variableFixedValues}.
	 * @param ctx the parse tree
	 */
	void enterVariableFixedValues(CFG_BOOLEAN_EXPRESSIONParser.VariableFixedValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#variableFixedValues}.
	 * @param ctx the parse tree
	 */
	void exitVariableFixedValues(CFG_BOOLEAN_EXPRESSIONParser.VariableFixedValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(CFG_BOOLEAN_EXPRESSIONParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(CFG_BOOLEAN_EXPRESSIONParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#datatypeSymbol}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeSymbol(CFG_BOOLEAN_EXPRESSIONParser.DatatypeSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#datatypeSymbol}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeSymbol(CFG_BOOLEAN_EXPRESSIONParser.DatatypeSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#trueSymbol}.
	 * @param ctx the parse tree
	 */
	void enterTrueSymbol(CFG_BOOLEAN_EXPRESSIONParser.TrueSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#trueSymbol}.
	 * @param ctx the parse tree
	 */
	void exitTrueSymbol(CFG_BOOLEAN_EXPRESSIONParser.TrueSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#falseSymbol}.
	 * @param ctx the parse tree
	 */
	void enterFalseSymbol(CFG_BOOLEAN_EXPRESSIONParser.FalseSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#falseSymbol}.
	 * @param ctx the parse tree
	 */
	void exitFalseSymbol(CFG_BOOLEAN_EXPRESSIONParser.FalseSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#integerSymbol}.
	 * @param ctx the parse tree
	 */
	void enterIntegerSymbol(CFG_BOOLEAN_EXPRESSIONParser.IntegerSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#integerSymbol}.
	 * @param ctx the parse tree
	 */
	void exitIntegerSymbol(CFG_BOOLEAN_EXPRESSIONParser.IntegerSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#realSymbol}.
	 * @param ctx the parse tree
	 */
	void enterRealSymbol(CFG_BOOLEAN_EXPRESSIONParser.RealSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#realSymbol}.
	 * @param ctx the parse tree
	 */
	void exitRealSymbol(CFG_BOOLEAN_EXPRESSIONParser.RealSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#infinitySymbol}.
	 * @param ctx the parse tree
	 */
	void enterInfinitySymbol(CFG_BOOLEAN_EXPRESSIONParser.InfinitySymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#infinitySymbol}.
	 * @param ctx the parse tree
	 */
	void exitInfinitySymbol(CFG_BOOLEAN_EXPRESSIONParser.InfinitySymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#stringSymbol}.
	 * @param ctx the parse tree
	 */
	void enterStringSymbol(CFG_BOOLEAN_EXPRESSIONParser.StringSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#stringSymbol}.
	 * @param ctx the parse tree
	 */
	void exitStringSymbol(CFG_BOOLEAN_EXPRESSIONParser.StringSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setImplicitDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSetImplicitDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.SetImplicitDefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setImplicitDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSetImplicitDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.SetImplicitDefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setExplicitDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSetExplicitDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.SetExplicitDefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setExplicitDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSetExplicitDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.SetExplicitDefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSetDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.SetDefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSetDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.SetDefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperationResultExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSetOperationResultExpr(CFG_BOOLEAN_EXPRESSIONParser.SetOperationResultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperationResultExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSetOperationResultExpr(CFG_BOOLEAN_EXPRESSIONParser.SetOperationResultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setAssignmentExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setExplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentExpr(CFG_BOOLEAN_EXPRESSIONParser.SetAssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setAssignmentExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setExplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentExpr(CFG_BOOLEAN_EXPRESSIONParser.SetAssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementCollectionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setDefinition}.
	 * @param ctx the parse tree
	 */
	void enterElementCollectionExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementCollectionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementCollectionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setDefinition}.
	 * @param ctx the parse tree
	 */
	void exitElementCollectionExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementCollectionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleCollectionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTupleCollectionExpr(CFG_BOOLEAN_EXPRESSIONParser.TupleCollectionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleCollectionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTupleCollectionExpr(CFG_BOOLEAN_EXPRESSIONParser.TupleCollectionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNameSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetNameSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.SetNameSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNameSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetNameSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.SetNameSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void enterIntegerSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.IntegerSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void exitIntegerSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.IntegerSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naturalSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void enterNaturalSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.NaturalSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naturalSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void exitNaturalSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.NaturalSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void enterRealSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.RealSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void exitRealSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.RealSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void enterBooleanSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.BooleanSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void exitBooleanSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.BooleanSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setName}.
	 * @param ctx the parse tree
	 */
	void enterSetName(CFG_BOOLEAN_EXPRESSIONParser.SetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setName}.
	 * @param ctx the parse tree
	 */
	void exitSetName(CFG_BOOLEAN_EXPRESSIONParser.SetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setOfIntegerNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfIntegerNumbersSymbol(CFG_BOOLEAN_EXPRESSIONParser.SetOfIntegerNumbersSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setOfIntegerNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfIntegerNumbersSymbol(CFG_BOOLEAN_EXPRESSIONParser.SetOfIntegerNumbersSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setOfNaturalNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfNaturalNumbersSymbol(CFG_BOOLEAN_EXPRESSIONParser.SetOfNaturalNumbersSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setOfNaturalNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfNaturalNumbersSymbol(CFG_BOOLEAN_EXPRESSIONParser.SetOfNaturalNumbersSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setOfRealNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfRealNumbersSymbol(CFG_BOOLEAN_EXPRESSIONParser.SetOfRealNumbersSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setOfRealNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfRealNumbersSymbol(CFG_BOOLEAN_EXPRESSIONParser.SetOfRealNumbersSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setOfBooleanAlgebraSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfBooleanAlgebraSymbol(CFG_BOOLEAN_EXPRESSIONParser.SetOfBooleanAlgebraSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setOfBooleanAlgebraSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfBooleanAlgebraSymbol(CFG_BOOLEAN_EXPRESSIONParser.SetOfBooleanAlgebraSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementListExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void enterElementListExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementListExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void exitElementListExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementSuchThatExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void enterElementSuchThatExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementSuchThatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementSuchThatExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void exitElementSuchThatExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementSuchThatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptySetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void enterEmptySetExpr(CFG_BOOLEAN_EXPRESSIONParser.EmptySetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptySetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void exitEmptySetExpr(CFG_BOOLEAN_EXPRESSIONParser.EmptySetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementIdentifier}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementIdentifier(CFG_BOOLEAN_EXPRESSIONParser.ElementIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementIdentifier}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementIdentifier(CFG_BOOLEAN_EXPRESSIONParser.ElementIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementNumber}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementNumber(CFG_BOOLEAN_EXPRESSIONParser.ElementNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementNumber}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementNumber(CFG_BOOLEAN_EXPRESSIONParser.ElementNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementBoolean}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementBoolean(CFG_BOOLEAN_EXPRESSIONParser.ElementBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementBoolean}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementBoolean(CFG_BOOLEAN_EXPRESSIONParser.ElementBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementModelSignature}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementModelSignature(CFG_BOOLEAN_EXPRESSIONParser.ElementModelSignatureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementModelSignature}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementModelSignature(CFG_BOOLEAN_EXPRESSIONParser.ElementModelSignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementString}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementString(CFG_BOOLEAN_EXPRESSIONParser.ElementStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementString}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementString(CFG_BOOLEAN_EXPRESSIONParser.ElementStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementTuple}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementTuple(CFG_BOOLEAN_EXPRESSIONParser.ElementTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementTuple}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementTuple(CFG_BOOLEAN_EXPRESSIONParser.ElementTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementParameter}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementParameter(CFG_BOOLEAN_EXPRESSIONParser.ElementParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementParameter}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementParameter(CFG_BOOLEAN_EXPRESSIONParser.ElementParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleSuchThatExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#tupleCollection}.
	 * @param ctx the parse tree
	 */
	void enterTupleSuchThatExpr(CFG_BOOLEAN_EXPRESSIONParser.TupleSuchThatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleSuchThatExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#tupleCollection}.
	 * @param ctx the parse tree
	 */
	void exitTupleSuchThatExpr(CFG_BOOLEAN_EXPRESSIONParser.TupleSuchThatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpr(CFG_BOOLEAN_EXPRESSIONParser.TupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpr(CFG_BOOLEAN_EXPRESSIONParser.TupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyTupleExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTupleExpr(CFG_BOOLEAN_EXPRESSIONParser.EmptyTupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyTupleExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTupleExpr(CFG_BOOLEAN_EXPRESSIONParser.EmptyTupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableTupleExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void enterVariableTupleExpr(CFG_BOOLEAN_EXPRESSIONParser.VariableTupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableTupleExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void exitVariableTupleExpr(CFG_BOOLEAN_EXPRESSIONParser.VariableTupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyVariableTupleExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void enterEmptyVariableTupleExpr(CFG_BOOLEAN_EXPRESSIONParser.EmptyVariableTupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyVariableTupleExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void exitEmptyVariableTupleExpr(CFG_BOOLEAN_EXPRESSIONParser.EmptyVariableTupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableTupleFixedValuesExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 */
	void enterVariableTupleFixedValuesExpr(CFG_BOOLEAN_EXPRESSIONParser.VariableTupleFixedValuesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableTupleFixedValuesExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 */
	void exitVariableTupleFixedValuesExpr(CFG_BOOLEAN_EXPRESSIONParser.VariableTupleFixedValuesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyVariableTupleFixedValuesExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 */
	void enterEmptyVariableTupleFixedValuesExpr(CFG_BOOLEAN_EXPRESSIONParser.EmptyVariableTupleFixedValuesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyVariableTupleFixedValuesExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 */
	void exitEmptyVariableTupleFixedValuesExpr(CFG_BOOLEAN_EXPRESSIONParser.EmptyVariableTupleFixedValuesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#tupleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTupleDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.TupleDefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#tupleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTupleDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.TupleDefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementDefImplicitSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void enterElementDefImplicitSetExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementDefImplicitSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementDefImplicitSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void exitElementDefImplicitSetExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementDefImplicitSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementDefSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void enterElementDefSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementDefSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementDefSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void exitElementDefSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementDefSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementDefRangeExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void enterElementDefRangeExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementDefRangeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementDefRangeExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void exitElementDefRangeExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementDefRangeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defWithImplicitSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDefWithImplicitSetExpr(CFG_BOOLEAN_EXPRESSIONParser.DefWithImplicitSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defWithImplicitSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDefWithImplicitSetExpr(CFG_BOOLEAN_EXPRESSIONParser.DefWithImplicitSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defCollectionWithImplicitSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDefCollectionWithImplicitSetExpr(CFG_BOOLEAN_EXPRESSIONParser.DefCollectionWithImplicitSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defCollectionWithImplicitSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDefCollectionWithImplicitSetExpr(CFG_BOOLEAN_EXPRESSIONParser.DefCollectionWithImplicitSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defWithSymbolSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 */
	void enterDefWithSymbolSetExpr(CFG_BOOLEAN_EXPRESSIONParser.DefWithSymbolSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defWithSymbolSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 */
	void exitDefWithSymbolSetExpr(CFG_BOOLEAN_EXPRESSIONParser.DefWithSymbolSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defCollectionWithSymbolSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 */
	void enterDefCollectionWithSymbolSetExpr(CFG_BOOLEAN_EXPRESSIONParser.DefCollectionWithSymbolSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defCollectionWithSymbolSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 */
	void exitDefCollectionWithSymbolSetExpr(CFG_BOOLEAN_EXPRESSIONParser.DefCollectionWithSymbolSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defWithRangeExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithRange}.
	 * @param ctx the parse tree
	 */
	void enterDefWithRangeExpr(CFG_BOOLEAN_EXPRESSIONParser.DefWithRangeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defWithRangeExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithRange}.
	 * @param ctx the parse tree
	 */
	void exitDefWithRangeExpr(CFG_BOOLEAN_EXPRESSIONParser.DefWithRangeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defCollectionWithRangeExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithRange}.
	 * @param ctx the parse tree
	 */
	void enterDefCollectionWithRangeExpr(CFG_BOOLEAN_EXPRESSIONParser.DefCollectionWithRangeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defCollectionWithRangeExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#definitionWithRange}.
	 * @param ctx the parse tree
	 */
	void exitDefCollectionWithRangeExpr(CFG_BOOLEAN_EXPRESSIONParser.DefCollectionWithRangeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpr(CFG_BOOLEAN_EXPRESSIONParser.RangeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpr(CFG_BOOLEAN_EXPRESSIONParser.RangeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanSymbol}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(CFG_BOOLEAN_EXPRESSIONParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanSymbol}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(CFG_BOOLEAN_EXPRESSIONParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanSymbol}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(CFG_BOOLEAN_EXPRESSIONParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#booleanSymbol}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(CFG_BOOLEAN_EXPRESSIONParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#numberSymbol}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpr(CFG_BOOLEAN_EXPRESSIONParser.IntegerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#numberSymbol}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpr(CFG_BOOLEAN_EXPRESSIONParser.IntegerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#numberSymbol}.
	 * @param ctx the parse tree
	 */
	void enterRealExpr(CFG_BOOLEAN_EXPRESSIONParser.RealExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#numberSymbol}.
	 * @param ctx the parse tree
	 */
	void exitRealExpr(CFG_BOOLEAN_EXPRESSIONParser.RealExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#emptySetSymbol}.
	 * @param ctx the parse tree
	 */
	void enterEmptySetSymbol(CFG_BOOLEAN_EXPRESSIONParser.EmptySetSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#emptySetSymbol}.
	 * @param ctx the parse tree
	 */
	void exitEmptySetSymbol(CFG_BOOLEAN_EXPRESSIONParser.EmptySetSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#emptyTupleSymbol}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTupleSymbol(CFG_BOOLEAN_EXPRESSIONParser.EmptyTupleSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#emptyTupleSymbol}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTupleSymbol(CFG_BOOLEAN_EXPRESSIONParser.EmptyTupleSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperationExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperationResult}.
	 * @param ctx the parse tree
	 */
	void enterSetOperationExpr(CFG_BOOLEAN_EXPRESSIONParser.SetOperationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperationExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperationResult}.
	 * @param ctx the parse tree
	 */
	void exitSetOperationExpr(CFG_BOOLEAN_EXPRESSIONParser.SetOperationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperationTerm}.
	 * @param ctx the parse tree
	 */
	void enterOperationSetExpr(CFG_BOOLEAN_EXPRESSIONParser.OperationSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationSetExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperationTerm}.
	 * @param ctx the parse tree
	 */
	void exitOperationSetExpr(CFG_BOOLEAN_EXPRESSIONParser.OperationSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperationParExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperationTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperationParExpr(CFG_BOOLEAN_EXPRESSIONParser.SetOperationParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperationParExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperationTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperationParExpr(CFG_BOOLEAN_EXPRESSIONParser.SetOperationParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperationParenthesisExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperationExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetOperationParenthesisExpr(CFG_BOOLEAN_EXPRESSIONParser.SetOperationParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperationParenthesisExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperationExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetOperationParenthesisExpr(CFG_BOOLEAN_EXPRESSIONParser.SetOperationParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationSetDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#operationSet}.
	 * @param ctx the parse tree
	 */
	void enterOperationSetDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.OperationSetDefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationSetDefinitionExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#operationSet}.
	 * @param ctx the parse tree
	 */
	void exitOperationSetDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.OperationSetDefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#operationSet}.
	 * @param ctx the parse tree
	 */
	void enterOperationSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.OperationSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationSetSymbolExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#operationSet}.
	 * @param ctx the parse tree
	 */
	void exitOperationSetSymbolExpr(CFG_BOOLEAN_EXPRESSIONParser.OperationSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inOperatorExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#belongsToOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperatorExpr(CFG_BOOLEAN_EXPRESSIONParser.InOperatorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inOperatorExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#belongsToOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperatorExpr(CFG_BOOLEAN_EXPRESSIONParser.InOperatorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notInOperatorExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#belongsToOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotInOperatorExpr(CFG_BOOLEAN_EXPRESSIONParser.NotInOperatorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notInOperatorExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#belongsToOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotInOperatorExpr(CFG_BOOLEAN_EXPRESSIONParser.NotInOperatorExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperator(CFG_BOOLEAN_EXPRESSIONParser.InOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperator(CFG_BOOLEAN_EXPRESSIONParser.InOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#notInOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotInOperator(CFG_BOOLEAN_EXPRESSIONParser.NotInOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#notInOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotInOperator(CFG_BOOLEAN_EXPRESSIONParser.NotInOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cartesianProductOpExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProductOpExpr(CFG_BOOLEAN_EXPRESSIONParser.CartesianProductOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cartesianProductOpExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProductOpExpr(CFG_BOOLEAN_EXPRESSIONParser.CartesianProductOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionOpExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnionOpExpr(CFG_BOOLEAN_EXPRESSIONParser.UnionOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionOpExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnionOpExpr(CFG_BOOLEAN_EXPRESSIONParser.UnionOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intersectionOpExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionOpExpr(CFG_BOOLEAN_EXPRESSIONParser.IntersectionOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intersectionOpExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionOpExpr(CFG_BOOLEAN_EXPRESSIONParser.IntersectionOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code differenceOpExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void enterDifferenceOpExpr(CFG_BOOLEAN_EXPRESSIONParser.DifferenceOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code differenceOpExpr}
	 * labeled alternative in {@link CFG_BOOLEAN_EXPRESSIONParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void exitDifferenceOpExpr(CFG_BOOLEAN_EXPRESSIONParser.DifferenceOpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#cartesianProductOperator}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProductOperator(CFG_BOOLEAN_EXPRESSIONParser.CartesianProductOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#cartesianProductOperator}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProductOperator(CFG_BOOLEAN_EXPRESSIONParser.CartesianProductOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#unionOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnionOperator(CFG_BOOLEAN_EXPRESSIONParser.UnionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#unionOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnionOperator(CFG_BOOLEAN_EXPRESSIONParser.UnionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#intersectionOperator}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionOperator(CFG_BOOLEAN_EXPRESSIONParser.IntersectionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#intersectionOperator}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionOperator(CFG_BOOLEAN_EXPRESSIONParser.IntersectionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setdifferenceOperator}.
	 * @param ctx the parse tree
	 */
	void enterSetdifferenceOperator(CFG_BOOLEAN_EXPRESSIONParser.SetdifferenceOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_BOOLEAN_EXPRESSIONParser#setdifferenceOperator}.
	 * @param ctx the parse tree
	 */
	void exitSetdifferenceOperator(CFG_BOOLEAN_EXPRESSIONParser.SetdifferenceOperatorContext ctx);
}