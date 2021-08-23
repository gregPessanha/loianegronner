package br.com.loiane.cursojava.aula19.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que
 * determine a soma dos elementos armazenados neste vetor que são múltiplos de
 * 5.
 * 
 * @author Carlos_Gregório
 *
 */
public class Ex013 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetor = new int[4];
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º número:");
			vetor[i] = scan.nextInt();
		}

		System.out.println();
		System.out.print("Elementos do vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			Arrays.sort(vetor);
			System.out.print("[" + vetor[i] + "]" + " ");
		}

		System.out.println();
		System.out.print("Múltiplos de 5: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 5 == 0) {
				soma += vetor[i];
				System.out.print("[" + vetor[i] + "]" + " ");
			}

		}
		System.out.println();
		System.out.println("A soma dos Múltiplos de 5 digitados pelo usuário é: " + soma);

	}
}
