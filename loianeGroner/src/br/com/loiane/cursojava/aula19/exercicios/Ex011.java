package br.com.loiane.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Ex011 {
	/**
	 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que
	 * defina e escreva a quantidade de elementos armazenados neste vetor que s�o
	 * pares.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[3];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o " + (i + 1) + "� N�mero: ");
			vetorA[i] = scan.nextInt();

		}
		System.out.println();
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("N�meros Digitados que s�o Pares: ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				System.out.print(vetorA[i]+ " ");
			}

		}

	}
}