package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

/**
 * Faça um Programa que converta metros para centímetros
 * @author carlo
 *
 */
public class Ex005 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a medida em Metros que você deseja converter para Centímetros: ");
		double medida = teclado.nextDouble();
		double conversao = medida * 100;
		
		System.out.println("A medida em Metros é: " + conversao);
	}

}
