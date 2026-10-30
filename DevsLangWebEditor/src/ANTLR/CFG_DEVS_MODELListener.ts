// Generated from CFG_DEVS_MODEL.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { FunctionValuesAssignPreIfConditionalResultContext } from "./CFG_DEVS_MODELParser";
import { FunctionValuesAssignPreIfDefaultResultContext } from "./CFG_DEVS_MODELParser";
import { SetOperationParenthesisExprContext } from "./CFG_DEVS_MODELParser";
import { RelationalTermExprContext } from "./CFG_DEVS_MODELParser";
import { UnaryTermExprContext } from "./CFG_DEVS_MODELParser";
import { IfThenExprContext } from "./CFG_DEVS_MODELParser";
import { IfThenParExprContext } from "./CFG_DEVS_MODELParser";
import { UnaryCondExprContext } from "./CFG_DEVS_MODELParser";
import { TaFunctionPreIfConditionalResultContext } from "./CFG_DEVS_MODELParser";
import { TaFunctionPreIfDefaultResultContext } from "./CFG_DEVS_MODELParser";
import { ActionInfinityContext } from "./CFG_DEVS_MODELParser";
import { ActionElementContext } from "./CFG_DEVS_MODELParser";
import { ActionElementDefinitionContext } from "./CFG_DEVS_MODELParser";
import { ElementIdentifierContext } from "./CFG_DEVS_MODELParser";
import { ElementNumberContext } from "./CFG_DEVS_MODELParser";
import { ElementBooleanContext } from "./CFG_DEVS_MODELParser";
import { ElementModelSignatureContext } from "./CFG_DEVS_MODELParser";
import { ElementStringContext } from "./CFG_DEVS_MODELParser";
import { ElementTupleContext } from "./CFG_DEVS_MODELParser";
import { ElementParameterContext } from "./CFG_DEVS_MODELParser";
import { SelectAssignPreIfIdentifierConditionalResultContext } from "./CFG_DEVS_MODELParser";
import { SelectAssignPreIfParameterConditionalResultContext } from "./CFG_DEVS_MODELParser";
import { SelectAssignPreIfIdentifierDefaultResultContext } from "./CFG_DEVS_MODELParser";
import { SelectAssignPreIfParameterDefaultResultContext } from "./CFG_DEVS_MODELParser";
import { BinaryExprContext } from "./CFG_DEVS_MODELParser";
import { FunctionPreIfConditionalResultContext } from "./CFG_DEVS_MODELParser";
import { FunctionPreIfDefaultResultContext } from "./CFG_DEVS_MODELParser";
import { SetAssignmentExprContext } from "./CFG_DEVS_MODELParser";
import { RangeExprContext } from "./CFG_DEVS_MODELParser";
import { TupleExprContext } from "./CFG_DEVS_MODELParser";
import { EmptyTupleExprContext } from "./CFG_DEVS_MODELParser";
import { VariableTupleFixedValuesExprContext } from "./CFG_DEVS_MODELParser";
import { EmptyVariableTupleFixedValuesExprContext } from "./CFG_DEVS_MODELParser";
import { IfConditionExprContext } from "./CFG_DEVS_MODELParser";
import { IfConditionParExprContext } from "./CFG_DEVS_MODELParser";
import { IfConditionDefaultExprContext } from "./CFG_DEVS_MODELParser";
import { SetImplicitDefinitionExprContext } from "./CFG_DEVS_MODELParser";
import { SetExplicitDefinitionExprContext } from "./CFG_DEVS_MODELParser";
import { DefWithImplicitSetExprContext } from "./CFG_DEVS_MODELParser";
import { DefCollectionWithImplicitSetExprContext } from "./CFG_DEVS_MODELParser";
import { IntegerExprContext } from "./CFG_DEVS_MODELParser";
import { RealExprContext } from "./CFG_DEVS_MODELParser";
import { ElementExprContext } from "./CFG_DEVS_MODELParser";
import { ElementDefinitionExprContext } from "./CFG_DEVS_MODELParser";
import { InfinityExprContext } from "./CFG_DEVS_MODELParser";
import { OperationSetExprContext } from "./CFG_DEVS_MODELParser";
import { SetOperationParExprContext } from "./CFG_DEVS_MODELParser";
import { ElementListExprContext } from "./CFG_DEVS_MODELParser";
import { ElementSuchThatExprContext } from "./CFG_DEVS_MODELParser";
import { EmptySetExprContext } from "./CFG_DEVS_MODELParser";
import { TaAssignPreIfConditionalResultContext } from "./CFG_DEVS_MODELParser";
import { TaAssignPreIfDefaultResultContext } from "./CFG_DEVS_MODELParser";
import { DefWithSymbolSetExprContext } from "./CFG_DEVS_MODELParser";
import { DefCollectionWithSymbolSetExprContext } from "./CFG_DEVS_MODELParser";
import { SetDefinitionExprContext } from "./CFG_DEVS_MODELParser";
import { SetOperationResultExprContext } from "./CFG_DEVS_MODELParser";
import { TupleDefinitionExprContext } from "./CFG_DEVS_MODELParser";
import { CartesianProductOpExprContext } from "./CFG_DEVS_MODELParser";
import { UnionOpExprContext } from "./CFG_DEVS_MODELParser";
import { IntersectionOpExprContext } from "./CFG_DEVS_MODELParser";
import { DifferenceOpExprContext } from "./CFG_DEVS_MODELParser";
import { ParenthesisExprContext } from "./CFG_DEVS_MODELParser";
import { VariableTupleExprContext } from "./CFG_DEVS_MODELParser";
import { EmptyVariableTupleExprContext } from "./CFG_DEVS_MODELParser";
import { SelectFunctionPreIfConditionalResultContext } from "./CFG_DEVS_MODELParser";
import { SelectFunctionPreIfDefaultResultContext } from "./CFG_DEVS_MODELParser";
import { RelationalExprContext } from "./CFG_DEVS_MODELParser";
import { ElementCollectionExprContext } from "./CFG_DEVS_MODELParser";
import { TupleCollectionExprContext } from "./CFG_DEVS_MODELParser";
import { FunctionAssignPreIfConditionalResultContext } from "./CFG_DEVS_MODELParser";
import { FunctionAssignPreIfDefaultResultContext } from "./CFG_DEVS_MODELParser";
import { TupleSuchThatExprContext } from "./CFG_DEVS_MODELParser";
import { OperationSetDefinitionExprContext } from "./CFG_DEVS_MODELParser";
import { OperationSetSymbolExprContext } from "./CFG_DEVS_MODELParser";
import { SetOperationExprContext } from "./CFG_DEVS_MODELParser";
import { RootIfThenContext } from "./CFG_DEVS_MODELParser";
import { RootIfContext } from "./CFG_DEVS_MODELParser";
import { RootBooleanExprContext } from "./CFG_DEVS_MODELParser";
import { BasicElementExprContext } from "./CFG_DEVS_MODELParser";
import { BasicParenthesisExprContext } from "./CFG_DEVS_MODELParser";
import { InOperatorExprContext } from "./CFG_DEVS_MODELParser";
import { NotInOperatorExprContext } from "./CFG_DEVS_MODELParser";
import { BinaryConditionExprContext } from "./CFG_DEVS_MODELParser";
import { BooleanTermExprContext } from "./CFG_DEVS_MODELParser";
import { DefWithRangeExprContext } from "./CFG_DEVS_MODELParser";
import { DefCollectionWithRangeExprContext } from "./CFG_DEVS_MODELParser";
import { TrueExprContext } from "./CFG_DEVS_MODELParser";
import { FalseExprContext } from "./CFG_DEVS_MODELParser";
import { SetNameSymbolExprContext } from "./CFG_DEVS_MODELParser";
import { IntegerSetSymbolExprContext } from "./CFG_DEVS_MODELParser";
import { NaturalSetSymbolExprContext } from "./CFG_DEVS_MODELParser";
import { RealSetSymbolExprContext } from "./CFG_DEVS_MODELParser";
import { BooleanSetSymbolExprContext } from "./CFG_DEVS_MODELParser";
import { ElementDefImplicitSetExprContext } from "./CFG_DEVS_MODELParser";
import { ElementDefSetSymbolExprContext } from "./CFG_DEVS_MODELParser";
import { ElementDefRangeExprContext } from "./CFG_DEVS_MODELParser";
import { DevsSpecificationContext } from "./CFG_DEVS_MODELParser";
import { DevsModelContext } from "./CFG_DEVS_MODELParser";
import { SetInModelContext } from "./CFG_DEVS_MODELParser";
import { AtomicModelContext } from "./CFG_DEVS_MODELParser";
import { AtomicModelTupleContext } from "./CFG_DEVS_MODELParser";
import { CoupledModelContext } from "./CFG_DEVS_MODELParser";
import { CoupledModelTupleContext } from "./CFG_DEVS_MODELParser";
import { ModelDefinitionContext } from "./CFG_DEVS_MODELParser";
import { ModelSentenceContext } from "./CFG_DEVS_MODELParser";
import { FunctionContext } from "./CFG_DEVS_MODELParser";
import { DelExtFunctionContext } from "./CFG_DEVS_MODELParser";
import { DelExtFunctionNameContext } from "./CFG_DEVS_MODELParser";
import { DelIntFunctionContext } from "./CFG_DEVS_MODELParser";
import { DelIntFunctionNameContext } from "./CFG_DEVS_MODELParser";
import { LambdaFunctionContext } from "./CFG_DEVS_MODELParser";
import { LambdaFunctionNameContext } from "./CFG_DEVS_MODELParser";
import { TaFunctionContext } from "./CFG_DEVS_MODELParser";
import { TaFunctionNameContext } from "./CFG_DEVS_MODELParser";
import { SelectFunctionContext } from "./CFG_DEVS_MODELParser";
import { SelectFunctionNameContext } from "./CFG_DEVS_MODELParser";
import { FunctionDescriptionContext } from "./CFG_DEVS_MODELParser";
import { FunctionDescriptionPreIfContext } from "./CFG_DEVS_MODELParser";
import { FunctionPreIfResultContext } from "./CFG_DEVS_MODELParser";
import { FunctionDescriptionPostIfContext } from "./CFG_DEVS_MODELParser";
import { FunctionPostIfResultContext } from "./CFG_DEVS_MODELParser";
import { FunctionGenericDescriptionContext } from "./CFG_DEVS_MODELParser";
import { FunctionDescriptionAssignmentPreIfContext } from "./CFG_DEVS_MODELParser";
import { FunctionDescriptionAssignmentPostIfContext } from "./CFG_DEVS_MODELParser";
import { FunctionAssignPreIfResultContext } from "./CFG_DEVS_MODELParser";
import { FunctionAssignPostIfResultContext } from "./CFG_DEVS_MODELParser";
import { FunctionGenericValuesDescriptionContext } from "./CFG_DEVS_MODELParser";
import { FunctionDescriptionValuesAssignmentPreIfContext } from "./CFG_DEVS_MODELParser";
import { FunctionDescriptionValuesAssignmentPostIfContext } from "./CFG_DEVS_MODELParser";
import { FunctionValuesAssignPreIfResultContext } from "./CFG_DEVS_MODELParser";
import { FunctionValuesAssignPostIfResultContext } from "./CFG_DEVS_MODELParser";
import { TupleValueContext } from "./CFG_DEVS_MODELParser";
import { ValueContext } from "./CFG_DEVS_MODELParser";
import { TaFunctionDescriptionContext } from "./CFG_DEVS_MODELParser";
import { TaFunctionDescriptionPreIfContext } from "./CFG_DEVS_MODELParser";
import { TaFunctionPreIfResultContext } from "./CFG_DEVS_MODELParser";
import { TaFunctionDescriptionPostIfContext } from "./CFG_DEVS_MODELParser";
import { TaFunctionPostIfResultContext } from "./CFG_DEVS_MODELParser";
import { TaFunctionGenericDescriptionContext } from "./CFG_DEVS_MODELParser";
import { TaAssignPreIfContext } from "./CFG_DEVS_MODELParser";
import { TaAssignPreIfResultContext } from "./CFG_DEVS_MODELParser";
import { TaAssignPostIfContext } from "./CFG_DEVS_MODELParser";
import { TaAssignPostIfResultContext } from "./CFG_DEVS_MODELParser";
import { SelectFunctionDescriptionContext } from "./CFG_DEVS_MODELParser";
import { SelectFunctionDescriptionPreIfContext } from "./CFG_DEVS_MODELParser";
import { SelectFunctionPreIfResultContext } from "./CFG_DEVS_MODELParser";
import { SelectFunctionDescriptionPostIfContext } from "./CFG_DEVS_MODELParser";
import { SelectFunctionPostIfResultContext } from "./CFG_DEVS_MODELParser";
import { SelectFunctionGenericDescriptionContext } from "./CFG_DEVS_MODELParser";
import { SelectAssignPreIfListContext } from "./CFG_DEVS_MODELParser";
import { SelectAssignPreIfResultContext } from "./CFG_DEVS_MODELParser";
import { SelectAssignPostIfListContext } from "./CFG_DEVS_MODELParser";
import { SelectAssignPostIfResultContext } from "./CFG_DEVS_MODELParser";
import { AssignIdentifierContext } from "./CFG_DEVS_MODELParser";
import { AssignParameterContext } from "./CFG_DEVS_MODELParser";
import { AssignValueContext } from "./CFG_DEVS_MODELParser";
import { AssignTupleContext } from "./CFG_DEVS_MODELParser";
import { AssignElementContext } from "./CFG_DEVS_MODELParser";
import { AssignmentsListContext } from "./CFG_DEVS_MODELParser";
import { ModelSignatureContext } from "./CFG_DEVS_MODELParser";
import { ModelSymbolContext } from "./CFG_DEVS_MODELParser";
import { ParameterContext } from "./CFG_DEVS_MODELParser";
import { IdentifierContext } from "./CFG_DEVS_MODELParser";
import { VariableContext } from "./CFG_DEVS_MODELParser";
import { VariableFixedValuesContext } from "./CFG_DEVS_MODELParser";
import { ParametersListContext } from "./CFG_DEVS_MODELParser";
import { DatatypeSymbolContext } from "./CFG_DEVS_MODELParser";
import { TrueSymbolContext } from "./CFG_DEVS_MODELParser";
import { FalseSymbolContext } from "./CFG_DEVS_MODELParser";
import { IntegerSymbolContext } from "./CFG_DEVS_MODELParser";
import { RealSymbolContext } from "./CFG_DEVS_MODELParser";
import { InfinitySymbolContext } from "./CFG_DEVS_MODELParser";
import { StringSymbolContext } from "./CFG_DEVS_MODELParser";
import { RootContext } from "./CFG_DEVS_MODELParser";
import { IfConditionContext } from "./CFG_DEVS_MODELParser";
import { IfThenConditionContext } from "./CFG_DEVS_MODELParser";
import { BooleanExpressionContext } from "./CFG_DEVS_MODELParser";
import { BinaryConditionContext } from "./CFG_DEVS_MODELParser";
import { BooleanExpressionTermContext } from "./CFG_DEVS_MODELParser";
import { UnaryConditionContext } from "./CFG_DEVS_MODELParser";
import { RelationalExpressionTermContext } from "./CFG_DEVS_MODELParser";
import { BooleanExpressionBasicTermContext } from "./CFG_DEVS_MODELParser";
import { BooleanExpressionElementContext } from "./CFG_DEVS_MODELParser";
import { BooleanExpressionResultContext } from "./CFG_DEVS_MODELParser";
import { ActionExpressionContext } from "./CFG_DEVS_MODELParser";
import { IfSymbolContext } from "./CFG_DEVS_MODELParser";
import { InOtherCaseSymbolContext } from "./CFG_DEVS_MODELParser";
import { UnaryConditionalOperatorContext } from "./CFG_DEVS_MODELParser";
import { BinaryConditionalOperatorContext } from "./CFG_DEVS_MODELParser";
import { BinaryRelationalOperatorContext } from "./CFG_DEVS_MODELParser";
import { NotOperatorContext } from "./CFG_DEVS_MODELParser";
import { AndOperatorContext } from "./CFG_DEVS_MODELParser";
import { OrOperatorContext } from "./CFG_DEVS_MODELParser";
import { EqualToOperatorContext } from "./CFG_DEVS_MODELParser";
import { NotEqualToOperatorContext } from "./CFG_DEVS_MODELParser";
import { GreaterThanOperatorContext } from "./CFG_DEVS_MODELParser";
import { LessThanOperatorContext } from "./CFG_DEVS_MODELParser";
import { GreaterThanOrEqualToOperatorContext } from "./CFG_DEVS_MODELParser";
import { LessThanOrEqualToOperatorContext } from "./CFG_DEVS_MODELParser";
import { SetContext } from "./CFG_DEVS_MODELParser";
import { SetImplicitDefinitionContext } from "./CFG_DEVS_MODELParser";
import { SetExplicitDefinitionContext } from "./CFG_DEVS_MODELParser";
import { SetDefinitionContext } from "./CFG_DEVS_MODELParser";
import { SetSymbolContext } from "./CFG_DEVS_MODELParser";
import { SetNameContext } from "./CFG_DEVS_MODELParser";
import { SetOfIntegerNumbersSymbolContext } from "./CFG_DEVS_MODELParser";
import { SetOfNaturalNumbersSymbolContext } from "./CFG_DEVS_MODELParser";
import { SetOfRealNumbersSymbolContext } from "./CFG_DEVS_MODELParser";
import { SetOfBooleanAlgebraSymbolContext } from "./CFG_DEVS_MODELParser";
import { ElementCollectionContext } from "./CFG_DEVS_MODELParser";
import { ElementContext } from "./CFG_DEVS_MODELParser";
import { TupleCollectionContext } from "./CFG_DEVS_MODELParser";
import { TupleContext } from "./CFG_DEVS_MODELParser";
import { VariableTupleContext } from "./CFG_DEVS_MODELParser";
import { VariableTupleFixedValuesContext } from "./CFG_DEVS_MODELParser";
import { TupleDefinitionContext } from "./CFG_DEVS_MODELParser";
import { ElementDefinitionContext } from "./CFG_DEVS_MODELParser";
import { DefinitionWithSetImplicitDefinitionContext } from "./CFG_DEVS_MODELParser";
import { DefinitionWithSetSymbolContext } from "./CFG_DEVS_MODELParser";
import { DefinitionWithRangeContext } from "./CFG_DEVS_MODELParser";
import { RangeContext } from "./CFG_DEVS_MODELParser";
import { BooleanSymbolContext } from "./CFG_DEVS_MODELParser";
import { NumberSymbolContext } from "./CFG_DEVS_MODELParser";
import { EmptySetSymbolContext } from "./CFG_DEVS_MODELParser";
import { EmptyTupleSymbolContext } from "./CFG_DEVS_MODELParser";
import { SetOperationResultContext } from "./CFG_DEVS_MODELParser";
import { SetOperationTermContext } from "./CFG_DEVS_MODELParser";
import { SetOperationExpressionContext } from "./CFG_DEVS_MODELParser";
import { OperationSetContext } from "./CFG_DEVS_MODELParser";
import { BelongsToOperatorContext } from "./CFG_DEVS_MODELParser";
import { InOperatorContext } from "./CFG_DEVS_MODELParser";
import { NotInOperatorContext } from "./CFG_DEVS_MODELParser";
import { SetOperatorContext } from "./CFG_DEVS_MODELParser";
import { CartesianProductOperatorContext } from "./CFG_DEVS_MODELParser";
import { UnionOperatorContext } from "./CFG_DEVS_MODELParser";
import { IntersectionOperatorContext } from "./CFG_DEVS_MODELParser";
import { SetdifferenceOperatorContext } from "./CFG_DEVS_MODELParser";
import { MathExpressionContext } from "./CFG_DEVS_MODELParser";
import { BinaryMathExpressionContext } from "./CFG_DEVS_MODELParser";
import { MathExpressionTermContext } from "./CFG_DEVS_MODELParser";
import { UnaryMathExpressionContext } from "./CFG_DEVS_MODELParser";
import { MathTermContext } from "./CFG_DEVS_MODELParser";
import { MathFactorContext } from "./CFG_DEVS_MODELParser";
import { MathExpressionBasicTermContext } from "./CFG_DEVS_MODELParser";
import { MathExpressionElementContext } from "./CFG_DEVS_MODELParser";
import { MathExpressionResultContext } from "./CFG_DEVS_MODELParser";
import { UnaryMathOperatorContext } from "./CFG_DEVS_MODELParser";
import { BinaryMathOperatorLowerPrecedenceContext } from "./CFG_DEVS_MODELParser";
import { BinaryMathOperatorHigherPrecedenceContext } from "./CFG_DEVS_MODELParser";
import { SqrtOperatorContext } from "./CFG_DEVS_MODELParser";
import { AdditionOperatorContext } from "./CFG_DEVS_MODELParser";
import { SubstractionOperatorContext } from "./CFG_DEVS_MODELParser";
import { MultiplicationOperatorContext } from "./CFG_DEVS_MODELParser";
import { DivisionOperatorContext } from "./CFG_DEVS_MODELParser";
import { PowerOperatorContext } from "./CFG_DEVS_MODELParser";


/**
 * This interface defines a complete listener for a parse tree produced by
 * `CFG_DEVS_MODELParser`.
 */
export interface CFG_DEVS_MODELListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the `functionValuesAssignPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionValuesAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionValuesAssignPreIfConditionalResult?: (ctx: FunctionValuesAssignPreIfConditionalResultContext) => void;
	/**
	 * Exit a parse tree produced by the `functionValuesAssignPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionValuesAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionValuesAssignPreIfConditionalResult?: (ctx: FunctionValuesAssignPreIfConditionalResultContext) => void;

	/**
	 * Enter a parse tree produced by the `functionValuesAssignPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionValuesAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionValuesAssignPreIfDefaultResult?: (ctx: FunctionValuesAssignPreIfDefaultResultContext) => void;
	/**
	 * Exit a parse tree produced by the `functionValuesAssignPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionValuesAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionValuesAssignPreIfDefaultResult?: (ctx: FunctionValuesAssignPreIfDefaultResultContext) => void;

	/**
	 * Enter a parse tree produced by the `setOperationParenthesisExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperationExpression`.
	 * @param ctx the parse tree
	 */
	enterSetOperationParenthesisExpr?: (ctx: SetOperationParenthesisExprContext) => void;
	/**
	 * Exit a parse tree produced by the `setOperationParenthesisExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperationExpression`.
	 * @param ctx the parse tree
	 */
	exitSetOperationParenthesisExpr?: (ctx: SetOperationParenthesisExprContext) => void;

	/**
	 * Enter a parse tree produced by the `relationalTermExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionTerm`.
	 * @param ctx the parse tree
	 */
	enterRelationalTermExpr?: (ctx: RelationalTermExprContext) => void;
	/**
	 * Exit a parse tree produced by the `relationalTermExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionTerm`.
	 * @param ctx the parse tree
	 */
	exitRelationalTermExpr?: (ctx: RelationalTermExprContext) => void;

	/**
	 * Enter a parse tree produced by the `unaryTermExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionTerm`.
	 * @param ctx the parse tree
	 */
	enterUnaryTermExpr?: (ctx: UnaryTermExprContext) => void;
	/**
	 * Exit a parse tree produced by the `unaryTermExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionTerm`.
	 * @param ctx the parse tree
	 */
	exitUnaryTermExpr?: (ctx: UnaryTermExprContext) => void;

	/**
	 * Enter a parse tree produced by the `ifThenExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.ifThenCondition`.
	 * @param ctx the parse tree
	 */
	enterIfThenExpr?: (ctx: IfThenExprContext) => void;
	/**
	 * Exit a parse tree produced by the `ifThenExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.ifThenCondition`.
	 * @param ctx the parse tree
	 */
	exitIfThenExpr?: (ctx: IfThenExprContext) => void;

	/**
	 * Enter a parse tree produced by the `ifThenParExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.ifThenCondition`.
	 * @param ctx the parse tree
	 */
	enterIfThenParExpr?: (ctx: IfThenParExprContext) => void;
	/**
	 * Exit a parse tree produced by the `ifThenParExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.ifThenCondition`.
	 * @param ctx the parse tree
	 */
	exitIfThenParExpr?: (ctx: IfThenParExprContext) => void;

	/**
	 * Enter a parse tree produced by the `unaryCondExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.unaryCondition`.
	 * @param ctx the parse tree
	 */
	enterUnaryCondExpr?: (ctx: UnaryCondExprContext) => void;
	/**
	 * Exit a parse tree produced by the `unaryCondExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.unaryCondition`.
	 * @param ctx the parse tree
	 */
	exitUnaryCondExpr?: (ctx: UnaryCondExprContext) => void;

	/**
	 * Enter a parse tree produced by the `taFunctionPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.taFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterTaFunctionPreIfConditionalResult?: (ctx: TaFunctionPreIfConditionalResultContext) => void;
	/**
	 * Exit a parse tree produced by the `taFunctionPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.taFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitTaFunctionPreIfConditionalResult?: (ctx: TaFunctionPreIfConditionalResultContext) => void;

	/**
	 * Enter a parse tree produced by the `taFunctionPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.taFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterTaFunctionPreIfDefaultResult?: (ctx: TaFunctionPreIfDefaultResultContext) => void;
	/**
	 * Exit a parse tree produced by the `taFunctionPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.taFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitTaFunctionPreIfDefaultResult?: (ctx: TaFunctionPreIfDefaultResultContext) => void;

	/**
	 * Enter a parse tree produced by the `actionInfinity`
	 * labeled alternative in `CFG_DEVS_MODELParser.actionExpression`.
	 * @param ctx the parse tree
	 */
	enterActionInfinity?: (ctx: ActionInfinityContext) => void;
	/**
	 * Exit a parse tree produced by the `actionInfinity`
	 * labeled alternative in `CFG_DEVS_MODELParser.actionExpression`.
	 * @param ctx the parse tree
	 */
	exitActionInfinity?: (ctx: ActionInfinityContext) => void;

	/**
	 * Enter a parse tree produced by the `actionElement`
	 * labeled alternative in `CFG_DEVS_MODELParser.actionExpression`.
	 * @param ctx the parse tree
	 */
	enterActionElement?: (ctx: ActionElementContext) => void;
	/**
	 * Exit a parse tree produced by the `actionElement`
	 * labeled alternative in `CFG_DEVS_MODELParser.actionExpression`.
	 * @param ctx the parse tree
	 */
	exitActionElement?: (ctx: ActionElementContext) => void;

	/**
	 * Enter a parse tree produced by the `actionElementDefinition`
	 * labeled alternative in `CFG_DEVS_MODELParser.actionExpression`.
	 * @param ctx the parse tree
	 */
	enterActionElementDefinition?: (ctx: ActionElementDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by the `actionElementDefinition`
	 * labeled alternative in `CFG_DEVS_MODELParser.actionExpression`.
	 * @param ctx the parse tree
	 */
	exitActionElementDefinition?: (ctx: ActionElementDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by the `elementIdentifier`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	enterElementIdentifier?: (ctx: ElementIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by the `elementIdentifier`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	exitElementIdentifier?: (ctx: ElementIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by the `elementNumber`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	enterElementNumber?: (ctx: ElementNumberContext) => void;
	/**
	 * Exit a parse tree produced by the `elementNumber`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	exitElementNumber?: (ctx: ElementNumberContext) => void;

	/**
	 * Enter a parse tree produced by the `elementBoolean`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	enterElementBoolean?: (ctx: ElementBooleanContext) => void;
	/**
	 * Exit a parse tree produced by the `elementBoolean`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	exitElementBoolean?: (ctx: ElementBooleanContext) => void;

	/**
	 * Enter a parse tree produced by the `elementModelSignature`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	enterElementModelSignature?: (ctx: ElementModelSignatureContext) => void;
	/**
	 * Exit a parse tree produced by the `elementModelSignature`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	exitElementModelSignature?: (ctx: ElementModelSignatureContext) => void;

	/**
	 * Enter a parse tree produced by the `elementString`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	enterElementString?: (ctx: ElementStringContext) => void;
	/**
	 * Exit a parse tree produced by the `elementString`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	exitElementString?: (ctx: ElementStringContext) => void;

	/**
	 * Enter a parse tree produced by the `elementTuple`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	enterElementTuple?: (ctx: ElementTupleContext) => void;
	/**
	 * Exit a parse tree produced by the `elementTuple`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	exitElementTuple?: (ctx: ElementTupleContext) => void;

	/**
	 * Enter a parse tree produced by the `elementParameter`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	enterElementParameter?: (ctx: ElementParameterContext) => void;
	/**
	 * Exit a parse tree produced by the `elementParameter`
	 * labeled alternative in `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	exitElementParameter?: (ctx: ElementParameterContext) => void;

	/**
	 * Enter a parse tree produced by the `selectAssignPreIfIdentifierConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterSelectAssignPreIfIdentifierConditionalResult?: (ctx: SelectAssignPreIfIdentifierConditionalResultContext) => void;
	/**
	 * Exit a parse tree produced by the `selectAssignPreIfIdentifierConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitSelectAssignPreIfIdentifierConditionalResult?: (ctx: SelectAssignPreIfIdentifierConditionalResultContext) => void;

	/**
	 * Enter a parse tree produced by the `selectAssignPreIfParameterConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterSelectAssignPreIfParameterConditionalResult?: (ctx: SelectAssignPreIfParameterConditionalResultContext) => void;
	/**
	 * Exit a parse tree produced by the `selectAssignPreIfParameterConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitSelectAssignPreIfParameterConditionalResult?: (ctx: SelectAssignPreIfParameterConditionalResultContext) => void;

	/**
	 * Enter a parse tree produced by the `selectAssignPreIfIdentifierDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterSelectAssignPreIfIdentifierDefaultResult?: (ctx: SelectAssignPreIfIdentifierDefaultResultContext) => void;
	/**
	 * Exit a parse tree produced by the `selectAssignPreIfIdentifierDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitSelectAssignPreIfIdentifierDefaultResult?: (ctx: SelectAssignPreIfIdentifierDefaultResultContext) => void;

	/**
	 * Enter a parse tree produced by the `selectAssignPreIfParameterDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterSelectAssignPreIfParameterDefaultResult?: (ctx: SelectAssignPreIfParameterDefaultResultContext) => void;
	/**
	 * Exit a parse tree produced by the `selectAssignPreIfParameterDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitSelectAssignPreIfParameterDefaultResult?: (ctx: SelectAssignPreIfParameterDefaultResultContext) => void;

	/**
	 * Enter a parse tree produced by the `binaryExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.binaryCondition`.
	 * @param ctx the parse tree
	 */
	enterBinaryExpr?: (ctx: BinaryExprContext) => void;
	/**
	 * Exit a parse tree produced by the `binaryExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.binaryCondition`.
	 * @param ctx the parse tree
	 */
	exitBinaryExpr?: (ctx: BinaryExprContext) => void;

	/**
	 * Enter a parse tree produced by the `functionPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionPreIfConditionalResult?: (ctx: FunctionPreIfConditionalResultContext) => void;
	/**
	 * Exit a parse tree produced by the `functionPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionPreIfConditionalResult?: (ctx: FunctionPreIfConditionalResultContext) => void;

	/**
	 * Enter a parse tree produced by the `functionPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionPreIfDefaultResult?: (ctx: FunctionPreIfDefaultResultContext) => void;
	/**
	 * Exit a parse tree produced by the `functionPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionPreIfDefaultResult?: (ctx: FunctionPreIfDefaultResultContext) => void;

	/**
	 * Enter a parse tree produced by the `setAssignmentExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setExplicitDefinition`.
	 * @param ctx the parse tree
	 */
	enterSetAssignmentExpr?: (ctx: SetAssignmentExprContext) => void;
	/**
	 * Exit a parse tree produced by the `setAssignmentExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setExplicitDefinition`.
	 * @param ctx the parse tree
	 */
	exitSetAssignmentExpr?: (ctx: SetAssignmentExprContext) => void;

	/**
	 * Enter a parse tree produced by the `rangeExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.range`.
	 * @param ctx the parse tree
	 */
	enterRangeExpr?: (ctx: RangeExprContext) => void;
	/**
	 * Exit a parse tree produced by the `rangeExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.range`.
	 * @param ctx the parse tree
	 */
	exitRangeExpr?: (ctx: RangeExprContext) => void;

	/**
	 * Enter a parse tree produced by the `tupleExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.tuple`.
	 * @param ctx the parse tree
	 */
	enterTupleExpr?: (ctx: TupleExprContext) => void;
	/**
	 * Exit a parse tree produced by the `tupleExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.tuple`.
	 * @param ctx the parse tree
	 */
	exitTupleExpr?: (ctx: TupleExprContext) => void;

	/**
	 * Enter a parse tree produced by the `emptyTupleExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.tuple`.
	 * @param ctx the parse tree
	 */
	enterEmptyTupleExpr?: (ctx: EmptyTupleExprContext) => void;
	/**
	 * Exit a parse tree produced by the `emptyTupleExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.tuple`.
	 * @param ctx the parse tree
	 */
	exitEmptyTupleExpr?: (ctx: EmptyTupleExprContext) => void;

	/**
	 * Enter a parse tree produced by the `variableTupleFixedValuesExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.variableTupleFixedValues`.
	 * @param ctx the parse tree
	 */
	enterVariableTupleFixedValuesExpr?: (ctx: VariableTupleFixedValuesExprContext) => void;
	/**
	 * Exit a parse tree produced by the `variableTupleFixedValuesExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.variableTupleFixedValues`.
	 * @param ctx the parse tree
	 */
	exitVariableTupleFixedValuesExpr?: (ctx: VariableTupleFixedValuesExprContext) => void;

	/**
	 * Enter a parse tree produced by the `emptyVariableTupleFixedValuesExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.variableTupleFixedValues`.
	 * @param ctx the parse tree
	 */
	enterEmptyVariableTupleFixedValuesExpr?: (ctx: EmptyVariableTupleFixedValuesExprContext) => void;
	/**
	 * Exit a parse tree produced by the `emptyVariableTupleFixedValuesExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.variableTupleFixedValues`.
	 * @param ctx the parse tree
	 */
	exitEmptyVariableTupleFixedValuesExpr?: (ctx: EmptyVariableTupleFixedValuesExprContext) => void;

	/**
	 * Enter a parse tree produced by the `ifConditionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.ifCondition`.
	 * @param ctx the parse tree
	 */
	enterIfConditionExpr?: (ctx: IfConditionExprContext) => void;
	/**
	 * Exit a parse tree produced by the `ifConditionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.ifCondition`.
	 * @param ctx the parse tree
	 */
	exitIfConditionExpr?: (ctx: IfConditionExprContext) => void;

	/**
	 * Enter a parse tree produced by the `ifConditionParExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.ifCondition`.
	 * @param ctx the parse tree
	 */
	enterIfConditionParExpr?: (ctx: IfConditionParExprContext) => void;
	/**
	 * Exit a parse tree produced by the `ifConditionParExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.ifCondition`.
	 * @param ctx the parse tree
	 */
	exitIfConditionParExpr?: (ctx: IfConditionParExprContext) => void;

	/**
	 * Enter a parse tree produced by the `ifConditionDefaultExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.ifCondition`.
	 * @param ctx the parse tree
	 */
	enterIfConditionDefaultExpr?: (ctx: IfConditionDefaultExprContext) => void;
	/**
	 * Exit a parse tree produced by the `ifConditionDefaultExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.ifCondition`.
	 * @param ctx the parse tree
	 */
	exitIfConditionDefaultExpr?: (ctx: IfConditionDefaultExprContext) => void;

	/**
	 * Enter a parse tree produced by the `setImplicitDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.set`.
	 * @param ctx the parse tree
	 */
	enterSetImplicitDefinitionExpr?: (ctx: SetImplicitDefinitionExprContext) => void;
	/**
	 * Exit a parse tree produced by the `setImplicitDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.set`.
	 * @param ctx the parse tree
	 */
	exitSetImplicitDefinitionExpr?: (ctx: SetImplicitDefinitionExprContext) => void;

	/**
	 * Enter a parse tree produced by the `setExplicitDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.set`.
	 * @param ctx the parse tree
	 */
	enterSetExplicitDefinitionExpr?: (ctx: SetExplicitDefinitionExprContext) => void;
	/**
	 * Exit a parse tree produced by the `setExplicitDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.set`.
	 * @param ctx the parse tree
	 */
	exitSetExplicitDefinitionExpr?: (ctx: SetExplicitDefinitionExprContext) => void;

	/**
	 * Enter a parse tree produced by the `defWithImplicitSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithSetImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	enterDefWithImplicitSetExpr?: (ctx: DefWithImplicitSetExprContext) => void;
	/**
	 * Exit a parse tree produced by the `defWithImplicitSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithSetImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	exitDefWithImplicitSetExpr?: (ctx: DefWithImplicitSetExprContext) => void;

	/**
	 * Enter a parse tree produced by the `defCollectionWithImplicitSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithSetImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	enterDefCollectionWithImplicitSetExpr?: (ctx: DefCollectionWithImplicitSetExprContext) => void;
	/**
	 * Exit a parse tree produced by the `defCollectionWithImplicitSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithSetImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	exitDefCollectionWithImplicitSetExpr?: (ctx: DefCollectionWithImplicitSetExprContext) => void;

	/**
	 * Enter a parse tree produced by the `integerExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.numberSymbol`.
	 * @param ctx the parse tree
	 */
	enterIntegerExpr?: (ctx: IntegerExprContext) => void;
	/**
	 * Exit a parse tree produced by the `integerExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.numberSymbol`.
	 * @param ctx the parse tree
	 */
	exitIntegerExpr?: (ctx: IntegerExprContext) => void;

	/**
	 * Enter a parse tree produced by the `realExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.numberSymbol`.
	 * @param ctx the parse tree
	 */
	enterRealExpr?: (ctx: RealExprContext) => void;
	/**
	 * Exit a parse tree produced by the `realExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.numberSymbol`.
	 * @param ctx the parse tree
	 */
	exitRealExpr?: (ctx: RealExprContext) => void;

	/**
	 * Enter a parse tree produced by the `elementExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionElement`.
	 * @param ctx the parse tree
	 */
	enterElementExpr?: (ctx: ElementExprContext) => void;
	/**
	 * Exit a parse tree produced by the `elementExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionElement`.
	 * @param ctx the parse tree
	 */
	exitElementExpr?: (ctx: ElementExprContext) => void;

	/**
	 * Enter a parse tree produced by the `elementDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionElement`.
	 * @param ctx the parse tree
	 */
	enterElementDefinitionExpr?: (ctx: ElementDefinitionExprContext) => void;
	/**
	 * Exit a parse tree produced by the `elementDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionElement`.
	 * @param ctx the parse tree
	 */
	exitElementDefinitionExpr?: (ctx: ElementDefinitionExprContext) => void;

	/**
	 * Enter a parse tree produced by the `infinityExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionElement`.
	 * @param ctx the parse tree
	 */
	enterInfinityExpr?: (ctx: InfinityExprContext) => void;
	/**
	 * Exit a parse tree produced by the `infinityExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionElement`.
	 * @param ctx the parse tree
	 */
	exitInfinityExpr?: (ctx: InfinityExprContext) => void;

	/**
	 * Enter a parse tree produced by the `operationSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperationTerm`.
	 * @param ctx the parse tree
	 */
	enterOperationSetExpr?: (ctx: OperationSetExprContext) => void;
	/**
	 * Exit a parse tree produced by the `operationSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperationTerm`.
	 * @param ctx the parse tree
	 */
	exitOperationSetExpr?: (ctx: OperationSetExprContext) => void;

	/**
	 * Enter a parse tree produced by the `setOperationParExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperationTerm`.
	 * @param ctx the parse tree
	 */
	enterSetOperationParExpr?: (ctx: SetOperationParExprContext) => void;
	/**
	 * Exit a parse tree produced by the `setOperationParExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperationTerm`.
	 * @param ctx the parse tree
	 */
	exitSetOperationParExpr?: (ctx: SetOperationParExprContext) => void;

	/**
	 * Enter a parse tree produced by the `elementListExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementCollection`.
	 * @param ctx the parse tree
	 */
	enterElementListExpr?: (ctx: ElementListExprContext) => void;
	/**
	 * Exit a parse tree produced by the `elementListExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementCollection`.
	 * @param ctx the parse tree
	 */
	exitElementListExpr?: (ctx: ElementListExprContext) => void;

	/**
	 * Enter a parse tree produced by the `elementSuchThatExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementCollection`.
	 * @param ctx the parse tree
	 */
	enterElementSuchThatExpr?: (ctx: ElementSuchThatExprContext) => void;
	/**
	 * Exit a parse tree produced by the `elementSuchThatExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementCollection`.
	 * @param ctx the parse tree
	 */
	exitElementSuchThatExpr?: (ctx: ElementSuchThatExprContext) => void;

	/**
	 * Enter a parse tree produced by the `emptySetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementCollection`.
	 * @param ctx the parse tree
	 */
	enterEmptySetExpr?: (ctx: EmptySetExprContext) => void;
	/**
	 * Exit a parse tree produced by the `emptySetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementCollection`.
	 * @param ctx the parse tree
	 */
	exitEmptySetExpr?: (ctx: EmptySetExprContext) => void;

	/**
	 * Enter a parse tree produced by the `taAssignPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.taAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterTaAssignPreIfConditionalResult?: (ctx: TaAssignPreIfConditionalResultContext) => void;
	/**
	 * Exit a parse tree produced by the `taAssignPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.taAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitTaAssignPreIfConditionalResult?: (ctx: TaAssignPreIfConditionalResultContext) => void;

	/**
	 * Enter a parse tree produced by the `taAssignPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.taAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterTaAssignPreIfDefaultResult?: (ctx: TaAssignPreIfDefaultResultContext) => void;
	/**
	 * Exit a parse tree produced by the `taAssignPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.taAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitTaAssignPreIfDefaultResult?: (ctx: TaAssignPreIfDefaultResultContext) => void;

	/**
	 * Enter a parse tree produced by the `defWithSymbolSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithSetSymbol`.
	 * @param ctx the parse tree
	 */
	enterDefWithSymbolSetExpr?: (ctx: DefWithSymbolSetExprContext) => void;
	/**
	 * Exit a parse tree produced by the `defWithSymbolSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithSetSymbol`.
	 * @param ctx the parse tree
	 */
	exitDefWithSymbolSetExpr?: (ctx: DefWithSymbolSetExprContext) => void;

	/**
	 * Enter a parse tree produced by the `defCollectionWithSymbolSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithSetSymbol`.
	 * @param ctx the parse tree
	 */
	enterDefCollectionWithSymbolSetExpr?: (ctx: DefCollectionWithSymbolSetExprContext) => void;
	/**
	 * Exit a parse tree produced by the `defCollectionWithSymbolSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithSetSymbol`.
	 * @param ctx the parse tree
	 */
	exitDefCollectionWithSymbolSetExpr?: (ctx: DefCollectionWithSymbolSetExprContext) => void;

	/**
	 * Enter a parse tree produced by the `setDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	enterSetDefinitionExpr?: (ctx: SetDefinitionExprContext) => void;
	/**
	 * Exit a parse tree produced by the `setDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	exitSetDefinitionExpr?: (ctx: SetDefinitionExprContext) => void;

	/**
	 * Enter a parse tree produced by the `setOperationResultExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	enterSetOperationResultExpr?: (ctx: SetOperationResultExprContext) => void;
	/**
	 * Exit a parse tree produced by the `setOperationResultExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	exitSetOperationResultExpr?: (ctx: SetOperationResultExprContext) => void;

	/**
	 * Enter a parse tree produced by the `tupleDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.tupleDefinition`.
	 * @param ctx the parse tree
	 */
	enterTupleDefinitionExpr?: (ctx: TupleDefinitionExprContext) => void;
	/**
	 * Exit a parse tree produced by the `tupleDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.tupleDefinition`.
	 * @param ctx the parse tree
	 */
	exitTupleDefinitionExpr?: (ctx: TupleDefinitionExprContext) => void;

	/**
	 * Enter a parse tree produced by the `cartesianProductOpExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperator`.
	 * @param ctx the parse tree
	 */
	enterCartesianProductOpExpr?: (ctx: CartesianProductOpExprContext) => void;
	/**
	 * Exit a parse tree produced by the `cartesianProductOpExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperator`.
	 * @param ctx the parse tree
	 */
	exitCartesianProductOpExpr?: (ctx: CartesianProductOpExprContext) => void;

	/**
	 * Enter a parse tree produced by the `unionOpExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperator`.
	 * @param ctx the parse tree
	 */
	enterUnionOpExpr?: (ctx: UnionOpExprContext) => void;
	/**
	 * Exit a parse tree produced by the `unionOpExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperator`.
	 * @param ctx the parse tree
	 */
	exitUnionOpExpr?: (ctx: UnionOpExprContext) => void;

	/**
	 * Enter a parse tree produced by the `intersectionOpExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperator`.
	 * @param ctx the parse tree
	 */
	enterIntersectionOpExpr?: (ctx: IntersectionOpExprContext) => void;
	/**
	 * Exit a parse tree produced by the `intersectionOpExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperator`.
	 * @param ctx the parse tree
	 */
	exitIntersectionOpExpr?: (ctx: IntersectionOpExprContext) => void;

	/**
	 * Enter a parse tree produced by the `differenceOpExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperator`.
	 * @param ctx the parse tree
	 */
	enterDifferenceOpExpr?: (ctx: DifferenceOpExprContext) => void;
	/**
	 * Exit a parse tree produced by the `differenceOpExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperator`.
	 * @param ctx the parse tree
	 */
	exitDifferenceOpExpr?: (ctx: DifferenceOpExprContext) => void;

	/**
	 * Enter a parse tree produced by the `parenthesisExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionResult`.
	 * @param ctx the parse tree
	 */
	enterParenthesisExpr?: (ctx: ParenthesisExprContext) => void;
	/**
	 * Exit a parse tree produced by the `parenthesisExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionResult`.
	 * @param ctx the parse tree
	 */
	exitParenthesisExpr?: (ctx: ParenthesisExprContext) => void;

	/**
	 * Enter a parse tree produced by the `variableTupleExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.variableTuple`.
	 * @param ctx the parse tree
	 */
	enterVariableTupleExpr?: (ctx: VariableTupleExprContext) => void;
	/**
	 * Exit a parse tree produced by the `variableTupleExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.variableTuple`.
	 * @param ctx the parse tree
	 */
	exitVariableTupleExpr?: (ctx: VariableTupleExprContext) => void;

	/**
	 * Enter a parse tree produced by the `emptyVariableTupleExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.variableTuple`.
	 * @param ctx the parse tree
	 */
	enterEmptyVariableTupleExpr?: (ctx: EmptyVariableTupleExprContext) => void;
	/**
	 * Exit a parse tree produced by the `emptyVariableTupleExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.variableTuple`.
	 * @param ctx the parse tree
	 */
	exitEmptyVariableTupleExpr?: (ctx: EmptyVariableTupleExprContext) => void;

	/**
	 * Enter a parse tree produced by the `selectFunctionPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterSelectFunctionPreIfConditionalResult?: (ctx: SelectFunctionPreIfConditionalResultContext) => void;
	/**
	 * Exit a parse tree produced by the `selectFunctionPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitSelectFunctionPreIfConditionalResult?: (ctx: SelectFunctionPreIfConditionalResultContext) => void;

	/**
	 * Enter a parse tree produced by the `selectFunctionPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterSelectFunctionPreIfDefaultResult?: (ctx: SelectFunctionPreIfDefaultResultContext) => void;
	/**
	 * Exit a parse tree produced by the `selectFunctionPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.selectFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitSelectFunctionPreIfDefaultResult?: (ctx: SelectFunctionPreIfDefaultResultContext) => void;

	/**
	 * Enter a parse tree produced by the `relationalExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.relationalExpressionTerm`.
	 * @param ctx the parse tree
	 */
	enterRelationalExpr?: (ctx: RelationalExprContext) => void;
	/**
	 * Exit a parse tree produced by the `relationalExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.relationalExpressionTerm`.
	 * @param ctx the parse tree
	 */
	exitRelationalExpr?: (ctx: RelationalExprContext) => void;

	/**
	 * Enter a parse tree produced by the `elementCollectionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setDefinition`.
	 * @param ctx the parse tree
	 */
	enterElementCollectionExpr?: (ctx: ElementCollectionExprContext) => void;
	/**
	 * Exit a parse tree produced by the `elementCollectionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setDefinition`.
	 * @param ctx the parse tree
	 */
	exitElementCollectionExpr?: (ctx: ElementCollectionExprContext) => void;

	/**
	 * Enter a parse tree produced by the `tupleCollectionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setDefinition`.
	 * @param ctx the parse tree
	 */
	enterTupleCollectionExpr?: (ctx: TupleCollectionExprContext) => void;
	/**
	 * Exit a parse tree produced by the `tupleCollectionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setDefinition`.
	 * @param ctx the parse tree
	 */
	exitTupleCollectionExpr?: (ctx: TupleCollectionExprContext) => void;

	/**
	 * Enter a parse tree produced by the `functionAssignPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionAssignPreIfConditionalResult?: (ctx: FunctionAssignPreIfConditionalResultContext) => void;
	/**
	 * Exit a parse tree produced by the `functionAssignPreIfConditionalResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionAssignPreIfConditionalResult?: (ctx: FunctionAssignPreIfConditionalResultContext) => void;

	/**
	 * Enter a parse tree produced by the `functionAssignPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionAssignPreIfDefaultResult?: (ctx: FunctionAssignPreIfDefaultResultContext) => void;
	/**
	 * Exit a parse tree produced by the `functionAssignPreIfDefaultResult`
	 * labeled alternative in `CFG_DEVS_MODELParser.functionAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionAssignPreIfDefaultResult?: (ctx: FunctionAssignPreIfDefaultResultContext) => void;

	/**
	 * Enter a parse tree produced by the `tupleSuchThatExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.tupleCollection`.
	 * @param ctx the parse tree
	 */
	enterTupleSuchThatExpr?: (ctx: TupleSuchThatExprContext) => void;
	/**
	 * Exit a parse tree produced by the `tupleSuchThatExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.tupleCollection`.
	 * @param ctx the parse tree
	 */
	exitTupleSuchThatExpr?: (ctx: TupleSuchThatExprContext) => void;

	/**
	 * Enter a parse tree produced by the `operationSetDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.operationSet`.
	 * @param ctx the parse tree
	 */
	enterOperationSetDefinitionExpr?: (ctx: OperationSetDefinitionExprContext) => void;
	/**
	 * Exit a parse tree produced by the `operationSetDefinitionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.operationSet`.
	 * @param ctx the parse tree
	 */
	exitOperationSetDefinitionExpr?: (ctx: OperationSetDefinitionExprContext) => void;

	/**
	 * Enter a parse tree produced by the `operationSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.operationSet`.
	 * @param ctx the parse tree
	 */
	enterOperationSetSymbolExpr?: (ctx: OperationSetSymbolExprContext) => void;
	/**
	 * Exit a parse tree produced by the `operationSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.operationSet`.
	 * @param ctx the parse tree
	 */
	exitOperationSetSymbolExpr?: (ctx: OperationSetSymbolExprContext) => void;

	/**
	 * Enter a parse tree produced by the `setOperationExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperationResult`.
	 * @param ctx the parse tree
	 */
	enterSetOperationExpr?: (ctx: SetOperationExprContext) => void;
	/**
	 * Exit a parse tree produced by the `setOperationExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setOperationResult`.
	 * @param ctx the parse tree
	 */
	exitSetOperationExpr?: (ctx: SetOperationExprContext) => void;

	/**
	 * Enter a parse tree produced by the `rootIfThen`
	 * labeled alternative in `CFG_DEVS_MODELParser.root`.
	 * @param ctx the parse tree
	 */
	enterRootIfThen?: (ctx: RootIfThenContext) => void;
	/**
	 * Exit a parse tree produced by the `rootIfThen`
	 * labeled alternative in `CFG_DEVS_MODELParser.root`.
	 * @param ctx the parse tree
	 */
	exitRootIfThen?: (ctx: RootIfThenContext) => void;

	/**
	 * Enter a parse tree produced by the `rootIf`
	 * labeled alternative in `CFG_DEVS_MODELParser.root`.
	 * @param ctx the parse tree
	 */
	enterRootIf?: (ctx: RootIfContext) => void;
	/**
	 * Exit a parse tree produced by the `rootIf`
	 * labeled alternative in `CFG_DEVS_MODELParser.root`.
	 * @param ctx the parse tree
	 */
	exitRootIf?: (ctx: RootIfContext) => void;

	/**
	 * Enter a parse tree produced by the `rootBooleanExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.root`.
	 * @param ctx the parse tree
	 */
	enterRootBooleanExpr?: (ctx: RootBooleanExprContext) => void;
	/**
	 * Exit a parse tree produced by the `rootBooleanExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.root`.
	 * @param ctx the parse tree
	 */
	exitRootBooleanExpr?: (ctx: RootBooleanExprContext) => void;

	/**
	 * Enter a parse tree produced by the `basicElementExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionBasicTerm`.
	 * @param ctx the parse tree
	 */
	enterBasicElementExpr?: (ctx: BasicElementExprContext) => void;
	/**
	 * Exit a parse tree produced by the `basicElementExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionBasicTerm`.
	 * @param ctx the parse tree
	 */
	exitBasicElementExpr?: (ctx: BasicElementExprContext) => void;

	/**
	 * Enter a parse tree produced by the `basicParenthesisExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionBasicTerm`.
	 * @param ctx the parse tree
	 */
	enterBasicParenthesisExpr?: (ctx: BasicParenthesisExprContext) => void;
	/**
	 * Exit a parse tree produced by the `basicParenthesisExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpressionBasicTerm`.
	 * @param ctx the parse tree
	 */
	exitBasicParenthesisExpr?: (ctx: BasicParenthesisExprContext) => void;

	/**
	 * Enter a parse tree produced by the `inOperatorExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.belongsToOperator`.
	 * @param ctx the parse tree
	 */
	enterInOperatorExpr?: (ctx: InOperatorExprContext) => void;
	/**
	 * Exit a parse tree produced by the `inOperatorExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.belongsToOperator`.
	 * @param ctx the parse tree
	 */
	exitInOperatorExpr?: (ctx: InOperatorExprContext) => void;

	/**
	 * Enter a parse tree produced by the `notInOperatorExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.belongsToOperator`.
	 * @param ctx the parse tree
	 */
	enterNotInOperatorExpr?: (ctx: NotInOperatorExprContext) => void;
	/**
	 * Exit a parse tree produced by the `notInOperatorExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.belongsToOperator`.
	 * @param ctx the parse tree
	 */
	exitNotInOperatorExpr?: (ctx: NotInOperatorExprContext) => void;

	/**
	 * Enter a parse tree produced by the `binaryConditionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpression`.
	 * @param ctx the parse tree
	 */
	enterBinaryConditionExpr?: (ctx: BinaryConditionExprContext) => void;
	/**
	 * Exit a parse tree produced by the `binaryConditionExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpression`.
	 * @param ctx the parse tree
	 */
	exitBinaryConditionExpr?: (ctx: BinaryConditionExprContext) => void;

	/**
	 * Enter a parse tree produced by the `booleanTermExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpression`.
	 * @param ctx the parse tree
	 */
	enterBooleanTermExpr?: (ctx: BooleanTermExprContext) => void;
	/**
	 * Exit a parse tree produced by the `booleanTermExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanExpression`.
	 * @param ctx the parse tree
	 */
	exitBooleanTermExpr?: (ctx: BooleanTermExprContext) => void;

	/**
	 * Enter a parse tree produced by the `defWithRangeExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithRange`.
	 * @param ctx the parse tree
	 */
	enterDefWithRangeExpr?: (ctx: DefWithRangeExprContext) => void;
	/**
	 * Exit a parse tree produced by the `defWithRangeExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithRange`.
	 * @param ctx the parse tree
	 */
	exitDefWithRangeExpr?: (ctx: DefWithRangeExprContext) => void;

	/**
	 * Enter a parse tree produced by the `defCollectionWithRangeExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithRange`.
	 * @param ctx the parse tree
	 */
	enterDefCollectionWithRangeExpr?: (ctx: DefCollectionWithRangeExprContext) => void;
	/**
	 * Exit a parse tree produced by the `defCollectionWithRangeExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.definitionWithRange`.
	 * @param ctx the parse tree
	 */
	exitDefCollectionWithRangeExpr?: (ctx: DefCollectionWithRangeExprContext) => void;

	/**
	 * Enter a parse tree produced by the `trueExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanSymbol`.
	 * @param ctx the parse tree
	 */
	enterTrueExpr?: (ctx: TrueExprContext) => void;
	/**
	 * Exit a parse tree produced by the `trueExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanSymbol`.
	 * @param ctx the parse tree
	 */
	exitTrueExpr?: (ctx: TrueExprContext) => void;

	/**
	 * Enter a parse tree produced by the `falseExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanSymbol`.
	 * @param ctx the parse tree
	 */
	enterFalseExpr?: (ctx: FalseExprContext) => void;
	/**
	 * Exit a parse tree produced by the `falseExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.booleanSymbol`.
	 * @param ctx the parse tree
	 */
	exitFalseExpr?: (ctx: FalseExprContext) => void;

	/**
	 * Enter a parse tree produced by the `setNameSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	enterSetNameSymbolExpr?: (ctx: SetNameSymbolExprContext) => void;
	/**
	 * Exit a parse tree produced by the `setNameSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	exitSetNameSymbolExpr?: (ctx: SetNameSymbolExprContext) => void;

	/**
	 * Enter a parse tree produced by the `integerSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	enterIntegerSetSymbolExpr?: (ctx: IntegerSetSymbolExprContext) => void;
	/**
	 * Exit a parse tree produced by the `integerSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	exitIntegerSetSymbolExpr?: (ctx: IntegerSetSymbolExprContext) => void;

	/**
	 * Enter a parse tree produced by the `naturalSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	enterNaturalSetSymbolExpr?: (ctx: NaturalSetSymbolExprContext) => void;
	/**
	 * Exit a parse tree produced by the `naturalSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	exitNaturalSetSymbolExpr?: (ctx: NaturalSetSymbolExprContext) => void;

	/**
	 * Enter a parse tree produced by the `realSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	enterRealSetSymbolExpr?: (ctx: RealSetSymbolExprContext) => void;
	/**
	 * Exit a parse tree produced by the `realSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	exitRealSetSymbolExpr?: (ctx: RealSetSymbolExprContext) => void;

	/**
	 * Enter a parse tree produced by the `booleanSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	enterBooleanSetSymbolExpr?: (ctx: BooleanSetSymbolExprContext) => void;
	/**
	 * Exit a parse tree produced by the `booleanSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	exitBooleanSetSymbolExpr?: (ctx: BooleanSetSymbolExprContext) => void;

	/**
	 * Enter a parse tree produced by the `elementDefImplicitSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementDefinition`.
	 * @param ctx the parse tree
	 */
	enterElementDefImplicitSetExpr?: (ctx: ElementDefImplicitSetExprContext) => void;
	/**
	 * Exit a parse tree produced by the `elementDefImplicitSetExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementDefinition`.
	 * @param ctx the parse tree
	 */
	exitElementDefImplicitSetExpr?: (ctx: ElementDefImplicitSetExprContext) => void;

	/**
	 * Enter a parse tree produced by the `elementDefSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementDefinition`.
	 * @param ctx the parse tree
	 */
	enterElementDefSetSymbolExpr?: (ctx: ElementDefSetSymbolExprContext) => void;
	/**
	 * Exit a parse tree produced by the `elementDefSetSymbolExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementDefinition`.
	 * @param ctx the parse tree
	 */
	exitElementDefSetSymbolExpr?: (ctx: ElementDefSetSymbolExprContext) => void;

	/**
	 * Enter a parse tree produced by the `elementDefRangeExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementDefinition`.
	 * @param ctx the parse tree
	 */
	enterElementDefRangeExpr?: (ctx: ElementDefRangeExprContext) => void;
	/**
	 * Exit a parse tree produced by the `elementDefRangeExpr`
	 * labeled alternative in `CFG_DEVS_MODELParser.elementDefinition`.
	 * @param ctx the parse tree
	 */
	exitElementDefRangeExpr?: (ctx: ElementDefRangeExprContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.devsSpecification`.
	 * @param ctx the parse tree
	 */
	enterDevsSpecification?: (ctx: DevsSpecificationContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.devsSpecification`.
	 * @param ctx the parse tree
	 */
	exitDevsSpecification?: (ctx: DevsSpecificationContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.devsModel`.
	 * @param ctx the parse tree
	 */
	enterDevsModel?: (ctx: DevsModelContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.devsModel`.
	 * @param ctx the parse tree
	 */
	exitDevsModel?: (ctx: DevsModelContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setInModel`.
	 * @param ctx the parse tree
	 */
	enterSetInModel?: (ctx: SetInModelContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setInModel`.
	 * @param ctx the parse tree
	 */
	exitSetInModel?: (ctx: SetInModelContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.atomicModel`.
	 * @param ctx the parse tree
	 */
	enterAtomicModel?: (ctx: AtomicModelContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.atomicModel`.
	 * @param ctx the parse tree
	 */
	exitAtomicModel?: (ctx: AtomicModelContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.atomicModelTuple`.
	 * @param ctx the parse tree
	 */
	enterAtomicModelTuple?: (ctx: AtomicModelTupleContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.atomicModelTuple`.
	 * @param ctx the parse tree
	 */
	exitAtomicModelTuple?: (ctx: AtomicModelTupleContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.coupledModel`.
	 * @param ctx the parse tree
	 */
	enterCoupledModel?: (ctx: CoupledModelContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.coupledModel`.
	 * @param ctx the parse tree
	 */
	exitCoupledModel?: (ctx: CoupledModelContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.coupledModelTuple`.
	 * @param ctx the parse tree
	 */
	enterCoupledModelTuple?: (ctx: CoupledModelTupleContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.coupledModelTuple`.
	 * @param ctx the parse tree
	 */
	exitCoupledModelTuple?: (ctx: CoupledModelTupleContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.modelDefinition`.
	 * @param ctx the parse tree
	 */
	enterModelDefinition?: (ctx: ModelDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.modelDefinition`.
	 * @param ctx the parse tree
	 */
	exitModelDefinition?: (ctx: ModelDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.modelSentence`.
	 * @param ctx the parse tree
	 */
	enterModelSentence?: (ctx: ModelSentenceContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.modelSentence`.
	 * @param ctx the parse tree
	 */
	exitModelSentence?: (ctx: ModelSentenceContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.function`.
	 * @param ctx the parse tree
	 */
	enterFunction?: (ctx: FunctionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.function`.
	 * @param ctx the parse tree
	 */
	exitFunction?: (ctx: FunctionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.delExtFunction`.
	 * @param ctx the parse tree
	 */
	enterDelExtFunction?: (ctx: DelExtFunctionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.delExtFunction`.
	 * @param ctx the parse tree
	 */
	exitDelExtFunction?: (ctx: DelExtFunctionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.delExtFunctionName`.
	 * @param ctx the parse tree
	 */
	enterDelExtFunctionName?: (ctx: DelExtFunctionNameContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.delExtFunctionName`.
	 * @param ctx the parse tree
	 */
	exitDelExtFunctionName?: (ctx: DelExtFunctionNameContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.delIntFunction`.
	 * @param ctx the parse tree
	 */
	enterDelIntFunction?: (ctx: DelIntFunctionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.delIntFunction`.
	 * @param ctx the parse tree
	 */
	exitDelIntFunction?: (ctx: DelIntFunctionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.delIntFunctionName`.
	 * @param ctx the parse tree
	 */
	enterDelIntFunctionName?: (ctx: DelIntFunctionNameContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.delIntFunctionName`.
	 * @param ctx the parse tree
	 */
	exitDelIntFunctionName?: (ctx: DelIntFunctionNameContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.lambdaFunction`.
	 * @param ctx the parse tree
	 */
	enterLambdaFunction?: (ctx: LambdaFunctionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.lambdaFunction`.
	 * @param ctx the parse tree
	 */
	exitLambdaFunction?: (ctx: LambdaFunctionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.lambdaFunctionName`.
	 * @param ctx the parse tree
	 */
	enterLambdaFunctionName?: (ctx: LambdaFunctionNameContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.lambdaFunctionName`.
	 * @param ctx the parse tree
	 */
	exitLambdaFunctionName?: (ctx: LambdaFunctionNameContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taFunction`.
	 * @param ctx the parse tree
	 */
	enterTaFunction?: (ctx: TaFunctionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taFunction`.
	 * @param ctx the parse tree
	 */
	exitTaFunction?: (ctx: TaFunctionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taFunctionName`.
	 * @param ctx the parse tree
	 */
	enterTaFunctionName?: (ctx: TaFunctionNameContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taFunctionName`.
	 * @param ctx the parse tree
	 */
	exitTaFunctionName?: (ctx: TaFunctionNameContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectFunction`.
	 * @param ctx the parse tree
	 */
	enterSelectFunction?: (ctx: SelectFunctionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectFunction`.
	 * @param ctx the parse tree
	 */
	exitSelectFunction?: (ctx: SelectFunctionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionName`.
	 * @param ctx the parse tree
	 */
	enterSelectFunctionName?: (ctx: SelectFunctionNameContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionName`.
	 * @param ctx the parse tree
	 */
	exitSelectFunctionName?: (ctx: SelectFunctionNameContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionDescription`.
	 * @param ctx the parse tree
	 */
	enterFunctionDescription?: (ctx: FunctionDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionDescription`.
	 * @param ctx the parse tree
	 */
	exitFunctionDescription?: (ctx: FunctionDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionPreIf`.
	 * @param ctx the parse tree
	 */
	enterFunctionDescriptionPreIf?: (ctx: FunctionDescriptionPreIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionPreIf`.
	 * @param ctx the parse tree
	 */
	exitFunctionDescriptionPreIf?: (ctx: FunctionDescriptionPreIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionPreIfResult?: (ctx: FunctionPreIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionPreIfResult?: (ctx: FunctionPreIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionPostIf`.
	 * @param ctx the parse tree
	 */
	enterFunctionDescriptionPostIf?: (ctx: FunctionDescriptionPostIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionPostIf`.
	 * @param ctx the parse tree
	 */
	exitFunctionDescriptionPostIf?: (ctx: FunctionDescriptionPostIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionPostIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionPostIfResult?: (ctx: FunctionPostIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionPostIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionPostIfResult?: (ctx: FunctionPostIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionGenericDescription`.
	 * @param ctx the parse tree
	 */
	enterFunctionGenericDescription?: (ctx: FunctionGenericDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionGenericDescription`.
	 * @param ctx the parse tree
	 */
	exitFunctionGenericDescription?: (ctx: FunctionGenericDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionAssignmentPreIf`.
	 * @param ctx the parse tree
	 */
	enterFunctionDescriptionAssignmentPreIf?: (ctx: FunctionDescriptionAssignmentPreIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionAssignmentPreIf`.
	 * @param ctx the parse tree
	 */
	exitFunctionDescriptionAssignmentPreIf?: (ctx: FunctionDescriptionAssignmentPreIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionAssignmentPostIf`.
	 * @param ctx the parse tree
	 */
	enterFunctionDescriptionAssignmentPostIf?: (ctx: FunctionDescriptionAssignmentPostIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionAssignmentPostIf`.
	 * @param ctx the parse tree
	 */
	exitFunctionDescriptionAssignmentPostIf?: (ctx: FunctionDescriptionAssignmentPostIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionAssignPreIfResult?: (ctx: FunctionAssignPreIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionAssignPreIfResult?: (ctx: FunctionAssignPreIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionAssignPostIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionAssignPostIfResult?: (ctx: FunctionAssignPostIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionAssignPostIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionAssignPostIfResult?: (ctx: FunctionAssignPostIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionGenericValuesDescription`.
	 * @param ctx the parse tree
	 */
	enterFunctionGenericValuesDescription?: (ctx: FunctionGenericValuesDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionGenericValuesDescription`.
	 * @param ctx the parse tree
	 */
	exitFunctionGenericValuesDescription?: (ctx: FunctionGenericValuesDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionValuesAssignmentPreIf`.
	 * @param ctx the parse tree
	 */
	enterFunctionDescriptionValuesAssignmentPreIf?: (ctx: FunctionDescriptionValuesAssignmentPreIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionValuesAssignmentPreIf`.
	 * @param ctx the parse tree
	 */
	exitFunctionDescriptionValuesAssignmentPreIf?: (ctx: FunctionDescriptionValuesAssignmentPreIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionValuesAssignmentPostIf`.
	 * @param ctx the parse tree
	 */
	enterFunctionDescriptionValuesAssignmentPostIf?: (ctx: FunctionDescriptionValuesAssignmentPostIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionDescriptionValuesAssignmentPostIf`.
	 * @param ctx the parse tree
	 */
	exitFunctionDescriptionValuesAssignmentPostIf?: (ctx: FunctionDescriptionValuesAssignmentPostIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionValuesAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionValuesAssignPreIfResult?: (ctx: FunctionValuesAssignPreIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionValuesAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionValuesAssignPreIfResult?: (ctx: FunctionValuesAssignPreIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.functionValuesAssignPostIfResult`.
	 * @param ctx the parse tree
	 */
	enterFunctionValuesAssignPostIfResult?: (ctx: FunctionValuesAssignPostIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.functionValuesAssignPostIfResult`.
	 * @param ctx the parse tree
	 */
	exitFunctionValuesAssignPostIfResult?: (ctx: FunctionValuesAssignPostIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.tupleValue`.
	 * @param ctx the parse tree
	 */
	enterTupleValue?: (ctx: TupleValueContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.tupleValue`.
	 * @param ctx the parse tree
	 */
	exitTupleValue?: (ctx: TupleValueContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.value`.
	 * @param ctx the parse tree
	 */
	enterValue?: (ctx: ValueContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.value`.
	 * @param ctx the parse tree
	 */
	exitValue?: (ctx: ValueContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taFunctionDescription`.
	 * @param ctx the parse tree
	 */
	enterTaFunctionDescription?: (ctx: TaFunctionDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taFunctionDescription`.
	 * @param ctx the parse tree
	 */
	exitTaFunctionDescription?: (ctx: TaFunctionDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taFunctionDescriptionPreIf`.
	 * @param ctx the parse tree
	 */
	enterTaFunctionDescriptionPreIf?: (ctx: TaFunctionDescriptionPreIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taFunctionDescriptionPreIf`.
	 * @param ctx the parse tree
	 */
	exitTaFunctionDescriptionPreIf?: (ctx: TaFunctionDescriptionPreIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterTaFunctionPreIfResult?: (ctx: TaFunctionPreIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitTaFunctionPreIfResult?: (ctx: TaFunctionPreIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taFunctionDescriptionPostIf`.
	 * @param ctx the parse tree
	 */
	enterTaFunctionDescriptionPostIf?: (ctx: TaFunctionDescriptionPostIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taFunctionDescriptionPostIf`.
	 * @param ctx the parse tree
	 */
	exitTaFunctionDescriptionPostIf?: (ctx: TaFunctionDescriptionPostIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taFunctionPostIfResult`.
	 * @param ctx the parse tree
	 */
	enterTaFunctionPostIfResult?: (ctx: TaFunctionPostIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taFunctionPostIfResult`.
	 * @param ctx the parse tree
	 */
	exitTaFunctionPostIfResult?: (ctx: TaFunctionPostIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taFunctionGenericDescription`.
	 * @param ctx the parse tree
	 */
	enterTaFunctionGenericDescription?: (ctx: TaFunctionGenericDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taFunctionGenericDescription`.
	 * @param ctx the parse tree
	 */
	exitTaFunctionGenericDescription?: (ctx: TaFunctionGenericDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taAssignPreIf`.
	 * @param ctx the parse tree
	 */
	enterTaAssignPreIf?: (ctx: TaAssignPreIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taAssignPreIf`.
	 * @param ctx the parse tree
	 */
	exitTaAssignPreIf?: (ctx: TaAssignPreIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterTaAssignPreIfResult?: (ctx: TaAssignPreIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitTaAssignPreIfResult?: (ctx: TaAssignPreIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taAssignPostIf`.
	 * @param ctx the parse tree
	 */
	enterTaAssignPostIf?: (ctx: TaAssignPostIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taAssignPostIf`.
	 * @param ctx the parse tree
	 */
	exitTaAssignPostIf?: (ctx: TaAssignPostIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.taAssignPostIfResult`.
	 * @param ctx the parse tree
	 */
	enterTaAssignPostIfResult?: (ctx: TaAssignPostIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.taAssignPostIfResult`.
	 * @param ctx the parse tree
	 */
	exitTaAssignPostIfResult?: (ctx: TaAssignPostIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionDescription`.
	 * @param ctx the parse tree
	 */
	enterSelectFunctionDescription?: (ctx: SelectFunctionDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionDescription`.
	 * @param ctx the parse tree
	 */
	exitSelectFunctionDescription?: (ctx: SelectFunctionDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionDescriptionPreIf`.
	 * @param ctx the parse tree
	 */
	enterSelectFunctionDescriptionPreIf?: (ctx: SelectFunctionDescriptionPreIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionDescriptionPreIf`.
	 * @param ctx the parse tree
	 */
	exitSelectFunctionDescriptionPreIf?: (ctx: SelectFunctionDescriptionPreIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterSelectFunctionPreIfResult?: (ctx: SelectFunctionPreIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitSelectFunctionPreIfResult?: (ctx: SelectFunctionPreIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionDescriptionPostIf`.
	 * @param ctx the parse tree
	 */
	enterSelectFunctionDescriptionPostIf?: (ctx: SelectFunctionDescriptionPostIfContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionDescriptionPostIf`.
	 * @param ctx the parse tree
	 */
	exitSelectFunctionDescriptionPostIf?: (ctx: SelectFunctionDescriptionPostIfContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionPostIfResult`.
	 * @param ctx the parse tree
	 */
	enterSelectFunctionPostIfResult?: (ctx: SelectFunctionPostIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionPostIfResult`.
	 * @param ctx the parse tree
	 */
	exitSelectFunctionPostIfResult?: (ctx: SelectFunctionPostIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionGenericDescription`.
	 * @param ctx the parse tree
	 */
	enterSelectFunctionGenericDescription?: (ctx: SelectFunctionGenericDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectFunctionGenericDescription`.
	 * @param ctx the parse tree
	 */
	exitSelectFunctionGenericDescription?: (ctx: SelectFunctionGenericDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectAssignPreIfList`.
	 * @param ctx the parse tree
	 */
	enterSelectAssignPreIfList?: (ctx: SelectAssignPreIfListContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectAssignPreIfList`.
	 * @param ctx the parse tree
	 */
	exitSelectAssignPreIfList?: (ctx: SelectAssignPreIfListContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	enterSelectAssignPreIfResult?: (ctx: SelectAssignPreIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectAssignPreIfResult`.
	 * @param ctx the parse tree
	 */
	exitSelectAssignPreIfResult?: (ctx: SelectAssignPreIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectAssignPostIfList`.
	 * @param ctx the parse tree
	 */
	enterSelectAssignPostIfList?: (ctx: SelectAssignPostIfListContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectAssignPostIfList`.
	 * @param ctx the parse tree
	 */
	exitSelectAssignPostIfList?: (ctx: SelectAssignPostIfListContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.selectAssignPostIfResult`.
	 * @param ctx the parse tree
	 */
	enterSelectAssignPostIfResult?: (ctx: SelectAssignPostIfResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.selectAssignPostIfResult`.
	 * @param ctx the parse tree
	 */
	exitSelectAssignPostIfResult?: (ctx: SelectAssignPostIfResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.assignIdentifier`.
	 * @param ctx the parse tree
	 */
	enterAssignIdentifier?: (ctx: AssignIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.assignIdentifier`.
	 * @param ctx the parse tree
	 */
	exitAssignIdentifier?: (ctx: AssignIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.assignParameter`.
	 * @param ctx the parse tree
	 */
	enterAssignParameter?: (ctx: AssignParameterContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.assignParameter`.
	 * @param ctx the parse tree
	 */
	exitAssignParameter?: (ctx: AssignParameterContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.assignValue`.
	 * @param ctx the parse tree
	 */
	enterAssignValue?: (ctx: AssignValueContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.assignValue`.
	 * @param ctx the parse tree
	 */
	exitAssignValue?: (ctx: AssignValueContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.assignTuple`.
	 * @param ctx the parse tree
	 */
	enterAssignTuple?: (ctx: AssignTupleContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.assignTuple`.
	 * @param ctx the parse tree
	 */
	exitAssignTuple?: (ctx: AssignTupleContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.assignElement`.
	 * @param ctx the parse tree
	 */
	enterAssignElement?: (ctx: AssignElementContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.assignElement`.
	 * @param ctx the parse tree
	 */
	exitAssignElement?: (ctx: AssignElementContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.assignmentsList`.
	 * @param ctx the parse tree
	 */
	enterAssignmentsList?: (ctx: AssignmentsListContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.assignmentsList`.
	 * @param ctx the parse tree
	 */
	exitAssignmentsList?: (ctx: AssignmentsListContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.modelSignature`.
	 * @param ctx the parse tree
	 */
	enterModelSignature?: (ctx: ModelSignatureContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.modelSignature`.
	 * @param ctx the parse tree
	 */
	exitModelSignature?: (ctx: ModelSignatureContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.modelSymbol`.
	 * @param ctx the parse tree
	 */
	enterModelSymbol?: (ctx: ModelSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.modelSymbol`.
	 * @param ctx the parse tree
	 */
	exitModelSymbol?: (ctx: ModelSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.parameter`.
	 * @param ctx the parse tree
	 */
	enterParameter?: (ctx: ParameterContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.parameter`.
	 * @param ctx the parse tree
	 */
	exitParameter?: (ctx: ParameterContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.identifier`.
	 * @param ctx the parse tree
	 */
	enterIdentifier?: (ctx: IdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.identifier`.
	 * @param ctx the parse tree
	 */
	exitIdentifier?: (ctx: IdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.variable`.
	 * @param ctx the parse tree
	 */
	enterVariable?: (ctx: VariableContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.variable`.
	 * @param ctx the parse tree
	 */
	exitVariable?: (ctx: VariableContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.variableFixedValues`.
	 * @param ctx the parse tree
	 */
	enterVariableFixedValues?: (ctx: VariableFixedValuesContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.variableFixedValues`.
	 * @param ctx the parse tree
	 */
	exitVariableFixedValues?: (ctx: VariableFixedValuesContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.parametersList`.
	 * @param ctx the parse tree
	 */
	enterParametersList?: (ctx: ParametersListContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.parametersList`.
	 * @param ctx the parse tree
	 */
	exitParametersList?: (ctx: ParametersListContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.datatypeSymbol`.
	 * @param ctx the parse tree
	 */
	enterDatatypeSymbol?: (ctx: DatatypeSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.datatypeSymbol`.
	 * @param ctx the parse tree
	 */
	exitDatatypeSymbol?: (ctx: DatatypeSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.trueSymbol`.
	 * @param ctx the parse tree
	 */
	enterTrueSymbol?: (ctx: TrueSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.trueSymbol`.
	 * @param ctx the parse tree
	 */
	exitTrueSymbol?: (ctx: TrueSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.falseSymbol`.
	 * @param ctx the parse tree
	 */
	enterFalseSymbol?: (ctx: FalseSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.falseSymbol`.
	 * @param ctx the parse tree
	 */
	exitFalseSymbol?: (ctx: FalseSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.integerSymbol`.
	 * @param ctx the parse tree
	 */
	enterIntegerSymbol?: (ctx: IntegerSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.integerSymbol`.
	 * @param ctx the parse tree
	 */
	exitIntegerSymbol?: (ctx: IntegerSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.realSymbol`.
	 * @param ctx the parse tree
	 */
	enterRealSymbol?: (ctx: RealSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.realSymbol`.
	 * @param ctx the parse tree
	 */
	exitRealSymbol?: (ctx: RealSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.infinitySymbol`.
	 * @param ctx the parse tree
	 */
	enterInfinitySymbol?: (ctx: InfinitySymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.infinitySymbol`.
	 * @param ctx the parse tree
	 */
	exitInfinitySymbol?: (ctx: InfinitySymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.stringSymbol`.
	 * @param ctx the parse tree
	 */
	enterStringSymbol?: (ctx: StringSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.stringSymbol`.
	 * @param ctx the parse tree
	 */
	exitStringSymbol?: (ctx: StringSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.root`.
	 * @param ctx the parse tree
	 */
	enterRoot?: (ctx: RootContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.root`.
	 * @param ctx the parse tree
	 */
	exitRoot?: (ctx: RootContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.ifCondition`.
	 * @param ctx the parse tree
	 */
	enterIfCondition?: (ctx: IfConditionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.ifCondition`.
	 * @param ctx the parse tree
	 */
	exitIfCondition?: (ctx: IfConditionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.ifThenCondition`.
	 * @param ctx the parse tree
	 */
	enterIfThenCondition?: (ctx: IfThenConditionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.ifThenCondition`.
	 * @param ctx the parse tree
	 */
	exitIfThenCondition?: (ctx: IfThenConditionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.booleanExpression`.
	 * @param ctx the parse tree
	 */
	enterBooleanExpression?: (ctx: BooleanExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.booleanExpression`.
	 * @param ctx the parse tree
	 */
	exitBooleanExpression?: (ctx: BooleanExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.binaryCondition`.
	 * @param ctx the parse tree
	 */
	enterBinaryCondition?: (ctx: BinaryConditionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.binaryCondition`.
	 * @param ctx the parse tree
	 */
	exitBinaryCondition?: (ctx: BinaryConditionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.booleanExpressionTerm`.
	 * @param ctx the parse tree
	 */
	enterBooleanExpressionTerm?: (ctx: BooleanExpressionTermContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.booleanExpressionTerm`.
	 * @param ctx the parse tree
	 */
	exitBooleanExpressionTerm?: (ctx: BooleanExpressionTermContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.unaryCondition`.
	 * @param ctx the parse tree
	 */
	enterUnaryCondition?: (ctx: UnaryConditionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.unaryCondition`.
	 * @param ctx the parse tree
	 */
	exitUnaryCondition?: (ctx: UnaryConditionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.relationalExpressionTerm`.
	 * @param ctx the parse tree
	 */
	enterRelationalExpressionTerm?: (ctx: RelationalExpressionTermContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.relationalExpressionTerm`.
	 * @param ctx the parse tree
	 */
	exitRelationalExpressionTerm?: (ctx: RelationalExpressionTermContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.booleanExpressionBasicTerm`.
	 * @param ctx the parse tree
	 */
	enterBooleanExpressionBasicTerm?: (ctx: BooleanExpressionBasicTermContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.booleanExpressionBasicTerm`.
	 * @param ctx the parse tree
	 */
	exitBooleanExpressionBasicTerm?: (ctx: BooleanExpressionBasicTermContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.booleanExpressionElement`.
	 * @param ctx the parse tree
	 */
	enterBooleanExpressionElement?: (ctx: BooleanExpressionElementContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.booleanExpressionElement`.
	 * @param ctx the parse tree
	 */
	exitBooleanExpressionElement?: (ctx: BooleanExpressionElementContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.booleanExpressionResult`.
	 * @param ctx the parse tree
	 */
	enterBooleanExpressionResult?: (ctx: BooleanExpressionResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.booleanExpressionResult`.
	 * @param ctx the parse tree
	 */
	exitBooleanExpressionResult?: (ctx: BooleanExpressionResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.actionExpression`.
	 * @param ctx the parse tree
	 */
	enterActionExpression?: (ctx: ActionExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.actionExpression`.
	 * @param ctx the parse tree
	 */
	exitActionExpression?: (ctx: ActionExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.ifSymbol`.
	 * @param ctx the parse tree
	 */
	enterIfSymbol?: (ctx: IfSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.ifSymbol`.
	 * @param ctx the parse tree
	 */
	exitIfSymbol?: (ctx: IfSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.inOtherCaseSymbol`.
	 * @param ctx the parse tree
	 */
	enterInOtherCaseSymbol?: (ctx: InOtherCaseSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.inOtherCaseSymbol`.
	 * @param ctx the parse tree
	 */
	exitInOtherCaseSymbol?: (ctx: InOtherCaseSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.unaryConditionalOperator`.
	 * @param ctx the parse tree
	 */
	enterUnaryConditionalOperator?: (ctx: UnaryConditionalOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.unaryConditionalOperator`.
	 * @param ctx the parse tree
	 */
	exitUnaryConditionalOperator?: (ctx: UnaryConditionalOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.binaryConditionalOperator`.
	 * @param ctx the parse tree
	 */
	enterBinaryConditionalOperator?: (ctx: BinaryConditionalOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.binaryConditionalOperator`.
	 * @param ctx the parse tree
	 */
	exitBinaryConditionalOperator?: (ctx: BinaryConditionalOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.binaryRelationalOperator`.
	 * @param ctx the parse tree
	 */
	enterBinaryRelationalOperator?: (ctx: BinaryRelationalOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.binaryRelationalOperator`.
	 * @param ctx the parse tree
	 */
	exitBinaryRelationalOperator?: (ctx: BinaryRelationalOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.notOperator`.
	 * @param ctx the parse tree
	 */
	enterNotOperator?: (ctx: NotOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.notOperator`.
	 * @param ctx the parse tree
	 */
	exitNotOperator?: (ctx: NotOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.andOperator`.
	 * @param ctx the parse tree
	 */
	enterAndOperator?: (ctx: AndOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.andOperator`.
	 * @param ctx the parse tree
	 */
	exitAndOperator?: (ctx: AndOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.orOperator`.
	 * @param ctx the parse tree
	 */
	enterOrOperator?: (ctx: OrOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.orOperator`.
	 * @param ctx the parse tree
	 */
	exitOrOperator?: (ctx: OrOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.equalToOperator`.
	 * @param ctx the parse tree
	 */
	enterEqualToOperator?: (ctx: EqualToOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.equalToOperator`.
	 * @param ctx the parse tree
	 */
	exitEqualToOperator?: (ctx: EqualToOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.notEqualToOperator`.
	 * @param ctx the parse tree
	 */
	enterNotEqualToOperator?: (ctx: NotEqualToOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.notEqualToOperator`.
	 * @param ctx the parse tree
	 */
	exitNotEqualToOperator?: (ctx: NotEqualToOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.greaterThanOperator`.
	 * @param ctx the parse tree
	 */
	enterGreaterThanOperator?: (ctx: GreaterThanOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.greaterThanOperator`.
	 * @param ctx the parse tree
	 */
	exitGreaterThanOperator?: (ctx: GreaterThanOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.lessThanOperator`.
	 * @param ctx the parse tree
	 */
	enterLessThanOperator?: (ctx: LessThanOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.lessThanOperator`.
	 * @param ctx the parse tree
	 */
	exitLessThanOperator?: (ctx: LessThanOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.greaterThanOrEqualToOperator`.
	 * @param ctx the parse tree
	 */
	enterGreaterThanOrEqualToOperator?: (ctx: GreaterThanOrEqualToOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.greaterThanOrEqualToOperator`.
	 * @param ctx the parse tree
	 */
	exitGreaterThanOrEqualToOperator?: (ctx: GreaterThanOrEqualToOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.lessThanOrEqualToOperator`.
	 * @param ctx the parse tree
	 */
	enterLessThanOrEqualToOperator?: (ctx: LessThanOrEqualToOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.lessThanOrEqualToOperator`.
	 * @param ctx the parse tree
	 */
	exitLessThanOrEqualToOperator?: (ctx: LessThanOrEqualToOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.set`.
	 * @param ctx the parse tree
	 */
	enterSet?: (ctx: SetContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.set`.
	 * @param ctx the parse tree
	 */
	exitSet?: (ctx: SetContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	enterSetImplicitDefinition?: (ctx: SetImplicitDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	exitSetImplicitDefinition?: (ctx: SetImplicitDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setExplicitDefinition`.
	 * @param ctx the parse tree
	 */
	enterSetExplicitDefinition?: (ctx: SetExplicitDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setExplicitDefinition`.
	 * @param ctx the parse tree
	 */
	exitSetExplicitDefinition?: (ctx: SetExplicitDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setDefinition`.
	 * @param ctx the parse tree
	 */
	enterSetDefinition?: (ctx: SetDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setDefinition`.
	 * @param ctx the parse tree
	 */
	exitSetDefinition?: (ctx: SetDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	enterSetSymbol?: (ctx: SetSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setSymbol`.
	 * @param ctx the parse tree
	 */
	exitSetSymbol?: (ctx: SetSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setName`.
	 * @param ctx the parse tree
	 */
	enterSetName?: (ctx: SetNameContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setName`.
	 * @param ctx the parse tree
	 */
	exitSetName?: (ctx: SetNameContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setOfIntegerNumbersSymbol`.
	 * @param ctx the parse tree
	 */
	enterSetOfIntegerNumbersSymbol?: (ctx: SetOfIntegerNumbersSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setOfIntegerNumbersSymbol`.
	 * @param ctx the parse tree
	 */
	exitSetOfIntegerNumbersSymbol?: (ctx: SetOfIntegerNumbersSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setOfNaturalNumbersSymbol`.
	 * @param ctx the parse tree
	 */
	enterSetOfNaturalNumbersSymbol?: (ctx: SetOfNaturalNumbersSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setOfNaturalNumbersSymbol`.
	 * @param ctx the parse tree
	 */
	exitSetOfNaturalNumbersSymbol?: (ctx: SetOfNaturalNumbersSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setOfRealNumbersSymbol`.
	 * @param ctx the parse tree
	 */
	enterSetOfRealNumbersSymbol?: (ctx: SetOfRealNumbersSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setOfRealNumbersSymbol`.
	 * @param ctx the parse tree
	 */
	exitSetOfRealNumbersSymbol?: (ctx: SetOfRealNumbersSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setOfBooleanAlgebraSymbol`.
	 * @param ctx the parse tree
	 */
	enterSetOfBooleanAlgebraSymbol?: (ctx: SetOfBooleanAlgebraSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setOfBooleanAlgebraSymbol`.
	 * @param ctx the parse tree
	 */
	exitSetOfBooleanAlgebraSymbol?: (ctx: SetOfBooleanAlgebraSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.elementCollection`.
	 * @param ctx the parse tree
	 */
	enterElementCollection?: (ctx: ElementCollectionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.elementCollection`.
	 * @param ctx the parse tree
	 */
	exitElementCollection?: (ctx: ElementCollectionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	enterElement?: (ctx: ElementContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.element`.
	 * @param ctx the parse tree
	 */
	exitElement?: (ctx: ElementContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.tupleCollection`.
	 * @param ctx the parse tree
	 */
	enterTupleCollection?: (ctx: TupleCollectionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.tupleCollection`.
	 * @param ctx the parse tree
	 */
	exitTupleCollection?: (ctx: TupleCollectionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.tuple`.
	 * @param ctx the parse tree
	 */
	enterTuple?: (ctx: TupleContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.tuple`.
	 * @param ctx the parse tree
	 */
	exitTuple?: (ctx: TupleContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.variableTuple`.
	 * @param ctx the parse tree
	 */
	enterVariableTuple?: (ctx: VariableTupleContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.variableTuple`.
	 * @param ctx the parse tree
	 */
	exitVariableTuple?: (ctx: VariableTupleContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.variableTupleFixedValues`.
	 * @param ctx the parse tree
	 */
	enterVariableTupleFixedValues?: (ctx: VariableTupleFixedValuesContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.variableTupleFixedValues`.
	 * @param ctx the parse tree
	 */
	exitVariableTupleFixedValues?: (ctx: VariableTupleFixedValuesContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.tupleDefinition`.
	 * @param ctx the parse tree
	 */
	enterTupleDefinition?: (ctx: TupleDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.tupleDefinition`.
	 * @param ctx the parse tree
	 */
	exitTupleDefinition?: (ctx: TupleDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.elementDefinition`.
	 * @param ctx the parse tree
	 */
	enterElementDefinition?: (ctx: ElementDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.elementDefinition`.
	 * @param ctx the parse tree
	 */
	exitElementDefinition?: (ctx: ElementDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.definitionWithSetImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	enterDefinitionWithSetImplicitDefinition?: (ctx: DefinitionWithSetImplicitDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.definitionWithSetImplicitDefinition`.
	 * @param ctx the parse tree
	 */
	exitDefinitionWithSetImplicitDefinition?: (ctx: DefinitionWithSetImplicitDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.definitionWithSetSymbol`.
	 * @param ctx the parse tree
	 */
	enterDefinitionWithSetSymbol?: (ctx: DefinitionWithSetSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.definitionWithSetSymbol`.
	 * @param ctx the parse tree
	 */
	exitDefinitionWithSetSymbol?: (ctx: DefinitionWithSetSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.definitionWithRange`.
	 * @param ctx the parse tree
	 */
	enterDefinitionWithRange?: (ctx: DefinitionWithRangeContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.definitionWithRange`.
	 * @param ctx the parse tree
	 */
	exitDefinitionWithRange?: (ctx: DefinitionWithRangeContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.range`.
	 * @param ctx the parse tree
	 */
	enterRange?: (ctx: RangeContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.range`.
	 * @param ctx the parse tree
	 */
	exitRange?: (ctx: RangeContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.booleanSymbol`.
	 * @param ctx the parse tree
	 */
	enterBooleanSymbol?: (ctx: BooleanSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.booleanSymbol`.
	 * @param ctx the parse tree
	 */
	exitBooleanSymbol?: (ctx: BooleanSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.numberSymbol`.
	 * @param ctx the parse tree
	 */
	enterNumberSymbol?: (ctx: NumberSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.numberSymbol`.
	 * @param ctx the parse tree
	 */
	exitNumberSymbol?: (ctx: NumberSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.emptySetSymbol`.
	 * @param ctx the parse tree
	 */
	enterEmptySetSymbol?: (ctx: EmptySetSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.emptySetSymbol`.
	 * @param ctx the parse tree
	 */
	exitEmptySetSymbol?: (ctx: EmptySetSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.emptyTupleSymbol`.
	 * @param ctx the parse tree
	 */
	enterEmptyTupleSymbol?: (ctx: EmptyTupleSymbolContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.emptyTupleSymbol`.
	 * @param ctx the parse tree
	 */
	exitEmptyTupleSymbol?: (ctx: EmptyTupleSymbolContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setOperationResult`.
	 * @param ctx the parse tree
	 */
	enterSetOperationResult?: (ctx: SetOperationResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setOperationResult`.
	 * @param ctx the parse tree
	 */
	exitSetOperationResult?: (ctx: SetOperationResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setOperationTerm`.
	 * @param ctx the parse tree
	 */
	enterSetOperationTerm?: (ctx: SetOperationTermContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setOperationTerm`.
	 * @param ctx the parse tree
	 */
	exitSetOperationTerm?: (ctx: SetOperationTermContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setOperationExpression`.
	 * @param ctx the parse tree
	 */
	enterSetOperationExpression?: (ctx: SetOperationExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setOperationExpression`.
	 * @param ctx the parse tree
	 */
	exitSetOperationExpression?: (ctx: SetOperationExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.operationSet`.
	 * @param ctx the parse tree
	 */
	enterOperationSet?: (ctx: OperationSetContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.operationSet`.
	 * @param ctx the parse tree
	 */
	exitOperationSet?: (ctx: OperationSetContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.belongsToOperator`.
	 * @param ctx the parse tree
	 */
	enterBelongsToOperator?: (ctx: BelongsToOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.belongsToOperator`.
	 * @param ctx the parse tree
	 */
	exitBelongsToOperator?: (ctx: BelongsToOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.inOperator`.
	 * @param ctx the parse tree
	 */
	enterInOperator?: (ctx: InOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.inOperator`.
	 * @param ctx the parse tree
	 */
	exitInOperator?: (ctx: InOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.notInOperator`.
	 * @param ctx the parse tree
	 */
	enterNotInOperator?: (ctx: NotInOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.notInOperator`.
	 * @param ctx the parse tree
	 */
	exitNotInOperator?: (ctx: NotInOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setOperator`.
	 * @param ctx the parse tree
	 */
	enterSetOperator?: (ctx: SetOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setOperator`.
	 * @param ctx the parse tree
	 */
	exitSetOperator?: (ctx: SetOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.cartesianProductOperator`.
	 * @param ctx the parse tree
	 */
	enterCartesianProductOperator?: (ctx: CartesianProductOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.cartesianProductOperator`.
	 * @param ctx the parse tree
	 */
	exitCartesianProductOperator?: (ctx: CartesianProductOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.unionOperator`.
	 * @param ctx the parse tree
	 */
	enterUnionOperator?: (ctx: UnionOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.unionOperator`.
	 * @param ctx the parse tree
	 */
	exitUnionOperator?: (ctx: UnionOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.intersectionOperator`.
	 * @param ctx the parse tree
	 */
	enterIntersectionOperator?: (ctx: IntersectionOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.intersectionOperator`.
	 * @param ctx the parse tree
	 */
	exitIntersectionOperator?: (ctx: IntersectionOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.setdifferenceOperator`.
	 * @param ctx the parse tree
	 */
	enterSetdifferenceOperator?: (ctx: SetdifferenceOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.setdifferenceOperator`.
	 * @param ctx the parse tree
	 */
	exitSetdifferenceOperator?: (ctx: SetdifferenceOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.mathExpression`.
	 * @param ctx the parse tree
	 */
	enterMathExpression?: (ctx: MathExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.mathExpression`.
	 * @param ctx the parse tree
	 */
	exitMathExpression?: (ctx: MathExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.binaryMathExpression`.
	 * @param ctx the parse tree
	 */
	enterBinaryMathExpression?: (ctx: BinaryMathExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.binaryMathExpression`.
	 * @param ctx the parse tree
	 */
	exitBinaryMathExpression?: (ctx: BinaryMathExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.mathExpressionTerm`.
	 * @param ctx the parse tree
	 */
	enterMathExpressionTerm?: (ctx: MathExpressionTermContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.mathExpressionTerm`.
	 * @param ctx the parse tree
	 */
	exitMathExpressionTerm?: (ctx: MathExpressionTermContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.unaryMathExpression`.
	 * @param ctx the parse tree
	 */
	enterUnaryMathExpression?: (ctx: UnaryMathExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.unaryMathExpression`.
	 * @param ctx the parse tree
	 */
	exitUnaryMathExpression?: (ctx: UnaryMathExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.mathTerm`.
	 * @param ctx the parse tree
	 */
	enterMathTerm?: (ctx: MathTermContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.mathTerm`.
	 * @param ctx the parse tree
	 */
	exitMathTerm?: (ctx: MathTermContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.mathFactor`.
	 * @param ctx the parse tree
	 */
	enterMathFactor?: (ctx: MathFactorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.mathFactor`.
	 * @param ctx the parse tree
	 */
	exitMathFactor?: (ctx: MathFactorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.mathExpressionBasicTerm`.
	 * @param ctx the parse tree
	 */
	enterMathExpressionBasicTerm?: (ctx: MathExpressionBasicTermContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.mathExpressionBasicTerm`.
	 * @param ctx the parse tree
	 */
	exitMathExpressionBasicTerm?: (ctx: MathExpressionBasicTermContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.mathExpressionElement`.
	 * @param ctx the parse tree
	 */
	enterMathExpressionElement?: (ctx: MathExpressionElementContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.mathExpressionElement`.
	 * @param ctx the parse tree
	 */
	exitMathExpressionElement?: (ctx: MathExpressionElementContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.mathExpressionResult`.
	 * @param ctx the parse tree
	 */
	enterMathExpressionResult?: (ctx: MathExpressionResultContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.mathExpressionResult`.
	 * @param ctx the parse tree
	 */
	exitMathExpressionResult?: (ctx: MathExpressionResultContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.unaryMathOperator`.
	 * @param ctx the parse tree
	 */
	enterUnaryMathOperator?: (ctx: UnaryMathOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.unaryMathOperator`.
	 * @param ctx the parse tree
	 */
	exitUnaryMathOperator?: (ctx: UnaryMathOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.binaryMathOperatorLowerPrecedence`.
	 * @param ctx the parse tree
	 */
	enterBinaryMathOperatorLowerPrecedence?: (ctx: BinaryMathOperatorLowerPrecedenceContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.binaryMathOperatorLowerPrecedence`.
	 * @param ctx the parse tree
	 */
	exitBinaryMathOperatorLowerPrecedence?: (ctx: BinaryMathOperatorLowerPrecedenceContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.binaryMathOperatorHigherPrecedence`.
	 * @param ctx the parse tree
	 */
	enterBinaryMathOperatorHigherPrecedence?: (ctx: BinaryMathOperatorHigherPrecedenceContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.binaryMathOperatorHigherPrecedence`.
	 * @param ctx the parse tree
	 */
	exitBinaryMathOperatorHigherPrecedence?: (ctx: BinaryMathOperatorHigherPrecedenceContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.sqrtOperator`.
	 * @param ctx the parse tree
	 */
	enterSqrtOperator?: (ctx: SqrtOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.sqrtOperator`.
	 * @param ctx the parse tree
	 */
	exitSqrtOperator?: (ctx: SqrtOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.additionOperator`.
	 * @param ctx the parse tree
	 */
	enterAdditionOperator?: (ctx: AdditionOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.additionOperator`.
	 * @param ctx the parse tree
	 */
	exitAdditionOperator?: (ctx: AdditionOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.substractionOperator`.
	 * @param ctx the parse tree
	 */
	enterSubstractionOperator?: (ctx: SubstractionOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.substractionOperator`.
	 * @param ctx the parse tree
	 */
	exitSubstractionOperator?: (ctx: SubstractionOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.multiplicationOperator`.
	 * @param ctx the parse tree
	 */
	enterMultiplicationOperator?: (ctx: MultiplicationOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.multiplicationOperator`.
	 * @param ctx the parse tree
	 */
	exitMultiplicationOperator?: (ctx: MultiplicationOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.divisionOperator`.
	 * @param ctx the parse tree
	 */
	enterDivisionOperator?: (ctx: DivisionOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.divisionOperator`.
	 * @param ctx the parse tree
	 */
	exitDivisionOperator?: (ctx: DivisionOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `CFG_DEVS_MODELParser.powerOperator`.
	 * @param ctx the parse tree
	 */
	enterPowerOperator?: (ctx: PowerOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `CFG_DEVS_MODELParser.powerOperator`.
	 * @param ctx the parse tree
	 */
	exitPowerOperator?: (ctx: PowerOperatorContext) => void;
}

