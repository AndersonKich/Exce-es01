package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.exeptions.ExcecoesPersonalizadas;

public class Reserva {

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer numeroQuarto;
	private Date entrada;
	private Date saida;
	
	
	public Reserva() {
		
	}
	/**Colocar o tratamento de exceções no construtor
	  é uma boa pratica de programação(chamada de programação defensiva)*/
	public Reserva(Integer numeroQuarto, Date entrada, Date saida)  {
		if(!saida.after(entrada)) {
			throw new ExcecoesPersonalizadas("Data de entrada nao pode ser depois da data de saida!!!");
		}
		
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
	long ent ;	
	return ent = ( this.getSaida().getTime() - this.getEntrada().getTime())/(24 * 60 * 60 * 1000);//Ou 86400000 milesegundos
	
	//Ou TimeUnit.DAYS.convert(ent, TimeUnit.MILLISECONDS); para converter os millisegundos para dias
	}
	
	public void atualizarReserva(Date checkin, Date checkout)  {
		Date agora = new Date();
		if(checkin.before(agora) || checkout.before(agora)) {
			throw new ExcecoesPersonalizadas("So é possivel fazer rezerva para datas futuras!!!");//Retorna uma exceção
		}
		if(!checkout.after(checkin)) {
			throw new ExcecoesPersonalizadas("Data de entrada nao pode ser depois da data de saida!!!");
		}
		this.entrada = checkin;
		this.saida = checkout;
		
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
