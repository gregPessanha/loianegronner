package br.com.loiane.cursojava.aula13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Fa�a um Programa para uma loja de tintas. O programa dever� pedir o tamanho
 * em metros quadrados da �rea a ser pintada. Considere que a cobertura da tinta
 * � de 1 litro para cada 6 metros quadrados e que a tinta � vendida em latas de
 * 18 litros, que custam R$ 80,00 ou em gal�es de 3,6 litros, que custam R$
 * 25,00. a- Informe ao usu�rio as quantidades de tinta a serem compradas e os
 * respectivos pre�os em 3 situa��es: o comprar apenas latas de 18 litros; o
 * comprar apenas gal�es de 3,6 litros; o misturar latas e gal�es, de forma que
 * o pre�o seja o menor. Acrescente 10% de folga e sempre arredonde osvalores
 * para cima, isto �, considere latas cheias;
 * 
 * @author carlo
 *
 */
public class Ex017 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##.##");
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o tamanho em m� da �rea a ser pintada: ");
		double tamanhoArea = scan.nextFloat();
		double QuantLitros = tamanhoArea / 6; // Saber a quantidade de litros que ser�o usados;
		System.out.println("Ser�o precisos " + df.format(QuantLitros) + " litros de tinta para pintar "
				+ df.format(tamanhoArea) + " m�.");

		double quantLatas = QuantLitros / 18; // Saber a quantidade de LATAS;
		double precoLata = 80; // Pre�o da LATA;

		double quantGaloes = QuantLitros / 3.6; // Saber a quantidade de GAL�ES;
		double precoGalao = 25; // Pre�o do GAL�O;

		double precoTotalDaCompraDeLatas = Integer.parseInt(df.format(Math.ceil(quantLatas)))
				* Integer.parseInt(df.format(precoLata));

		double precoTotalDaCompraDeGaloes = Integer.parseInt(df.format(Math.ceil(quantGaloes)))
				* Integer.parseInt(df.format(precoGalao));

		if (tamanhoArea < 69.12) { // 69.12 � quantas vezes um gal�o d� dentro de uma lata;

			System.out.println("Com a finalidade de Economia, dever�(�o) ser comprado(s) " + Math.ceil(quantGaloes)
					+ " gal�o(�es) de tinta.");
			System.out.println("Pre�o Total: R$ " + df.format(precoTotalDaCompraDeGaloes));
		} else {

			System.out.println("Com a finalidade de Economia, dever�(�o) ser comprada(s) " + Math.ceil(quantLatas)
					+ " lata(s) de tinta.");
			System.out.println("Pre�o Total: R$ " + df.format(precoTotalDaCompraDeLatas));

		}

	}

}
