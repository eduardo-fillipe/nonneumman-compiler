/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TTkReservedBoolAnd extends Token
{
    public TTkReservedBoolAnd()
    {
        super.setText("and");
    }

    public TTkReservedBoolAnd(int line, int pos)
    {
        super.setText("and");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTkReservedBoolAnd(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTkReservedBoolAnd(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTkReservedBoolAnd text.");
    }
}
