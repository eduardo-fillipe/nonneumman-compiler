package br.ufs.dcomp.compilers.project.nonneumann.semantic.declaration;

public abstract class AbstractSymbol {
	private final int SHIFT = 5;
	
	protected String name;
	protected Type type;
	
	public AbstractSymbol(String name, Type type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public AbstractSymbol() {
		super();
	}


	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}

	protected Type getType() {
		return type;
	}


	protected void setType(Type type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		int result = 0;
		
		for (char c : name.toCharArray())
			result = ((result << SHIFT) + (int)c);
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractSymbol other = (AbstractSymbol) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
