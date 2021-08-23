package br.com.loiane.cursojava.aula21.forEach;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {

			notas[i] = random.nextInt(10);

		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println("Usando o ForEach");
		
		for(int nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println("Exemplo com Arrays Multidimensionais");
		int [][] notasAlunos = new int [2][2];
		
		notasAlunos[0][0] = 7;
		notasAlunos[0][1] = 7;
		
		notasAlunos[1][0] = 4;
		notasAlunos[1][1] = 6;
		
		for (int[] notasAluno : notasAlunos){
			for(int nota : notasAluno) {
				System.out.println(nota + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
