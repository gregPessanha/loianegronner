package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex004 {
/**
 * Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% 
 * e que a população de B seja 200.000 habitantes com uma taxa de crescimento de 1.5%. 
 * Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, 
 * mantidas as taxas de crescimento.
 * @param args
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int populacaoPaisA = 80000;
		int populacaoPaisB = 200000;
		int cont = 0;	
		
		while(populacaoPaisA < populacaoPaisB) {
			
			populacaoPaisA += (populacaoPaisA/100) * 3;
			populacaoPaisB += (populacaoPaisB/100) * 1.5;
			cont++;
		}
		
		System.out.println("População A: " + populacaoPaisA);
		System.out.println("População B: " + populacaoPaisB);
		System.out.println("Quantidade de Anos: " + cont);
	}

}
