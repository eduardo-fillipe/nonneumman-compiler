/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class ATkReservedBoolFalseBooleanValue extends PBooleanValue
{
    private TTkReservedBoolFalse _tkReservedBoolFalse_;

    public ATkReservedBoolFalseBooleanValue()
    {
        // Constructor
    }

    public ATkReservedBoolFalseBooleanValue(
        @SuppressWarnings("hiding") TTkReservedBoolFalse _tkReservedBoolFalse_)
    {
        // Constructor
        setTkReservedBoolFalse(_tkReservedBoolFalse_);

    }

    @Override
    public Object clone()
    {
        return new ATkReservedBoolFalseBooleanValue(
            cloneNode(this._tkReservedBoolFalse_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATkReservedBoolFalseBooleanValue(this);
    }

    public TTkReservedBoolFalse getTkReservedBoolFalse()
    {
        return this._tkReservedBoolFalse_;
    }

    public void setTkReservedBoolFalse(TTkReservedBoolFalse node)
    {
        if(this._tkReservedBoolFalse_ != null)
        {
            this._tkReservedBoolFalse_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tkReservedBoolFalse_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tkReservedBoolFalse_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tkReservedBoolFalse_ == child)
        {
            this._tkReservedBoolFalse_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tkReservedBoolFalse_ == oldChild)
        {
            setTkReservedBoolFalse((TTkReservedBoolFalse) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}