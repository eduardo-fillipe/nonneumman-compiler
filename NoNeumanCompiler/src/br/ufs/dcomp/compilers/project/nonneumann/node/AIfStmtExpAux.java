/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class AIfStmtExpAux extends PIfStmtExpAux
{
    private TTkReservedIf _tkReservedIf_;
    private PTerm _term_;

    public AIfStmtExpAux()
    {
        // Constructor
    }

    public AIfStmtExpAux(
        @SuppressWarnings("hiding") TTkReservedIf _tkReservedIf_,
        @SuppressWarnings("hiding") PTerm _term_)
    {
        // Constructor
        setTkReservedIf(_tkReservedIf_);

        setTerm(_term_);

    }

    @Override
    public Object clone()
    {
        return new AIfStmtExpAux(
            cloneNode(this._tkReservedIf_),
            cloneNode(this._term_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfStmtExpAux(this);
    }

    public TTkReservedIf getTkReservedIf()
    {
        return this._tkReservedIf_;
    }

    public void setTkReservedIf(TTkReservedIf node)
    {
        if(this._tkReservedIf_ != null)
        {
            this._tkReservedIf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tkReservedIf_ = node;
    }

    public PTerm getTerm()
    {
        return this._term_;
    }

    public void setTerm(PTerm node)
    {
        if(this._term_ != null)
        {
            this._term_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._term_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tkReservedIf_)
            + toString(this._term_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tkReservedIf_ == child)
        {
            this._tkReservedIf_ = null;
            return;
        }

        if(this._term_ == child)
        {
            this._term_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tkReservedIf_ == oldChild)
        {
            setTkReservedIf((TTkReservedIf) newChild);
            return;
        }

        if(this._term_ == oldChild)
        {
            setTerm((PTerm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}