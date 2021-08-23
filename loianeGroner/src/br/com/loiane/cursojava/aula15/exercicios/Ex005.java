package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex005 {
	/**
	 * Fa�a um programa para a leitura de duas notas parciais de um aluno. O
	 * programa deve calcular a m�dia alcan�ada por aluno e apresentar: o A mensagem
	 * "Aprovado", se a m�dia alcan�ada for maior ou igual a sete; o A mensagem
	 * "Reprovado", se a m�dia for menor do que sete; o A mensagem "Aprovado com
	 * Distin��o", se a m�dia for igual a dez
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 3; i++) {
			System.out.println("Digite a " + i + "� nota: ");
		}

		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2) / 2;

		if (media == 10) {
			System.out.println("M�dia: " + media + " [Aluno APROVADO COM DISTIN��O!]");
		} else if (media >= 7) {
			System.out.println("M�dia: " + media + " [Aluno APROVADO!]");
		} else {
			System.out.println("M�dia: " + media + " [Aluno REPROVADO!]");

		}
	}
}
