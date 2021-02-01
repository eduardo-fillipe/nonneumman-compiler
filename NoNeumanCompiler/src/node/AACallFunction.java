/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AACallFunction extends PACallFunction
{
    private PAListExpressions _aListExpressions_;

    public AACallFunction()
    {
        // Constructor
    }

    public AACallFunction(
        @SuppressWarnings("hiding") PAListExpressions _aListExpressions_)
    {
        // Constructor
        setAListExpressions(_aListExpressions_);

    }

    @Override
    public Object clone()
    {
        return new AACallFunction(
            cloneNode(this._aListExpressions_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAACallFunction(this);
    }

    public PAListExpressions getAListExpressions()
    {
        return this._aListExpressions_;
    }

    public void setAListExpressions(PAListExpressions node)
    {
        if(this._aListExpressions_ != null)
        {
            this._aListExpressions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aListExpressions_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aListExpressions_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aListExpressions_ == child)
        {
            this._aListExpressions_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aListExpressions_ == oldChild)
        {
            setAListExpressions((PAListExpressions) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
