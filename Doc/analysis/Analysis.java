/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAPrograma(APrograma node);
    void caseAStringValor(AStringValor node);
    void caseAIntegerValor(AIntegerValor node);
    void caseARealValor(ARealValor node);
    void caseARealTipo(ARealTipo node);
    void caseAIntegerTipo(AIntegerTipo node);
    void caseACharTipo(ACharTipo node);
    void caseAIdVar(AIdVar node);
    void caseAMatrixVar(AMatrixVar node);
    void caseAVarComVariavelComma(AVarComVariavelComma node);
    void caseAVariableDeclaracao(AVariableDeclaracao node);
    void caseAConstantDeclaracao(AConstantDeclaracao node);
    void caseAAtribComando(AAtribComando node);
    void caseAValueVarValue(AValueVarValue node);
    void caseAVariableVarValue(AVariableVarValue node);
    void caseAPlusExp(APlusExp node);
    void caseAMinusExp(AMinusExp node);
    void caseADivExp(ADivExp node);
    void caseAMultExp(AMultExp node);
    void caseAVarValueExp(AVarValueExp node);

    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBra(TLBra node);
    void caseTRBra(TRBra node);
    void caseTColon(TColon node);
    void caseTSemiC(TSemiC node);
    void caseTComma(TComma node);
    void caseTDot(TDot node);
    void caseTBlank(TBlank node);
    void caseTIs(TIs node);
    void caseTNot(TNot node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTXor(TXor node);
    void caseTEqual(TEqual node);
    void caseTNotEqual(TNotEqual node);
    void caseTLessEq(TLessEq node);
    void caseTGreaterEq(TGreaterEq node);
    void caseTLess(TLess node);
    void caseTGreater(TGreater node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTProgram(TProgram node);
    void caseTBegin(TBegin node);
    void caseTEnd(TEnd node);
    void caseTWhile(TWhile node);
    void caseTEndW(TEndW node);
    void caseTFor(TFor node);
    void caseTUntil(TUntil node);
    void caseTFrom(TFrom node);
    void caseTEndF(TEndF node);
    void caseTIf(TIf node);
    void caseTElse(TElse node);
    void caseTEndIf(TEndIf node);
    void caseTDo(TDo node);
    void caseTReal(TReal node);
    void caseTInteger(TInteger node);
    void caseTCharacter(TCharacter node);
    void caseTConstant(TConstant node);
    void caseTRead(TRead node);
    void caseTWrite(TWrite node);
    void caseTThen(TThen node);
    void caseTCase(TCase node);
    void caseTRepeat(TRepeat node);
    void caseTPass(TPass node);
    void caseTEvaluate(TEvaluate node);
    void caseTEndE(TEndE node);
    void caseTId(TId node);
    void caseTString(TString node);
    void caseTNReal(TNReal node);
    void caseTNInt(TNInt node);
    void caseTComment(TComment node);
    void caseTCommentEnd(TCommentEnd node);
    void caseTCommentBody(TCommentBody node);
    void caseTStar(TStar node);
    void caseTSlash(TSlash node);
    void caseTLineComment(TLineComment node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}