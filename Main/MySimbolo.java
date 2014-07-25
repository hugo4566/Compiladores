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
	
	public String getType(String value){
		if(value == null)
			return "";
		else if(value.contains("\'"))
			return "STRING";
		else if(value.matches("\\d+")){
			return "inteiro";
		}
		return "";
	}
	
	public boolean isCompativel(String value){
		if(getType(value).equals(tipo))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "[Tipo :"+tipo+",Valor :"+valor+"]";
	}
}