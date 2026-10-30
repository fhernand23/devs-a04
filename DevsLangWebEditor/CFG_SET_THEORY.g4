//-------------------------------------------------------------------------------------------------------------------------------------------
// Defining the set theory grammar
//-------------------------------------------------------------------------------------------------------------------------------------------

grammar CFG_SET_THEORY;

import CFG_TOKENS;

/* ----- Set definition ----- */
set
    : si=setImplicitDefinition                               # setImplicitDefinitionExpr
    | se=setExplicitDefinition                               # setExplicitDefinitionExpr
    ;

setImplicitDefinition
    : sd=setDefinition                                       # setDefinitionExpr
    | sr=setOperationResult                                  # setOperationResultExpr
    ;

setExplicitDefinition
    : s=setSymbol EQUAL rhs=setImplicitDefinition             # setAssignmentExpr
    ;

setDefinition
    : ec=elementCollection                                   # elementCollectionExpr
    | tc=tupleCollection                                     # tupleCollectionExpr
    ;

setSymbol
    : n=setName                                              # setNameSymbolExpr
    | z=setOfIntegerNumbersSymbol                            # integerSetSymbolExpr
    | nn=setOfNaturalNumbersSymbol                           # naturalSetSymbolExpr
    | r=setOfRealNumbersSymbol                               # realSetSymbolExpr
    | b=setOfBooleanAlgebraSymbol                            # booleanSetSymbolExpr
    ;

/* ----- Set identificators ----- */
setName: UPPERCASEID;
setOfIntegerNumbersSymbol: SETZSYMBOL;
setOfNaturalNumbersSymbol: SETNSYMBOL;
setOfRealNumbersSymbol: SETRSYMBOL;
setOfBooleanAlgebraSymbol: SETBSYMBOL;

/* ----- Basic elements to be used in a set specification ----- */
elementCollection
    : BEGINSET e1=element (COMMA e2+=element)* ENDSET                             # elementListExpr
    | BEGINSET e=element SUCHTHAT def=elementDefinition ENDSET                    # elementSuchThatExpr
    | es=emptySetSymbol                                                           # emptySetExpr
    ;

element
    : id=identifier                     # elementIdentifier
    | num=numberSymbol                  # elementNumber
    | bool=booleanSymbol                # elementBoolean
    | sig=modelSignature                # elementModelSignature
    | str=stringSymbol                  # elementString
    | tup=tuple                         # elementTuple
    | par=parameter                     # elementParameter
    ;

tupleCollection
    : BEGINSET t=tuple SUCHTHAT td=tupleDefinition ENDSET                         # tupleSuchThatExpr
    ;

tuple
    : BEGINPARENTHESES e1=element (COMMA e2+=element)* ENDPARENTHESES             # tupleExpr
    | et=emptyTupleSymbol                                                         # emptyTupleExpr
    ;

variableTuple
    : BEGINPARENTHESES v1=variable (COMMA v2+=variable)* ENDPARENTHESES           # variableTupleExpr
    | et=emptyTupleSymbol                                                         # emptyVariableTupleExpr
    ;

variableTupleFixedValues
    : BEGINPARENTHESES vfv1=variableFixedValues (COMMA vfv2+=variableFixedValues)* ENDPARENTHESES  # variableTupleFixedValuesExpr
    | et=emptyTupleSymbol                                                                 # emptyVariableTupleFixedValuesExpr
    ;

tupleDefinition
    : ed1=elementDefinition ((COMMA|ANDOPERATOR) ed2+=elementDefinition)*          # tupleDefinitionExpr
    ;

elementDefinition
    : d1=definitionWithSetImplicitDefinition                                       # elementDefImplicitSetExpr
    | d2=definitionWithSetSymbol                                                   # elementDefSetSymbolExpr
    | d3=definitionWithRange                                                       # elementDefRangeExpr
    ;

definitionWithSetImplicitDefinition
    : e=element op=belongsToOperator s=setImplicitDefinition                       # defWithImplicitSetExpr
    | ec=elementCollection op=belongsToOperator s=setImplicitDefinition            # defCollectionWithImplicitSetExpr
    ;

definitionWithSetSymbol
    : e=element op=belongsToOperator s=setSymbol                                   # defWithSymbolSetExpr
    | ec=elementCollection op=belongsToOperator s=setSymbol                        # defCollectionWithSymbolSetExpr
    ;

definitionWithRange
    : e=element op=belongsToOperator r=range                                       # defWithRangeExpr
    | ec=elementCollection op=belongsToOperator r=range                            # defCollectionWithRangeExpr
    ;

range
    : (BEGINPARENTHESES | BEGINBRACKET)
      n1=numberSymbol COMMA
      (n2n=numberSymbol | n2i=infinitySymbol)
      (ENDPARENTHESES | ENDBRACKET) 												# rangeExpr
    ;

booleanSymbol
    : t=trueSymbol        # trueExpr
    | f=falseSymbol       # falseExpr
    ;

numberSymbol
    : i=integerSymbol     # integerExpr
    | r=realSymbol        # realExpr
    ;

/* ----- Special elements to be used in a set specification ----- */
emptySetSymbol: EMPTYSETSYMBOL;
emptyTupleSymbol: EMPTYTUPLESYMBOL;

/* ----- Operations returning a new set ----- */
setOperationResult
    : left=setOperationTerm (op+=setOperator right+=setOperationTerm)*  # setOperationExpr
    ;
    
setOperationTerm
    : s1=operationSet                                                             # operationSetExpr
    | par=setOperationExpression                                                  # setOperationParExpr
    ;

setOperationExpression
    : BEGINPARENTHESES expr=setOperationResult ENDPARENTHESES                     # setOperationParenthesisExpr
    ;

operationSet
    : sd=setDefinition                                                            # operationSetDefinitionExpr
    | ss=setSymbol                                                                # operationSetSymbolExpr
    ;

/* ----- Basic operators ----- */
belongsToOperator
    : inOperator        # inOperatorExpr
    | notInOperator     # notInOperatorExpr
    ;
inOperator: INOPERATOR;
notInOperator: NOTINOPERATOR;
    
setOperator
    : cartesianProductOperator    # cartesianProductOpExpr
    | unionOperator               # unionOpExpr
    | intersectionOperator        # intersectionOpExpr
    | setdifferenceOperator       # differenceOpExpr
    ;

cartesianProductOperator: CARTESIANPRODUCTOPERATOR;
unionOperator: UNIONOPERATOR;
intersectionOperator: INTERSECTIONOPERATOR;
setdifferenceOperator: SETDIFFERENCEOPERATOR;