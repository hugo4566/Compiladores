/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TEndIf extends Token
{
    public TEndIf()
    {
        super.setText("fim se");
    }

    public TEndIf(int line, int pos)
    {
        super.setText("fim se");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEndIf(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndIf(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEndIf text.");
    }
}
