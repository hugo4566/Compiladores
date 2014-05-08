/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AExpLessExpExpLogica extends PExpLogica
{
    private PExp _pre_;
    private TLess _less_;
    private PExp _pos_;

    public AExpLessExpExpLogica()
    {
        // Constructor
    }

    public AExpLessExpExpLogica(
        @SuppressWarnings("hiding") PExp _pre_,
        @SuppressWarnings("hiding") TLess _less_,
        @SuppressWarnings("hiding") PExp _pos_)
    {
        // Constructor
        setPre(_pre_);

        setLess(_less_);

        setPos(_pos_);

    }

    @Override
    public Object clone()
    {
        return new AExpLessExpExpLogica(
            cloneNode(this._pre_),
            cloneNode(this._less_),
            cloneNode(this._pos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpLessExpExpLogica(this);
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

    public TLess getLess()
    {
        return this._less_;
    }

    public void setLess(TLess node)
    {
        if(this._less_ != null)
        {
            this._less_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._less_ = node;
    }

    public PExp getPos()
    {
        return this._pos_;
    }

    public void setPos(PExp node)
    {
        if(this._pos_ != null)
        {
            this._pos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pos_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pre_)
            + toString(this._less_)
            + toString(this._pos_);
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

        if(this._less_ == child)
        {
            this._less_ = null;
            return;
        }

        if(this._pos_ == child)
        {
            this._pos_ = null;
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

        if(this._less_ == oldChild)
        {
            setLess((TLess) newChild);
            return;
        }

        if(this._pos_ == oldChild)
        {
            setPos((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
