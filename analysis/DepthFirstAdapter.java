/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPVar().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAIdVar(AIdVar node)
    {
        defaultIn(node);
    }

    public void outAIdVar(AIdVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        inAIdVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdVar(node);
    }

    public void inAMatrixVar(AMatrixVar node)
    {
        defaultIn(node);
    }

    public void outAMatrixVar(AMatrixVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMatrixVar(AMatrixVar node)
    {
        inAMatrixVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLBra() != null)
        {
            node.getLBra().apply(this);
        }
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        if(node.getRBra() != null)
        {
            node.getRBra().apply(this);
        }
        outAMatrixVar(node);
    }

    public void inAStringValor(AStringValor node)
    {
        defaultIn(node);
    }

    public void outAStringValor(AStringValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        inAStringValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringValor(node);
    }

    public void inAIntegerValor(AIntegerValor node)
    {
        defaultIn(node);
    }

    public void outAIntegerValor(AIntegerValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegerValor(AIntegerValor node)
    {
        inAIntegerValor(node);
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        outAIntegerValor(node);
    }

    public void inARealValor(ARealValor node)
    {
        defaultIn(node);
    }

    public void outARealValor(ARealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealValor(ARealValor node)
    {
        inARealValor(node);
        if(node.getNReal() != null)
        {
            node.getNReal().apply(this);
        }
        outARealValor(node);
    }

    public void inAValueExp(AValueExp node)
    {
        defaultIn(node);
    }

    public void outAValueExp(AValueExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValueExp(AValueExp node)
    {
        inAValueExp(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValueExp(node);
    }

    public void inAVariableExp(AVariableExp node)
    {
        defaultIn(node);
    }

    public void outAVariableExp(AVariableExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableExp(AVariableExp node)
    {
        inAVariableExp(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVariableExp(node);
    }

    public void inALExpRExp(ALExpRExp node)
    {
        defaultIn(node);
    }

    public void outALExpRExp(ALExpRExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALExpRExp(ALExpRExp node)
    {
        inALExpRExp(node);
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outALExpRExp(node);
    }

    public void inAMinusExpExp(AMinusExpExp node)
    {
        defaultIn(node);
    }

    public void outAMinusExpExp(AMinusExpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExpExp(AMinusExpExp node)
    {
        inAMinusExpExp(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAMinusExpExp(node);
    }

    public void inAExpPExpExp(AExpPExpExp node)
    {
        defaultIn(node);
    }

    public void outAExpPExpExp(AExpPExpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpPExpExp(AExpPExpExp node)
    {
        inAExpPExpExp(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAExpPExpExp(node);
    }

    public void inAExpMExpExp(AExpMExpExp node)
    {
        defaultIn(node);
    }

    public void outAExpMExpExp(AExpMExpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpMExpExp(AExpMExpExp node)
    {
        inAExpMExpExp(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAExpMExpExp(node);
    }

    public void inAExpXExpExp(AExpXExpExp node)
    {
        defaultIn(node);
    }

    public void outAExpXExpExp(AExpXExpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpXExpExp(AExpXExpExp node)
    {
        inAExpXExpExp(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAExpXExpExp(node);
    }

    public void inAExpDivExpExp(AExpDivExpExp node)
    {
        defaultIn(node);
    }

    public void outAExpDivExpExp(AExpDivExpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpDivExpExp(AExpDivExpExp node)
    {
        inAExpDivExpExp(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAExpDivExpExp(node);
    }

    public void inAExplogExp(AExplogExp node)
    {
        defaultIn(node);
    }

    public void outAExplogExp(AExplogExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExplogExp(AExplogExp node)
    {
        inAExplogExp(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAExplogExp(node);
    }

    public void inAExpEqExpExpLogica(AExpEqExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpEqExpExpLogica(AExpEqExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpEqExpExpLogica(AExpEqExpExpLogica node)
    {
        inAExpEqExpExpLogica(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAExpEqExpExpLogica(node);
    }

    public void inAExpNeqExpExpLogica(AExpNeqExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpNeqExpExpLogica(AExpNeqExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpNeqExpExpLogica(AExpNeqExpExpLogica node)
    {
        inAExpNeqExpExpLogica(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getNotEqual() != null)
        {
            node.getNotEqual().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAExpNeqExpExpLogica(node);
    }

    public void inAExpLeqExpExpLogica(AExpLeqExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpLeqExpExpLogica(AExpLeqExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLeqExpExpLogica(AExpLeqExpExpLogica node)
    {
        inAExpLeqExpExpLogica(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getLessEq() != null)
        {
            node.getLessEq().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAExpLeqExpExpLogica(node);
    }

    public void inAExpGeqExpExpLogica(AExpGeqExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpGeqExpExpLogica(AExpGeqExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpGeqExpExpLogica(AExpGeqExpExpLogica node)
    {
        inAExpGeqExpExpLogica(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getGreaterEq() != null)
        {
            node.getGreaterEq().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAExpGeqExpExpLogica(node);
    }

    public void inAExpLessExpExpLogica(AExpLessExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpLessExpExpLogica(AExpLessExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLessExpExpLogica(AExpLessExpExpLogica node)
    {
        inAExpLessExpExpLogica(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getLess() != null)
        {
            node.getLess().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAExpLessExpExpLogica(node);
    }

    public void inAExpGreatExpExpLogica(AExpGreatExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpGreatExpExpLogica(AExpGreatExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpGreatExpExpLogica(AExpGreatExpExpLogica node)
    {
        inAExpGreatExpExpLogica(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getGreater() != null)
        {
            node.getGreater().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAExpGreatExpExpLogica(node);
    }

    public void inANotExpExpLogica(ANotExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outANotExpExpLogica(ANotExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotExpExpLogica(ANotExpExpLogica node)
    {
        inANotExpExpLogica(node);
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outANotExpExpLogica(node);
    }

    public void inAAndExpExpLogica(AAndExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outAAndExpExpLogica(AAndExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndExpExpLogica(AAndExpExpLogica node)
    {
        inAAndExpExpLogica(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getAnd() != null)
        {
            node.getAnd().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAAndExpExpLogica(node);
    }

    public void inAOrExpExpLogica(AOrExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outAOrExpExpLogica(AOrExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrExpExpLogica(AOrExpExpLogica node)
    {
        inAOrExpExpLogica(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getOr() != null)
        {
            node.getOr().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAOrExpExpLogica(node);
    }

    public void inAXorExpExpLogica(AXorExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outAXorExpExpLogica(AXorExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpExpLogica(AXorExpExpLogica node)
    {
        inAXorExpExpLogica(node);
        if(node.getPre() != null)
        {
            node.getPre().apply(this);
        }
        if(node.getXor() != null)
        {
            node.getXor().apply(this);
        }
        if(node.getPos() != null)
        {
            node.getPos().apply(this);
        }
        outAXorExpExpLogica(node);
    }

    public void inAVarComVariavelComma(AVarComVariavelComma node)
    {
        defaultIn(node);
    }

    public void outAVarComVariavelComma(AVarComVariavelComma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarComVariavelComma(AVarComVariavelComma node)
    {
        inAVarComVariavelComma(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        outAVarComVariavelComma(node);
    }

    public void inAExpComExprComma(AExpComExprComma node)
    {
        defaultIn(node);
    }

    public void outAExpComExprComma(AExpComExprComma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpComExprComma(AExpComExprComma node)
    {
        inAExpComExprComma(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        outAExpComExprComma(node);
    }

    public void inAComandoSemicComandoSemiC(AComandoSemicComandoSemiC node)
    {
        defaultIn(node);
    }

    public void outAComandoSemicComandoSemiC(AComandoSemicComandoSemiC node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoSemicComandoSemiC(AComandoSemicComandoSemiC node)
    {
        inAComandoSemicComandoSemiC(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outAComandoSemicComandoSemiC(node);
    }

    public void inAElseOpcOpcionalElse(AElseOpcOpcionalElse node)
    {
        defaultIn(node);
    }

    public void outAElseOpcOpcionalElse(AElseOpcOpcionalElse node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElseOpcOpcionalElse(AElseOpcOpcionalElse node)
    {
        inAElseOpcOpcionalElse(node);
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        {
            List<PComandoSemiC> copy = new ArrayList<PComandoSemiC>(node.getComandoSemiC());
            for(PComandoSemiC e : copy)
            {
                e.apply(this);
            }
        }
        outAElseOpcOpcionalElse(node);
    }

    public void inACaseStarCaseEstrela(ACaseStarCaseEstrela node)
    {
        defaultIn(node);
    }

    public void outACaseStarCaseEstrela(ACaseStarCaseEstrela node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaseStarCaseEstrela(ACaseStarCaseEstrela node)
    {
        inACaseStarCaseEstrela(node);
        if(node.getCase() != null)
        {
            node.getCase().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        {
            List<PComandoSemiC> copy = new ArrayList<PComandoSemiC>(node.getComandoSemiC());
            for(PComandoSemiC e : copy)
            {
                e.apply(this);
            }
        }
        outACaseStarCaseEstrela(node);
    }

    public void inAElseColonOpcOpcionalElseColon(AElseColonOpcOpcionalElseColon node)
    {
        defaultIn(node);
    }

    public void outAElseColonOpcOpcionalElseColon(AElseColonOpcOpcionalElseColon node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElseColonOpcOpcionalElseColon(AElseColonOpcOpcionalElseColon node)
    {
        inAElseColonOpcOpcionalElseColon(node);
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        {
            List<PComandoSemiC> copy = new ArrayList<PComandoSemiC>(node.getComandoSemiC());
            for(PComandoSemiC e : copy)
            {
                e.apply(this);
            }
        }
        outAElseColonOpcOpcionalElseColon(node);
    }

    public void inAAtribComando(AAtribComando node)
    {
        defaultIn(node);
    }

    public void outAAtribComando(AAtribComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribComando(AAtribComando node)
    {
        inAAtribComando(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getIs() != null)
        {
            node.getIs().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outAAtribComando(node);
    }

    public void inAReadComando(AReadComando node)
    {
        defaultIn(node);
    }

    public void outAReadComando(AReadComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReadComando(AReadComando node)
    {
        inAReadComando(node);
        if(node.getRead() != null)
        {
            node.getRead().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        {
            List<PVariavelComma> copy = new ArrayList<PVariavelComma>(node.getVariavelComma());
            for(PVariavelComma e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outAReadComando(node);
    }

    public void inAWriteComando(AWriteComando node)
    {
        defaultIn(node);
    }

    public void outAWriteComando(AWriteComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWriteComando(AWriteComando node)
    {
        inAWriteComando(node);
        if(node.getWrite() != null)
        {
            node.getWrite().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        {
            List<PExprComma> copy = new ArrayList<PExprComma>(node.getExprComma());
            for(PExprComma e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outAWriteComando(node);
    }

    public void inAIfComando(AIfComando node)
    {
        defaultIn(node);
    }

    public void outAIfComando(AIfComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfComando(AIfComando node)
    {
        inAIfComando(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        {
            List<PComandoSemiC> copy = new ArrayList<PComandoSemiC>(node.getComandoSemiC());
            for(PComandoSemiC e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getOpcionalElse() != null)
        {
            node.getOpcionalElse().apply(this);
        }
        if(node.getEndIf() != null)
        {
            node.getEndIf().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outAIfComando(node);
    }

    public void inAEvaluateComando(AEvaluateComando node)
    {
        defaultIn(node);
    }

    public void outAEvaluateComando(AEvaluateComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEvaluateComando(AEvaluateComando node)
    {
        inAEvaluateComando(node);
        if(node.getEvaluate() != null)
        {
            node.getEvaluate().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        {
            List<PCaseEstrela> copy = new ArrayList<PCaseEstrela>(node.getCaseEstrela());
            for(PCaseEstrela e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getOpcionalElseColon() != null)
        {
            node.getOpcionalElseColon().apply(this);
        }
        if(node.getEndE() != null)
        {
            node.getEndE().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outAEvaluateComando(node);
    }

    public void inAWhileComando(AWhileComando node)
    {
        defaultIn(node);
    }

    public void outAWhileComando(AWhileComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileComando(AWhileComando node)
    {
        inAWhileComando(node);
        if(node.getWhile() != null)
        {
            node.getWhile().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        {
            List<PComandoSemiC> copy = new ArrayList<PComandoSemiC>(node.getComandoSemiC());
            for(PComandoSemiC e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getEndW() != null)
        {
            node.getEndW().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outAWhileComando(node);
    }

    public void inARepeatComando(ARepeatComando node)
    {
        defaultIn(node);
    }

    public void outARepeatComando(ARepeatComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepeatComando(ARepeatComando node)
    {
        inARepeatComando(node);
        if(node.getRepeat() != null)
        {
            node.getRepeat().apply(this);
        }
        {
            List<PComandoSemiC> copy = new ArrayList<PComandoSemiC>(node.getComandoSemiC());
            for(PComandoSemiC e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getUntil() != null)
        {
            node.getUntil().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outARepeatComando(node);
    }

    public void inAForOneComando(AForOneComando node)
    {
        defaultIn(node);
    }

    public void outAForOneComando(AForOneComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAForOneComando(AForOneComando node)
    {
        inAForOneComando(node);
        if(node.getFor() != null)
        {
            node.getFor().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getFrom() != null)
        {
            node.getFrom().apply(this);
        }
        if(node.getStart() != null)
        {
            node.getStart().apply(this);
        }
        if(node.getUntil() != null)
        {
            node.getUntil().apply(this);
        }
        if(node.getStop() != null)
        {
            node.getStop().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        {
            List<PComandoSemiC> copy = new ArrayList<PComandoSemiC>(node.getComandoSemiC());
            for(PComandoSemiC e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getEndF() != null)
        {
            node.getEndF().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outAForOneComando(node);
    }

    public void inAForXComando(AForXComando node)
    {
        defaultIn(node);
    }

    public void outAForXComando(AForXComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAForXComando(AForXComando node)
    {
        inAForXComando(node);
        if(node.getFor() != null)
        {
            node.getFor().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getFrom() != null)
        {
            node.getFrom().apply(this);
        }
        if(node.getStart() != null)
        {
            node.getStart().apply(this);
        }
        if(node.getPass() != null)
        {
            node.getPass().apply(this);
        }
        if(node.getStep() != null)
        {
            node.getStep().apply(this);
        }
        if(node.getUntil() != null)
        {
            node.getUntil().apply(this);
        }
        if(node.getStop() != null)
        {
            node.getStop().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        {
            List<PComandoSemiC> copy = new ArrayList<PComandoSemiC>(node.getComandoSemiC());
            for(PComandoSemiC e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getEndF() != null)
        {
            node.getEndF().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outAForXComando(node);
    }

    public void inARealTipo(ARealTipo node)
    {
        defaultIn(node);
    }

    public void outARealTipo(ARealTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        inARealTipo(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealTipo(node);
    }

    public void inAIntegerTipo(AIntegerTipo node)
    {
        defaultIn(node);
    }

    public void outAIntegerTipo(AIntegerTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegerTipo(AIntegerTipo node)
    {
        inAIntegerTipo(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntegerTipo(node);
    }

    public void inACharTipo(ACharTipo node)
    {
        defaultIn(node);
    }

    public void outACharTipo(ACharTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharTipo(ACharTipo node)
    {
        inACharTipo(node);
        if(node.getCharacter() != null)
        {
            node.getCharacter().apply(this);
        }
        outACharTipo(node);
    }

    public void inAVariableDeclaracao(AVariableDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVariableDeclaracao(AVariableDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableDeclaracao(AVariableDeclaracao node)
    {
        inAVariableDeclaracao(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        {
            List<PVariavelComma> copy = new ArrayList<PVariavelComma>(node.getVariavelComma());
            for(PVariavelComma e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outAVariableDeclaracao(node);
    }

    public void inAConstantDeclaracao(AConstantDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstantDeclaracao(AConstantDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstantDeclaracao(AConstantDeclaracao node)
    {
        inAConstantDeclaracao(node);
        if(node.getConstant() != null)
        {
            node.getConstant().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getSemiC() != null)
        {
            node.getSemiC().apply(this);
        }
        outAConstantDeclaracao(node);
    }

    public void inAPrograma(APrograma node)
    {
        defaultIn(node);
    }

    public void outAPrograma(APrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        inAPrograma(node);
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getBegin() != null)
        {
            node.getBegin().apply(this);
        }
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getDeclaracao());
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        outAPrograma(node);
    }
}
