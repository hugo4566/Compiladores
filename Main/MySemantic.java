package Main;

 
import java.util.*; // for the Hashtable

import node.*;
import analysis.*;
 
public class MySemantic extends DepthFirstAdapter {
   
    // stores the identifiers being defined
    Hashtable symbol_table = new Hashtable<String, MySimbolo>(); // create a new table
    Stack<String> pilha = new Stack<String>();
    
    
    @Override
    public void outAVariableDeclaracao(AVariableDeclaracao node)
    {
    	String tipo = node.getTipo().toString();
    	LinkedList<PVar> x = node.getVar();
    	
    	
    	for (int i = 0; i < x.size(); i++) {
    		String variavel = x.get(i).toString();
			if(symbol_table.containsKey(variavel)){
				System.err.println("Variavel "+ variavel +"já definida.");
				System.exit(0);
			}
			else {
				MySimbolo simbolo = new MySimbolo(tipo,null);
				symbol_table.put(x.get(i).toString(), simbolo);
			}
    	}
    }  
    
    @Override
    public void outAConstantDeclaracao(AConstantDeclaracao node)
    {
    	
    	if(symbol_table.containsKey(node.getId().toString())){
			System.err.println("Variavel "+ node.getId().toString() +"já definida.");
			System.exit(0);
		}
		else {
			MySimbolo simbolo = new MySimbolo("CONSTANT",node.getValor().toString());
			symbol_table.put(node.getId().toString(), simbolo);
		}
    }
    
    @Override
    public void inAPrograma(APrograma node)
    {
    	MySimbolo simbolo = new MySimbolo("PROGRAMA",null);
		symbol_table.put(node.getId().toString(), simbolo);
    }
    
    @Override
    public void outStart(Start node)
    {
		System.out.println(symbol_table.toString());
    }
    
    @Override
    public void outAVarValueExp(AVarValueExp node){
    	pilha.push(node.getVarValue().toString());
    }
    
    @Override
    public void outAAtribComando(AAtribComando node)
    {
    	String x = pilha.pop();
    	
    	if(!symbol_table.containsKey(node.getVar().toString())){
    		System.out.println("Error: Unknown identifier.");
    		System.exit(0);
    	}else{
    		MySimbolo simbolo = (MySimbolo) symbol_table.get(node.getVar().toString());
    		simbolo.valor = x;
    		if(!simbolo.getTipoValor().equals(simbolo.tipo)){
    			System.out.println("Error: Dif. Type.");
        		System.exit(0);
    		}
    	}
    }
    
//    @Override
//    public void outAAssignStatement(AAssignStatement node) {
//        Tidentifier ident = node.getIdentifier();
//        String key = ident.getText().toUpperCase();
// 
//        // Is the identifier in the table?
//        // if not report error
//        if (!symbol_table.containsKey(key)) {
//            System.out.println("Error: [" + ident.getLine() + "," ident.getPos() + "] Unknown identifier.");
//            System.exit(0);
//        }
//    }

    //public void outAVariableDeclaracao (A)
    /*
    // check if the identifier is already in the table and report an error
    // if it is
    public void outASingleIdentifierList(AidentifierList node) {
        // identifier to be stored in the symbol table
        TIdentifier ident = node.getIdentifier();
     
        // name of the identifier to be stored in the table
        String key = ident.getText().toUpperCase(); //is the identifier in the table?
 
        if (symbol_table.containsKey(key)) { // report an error
            System.out.println("Identifier already defined.");
            System.exit(0);
        }
        else {
            symbol_table.put(key, key);
        }
    }
 
    // same as above
    public void outASingleIdentifierList(AidentifierList node) {
        // identifier to be stored in the symbol table
        TIdentifier ident = node.getIdentifier();
 
        // name of the identifier to be stored in the table
        String key = ident.getText().toUpperCase(); // is the identifier in the table?
 
        if (symbol_table.containsKey(key)) { // report an error
            System.out.println("Error: [" ident.getLine() + "," + ident.getPos() + "] Identifier already defined.");
            System.exit(0);
        }
        else {
            symbol_table.put(key, key);
        }
    }
 
    // checks if the identifier in the assignment statement was previously
    // declared, and report an error if it wasn’t
    public void outAAssignStatement(AAssignStatement node) {
        Tidentifier ident = node.getIdentifier();
        String key = ident.getText().toUpperCase();
 
        // Is the identifier in the table?
        // if not report error
        if (!symbol_table.containsKey(key)) {
            System.out.println("Error: [" + ident.getLine() + "," ident.getPos() + "] Unknown identifier.");
            System.exit(0);
        }
    }
 
    // same as above
    public void outAIdentifierFactor(AIdentifierFactor node) {
        Tidentifier ident = node.getIdentifier();
        String key = ident.getText().toUpperCase();
 
        // Is the identifier in the table?
        // if not report error
        if (!symbol_table.containsKey(key)) {
            System.out.println("Error: [" + ident.getLine() + "," + ident.getPos() + "] Unknown identifier.");
            System.exit(0);
        }
    }
    * */
}