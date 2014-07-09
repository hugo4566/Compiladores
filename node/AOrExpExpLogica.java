/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AOrExpExpLogica extends PExpLogica
{
    private PExpLogica _pre_;
    private TOr _or_;
    private PExpLogica2 _pos_;

    public AOrExpExpLogica()
    {
        // Constructor
    }

    public AOrExpExpLogica(
        @SuppressWarnings("hiding") PExpLogica _pre_,
        @SuppressWarnings("hiding") TOr _or_,
        @SuppressWarnings("hiding") PExpLogica2 _pos_)
    {
        // Constructor
        setPre(_pre_);

        setOr(_or_);

        setPos(_pos_);

    }

    @Override
    public Object clone()
    {
        return new AOrExpExpLogica(
            cloneNode(this._pre_),
            cloneNode(this._or_),
            cloneNode(this._pos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOrExpExpLogica(this);
    }

    public PExpLogica getPre()
    {
        return this._pre_;
    }

    public void setPre(PExpLogica node)
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

    public TOr getOr()
    {
        return this._or_;
    }

    public void setOr(TOr node)
    {
        if(this._or_ != null)
        {
            this._or_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._or_ = node;
    }

    public PExpLogica2 getPos()
    {
        return this._pos_;
    }

    public void setPos(PExpLogica2 node)
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
            + toString(this._or_)
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

        if(this._or_ == child)
        {
            this._or_ = null;
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
            setPre((PExpLogica) newChild);
            return;
        }

        if(this._or_ == oldChild)
        {
            setOr((TOr) newChild);
            return;
        }

        if(this._pos_ == oldChild)
        {
            setPos((PExpLogica2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
