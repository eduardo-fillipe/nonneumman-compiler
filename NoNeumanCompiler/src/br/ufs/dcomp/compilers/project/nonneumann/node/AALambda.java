/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class AALambda extends PALambda
{
    private PAIdList _aIdList_;
    private PAExp _aExp_;
    private PALambdaExpList _aLambdaExpList_;

    public AALambda()
    {
        // Constructor
    }

    public AALambda(
        @SuppressWarnings("hiding") PAIdList _aIdList_,
        @SuppressWarnings("hiding") PAExp _aExp_,
        @SuppressWarnings("hiding") PALambdaExpList _aLambdaExpList_)
    {
        // Constructor
        setAIdList(_aIdList_);

        setAExp(_aExp_);

        setALambdaExpList(_aLambdaExpList_);

    }

    @Override
    public Object clone()
    {
        return new AALambda(
            cloneNode(this._aIdList_),
            cloneNode(this._aExp_),
            cloneNode(this._aLambdaExpList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAALambda(this);
    }

    public PAIdList getAIdList()
    {
        return this._aIdList_;
    }

    public void setAIdList(PAIdList node)
    {
        if(this._aIdList_ != null)
        {
            this._aIdList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aIdList_ = node;
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

    public PALambdaExpList getALambdaExpList()
    {
        return this._aLambdaExpList_;
    }

    public void setALambdaExpList(PALambdaExpList node)
    {
        if(this._aLambdaExpList_ != null)
        {
            this._aLambdaExpList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aLambdaExpList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aIdList_)
            + toString(this._aExp_)
            + toString(this._aLambdaExpList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aIdList_ == child)
        {
            this._aIdList_ = null;
            return;
        }

        if(this._aExp_ == child)
        {
            this._aExp_ = null;
            return;
        }

        if(this._aLambdaExpList_ == child)
        {
            this._aLambdaExpList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aIdList_ == oldChild)
        {
            setAIdList((PAIdList) newChild);
            return;
        }

        if(this._aExp_ == oldChild)
        {
            setAExp((PAExp) newChild);
            return;
        }

        if(this._aLambdaExpList_ == oldChild)
        {
            setALambdaExpList((PALambdaExpList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}