package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex010 {
/**
 * 10. Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.
 * @param args
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em °C :");
		double tempC = scan.nextDouble();
		double tempF = (tempC * 1.8) + 32;
		
		System.out.println("A temperatura informada em °C corresponde a " + tempF + "° F");
	}

}
