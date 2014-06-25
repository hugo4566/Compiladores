/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AOp33Op3 extends POp3
{
    private TGreaterEq _greaterEq_;

    public AOp33Op3()
    {
        // Constructor
    }

    public AOp33Op3(
        @SuppressWarnings("hiding") TGreaterEq _greaterEq_)
    {
        // Constructor
        setGreaterEq(_greaterEq_);

    }

    @Override
    public Object clone()
    {
        return new AOp33Op3(
            cloneNode(this._greaterEq_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOp33Op3(this);
    }

    public TGreaterEq getGreaterEq()
    {
        return this._greaterEq_;
    }

    public void setGreaterEq(TGreaterEq node)
    {
        if(this._greaterEq_ != null)
        {
            this._greaterEq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._greaterEq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._greaterEq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._greaterEq_ == child)
        {
            this._greaterEq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._greaterEq_ == oldChild)
        {
            setGreaterEq((TGreaterEq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}