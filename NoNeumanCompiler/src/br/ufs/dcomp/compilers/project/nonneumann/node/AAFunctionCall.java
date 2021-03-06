/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import java.util.*;
import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class AAFunctionCall extends PAFunctionCall
{
    private TTkId _tkId_;
    private final LinkedList<PAExpList> _aExpList_ = new LinkedList<PAExpList>();

    public AAFunctionCall()
    {
        // Constructor
    }

    public AAFunctionCall(
        @SuppressWarnings("hiding") TTkId _tkId_,
        @SuppressWarnings("hiding") List<?> _aExpList_)
    {
        // Constructor
        setTkId(_tkId_);

        setAExpList(_aExpList_);

    }

    @Override
    public Object clone()
    {
        return new AAFunctionCall(
            cloneNode(this._tkId_),
            cloneList(this._aExpList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAFunctionCall(this);
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

    public LinkedList<PAExpList> getAExpList()
    {
        return this._aExpList_;
    }

    public void setAExpList(List<?> list)
    {
        for(PAExpList e : this._aExpList_)
        {
            e.parent(null);
        }
        this._aExpList_.clear();

        for(Object obj_e : list)
        {
            PAExpList e = (PAExpList) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._aExpList_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tkId_)
            + toString(this._aExpList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tkId_ == child)
        {
            this._tkId_ = null;
            return;
        }

        if(this._aExpList_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tkId_ == oldChild)
        {
            setTkId((TTkId) newChild);
            return;
        }

        for(ListIterator<PAExpList> i = this._aExpList_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAExpList) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
