package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;


public class Ex006 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o tamanho do raio para saber a �rea de um c�rculo: ");
		double raio = teclado.nextDouble();
		
		double area = Math.PI * Math.sqrt(raio);
		System.out.println("A �rea do circulo � " + area);
		
	}

}
