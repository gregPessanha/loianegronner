package br.com.loiane.cursojava.aula13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Fa�a um Programa que calcule a �rea de um quadrado, em seguida
mostre o dobro desta �rea para o usu�rio.
 * @author carlo
 *
 */
public class Ex007 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat(".##");
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a medida (cm) de um Lado de um quadrado para calcular sua �rea.");
		double lado = scan.nextDouble();
		double areaQuadrado = Math.pow(lado, 2);
		
		System.out.println("A �rea do quadrado � " + df.format(areaQuadrado) + " Cm�");
		System.out.println("A �rea duplicada do quadrado � " + df.format(areaQuadrado * 2) + " Cm�");
		
	}

}
