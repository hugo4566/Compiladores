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

    public void inAStartPrograma(AStartPrograma node)
    {
        defaultIn(node);
    }

    public void outAStartPrograma(AStartPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStartPrograma(AStartPrograma node)
    {
        inAStartPrograma(node);
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
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        outAStartPrograma(node);
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
}
