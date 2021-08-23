package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		System.out.println("O número lido foi " + numero);
	}

}
