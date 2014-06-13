/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AExpOp1FatExp extends PExp
{
    private PExp _exp_;
    private POp1 _op1_;
    private PFator _fator_;

    public AExpOp1FatExp()
    {
        // Constructor
    }

    public AExpOp1FatExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") POp1 _op1_,
        @SuppressWarnings("hiding") PFator _fator_)
    {
        // Constructor
        setExp(_exp_);

        setOp1(_op1_);

        setFator(_fator_);

    }

    @Override
    public Object clone()
    {
        return new AExpOp1FatExp(
            cloneNode(this._exp_),
            cloneNode(this._op1_),
            cloneNode(this._fator_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpOp1FatExp(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public POp1 getOp1()
    {
        return this._op1_;
    }

    public void setOp1(POp1 node)
    {
        if(this._op1_ != null)
        {
            this._op1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._op1_ = node;
    }

    public PFator getFator()
    {
        return this._fator_;
    }

    public void setFator(PFator node)
    {
        if(this._fator_ != null)
        {
            this._fator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._op1_)
            + toString(this._fator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._op1_ == child)
        {
            this._op1_ = null;
            return;
        }

        if(this._fator_ == child)
        {
            this._fator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._op1_ == oldChild)
        {
            setOp1((POp1) newChild);
            return;
        }

        if(this._fator_ == oldChild)
        {
            setFator((PFator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}