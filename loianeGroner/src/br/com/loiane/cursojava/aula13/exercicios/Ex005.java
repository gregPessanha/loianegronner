package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

/**
 * Fa�a um Programa que converta metros para cent�metros
 * @author carlo
 *
 */
public class Ex005 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a medida em Metros que voc� deseja converter para Cent�metros: ");
		double medida = teclado.nextDouble();
		double conversao = medida * 100;
		
		System.out.println("A medida em Metros �: " + conversao);
	}

}
