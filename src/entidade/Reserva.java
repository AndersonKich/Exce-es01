package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {

	
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer numeroQuarto;
	private Date entrada;
	private Date saida;
	
	
	public Reserva() {
		
	}

	public Reserva(Integer numeroQuarto, Date entrada, Date saida) {
		this.numeroQuarto = numeroQuarto;
		this.entrada = entrada;
		this.saida = saida;
	}
	
	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getEntrada() {
		return entrada;
	}

	public Date getSaida() {
		return saida;
	}

	

	public long  duracao() {//Funcao para contar dias
	long ent;	
	return ent = (this.getEntrada().getTime() - this.getSaida().getTime())/(24 * 60 * 60 * 1000);//Ou 86400000 milesegundos
	
	//Ou TimeUnit.DAYS.convert(ent, TimeUnit.MILLISECONDS); para converter os millisegundos para dias
	}
	
	public void atualizarReserva(Date chekin, Date chekout) {
		
		this.entrada = chekin;
		this.saida = chekout;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reserva : Quarto: "+this.getNumeroQuarto());
		sb.append(", Check-in: "+sdf.format(this.getEntrada()));
		sb.append(", Check-out: "+sdf.format(this.getSaida()));
		sb.append(", "+duracao()+" noites");
		
		return sb.toString();
	}
	
	
	
	
	
	
}
