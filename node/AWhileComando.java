/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AWhileComando extends PComando
{
    private TWhile _while_;
    private TLPar _lPar_;
    private PExpLogica _expLogica_;
    private TRPar _rPar_;
    private TDo _do_;
    private final LinkedList<PComandoSemiC> _comandoSemiC_ = new LinkedList<PComandoSemiC>();
    private TEndW _endW_;
    private TSemiC _semiC_;

    public AWhileComando()
    {
        // Constructor
    }

    public AWhileComando(
        @SuppressWarnings("hiding") TWhile _while_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") TDo _do_,
        @SuppressWarnings("hiding") List<?> _comandoSemiC_,
        @SuppressWarnings("hiding") TEndW _endW_,
        @SuppressWarnings("hiding") TSemiC _semiC_)
    {
        // Constructor
        setWhile(_while_);

        setLPar(_lPar_);

        setExpLogica(_expLogica_);

        setRPar(_rPar_);

        setDo(_do_);

        setComandoSemiC(_comandoSemiC_);

        setEndW(_endW_);

        setSemiC(_semiC_);

    }

    @Override
    public Object clone()
    {
        return new AWhileComando(
            cloneNode(this._while_),
            cloneNode(this._lPar_),
            cloneNode(this._expLogica_),
            cloneNode(this._rPar_),
            cloneNode(this._do_),
            cloneList(this._comandoSemiC_),
            cloneNode(this._endW_),
            cloneNode(this._semiC_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWhileComando(this);
    }

    public TWhile getWhile()
    {
        return this._while_;
    }

    public void setWhile(TWhile node)
    {
        if(this._while_ != null)
        {
            this._while_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._while_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
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

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    public TDo getDo()
    {
        return this._do_;
    }

    public void setDo(TDo node)
    {
        if(this._do_ != null)
        {
            this._do_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._do_ = node;
    }

    public LinkedList<PComandoSemiC> getComandoSemiC()
    {
        return this._comandoSemiC_;
    }

    public void setComandoSemiC(List<?> list)
    {
        for(PComandoSemiC e : this._comandoSemiC_)
        {
            e.parent(null);
        }
        this._comandoSemiC_.clear();

        for(Object obj_e : list)
        {
            PComandoSemiC e = (PComandoSemiC) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comandoSemiC_.add(e);
        }
    }

    public TEndW getEndW()
    {
        return this._endW_;
    }

    public void setEndW(TEndW node)
    {
        if(this._endW_ != null)
        {
            this._endW_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._endW_ = node;
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
            + toString(this._while_)
            + toString(this._lPar_)
            + toString(this._expLogica_)
            + toString(this._rPar_)
            + toString(this._do_)
            + toString(this._comandoSemiC_)
            + toString(this._endW_)
            + toString(this._semiC_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._while_ == child)
        {
            this._while_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._do_ == child)
        {
            this._do_ = null;
            return;
        }

        if(this._comandoSemiC_.remove(child))
        {
            return;
        }

        if(this._endW_ == child)
        {
            this._endW_ = null;
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
        if(this._while_ == oldChild)
        {
            setWhile((TWhile) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._do_ == oldChild)
        {
            setDo((TDo) newChild);
            return;
        }

        for(ListIterator<PComandoSemiC> i = this._comandoSemiC_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComandoSemiC) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._endW_ == oldChild)
        {
            setEndW((TEndW) newChild);
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
