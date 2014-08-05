package Main;

public class MySimbolo {
	
	String tipo;
	String valor;
	String capacidade;
	Boolean constante;
	
	public MySimbolo(){}
	
	public MySimbolo(String tipo,String valor,String capacidade,Boolean constante){
		this.tipo = tipo;
		this.valor = valor;
		this.capacidade = capacidade;
		this.constante = constante;
	}
	
	public String getType(String value){
		String valor = value.replaceAll("\\s+", "");
		if(valor == null)
			return "";
		else if(valor.contains("\'")){
			if(valor.length()-2 <= Integer.valueOf(capacidade))
				return "caractere";
			else{
				System.err.println("Tentou colocar um conjunto de caracteres maior que o definido.");
				System.exit(0);
			}
		}else if(valor.matches("(-)?\\d+")){
			return "inteiro";
		}else if(valor.matches("(-)?\\d+,\\d+")){
			return "real";
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
		if(tipoDaVariavel.equals("inteiro") || tipoDaVariavel.equals("real")){
			return "0";
		}
		return "''";
	}
	
	@Override
	public String toString() {
		return "[Tipo :"+tipo+",Valor :"+valor+",Capacidade :"+capacidade+"]";
	}
}