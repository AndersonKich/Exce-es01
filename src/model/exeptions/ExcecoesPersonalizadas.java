package model.exeptions;

public class ExcecoesPersonalizadas extends RuntimeException {//Extender a classe padr�o Exception para personalizar
	private static final long serialVersionUID = 1L;	//Se usar RuntimeException n�o preciso propagar a exce�ao usando o throw

	
	public ExcecoesPersonalizadas(String smg) {
		super(smg);
		
		
	}
	
	
	
	
	
	
	
}
