package br.com.loiane.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];

		boolean sair = false;
		int opcao;

		while (!sair) {

			System.out.println("Digite 1 para adicionar compromisso: ");
			System.out.println("Digite 2 para verificar compromisso: ");
			System.out.println("Digite 0 para sair: ");

			opcao = scan.nextInt();

			if (opcao == 1) {
				boolean mesValido = false;
				int mes;
				while (!mesValido) {
					System.out.println("Informe o m�s: ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 8) {
						mesValido = true;
					} else {
						System.out.println("M�s inv�lido!");
					}

					boolean diaValido = false;
					int dia;
					while (!diaValido) {
						System.out.println("Informe o dia do m�s: ");
						dia = scan.nextInt();
						if (dia > 0 && dia <= 31) {
							diaValido = true;
						} else {
							System.out.println("dia inv�lido!");
						}

						boolean horaValida = false;
						int hora = 0;

						while (!horaValida) {
							System.out.println("Informe a hora do compromisso: ");
							hora = scan.nextInt();
							if (hora >= 8 && hora <= 18) {
								horaValida = true;
							} else {
								System.out.println("Hora Inv�lida!");
							}
						}
						dia--;
						mes--;
						System.out.println("Digite o compromisso: ");
						compromissos[--dia][hora] = scan.next(); // Como come�a de zero, se o usu�rio digitar dia 11, na
																	// verdade aparecer� o 12.

					}
				}

			} else if (opcao == 2) {// verificar compromisso
				boolean mesValido = false;
				int mes;
				while (!mesValido) {
					System.out.println("Informe o m�s: ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 8) {
						mesValido = true;
					} else {
						System.out.println("M�s inv�lido!");
					}

					boolean diaValido = false;
					int dia;
					while (!diaValido) {
						System.out.println("Informe o dia do m�s: ");
						dia = scan.nextInt();
						if (dia > 0 && dia <= 31) {
							diaValido = true;
						} else {
							System.out.println("Dia inv�lido!");
						}

						boolean horaValida = false;
						int hora = 0;

						while (!horaValida) {
							System.out.println("Informe a hora do compromisso: ");
							hora = scan.nextInt();
							if (hora > 0 && hora < 24) {
								horaValida = true;
							} else {
								System.out.println("Hora Inv�lida!");
							}
						}
						dia--;
						System.out.print("O compromisso agendado �: " + "");
						System.out.println(compromissos[dia][hora]);

					}
				}

			} else if (opcao == 0) {
				sair = true;

			} else {
				System.out.println("Op��o Inv�lida, digite novamente!");
			}
		}

	}

}
