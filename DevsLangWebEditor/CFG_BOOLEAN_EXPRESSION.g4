grammar CFG_BOOLEAN_EXPRESSION;



import CFG_TOKENS, CFG_SET_THEORY;

/* ----- Root ----- */
root
    : ifThenCondition EOF                     # rootIfThen
    | ifCondition EOF                         # rootIf
    | booleanExpression EOF                   # rootBooleanExpr
    ;

/* ----- Control structures ----- */
ifCondition
    : ifSymbol booleanExpression
        # ifConditionExpr

    | ifSymbol BEGINPARENTHESES booleanExpression ENDPARENTHESES
        # ifConditionParExpr

    | inOtherCaseSymbol
        # ifConditionDefaultExpr
    ;
/*
 * Sintaxis soportada:
 *   \if <cond> \then
 *   \if (<cond>) \then
 */
ifThenCondition
    : ifSymbol booleanExpression THENSYMBOL 		# ifThenExpr
    | ifSymbol BEGINPARENTHESES booleanExpression ENDPARENTHESES THENSYMBOL	# ifThenParExpr
    ;

/* ----- Boolean expressions ----- */
booleanExpression
    : bc=binaryCondition                                   # binaryConditionExpr
    | bt=booleanExpressionTerm                             # booleanTermExpr
    ;

binaryCondition
    : left=booleanExpressionTerm
      (binaryConditionalOperator right=booleanExpressionTerm)* # binaryExpr
    ;

/* ----- Boolean terms ----- */
booleanExpressionTerm
    : rt=relationalExpressionTerm                          # relationalTermExpr
    | uc=unaryCondition                                    # unaryTermExpr
    ;

/* ----- Unary conditions ----- */
unaryCondition
    : op=unaryConditionalOperator expr=booleanExpressionTerm # unaryCondExpr
    ;

/* ----- Relational expressions ----- */
relationalExpressionTerm
    : left=booleanExpressionBasicTerm
      (op=binaryRelationalOperator right=booleanExpressionBasicTerm)* # relationalExpr
    ;

/* ----- Basic terms ----- */
booleanExpressionBasicTerm
    : el=booleanExpressionElement                          # basicElementExpr
    | res=booleanExpressionResult                          # basicParenthesisExpr
    ;

/* ----- Elements ----- */
booleanExpressionElement
    : el=element                                           # elementExpr
    | el=elementDefinition                                 # elementDefinitionExpr
    | infinitySymbol                                       # infinityExpr
    ;

/* ----- Parenthesis expressions (BOOLEAN) ----- */
booleanExpressionResult
    : BEGINPARENTHESES expr=booleanExpression ENDPARENTHESES  # parenthesisExpr
    ;

/* ----- Action expressions for THEN/DEFAULT ----- */
actionExpression
    : infinitySymbol                                       # actionInfinity
    | element                                              # actionElement
    | elementDefinition                                    # actionElementDefinition
    ;

/* ----- Special elements to be used in a conditional expression ----- */
ifSymbol: IFSYMBOL;
inOtherCaseSymbol: INOTHERCASESYMBOL | OTHERWISESYMBOL;

/* ----- Operators ----- */
unaryConditionalOperator: notOperator;

binaryConditionalOperator: andOperator | orOperator;

binaryRelationalOperator
    : equalToOperator
    | notEqualToOperator
    | greaterThanOperator
    | lessThanOperator
    | greaterThanOrEqualToOperator
    | lessThanOrEqualToOperator
    ;

/* ----- Concrete operator tokens ----- */
notOperator: NOTOPERATOR;
andOperator: ANDOPERATOR;
orOperator: OROPERATOR;

equalToOperator: EQUALTOOPERATOR;
notEqualToOperator: NOTEQUALTOOPERATOR;
greaterThanOperator: GREATERTHANOPERATOR;
lessThanOperator: LESSTHANOPERATOR;
greaterThanOrEqualToOperator: GREATERTHANOREQUALTOOPERATOR;
lessThanOrEqualToOperator: LESSTHANOREQUALTOOPERATOR;