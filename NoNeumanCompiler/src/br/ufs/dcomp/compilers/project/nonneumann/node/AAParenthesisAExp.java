/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class AAParenthesisAExp extends PAExp
{
    private PAExp _aExp_;

    public AAParenthesisAExp()
    {
        // Constructor
    }

    public AAParenthesisAExp(
        @SuppressWarnings("hiding") PAExp _aExp_)
    {
        // Constructor
        setAExp(_aExp_);

    }

    @Override
    public Object clone()
    {
        return new AAParenthesisAExp(
            cloneNode(this._aExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAParenthesisAExp(this);
    }

    public PAExp getAExp()
    {
        return this._aExp_;
    }

    public void setAExp(PAExp node)
    {
        if(this._aExp_ != null)
        {
            this._aExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aExp_ == child)
        {
            this._aExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aExp_ == oldChild)
        {
            setAExp((PAExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
