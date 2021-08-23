package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex009 {

	/**
	 * Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9).
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em °F: ");
		double tempF = scan.nextDouble();
		double tempC = (5 * (tempF - 32) / 9);
		
		System.out.println("A temperatura informada em °F corresponde a " + tempC + "° C");
	}

}
