package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima o maior deles.
 * 
 * @author carlo
 *
 */
public class Ex001 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número, e depois digite outro número: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if(n1 > n2) {
			System.out.println("O maior número é " + n1);
		}else {
			System.out.println("O maior número é " + n2);

		}
		
	}
}
