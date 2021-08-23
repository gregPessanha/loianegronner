package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex002 {
	/**
	 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
	 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
	 * pedir as informações.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean infoValidas = false;
		String nomeUsuario;
		String senha;

		do {
			System.out.println("Digite o nome de usuário: ");
			nomeUsuario = scan.next();
			System.out.println("Digite a senha: ");
			senha = scan.next();

			if (nomeUsuario.equalsIgnoreCase(senha)) {

				System.out.println("Senha igual a usuário. Digite Novamente:");
			} else {
				infoValidas = true;
				System.out.println("Senha e usuário válidos");
			}

		} while (!infoValidas);

	}

}
