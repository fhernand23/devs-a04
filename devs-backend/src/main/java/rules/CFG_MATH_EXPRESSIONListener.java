// Generated from CFG_MATH_EXPRESSION.g4 by ANTLR 4.4


package rules;


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CFG_MATH_EXPRESSIONParser}.
 */
public interface CFG_MATH_EXPRESSIONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOperationTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperationTerm(@NotNull CFG_MATH_EXPRESSIONParser.SetOperationTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOperationTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperationTerm(@NotNull CFG_MATH_EXPRESSIONParser.SetOperationTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void enterElementCollection(@NotNull CFG_MATH_EXPRESSIONParser.ElementCollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void exitElementCollection(@NotNull CFG_MATH_EXPRESSIONParser.ElementCollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOperationExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetOperationExpression(@NotNull CFG_MATH_EXPRESSIONParser.SetOperationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOperationExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetOperationExpression(@NotNull CFG_MATH_EXPRESSIONParser.SetOperationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpression(@NotNull CFG_MATH_EXPRESSIONParser.MathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpression(@NotNull CFG_MATH_EXPRESSIONParser.MathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionWithSetSymbol(@NotNull CFG_MATH_EXPRESSIONParser.DefinitionWithSetSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionWithSetSymbol(@NotNull CFG_MATH_EXPRESSIONParser.DefinitionWithSetSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSetImplicitDefinition(@NotNull CFG_MATH_EXPRESSIONParser.SetImplicitDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSetImplicitDefinition(@NotNull CFG_MATH_EXPRESSIONParser.SetImplicitDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOfIntegerNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfIntegerNumbersSymbol(@NotNull CFG_MATH_EXPRESSIONParser.SetOfIntegerNumbersSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOfIntegerNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfIntegerNumbersSymbol(@NotNull CFG_MATH_EXPRESSIONParser.SetOfIntegerNumbersSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#tupleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTupleDefinition(@NotNull CFG_MATH_EXPRESSIONParser.TupleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#tupleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTupleDefinition(@NotNull CFG_MATH_EXPRESSIONParser.TupleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void enterSetOperator(@NotNull CFG_MATH_EXPRESSIONParser.SetOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void exitSetOperator(@NotNull CFG_MATH_EXPRESSIONParser.SetOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#stringSymbol}.
	 * @param ctx the parse tree
	 */
	void enterStringSymbol(@NotNull CFG_MATH_EXPRESSIONParser.StringSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#stringSymbol}.
	 * @param ctx the parse tree
	 */
	void exitStringSymbol(@NotNull CFG_MATH_EXPRESSIONParser.StringSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#sqrtOperator}.
	 * @param ctx the parse tree
	 */
	void enterSqrtOperator(@NotNull CFG_MATH_EXPRESSIONParser.SqrtOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#sqrtOperator}.
	 * @param ctx the parse tree
	 */
	void exitSqrtOperator(@NotNull CFG_MATH_EXPRESSIONParser.SqrtOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull CFG_MATH_EXPRESSIONParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull CFG_MATH_EXPRESSIONParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#divisionOperator}.
	 * @param ctx the parse tree
	 */
	void enterDivisionOperator(@NotNull CFG_MATH_EXPRESSIONParser.DivisionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#divisionOperator}.
	 * @param ctx the parse tree
	 */
	void exitDivisionOperator(@NotNull CFG_MATH_EXPRESSIONParser.DivisionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull CFG_MATH_EXPRESSIONParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull CFG_MATH_EXPRESSIONParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathExpressionElement}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionElement(@NotNull CFG_MATH_EXPRESSIONParser.MathExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathExpressionElement}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionElement(@NotNull CFG_MATH_EXPRESSIONParser.MathExpressionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionTerm(@NotNull CFG_MATH_EXPRESSIONParser.MathExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathExpressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionTerm(@NotNull CFG_MATH_EXPRESSIONParser.MathExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#additionOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditionOperator(@NotNull CFG_MATH_EXPRESSIONParser.AdditionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#additionOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditionOperator(@NotNull CFG_MATH_EXPRESSIONParser.AdditionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void enterVariableTuple(@NotNull CFG_MATH_EXPRESSIONParser.VariableTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void exitVariableTuple(@NotNull CFG_MATH_EXPRESSIONParser.VariableTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#infinitySymbol}.
	 * @param ctx the parse tree
	 */
	void enterInfinitySymbol(@NotNull CFG_MATH_EXPRESSIONParser.InfinitySymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#infinitySymbol}.
	 * @param ctx the parse tree
	 */
	void exitInfinitySymbol(@NotNull CFG_MATH_EXPRESSIONParser.InfinitySymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#intersectionOperator}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionOperator(@NotNull CFG_MATH_EXPRESSIONParser.IntersectionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#intersectionOperator}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionOperator(@NotNull CFG_MATH_EXPRESSIONParser.IntersectionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#multiplicationOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationOperator(@NotNull CFG_MATH_EXPRESSIONParser.MultiplicationOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#multiplicationOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationOperator(@NotNull CFG_MATH_EXPRESSIONParser.MultiplicationOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathExpressionResult}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionResult(@NotNull CFG_MATH_EXPRESSIONParser.MathExpressionResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathExpressionResult}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionResult(@NotNull CFG_MATH_EXPRESSIONParser.MathExpressionResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#trueSymbol}.
	 * @param ctx the parse tree
	 */
	void enterTrueSymbol(@NotNull CFG_MATH_EXPRESSIONParser.TrueSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#trueSymbol}.
	 * @param ctx the parse tree
	 */
	void exitTrueSymbol(@NotNull CFG_MATH_EXPRESSIONParser.TrueSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSetDefinition(@NotNull CFG_MATH_EXPRESSIONParser.SetDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSetDefinition(@NotNull CFG_MATH_EXPRESSIONParser.SetDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(@NotNull CFG_MATH_EXPRESSIONParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(@NotNull CFG_MATH_EXPRESSIONParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#binaryMathExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMathExpression(@NotNull CFG_MATH_EXPRESSIONParser.BinaryMathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#binaryMathExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMathExpression(@NotNull CFG_MATH_EXPRESSIONParser.BinaryMathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setExplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSetExplicitDefinition(@NotNull CFG_MATH_EXPRESSIONParser.SetExplicitDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setExplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSetExplicitDefinition(@NotNull CFG_MATH_EXPRESSIONParser.SetExplicitDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setName}.
	 * @param ctx the parse tree
	 */
	void enterSetName(@NotNull CFG_MATH_EXPRESSIONParser.SetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setName}.
	 * @param ctx the parse tree
	 */
	void exitSetName(@NotNull CFG_MATH_EXPRESSIONParser.SetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOfRealNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfRealNumbersSymbol(@NotNull CFG_MATH_EXPRESSIONParser.SetOfRealNumbersSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOfRealNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfRealNumbersSymbol(@NotNull CFG_MATH_EXPRESSIONParser.SetOfRealNumbersSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#modelSignature}.
	 * @param ctx the parse tree
	 */
	void enterModelSignature(@NotNull CFG_MATH_EXPRESSIONParser.ModelSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#modelSignature}.
	 * @param ctx the parse tree
	 */
	void exitModelSignature(@NotNull CFG_MATH_EXPRESSIONParser.ModelSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#emptyTupleSymbol}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTupleSymbol(@NotNull CFG_MATH_EXPRESSIONParser.EmptyTupleSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#emptyTupleSymbol}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTupleSymbol(@NotNull CFG_MATH_EXPRESSIONParser.EmptyTupleSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#modelSymbol}.
	 * @param ctx the parse tree
	 */
	void enterModelSymbol(@NotNull CFG_MATH_EXPRESSIONParser.ModelSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#modelSymbol}.
	 * @param ctx the parse tree
	 */
	void exitModelSymbol(@NotNull CFG_MATH_EXPRESSIONParser.ModelSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#tupleCollection}.
	 * @param ctx the parse tree
	 */
	void enterTupleCollection(@NotNull CFG_MATH_EXPRESSIONParser.TupleCollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#tupleCollection}.
	 * @param ctx the parse tree
	 */
	void exitTupleCollection(@NotNull CFG_MATH_EXPRESSIONParser.TupleCollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull CFG_MATH_EXPRESSIONParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull CFG_MATH_EXPRESSIONParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#cartesianProductOperator}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProductOperator(@NotNull CFG_MATH_EXPRESSIONParser.CartesianProductOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#cartesianProductOperator}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProductOperator(@NotNull CFG_MATH_EXPRESSIONParser.CartesianProductOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathFactor}.
	 * @param ctx the parse tree
	 */
	void enterMathFactor(@NotNull CFG_MATH_EXPRESSIONParser.MathFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathFactor}.
	 * @param ctx the parse tree
	 */
	void exitMathFactor(@NotNull CFG_MATH_EXPRESSIONParser.MathFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#notInOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotInOperator(@NotNull CFG_MATH_EXPRESSIONParser.NotInOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#notInOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotInOperator(@NotNull CFG_MATH_EXPRESSIONParser.NotInOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#unaryMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMathOperator(@NotNull CFG_MATH_EXPRESSIONParser.UnaryMathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#unaryMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMathOperator(@NotNull CFG_MATH_EXPRESSIONParser.UnaryMathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(@NotNull CFG_MATH_EXPRESSIONParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(@NotNull CFG_MATH_EXPRESSIONParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#operationSet}.
	 * @param ctx the parse tree
	 */
	void enterOperationSet(@NotNull CFG_MATH_EXPRESSIONParser.OperationSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#operationSet}.
	 * @param ctx the parse tree
	 */
	void exitOperationSet(@NotNull CFG_MATH_EXPRESSIONParser.OperationSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#binaryMathOperatorLowerPrecedence}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMathOperatorLowerPrecedence(@NotNull CFG_MATH_EXPRESSIONParser.BinaryMathOperatorLowerPrecedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#binaryMathOperatorLowerPrecedence}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMathOperatorLowerPrecedence(@NotNull CFG_MATH_EXPRESSIONParser.BinaryMathOperatorLowerPrecedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 */
	void enterVariableTupleFixedValues(@NotNull CFG_MATH_EXPRESSIONParser.VariableTupleFixedValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 */
	void exitVariableTupleFixedValues(@NotNull CFG_MATH_EXPRESSIONParser.VariableTupleFixedValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOperationResult}.
	 * @param ctx the parse tree
	 */
	void enterSetOperationResult(@NotNull CFG_MATH_EXPRESSIONParser.SetOperationResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOperationResult}.
	 * @param ctx the parse tree
	 */
	void exitSetOperationResult(@NotNull CFG_MATH_EXPRESSIONParser.SetOperationResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull CFG_MATH_EXPRESSIONParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull CFG_MATH_EXPRESSIONParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#falseSymbol}.
	 * @param ctx the parse tree
	 */
	void enterFalseSymbol(@NotNull CFG_MATH_EXPRESSIONParser.FalseSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#falseSymbol}.
	 * @param ctx the parse tree
	 */
	void exitFalseSymbol(@NotNull CFG_MATH_EXPRESSIONParser.FalseSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#unionOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnionOperator(@NotNull CFG_MATH_EXPRESSIONParser.UnionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#unionOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnionOperator(@NotNull CFG_MATH_EXPRESSIONParser.UnionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOfNaturalNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfNaturalNumbersSymbol(@NotNull CFG_MATH_EXPRESSIONParser.SetOfNaturalNumbersSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOfNaturalNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfNaturalNumbersSymbol(@NotNull CFG_MATH_EXPRESSIONParser.SetOfNaturalNumbersSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathExpressionBasicTerm}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionBasicTerm(@NotNull CFG_MATH_EXPRESSIONParser.MathExpressionBasicTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathExpressionBasicTerm}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionBasicTerm(@NotNull CFG_MATH_EXPRESSIONParser.MathExpressionBasicTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#binaryMathOperatorHigherPrecedence}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMathOperatorHigherPrecedence(@NotNull CFG_MATH_EXPRESSIONParser.BinaryMathOperatorHigherPrecedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#binaryMathOperatorHigherPrecedence}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMathOperatorHigherPrecedence(@NotNull CFG_MATH_EXPRESSIONParser.BinaryMathOperatorHigherPrecedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperator(@NotNull CFG_MATH_EXPRESSIONParser.InOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperator(@NotNull CFG_MATH_EXPRESSIONParser.InOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(@NotNull CFG_MATH_EXPRESSIONParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(@NotNull CFG_MATH_EXPRESSIONParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#variableFixedValues}.
	 * @param ctx the parse tree
	 */
	void enterVariableFixedValues(@NotNull CFG_MATH_EXPRESSIONParser.VariableFixedValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#variableFixedValues}.
	 * @param ctx the parse tree
	 */
	void exitVariableFixedValues(@NotNull CFG_MATH_EXPRESSIONParser.VariableFixedValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#substractionOperator}.
	 * @param ctx the parse tree
	 */
	void enterSubstractionOperator(@NotNull CFG_MATH_EXPRESSIONParser.SubstractionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#substractionOperator}.
	 * @param ctx the parse tree
	 */
	void exitSubstractionOperator(@NotNull CFG_MATH_EXPRESSIONParser.SubstractionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#integerSymbol}.
	 * @param ctx the parse tree
	 */
	void enterIntegerSymbol(@NotNull CFG_MATH_EXPRESSIONParser.IntegerSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#integerSymbol}.
	 * @param ctx the parse tree
	 */
	void exitIntegerSymbol(@NotNull CFG_MATH_EXPRESSIONParser.IntegerSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#belongsToOperator}.
	 * @param ctx the parse tree
	 */
	void enterBelongsToOperator(@NotNull CFG_MATH_EXPRESSIONParser.BelongsToOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#belongsToOperator}.
	 * @param ctx the parse tree
	 */
	void exitBelongsToOperator(@NotNull CFG_MATH_EXPRESSIONParser.BelongsToOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#powerOperator}.
	 * @param ctx the parse tree
	 */
	void enterPowerOperator(@NotNull CFG_MATH_EXPRESSIONParser.PowerOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#powerOperator}.
	 * @param ctx the parse tree
	 */
	void exitPowerOperator(@NotNull CFG_MATH_EXPRESSIONParser.PowerOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#unaryMathExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMathExpression(@NotNull CFG_MATH_EXPRESSIONParser.UnaryMathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#unaryMathExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMathExpression(@NotNull CFG_MATH_EXPRESSIONParser.UnaryMathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionWithSetImplicitDefinition(@NotNull CFG_MATH_EXPRESSIONParser.DefinitionWithSetImplicitDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionWithSetImplicitDefinition(@NotNull CFG_MATH_EXPRESSIONParser.DefinitionWithSetImplicitDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#numberSymbol}.
	 * @param ctx the parse tree
	 */
	void enterNumberSymbol(@NotNull CFG_MATH_EXPRESSIONParser.NumberSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#numberSymbol}.
	 * @param ctx the parse tree
	 */
	void exitNumberSymbol(@NotNull CFG_MATH_EXPRESSIONParser.NumberSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#definitionWithRange}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionWithRange(@NotNull CFG_MATH_EXPRESSIONParser.DefinitionWithRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#definitionWithRange}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionWithRange(@NotNull CFG_MATH_EXPRESSIONParser.DefinitionWithRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#booleanSymbol}.
	 * @param ctx the parse tree
	 */
	void enterBooleanSymbol(@NotNull CFG_MATH_EXPRESSIONParser.BooleanSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#booleanSymbol}.
	 * @param ctx the parse tree
	 */
	void exitBooleanSymbol(@NotNull CFG_MATH_EXPRESSIONParser.BooleanSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#realSymbol}.
	 * @param ctx the parse tree
	 */
	void enterRealSymbol(@NotNull CFG_MATH_EXPRESSIONParser.RealSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#realSymbol}.
	 * @param ctx the parse tree
	 */
	void exitRealSymbol(@NotNull CFG_MATH_EXPRESSIONParser.RealSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setdifferenceOperator}.
	 * @param ctx the parse tree
	 */
	void enterSetdifferenceOperator(@NotNull CFG_MATH_EXPRESSIONParser.SetdifferenceOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setdifferenceOperator}.
	 * @param ctx the parse tree
	 */
	void exitSetdifferenceOperator(@NotNull CFG_MATH_EXPRESSIONParser.SetdifferenceOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOfBooleanAlgebraSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfBooleanAlgebraSymbol(@NotNull CFG_MATH_EXPRESSIONParser.SetOfBooleanAlgebraSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setOfBooleanAlgebraSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfBooleanAlgebraSymbol(@NotNull CFG_MATH_EXPRESSIONParser.SetOfBooleanAlgebraSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull CFG_MATH_EXPRESSIONParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull CFG_MATH_EXPRESSIONParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#datatypeSymbol}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeSymbol(@NotNull CFG_MATH_EXPRESSIONParser.DatatypeSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#datatypeSymbol}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeSymbol(@NotNull CFG_MATH_EXPRESSIONParser.DatatypeSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathTerm}.
	 * @param ctx the parse tree
	 */
	void enterMathTerm(@NotNull CFG_MATH_EXPRESSIONParser.MathTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#mathTerm}.
	 * @param ctx the parse tree
	 */
	void exitMathTerm(@NotNull CFG_MATH_EXPRESSIONParser.MathTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetSymbol(@NotNull CFG_MATH_EXPRESSIONParser.SetSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetSymbol(@NotNull CFG_MATH_EXPRESSIONParser.SetSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void enterElementDefinition(@NotNull CFG_MATH_EXPRESSIONParser.ElementDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void exitElementDefinition(@NotNull CFG_MATH_EXPRESSIONParser.ElementDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#emptySetSymbol}.
	 * @param ctx the parse tree
	 */
	void enterEmptySetSymbol(@NotNull CFG_MATH_EXPRESSIONParser.EmptySetSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_MATH_EXPRESSIONParser#emptySetSymbol}.
	 * @param ctx the parse tree
	 */
	void exitEmptySetSymbol(@NotNull CFG_MATH_EXPRESSIONParser.EmptySetSymbolContext ctx);
}