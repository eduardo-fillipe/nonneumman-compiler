package br.ufs.dcomp.compilers.project.nonneumann.semantic.declaration;

import java.util.ArrayList;
import java.util.List;

public class FunctionSymbol extends AbstractSymbol{
	private List<AbstractSymbol> parameters;
	private boolean isEntry;
	
	public FunctionSymbol() {
		super();
		this.parameters = new ArrayList<AbstractSymbol>();
	}

	public FunctionSymbol(String name, Type type, List<AbstractSymbol> parameters, boolean isEntry) {
		super(name, type);
		this.parameters = parameters;
		this.isEntry = isEntry;
	}

	protected List<AbstractSymbol> getParameters() {
		return parameters;
	}

	protected void setParameters(List<AbstractSymbol> parameters) {
		this.parameters = parameters;
	}

	protected boolean isEntry() {
		return isEntry;
	}

	protected void setEntry(boolean isEntry) {
		this.isEntry = isEntry;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FunctionSymbol other = (FunctionSymbol) obj;
		
		if (parameters == null) {
			if (other.parameters != null)
				return false;
		} else {
			
			if (!this.name.equals(other.getName()))
				return false;
			
			if (this.parameters.size() != other.getParameters().size())
				return false;
			int i = 0;
			for (AbstractSymbol p : parameters) {
				if (!p.equals(this.parameters.get(i))) {
					return false;
				}
				i++;
			}
		}
		return true;
	}	
}
