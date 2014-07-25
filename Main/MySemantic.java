package Main;

import java.util.*; 

import node.*;
import analysis.*;

public class MySemantic extends DepthFirstAdapter {

	Hashtable<String, MySimbolo> symbol_table = new Hashtable<String, MySimbolo>();
	Stack<String> pilha = new Stack<String>();
	/** Declaracao - INICIO  **/
	@Override
	public void outAVariableDeclaracao(AVariableDeclaracao node) {
		String tipo = node.getTipo().toString();
		LinkedList<PVar> listaVar = node.getVar();
		
		for (int i = 0; i < listaVar.size(); i++) {
			String key = listaVar.get(i).toString().replaceAll("\\s+", "");
			if (symbol_table.containsKey(key)) {
				System.err.println("Variavel " + key + "ja definida.");
				System.exit(0);
			} else {
				MySimbolo simbolo = new MySimbolo(tipo, null);
				symbol_table.put(key, simbolo);
			}
		}
		System.out.println(symbol_table.toString());
	}

	@Override
	public void outAConstantDeclaracao(AConstantDeclaracao node) {
		String key = node.getId().toString().replaceAll("\\s+", "");
		if (symbol_table.containsKey(node.getId().toString())) {
			System.err.println("Variavel " + key+ "ja definida.");
			System.exit(0);
		} else {
			MySimbolo simbolo = new MySimbolo("CONSTANT", node.getValor().toString());
			symbol_table.put(key, simbolo);
		}
		System.out.println(symbol_table.toString());
	}
	/** Declaracao - FIM  	**/
	
	@Override
	public void inAPrograma(APrograma node) {
		MySimbolo simbolo = new MySimbolo("PROGRAMA", null);
		symbol_table.put(node.getId().toString(), simbolo);
		System.out.println(symbol_table.toString());
	}

	@Override
	public void outStart(Start node) {
		System.out.println(symbol_table.toString());
	}
	/** Exp - INICIO  		**/
	
	@Override
	public void outAVariableVarValue(AVariableVarValue node) {
		pilha.push(node.getVar().toString().replaceAll("\\s+", ""));
	}
	
	@Override
	public void outAValueVarValue(AValueVarValue node) {
		pilha.push(node.getValor().toString().replaceAll("\\s+", ""));
	}
	
	@Override
    public void outAPlusExp(APlusExp node)
    {	
        String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);
        
        int plus = Integer.valueOf(L)+Integer.valueOf(R);
        pilha.push(""+plus);
    }
    
	@Override
    public void outAMinusExp(AMinusExp node)
    {	
        String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);
        
        int minus = Integer.valueOf(L)-Integer.valueOf(R);
        pilha.push(""+minus);
    }
	
	@Override
    public void outADivExp(ADivExp node)
    {	
        String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);
        
        int div = Integer.valueOf(L)/Integer.valueOf(R);
        pilha.push(""+div);
    }
	
	@Override
    public void outAMultExp(AMultExp node)
    {	
        String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);
        
        int mult = Integer.valueOf(L)*Integer.valueOf(R);
        pilha.push(""+mult);
    }
	/** Exp - FIM			**/
	
	@Override
	public void outAAtribComando(AAtribComando node) {
		String value = pilha.pop();
		String key = node.getVar().toString().replaceAll("\\s+", "");

		if (!symbol_table.containsKey(key)) {
			System.err.println("Erro!! Identificador desconhecido");
			System.exit(0);
		} else {
			MySimbolo simbolo = (MySimbolo) symbol_table.get(key);
			if(!symbol_table.containsKey(value)){
				if(simbolo.isCompativel(value)){
					simbolo.valor = value;
				}else{
					System.err.println("Erro!! Tentou atribuir um tipo diferente a variavel : "+key);
					System.exit(0);
				}
			}else{
				simbolo.valor = verificaELimpa(value);
			}
		}
		
		System.out.println(symbol_table.toString());
	}
	
	@Override
    public void outAEqualExpLogica(AEqualExpLogica node)
    {
		String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);
        
        boolean bool = (Integer.valueOf(L) ==Integer.valueOf(R));
        pilha.push(""+bool);
    }
	
	@Override
    public void outAAndExpLogica(AAndExpLogica node)
    {
		String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);
        
        boolean bool = (Boolean.parseBoolean(L) && Boolean.parseBoolean(R));
        pilha.push(""+bool);
    }
    
    @Override
    public void caseAIfComando(AIfComando node)
    {
        inAIfComando(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
        	if(pilha.pop().equals("true")){
	            List<PComando> copy = new ArrayList<PComando>(node.getComando());
	            for(PComando e : copy)
	            {
	                e.apply(this);
	            }
        	}
        }
        if(node.getOpElse() != null)
        {
            node.getOpElse().apply(this);
        }
        outAIfComando(node);
    }
    
	//Metodo auxiliar
	private String verificaELimpa(String X) {
		if(symbol_table.containsKey(X)){
        	MySimbolo sR = symbol_table.get(X);
        	if(sR.valor == null)
        		X = sR.getVariavelLimpa();
        	else
        		X = sR.valor;
        }
		return X;
	}
}