package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

/**
 * Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
 * 
 * @author carlo
 *
 */
public class Ex001 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero, e depois digite outro n�mero: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if(n1 > n2) {
			System.out.println("O maior n�mero � " + n1);
		}else {
			System.out.println("O maior n�mero � " + n2);

		}
		
	}
}
