package br.com.loiane.cursojava.aula15.switchcase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número do dia da semana [1/7]: ");
		int diaSemana = scan.nextInt();

		switch (diaSemana) {

		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;

		default:
			throw new IllegalArgumentException("Digite um dia válido!");

		}

	}

}
