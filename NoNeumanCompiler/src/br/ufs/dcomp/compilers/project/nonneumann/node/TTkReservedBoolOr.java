/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TTkReservedBoolOr extends Token
{
    public TTkReservedBoolOr()
    {
        super.setText("or");
    }

    public TTkReservedBoolOr(int line, int pos)
    {
        super.setText("or");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTkReservedBoolOr(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTkReservedBoolOr(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTkReservedBoolOr text.");
    }
}
