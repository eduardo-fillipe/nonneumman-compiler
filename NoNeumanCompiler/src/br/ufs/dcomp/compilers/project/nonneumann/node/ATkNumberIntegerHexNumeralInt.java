/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class ATkNumberIntegerHexNumeralInt extends PNumeralInt
{
    private TTkNumberIntegerHex _tkNumberIntegerHex_;

    public ATkNumberIntegerHexNumeralInt()
    {
        // Constructor
    }

    public ATkNumberIntegerHexNumeralInt(
        @SuppressWarnings("hiding") TTkNumberIntegerHex _tkNumberIntegerHex_)
    {
        // Constructor
        setTkNumberIntegerHex(_tkNumberIntegerHex_);

    }

    @Override
    public Object clone()
    {
        return new ATkNumberIntegerHexNumeralInt(
            cloneNode(this._tkNumberIntegerHex_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATkNumberIntegerHexNumeralInt(this);
    }

    public TTkNumberIntegerHex getTkNumberIntegerHex()
    {
        return this._tkNumberIntegerHex_;
    }

    public void setTkNumberIntegerHex(TTkNumberIntegerHex node)
    {
        if(this._tkNumberIntegerHex_ != null)
        {
            this._tkNumberIntegerHex_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tkNumberIntegerHex_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tkNumberIntegerHex_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tkNumberIntegerHex_ == child)
        {
            this._tkNumberIntegerHex_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tkNumberIntegerHex_ == oldChild)
        {
            setTkNumberIntegerHex((TTkNumberIntegerHex) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
