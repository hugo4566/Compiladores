/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class APrograma extends PPrograma
{
    private TProgram _program_;
    private TId _id_;
    private TBegin _begin_;
    private final LinkedList<PDeclaracao> _declaracao_ = new LinkedList<PDeclaracao>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();
    private TEnd _end_;
    private TDot _dot_;

    public APrograma()
    {
        // Constructor
    }

    public APrograma(
        @SuppressWarnings("hiding") TProgram _program_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TBegin _begin_,
        @SuppressWarnings("hiding") List<?> _declaracao_,
        @SuppressWarnings("hiding") List<?> _comando_,
        @SuppressWarnings("hiding") TEnd _end_,
        @SuppressWarnings("hiding") TDot _dot_)
    {
        // Constructor
        setProgram(_program_);

        setId(_id_);

        setBegin(_begin_);

        setDeclaracao(_declaracao_);

        setComando(_comando_);

        setEnd(_end_);

        setDot(_dot_);

    }

    @Override
    public Object clone()
    {
        return new APrograma(
            cloneNode(this._program_),
            cloneNode(this._id_),
            cloneNode(this._begin_),
            cloneList(this._declaracao_),
            cloneList(this._comando_),
            cloneNode(this._end_),
            cloneNode(this._dot_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrograma(this);
    }

    public TProgram getProgram()
    {
        return this._program_;
    }

    public void setProgram(TProgram node)
    {
        if(this._program_ != null)
        {
            this._program_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._program_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TBegin getBegin()
    {
        return this._begin_;
    }

    public void setBegin(TBegin node)
    {
        if(this._begin_ != null)
        {
            this._begin_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._begin_ = node;
    }

    public LinkedList<PDeclaracao> getDeclaracao()
    {
        return this._declaracao_;
    }

    public void setDeclaracao(List<?> list)
    {
        for(PDeclaracao e : this._declaracao_)
        {
            e.parent(null);
        }
        this._declaracao_.clear();

        for(Object obj_e : list)
        {
            PDeclaracao e = (PDeclaracao) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._declaracao_.add(e);
        }
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

    public TEnd getEnd()
    {
        return this._end_;
    }

    public void setEnd(TEnd node)
    {
        if(this._end_ != null)
        {
            this._end_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._end_ = node;
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._program_)
            + toString(this._id_)
            + toString(this._begin_)
            + toString(this._declaracao_)
            + toString(this._comando_)
            + toString(this._end_)
            + toString(this._dot_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._program_ == child)
        {
            this._program_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._begin_ == child)
        {
            this._begin_ = null;
            return;
        }

        if(this._declaracao_.remove(child))
        {
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        if(this._end_ == child)
        {
            this._end_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._program_ == oldChild)
        {
            setProgram((TProgram) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._begin_ == oldChild)
        {
            setBegin((TBegin) newChild);
            return;
        }

        for(ListIterator<PDeclaracao> i = this._declaracao_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDeclaracao) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
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

        if(this._end_ == oldChild)
        {
            setEnd((TEnd) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
