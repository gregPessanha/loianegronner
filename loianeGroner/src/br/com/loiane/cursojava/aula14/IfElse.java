package br.com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();

		if (idade >= 18) {
			System.out.println("Votar � obrigat�rio!");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("Voc� pode votar, se quiser.");
		} else {
			System.out.println("Voc� n�o pode votar.");

		}
	}
}
