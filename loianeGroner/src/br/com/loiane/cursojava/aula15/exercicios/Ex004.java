package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex004 {
	/**
	 * Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = scan.next();

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {

			System.out.println("� uma VOGAL!");
		} else {
			System.out.println("� uma CONSOANTE!");

		}

	}

}
