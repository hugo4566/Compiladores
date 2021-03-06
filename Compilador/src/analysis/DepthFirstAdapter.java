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
        node.getPPrograma().apply(this);
        node.getEOF().apply(this);
        outStart(node);
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
        if(node.getId() != null)
        {
            node.getId().apply(this);
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
        outAPrograma(node);
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
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVar());
            for(PVar e : copy)
            {
                e.apply(this);
            }
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
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAConstantDeclaracao(node);
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
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        outAMatrixVar(node);
    }

    public void inAValueVarValue(AValueVarValue node)
    {
        defaultIn(node);
    }

    public void outAValueVarValue(AValueVarValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValueVarValue(AValueVarValue node)
    {
        inAValueVarValue(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValueVarValue(node);
    }

    public void inAVariableVarValue(AVariableVarValue node)
    {
        defaultIn(node);
    }

    public void outAVariableVarValue(AVariableVarValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableVarValue(AVariableVarValue node)
    {
        inAVariableVarValue(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVariableVarValue(node);
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
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAAtribComando(node);
    }

    public void inAAtribLogComando(AAtribLogComando node)
    {
        defaultIn(node);
    }

    public void outAAtribLogComando(AAtribLogComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribLogComando(AAtribLogComando node)
    {
        inAAtribLogComando(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAAtribLogComando(node);
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
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVar());
            for(PVar e : copy)
            {
                e.apply(this);
            }
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
        outAWriteComando(node);
    }

    public void inAWriteLogComando(AWriteLogComando node)
    {
        defaultIn(node);
    }

    public void outAWriteLogComando(AWriteLogComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWriteLogComando(AWriteLogComando node)
    {
        inAWriteLogComando(node);
        {
            List<PExprComma> copy = new ArrayList<PExprComma>(node.getExprComma());
            for(PExprComma e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAWriteLogComando(node);
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
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getOpElse() != null)
        {
            node.getOpElse().apply(this);
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
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        {
            List<PCaseEstrela> copy = new ArrayList<PCaseEstrela>(node.getCaseEstrela());
            for(PCaseEstrela e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getOpElse() != null)
        {
            node.getOpElse().apply(this);
        }
        outAEvaluateComando(node);
    }

    public void inAEvaluateLogComando(AEvaluateLogComando node)
    {
        defaultIn(node);
    }

    public void outAEvaluateLogComando(AEvaluateLogComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEvaluateLogComando(AEvaluateLogComando node)
    {
        inAEvaluateLogComando(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PCaseEstrela> copy = new ArrayList<PCaseEstrela>(node.getCaseEstrela());
            for(PCaseEstrela e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getOpElse() != null)
        {
            node.getOpElse().apply(this);
        }
        outAEvaluateLogComando(node);
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
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
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
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
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
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getStart() != null)
        {
            node.getStart().apply(this);
        }
        if(node.getStep() != null)
        {
            node.getStep().apply(this);
        }
        if(node.getStop() != null)
        {
            node.getStop().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAForOneComando(node);
    }

    public void inAPlusExp(APlusExp node)
    {
        defaultIn(node);
    }

    public void outAPlusExp(APlusExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExp(APlusExp node)
    {
        inAPlusExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAPlusExp(node);
    }

    public void inAMinusExp(AMinusExp node)
    {
        defaultIn(node);
    }

    public void outAMinusExp(AMinusExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExp(AMinusExp node)
    {
        inAMinusExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMinusExp(node);
    }

    public void inADivExp(ADivExp node)
    {
        defaultIn(node);
    }

    public void outADivExp(ADivExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        inADivExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outADivExp(node);
    }

    public void inADivNExp(ADivNExp node)
    {
        defaultIn(node);
    }

    public void outADivNExp(ADivNExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivNExp(ADivNExp node)
    {
        inADivNExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outADivNExp(node);
    }

    public void inAMultNExp(AMultNExp node)
    {
        defaultIn(node);
    }

    public void outAMultNExp(AMultNExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultNExp(AMultNExp node)
    {
        inAMultNExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMultNExp(node);
    }

    public void inAMultExp(AMultExp node)
    {
        defaultIn(node);
    }

    public void outAMultExp(AMultExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        inAMultExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMultExp(node);
    }

    public void inAVarValueExp(AVarValueExp node)
    {
        defaultIn(node);
    }

    public void outAVarValueExp(AVarValueExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarValueExp(AVarValueExp node)
    {
        inAVarValueExp(node);
        if(node.getVarValue() != null)
        {
            node.getVarValue().apply(this);
        }
        outAVarValueExp(node);
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
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAMinusExpExp(node);
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
        outAExpComExprComma(node);
    }

    public void inAExplogComExprComma(AExplogComExprComma node)
    {
        defaultIn(node);
    }

    public void outAExplogComExprComma(AExplogComExprComma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExplogComExprComma(AExplogComExprComma node)
    {
        inAExplogComExprComma(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAExplogComExprComma(node);
    }

    public void inACaseEstrela(ACaseEstrela node)
    {
        defaultIn(node);
    }

    public void outACaseEstrela(ACaseEstrela node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaseEstrela(ACaseEstrela node)
    {
        inACaseEstrela(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outACaseEstrela(node);
    }

    public void inAOpElse(AOpElse node)
    {
        defaultIn(node);
    }

    public void outAOpElse(AOpElse node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOpElse(AOpElse node)
    {
        inAOpElse(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAOpElse(node);
    }

    public void inAOrExpLogica(AOrExpLogica node)
    {
        defaultIn(node);
    }

    public void outAOrExpLogica(AOrExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrExpLogica(AOrExpLogica node)
    {
        inAOrExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAOrExpLogica(node);
    }

    public void inAXorExpLogica(AXorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAXorExpLogica(AXorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpLogica(AXorExpLogica node)
    {
        inAXorExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAXorExpLogica(node);
    }

    public void inAAndExpLogica(AAndExpLogica node)
    {
        defaultIn(node);
    }

    public void outAAndExpLogica(AAndExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndExpLogica(AAndExpLogica node)
    {
        inAAndExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAAndExpLogica(node);
    }

    public void inAAndNExpLogica(AAndNExpLogica node)
    {
        defaultIn(node);
    }

    public void outAAndNExpLogica(AAndNExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndNExpLogica(AAndNExpLogica node)
    {
        inAAndNExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAAndNExpLogica(node);
    }

    public void inAEqualExpLogica(AEqualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAEqualExpLogica(AEqualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualExpLogica(AEqualExpLogica node)
    {
        inAEqualExpLogica(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getVarValue() != null)
        {
            node.getVarValue().apply(this);
        }
        outAEqualExpLogica(node);
    }

    public void inANotEqualExpLogica(ANotEqualExpLogica node)
    {
        defaultIn(node);
    }

    public void outANotEqualExpLogica(ANotEqualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotEqualExpLogica(ANotEqualExpLogica node)
    {
        inANotEqualExpLogica(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getVarValue() != null)
        {
            node.getVarValue().apply(this);
        }
        outANotEqualExpLogica(node);
    }

    public void inALessEqExpLogica(ALessEqExpLogica node)
    {
        defaultIn(node);
    }

    public void outALessEqExpLogica(ALessEqExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessEqExpLogica(ALessEqExpLogica node)
    {
        inALessEqExpLogica(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getVarValue() != null)
        {
            node.getVarValue().apply(this);
        }
        outALessEqExpLogica(node);
    }

    public void inALessExpLogica(ALessExpLogica node)
    {
        defaultIn(node);
    }

    public void outALessExpLogica(ALessExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessExpLogica(ALessExpLogica node)
    {
        inALessExpLogica(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getVarValue() != null)
        {
            node.getVarValue().apply(this);
        }
        outALessExpLogica(node);
    }

    public void inAGreaterEqExpLogica(AGreaterEqExpLogica node)
    {
        defaultIn(node);
    }

    public void outAGreaterEqExpLogica(AGreaterEqExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreaterEqExpLogica(AGreaterEqExpLogica node)
    {
        inAGreaterEqExpLogica(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getVarValue() != null)
        {
            node.getVarValue().apply(this);
        }
        outAGreaterEqExpLogica(node);
    }

    public void inAGreaterExpLogica(AGreaterExpLogica node)
    {
        defaultIn(node);
    }

    public void outAGreaterExpLogica(AGreaterExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreaterExpLogica(AGreaterExpLogica node)
    {
        inAGreaterExpLogica(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getVarValue() != null)
        {
            node.getVarValue().apply(this);
        }
        outAGreaterExpLogica(node);
    }

    public void inAExpExpLogica(AExpExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpExpLogica(AExpExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpExpLogica(AExpExpLogica node)
    {
        inAExpExpLogica(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExpExpLogica(node);
    }

    public void inANegationExpLogica(ANegationExpLogica node)
    {
        defaultIn(node);
    }

    public void outANegationExpLogica(ANegationExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegationExpLogica(ANegationExpLogica node)
    {
        inANegationExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outANegationExpLogica(node);
    }
}
