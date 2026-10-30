// Generated from c:/Users/clach/Documents/DevsLangWebEditor/DevsLangWebEditor/CFG_SET_THEORY.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CFG_SET_THEORYParser}.
 */
public interface CFG_SET_THEORYListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code setImplicitDefinitionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSetImplicitDefinitionExpr(CFG_SET_THEORYParser.SetImplicitDefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setImplicitDefinitionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSetImplicitDefinitionExpr(CFG_SET_THEORYParser.SetImplicitDefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setExplicitDefinitionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSetExplicitDefinitionExpr(CFG_SET_THEORYParser.SetExplicitDefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setExplicitDefinitionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSetExplicitDefinitionExpr(CFG_SET_THEORYParser.SetExplicitDefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setDefinitionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSetDefinitionExpr(CFG_SET_THEORYParser.SetDefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDefinitionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSetDefinitionExpr(CFG_SET_THEORYParser.SetDefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperationResultExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSetOperationResultExpr(CFG_SET_THEORYParser.SetOperationResultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperationResultExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSetOperationResultExpr(CFG_SET_THEORYParser.SetOperationResultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setAssignmentExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setExplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentExpr(CFG_SET_THEORYParser.SetAssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setAssignmentExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setExplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentExpr(CFG_SET_THEORYParser.SetAssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementCollectionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setDefinition}.
	 * @param ctx the parse tree
	 */
	void enterElementCollectionExpr(CFG_SET_THEORYParser.ElementCollectionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementCollectionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setDefinition}.
	 * @param ctx the parse tree
	 */
	void exitElementCollectionExpr(CFG_SET_THEORYParser.ElementCollectionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleCollectionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTupleCollectionExpr(CFG_SET_THEORYParser.TupleCollectionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleCollectionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTupleCollectionExpr(CFG_SET_THEORYParser.TupleCollectionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNameSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetNameSymbolExpr(CFG_SET_THEORYParser.SetNameSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNameSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetNameSymbolExpr(CFG_SET_THEORYParser.SetNameSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void enterIntegerSetSymbolExpr(CFG_SET_THEORYParser.IntegerSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void exitIntegerSetSymbolExpr(CFG_SET_THEORYParser.IntegerSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naturalSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void enterNaturalSetSymbolExpr(CFG_SET_THEORYParser.NaturalSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naturalSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void exitNaturalSetSymbolExpr(CFG_SET_THEORYParser.NaturalSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void enterRealSetSymbolExpr(CFG_SET_THEORYParser.RealSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void exitRealSetSymbolExpr(CFG_SET_THEORYParser.RealSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void enterBooleanSetSymbolExpr(CFG_SET_THEORYParser.BooleanSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setSymbol}.
	 * @param ctx the parse tree
	 */
	void exitBooleanSetSymbolExpr(CFG_SET_THEORYParser.BooleanSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#setName}.
	 * @param ctx the parse tree
	 */
	void enterSetName(CFG_SET_THEORYParser.SetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#setName}.
	 * @param ctx the parse tree
	 */
	void exitSetName(CFG_SET_THEORYParser.SetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#setOfIntegerNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfIntegerNumbersSymbol(CFG_SET_THEORYParser.SetOfIntegerNumbersSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#setOfIntegerNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfIntegerNumbersSymbol(CFG_SET_THEORYParser.SetOfIntegerNumbersSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#setOfNaturalNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfNaturalNumbersSymbol(CFG_SET_THEORYParser.SetOfNaturalNumbersSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#setOfNaturalNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfNaturalNumbersSymbol(CFG_SET_THEORYParser.SetOfNaturalNumbersSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#setOfRealNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfRealNumbersSymbol(CFG_SET_THEORYParser.SetOfRealNumbersSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#setOfRealNumbersSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfRealNumbersSymbol(CFG_SET_THEORYParser.SetOfRealNumbersSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#setOfBooleanAlgebraSymbol}.
	 * @param ctx the parse tree
	 */
	void enterSetOfBooleanAlgebraSymbol(CFG_SET_THEORYParser.SetOfBooleanAlgebraSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#setOfBooleanAlgebraSymbol}.
	 * @param ctx the parse tree
	 */
	void exitSetOfBooleanAlgebraSymbol(CFG_SET_THEORYParser.SetOfBooleanAlgebraSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementListExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void enterElementListExpr(CFG_SET_THEORYParser.ElementListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementListExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void exitElementListExpr(CFG_SET_THEORYParser.ElementListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementSuchThatExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void enterElementSuchThatExpr(CFG_SET_THEORYParser.ElementSuchThatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementSuchThatExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void exitElementSuchThatExpr(CFG_SET_THEORYParser.ElementSuchThatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptySetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void enterEmptySetExpr(CFG_SET_THEORYParser.EmptySetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptySetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementCollection}.
	 * @param ctx the parse tree
	 */
	void exitEmptySetExpr(CFG_SET_THEORYParser.EmptySetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementIdentifier}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementIdentifier(CFG_SET_THEORYParser.ElementIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementIdentifier}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementIdentifier(CFG_SET_THEORYParser.ElementIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementNumber}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementNumber(CFG_SET_THEORYParser.ElementNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementNumber}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementNumber(CFG_SET_THEORYParser.ElementNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementBoolean}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementBoolean(CFG_SET_THEORYParser.ElementBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementBoolean}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementBoolean(CFG_SET_THEORYParser.ElementBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementModelSignature}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementModelSignature(CFG_SET_THEORYParser.ElementModelSignatureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementModelSignature}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementModelSignature(CFG_SET_THEORYParser.ElementModelSignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementString}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementString(CFG_SET_THEORYParser.ElementStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementString}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementString(CFG_SET_THEORYParser.ElementStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementTuple}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementTuple(CFG_SET_THEORYParser.ElementTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementTuple}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementTuple(CFG_SET_THEORYParser.ElementTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementParameter}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementParameter(CFG_SET_THEORYParser.ElementParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementParameter}
	 * labeled alternative in {@link CFG_SET_THEORYParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementParameter(CFG_SET_THEORYParser.ElementParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleSuchThatExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#tupleCollection}.
	 * @param ctx the parse tree
	 */
	void enterTupleSuchThatExpr(CFG_SET_THEORYParser.TupleSuchThatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleSuchThatExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#tupleCollection}.
	 * @param ctx the parse tree
	 */
	void exitTupleSuchThatExpr(CFG_SET_THEORYParser.TupleSuchThatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpr(CFG_SET_THEORYParser.TupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpr(CFG_SET_THEORYParser.TupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyTupleExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTupleExpr(CFG_SET_THEORYParser.EmptyTupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyTupleExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTupleExpr(CFG_SET_THEORYParser.EmptyTupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableTupleExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void enterVariableTupleExpr(CFG_SET_THEORYParser.VariableTupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableTupleExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void exitVariableTupleExpr(CFG_SET_THEORYParser.VariableTupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyVariableTupleExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void enterEmptyVariableTupleExpr(CFG_SET_THEORYParser.EmptyVariableTupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyVariableTupleExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void exitEmptyVariableTupleExpr(CFG_SET_THEORYParser.EmptyVariableTupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableTupleFixedValuesExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 */
	void enterVariableTupleFixedValuesExpr(CFG_SET_THEORYParser.VariableTupleFixedValuesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableTupleFixedValuesExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 */
	void exitVariableTupleFixedValuesExpr(CFG_SET_THEORYParser.VariableTupleFixedValuesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyVariableTupleFixedValuesExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 */
	void enterEmptyVariableTupleFixedValuesExpr(CFG_SET_THEORYParser.EmptyVariableTupleFixedValuesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyVariableTupleFixedValuesExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 */
	void exitEmptyVariableTupleFixedValuesExpr(CFG_SET_THEORYParser.EmptyVariableTupleFixedValuesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleDefinitionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#tupleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTupleDefinitionExpr(CFG_SET_THEORYParser.TupleDefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleDefinitionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#tupleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTupleDefinitionExpr(CFG_SET_THEORYParser.TupleDefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementDefImplicitSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void enterElementDefImplicitSetExpr(CFG_SET_THEORYParser.ElementDefImplicitSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementDefImplicitSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void exitElementDefImplicitSetExpr(CFG_SET_THEORYParser.ElementDefImplicitSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementDefSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void enterElementDefSetSymbolExpr(CFG_SET_THEORYParser.ElementDefSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementDefSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void exitElementDefSetSymbolExpr(CFG_SET_THEORYParser.ElementDefSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementDefRangeExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void enterElementDefRangeExpr(CFG_SET_THEORYParser.ElementDefRangeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementDefRangeExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#elementDefinition}.
	 * @param ctx the parse tree
	 */
	void exitElementDefRangeExpr(CFG_SET_THEORYParser.ElementDefRangeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defWithImplicitSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDefWithImplicitSetExpr(CFG_SET_THEORYParser.DefWithImplicitSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defWithImplicitSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDefWithImplicitSetExpr(CFG_SET_THEORYParser.DefWithImplicitSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defCollectionWithImplicitSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDefCollectionWithImplicitSetExpr(CFG_SET_THEORYParser.DefCollectionWithImplicitSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defCollectionWithImplicitSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDefCollectionWithImplicitSetExpr(CFG_SET_THEORYParser.DefCollectionWithImplicitSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defWithSymbolSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 */
	void enterDefWithSymbolSetExpr(CFG_SET_THEORYParser.DefWithSymbolSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defWithSymbolSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 */
	void exitDefWithSymbolSetExpr(CFG_SET_THEORYParser.DefWithSymbolSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defCollectionWithSymbolSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 */
	void enterDefCollectionWithSymbolSetExpr(CFG_SET_THEORYParser.DefCollectionWithSymbolSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defCollectionWithSymbolSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 */
	void exitDefCollectionWithSymbolSetExpr(CFG_SET_THEORYParser.DefCollectionWithSymbolSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defWithRangeExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithRange}.
	 * @param ctx the parse tree
	 */
	void enterDefWithRangeExpr(CFG_SET_THEORYParser.DefWithRangeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defWithRangeExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithRange}.
	 * @param ctx the parse tree
	 */
	void exitDefWithRangeExpr(CFG_SET_THEORYParser.DefWithRangeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defCollectionWithRangeExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithRange}.
	 * @param ctx the parse tree
	 */
	void enterDefCollectionWithRangeExpr(CFG_SET_THEORYParser.DefCollectionWithRangeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defCollectionWithRangeExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#definitionWithRange}.
	 * @param ctx the parse tree
	 */
	void exitDefCollectionWithRangeExpr(CFG_SET_THEORYParser.DefCollectionWithRangeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpr(CFG_SET_THEORYParser.RangeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpr(CFG_SET_THEORYParser.RangeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#booleanSymbol}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(CFG_SET_THEORYParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#booleanSymbol}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(CFG_SET_THEORYParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#booleanSymbol}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(CFG_SET_THEORYParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#booleanSymbol}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(CFG_SET_THEORYParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#numberSymbol}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpr(CFG_SET_THEORYParser.IntegerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#numberSymbol}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpr(CFG_SET_THEORYParser.IntegerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#numberSymbol}.
	 * @param ctx the parse tree
	 */
	void enterRealExpr(CFG_SET_THEORYParser.RealExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#numberSymbol}.
	 * @param ctx the parse tree
	 */
	void exitRealExpr(CFG_SET_THEORYParser.RealExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#emptySetSymbol}.
	 * @param ctx the parse tree
	 */
	void enterEmptySetSymbol(CFG_SET_THEORYParser.EmptySetSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#emptySetSymbol}.
	 * @param ctx the parse tree
	 */
	void exitEmptySetSymbol(CFG_SET_THEORYParser.EmptySetSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#emptyTupleSymbol}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTupleSymbol(CFG_SET_THEORYParser.EmptyTupleSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#emptyTupleSymbol}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTupleSymbol(CFG_SET_THEORYParser.EmptyTupleSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperationExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperationResult}.
	 * @param ctx the parse tree
	 */
	void enterSetOperationExpr(CFG_SET_THEORYParser.SetOperationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperationExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperationResult}.
	 * @param ctx the parse tree
	 */
	void exitSetOperationExpr(CFG_SET_THEORYParser.SetOperationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperationTerm}.
	 * @param ctx the parse tree
	 */
	void enterOperationSetExpr(CFG_SET_THEORYParser.OperationSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationSetExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperationTerm}.
	 * @param ctx the parse tree
	 */
	void exitOperationSetExpr(CFG_SET_THEORYParser.OperationSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperationParExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperationTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperationParExpr(CFG_SET_THEORYParser.SetOperationParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperationParExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperationTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperationParExpr(CFG_SET_THEORYParser.SetOperationParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperationParenthesisExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperationExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetOperationParenthesisExpr(CFG_SET_THEORYParser.SetOperationParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperationParenthesisExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperationExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetOperationParenthesisExpr(CFG_SET_THEORYParser.SetOperationParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationSetDefinitionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#operationSet}.
	 * @param ctx the parse tree
	 */
	void enterOperationSetDefinitionExpr(CFG_SET_THEORYParser.OperationSetDefinitionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationSetDefinitionExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#operationSet}.
	 * @param ctx the parse tree
	 */
	void exitOperationSetDefinitionExpr(CFG_SET_THEORYParser.OperationSetDefinitionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#operationSet}.
	 * @param ctx the parse tree
	 */
	void enterOperationSetSymbolExpr(CFG_SET_THEORYParser.OperationSetSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationSetSymbolExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#operationSet}.
	 * @param ctx the parse tree
	 */
	void exitOperationSetSymbolExpr(CFG_SET_THEORYParser.OperationSetSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inOperatorExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#belongsToOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperatorExpr(CFG_SET_THEORYParser.InOperatorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inOperatorExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#belongsToOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperatorExpr(CFG_SET_THEORYParser.InOperatorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notInOperatorExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#belongsToOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotInOperatorExpr(CFG_SET_THEORYParser.NotInOperatorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notInOperatorExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#belongsToOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotInOperatorExpr(CFG_SET_THEORYParser.NotInOperatorExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperator(CFG_SET_THEORYParser.InOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperator(CFG_SET_THEORYParser.InOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#notInOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotInOperator(CFG_SET_THEORYParser.NotInOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#notInOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotInOperator(CFG_SET_THEORYParser.NotInOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cartesianProductOpExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProductOpExpr(CFG_SET_THEORYParser.CartesianProductOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cartesianProductOpExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProductOpExpr(CFG_SET_THEORYParser.CartesianProductOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionOpExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnionOpExpr(CFG_SET_THEORYParser.UnionOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionOpExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnionOpExpr(CFG_SET_THEORYParser.UnionOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intersectionOpExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionOpExpr(CFG_SET_THEORYParser.IntersectionOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intersectionOpExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionOpExpr(CFG_SET_THEORYParser.IntersectionOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code differenceOpExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void enterDifferenceOpExpr(CFG_SET_THEORYParser.DifferenceOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code differenceOpExpr}
	 * labeled alternative in {@link CFG_SET_THEORYParser#setOperator}.
	 * @param ctx the parse tree
	 */
	void exitDifferenceOpExpr(CFG_SET_THEORYParser.DifferenceOpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#cartesianProductOperator}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProductOperator(CFG_SET_THEORYParser.CartesianProductOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#cartesianProductOperator}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProductOperator(CFG_SET_THEORYParser.CartesianProductOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#unionOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnionOperator(CFG_SET_THEORYParser.UnionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#unionOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnionOperator(CFG_SET_THEORYParser.UnionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#intersectionOperator}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionOperator(CFG_SET_THEORYParser.IntersectionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#intersectionOperator}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionOperator(CFG_SET_THEORYParser.IntersectionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#setdifferenceOperator}.
	 * @param ctx the parse tree
	 */
	void enterSetdifferenceOperator(CFG_SET_THEORYParser.SetdifferenceOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#setdifferenceOperator}.
	 * @param ctx the parse tree
	 */
	void exitSetdifferenceOperator(CFG_SET_THEORYParser.SetdifferenceOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#modelSignature}.
	 * @param ctx the parse tree
	 */
	void enterModelSignature(CFG_SET_THEORYParser.ModelSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#modelSignature}.
	 * @param ctx the parse tree
	 */
	void exitModelSignature(CFG_SET_THEORYParser.ModelSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#modelSymbol}.
	 * @param ctx the parse tree
	 */
	void enterModelSymbol(CFG_SET_THEORYParser.ModelSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#modelSymbol}.
	 * @param ctx the parse tree
	 */
	void exitModelSymbol(CFG_SET_THEORYParser.ModelSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CFG_SET_THEORYParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CFG_SET_THEORYParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CFG_SET_THEORYParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CFG_SET_THEORYParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CFG_SET_THEORYParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CFG_SET_THEORYParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#variableFixedValues}.
	 * @param ctx the parse tree
	 */
	void enterVariableFixedValues(CFG_SET_THEORYParser.VariableFixedValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#variableFixedValues}.
	 * @param ctx the parse tree
	 */
	void exitVariableFixedValues(CFG_SET_THEORYParser.VariableFixedValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(CFG_SET_THEORYParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(CFG_SET_THEORYParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#datatypeSymbol}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeSymbol(CFG_SET_THEORYParser.DatatypeSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#datatypeSymbol}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeSymbol(CFG_SET_THEORYParser.DatatypeSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#trueSymbol}.
	 * @param ctx the parse tree
	 */
	void enterTrueSymbol(CFG_SET_THEORYParser.TrueSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#trueSymbol}.
	 * @param ctx the parse tree
	 */
	void exitTrueSymbol(CFG_SET_THEORYParser.TrueSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#falseSymbol}.
	 * @param ctx the parse tree
	 */
	void enterFalseSymbol(CFG_SET_THEORYParser.FalseSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#falseSymbol}.
	 * @param ctx the parse tree
	 */
	void exitFalseSymbol(CFG_SET_THEORYParser.FalseSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#integerSymbol}.
	 * @param ctx the parse tree
	 */
	void enterIntegerSymbol(CFG_SET_THEORYParser.IntegerSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#integerSymbol}.
	 * @param ctx the parse tree
	 */
	void exitIntegerSymbol(CFG_SET_THEORYParser.IntegerSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#realSymbol}.
	 * @param ctx the parse tree
	 */
	void enterRealSymbol(CFG_SET_THEORYParser.RealSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#realSymbol}.
	 * @param ctx the parse tree
	 */
	void exitRealSymbol(CFG_SET_THEORYParser.RealSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#infinitySymbol}.
	 * @param ctx the parse tree
	 */
	void enterInfinitySymbol(CFG_SET_THEORYParser.InfinitySymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#infinitySymbol}.
	 * @param ctx the parse tree
	 */
	void exitInfinitySymbol(CFG_SET_THEORYParser.InfinitySymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFG_SET_THEORYParser#stringSymbol}.
	 * @param ctx the parse tree
	 */
	void enterStringSymbol(CFG_SET_THEORYParser.StringSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFG_SET_THEORYParser#stringSymbol}.
	 * @param ctx the parse tree
	 */
	void exitStringSymbol(CFG_SET_THEORYParser.StringSymbolContext ctx);
}