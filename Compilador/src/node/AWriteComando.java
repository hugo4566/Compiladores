/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AWriteComando extends PComando
{
    private final LinkedList<PExprComma> _exprComma_ = new LinkedList<PExprComma>();
    private PExp _exp_;

    public AWriteComando()
    {
        // Constructor
    }

    public AWriteComando(
        @SuppressWarnings("hiding") List<?> _exprComma_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setExprComma(_exprComma_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AWriteComando(
            cloneList(this._exprComma_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWriteComando(this);
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
            + toString(this._exprComma_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprComma_.remove(child))
        {
            return;
        }

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

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
