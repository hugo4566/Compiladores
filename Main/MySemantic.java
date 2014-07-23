package Main;

 
import java.util.*; // for the Hashtable
import node.*;
import analysis.*;
 
public class MySemantic extends DepthFirstAdapter {
   /*
    // stores the identifiers being defined
    Hashtable symbol_table = new Hashtable(); // create a new table
 
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