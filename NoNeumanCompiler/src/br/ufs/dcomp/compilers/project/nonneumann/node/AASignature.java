/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class AASignature extends PASignature
{
    private PAType _aType_;
    private TTkId _tkId_;
    private PAParametersSignature _aParametersSignature_;

    public AASignature()
    {
        // Constructor
    }

    public AASignature(
        @SuppressWarnings("hiding") PAType _aType_,
        @SuppressWarnings("hiding") TTkId _tkId_,
        @SuppressWarnings("hiding") PAParametersSignature _aParametersSignature_)
    {
        // Constructor
        setAType(_aType_);

        setTkId(_tkId_);

        setAParametersSignature(_aParametersSignature_);

    }

    @Override
    public Object clone()
    {
        return new AASignature(
            cloneNode(this._aType_),
            cloneNode(this._tkId_),
            cloneNode(this._aParametersSignature_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAASignature(this);
    }

    public PAType getAType()
    {
        return this._aType_;
    }

    public void setAType(PAType node)
    {
        if(this._aType_ != null)
        {
            this._aType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aType_ = node;
    }

    public TTkId getTkId()
    {
        return this._tkId_;
    }

    public void setTkId(TTkId node)
    {
        if(this._tkId_ != null)
        {
            this._tkId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tkId_ = node;
    }

    public PAParametersSignature getAParametersSignature()
    {
        return this._aParametersSignature_;
    }

    public void setAParametersSignature(PAParametersSignature node)
    {
        if(this._aParametersSignature_ != null)
        {
            this._aParametersSignature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aParametersSignature_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aType_)
            + toString(this._tkId_)
            + toString(this._aParametersSignature_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aType_ == child)
        {
            this._aType_ = null;
            return;
        }

        if(this._tkId_ == child)
        {
            this._tkId_ = null;
            return;
        }

        if(this._aParametersSignature_ == child)
        {
            this._aParametersSignature_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aType_ == oldChild)
        {
            setAType((PAType) newChild);
            return;
        }

        if(this._tkId_ == oldChild)
        {
            setTkId((TTkId) newChild);
            return;
        }

        if(this._aParametersSignature_ == oldChild)
        {
            setAParametersSignature((PAParametersSignature) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}