package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex008 {
/**
 * Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
 * sabendo que a decisão é sempre pelo mais barato.
 * @param args
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o preço do primeiro produto: R$ ");
		double precoProduto1 = scan.nextDouble();
		
		System.out.print("Digite o preço do segundo produto: R$ ");
		double precoProduto2 = scan.nextDouble();
		
		System.out.print("Digite o preço do terceiro produto: R$ ");
		double precoProduto3 = scan.nextDouble();
		
		if(precoProduto1 < precoProduto2 && precoProduto1 < precoProduto3) {
			System.out.println("Você deverá comprar o produto que custa R$ " + precoProduto1);
		}else if (precoProduto2 < precoProduto1 && precoProduto2 < precoProduto3) {
			System.out.println("Você deverá comprar o produto que custa R$ " + precoProduto2);
		}else {
			System.out.println("Você deverá comprar o produto que custa R$ " + precoProduto3);

		}
	}

}
