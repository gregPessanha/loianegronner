package br.com.loiane.cursojava.aula19.exercicios;

import java.util.Scanner;

/**
 * 23. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que
 * verifique se "todos" os elementos do vetor A s�o pares. Se pelo menos um
 * elemento do vetor n�o for par o processo de repeti��o para percorrer os
 * elementos do vetor deve ser encerrado, como sugest�o: utilize uma vari�vel do
 * tipo flag para atingir este prop�sito
 * 
 * @author Carlos_Greg�rio
 *
 */
public class Ex023 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe um n�mero para a posi��o " + (i + 1) + ":");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 != 0) {
				break;
			}
		}
	}

}
