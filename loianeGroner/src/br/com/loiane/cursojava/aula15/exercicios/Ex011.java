package br.com.loiane.cursojava.aula15.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex011 {
	/**
	 * As Organizações Tabajara resolveram dar um aumento de salário aos seus
	 * colaboradores e lhe contraram para desenvolver o programa que calculará os
	 * reajustes. o Faça um programa que recebe o salário de um colaborador e o
	 * reajuste segundo o seguinte critério, baseado no salário atual: o salários
	 * até R$ 280,00 (incluindo) : aumento de 20% ------------ o salários entre R$
	 * 280,00 e R$ 700,00 : aumento de 15% o salários entre R$ 700,00 e R$ 1500,00 :
	 * aumento de 10% o salários de R$ 1500,00 em diante : aumento de 5% Após o
	 * aumento ser realizado, informe na tela: O salário antes do reajuste; o o
	 * percentual de aumento aplicado; o o valor do aumento; o o novo salário, após
	 * o aumento.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat(".##");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o salário do funcionário: R$ ");
		double salario = scan.nextDouble();

		if (salario <= 280) {
			double salarioReajustado = salario + (salario * 0.2);
			System.out.println(
					"Você terá um reajuste de 20%. \nSeu salário passará a ser R$ " + df.format(salarioReajustado));

		} else if (salario > 280 && salario < 700) {
			double salarioReajustado = salario + (salario * 0.15);
			System.out.println(
					"Você terá um reajuste de 15%. \nSeu salário passará a ser R$ " + df.format(salarioReajustado));

		} else if (salario >= 700 && salario < 1500) {
			double salarioReajustado = salario + (salario * 0.1);
			System.out.println(
					"Você terá um reajuste de 10%. \nSeu salário passará a ser R$ " + df.format(salarioReajustado));

		} else {
			double salarioReajustado = salario + (salario * 0.05);
			System.out.println(
					"Você terá um reajuste de 5%. \nSeu salário passará a ser R$ " + df.format(salarioReajustado));
		}
	}

}
