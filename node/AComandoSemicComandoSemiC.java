/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AComandoSemicComandoSemiC extends PComandoSemiC
{
    private PComando _comando_;
    private TSemiC _semiC_;

    public AComandoSemicComandoSemiC()
    {
        // Constructor
    }

    public AComandoSemicComandoSemiC(
        @SuppressWarnings("hiding") PComando _comando_,
        @SuppressWarnings("hiding") TSemiC _semiC_)
    {
        // Constructor
        setComando(_comando_);

        setSemiC(_semiC_);

    }

    @Override
    public Object clone()
    {
        return new AComandoSemicComandoSemiC(
            cloneNode(this._comando_),
            cloneNode(this._semiC_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoSemicComandoSemiC(this);
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
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
            + toString(this._comando_)
            + toString(this._semiC_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comando_ == child)
        {
            this._comando_ = null;
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
        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
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
