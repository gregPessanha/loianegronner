package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex005 {
	/**
	 * Altere o programa anterior permitindo ao usuário informar as populações e as
	 * taxas de crescimento iniciais. Valide a entrada e permita repetir a operação
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

			System.out.println("Digite a população do país A: ");
			populacaoPaisA = scan.nextDouble();
			if (populacaoPaisA > 0) {
				valido = true;
			} else {
				System.out.println("A população do país A deve ser maior que Zero.");
			}
		} while (!valido);

		do {

			System.out.println("Digite a Taxa de crescimento anual do país A: ");
			taxaAnualA = scan.nextDouble();
			if (taxaAnualA > 0) {
				valido = true;
			} else {
				System.out.println("A Taxa Anual do país A deve ser maior que Zero.");
			}
		} while (!valido);

		valido = false;
		do {

			System.out.println("Digite a população do país B: ");
			populacaoPaisB = scan.nextDouble();
			if (populacaoPaisB > 0) {
				valido = true;
			} else {
				System.out.println("A população do país B deve ser maior que Zero.");
			}
		} while (!valido);

		valido = false;
		do {

			System.out.println("Digite a Taxa de crescimento anual do país B: ");
			taxaAnualB = scan.nextDouble();
			if (taxaAnualB > 0) {
				valido = true;
			} else {
				System.out.println("A Taxa Anual do país do país B deve ser maior que Zero.");
			}
		} while (!valido);

		int cont = 0;

		if (populacaoPaisA > populacaoPaisB) {
			System.out.println("O país A já é maior do que o país B");
		} else {
			while (populacaoPaisA < populacaoPaisB) {

				populacaoPaisA += (populacaoPaisA / 100) * taxaAnualA;
				populacaoPaisB += (populacaoPaisB / 100) * taxaAnualB;
				cont++;
			}

		}

		System.out.println("População A: " + populacaoPaisA);
		System.out.println("População B: " + populacaoPaisB);
		System.out.println("Quantidade de Anos: " + cont);
	}

}
