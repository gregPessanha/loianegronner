package br.com.loiane.cursojava.aula13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho
 * em metros quadrados da área a ser pintada. Considere que a cobertura da tinta
 * é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de
 * 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$
 * 25,00. a- Informe ao usuário as quantidades de tinta a serem compradas e os
 * respectivos preços em 3 situações: o comprar apenas latas de 18 litros; o
 * comprar apenas galões de 3,6 litros; o misturar latas e galões, de forma que
 * o preço seja o menor. Acrescente 10% de folga e sempre arredonde osvalores
 * para cima, isto é, considere latas cheias;
 * 
 * @author carlo
 *
 */
public class Ex017 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##.##");
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o tamanho em m² da área a ser pintada: ");
		double tamanhoArea = scan.nextFloat();
		double QuantLitros = tamanhoArea / 6; // Saber a quantidade de litros que serão usados;
		System.out.println("Serão precisos " + df.format(QuantLitros) + " litros de tinta para pintar "
				+ df.format(tamanhoArea) + " m².");

		double quantLatas = QuantLitros / 18; // Saber a quantidade de LATAS;
		double precoLata = 80; // Preço da LATA;

		double quantGaloes = QuantLitros / 3.6; // Saber a quantidade de GALÕES;
		double precoGalao = 25; // Preço do GALÃO;

		double precoTotalDaCompraDeLatas = Integer.parseInt(df.format(Math.ceil(quantLatas)))
				* Integer.parseInt(df.format(precoLata));

		double precoTotalDaCompraDeGaloes = Integer.parseInt(df.format(Math.ceil(quantGaloes)))
				* Integer.parseInt(df.format(precoGalao));

		if (tamanhoArea < 69.12) { // 69.12 é quantas vezes um galão dá dentro de uma lata;

			System.out.println("Com a finalidade de Economia, deverá(ão) ser comprado(s) " + Math.ceil(quantGaloes)
					+ " galão(ões) de tinta.");
			System.out.println("Preço Total: R$ " + df.format(precoTotalDaCompraDeGaloes));
		} else {

			System.out.println("Com a finalidade de Economia, deverá(ão) ser comprada(s) " + Math.ceil(quantLatas)
					+ " lata(s) de tinta.");
			System.out.println("Preço Total: R$ " + df.format(precoTotalDaCompraDeLatas));

		}

	}

}
