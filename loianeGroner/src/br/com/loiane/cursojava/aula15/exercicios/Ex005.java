package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex005 {
	/**
	 * Faça um programa para a leitura de duas notas parciais de um aluno. O
	 * programa deve calcular a média alcançada por aluno e apresentar: o A mensagem
	 * "Aprovado", se a média alcançada for maior ou igual a sete; o A mensagem
	 * "Reprovado", se a média for menor do que sete; o A mensagem "Aprovado com
	 * Distinção", se a média for igual a dez
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 3; i++) {
			System.out.println("Digite a " + i + "ª nota: ");
		}

		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2) / 2;

		if (media == 10) {
			System.out.println("Média: " + media + " [Aluno APROVADO COM DISTINÇÃO!]");
		} else if (media >= 7) {
			System.out.println("Média: " + media + " [Aluno APROVADO!]");
		} else {
			System.out.println("Média: " + media + " [Aluno REPROVADO!]");

		}
	}
}
