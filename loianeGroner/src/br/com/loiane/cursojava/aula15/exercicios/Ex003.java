package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex003 {
	/**
	 * Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". Conforme a
	 * letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um g�nero [M/F]: ");
		String genero = scan.next();

		if (genero.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else if (genero.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else {
			System.out.println("G�nero Inv�lido");

		}

	}

}
