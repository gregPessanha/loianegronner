package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex002 {
	/**
	 * Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou
	 * negativo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int numero = scan.nextInt();

		if (numero < 0) {
			System.out.println("O n�mero � negativo.");
		} else {
			System.out.println("O n�mero � positivo.");

		}

	}

}
