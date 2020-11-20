package nonNeumann;

import java.io.*;

import br.ufs.dcomp.compilers.project.nonneumann.lexer.Lexer;
import br.ufs.dcomp.compilers.project.nonneumann.node.EOF;
import br.ufs.dcomp.compilers.project.nonneumann.node.Token;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "test/nonNeumann/test.non";

			Lexer lexer =
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024)); 
			Token token;
			while(!((token = lexer.next()) instanceof EOF)) {
				System.out.print(token.getClass());
				System.out.println("("+token.getText()+")");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}