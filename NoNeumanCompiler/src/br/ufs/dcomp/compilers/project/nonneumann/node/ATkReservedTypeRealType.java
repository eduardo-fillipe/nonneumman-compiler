/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class ATkReservedTypeRealType extends PType
{
    private TTkReservedTypeReal _tkReservedTypeReal_;

    public ATkReservedTypeRealType()
    {
        // Constructor
    }

    public ATkReservedTypeRealType(
        @SuppressWarnings("hiding") TTkReservedTypeReal _tkReservedTypeReal_)
    {
        // Constructor
        setTkReservedTypeReal(_tkReservedTypeReal_);

    }

    @Override
    public Object clone()
    {
        return new ATkReservedTypeRealType(
            cloneNode(this._tkReservedTypeReal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATkReservedTypeRealType(this);
    }

    public TTkReservedTypeReal getTkReservedTypeReal()
    {
        return this._tkReservedTypeReal_;
    }

    public void setTkReservedTypeReal(TTkReservedTypeReal node)
    {
        if(this._tkReservedTypeReal_ != null)
        {
            this._tkReservedTypeReal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tkReservedTypeReal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tkReservedTypeReal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tkReservedTypeReal_ == child)
        {
            this._tkReservedTypeReal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tkReservedTypeReal_ == oldChild)
        {
            setTkReservedTypeReal((TTkReservedTypeReal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
