//-------------------------------------------------------------------------------------------------------------------------------------------
// Defining the math expression grammar with labels for EMF mapping
//-------------------------------------------------------------------------------------------------------------------------------------------

grammar CFG_MATH_EXPRESSION;


import CFG_TOKENS, CFG_SET_THEORY;

/* ----- Mathematical expressions ----- */
mathExpression
    : binaryMathExpression
    | mathExpressionTerm
    ;

binaryMathExpression
    : left=mathExpressionTerm op=binaryMathOperatorLowerPrecedence right=mathExpressionTerm
    ;

mathExpressionTerm
    : mathTerm
    | unaryMathExpression
    ;

unaryMathExpression
    : op=unaryMathOperator operand=mathExpressionTerm
    ;

mathTerm
    : left=mathFactor (op=binaryMathOperatorHigherPrecedence right=mathFactor)*
    ;

mathFactor
    : left=mathExpressionBasicTerm (op=powerOperator right=mathExpressionBasicTerm)*
    ;

mathExpressionBasicTerm
    : mathExpressionElement
    | mathExpressionResult
    ;

mathExpressionElement
    : el=element
    ;

mathExpressionResult
    : BEGINPARENTHESES inner=mathExpression ENDPARENTHESES
    ;

/* ----- Operators ----- */
unaryMathOperator
    : sqrtOperator
    ;

binaryMathOperatorLowerPrecedence
    : additionOperator
    | substractionOperator
    ;

binaryMathOperatorHigherPrecedence
    : multiplicationOperator
    | divisionOperator
    ;

sqrtOperator
    : SQRTOPERATOR
    ;

additionOperator
    : ADDITIONOPERATOR
    ;

substractionOperator
    : SUBSTRACTIONOPERATOR
    ;

multiplicationOperator
    : MULTIPLICATIONOPERATOR
    ;

divisionOperator
    : DIVISIONOPERATOR
    ;

powerOperator
    : POWEROPERATOR
    ;
