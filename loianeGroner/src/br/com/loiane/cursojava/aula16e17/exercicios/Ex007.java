package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex007 {
	/**
	 * Fa�a um programa que leia 5 n�meros e informe o maior n�mero;
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numero;
		int maior = Integer.MIN_VALUE; //menor n�mero poss�vel para um Integer

		for (int i = 1; i < 6; i++) {
			System.out.println("Digite o " + i + "� N�mero");
			numero = scan.nextInt();

			if (numero > maior) {
				maior = numero;
			}

		}

		System.out.println("O maior n�mero digitado foi " + maior);

	}

}
