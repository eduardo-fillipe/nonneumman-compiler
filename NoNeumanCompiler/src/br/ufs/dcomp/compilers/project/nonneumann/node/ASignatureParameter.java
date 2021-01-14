/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class ASignatureParameter extends PParameter
{
    private PSignature _signature_;

    public ASignatureParameter()
    {
        // Constructor
    }

    public ASignatureParameter(
        @SuppressWarnings("hiding") PSignature _signature_)
    {
        // Constructor
        setSignature(_signature_);

    }

    @Override
    public Object clone()
    {
        return new ASignatureParameter(
            cloneNode(this._signature_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASignatureParameter(this);
    }

    public PSignature getSignature()
    {
        return this._signature_;
    }

    public void setSignature(PSignature node)
    {
        if(this._signature_ != null)
        {
            this._signature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._signature_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._signature_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._signature_ == child)
        {
            this._signature_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._signature_ == oldChild)
        {
            setSignature((PSignature) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
