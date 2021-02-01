/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class ASignatureAParameterSignature extends PAParameterSignature
{
    private PASignature _aSignature_;

    public ASignatureAParameterSignature()
    {
        // Constructor
    }

    public ASignatureAParameterSignature(
        @SuppressWarnings("hiding") PASignature _aSignature_)
    {
        // Constructor
        setASignature(_aSignature_);

    }

    @Override
    public Object clone()
    {
        return new ASignatureAParameterSignature(
            cloneNode(this._aSignature_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASignatureAParameterSignature(this);
    }

    public PASignature getASignature()
    {
        return this._aSignature_;
    }

    public void setASignature(PASignature node)
    {
        if(this._aSignature_ != null)
        {
            this._aSignature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aSignature_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aSignature_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aSignature_ == child)
        {
            this._aSignature_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aSignature_ == oldChild)
        {
            setASignature((PASignature) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
