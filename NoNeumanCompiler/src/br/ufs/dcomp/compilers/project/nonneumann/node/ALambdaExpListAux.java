/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class ALambdaExpListAux extends PLambdaExpListAux
{
    private TTkSignComma _tkSignComma_;
    private PExp _exp_;

    public ALambdaExpListAux()
    {
        // Constructor
    }

    public ALambdaExpListAux(
        @SuppressWarnings("hiding") TTkSignComma _tkSignComma_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setTkSignComma(_tkSignComma_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new ALambdaExpListAux(
            cloneNode(this._tkSignComma_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALambdaExpListAux(this);
    }

    public TTkSignComma getTkSignComma()
    {
        return this._tkSignComma_;
    }

    public void setTkSignComma(TTkSignComma node)
    {
        if(this._tkSignComma_ != null)
        {
            this._tkSignComma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tkSignComma_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tkSignComma_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tkSignComma_ == child)
        {
            this._tkSignComma_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tkSignComma_ == oldChild)
        {
            setTkSignComma((TTkSignComma) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
