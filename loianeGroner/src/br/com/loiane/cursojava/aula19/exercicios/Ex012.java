package br.com.loiane.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Ex012 {
/**
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.
 * @param args
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[5];
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Informe o " + (i+1) + "º Número:" );
			vetor[i] = scan.nextInt();
		}
		
		System.out.println("Elementos do vetor: ");
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.println("A soma dos números do vetor é : " + soma);
	}

}
