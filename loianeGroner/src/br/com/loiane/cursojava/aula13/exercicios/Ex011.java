package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex011 {
/**
 * Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
 * @param args
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número inteiro, outro inteiro, e um número real:"); 
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		double n3 = scan.nextDouble();
		
		System.out.println((n1 * 2) * (n2 /2));
		System.out.println((n1 * 3) + n2);
		System.out.println(Math.pow(n3, 3));
		
		
	}

}
