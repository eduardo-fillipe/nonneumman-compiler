/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class AAParameters extends PAParameters
{
    private PAParameter _aParameter_;
    private PAParametersAux _aParametersAux_;

    public AAParameters()
    {
        // Constructor
    }

    public AAParameters(
        @SuppressWarnings("hiding") PAParameter _aParameter_,
        @SuppressWarnings("hiding") PAParametersAux _aParametersAux_)
    {
        // Constructor
        setAParameter(_aParameter_);

        setAParametersAux(_aParametersAux_);

    }

    @Override
    public Object clone()
    {
        return new AAParameters(
            cloneNode(this._aParameter_),
            cloneNode(this._aParametersAux_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAParameters(this);
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

    public PAParametersAux getAParametersAux()
    {
        return this._aParametersAux_;
    }

    public void setAParametersAux(PAParametersAux node)
    {
        if(this._aParametersAux_ != null)
        {
            this._aParametersAux_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aParametersAux_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aParameter_)
            + toString(this._aParametersAux_);
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

        if(this._aParametersAux_ == child)
        {
            this._aParametersAux_ = null;
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

        if(this._aParametersAux_ == oldChild)
        {
            setAParametersAux((PAParametersAux) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
