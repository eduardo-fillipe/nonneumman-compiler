/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TTkSignPlus extends Token
{
    public TTkSignPlus()
    {
        super.setText("+");
    }

    public TTkSignPlus(int line, int pos)
    {
        super.setText("+");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTkSignPlus(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTkSignPlus(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTkSignPlus text.");
    }
}
