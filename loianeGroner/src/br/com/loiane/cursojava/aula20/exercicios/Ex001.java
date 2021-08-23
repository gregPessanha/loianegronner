package br.com.loiane.cursojava.aula20.exercicios;

import java.util.Random;

import br.com.loiane.cursojava.aula20.matrizes.Matrizes;

public class Ex001 {

	public static void main(String[] args) {

		Random random = new Random();

		int[][] matrizM = new int[4][4];

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = random.nextInt(50);
			}
		}

		int maior = Integer.MIN_VALUE; // Para saber o maior valor
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM.length; j++) {
				if (matrizM[i][j] > maior) {
					maior = matrizM[i][j];
					linha = i;
					coluna = j;
				}
			}

		}
		
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + " ");	
			}
			System.out.println();
		}

		System.out.println("O maior número foi " + maior);
		System.out.println("Linha " + linha);
		System.out.println("Coluna " + coluna);
	}
}
