package Main;

import java.util.*; 

import node.*;
import analysis.*;

public class MySemantic extends DepthFirstAdapter {
	
	static String TIPO_INTEIRO = "inteiro";
	static String TIPO_REAL = "real";
	static String TIPO_CHARACTER = "character";

	Hashtable<String, MySimbolo> symbol_table = new Hashtable<String, MySimbolo>();
	Stack<String> pilha = new Stack<String>();
	
	/** Declaracao - INICIO  **/
	@Override
	public void outAVariableDeclaracao(AVariableDeclaracao node) {
		String tipo = node.getTipo().toString();
		LinkedList<PVar> listaVar = node.getVar();
		
		for (int i = 0; i < listaVar.size(); i++) {
			String[] noh = listaVar.get(i).toString().split("\\s+");
			String key = noh[0];
			String tamanho = (noh.length > 1)  ? noh[1] : null ;
			if (symbol_table.containsKey(key)) {
				System.err.println("Variavel " + key + " ja definida.");
				System.exit(0);
			} else {
				MySimbolo simbolo;
				simbolo = new MySimbolo(tipo, null,tamanho,false);
				symbol_table.put(key, simbolo);
			}
		}
		//System.out.println(symbol_table.toString());
	}

	@Override
	public void outAConstantDeclaracao(AConstantDeclaracao node) {
		String key = node.getId().toString().replaceAll("\\s+", "");
		if (symbol_table.containsKey(node.getId().toString())) {
			System.err.println("Variavel " + key+ "ja definida.");
			System.exit(0);
		} else {
			MySimbolo simbolo = new MySimbolo("CONSTANT", node.getValor().toString(),null,true);
			symbol_table.put(key, simbolo);
		}
		//System.out.println(symbol_table.toString());
	}
	/** Declaracao - FIM  	**/
	
	@Override
	public void inAPrograma(APrograma node) {
		MySimbolo simbolo = new MySimbolo("PROGRAMA", null,null,true);
		symbol_table.put(node.getId().toString(), simbolo);
		//System.out.println(symbol_table.toString());
	}

	@Override
	public void outStart(Start node) {
		System.out.println(symbol_table.toString());
	}
	
	/** Variaveis & Valores - INICIO  		**/
	@Override
	public void outAVariableVarValue(AVariableVarValue node) {
		pilha.push(node.getVar().toString().replaceAll("\\s+", ""));
	}
	
	@Override
	public void outAValueVarValue(AValueVarValue node) {
		String valor = node.getValor().toString();
		pilha.push(valor.contains("\'") ? valor.substring(0, valor.length()-1) : valor.replaceAll("\\s+", ""));
	}
	/** Variaveis & Valores - FIM  		**/
	
	/** Exp - INICIO  		**/
	@Override
    public void outAPlusExp(APlusExp node)
    {	
        String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);
        if(L.contains("\'") || R.contains("\'")){
        	L = L.replaceAll("\'", "");
        	R = R.replaceAll("\'", "");
        	pilha.push("'"+L+R+"'");
        }else{
			L = L.replaceAll(",",".");
			R = R.replaceAll(",",".");
	        double plus = Double.valueOf(L)+Double.valueOf(R);
	        pilha.push(""+plus);
        }
    }
    
	@Override
    public void outAMinusExp(AMinusExp node)
    {	
        String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);
        
        L = L.replaceAll(",",".");
		R = R.replaceAll(",",".");
        Double minus = Double.valueOf(L)-Double.valueOf(R);
        pilha.push(""+minus);
    }
	
	@Override
    public void outADivExp(ADivExp node)
    {	
        String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);

        L = L.replaceAll(",",".");
		R = R.replaceAll(",",".");
        Double div = Double.valueOf(L)/Double.valueOf(R);
        pilha.push(""+div);
    }
	
	@Override
    public void outAMultExp(AMultExp node)
    {	
        String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);

        L = L.replaceAll(",",".");
		R = R.replaceAll(",",".");
        
        Double mult = Double.valueOf(L)*Double.valueOf(R);
        pilha.push(""+mult);
    }
	/** Exp - FIM			**/
	
	/** Exp_Logica - INICIO  		**/
	@Override
    public void outANegationExpLogica(ANegationExpLogica node)
    {
		boolean bool = !Boolean.parseBoolean(pilha.pop());
		pilha.push(""+bool);
    }
	
	@Override
    public void outAOrExpLogica(AOrExpLogica node)
    {
		String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);
        
        L = L.replaceAll(",",".");
		R = R.replaceAll(",",".");

        boolean bool = (Boolean.parseBoolean(L) || Boolean.parseBoolean(R));
        pilha.push(""+bool);
    }
	
	@Override
    public void outAXorExpLogica(AXorExpLogica node)
    {
		String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);

        L = L.replaceAll(",",".");
		R = R.replaceAll(",",".");
        
        boolean bool = (Boolean.parseBoolean(L) ^ Boolean.parseBoolean(R));
        pilha.push(""+bool);
    }

	@Override
    public void outAAndExpLogica(AAndExpLogica node)
    {
		String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);

        L = L.replaceAll(",",".");
		R = R.replaceAll(",",".");
        
        boolean bool = (Boolean.parseBoolean(L) && Boolean.parseBoolean(R));
        pilha.push(""+bool);
    }
	
	@Override
    public void outAEqualExpLogica(AEqualExpLogica node)
    {
		try{
			String R = pilha.pop();
			String L = pilha.pop();
			L = verificaELimpa(L);
			R = verificaELimpa(R);

			L = L.replaceAll(",",".");
			R = R.replaceAll(",",".");

			boolean bool;
			if(L.contains("\'") && R.contains("\'"))
				bool = L.equals(R);
			else
				bool = (Double.valueOf(L).doubleValue() == Double.valueOf(R).doubleValue());
			pilha.push(""+bool);
		}catch(NumberFormatException e){
			pilha.push(""+false);
		}
    }
	
	@Override
	public void outANotEqualExpLogica(ANotEqualExpLogica node)
    {
		try{
			String R = pilha.pop();
			String L = pilha.pop();
			L = verificaELimpa(L);
			R = verificaELimpa(R);

			L = L.replaceAll(",",".");
			R = R.replaceAll(",",".");

			boolean bool;
			if(L.contains("\'") && R.contains("\'"))
				bool = L.equals(R);
			else
				bool = (Double.valueOf(L).doubleValue() != Double.valueOf(R).doubleValue());
			pilha.push(""+bool);
		}catch(NumberFormatException e){
			pilha.push(""+false);
		}
    }
	
	@Override
    public void outALessEqExpLogica(ALessEqExpLogica node)
    {
		String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);

        L = L.replaceAll(",",".");
		R = R.replaceAll(",",".");
        
        boolean bool = (Double.valueOf(L).doubleValue() <= Double.valueOf(R).doubleValue());
        pilha.push(""+bool);
    }
	
	@Override
    public void outALessExpLogica(ALessExpLogica node)
    {
		String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);

        L = L.replaceAll(",",".");
		R = R.replaceAll(",",".");
        
        boolean bool = (Double.valueOf(L).doubleValue() < Double.valueOf(R).doubleValue());
        pilha.push(""+bool);
    }
	
	@Override
    public void outAGreaterEqExpLogica(AGreaterEqExpLogica node)
    {
    	String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);

        L = L.replaceAll(",",".");
		R = R.replaceAll(",",".");
        
        boolean bool = (Double.valueOf(L).doubleValue() >= Double.valueOf(R).doubleValue());
        pilha.push(""+bool);
    }
    
	@Override
    public void outAGreaterExpLogica(AGreaterExpLogica node)
    {
    	String R = pilha.pop();
        String L = pilha.pop();
        L = verificaELimpa(L);
        R = verificaELimpa(R);

        L = L.replaceAll(",",".");
		R = R.replaceAll(",",".");
        
        boolean bool = (Double.valueOf(L).doubleValue() > Double.valueOf(R).doubleValue());
        pilha.push(""+bool);
    }
	/** Exp_Logica - FIM  		**/
	
	/** Comando - INICIO			**/
	
    public void outAMinusExpExp(AMinusExpExp node)
    {		
    		String valor = pilha.pop();
    		valor = valor.replaceAll(",",".");
    		pilha.push(""+(0-Double.valueOf(verificaELimpa(valor)).doubleValue()));
    }
	
	@Override
	public void outAWriteComando(AWriteComando node){
		String resultado = pilha.pop();
		System.out.println(verificaELimpa(resultado));
	}
	
	@Override
	public void outAReadComando(AReadComando node){
		LinkedList<PVar> listaVar = node.getVar();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < listaVar.size(); i++) {
			String key = listaVar.get(i).toString().replaceAll("\\s+", "");
			//System.out.println(key);
			String digitado = scanner.next();
			if (symbol_table.containsKey(key)) {
				MySimbolo simbolo = (MySimbolo) symbol_table.get(key);
				digitado = leitor(digitado,simbolo.tipo);
				if(simbolo.isCompativel(digitado)){
					symbol_table.get(key).valor = digitado;
				}else{
					System.err.println("Erro!! Tentou atribuir um tipo diferente a variavel : "+key);
					System.exit(0);
				}
			} else {
				System.err.println("Variavel " + key + " nao foi definida. Para utiliza-la, voce precisa defini-la antes.");
				System.exit(0);
				
			}
		}
		//System.out.println(symbol_table.toString());
	}
	
	@Override
	public void outAAtribComando(AAtribComando node) {
		String value = pilha.pop();
		String key = node.getVar().toString().replaceAll("\\s+", "");
		
		try{

		if (!symbol_table.containsKey(key)) {
			System.err.println("Erro!! Identificador desconhecido");
			System.exit(0);
		} else {
			MySimbolo simbolo = (MySimbolo) symbol_table.get(key);
			if (simbolo.constante){
				System.err.println("Erro!! Tentou atribuir um valor a constante : "+key);
				System.exit(0);
			}
			if(!symbol_table.containsKey(value)){
				
				if (!simbolo.getType(value).equals("caractere")){
					if (simbolo.tipo.equals("inteiro ")){
						value = ""+Double.valueOf(value).intValue();
					}
					value = value.replaceAll("\\.",",");
				}

				if(simbolo.isCompativel(value)){
					simbolo.valor = value;
				}else{
					//System.err.println(simbolo.tipo);
					//System.err.println(simbolo.getType(value));
					//System.err.println(value);
					System.err.println("Erro!! Tentou atribuir um tipo diferente a variavel : "+key);
					System.exit(0);
				}
			}else{
				simbolo.valor = verificaELimpa(value);
			}
		}
		}catch(NumberFormatException e){
			System.err.println("Erro!! Tentou atribuir um tipo diferente a variavel : "+key);
		}
		//System.out.println(symbol_table.toString());
	}
	
    @Override
    public void caseAIfComando(AIfComando node)
    {
        inAIfComando(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        
        String resultado = pilha.pop();
        {
        	if(resultado.equals("true")){
	            List<PComando> copy = new ArrayList<PComando>(node.getComando());
	            for(PComando e : copy)
	            {
	                e.apply(this);
	            }
        	}
        }
        
        if(!resultado.equals("true")){
	        if(node.getOpElse() != null)
	        {
	            node.getOpElse().apply(this);
	        }
        }
        
        outAIfComando(node);
    }
   
	@Override
    public void caseACaseEstrela(ACaseEstrela node)
    {
        inACaseEstrela(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        {
        	String valorCase = node.getValor().toString().replaceAll("\\s+", "");
        	String valor = (pilha.size() >0 ? pilha.peek() : null);

        	if(valor != null && myEquals(valorCase,valor)){
	            List<PComando> copy = new ArrayList<PComando>(node.getComando());
	            for(PComando e : copy)
	            {
	                e.apply(this);
	            }
	            pilha.pop();
        	}
        }
        outACaseEstrela(node);
    }
	
	@Override
	public void caseAEvaluateComando(AEvaluateComando node)
	    {
	        inAEvaluateComando(node);
	        if(node.getExp() != null)
	        {
	            node.getExp().apply(this);
	        }
	        {
	        	if(!pilha.isEmpty()){
		            List<PCaseEstrela> copy = new ArrayList<PCaseEstrela>(node.getCaseEstrela());
		            for(PCaseEstrela e : copy)
		            {
		                e.apply(this);
		            }
	        	}
	        }
	        if(!pilha.isEmpty()){
		        if(node.getOpElse() != null)
		        {
		        	pilha.pop();
		            node.getOpElse().apply(this);
		        }
	        }
	        outAEvaluateComando(node);
	    }

    @Override
    public void caseAWhileComando(AWhileComando node)
    {
    	boolean pararWhile = false;
    	
        inAWhileComando(node);
        
        while(!pararWhile){
        	pararWhile = true;
	        if(node.getExpLogica() != null)
	        {
	            node.getExpLogica().apply(this);
	        }
	        {
	        	if(pilha.pop().equals("true")){
	        		pararWhile = false;
		            List<PComando> copy = new ArrayList<PComando>(node.getComando());
		            for(PComando e : copy)
		            {
		            		e.apply(this);
		            }
	        	}
	        }
        }
        outAWhileComando(node);
    }
    
    @Override
    public void caseARepeatComando(ARepeatComando node)
    {
    	boolean pararRepeat = false;
    	
        inARepeatComando(node);
        
        while(!pararRepeat){
        	pararRepeat = true;
	        {
	            List<PComando> copy = new ArrayList<PComando>(node.getComando());
	            for(PComando e : copy)
	            {
	                e.apply(this);
	            }
	        }
	        if(node.getExpLogica() != null)
	        {
	            node.getExpLogica().apply(this);
	        }
	        if(!pilha.pop().equals("true")){
	        	pararRepeat = false;
	        }
        }
        outARepeatComando(node);
    }
    
    @Override
    public void caseAForOneComando(AForOneComando node)
    {
    	String inicio ="";
    	String step = "";
    	String fim ="";
    	
    	int valorInicio = 0;
    	int valorStep = 1;
    	int valorFim = 0;
    	
        inAForOneComando(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getStart() != null)
        {
            node.getStart().apply(this);
            inicio = node.getStart().getText().replaceAll("\\s+", "");
            symbol_table.get(node.getVar().toString().replaceAll("\\s+", "")).valor = inicio;
            valorInicio = Integer.valueOf(inicio);
        }
        if(node.getStep() != null)
        {
            node.getStep().apply(this);
            step = node.getStep().getText().replaceAll("\\s+", "");
            valorStep = Integer.valueOf(step);
        }
        if(node.getStop() != null)
        {
            node.getStop().apply(this);
            fim = node.getStop().getText().replaceAll("\\s+", "");
            valorFim = Integer.valueOf(fim);
        }
        
        
        {
        	while(valorInicio != valorFim){
	            List<PComando> copy = new ArrayList<PComando>(node.getComando());
	            for(PComando e : copy)
	            {
	                e.apply(this);
	            }
        		if(valorInicio < valorFim){
        			valorInicio = valorInicio + valorStep;
        			symbol_table.get(node.getVar().toString().replaceAll("\\s+", "")).valor = ""+valorInicio;
        		}else if(valorInicio > valorFim){
        			valorInicio = valorInicio - valorStep;
        			symbol_table.get(node.getVar().toString().replaceAll("\\s+", "")).valor = ""+valorInicio;
        		}
        	}
        	if(valorInicio == valorFim){
	        	symbol_table.get(node.getVar().toString().replaceAll("\\s+", "")).valor = ""+valorFim;
	            List<PComando> copy = new ArrayList<PComando>(node.getComando());
	            for(PComando e : copy)
	            {
	                e.apply(this);
	            }
        	}
        }
        outAForOneComando(node);
    }
    /** Comando - FIM			**/
    
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
	
	public static String leitor(String digitado,String tipo){
		String resultado = "";
		if(digitado.matches("-?\\d+")){
			resultado = "inteiro";
		}else if(digitado.matches("-?\\d+,\\d+")){
			resultado = "real";
		}else 
			resultado ="character";
		
		if(resultado.equals(TIPO_CHARACTER))
			return "'"+digitado.replaceAll("\'", "")+"'";
		if(resultado.equals(TIPO_INTEIRO))
			return tipo.equals(TIPO_REAL) ? digitado+".0" : Integer.valueOf(digitado).toString();
		if(resultado.equals(TIPO_REAL))
			return digitado.replaceAll(",", ".");
		return resultado;
	}
	
	public boolean myEquals(String myCase,String valor){
	      if(!myCase.contains("\'") && !valor.contains("\'"))
	          return Double.valueOf(myCase).equals(Double.valueOf(valor));
	      else
	          return myCase.equals(valor);	
	    }
}