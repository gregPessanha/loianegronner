package br.com.loiane.cursojava.aula19.exercicios;

/**
 * Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1,
 * sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar
 * um programa que determine o percentual de números 0's e 1's existentes no
 * vetor A.
 * 
 * @author Carlos_Gregório
 *
 */
public class Ex022 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int quantidade0 = 0;
		int quantidade1 = 0;

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 1);
			if (vetorA[i] == 0) {
				quantidade0++;
			} else {
				quantidade1++;
			}
		}

//			10            -  100%
//			quantidade0   -   x

//			10x = quantidade0 * 100
//			x = (quantidade0 * 100) / 10

		double porcent0 = (quantidade0 * 100) / vetorA.length;
		double porcent1 = (quantidade1 * 100) / vetorA.length;

		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		System.out.println();

		System.out.println("Porcentagem de de Zeros: " + porcent0 + "%");
		System.out.println("Porcentagem de de Uns: " + porcent1 + "%");

	}
}
