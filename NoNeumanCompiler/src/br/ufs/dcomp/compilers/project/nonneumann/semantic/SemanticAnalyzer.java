package br.ufs.dcomp.compilers.project.nonneumann.semantic;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.DepthFirstAdapter;
import br.ufs.dcomp.compilers.project.nonneumann.node.AAProgram;
import br.ufs.dcomp.compilers.project.nonneumann.node.AEntryAFunctionDec;
import br.ufs.dcomp.compilers.project.nonneumann.node.Start;
import br.ufs.dcomp.compilers.project.nonneumann.semantic.declaration.SymbolTable;

public class SemanticAnalyzer extends DepthFirstAdapter {

	private SymbolTable st = new SymbolTable();
	
	@Override
	public void inStart(Start node) {
		System.out.println("Semantico -> Inicio");
	}

	@Override
	public void outStart(Start node) {
		System.out.println("Semantico -> Fim");
	}

	@Override
	public void inAAProgram(AAProgram node) {
		System.out.println("Semantico -> Iniciando o escopo de funcoes...");
		st.openScope();
	}

	@Override
	public void outAAProgram(AAProgram node) {
		System.out.println("Semantico -> Finalizando o escopo de funcoes...");
		st.closeCurrentScope();
	}
	
	@Override
	public void inAEntryAFunctionDec(AEntryAFunctionDec node) {
		System.out.println("Semantico -> Iniciando o escopo para a função: " + (st.getScopeCount() + 1));
		if (!st.isHasEntryFunction() || st.getEntryFunctionCounter() > 1)
			System.out.println("Numero de funções de entrada esperadas: 1. Encontradas: " + st.getEntryFunctionCounter());
		st.openScope();
	}

	@Override
	public void outAEntryAFunctionDec(AEntryAFunctionDec node) {
		System.out.println("Semantico -> Removendo o escopo para a função: " + (st.getScopeCount() - 1));
		st.closeCurrentScope();
	}
}
