package br.com.loiane.cursojava.aula18.breakEcontinue;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = scan.nextInt();

		System.out.println("Informe um limite: ");
		int max = scan.nextInt();
		
//		for(int i = num; i <= max; i++) {
//			System.out.println(i);
//			if(i % 7 == 0) {
//				System.out.println("O valor de i é " + i);
//				break;
//			}
//		}
		
		for(int i = num; i <= max; i++) {
			if(i % 7 == 0) {
				continue; //Não quero imprimir na tela quem é divisível por 7;
			}
			System.out.println("O valor de i é " + i);

		}

		
	}

}
