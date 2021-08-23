package br.com.loiane.cursojava.aula19.exercicios;

import java.util.Scanner;

/**
 * 20. Implementar um programa que obtenha a cota��o do d�lar (U$) em
rela��o ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes convers�es
 * @author Carlos_Greg�rio
 *
 */
public class Ex020 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Informe a cota��o do D�lar: U$ ");
		cotacao = scan.nextDouble();
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
		}
		
		System.out.print("Vetor A : ");
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println();
		
		
		
		
	}

}
