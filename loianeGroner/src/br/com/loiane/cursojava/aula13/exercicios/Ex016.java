package br.com.loiane.cursojava.aula13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 16. Faça um programa para uma loja de tintas. O programa deverá pedir o
 * tamanho em metros quadrados da área a ser pintada. Considere que a cobertura
 * da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em
 * latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de
 * latas de tinta a serem compradas e o preço total.
 * 
 * @author carlo
 *
 */
public class Ex016 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##.##");
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o tamanho em m² da área a ser pintada: ");
		double tamanhoArea = scan.nextFloat();
		double QuantLitros = tamanhoArea / 3;
		System.out.println("Serão precisos " + df.format(QuantLitros) + " litros de tinta para pintar "	+ df.format(tamanhoArea) + " m².");

		double quantLatas = QuantLitros / 18;
		double precoLata = 80;
		double totalDaCompra = Integer.parseInt(df.format(Math.ceil(quantLatas))) * Integer.parseInt(df.format(precoLata));

		System.out.println("Deverá(ão) ser comprado(s) " + Math.ceil(quantLatas) + " latas de tinta.");
		System.out.println("O total da compra será R$ " + df.format(totalDaCompra));

	}

}
