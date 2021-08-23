package br.com.loiane.cursojava.aula19.exercicios;

import java.util.Scanner;

/**
 * 20. Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes conversões
 * @author Carlos_Gregório
 *
 */
public class Ex020 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Informe a cotação do Dólar: U$ ");
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
