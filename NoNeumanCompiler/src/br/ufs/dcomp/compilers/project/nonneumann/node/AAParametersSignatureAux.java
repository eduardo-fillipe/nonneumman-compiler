/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class AAParametersSignatureAux extends PAParametersSignatureAux
{
    private PAParameterSignature _aParameterSignature_;

    public AAParametersSignatureAux()
    {
        // Constructor
    }

    public AAParametersSignatureAux(
        @SuppressWarnings("hiding") PAParameterSignature _aParameterSignature_)
    {
        // Constructor
        setAParameterSignature(_aParameterSignature_);

    }

    @Override
    public Object clone()
    {
        return new AAParametersSignatureAux(
            cloneNode(this._aParameterSignature_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAParametersSignatureAux(this);
    }

    public PAParameterSignature getAParameterSignature()
    {
        return this._aParameterSignature_;
    }

    public void setAParameterSignature(PAParameterSignature node)
    {
        if(this._aParameterSignature_ != null)
        {
            this._aParameterSignature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aParameterSignature_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aParameterSignature_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aParameterSignature_ == child)
        {
            this._aParameterSignature_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aParameterSignature_ == oldChild)
        {
            setAParameterSignature((PAParameterSignature) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
