package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex008 {

	/**
	 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o
n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
sal�rio no referido m�s.
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe qual o seu sal�rio por hora, e quantas horas voc� trabalha por m�s: ");
		
		double salario = scan.nextDouble();
		double horasTrabalhadasMes = scan.nextDouble();
		double salarioMensal = salario * horasTrabalhadasMes;
		
		System.out.println("Se voc� trabalhar " + horasTrabalhadasMes + " horas mensais, seu sal�rio ser� R$ " + salarioMensal);
	}

}
