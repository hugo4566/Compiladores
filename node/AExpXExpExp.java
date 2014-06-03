/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AExpXExpExp extends PExp
{
    private PExp _pre_;
    private TMult _mult_;
    private PVarValueExp _varValueExp_;

    public AExpXExpExp()
    {
        // Constructor
    }

    public AExpXExpExp(
        @SuppressWarnings("hiding") PExp _pre_,
        @SuppressWarnings("hiding") TMult _mult_,
        @SuppressWarnings("hiding") PVarValueExp _varValueExp_)
    {
        // Constructor
        setPre(_pre_);

        setMult(_mult_);

        setVarValueExp(_varValueExp_);

    }

    @Override
    public Object clone()
    {
        return new AExpXExpExp(
            cloneNode(this._pre_),
            cloneNode(this._mult_),
            cloneNode(this._varValueExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpXExpExp(this);
    }

    public PExp getPre()
    {
        return this._pre_;
    }

    public void setPre(PExp node)
    {
        if(this._pre_ != null)
        {
            this._pre_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pre_ = node;
    }

    public TMult getMult()
    {
        return this._mult_;
    }

    public void setMult(TMult node)
    {
        if(this._mult_ != null)
        {
            this._mult_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mult_ = node;
    }

    public PVarValueExp getVarValueExp()
    {
        return this._varValueExp_;
    }

    public void setVarValueExp(PVarValueExp node)
    {
        if(this._varValueExp_ != null)
        {
            this._varValueExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varValueExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pre_)
            + toString(this._mult_)
            + toString(this._varValueExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pre_ == child)
        {
            this._pre_ = null;
            return;
        }

        if(this._mult_ == child)
        {
            this._mult_ = null;
            return;
        }

        if(this._varValueExp_ == child)
        {
            this._varValueExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pre_ == oldChild)
        {
            setPre((PExp) newChild);
            return;
        }

        if(this._mult_ == oldChild)
        {
            setMult((TMult) newChild);
            return;
        }

        if(this._varValueExp_ == oldChild)
        {
            setVarValueExp((PVarValueExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
