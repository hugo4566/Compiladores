/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TFrom extends Token
{
    public TFrom()
    {
        super.setText("de");
    }

    public TFrom(int line, int pos)
    {
        super.setText("de");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFrom(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFrom(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFrom text.");
    }
}