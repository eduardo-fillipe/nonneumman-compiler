/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TTkReservedIf extends Token
{
    public TTkReservedIf()
    {
        super.setText("if");
    }

    public TTkReservedIf(int line, int pos)
    {
        super.setText("if");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTkReservedIf(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTkReservedIf(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTkReservedIf text.");
    }
}