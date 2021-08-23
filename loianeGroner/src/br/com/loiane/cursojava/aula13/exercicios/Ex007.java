package br.com.loiane.cursojava.aula13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.
 * @author carlo
 *
 */
public class Ex007 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat(".##");
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a medida (cm) de um Lado de um quadrado para calcular sua área.");
		double lado = scan.nextDouble();
		double areaQuadrado = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é " + df.format(areaQuadrado) + " Cm²");
		System.out.println("A área duplicada do quadrado é " + df.format(areaQuadrado * 2) + " Cm²");
		
	}

}
