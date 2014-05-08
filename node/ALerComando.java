/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class ALerComando extends PComando
{
    private TRead _read_;
    private TLPar _lPar_;
    private final LinkedList<PVariavelComma> _variavelComma_ = new LinkedList<PVariavelComma>();
    private PVar _var_;
    private TRPar _rPar_;
    private TSemiC _semiC_;

    public ALerComando()
    {
        // Constructor
    }

    public ALerComando(
        @SuppressWarnings("hiding") TRead _read_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") List<?> _variavelComma_,
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") TSemiC _semiC_)
    {
        // Constructor
        setRead(_read_);

        setLPar(_lPar_);

        setVariavelComma(_variavelComma_);

        setVar(_var_);

        setRPar(_rPar_);

        setSemiC(_semiC_);

    }

    @Override
    public Object clone()
    {
        return new ALerComando(
            cloneNode(this._read_),
            cloneNode(this._lPar_),
            cloneList(this._variavelComma_),
            cloneNode(this._var_),
            cloneNode(this._rPar_),
            cloneNode(this._semiC_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALerComando(this);
    }

    public TRead getRead()
    {
        return this._read_;
    }

    public void setRead(TRead node)
    {
        if(this._read_ != null)
        {
            this._read_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._read_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public LinkedList<PVariavelComma> getVariavelComma()
    {
        return this._variavelComma_;
    }

    public void setVariavelComma(List<?> list)
    {
        for(PVariavelComma e : this._variavelComma_)
        {
            e.parent(null);
        }
        this._variavelComma_.clear();

        for(Object obj_e : list)
        {
            PVariavelComma e = (PVariavelComma) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._variavelComma_.add(e);
        }
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    public TSemiC getSemiC()
    {
        return this._semiC_;
    }

    public void setSemiC(TSemiC node)
    {
        if(this._semiC_ != null)
        {
            this._semiC_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semiC_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._read_)
            + toString(this._lPar_)
            + toString(this._variavelComma_)
            + toString(this._var_)
            + toString(this._rPar_)
            + toString(this._semiC_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._read_ == child)
        {
            this._read_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._variavelComma_.remove(child))
        {
            return;
        }

        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._semiC_ == child)
        {
            this._semiC_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._read_ == oldChild)
        {
            setRead((TRead) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        for(ListIterator<PVariavelComma> i = this._variavelComma_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PVariavelComma) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._semiC_ == oldChild)
        {
            setSemiC((TSemiC) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
