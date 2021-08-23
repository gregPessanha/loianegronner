package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exx010 {
	/**
	 * Faça um programa que receba dois números inteiros e gere os números inteiros
	 * que estão no intervalo compreendido por eles.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro número:");
		int n1 = scan.nextInt();
		
		System.out.println("Informe o segundo número:");
		int n2 = scan.nextInt();
		
		int soma = 0;

		for (int i = n1; i <= n2; i++) {
			soma += i;
			System.out.println(i);
		}
		
		System.out.println("A soma dos numeros no intervalo do número digitados é: " + soma);

	}

}
