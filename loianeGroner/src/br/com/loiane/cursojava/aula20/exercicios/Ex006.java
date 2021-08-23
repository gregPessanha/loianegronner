package br.com.loiane.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char[][] jogoVelha = new char[3][3];

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");

		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0;
		int coluna = 0;

		while (!ganhou) {

			if (jogada % 2 == 1) { // jogador 1 joga
				System.out.println("Vez do jogador 1. Escolha linha e coluna para jogar: ");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna para jogar: ");
				sinal = 'O';
			}

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Informe a linha [1|2|3]: ");
				linha = scan.nextInt();

				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada Inválida!");
				}
			}

			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Informe a coluna [1|2|3]:");
				coluna = scan.nextInt();

				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada Inválida!");
				}
			}

			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posição já usada. Tente Novamente.");
			} else { // Jogada válida
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}

//			Imprimir o tabuleiro;
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}

//			Verificar se existe um ganhador;
			if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || // LINHA 1
					(jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // LINHA 2
					(jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || // LINHA 3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // COLUNA 1
					(jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || // COLUNA 2
					(jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // COLUNA 3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') || // DIAGONAL
					(jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')) { // // DIAGONAL
																									// INVERSA

				ganhou = true;
				System.out.println("JOGADOR 1 GANHOU. PARABÉNS!!");

			} else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || // LINHA 1
					(jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || // LINHA 2
					(jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || // LINHA 3
					(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || // COLUNA 1
					(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || // COLUNA 2
					(jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || // COLUNA 3
					(jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') || // DIAGONAL
					(jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')) { // DIAGONAL INVERSA
																									// // INVERSA

				ganhou = true;
				System.out.println("JOGADOR 2 GANHOU. PARABÉNS!!");

			} else if (jogada > 9) {
				ganhou = true;
				System.out.println("Ninguém ganhou!");
			}

		}

	}
}
