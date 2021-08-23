package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex007 {
	/**
	 * Faça um programa que leia 5 números e informe o maior número;
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numero;
		int maior = Integer.MIN_VALUE; //menor número possível para um Integer

		for (int i = 1; i < 6; i++) {
			System.out.println("Digite o " + i + "º Número");
			numero = scan.nextInt();

			if (numero > maior) {
				maior = numero;
			}

		}

		System.out.println("O maior número digitado foi " + maior);

	}

}
