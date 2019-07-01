package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidade.Reserva;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Numero do quarto: ");
		int numeroQuarto = teclado.nextInt();
		System.out.print("Data do check-in: ");
		Date entrada = sdf.parse(teclado.next());
		System.out.print("Data do check-out: ");
		Date saida = sdf.parse(teclado.next());

		Reserva p = new Reserva(numeroQuarto, entrada, saida);
		
		System.out.println(p.toString());
		System.out.println("\n\n");

		System.out.println("Entre com as datas para atualizar a reseva:");
		System.out.print("Check-in: ");
		entrada = sdf.parse(teclado.next());
		System.out.print("Check-out: ");
		saida = sdf.parse(teclado.next());
		p.atualizarReserva(entrada, saida);
		System.out.println(p.toString());

		
teclado.close();
	}

}
