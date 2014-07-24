package Main;

import node.*;

public class MySimbolo {
	
	String tipo;
	String valor;
	
	public MySimbolo(){}
	
	public MySimbolo(String tipo,String valor){
		this.tipo = tipo;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "[Tipo :"+tipo+",Valor :"+valor+"]";
	}
	
	public String getTipoValor(){
		if(valor == null){return "";}
		if(valor.contains("\'")){
			return "STRING";
		}
		if(valor.matches("\\d+")){
			return "inteiro";
		}
		
		return "";
	}
}
