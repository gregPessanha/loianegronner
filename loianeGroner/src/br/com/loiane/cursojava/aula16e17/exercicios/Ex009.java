package br.com.loiane.cursojava.aula16e17.exercicios;

public class Ex009 {
/**
 * Fa?a um programa que imprima na tela apenas os n?meros ?mpares entre 1 e 50
 * @param args
 */
	public static void main(String[] args) {
 
		for(int i = 0; i < 50; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
	}

}
