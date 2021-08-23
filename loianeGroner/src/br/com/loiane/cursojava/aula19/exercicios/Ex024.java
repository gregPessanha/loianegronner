package br.com.loiane.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Ex024 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe um número para a posição " + (i + 1) + ":");
			vetorA[i] = scan.nextInt();

		}

		boolean palindromo = true;
		for (int i = 0; i < vetorA.length / 2; i++) {
			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}

		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}

		System.out.println();

		if (palindromo) {
			System.out.println("Palíndromo");
		} else {
			System.out.println("Não é Palíndromo");
		}
	}

}
