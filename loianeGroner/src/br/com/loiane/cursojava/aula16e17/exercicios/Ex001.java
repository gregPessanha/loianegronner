package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex001 {
	/**
	 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
	 * caso o valor seja inválido e continue pedindo até que o usuário informe um
	 * valor válido.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean notaValida = false; //flag

		do {
			System.out.print("Digite uma nota entre 0 e 10: ");
			double nota = scan.nextDouble();

			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou " + nota);
			} else {
				System.out.println("Nota Inválida. Digite novamente!");
			}

		} while (!notaValida);

	}
}