package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex008 {
/**
 * Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros
 * @param args
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int numero;
		int soma = 0;
		double media;
		
		for(int i = 1; i < 6; i++) {
			System.out.println("Digite o " + i + "� N�mero.");
			numero = scan.nextInt();
			soma += numero;
		}
		
		System.out.println("O soma dos numeros � igual a " + soma);
		System.out.println("O m�dia dos numeros � igual a " + soma / 5);
		
	}

}
