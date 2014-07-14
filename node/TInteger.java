/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TInteger extends Token
{
    public TInteger()
    {
        super.setText("inteiro");
    }

    public TInteger(int line, int pos)
    {
        super.setText("inteiro");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInteger(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInteger(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInteger text.");
    }
}
