package br.ufs.dcomp.compilers.project.nonneumann.semantic.declaration;

public enum Type {
	INT,
	BOOL,
	REAL;
	
	public Type fromString(String type) {
		if ("bool".equals(type))
			return BOOL;
		
		if ("int".equals(type))
			return INT;
		
		if ("real".equals(type))
			return REAL;
		
		throw new IllegalArgumentException("Invalid type.");
	}
}
