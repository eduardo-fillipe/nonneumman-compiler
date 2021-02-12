package br.ufs.dcomp.compilers.project.nonneumann.semantic.declaration;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
	private Stack<Map<AbstractSymbol, AbstractSymbol>> symbolTableStack;
	private boolean hasEntryFunction;
	private int entryFunctionCounter;
	
	public SymbolTable() {
		super();
		hasEntryFunction = false;
		symbolTableStack = new Stack<Map<AbstractSymbol,AbstractSymbol>>();
	}
	
	public AbstractSymbol getSymbol(AbstractSymbol name) {
		return symbolTableStack.peek().get(name);
	}
	
	public void addSymbolToCurrentScope(AbstractSymbol symbol) {
		symbolTableStack.peek().put(symbol, symbol);
			
	}
	
	public void openScope() {
		symbolTableStack.push(new LinkedHashMap<AbstractSymbol, AbstractSymbol>(1000));
	}
	
	public void closeCurrentScope() {
		symbolTableStack.pop();
	}
	
	public int getScopeCount() {
		return symbolTableStack.size();
	}

	/**
	 * @return the hasEntryFunction
	 */
	public boolean isHasEntryFunction() {
		return hasEntryFunction;
	}

	/**
	 * @param hasEntryFunction the hasEntryFunction to set
	 */
	public void setHasEntryFunction(boolean hasEntryFunction) {
		this.hasEntryFunction = hasEntryFunction;
	}

	/**
	 * @return the entryFunctionCounter
	 */
	public int getEntryFunctionCounter() {
		return entryFunctionCounter;
	}

	/**
	 * @param entryFunctionCounter the entryFunctionCounter to set
	 */
	public void setEntryFunctionCounter(int entryFunctionCounter) {
		this.entryFunctionCounter = entryFunctionCounter;
	}
	
	
	
	
}
