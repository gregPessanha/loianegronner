package br.com.loiane.cursojava.aula20.matrizes;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o n�mero de pessoas entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		
		String [][] nomesDosFilhos = new String[numEntrevistados][];
		for(int i = 0; i < nomesDosFilhos.length; i++) {
			System.out.print("Informe a quantidade de filhos: ");
			int qtdFilhos = scan.nextInt();
			
			nomesDosFilhos[i] = new String [qtdFilhos];
			
			for(int j = 0; j < nomesDosFilhos[i].length; j++) {
				System.out.print("Digite o nome do " + (j+1) + "� filho:");
				nomesDosFilhos[i][j] = scan.next();
			}
		}
		
		for(int i = 0; i < nomesDosFilhos.length; i++) {
			System.out.println("A " + (i+1) + "� pessoa tem " + nomesDosFilhos[i].length + " filhos." );
			for(int j = 0; j < nomesDosFilhos[i].length; j++) {
				System.out.println(nomesDosFilhos[i][j]);
			}
		}
	}

}
