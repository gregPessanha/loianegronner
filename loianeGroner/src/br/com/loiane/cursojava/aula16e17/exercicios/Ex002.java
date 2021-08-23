package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex002 {
	/**
	 * Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a
	 * senha igual ao nome do usu�rio, mostrando uma mensagem de erro e voltando a
	 * pedir as informa��es.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean infoValidas = false;
		String nomeUsuario;
		String senha;

		do {
			System.out.println("Digite o nome de usu�rio: ");
			nomeUsuario = scan.next();
			System.out.println("Digite a senha: ");
			senha = scan.next();

			if (nomeUsuario.equalsIgnoreCase(senha)) {

				System.out.println("Senha igual a usu�rio. Digite Novamente:");
			} else {
				infoValidas = true;
				System.out.println("Senha e usu�rio v�lidos");
			}

		} while (!infoValidas);

	}

}
