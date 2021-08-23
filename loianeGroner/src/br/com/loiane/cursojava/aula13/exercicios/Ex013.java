package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex013 {
	/**
	 * 13. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
	 * algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas: .
	 * Para homens: (72.7*h) - 58 a. Para mulheres: (62.1*h) - 44.7 (h = altura) b.
	 * Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe sua altura em m: ");

		double altura = scan.nextDouble();
		System.out.println("Informe seu sexo [M/F]: ");
		String resposta = scan.next();

		if ("m".toUpperCase().equalsIgnoreCase(resposta)) {
			double pesoIdeal = (altura * 72.7) - 58;
			System.out.println("Seu peso ideal é: " + pesoIdeal + " Kg");

		} else {
			if ("f".toUpperCase().equalsIgnoreCase(resposta)) {
				double pesoIdeal = (altura * 62.1) - 44.7;
				System.out.println("Seu peso ideal é: " + pesoIdeal + " Kg");
			}

		}
	}

}
