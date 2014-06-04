package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import parser.Parser;
import Main.MyLexer;
import node.Start;
import node.Token;


public class Main {

	public static void main(String[] args) throws IOException {

		long start_time, stop_time;

		if(args.length < 1){
			System.out.println("Passe algum arquivo, como parametro, para testar");
		}else{

	        try {
	            start_time = System.currentTimeMillis();
	            MyLexer lexer = new MyLexer (new PushbackReader(new BufferedReader(new FileReader(args[0])), 1024));
	            System.out.println();
	            /*while (true) {
	            	Token t = lexer.next();
	            	String newline = t.toString();
	            	//System.out.println(t.getClass().toString());
	            	String identificado = t.getClass().toString().replaceAll("class node\\.T?", "");
	            	if(!identificado.equals("EOF")){
	            		if (newline.contains("\n"))
	            			System.out.println(identificado);
	            		else
	            			System.out.print(identificado + " ");
	            	}		
	            	if(t.getText().isEmpty()){
	            		System.out.println("\n");
	            		break;
	            	}
	        	}*/
	            stop_time = System.currentTimeMillis();
	            System.out.println("Tempo de execução :"+( stop_time - start_time)+"ms\n");
			
	            Parser parser = new Parser(lexer);
	            Start ast = parser.parse(); 
//	            ast.apply(new SemanticAnalyser());  
//	            ast.apply(new ClassGenerator());
	        }
	        catch (Exception e) {
	            System.out.println(e);
	        }
		}
	}

}
