/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TElse extends Token
{
    public TElse()
    {
        super.setText("senao");
    }

    public TElse(int line, int pos)
    {
        super.setText("senao");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TElse(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTElse(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TElse text.");
    }
}
