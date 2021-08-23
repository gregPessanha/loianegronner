package br.com.loiane.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];

		boolean sair = false; // FLAG
		int opcao;
		while (!sair) {

			System.out.println("Digite 1 para adicionar compromisso: ");
			System.out.println("Digite 2 para verificar compromisso: ");
			System.out.println("Digite 0 para sair: ");

			opcao = scan.nextInt();

			if (opcao == 1) { // adicionar compromisso
				boolean diaValido = false;
				int dia;
				while (!diaValido) {
					System.out.println("Informe o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido!");
					}

					boolean horaValida = false;
					int hora = 0;

					while (!horaValida) {
						System.out.println("Informe a hora do compromisso: ");
						hora = scan.nextInt();
						if (hora > 0 && hora < 24) {
							horaValida = true;
						} else {
							System.out.println("Hora Inválida!");
						}
					}

					System.out.println("Digite o compromisso: ");
					compromissos[--dia][hora] = scan.next(); // Como começa de zero, se o usuário digitar dia 11, na
																// verdade aparecerá o 12.
				}

			} else if (opcao == 2) {// verificar compromisso
				boolean diaValido = false;
				int dia;
				while (!diaValido) {
					System.out.println("Informe o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido!");
					}

					boolean horaValida = false;
					int hora = 0;

					while (!horaValida) {
						System.out.println("Informe a hora do compromisso: ");
						hora = scan.nextInt();
						if (hora > 0 && hora < 24) {
							horaValida = true;
						} else {
							System.out.println("Hora Inválida!");
						}
					}
					dia--;
					System.out.print("O compromisso agendado é: " + "");
					System.out.println(compromissos[dia][hora]);

				}

			} else if (opcao == 0) {
				sair = true;

			} else {
				System.out.println("Opção Inválida, digite novamente!");
			}

		}

	}
}
