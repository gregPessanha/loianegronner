package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex005 {
	/**
	 * Altere o programa anterior permitindo ao usu�rio informar as popula��es e as
	 * taxas de crescimento iniciais. Valide a entrada e permita repetir a opera��o
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double populacaoPaisA;
		double populacaoPaisB;
		double taxaAnualA;
		double taxaAnualB;

		boolean valido = false;

		do {

			System.out.println("Digite a popula��o do pa�s A: ");
			populacaoPaisA = scan.nextDouble();
			if (populacaoPaisA > 0) {
				valido = true;
			} else {
				System.out.println("A popula��o do pa�s A deve ser maior que Zero.");
			}
		} while (!valido);

		do {

			System.out.println("Digite a Taxa de crescimento anual do pa�s A: ");
			taxaAnualA = scan.nextDouble();
			if (taxaAnualA > 0) {
				valido = true;
			} else {
				System.out.println("A Taxa Anual do pa�s A deve ser maior que Zero.");
			}
		} while (!valido);

		valido = false;
		do {

			System.out.println("Digite a popula��o do pa�s B: ");
			populacaoPaisB = scan.nextDouble();
			if (populacaoPaisB > 0) {
				valido = true;
			} else {
				System.out.println("A popula��o do pa�s B deve ser maior que Zero.");
			}
		} while (!valido);

		valido = false;
		do {

			System.out.println("Digite a Taxa de crescimento anual do pa�s B: ");
			taxaAnualB = scan.nextDouble();
			if (taxaAnualB > 0) {
				valido = true;
			} else {
				System.out.println("A Taxa Anual do pa�s do pa�s B deve ser maior que Zero.");
			}
		} while (!valido);

		int cont = 0;

		if (populacaoPaisA > populacaoPaisB) {
			System.out.println("O pa�s A j� � maior do que o pa�s B");
		} else {
			while (populacaoPaisA < populacaoPaisB) {

				populacaoPaisA += (populacaoPaisA / 100) * taxaAnualA;
				populacaoPaisB += (populacaoPaisB / 100) * taxaAnualB;
				cont++;
			}

		}

		System.out.println("Popula��o A: " + populacaoPaisA);
		System.out.println("Popula��o B: " + populacaoPaisB);
		System.out.println("Quantidade de Anos: " + cont);
	}

}
