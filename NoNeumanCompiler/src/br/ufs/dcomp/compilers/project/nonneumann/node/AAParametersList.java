/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class AAParametersList extends PAParametersList
{
    private PAParameter _aParameter_;

    public AAParametersList()
    {
        // Constructor
    }

    public AAParametersList(
        @SuppressWarnings("hiding") PAParameter _aParameter_)
    {
        // Constructor
        setAParameter(_aParameter_);

    }

    @Override
    public Object clone()
    {
        return new AAParametersList(
            cloneNode(this._aParameter_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAParametersList(this);
    }

    public PAParameter getAParameter()
    {
        return this._aParameter_;
    }

    public void setAParameter(PAParameter node)
    {
        if(this._aParameter_ != null)
        {
            this._aParameter_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aParameter_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aParameter_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aParameter_ == child)
        {
            this._aParameter_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aParameter_ == oldChild)
        {
            setAParameter((PAParameter) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
