// Generated from CFG_DEVS_MODEL.g4 by ANTLR 4.9.2
package rules;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CFG_DEVS_MODELParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CFG_DEVS_MODELVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#devsSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevsSpecification(CFG_DEVS_MODELParser.DevsSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#devsModel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevsModel(CFG_DEVS_MODELParser.DevsModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#setInModel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetInModel(CFG_DEVS_MODELParser.SetInModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#atomicModel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicModel(CFG_DEVS_MODELParser.AtomicModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#atomicModelTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicModelTuple(CFG_DEVS_MODELParser.AtomicModelTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#coupledModel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoupledModel(CFG_DEVS_MODELParser.CoupledModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#coupledModelTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoupledModelTuple(CFG_DEVS_MODELParser.CoupledModelTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#modelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelDefinition(CFG_DEVS_MODELParser.ModelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#modelSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelSentence(CFG_DEVS_MODELParser.ModelSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CFG_DEVS_MODELParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#delExtFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelExtFunction(CFG_DEVS_MODELParser.DelExtFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#delExtFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelExtFunctionName(CFG_DEVS_MODELParser.DelExtFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#delIntFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelIntFunction(CFG_DEVS_MODELParser.DelIntFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#delIntFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelIntFunctionName(CFG_DEVS_MODELParser.DelIntFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#lambdaFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunction(CFG_DEVS_MODELParser.LambdaFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#lambdaFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunctionName(CFG_DEVS_MODELParser.LambdaFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#taFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaFunction(CFG_DEVS_MODELParser.TaFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#taFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaFunctionName(CFG_DEVS_MODELParser.TaFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#selectFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunction(CFG_DEVS_MODELParser.SelectFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#selectFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionName(CFG_DEVS_MODELParser.SelectFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDescription(CFG_DEVS_MODELParser.FunctionDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionDescriptionPreIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDescriptionPreIf(CFG_DEVS_MODELParser.FunctionDescriptionPreIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionPreIfConditionalResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#functionPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPreIfConditionalResult(CFG_DEVS_MODELParser.FunctionPreIfConditionalResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionPreIfDefaultResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#functionPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPreIfDefaultResult(CFG_DEVS_MODELParser.FunctionPreIfDefaultResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionDescriptionPostIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDescriptionPostIf(CFG_DEVS_MODELParser.FunctionDescriptionPostIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionPostIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPostIfResult(CFG_DEVS_MODELParser.FunctionPostIfResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionGenericDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionGenericDescription(CFG_DEVS_MODELParser.FunctionGenericDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionDescriptionAssignmentPreIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDescriptionAssignmentPreIf(CFG_DEVS_MODELParser.FunctionDescriptionAssignmentPreIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionDescriptionAssignmentPostIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDescriptionAssignmentPostIf(CFG_DEVS_MODELParser.FunctionDescriptionAssignmentPostIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionAssignPreIfConditionalResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#functionAssignPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAssignPreIfConditionalResult(CFG_DEVS_MODELParser.FunctionAssignPreIfConditionalResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionAssignPreIfDefaultResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#functionAssignPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAssignPreIfDefaultResult(CFG_DEVS_MODELParser.FunctionAssignPreIfDefaultResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionAssignPostIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAssignPostIfResult(CFG_DEVS_MODELParser.FunctionAssignPostIfResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionGenericValuesDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionGenericValuesDescription(CFG_DEVS_MODELParser.FunctionGenericValuesDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionDescriptionValuesAssignmentPreIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDescriptionValuesAssignmentPreIf(CFG_DEVS_MODELParser.FunctionDescriptionValuesAssignmentPreIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionDescriptionValuesAssignmentPostIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDescriptionValuesAssignmentPostIf(CFG_DEVS_MODELParser.FunctionDescriptionValuesAssignmentPostIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionValuesAssignPreIfConditionalResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#functionValuesAssignPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValuesAssignPreIfConditionalResult(CFG_DEVS_MODELParser.FunctionValuesAssignPreIfConditionalResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionValuesAssignPreIfDefaultResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#functionValuesAssignPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValuesAssignPreIfDefaultResult(CFG_DEVS_MODELParser.FunctionValuesAssignPreIfDefaultResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#functionValuesAssignPostIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValuesAssignPostIfResult(CFG_DEVS_MODELParser.FunctionValuesAssignPostIfResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#tupleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleValue(CFG_DEVS_MODELParser.TupleValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CFG_DEVS_MODELParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#taFunctionDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaFunctionDescription(CFG_DEVS_MODELParser.TaFunctionDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#taFunctionDescriptionPreIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaFunctionDescriptionPreIf(CFG_DEVS_MODELParser.TaFunctionDescriptionPreIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code taFunctionPreIfConditionalResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#taFunctionPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaFunctionPreIfConditionalResult(CFG_DEVS_MODELParser.TaFunctionPreIfConditionalResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code taFunctionPreIfDefaultResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#taFunctionPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaFunctionPreIfDefaultResult(CFG_DEVS_MODELParser.TaFunctionPreIfDefaultResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#taFunctionDescriptionPostIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaFunctionDescriptionPostIf(CFG_DEVS_MODELParser.TaFunctionDescriptionPostIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#taFunctionPostIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaFunctionPostIfResult(CFG_DEVS_MODELParser.TaFunctionPostIfResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#taFunctionGenericDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaFunctionGenericDescription(CFG_DEVS_MODELParser.TaFunctionGenericDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#taAssignPreIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaAssignPreIf(CFG_DEVS_MODELParser.TaAssignPreIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code taAssignPreIfConditionalResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#taAssignPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaAssignPreIfConditionalResult(CFG_DEVS_MODELParser.TaAssignPreIfConditionalResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code taAssignPreIfDefaultResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#taAssignPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaAssignPreIfDefaultResult(CFG_DEVS_MODELParser.TaAssignPreIfDefaultResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#taAssignPostIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaAssignPostIf(CFG_DEVS_MODELParser.TaAssignPostIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#taAssignPostIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaAssignPostIfResult(CFG_DEVS_MODELParser.TaAssignPostIfResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#selectFunctionDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionDescription(CFG_DEVS_MODELParser.SelectFunctionDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#selectFunctionDescriptionPreIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionDescriptionPreIf(CFG_DEVS_MODELParser.SelectFunctionDescriptionPreIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectFunctionPreIfConditionalResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#selectFunctionPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionPreIfConditionalResult(CFG_DEVS_MODELParser.SelectFunctionPreIfConditionalResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectFunctionPreIfDefaultResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#selectFunctionPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionPreIfDefaultResult(CFG_DEVS_MODELParser.SelectFunctionPreIfDefaultResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#selectFunctionDescriptionPostIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionDescriptionPostIf(CFG_DEVS_MODELParser.SelectFunctionDescriptionPostIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#selectFunctionPostIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionPostIfResult(CFG_DEVS_MODELParser.SelectFunctionPostIfResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#selectFunctionGenericDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionGenericDescription(CFG_DEVS_MODELParser.SelectFunctionGenericDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#selectAssignPreIfList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAssignPreIfList(CFG_DEVS_MODELParser.SelectAssignPreIfListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAssignPreIfIdentifierConditionalResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#selectAssignPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAssignPreIfIdentifierConditionalResult(CFG_DEVS_MODELParser.SelectAssignPreIfIdentifierConditionalResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAssignPreIfParameterConditionalResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#selectAssignPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAssignPreIfParameterConditionalResult(CFG_DEVS_MODELParser.SelectAssignPreIfParameterConditionalResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAssignPreIfIdentifierDefaultResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#selectAssignPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAssignPreIfIdentifierDefaultResult(CFG_DEVS_MODELParser.SelectAssignPreIfIdentifierDefaultResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAssignPreIfParameterDefaultResult}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#selectAssignPreIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAssignPreIfParameterDefaultResult(CFG_DEVS_MODELParser.SelectAssignPreIfParameterDefaultResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#selectAssignPostIfList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAssignPostIfList(CFG_DEVS_MODELParser.SelectAssignPostIfListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#selectAssignPostIfResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAssignPostIfResult(CFG_DEVS_MODELParser.SelectAssignPostIfResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#assignIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignIdentifier(CFG_DEVS_MODELParser.AssignIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#assignParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignParameter(CFG_DEVS_MODELParser.AssignParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#assignValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignValue(CFG_DEVS_MODELParser.AssignValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#assignTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignTuple(CFG_DEVS_MODELParser.AssignTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#assignElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignElement(CFG_DEVS_MODELParser.AssignElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#assignmentsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentsList(CFG_DEVS_MODELParser.AssignmentsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#modelSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelSignature(CFG_DEVS_MODELParser.ModelSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#modelSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelSymbol(CFG_DEVS_MODELParser.ModelSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CFG_DEVS_MODELParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CFG_DEVS_MODELParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CFG_DEVS_MODELParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#variableFixedValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFixedValues(CFG_DEVS_MODELParser.VariableFixedValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(CFG_DEVS_MODELParser.ParametersListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#datatypeSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeSymbol(CFG_DEVS_MODELParser.DatatypeSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#trueSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueSymbol(CFG_DEVS_MODELParser.TrueSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#falseSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseSymbol(CFG_DEVS_MODELParser.FalseSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#integerSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerSymbol(CFG_DEVS_MODELParser.IntegerSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#realSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealSymbol(CFG_DEVS_MODELParser.RealSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#infinitySymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfinitySymbol(CFG_DEVS_MODELParser.InfinitySymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#stringSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringSymbol(CFG_DEVS_MODELParser.StringSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rootIfThen}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootIfThen(CFG_DEVS_MODELParser.RootIfThenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rootIf}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootIf(CFG_DEVS_MODELParser.RootIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rootBooleanExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootBooleanExpr(CFG_DEVS_MODELParser.RootBooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifConditionExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionExpr(CFG_DEVS_MODELParser.IfConditionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifConditionParExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionParExpr(CFG_DEVS_MODELParser.IfConditionParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifConditionDefaultExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionDefaultExpr(CFG_DEVS_MODELParser.IfConditionDefaultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#ifThenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenExpr(CFG_DEVS_MODELParser.IfThenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenParExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#ifThenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenParExpr(CFG_DEVS_MODELParser.IfThenParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryConditionExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryConditionExpr(CFG_DEVS_MODELParser.BinaryConditionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanTermExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTermExpr(CFG_DEVS_MODELParser.BooleanTermExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#binaryCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(CFG_DEVS_MODELParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalTermExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanExpressionTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalTermExpr(CFG_DEVS_MODELParser.RelationalTermExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryTermExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanExpressionTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryTermExpr(CFG_DEVS_MODELParser.UnaryTermExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryCondExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#unaryCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryCondExpr(CFG_DEVS_MODELParser.UnaryCondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#relationalExpressionTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(CFG_DEVS_MODELParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicElementExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanExpressionBasicTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicElementExpr(CFG_DEVS_MODELParser.BasicElementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicParenthesisExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanExpressionBasicTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicParenthesisExpr(CFG_DEVS_MODELParser.BasicParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanExpressionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpr(CFG_DEVS_MODELParser.ElementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementDefinitionExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanExpressionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementDefinitionExpr(CFG_DEVS_MODELParser.ElementDefinitionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infinityExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanExpressionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfinityExpr(CFG_DEVS_MODELParser.InfinityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanExpressionResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpr(CFG_DEVS_MODELParser.ParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionInfinity}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#actionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionInfinity(CFG_DEVS_MODELParser.ActionInfinityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionElement}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#actionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionElement(CFG_DEVS_MODELParser.ActionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionElementDefinition}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#actionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionElementDefinition(CFG_DEVS_MODELParser.ActionElementDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#ifSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSymbol(CFG_DEVS_MODELParser.IfSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#inOtherCaseSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOtherCaseSymbol(CFG_DEVS_MODELParser.InOtherCaseSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#unaryConditionalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryConditionalOperator(CFG_DEVS_MODELParser.UnaryConditionalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#binaryConditionalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryConditionalOperator(CFG_DEVS_MODELParser.BinaryConditionalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#binaryRelationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryRelationalOperator(CFG_DEVS_MODELParser.BinaryRelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#notOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator(CFG_DEVS_MODELParser.NotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#andOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperator(CFG_DEVS_MODELParser.AndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#orOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(CFG_DEVS_MODELParser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#equalToOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualToOperator(CFG_DEVS_MODELParser.EqualToOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#notEqualToOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualToOperator(CFG_DEVS_MODELParser.NotEqualToOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#greaterThanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOperator(CFG_DEVS_MODELParser.GreaterThanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#lessThanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOperator(CFG_DEVS_MODELParser.LessThanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#greaterThanOrEqualToOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqualToOperator(CFG_DEVS_MODELParser.GreaterThanOrEqualToOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#lessThanOrEqualToOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqualToOperator(CFG_DEVS_MODELParser.LessThanOrEqualToOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setImplicitDefinitionExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetImplicitDefinitionExpr(CFG_DEVS_MODELParser.SetImplicitDefinitionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setExplicitDefinitionExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExplicitDefinitionExpr(CFG_DEVS_MODELParser.SetExplicitDefinitionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setDefinitionExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDefinitionExpr(CFG_DEVS_MODELParser.SetDefinitionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperationResultExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setImplicitDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperationResultExpr(CFG_DEVS_MODELParser.SetOperationResultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setAssignmentExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setExplicitDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentExpr(CFG_DEVS_MODELParser.SetAssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementCollectionExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCollectionExpr(CFG_DEVS_MODELParser.ElementCollectionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tupleCollectionExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleCollectionExpr(CFG_DEVS_MODELParser.TupleCollectionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNameSymbolExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNameSymbolExpr(CFG_DEVS_MODELParser.SetNameSymbolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerSetSymbolExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerSetSymbolExpr(CFG_DEVS_MODELParser.IntegerSetSymbolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code naturalSetSymbolExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalSetSymbolExpr(CFG_DEVS_MODELParser.NaturalSetSymbolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realSetSymbolExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealSetSymbolExpr(CFG_DEVS_MODELParser.RealSetSymbolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanSetSymbolExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanSetSymbolExpr(CFG_DEVS_MODELParser.BooleanSetSymbolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#setName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetName(CFG_DEVS_MODELParser.SetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#setOfIntegerNumbersSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOfIntegerNumbersSymbol(CFG_DEVS_MODELParser.SetOfIntegerNumbersSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#setOfNaturalNumbersSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOfNaturalNumbersSymbol(CFG_DEVS_MODELParser.SetOfNaturalNumbersSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#setOfRealNumbersSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOfRealNumbersSymbol(CFG_DEVS_MODELParser.SetOfRealNumbersSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#setOfBooleanAlgebraSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOfBooleanAlgebraSymbol(CFG_DEVS_MODELParser.SetOfBooleanAlgebraSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementListExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#elementCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementListExpr(CFG_DEVS_MODELParser.ElementListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementSuchThatExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#elementCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementSuchThatExpr(CFG_DEVS_MODELParser.ElementSuchThatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptySetExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#elementCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptySetExpr(CFG_DEVS_MODELParser.EmptySetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementIdentifier}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementIdentifier(CFG_DEVS_MODELParser.ElementIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementNumber}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementNumber(CFG_DEVS_MODELParser.ElementNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementBoolean}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementBoolean(CFG_DEVS_MODELParser.ElementBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementModelSignature}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementModelSignature(CFG_DEVS_MODELParser.ElementModelSignatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementString}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementString(CFG_DEVS_MODELParser.ElementStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementTuple}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementTuple(CFG_DEVS_MODELParser.ElementTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementParameter}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementParameter(CFG_DEVS_MODELParser.ElementParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tupleSuchThatExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#tupleCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleSuchThatExpr(CFG_DEVS_MODELParser.TupleSuchThatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tupleExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpr(CFG_DEVS_MODELParser.TupleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyTupleExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyTupleExpr(CFG_DEVS_MODELParser.EmptyTupleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableTupleExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#variableTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTupleExpr(CFG_DEVS_MODELParser.VariableTupleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyVariableTupleExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#variableTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyVariableTupleExpr(CFG_DEVS_MODELParser.EmptyVariableTupleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableTupleFixedValuesExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTupleFixedValuesExpr(CFG_DEVS_MODELParser.VariableTupleFixedValuesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyVariableTupleFixedValuesExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#variableTupleFixedValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyVariableTupleFixedValuesExpr(CFG_DEVS_MODELParser.EmptyVariableTupleFixedValuesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tupleDefinitionExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#tupleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleDefinitionExpr(CFG_DEVS_MODELParser.TupleDefinitionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementDefImplicitSetExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#elementDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementDefImplicitSetExpr(CFG_DEVS_MODELParser.ElementDefImplicitSetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementDefSetSymbolExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#elementDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementDefSetSymbolExpr(CFG_DEVS_MODELParser.ElementDefSetSymbolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementDefRangeExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#elementDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementDefRangeExpr(CFG_DEVS_MODELParser.ElementDefRangeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defWithImplicitSetExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefWithImplicitSetExpr(CFG_DEVS_MODELParser.DefWithImplicitSetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defCollectionWithImplicitSetExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#definitionWithSetImplicitDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefCollectionWithImplicitSetExpr(CFG_DEVS_MODELParser.DefCollectionWithImplicitSetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defWithSymbolSetExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefWithSymbolSetExpr(CFG_DEVS_MODELParser.DefWithSymbolSetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defCollectionWithSymbolSetExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#definitionWithSetSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefCollectionWithSymbolSetExpr(CFG_DEVS_MODELParser.DefCollectionWithSymbolSetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defWithRangeExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#definitionWithRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefWithRangeExpr(CFG_DEVS_MODELParser.DefWithRangeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defCollectionWithRangeExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#definitionWithRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefCollectionWithRangeExpr(CFG_DEVS_MODELParser.DefCollectionWithRangeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpr(CFG_DEVS_MODELParser.RangeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(CFG_DEVS_MODELParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#booleanSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(CFG_DEVS_MODELParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#numberSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpr(CFG_DEVS_MODELParser.IntegerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#numberSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealExpr(CFG_DEVS_MODELParser.RealExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#emptySetSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptySetSymbol(CFG_DEVS_MODELParser.EmptySetSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#emptyTupleSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyTupleSymbol(CFG_DEVS_MODELParser.EmptyTupleSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperationExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setOperationResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperationExpr(CFG_DEVS_MODELParser.SetOperationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operationSetExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setOperationTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationSetExpr(CFG_DEVS_MODELParser.OperationSetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperationParExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setOperationTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperationParExpr(CFG_DEVS_MODELParser.SetOperationParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperationParenthesisExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setOperationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperationParenthesisExpr(CFG_DEVS_MODELParser.SetOperationParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operationSetDefinitionExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#operationSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationSetDefinitionExpr(CFG_DEVS_MODELParser.OperationSetDefinitionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operationSetSymbolExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#operationSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationSetSymbolExpr(CFG_DEVS_MODELParser.OperationSetSymbolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inOperatorExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#belongsToOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOperatorExpr(CFG_DEVS_MODELParser.InOperatorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notInOperatorExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#belongsToOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInOperatorExpr(CFG_DEVS_MODELParser.NotInOperatorExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#inOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOperator(CFG_DEVS_MODELParser.InOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#notInOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInOperator(CFG_DEVS_MODELParser.NotInOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cartesianProductOpExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianProductOpExpr(CFG_DEVS_MODELParser.CartesianProductOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionOpExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionOpExpr(CFG_DEVS_MODELParser.UnionOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intersectionOpExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectionOpExpr(CFG_DEVS_MODELParser.IntersectionOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code differenceOpExpr}
	 * labeled alternative in {@link CFG_DEVS_MODELParser#setOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferenceOpExpr(CFG_DEVS_MODELParser.DifferenceOpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#cartesianProductOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianProductOperator(CFG_DEVS_MODELParser.CartesianProductOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#unionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionOperator(CFG_DEVS_MODELParser.UnionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#intersectionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectionOperator(CFG_DEVS_MODELParser.IntersectionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#setdifferenceOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetdifferenceOperator(CFG_DEVS_MODELParser.SetdifferenceOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpression(CFG_DEVS_MODELParser.MathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#binaryMathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMathExpression(CFG_DEVS_MODELParser.BinaryMathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#mathExpressionTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionTerm(CFG_DEVS_MODELParser.MathExpressionTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#unaryMathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMathExpression(CFG_DEVS_MODELParser.UnaryMathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#mathTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathTerm(CFG_DEVS_MODELParser.MathTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#mathFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathFactor(CFG_DEVS_MODELParser.MathFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#mathExpressionBasicTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionBasicTerm(CFG_DEVS_MODELParser.MathExpressionBasicTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#mathExpressionElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionElement(CFG_DEVS_MODELParser.MathExpressionElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#mathExpressionResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionResult(CFG_DEVS_MODELParser.MathExpressionResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#unaryMathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMathOperator(CFG_DEVS_MODELParser.UnaryMathOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#binaryMathOperatorLowerPrecedence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMathOperatorLowerPrecedence(CFG_DEVS_MODELParser.BinaryMathOperatorLowerPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#binaryMathOperatorHigherPrecedence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMathOperatorHigherPrecedence(CFG_DEVS_MODELParser.BinaryMathOperatorHigherPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#sqrtOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtOperator(CFG_DEVS_MODELParser.SqrtOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#additionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionOperator(CFG_DEVS_MODELParser.AdditionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#substractionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstractionOperator(CFG_DEVS_MODELParser.SubstractionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#multiplicationOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationOperator(CFG_DEVS_MODELParser.MultiplicationOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#divisionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionOperator(CFG_DEVS_MODELParser.DivisionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFG_DEVS_MODELParser#powerOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerOperator(CFG_DEVS_MODELParser.PowerOperatorContext ctx);
}