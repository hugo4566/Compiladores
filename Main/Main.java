package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import lexer.Lexer;
import node.Token;


public class Main {

	public static void main(String[] args) throws IOException {

		long start_time, stop_time;

		if(args.length < 1){
			System.out.println("Passe algum arquivo, como parametro, para testar");
		}else{

	        try {
	            start_time = System.currentTimeMillis();
	            Lexer lexer = new Lexer (new PushbackReader(new BufferedReader(new FileReader(args[0])), 1024));
	            while (true) {
	            	Token t = lexer.next();
	            	String identificado = t.getClass().toString().replaceAll("class node\\.T?", "");
	            	if(!identificado.equals("EOF"))
	            	System.out.println(identificado);
	            	if(t.getText().isEmpty()){
	            		break;
	            	}
	        	}
	            stop_time = System.currentTimeMillis();
	            System.out.println("Tempo de execução :"+( stop_time - start_time)+"ms");
//	            Parser parser = new Parser(lexer);
//	            Start ast = parser.parse(); 
//	            ast.apply(new SemanticAnalyser());  
//	            ast.apply(new ClassGenerator());
	        }
	        catch (Exception e) {
	            System.out.println(e);
	        }
		}
	}

}
