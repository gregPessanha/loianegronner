package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex006 {
	/**
	 * Faça um Programa que leia três números e mostre o maior deles.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 4; i++) {
			System.out.println("Digite o " + i + "º número: ");
		}

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior número é o " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior número é o " + n2);
		} else {
			System.out.println("O maior número é o " + n3);
		}

		if (n1 < n2 && n1 < n3) {
			System.out.println("O menor número é o " + n1);
		} else if (n2 < n1 && n2 < n3) {
			System.out.println("O menor número é o " + n2);
		} else {
			System.out.println("O menor número é o " + n3);

		}
	}

}
