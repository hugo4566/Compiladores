/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AForOneComando extends PComando
{
    private PVar _var_;
    private TNInt _start_;
    private TNInt _step_;
    private TNInt _stop_;
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();

    public AForOneComando()
    {
        // Constructor
    }

    public AForOneComando(
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TNInt _start_,
        @SuppressWarnings("hiding") TNInt _step_,
        @SuppressWarnings("hiding") TNInt _stop_,
        @SuppressWarnings("hiding") List<?> _comando_)
    {
        // Constructor
        setVar(_var_);

        setStart(_start_);

        setStep(_step_);

        setStop(_stop_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AForOneComando(
            cloneNode(this._var_),
            cloneNode(this._start_),
            cloneNode(this._step_),
            cloneNode(this._stop_),
            cloneList(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAForOneComando(this);
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public TNInt getStart()
    {
        return this._start_;
    }

    public void setStart(TNInt node)
    {
        if(this._start_ != null)
        {
            this._start_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._start_ = node;
    }

    public TNInt getStep()
    {
        return this._step_;
    }

    public void setStep(TNInt node)
    {
        if(this._step_ != null)
        {
            this._step_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._step_ = node;
    }

    public TNInt getStop()
    {
        return this._stop_;
    }

    public void setStop(TNInt node)
    {
        if(this._stop_ != null)
        {
            this._stop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stop_ = node;
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._var_)
            + toString(this._start_)
            + toString(this._step_)
            + toString(this._stop_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._start_ == child)
        {
            this._start_ = null;
            return;
        }

        if(this._step_ == child)
        {
            this._step_ = null;
            return;
        }

        if(this._stop_ == child)
        {
            this._stop_ = null;
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._start_ == oldChild)
        {
            setStart((TNInt) newChild);
            return;
        }

        if(this._step_ == oldChild)
        {
            setStep((TNInt) newChild);
            return;
        }

        if(this._stop_ == oldChild)
        {
            setStop((TNInt) newChild);
            return;
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
