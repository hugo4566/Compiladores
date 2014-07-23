package Main;

import node.*;
import analysis.*;
 
public class AstPrinter extends DepthFirstAdapter {
	int indent;
	
	public void printIndent(){
		for (int i = 0; i < indent; i++) {
			System.out.print("t");
		}
	}
	
	public void printNode(Node node){
		printIndent();
		
                System.out.print(node.getClass().toString().replaceAll("class node\\.T?", ""));
		System.out.println(" "+node.toString() );
	}
	
	@Override
	public void defaultIn(Node node){
		printNode(node);
		indent++;
	}
	
	@Override
	public void defaultOut(Node node){
		indent--;
	}
}