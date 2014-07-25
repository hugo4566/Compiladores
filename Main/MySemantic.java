package Main;

import java.util.*; 

import node.*;
import analysis.*;

public class MySemantic extends DepthFirstAdapter {

	Hashtable<String, MySimbolo> symbol_table = new Hashtable<String, MySimbolo>();
	Stack<String> pilha = new Stack<String>();

	@Override
	public void outAVariableDeclaracao(AVariableDeclaracao node) {
		String tipo = node.getTipo().toString();
		LinkedList<PVar> listaVar = node.getVar();
		
		for (int i = 0; i < listaVar.size(); i++) {
			String key = listaVar.get(i).toString();
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
		String key = node.getId().toString();
		if (symbol_table.containsKey(node.getId().toString())) {
			System.err.println("Variavel " + key+ "ja definida.");
			System.exit(0);
		} else {
			MySimbolo simbolo = new MySimbolo("CONSTANT", node.getValor().toString());
			symbol_table.put(key, simbolo);
		}
		System.out.println(symbol_table.toString());
	}

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

	@Override
	public void outAVarValueExp(AVarValueExp node) {
		pilha.push(node.getVarValue().toString());
	}

	@Override
	public void outAAtribComando(AAtribComando node) {
		String value = pilha.pop();
		String key = node.getVar().toString();

		if (!symbol_table.containsKey(key)) {
			System.err.println("Erro!! Identificador desconhecido");
			System.exit(0);
		} else {
			MySimbolo simbolo = (MySimbolo) symbol_table.get(key);
			if(simbolo.isCompativel(value)){
				simbolo.valor = value;
			}else{
				System.err.println("Erro!! Tentou atribuir um tipo diferente a variavel : "+key);
				System.exit(0);
			}
		}
		
		System.out.println(symbol_table.toString());
	}
	
}