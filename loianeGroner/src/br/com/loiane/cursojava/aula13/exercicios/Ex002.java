package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = teclado.nextInt();
		System.out.println("O n�mero lido foi " + numero);
	}

}
