package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex008 {
/**
 * Faça um programa que leia 5 números e informe a soma e a média dos números
 * @param args
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int numero;
		int soma = 0;
		double media;
		
		for(int i = 1; i < 6; i++) {
			System.out.println("Digite o " + i + "º Número.");
			numero = scan.nextInt();
			soma += numero;
		}
		
		System.out.println("O soma dos numeros é igual a " + soma);
		System.out.println("O média dos numeros é igual a " + soma / 5);
		
	}

}
