package nonNeumann;

import br.ufs.dcomp.compilers.project.nonneumann.parser.*;
import br.ufs.dcomp.compilers.project.nonneumann.semantic.SemanticAnalyzer;
import br.ufs.dcomp.compilers.project.nonneumann.lexer.*;
import br.ufs.dcomp.compilers.project.nonneumann.node.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {

			String arquivo = "test/nonNeumann/test.non";

			Lexer lex = new Lexer(new PushbackReader(new FileReader(arquivo), 1024));

			Parser p = new Parser(lex);

			Start tree = p.parse();
			// Imprime árvore na saída padrão
			// tree.apply(new ASTPrinter());
			// Imprime árvore em interface gráfica
			//tree.apply(new ASTDisplay());
			tree.apply(new SemanticAnalyzer());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}