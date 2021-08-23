package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex001 {
	/**
	 * Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem
	 * caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um
	 * valor v�lido.
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
				System.out.println("Voc� digitou " + nota);
			} else {
				System.out.println("Nota Inv�lida. Digite novamente!");
			}

		} while (!notaValida);

	}
}