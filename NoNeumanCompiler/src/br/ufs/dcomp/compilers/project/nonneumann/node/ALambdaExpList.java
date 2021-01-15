/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import java.util.*;
import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class ALambdaExpList extends PLambdaExpList
{
    private PExp _exp_;
    private final LinkedList<PLambdaExpListAux> _lambdaExpListAux_ = new LinkedList<PLambdaExpListAux>();

    public ALambdaExpList()
    {
        // Constructor
    }

    public ALambdaExpList(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") List<?> _lambdaExpListAux_)
    {
        // Constructor
        setExp(_exp_);

        setLambdaExpListAux(_lambdaExpListAux_);

    }

    @Override
    public Object clone()
    {
        return new ALambdaExpList(
            cloneNode(this._exp_),
            cloneList(this._lambdaExpListAux_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALambdaExpList(this);
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

    public LinkedList<PLambdaExpListAux> getLambdaExpListAux()
    {
        return this._lambdaExpListAux_;
    }

    public void setLambdaExpListAux(List<?> list)
    {
        for(PLambdaExpListAux e : this._lambdaExpListAux_)
        {
            e.parent(null);
        }
        this._lambdaExpListAux_.clear();

        for(Object obj_e : list)
        {
            PLambdaExpListAux e = (PLambdaExpListAux) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._lambdaExpListAux_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._lambdaExpListAux_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._lambdaExpListAux_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        for(ListIterator<PLambdaExpListAux> i = this._lambdaExpListAux_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PLambdaExpListAux) newChild);
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
