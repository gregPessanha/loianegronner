package br.com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();

		if (idade >= 18) {
			System.out.println("Votar é obrigatório!");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("Você pode votar, se quiser.");
		} else {
			System.out.println("Você não pode votar.");

		}
	}
}
