package br.com.loiane.cursojava.aula19.exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Ex004 {
	/**
	 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
	 * tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do
	 * respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[2];
		double[] vetorB = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º Número: ");
			vetorA[i] = scan.nextInt();

			vetorB[i] = Math.sqrt(vetorA[i]);

		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i] + " ");
		}

	}

}
