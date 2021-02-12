
package br.ufs.dcomp.compilers.project.nonneumann.semantic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import br.ufs.dcomp.compilers.project.nonneumann.analysis.DepthFirstAdapter;
import br.ufs.dcomp.compilers.project.nonneumann.node.AAParameters;
import br.ufs.dcomp.compilers.project.nonneumann.node.AAParametersAux;
import br.ufs.dcomp.compilers.project.nonneumann.node.AAParametersFunctionAux;
import br.ufs.dcomp.compilers.project.nonneumann.node.AAProgram;
import br.ufs.dcomp.compilers.project.nonneumann.node.ADecAFunctionDec;
import br.ufs.dcomp.compilers.project.nonneumann.node.AEntryAFunctionDec;
import br.ufs.dcomp.compilers.project.nonneumann.node.PAParameter;
import br.ufs.dcomp.compilers.project.nonneumann.node.PAParameters;
import br.ufs.dcomp.compilers.project.nonneumann.node.Start;
import br.ufs.dcomp.compilers.project.nonneumann.semantic.declaration.FunctionSymbol;
import br.ufs.dcomp.compilers.project.nonneumann.semantic.declaration.SymbolTable;

public class SemanticAnalyzer extends DepthFirstAdapter{

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
          if (st.isHasEntryFunction()) {
               throw new RuntimeException("Mais de uma fun��o entry");
          }
          st.setHasEntryFunction(true);
          st.openScope();
     }

     @Override
     public void outADecAFunctionDec(ADecAFunctionDec node) {
          System.out.println("Semantico -> Removendo o escopo para a função: " + (st.getScopeCount() - 1));
          st.closeCurrentScope();      
     }
     

     @Override
     public void inADecAFunctionDec(ADecAFunctionDec node) {
          System.out.println("Semantico -> Iniciando o escopo para a função: " + (st.getScopeCount() + 1));
          st.openScope();
          List<PAParameters> parametros = ((AAParametersFunctionAux)node.getAParametersFunctionAux()).getAParameters();
          List<PAParameter> p = new ArrayList<PAParameter>();
          parametros.forEach(t -> {
               p.add(((AAParameters)t).getAParameter());
               p.addAll(((AAParameters)t).getAParametersAux().stream().map(y -> {
                   return ((AAParametersAux)y).getAParameter(); 
               }).collect(Collectors.toList()));
          });
          
     }
     
     
      @Override
     public void inAAParametersFunctionAux(AAParametersFunctionAux node) {           
     }

     @Override
     public void outAEntryAFunctionDec(AEntryAFunctionDec node) {

          System.out.println("Semantico -> Removendo o escopo para a função: " + (st.getScopeCount() - 1));
          st.closeCurrentScope();
     }
}
