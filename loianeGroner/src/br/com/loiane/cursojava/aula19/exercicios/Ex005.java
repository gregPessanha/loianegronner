package br.com.loiane.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Ex005 {
	/**
	 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
	 * tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo
	 * elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i]
	 * * i.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[2];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º Número: ");
			vetorA[i] = scan.nextInt();

			vetorB[i] = vetorA[i] * i;
		}
		
		System.out.println("Vetor A : ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		
		System.out.println("Vetor B : ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
			
		}
	}

}
