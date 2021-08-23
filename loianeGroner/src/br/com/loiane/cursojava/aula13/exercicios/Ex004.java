package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira, segunda, terceira e quarta nota:");
		double n1 = teclado.nextDouble();
		double n2 = teclado.nextDouble();
		double n3 = teclado.nextDouble();
		double n4 = teclado.nextDouble();
		
		double media = (n1 + n2 + n3 + n4) / 4;
		System.out.println("A média é : " + media);
	}

}
