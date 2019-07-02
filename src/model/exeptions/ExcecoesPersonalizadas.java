package model.exeptions;

public class ExcecoesPersonalizadas extends RuntimeException {//Extender a classe padrão Exception para personalizar
	private static final long serialVersionUID = 1L;	//Se usar RuntimeException não preciso propagar a exceçao usando o throw

	
	public ExcecoesPersonalizadas(String smg) {
		super(smg);
		
		
	}
	
	
	
	
	
	
	
}
