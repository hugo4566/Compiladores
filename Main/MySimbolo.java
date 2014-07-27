package Main;

public class MySimbolo {
	
	String tipo;
	String valor;
	
	public MySimbolo(){}
	
	public MySimbolo(String tipo,String valor){
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getType(String value){
		String valor = value.replaceAll("\\s+", "");
		if(valor == null)
			return "";
		else if(valor.contains("\'"))
			return "STRING";
		else if(valor.matches("\\d+")){
			return "inteiro";
		}
		return "";
	}
	
	public boolean isCompativel(String value){
		if(getType(value).equals(tipo.replaceAll("\\s+", "")))
			return true;
		return false;
	}
	
	public String getVariavelLimpa(){
		String tipoDaVariavel = tipo.replaceAll("\\s+", "");
		if(tipoDaVariavel.equals("inteiro")){
			return "0";
		}
		return "";
	}
	
	@Override
	public String toString() {
		return "[Tipo :"+tipo+",Valor :"+valor+"]";
	}
}