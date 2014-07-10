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
    void caseAStartPrograma(AStartPrograma node);
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
    void caseAExpComExprComma(AExpComExprComma node);
    void caseAExplogComExprComma(AExplogComExprComma node);
    void caseAElseOpcOpcionalElse(AElseOpcOpcionalElse node);
    void caseACaseStarCaseEstrela(ACaseStarCaseEstrela node);
    void caseAElseColonOpcOpcionalElseColon(AElseColonOpcOpcionalElseColon node);
    void caseAValueVarValue(AValueVarValue node);
    void caseAVariableVarValue(AVariableVarValue node);
    void caseAOp11Op1(AOp11Op1 node);
    void caseAOp12Op1(AOp12Op1 node);
    void caseAOp21Op2(AOp21Op2 node);
    void caseAOp22Op2(AOp22Op2 node);
    void caseAExpOp1TerExp(AExpOp1TerExp node);
    void caseATerExp(ATerExp node);
    void caseATerOp2FatTermo(ATerOp2FatTermo node);
    void caseAFatTermo(AFatTermo node);
    void caseALExpRFator(ALExpRFator node);
    void caseAVariValFator(AVariValFator node);
    void caseAOp31Op3(AOp31Op3 node);
    void caseAOp32Op3(AOp32Op3 node);
    void caseAOp33Op3(AOp33Op3 node);
    void caseAOp34Op3(AOp34Op3 node);
    void caseAOp41Op4(AOp41Op4 node);
    void caseAOp42Op4(AOp42Op4 node);
    void caseAOrExpExpLogica(AOrExpExpLogica node);
    void caseAExpLogica(AExpLogica node);
    void caseAXorExpExpLogica2(AXorExpExpLogica2 node);
    void caseAExpLogica2(AExpLogica2 node);
    void caseAAndExpExpLogica3(AAndExpExpLogica3 node);
    void caseAExpLogica3(AExpLogica3 node);
    void caseAExpOp4ExpExpLogica4(AExpOp4ExpExpLogica4 node);
    void caseAExpOp3ExpExpLogica4(AExpOp3ExpExpLogica4 node);
    void caseAParExpExpLogica4(AParExpExpLogica4 node);
    void caseAPassoStep(APassoStep node);
    void caseAAtribComando(AAtribComando node);
    void caseAAtribLogComando(AAtribLogComando node);
    void caseAReadComando(AReadComando node);
    void caseAWriteComando(AWriteComando node);
    void caseAIfComando(AIfComando node);
    void caseAEvaluateComando(AEvaluateComando node);
    void caseAEvaluateLogComando(AEvaluateLogComando node);
    void caseAWhileComando(AWhileComando node);
    void caseARepeatComando(ARepeatComando node);
    void caseAForOneComando(AForOneComando node);

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
