package br.com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Ex003 {
	/**
	 * Faça um programa que leia e valide as seguintes informações: a. Nome: maior
	 * que 3 caracteres; b. Idade: entre 0 e 150; c. Salário: maior que zero; d.
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
				System.out.println("O nome precisa de, no mínimo, 3 caracterers. ");
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
			System.out.println("Digite um Valor de Salário: ");
			salario = scan.nextDouble();
			if (salario > 0) {
				informacoesValidas = true;
			} else {
				System.out.println("O salário tem que ser maior do que 0.");
			}
		} while (!informacoesValidas);

		informacoesValidas = false;

		do {
			System.out.println("Digite um Gênero [M/F]: ");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				informacoesValidas = true;
				if (sexo.equalsIgnoreCase("m")) {
					sexo = "Masculino";
				} else {
					sexo = "Feminino";
				}
			} else {
				System.out.println("O Gênero só pode ser M ou F.");
			}
		} while (!informacoesValidas);

		informacoesValidas = false;

		do {
			System.out.println(
					"Informe o Estado Civil: \n[C] - Casado \n[S] - Solteiro \n[V] - Viúvo \n[D] - Divorciado ");
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
						estadoCivil = "Viúvo";
					}else {
						estadoCivil = "Viúva";
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
		 System.out.println("Salário: R$ " + salario);
		 System.out.println("Sexo: " + sexo);
		 System.out.println("Estado Civil: " + estadoCivil);
		 System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
		 System.out.println("CADASTRO REALIZADO COM SUCESSO!");
	}
}
