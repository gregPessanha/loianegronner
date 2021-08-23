package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número, e depois o segundo numero:");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		int soma = n1 + n2;
		System.out.println("A soma dos números digitados é igual a: " + soma);
		
		
	}
}
