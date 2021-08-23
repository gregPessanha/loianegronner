package br.com.loiane.cursojava.aula15.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex011 {
	/**
	 * As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus
	 * colaboradores e lhe contraram para desenvolver o programa que calcular� os
	 * reajustes. o Fa�a um programa que recebe o sal�rio de um colaborador e o
	 * reajuste segundo o seguinte crit�rio, baseado no sal�rio atual: o sal�rios
	 * at� R$ 280,00 (incluindo) : aumento de 20% ------------ o sal�rios entre R$
	 * 280,00 e R$ 700,00 : aumento de 15% o sal�rios entre R$ 700,00 e R$ 1500,00 :
	 * aumento de 10% o sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o
	 * aumento ser realizado, informe na tela: O sal�rio antes do reajuste; o o
	 * percentual de aumento aplicado; o o valor do aumento; o o novo sal�rio, ap�s
	 * o aumento.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat(".##");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o sal�rio do funcion�rio: R$ ");
		double salario = scan.nextDouble();

		if (salario <= 280) {
			double salarioReajustado = salario + (salario * 0.2);
			System.out.println(
					"Voc� ter� um reajuste de 20%. \nSeu sal�rio passar� a ser R$ " + df.format(salarioReajustado));

		} else if (salario > 280 && salario < 700) {
			double salarioReajustado = salario + (salario * 0.15);
			System.out.println(
					"Voc� ter� um reajuste de 15%. \nSeu sal�rio passar� a ser R$ " + df.format(salarioReajustado));

		} else if (salario >= 700 && salario < 1500) {
			double salarioReajustado = salario + (salario * 0.1);
			System.out.println(
					"Voc� ter� um reajuste de 10%. \nSeu sal�rio passar� a ser R$ " + df.format(salarioReajustado));

		} else {
			double salarioReajustado = salario + (salario * 0.05);
			System.out.println(
					"Voc� ter� um reajuste de 5%. \nSeu sal�rio passar� a ser R$ " + df.format(salarioReajustado));
		}
	}

}
