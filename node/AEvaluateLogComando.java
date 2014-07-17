/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AEvaluateLogComando extends PComando
{
    private TEvaluate _evaluate_;
    private TLPar _lPar_;
    private PExpLogica _expLogica_;
    private TRPar _rPar_;
    private final LinkedList<PCaseEstrela> _caseEstrela_ = new LinkedList<PCaseEstrela>();
    private POpcionalElseColon _opcionalElseColon_;
    private TEndE _endE_;
    private TSemiC _semiC_;

    public AEvaluateLogComando()
    {
        // Constructor
    }

    public AEvaluateLogComando(
        @SuppressWarnings("hiding") TEvaluate _evaluate_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") List<?> _caseEstrela_,
        @SuppressWarnings("hiding") POpcionalElseColon _opcionalElseColon_,
        @SuppressWarnings("hiding") TEndE _endE_,
        @SuppressWarnings("hiding") TSemiC _semiC_)
    {
        // Constructor
        setEvaluate(_evaluate_);

        setLPar(_lPar_);

        setExpLogica(_expLogica_);

        setRPar(_rPar_);

        setCaseEstrela(_caseEstrela_);

        setOpcionalElseColon(_opcionalElseColon_);

        setEndE(_endE_);

        setSemiC(_semiC_);

    }

    @Override
    public Object clone()
    {
        return new AEvaluateLogComando(
            cloneNode(this._evaluate_),
            cloneNode(this._lPar_),
            cloneNode(this._expLogica_),
            cloneNode(this._rPar_),
            cloneList(this._caseEstrela_),
            cloneNode(this._opcionalElseColon_),
            cloneNode(this._endE_),
            cloneNode(this._semiC_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEvaluateLogComando(this);
    }

    public TEvaluate getEvaluate()
    {
        return this._evaluate_;
    }

    public void setEvaluate(TEvaluate node)
    {
        if(this._evaluate_ != null)
        {
            this._evaluate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._evaluate_ = node;
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

    public LinkedList<PCaseEstrela> getCaseEstrela()
    {
        return this._caseEstrela_;
    }

    public void setCaseEstrela(List<?> list)
    {
        for(PCaseEstrela e : this._caseEstrela_)
        {
            e.parent(null);
        }
        this._caseEstrela_.clear();

        for(Object obj_e : list)
        {
            PCaseEstrela e = (PCaseEstrela) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._caseEstrela_.add(e);
        }
    }

    public POpcionalElseColon getOpcionalElseColon()
    {
        return this._opcionalElseColon_;
    }

    public void setOpcionalElseColon(POpcionalElseColon node)
    {
        if(this._opcionalElseColon_ != null)
        {
            this._opcionalElseColon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opcionalElseColon_ = node;
    }

    public TEndE getEndE()
    {
        return this._endE_;
    }

    public void setEndE(TEndE node)
    {
        if(this._endE_ != null)
        {
            this._endE_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._endE_ = node;
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
            + toString(this._evaluate_)
            + toString(this._lPar_)
            + toString(this._expLogica_)
            + toString(this._rPar_)
            + toString(this._caseEstrela_)
            + toString(this._opcionalElseColon_)
            + toString(this._endE_)
            + toString(this._semiC_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._evaluate_ == child)
        {
            this._evaluate_ = null;
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

        if(this._caseEstrela_.remove(child))
        {
            return;
        }

        if(this._opcionalElseColon_ == child)
        {
            this._opcionalElseColon_ = null;
            return;
        }

        if(this._endE_ == child)
        {
            this._endE_ = null;
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
        if(this._evaluate_ == oldChild)
        {
            setEvaluate((TEvaluate) newChild);
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

        for(ListIterator<PCaseEstrela> i = this._caseEstrela_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PCaseEstrela) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._opcionalElseColon_ == oldChild)
        {
            setOpcionalElseColon((POpcionalElseColon) newChild);
            return;
        }

        if(this._endE_ == oldChild)
        {
            setEndE((TEndE) newChild);
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
