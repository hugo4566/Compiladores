/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AWriteComando extends PComando
{
    private TWrite _write_;
    private TLPar _lPar_;
    private final LinkedList<PExprComma> _exprComma_ = new LinkedList<PExprComma>();
    private TRPar _rPar_;
    private TSemiC _semiC_;

    public AWriteComando()
    {
        // Constructor
    }

    public AWriteComando(
        @SuppressWarnings("hiding") TWrite _write_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") List<?> _exprComma_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") TSemiC _semiC_)
    {
        // Constructor
        setWrite(_write_);

        setLPar(_lPar_);

        setExprComma(_exprComma_);

        setRPar(_rPar_);

        setSemiC(_semiC_);

    }

    @Override
    public Object clone()
    {
        return new AWriteComando(
            cloneNode(this._write_),
            cloneNode(this._lPar_),
            cloneList(this._exprComma_),
            cloneNode(this._rPar_),
            cloneNode(this._semiC_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWriteComando(this);
    }

    public TWrite getWrite()
    {
        return this._write_;
    }

    public void setWrite(TWrite node)
    {
        if(this._write_ != null)
        {
            this._write_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._write_ = node;
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

    public LinkedList<PExprComma> getExprComma()
    {
        return this._exprComma_;
    }

    public void setExprComma(List<?> list)
    {
        for(PExprComma e : this._exprComma_)
        {
            e.parent(null);
        }
        this._exprComma_.clear();

        for(Object obj_e : list)
        {
            PExprComma e = (PExprComma) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._exprComma_.add(e);
        }
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
            + toString(this._write_)
            + toString(this._lPar_)
            + toString(this._exprComma_)
            + toString(this._rPar_)
            + toString(this._semiC_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._write_ == child)
        {
            this._write_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._exprComma_.remove(child))
        {
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
        if(this._write_ == oldChild)
        {
            setWrite((TWrite) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        for(ListIterator<PExprComma> i = this._exprComma_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExprComma) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
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