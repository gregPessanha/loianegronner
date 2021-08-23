package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex003 {
	/**
	 * Fa�a um programa que leia e valide as seguintes informa��es: a. Nome: maior
	 * que 3 caracteres; b. Idade: entre 0 e 150; c. Sal�rio: maior que zero; d.
	 * Sexo: 'f' ou 'm'; e. Estado Civil: 's', 'c', 'v', 'd';
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean informacoesValidas = false; // flag
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;

		do {
			System.out.println("Digite um nome: ");
			nome = scan.next();
			if (nome.length() >= 3) {
				informacoesValidas = true;
			} else {
				System.out.println("O nome precisa de, no m�nimo, 3 caracterers. ");
			}
		} while (!informacoesValidas);

		informacoesValidas = false;

		do {
			System.out.println("Digite uma idade: ");
			idade = scan.nextInt();
			if (idade < 150) {
				informacoesValidas = true;
			} else {
				System.out.println("A idade tem que ser menor do que 150.");
			}
		} while (!informacoesValidas);

		informacoesValidas = false;

		do {
			System.out.println("Digite um Valor de Sal�rio: ");
			salario = scan.nextDouble();
			if (salario > 0) {
				informacoesValidas = true;
			} else {
				System.out.println("O sal�rio tem que ser maior do que 0.");
			}
		} while (!informacoesValidas);

		informacoesValidas = false;

		do {
			System.out.println("Digite um G�nero [M/F]: ");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				informacoesValidas = true;
				if (sexo.equalsIgnoreCase("m")) {
					sexo = "Masculino";
				} else {
					sexo = "Feminino";
				}
			} else {
				System.out.println("O G�nero s� pode ser M ou F.");
			}
		} while (!informacoesValidas);

		informacoesValidas = false;

		do {
			System.out.println(
					"Informe o Estado Civil: \n[C] - Casado \n[S] - Solteiro \n[V] - Vi�vo \n[D] - Divorciado ");
			estadoCivil = scan.next();
			if (estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("s")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				informacoesValidas = true;
				if (estadoCivil.equalsIgnoreCase("c")) {
					if(sexo.equalsIgnoreCase("masculino")) {
						estadoCivil = "Casado";
					}else {
						estadoCivil = "Casada";
					}
				} else if (estadoCivil.equalsIgnoreCase("s")) {
					if(sexo.equalsIgnoreCase("masculino")) {
						estadoCivil = "Solteiro";
					}else {
						estadoCivil = "Solteira";
					}
				} else if (estadoCivil.equalsIgnoreCase("v")) {
					if(sexo.equalsIgnoreCase("masculino")) {
						estadoCivil = "Vi�vo";
					}else {
						estadoCivil = "Vi�va";
					}
				} else {
					if(sexo.equalsIgnoreCase("masculino")) {
						estadoCivil = "Divorciado";
					}else {
						estadoCivil = "Divorciada";
					};
				}
			}

		} while (!informacoesValidas);
		
		 System.out.println("Nome: " + nome);
		 System.out.println("Idade: " + idade);
		 System.out.println("Sal�rio: R$ " + salario);
		 System.out.println("Sexo: " + sexo);
		 System.out.println("Estado Civil: " + estadoCivil);
		 System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
		 System.out.println("CADASTRO REALIZADO COM SUCESSO!");
	}
}
