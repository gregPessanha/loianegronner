package br.com.loiane.cursojava.aula19.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 * 19. Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as
 * notas informadas em dois vetores �Nota1� e �Nota2� do tipo real. Escreva um
 * programa que calcule a m�dia aritm�tica simples das notas informadas
 * armazenando o resultado em um vetor �Result� de mesmo tipo e tamanho. Ao
 * mostrar os resultados exibir a situa��o de cada aluno. Se a m�dia calculada
 * for superior ou igual a 7 o aluno estar� �aprovado�, caso contr�rio, a
 * situa��o do aluno ser� �reprovado�.
 * 
 * @author Carlos_Greg�rio
 * @param <T>
 *
 */
public class Ex019 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] nomes = new String[2];
		ArrayList<String> listaAprovados = new ArrayList(nomes.length);
		ArrayList<String> listaReprovados = new ArrayList(nomes.length);

		double[] notas1 = new double[nomes.length];
		double[] notas2 = new double[nomes.length];
		double[] resultados = new double[nomes.length];
		double[] medias = new double[nomes.length];

		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o nome do(a) " + (i + 1) + "� aluno(a):");
			nomes[i] = scan.next();

			System.out.print("Digite a 1� Nota do(a) aluno(a) " + nomes[i] + ":");
			notas1[i] = scan.nextDouble();

			System.out.print("Digite a 2� Nota do(a) aluno(a) " + nomes[i] + ":");
			notas2[i] = scan.nextDouble();

			System.out.println();
		}

		for (int i = 0; i < medias.length; i++) {
			medias[i] = (notas1[i] + notas2[i]) / 2;
		}

		System.out.println();
		for (int i = 0; i < resultados.length; i++) {
			resultados[i] = medias[i];
			if (medias[i] >= 7) {
				System.out.println("O(a) aluno(a) " + nomes[i] + " tem m�dia " + medias[i] + ". Est� APROVADO(A).");
				listaAprovados.add(nomes[i]);
			} else {
				System.out.println("O(a) aluno(a) " + nomes[i] + " tem m�dia " + medias[i] + ". Est� REPROVADO(A).");
				listaReprovados.add(nomes[i]);
			}
		}
		System.out.println();
		System.out.println("Aprovados: " + listaAprovados);
		System.out.println("Reprovados: " + listaReprovados);

	}

}
