/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class AANumeralFloatALiteral extends PALiteral
{
    private PANumeralFloat _aNumeralFloat_;

    public AANumeralFloatALiteral()
    {
        // Constructor
    }

    public AANumeralFloatALiteral(
        @SuppressWarnings("hiding") PANumeralFloat _aNumeralFloat_)
    {
        // Constructor
        setANumeralFloat(_aNumeralFloat_);

    }

    @Override
    public Object clone()
    {
        return new AANumeralFloatALiteral(
            cloneNode(this._aNumeralFloat_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAANumeralFloatALiteral(this);
    }

    public PANumeralFloat getANumeralFloat()
    {
        return this._aNumeralFloat_;
    }

    public void setANumeralFloat(PANumeralFloat node)
    {
        if(this._aNumeralFloat_ != null)
        {
            this._aNumeralFloat_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aNumeralFloat_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aNumeralFloat_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aNumeralFloat_ == child)
        {
            this._aNumeralFloat_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aNumeralFloat_ == oldChild)
        {
            setANumeralFloat((PANumeralFloat) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
