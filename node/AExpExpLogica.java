/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AExpExpLogica extends PExpLogica
{
    private PExp _exp_;

    public AExpExpLogica()
    {
        // Constructor
    }

    public AExpExpLogica(
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AExpExpLogica(
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpExpLogica(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_);
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

        throw new RuntimeException("Not a child.");
    }
}
