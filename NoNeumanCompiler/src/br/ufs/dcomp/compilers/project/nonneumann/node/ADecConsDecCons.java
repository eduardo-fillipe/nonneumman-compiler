/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.ufs.dcomp.compilers.project.nonneumann.node;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class ADecConsDecCons extends PDecCons
{
    private TTkSignParOpen _tkSignParOpen_;
    private TTkReservedConst _tkReservedConst_;
    private PType _type_;
    private TTkId _tkId_;
    private PDecConsAux _decConsAux_;
    private TTkSignParClose _tkSignParClose_;

    public ADecConsDecCons()
    {
        // Constructor
    }

    public ADecConsDecCons(
        @SuppressWarnings("hiding") TTkSignParOpen _tkSignParOpen_,
        @SuppressWarnings("hiding") TTkReservedConst _tkReservedConst_,
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") TTkId _tkId_,
        @SuppressWarnings("hiding") PDecConsAux _decConsAux_,
        @SuppressWarnings("hiding") TTkSignParClose _tkSignParClose_)
    {
        // Constructor
        setTkSignParOpen(_tkSignParOpen_);

        setTkReservedConst(_tkReservedConst_);

        setType(_type_);

        setTkId(_tkId_);

        setDecConsAux(_decConsAux_);

        setTkSignParClose(_tkSignParClose_);

    }

    @Override
    public Object clone()
    {
        return new ADecConsDecCons(
            cloneNode(this._tkSignParOpen_),
            cloneNode(this._tkReservedConst_),
            cloneNode(this._type_),
            cloneNode(this._tkId_),
            cloneNode(this._decConsAux_),
            cloneNode(this._tkSignParClose_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecConsDecCons(this);
    }

    public TTkSignParOpen getTkSignParOpen()
    {
        return this._tkSignParOpen_;
    }

    public void setTkSignParOpen(TTkSignParOpen node)
    {
        if(this._tkSignParOpen_ != null)
        {
            this._tkSignParOpen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tkSignParOpen_ = node;
    }

    public TTkReservedConst getTkReservedConst()
    {
        return this._tkReservedConst_;
    }

    public void setTkReservedConst(TTkReservedConst node)
    {
        if(this._tkReservedConst_ != null)
        {
            this._tkReservedConst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tkReservedConst_ = node;
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
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

    public PDecConsAux getDecConsAux()
    {
        return this._decConsAux_;
    }

    public void setDecConsAux(PDecConsAux node)
    {
        if(this._decConsAux_ != null)
        {
            this._decConsAux_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decConsAux_ = node;
    }

    public TTkSignParClose getTkSignParClose()
    {
        return this._tkSignParClose_;
    }

    public void setTkSignParClose(TTkSignParClose node)
    {
        if(this._tkSignParClose_ != null)
        {
            this._tkSignParClose_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tkSignParClose_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tkSignParOpen_)
            + toString(this._tkReservedConst_)
            + toString(this._type_)
            + toString(this._tkId_)
            + toString(this._decConsAux_)
            + toString(this._tkSignParClose_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tkSignParOpen_ == child)
        {
            this._tkSignParOpen_ = null;
            return;
        }

        if(this._tkReservedConst_ == child)
        {
            this._tkReservedConst_ = null;
            return;
        }

        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._tkId_ == child)
        {
            this._tkId_ = null;
            return;
        }

        if(this._decConsAux_ == child)
        {
            this._decConsAux_ = null;
            return;
        }

        if(this._tkSignParClose_ == child)
        {
            this._tkSignParClose_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tkSignParOpen_ == oldChild)
        {
            setTkSignParOpen((TTkSignParOpen) newChild);
            return;
        }

        if(this._tkReservedConst_ == oldChild)
        {
            setTkReservedConst((TTkReservedConst) newChild);
            return;
        }

        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(this._tkId_ == oldChild)
        {
            setTkId((TTkId) newChild);
            return;
        }

        if(this._decConsAux_ == oldChild)
        {
            setDecConsAux((PDecConsAux) newChild);
            return;
        }

        if(this._tkSignParClose_ == oldChild)
        {
            setTkSignParClose((TTkSignParClose) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
