/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TIntHexadecimal extends Token
{
    public TIntHexadecimal(String text)
    {
        setText(text);
    }

    public TIntHexadecimal(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIntHexadecimal(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIntHexadecimal(this);
    }
}
