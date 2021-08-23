package br.com.loiane.cursojava.aula13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 16. Fa�a um programa para uma loja de tintas. O programa dever� pedir o
 * tamanho em metros quadrados da �rea a ser pintada. Considere que a cobertura
 * da tinta � de 1 litro para cada 3 metros quadrados e que a tinta � vendida em
 * latas de 18 litros, que custam R$ 80,00. Informe ao usu�rio a quantidades de
 * latas de tinta a serem compradas e o pre�o total.
 * 
 * @author carlo
 *
 */
public class Ex016 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##.##");
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o tamanho em m� da �rea a ser pintada: ");
		double tamanhoArea = scan.nextFloat();
		double QuantLitros = tamanhoArea / 3;
		System.out.println("Ser�o precisos " + df.format(QuantLitros) + " litros de tinta para pintar "	+ df.format(tamanhoArea) + " m�.");

		double quantLatas = QuantLitros / 18;
		double precoLata = 80;
		double totalDaCompra = Integer.parseInt(df.format(Math.ceil(quantLatas))) * Integer.parseInt(df.format(precoLata));

		System.out.println("Dever�(�o) ser comprado(s) " + Math.ceil(quantLatas) + " latas de tinta.");
		System.out.println("O total da compra ser� R$ " + df.format(totalDaCompra));

	}

}
