package br.com.loiane.cursojava.aula20.exercicios;

import java.util.Random;

public class Ex002 {

	public static void main(String[] args) {

		Random random = new Random();

		int[][] matriz = new int[10][10];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(10);
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "   ");
			}
			System.out.println();
		}

		int maiorL5 = Integer.MIN_VALUE;
		int menorL5 = Integer.MAX_VALUE;
		int linha5 = 5;
		for (int i = 0; i < matriz[linha5].length; i++) {
			if (matriz[linha5][i] > maiorL5) {
				maiorL5 = matriz[5][i];
			}
			if (matriz[linha5][i] < menorL5) {
				menorL5 = matriz[5][i];
			}

		}
		System.out.println();
		System.out.println("O maior valor da linha 5 é " + maiorL5);
		System.out.println("O menor valor da linha 5 é " + menorL5);

		int maiorC7 = Integer.MIN_VALUE;
		int menorC7 = Integer.MAX_VALUE;
		int coluna7 = 7;
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][coluna7] > maiorC7) {
				maiorC7 = matriz[i][coluna7];
			}
			if (matriz[i][coluna7] < menorC7) {
				menorC7 = matriz[i][coluna7];
			}
		}

		System.out.println("O maior valor da Coluna 7 é " + maiorC7);
		System.out.println("O menor valor da Coluna 7 é " + menorC7);
	}

}
