package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex003 {
	/**
	 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a
	 * letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um gênero [M/F]: ");
		String genero = scan.next();

		if (genero.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else if (genero.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Gênero Inválido");

		}

	}

}
