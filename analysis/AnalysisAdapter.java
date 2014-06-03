/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMatrixVar(AMatrixVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntegerValor(AIntegerValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealValor(ARealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValueVarValueExp(AValueVarValueExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariableVarValueExp(AVariableVarValueExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExplogVarValueExp(AExplogVarValueExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariValExpExp(AVariValExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALExpRExp(ALExpRExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusExpExp(AMinusExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpPExpExp(AExpPExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpMExpExp(AExpMExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpXExpExp(AExpXExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpDivExpExp(AExpDivExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpEqExpExpLogica(AExpEqExpExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpNeqExpExpLogica(AExpNeqExpExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpLeqExpExpLogica(AExpLeqExpExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpGeqExpExpLogica(AExpGeqExpExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpLessExpExpLogica(AExpLessExpExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpGreatExpExpLogica(AExpGreatExpExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotExpExpLogica(ANotExpExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndExpExpLogica(AAndExpExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrExpExpLogica(AOrExpExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorExpExpLogica(AXorExpExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarComVariavelComma(AVarComVariavelComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpComExprComma(AExpComExprComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoSemicComandoSemiC(AComandoSemicComandoSemiC node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElseOpcOpcionalElse(AElseOpcOpcionalElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaseStarCaseEstrela(ACaseStarCaseEstrela node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElseColonOpcOpcionalElseColon(AElseColonOpcOpcionalElseColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribComando(AAtribComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReadComando(AReadComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWriteComando(AWriteComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfComando(AIfComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEvaluateComando(AEvaluateComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileComando(AWhileComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepeatComando(ARepeatComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAForOneComando(AForOneComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAForXComando(AForXComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntegerTipo(AIntegerTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharTipo(ACharTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariableDeclaracao(AVariableDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstantDeclaracao(AConstantDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBra(TLBra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBra(TRBra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemiC(TSemiC node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIs(TIs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEqual(TEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNotEqual(TNotEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLessEq(TLessEq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreaterEq(TGreaterEq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLess(TLess node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreater(TGreater node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgram(TProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBegin(TBegin node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnd(TEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEndW(TEndW node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFor(TFor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTUntil(TUntil node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFrom(TFrom node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEndF(TEndF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEndIf(TEndIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteger(TInteger node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCharacter(TCharacter node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstant(TConstant node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRead(TRead node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWrite(TWrite node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCase(TCase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepeat(TRepeat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPass(TPass node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEvaluate(TEvaluate node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEndE(TEndE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNReal(TNReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNInt(TNInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentEnd(TCommentEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentBody(TCommentBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLineComment(TLineComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
