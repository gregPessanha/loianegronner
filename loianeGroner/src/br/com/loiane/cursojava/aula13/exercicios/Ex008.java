package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex008 {

	/**
	 * Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe qual o seu salário por hora, e quantas horas você trabalha por mês: ");
		
		double salario = scan.nextDouble();
		double horasTrabalhadasMes = scan.nextDouble();
		double salarioMensal = salario * horasTrabalhadasMes;
		
		System.out.println("Se você trabalhar " + horasTrabalhadasMes + " horas mensais, seu salário será R$ " + salarioMensal);
	}

}
