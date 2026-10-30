//-------------------------------------------------------------------------------------------------------------------------------------------
// CFG_DEVS_MODEL.g4
// FINAL VERSION — ANTLR 4.4 COMPATIBLE — EMF READY
//-------------------------------------------------------------------------------------------------------------------------------------------

grammar CFG_DEVS_MODEL;

import CFG_TOKENS, CFG_BOOLEAN_EXPRESSION, CFG_SET_THEORY, CFG_MATH_EXPRESSION;



//-------------------------------------------------------------------------------------------------------------------------------------------
// ROOT
//-------------------------------------------------------------------------------------------------------------------------------------------

devsSpecification
    : models+=devsModel+ EOF
    ;

devsModel
    : atomicModel
    | coupledModel
    ;

setInModel
    : setImplicitDefinition
    | setSymbol
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// ATOMIC MODEL
//-------------------------------------------------------------------------------------------------------------------------------------------

atomicModel
    : sig=modelSignature
      EQUAL
      modelTuple=atomicModelTuple
      WHERESYMBOL
      def=modelDefinition
    ;

atomicModelTuple
    : BEGINPARENTHESES
        input=setInModel
        COMMA output=setInModel
        COMMA state=setInModel
        COMMA deltaExtName=DELTAEXTNAMESYMBOL
        COMMA deltaIntName=DELTAINTNAMESYMBOL
        COMMA lambdaName=LAMBDANAMESYMBOL
        COMMA taName=TANAMESYMBOL
      ENDPARENTHESES
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// COUPLED MODEL
//-------------------------------------------------------------------------------------------------------------------------------------------

coupledModel
    : sig=modelSignature
      EQUAL
      modelTuple=coupledModelTuple
      WHERESYMBOL
      def=modelDefinition
    ;

coupledModelTuple
    : BEGINPARENTHESES
        input=setInModel
        COMMA output=setInModel
        COMMA state=setInModel
        COMMA components=setInModel
        COMMA eic=setInModel
        COMMA eoc=setInModel
        COMMA ic=setInModel
        COMMA selectName=SELECTNAMESYMBOL
      ENDPARENTHESES
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// MODEL DEFINITION
//-------------------------------------------------------------------------------------------------------------------------------------------

modelDefinition
    : sentences+=modelSentence
      (SEMICOLON sentences+=modelSentence)*
    ;

modelSentence
    : setExplicitDefinition
    | function
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// FUNCTION DISPATCHER
//-------------------------------------------------------------------------------------------------------------------------------------------

function
    : delExtFunction
    | delIntFunction
    | lambdaFunction
    | taFunction
    | selectFunction
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// DELTA EXT
//-------------------------------------------------------------------------------------------------------------------------------------------

delExtFunction
    : name=delExtFunctionName
      EQUAL
      body=functionDescription
    ;

delExtFunctionName
    : DELTAEXTNAMESYMBOL
      BEGINPARENTHESES
        stateTuple=tuple
        COMMA elapsed=element
        COMMA inputTuple=tuple
      ENDPARENTHESES
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// DELTA INT
//-------------------------------------------------------------------------------------------------------------------------------------------

delIntFunction
    : name=delIntFunctionName
      EQUAL
      body=functionDescription
    ;

delIntFunctionName
    : DELTAINTNAMESYMBOL
      BEGINPARENTHESES
        stateTuple=tuple
      ENDPARENTHESES
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// LAMBDA
//-------------------------------------------------------------------------------------------------------------------------------------------

lambdaFunction
    : name=lambdaFunctionName
      EQUAL
      body=functionDescription
    ;

lambdaFunctionName
    : LAMBDANAMESYMBOL
      BEGINPARENTHESES
        stateTuple=tuple
      ENDPARENTHESES
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// TA FUNCTION
//-------------------------------------------------------------------------------------------------------------------------------------------

taFunction
    : name=taFunctionName
      EQUAL
      body=taFunctionDescription
    ;

taFunctionName
    : TANAMESYMBOL
      BEGINPARENTHESES
        stateTuple=tuple
      ENDPARENTHESES
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// SELECT FUNCTION
//-------------------------------------------------------------------------------------------------------------------------------------------

selectFunction
    : name=selectFunctionName
      EQUAL
      body=selectFunctionDescription
    ;

selectFunctionName
    : SELECTNAMESYMBOL
      BEGINPARENTHESES
        setSym=setSymbol
      ENDPARENTHESES
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// FUNCTION DESCRIPTION
//-------------------------------------------------------------------------------------------------------------------------------------------

functionDescription
    : tupleValue
    | functionDescriptionPreIf
    | functionDescriptionPostIf
    | functionGenericDescription
    | functionGenericValuesDescription
    ;

// PRE IF

functionDescriptionPreIf
    : functionPreIfResult
      (COMMA functionPreIfResult)*
    ;

functionPreIfResult
    : cond=ifThenCondition
      result=tupleValue                    # functionPreIfConditionalResult
    | cond=inOtherCaseSymbol
      result=tupleValue                    # functionPreIfDefaultResult
    ;

// POST IF

functionDescriptionPostIf
    : functionPostIfResult
      (COMMA functionPostIfResult)*
    ;

functionPostIfResult
    : result=tupleValue
      cond=ifCondition
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// GENERIC FUNCTION DESCRIPTION
//-------------------------------------------------------------------------------------------------------------------------------------------

functionGenericDescription
    : vars=variableTuple
      COMMA
      functionDescriptionAssignmentPreIf
    | vars=variableTuple
      COMMA
      functionDescriptionAssignmentPostIf
    ;

functionDescriptionAssignmentPreIf
    : functionAssignPreIfResult
      (COMMA functionAssignPreIfResult)*
    ;

functionDescriptionAssignmentPostIf
    : functionAssignPostIfResult
      (COMMA functionAssignPostIfResult)*
    ;

functionAssignPreIfResult
    : cond=ifThenCondition
      assignTuple                         # functionAssignPreIfConditionalResult
    | cond=inOtherCaseSymbol
      assignTuple                         # functionAssignPreIfDefaultResult
    ;
    
functionAssignPostIfResult
    : assignTuple
      cond=ifCondition
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// GENERIC VALUES DESCRIPTION
//-------------------------------------------------------------------------------------------------------------------------------------------

functionGenericValuesDescription
    : vars=variableTupleFixedValues
      COMMA
      functionDescriptionValuesAssignmentPreIf
    | vars=variableTupleFixedValues
      COMMA
      functionDescriptionValuesAssignmentPostIf
    ;

functionDescriptionValuesAssignmentPreIf
    : functionValuesAssignPreIfResult
      (COMMA functionValuesAssignPreIfResult)*
    ;

functionDescriptionValuesAssignmentPostIf
    : functionValuesAssignPostIfResult
      (COMMA functionValuesAssignPostIfResult)*
    ;

functionValuesAssignPreIfResult
    : cond=ifThenCondition
      assignmentsList                      # functionValuesAssignPreIfConditionalResult
    | cond=inOtherCaseSymbol
      assignmentsList                      # functionValuesAssignPreIfDefaultResult
    ;

functionValuesAssignPostIfResult
    : assignmentsList
      cond=ifCondition
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// VALUES
//-------------------------------------------------------------------------------------------------------------------------------------------

tupleValue
    : BEGINPARENTHESES
      value
      (COMMA value)*
      ENDPARENTHESES
    ;

value
    : element
    | infinitySymbol
    | mathExpression
    | booleanExpression
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// TA DESCRIPTION
//-------------------------------------------------------------------------------------------------------------------------------------------

taFunctionDescription
    : taFunctionGenericDescription
    | taFunctionDescriptionPreIf
    | taFunctionDescriptionPostIf
    | value
    ;

taFunctionDescriptionPreIf
    : taFunctionPreIfResult
      (COMMA taFunctionPreIfResult)*
    ;

taFunctionPreIfResult
    : cond=ifThenCondition
      result=value                         # taFunctionPreIfConditionalResult
    | cond=inOtherCaseSymbol
      result=value                         # taFunctionPreIfDefaultResult
    ;

taFunctionDescriptionPostIf
    : taFunctionPostIfResult
      (COMMA taFunctionPostIfResult)*
    ;

taFunctionPostIfResult
    : result=value
      cond=ifCondition
    ;

taFunctionGenericDescription
    : var=variable
      COMMA
      taAssignPreIf
    | var=variable
      COMMA
      taAssignPostIf
    ;

taAssignPreIf
    : taAssignPreIfResult
      (COMMA taAssignPreIfResult)*
    ;

taAssignPreIfResult
    : cond=ifThenCondition
      assignValue                          # taAssignPreIfConditionalResult
    | cond=inOtherCaseSymbol
      assignValue                          # taAssignPreIfDefaultResult
    ;

taAssignPostIf
    : taAssignPostIfResult
      (COMMA taAssignPostIfResult)*
    ;

taAssignPostIfResult
    : assignValue
      cond=ifCondition
    ;

//-------------------------------------------------------------------------------------------------------------------------------------------
// SELECT DESCRIPTION
//-------------------------------------------------------------------------------------------------------------------------------------------

selectFunctionDescription
    : identifier
    | selectFunctionDescriptionPreIf
    | selectFunctionDescriptionPostIf
    | selectFunctionGenericDescription
    ;

selectFunctionDescriptionPreIf
    : selectFunctionPreIfResult
      (COMMA selectFunctionPreIfResult)*
    ;

selectFunctionPreIfResult
    : cond=ifThenCondition
      identifier                           # selectFunctionPreIfConditionalResult
    | cond=inOtherCaseSymbol
      identifier                           # selectFunctionPreIfDefaultResult
    ;

selectFunctionDescriptionPostIf
    : selectFunctionPostIfResult
      (COMMA selectFunctionPostIfResult)*
    ;

selectFunctionPostIfResult
    : identifier
      cond=ifCondition
    ;

selectFunctionGenericDescription
    : var=variable
      COMMA
      selectAssignPreIfList
    | var=variable
      COMMA
      selectAssignPostIfList
    ;

selectAssignPreIfList
    : selectAssignPreIfResult
      (COMMA selectAssignPreIfResult)*
    ;

selectAssignPreIfResult
    : cond=ifThenCondition
      assignIdentifier                     # selectAssignPreIfIdentifierConditionalResult
    | cond=ifThenCondition
      assignParameter                      # selectAssignPreIfParameterConditionalResult
    | cond=inOtherCaseSymbol
      assignIdentifier                     # selectAssignPreIfIdentifierDefaultResult
    | cond=inOtherCaseSymbol
      assignParameter                      # selectAssignPreIfParameterDefaultResult
    ;

selectAssignPostIfList
    : selectAssignPostIfResult
      (COMMA selectAssignPostIfResult)*
    ;

selectAssignPostIfResult
    : assignIdentifier
      cond=ifCondition
    | assignParameter
      cond=ifCondition
    ;
//-------------------------------------------------------------------------------------------------------------------------------------------
// ASSIGNMENTS
//-------------------------------------------------------------------------------------------------------------------------------------------

assignIdentifier
    : variable
      ASSIGNOPERATOR
      identifier
    ;

assignParameter
    : variable
      ASSIGNOPERATOR
      parameter
    ;

assignValue
    : variable
      ASSIGNOPERATOR
      value
    ;

assignTuple
    : variableTuple
      ASSIGNOPERATOR
      tupleValue
    ;

assignElement
    : assignIdentifier
    | assignValue
    | assignTuple
    
    ;

assignmentsList
    : assignElement
      ((COMMA | ANDOPERATOR) assignElement)*
    ;