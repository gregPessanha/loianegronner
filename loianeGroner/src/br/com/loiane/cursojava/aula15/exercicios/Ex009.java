package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex009 {
	/**
	 * Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem decrescente
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 4; i++) {
			System.out.println("Digite o " + i + "� n�mero: ");
		}

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		if(n1 <= n2 && n1 <= n3 && n2 <= n3) {
			//n1 � menor;
			//n3 � maior;
			//n1 < n2 < n3;
			System.out.println(n3 + " - " + n2 + " - " + n1);
			
		}else 
			if(n1 <= n2 && n1 <= n3 && n3 <= n2) {
			//n1 � menor;
			//n2 � maior;
			//n1 < n3 < n2;
			System.out.println(n2 + " - " + n3 + " - " + n1);
			
		}else 
			if(n2 <= n1 && n2 <= n3 && n1 <= n3) {
			//n2 � menor;
			//n3 � maior;
			//n2 < n1 < n3;
			System.out.println(n3 + " - " + n1 + " - " + n2);
			
		}else 
			if(n2 <= n1 && n2 <= n3 && n3 <= n1) {
			//n2 � menor;
			//n1 � maior;
			//n2 < n3 < n1;
			System.out.println(n1 + " - " + n3 + " - " + n2);
			
		}else 
			if(n3 <= n1 && n3 <= n2 && n2 <= n1) {
			//n3 � menor;
			//n1 � maior;
			//n3 < n2 < n1;
			System.out.println(n1 + " - " + n2 + " - " + n3);
			
		}else 
			if(n3 <= n1 && n3 <= n2 && n1 <= n2) {
			//n3 � menor;
			//n2 � maior;
			//n3 < n1 < n2;
			System.out.println(n2 + " - " + n1 + " - " + n3);
		}
		

	}

}
