package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex004 {
	/**
	 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = scan.next();

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {

			System.out.println("É uma VOGAL!");
		} else {
			System.out.println("É uma CONSOANTE!");

		}

	}

}
