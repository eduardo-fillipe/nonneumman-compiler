/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.analysis;

import br.ufs.dcomp.compilers.project.nonneumann.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAAProgram(AAProgram node);
    void caseADecAFunctionDec(ADecAFunctionDec node);
    void caseAEntryAFunctionDec(AEntryAFunctionDec node);
    void caseATkReservedTypeIntAType(ATkReservedTypeIntAType node);
    void caseATkReservedTypeBoolAType(ATkReservedTypeBoolAType node);
    void caseATkReservedTypeRealAType(ATkReservedTypeRealAType node);
    void caseAAFunctionCall(AAFunctionCall node);
    void caseADecAParameter(ADecAParameter node);
    void caseASignatureAParameter(ASignatureAParameter node);
    void caseATypeAParameterSignature(ATypeAParameterSignature node);
    void caseASignatureAParameterSignature(ASignatureAParameterSignature node);
    void caseAAParameters(AAParameters node);
    void caseAASignature(AASignature node);
    void caseAADecCons(AADecCons node);
    void caseATkReservedBoolTrueABooleanValue(ATkReservedBoolTrueABooleanValue node);
    void caseATkReservedBoolFalseABooleanValue(ATkReservedBoolFalseABooleanValue node);
    void caseATkNumberFloatANumeralFloat(ATkNumberFloatANumeralFloat node);
    void caseATkNumberFloatCientificNotationANumeralFloat(ATkNumberFloatCientificNotationANumeralFloat node);
    void caseAABooleanValueALiteral(AABooleanValueALiteral node);
    void caseAANumeralFloatALiteral(AANumeralFloatALiteral node);
    void caseAANumeralIntALiteral(AANumeralIntALiteral node);
    void caseATkNumberIntegerDecANumeralInt(ATkNumberIntegerDecANumeralInt node);
    void caseATkNumberIntegerHexANumeralInt(ATkNumberIntegerHexANumeralInt node);
    void caseAAIfStmtAExp(AAIfStmtAExp node);
    void caseAAOrAExp(AAOrAExp node);
    void caseAAAndAExp(AAAndAExp node);
    void caseAAEqualAExp(AAEqualAExp node);
    void caseAALtAExp(AALtAExp node);
    void caseAAGtAExp(AAGtAExp node);
    void caseAANegationAExp(AANegationAExp node);
    void caseAAParenthesisAExp(AAParenthesisAExp node);
    void caseAAModAExp(AAModAExp node);
    void caseAAMultAExp(AAMultAExp node);
    void caseAADivAExp(AADivAExp node);
    void caseAATypeAExp(AATypeAExp node);
    void caseAALiteralAExp(AALiteralAExp node);
    void caseAAFunctionCallAExp(AAFunctionCallAExp node);
    void caseABooleanValueAExp(ABooleanValueAExp node);
    void caseANumeralFloatAExp(ANumeralFloatAExp node);
    void caseANumeralIntAExp(ANumeralIntAExp node);
    void caseAAExpBlocAExp(AAExpBlocAExp node);
    void caseAAPlusAExp(AAPlusAExp node);
    void caseAAMinusAExp(AAMinusAExp node);
    void caseAALambdaAExp(AALambdaAExp node);
    void caseAAIdList(AAIdList node);
    void caseAAIdListAux(AAIdListAux node);
    void caseAAId(AAId node);
    void caseAAListExp(AAListExp node);
    void caseAALambda(AALambda node);
    void caseAALambdaExpList(AALambdaExpList node);
    void caseAALambdaExpListAux(AALambdaExpListAux node);
    void caseAAExpList(AAExpList node);
    void caseAAExpListAux(AAExpListAux node);
    void caseAAParametersSignatureAux(AAParametersSignatureAux node);
    void caseAAParametersSignature(AAParametersSignature node);
    void caseAAParametersFunctionAux(AAParametersFunctionAux node);
    void caseAAExpFunctionAux(AAExpFunctionAux node);
    void caseAAParametersAux(AAParametersAux node);

    void caseTTkCommentLine(TTkCommentLine node);
    void caseTTkCommentMultiLine(TTkCommentMultiLine node);
    void caseTTkReservedEntry(TTkReservedEntry node);
    void caseTTkReservedFunction(TTkReservedFunction node);
    void caseTTkReservedConst(TTkReservedConst node);
    void caseTTkReservedTypeInt(TTkReservedTypeInt node);
    void caseTTkReservedTypeBool(TTkReservedTypeBool node);
    void caseTTkReservedTypeReal(TTkReservedTypeReal node);
    void caseTTkReservedBoolTrue(TTkReservedBoolTrue node);
    void caseTTkReservedBoolFalse(TTkReservedBoolFalse node);
    void caseTTkReservedBoolAnd(TTkReservedBoolAnd node);
    void caseTTkReservedBoolOr(TTkReservedBoolOr node);
    void caseTTkReservedIf(TTkReservedIf node);
    void caseTTkReservedThen(TTkReservedThen node);
    void caseTTkReservedElse(TTkReservedElse node);
    void caseTTkReservedLambda(TTkReservedLambda node);
    void caseTTkNumberIntegerDec(TTkNumberIntegerDec node);
    void caseTTkNumberIntegerHex(TTkNumberIntegerHex node);
    void caseTTkNumberFloat(TTkNumberFloat node);
    void caseTTkNumberFloatCientificNotation(TTkNumberFloatCientificNotation node);
    void caseTTkSignPlus(TTkSignPlus node);
    void caseTTkSignMinus(TTkSignMinus node);
    void caseTTkSignMult(TTkSignMult node);
    void caseTTkSignDiv(TTkSignDiv node);
    void caseTTkSignMod(TTkSignMod node);
    void caseTTkSignColon(TTkSignColon node);
    void caseTTkSignComma(TTkSignComma node);
    void caseTTkSignExclamation(TTkSignExclamation node);
    void caseTTkSignParOpen(TTkSignParOpen node);
    void caseTTkSignParClose(TTkSignParClose node);
    void caseTTkSignBraceOpen(TTkSignBraceOpen node);
    void caseTTkSignBraceClose(TTkSignBraceClose node);
    void caseTTkSignBoolEqual(TTkSignBoolEqual node);
    void caseTTkSignBoolGt(TTkSignBoolGt node);
    void caseTTkSignBoolLt(TTkSignBoolLt node);
    void caseTTkBlank(TTkBlank node);
    void caseTTkId(TTkId node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
