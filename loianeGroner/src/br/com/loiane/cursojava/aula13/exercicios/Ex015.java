/**
 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um
programa que nos d�:
a. sal�rio bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o sal�rio l�quido.
e. calcule os descontos e o sal�rio l�quido, conforme a tabela
abaixo:
 -> Sal�rio Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio Liquido : R$
Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.
 */
package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe qual o seu sal�rio por hora, e quantas horas voc� trabalha por m�s: ");

		double salario = scan.nextDouble();
		double horasTrabalhadasMes = scan.nextDouble();
		
		double salarioBruto = salario * horasTrabalhadasMes;
		System.out.println("Sal�rio bruto: R$ " + salarioBruto);
		
		double impostoRenda = salarioBruto * 0.11;
		System.out.println("Desconto Imposto de Renda: R$ " + impostoRenda);
		
		double descontoInss = salarioBruto * 0.08;
		System.out.println("Desconto do INSS: R$ " + descontoInss);
		
		double descontoSindicato = salarioBruto * 0.05;
		System.out.println("Desconto do Sindicato: R$ " + descontoSindicato);
		
		double descontoTotal = impostoRenda + descontoInss + descontoSindicato ;
		
		double SalarioLiquido = salarioBruto - descontoTotal;
		
		System.out.println("Desconto total: R$ " + descontoTotal);
		System.out.println("Sal�rio l�quido: R$ " + (SalarioLiquido));
		
	}

}
