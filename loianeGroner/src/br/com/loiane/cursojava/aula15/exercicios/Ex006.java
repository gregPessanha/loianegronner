package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex006 {
	/**
	 * Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 4; i++) {
			System.out.println("Digite o " + i + "� n�mero: ");
		}

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero � o " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior n�mero � o " + n2);
		} else {
			System.out.println("O maior n�mero � o " + n3);
		}

		if (n1 < n2 && n1 < n3) {
			System.out.println("O menor n�mero � o " + n1);
		} else if (n2 < n1 && n2 < n3) {
			System.out.println("O menor n�mero � o " + n2);
		} else {
			System.out.println("O menor n�mero � o " + n3);

		}
	}

}
