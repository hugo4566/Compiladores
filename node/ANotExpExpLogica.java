/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANotExpExpLogica extends PExpLogica
{
    private TNot _not_;
    private PExpLogica _expLogica_;

    public ANotExpExpLogica()
    {
        // Constructor
    }

    public ANotExpExpLogica(
        @SuppressWarnings("hiding") TNot _not_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_)
    {
        // Constructor
        setNot(_not_);

        setExpLogica(_expLogica_);

    }

    @Override
    public Object clone()
    {
        return new ANotExpExpLogica(
            cloneNode(this._not_),
            cloneNode(this._expLogica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotExpExpLogica(this);
    }

    public TNot getNot()
    {
        return this._not_;
    }

    public void setNot(TNot node)
    {
        if(this._not_ != null)
        {
            this._not_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._not_ = node;
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._not_)
            + toString(this._expLogica_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._not_ == child)
        {
            this._not_ = null;
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._not_ == oldChild)
        {
            setNot((TNot) newChild);
            return;
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
