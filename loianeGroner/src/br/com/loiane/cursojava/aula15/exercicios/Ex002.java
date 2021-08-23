package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex002 {
	/**
	 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou
	 * negativo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int numero = scan.nextInt();

		if (numero < 0) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("O número é positivo.");

		}

	}

}
