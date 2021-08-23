package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex012 {
/**
 * Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58
 * @param args
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("informe a sua altura: ");
		double altura = scan.nextDouble();
		double pesoIdeal = (altura * 72.7) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal + " Kg");
		
	}

}
