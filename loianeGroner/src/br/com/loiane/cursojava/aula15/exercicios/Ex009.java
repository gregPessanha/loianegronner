package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex009 {
	/**
	 * Faça um Programa que leia três números e mostre-os em ordem decrescente
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 4; i++) {
			System.out.println("Digite o " + i + "º número: ");
		}

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		if(n1 <= n2 && n1 <= n3 && n2 <= n3) {
			//n1 é menor;
			//n3 é maior;
			//n1 < n2 < n3;
			System.out.println(n3 + " - " + n2 + " - " + n1);
			
		}else 
			if(n1 <= n2 && n1 <= n3 && n3 <= n2) {
			//n1 é menor;
			//n2 é maior;
			//n1 < n3 < n2;
			System.out.println(n2 + " - " + n3 + " - " + n1);
			
		}else 
			if(n2 <= n1 && n2 <= n3 && n1 <= n3) {
			//n2 é menor;
			//n3 é maior;
			//n2 < n1 < n3;
			System.out.println(n3 + " - " + n1 + " - " + n2);
			
		}else 
			if(n2 <= n1 && n2 <= n3 && n3 <= n1) {
			//n2 é menor;
			//n1 é maior;
			//n2 < n3 < n1;
			System.out.println(n1 + " - " + n3 + " - " + n2);
			
		}else 
			if(n3 <= n1 && n3 <= n2 && n2 <= n1) {
			//n3 é menor;
			//n1 é maior;
			//n3 < n2 < n1;
			System.out.println(n1 + " - " + n2 + " - " + n3);
			
		}else 
			if(n3 <= n1 && n3 <= n2 && n1 <= n2) {
			//n3 é menor;
			//n2 é maior;
			//n3 < n1 < n2;
			System.out.println(n2 + " - " + n1 + " - " + n3);
		}
		

	}

}
