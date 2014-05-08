import parser.*;
import lexer.*;
import node.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;


public class Main {

	public static void main(String[] args) throws IOException {

		long start_time, stop_time;

		if(args.length < 1){
			System.out.println("Passe algum arquivo, como parametro, para testar");
		}else{

	        try {
	            start_time = System.currentTimeMillis();// create lexer
	            Lexer lexer = new Lexer (new PushbackReader(new BufferedReader(new FileReader(args[0])), 1024));
	            Token t = lexer.next();
	            while () { 
	            	try{
	            		System.out.println(t.toString());
	            		t = lexer.next();
	            		
	            	}catch(Exception e){
	            		System.out.println("Pau!");
	            		break;
	            	}
	        	}
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
