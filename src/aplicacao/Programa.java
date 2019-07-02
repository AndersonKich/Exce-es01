package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva;
import model.exeptions.ExcecoesPersonalizadas;

public class Programa {

	public static void main(String[] args){
		
		
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		try {
	
			System.out.print("Numero do quarto: ");
			int numeroQuarto = teclado.nextInt();
			System.out.print("Data do check-in: ");
			Date entrada = sdf.parse(teclado.next());
			System.out.print("Data do check-out: ");
			Date saida = sdf.parse(teclado.next());
	
			Reserva p = new Reserva(numeroQuarto, entrada, saida);
			System.out.println(p.toString());	
		
			System.out.println("Entre com as datas para atualizar a reseva:");
			System.out.print("Check-in: ");
			entrada = sdf.parse(teclado.next());
			System.out.print("Check-out: ");
			saida = sdf.parse(teclado.next());	
			p.atualizarReserva(entrada, saida);
			System.out.println(p.toString());	
			}

		catch(ParseException e) {
			System.err.println("Formato de data invalido...");
			}
		catch(ExcecoesPersonalizadas e) {
			System.err.println("Erro na reserva: "+e.getLocalizedMessage());//Retorna a mensagem da exceção criada na classe Reserva
			}
		catch(RuntimeException e) {
			System.err.println("Erro inesperado...");
		}
		
		
		teclado.close();	
	}
	
}
