/**
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
 -> Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
 */
package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe qual o seu salário por hora, e quantas horas você trabalha por mês: ");

		double salario = scan.nextDouble();
		double horasTrabalhadasMes = scan.nextDouble();
		
		double salarioBruto = salario * horasTrabalhadasMes;
		System.out.println("Salário bruto: R$ " + salarioBruto);
		
		double impostoRenda = salarioBruto * 0.11;
		System.out.println("Desconto Imposto de Renda: R$ " + impostoRenda);
		
		double descontoInss = salarioBruto * 0.08;
		System.out.println("Desconto do INSS: R$ " + descontoInss);
		
		double descontoSindicato = salarioBruto * 0.05;
		System.out.println("Desconto do Sindicato: R$ " + descontoSindicato);
		
		double descontoTotal = impostoRenda + descontoInss + descontoSindicato ;
		
		double SalarioLiquido = salarioBruto - descontoTotal;
		
		System.out.println("Desconto total: R$ " + descontoTotal);
		System.out.println("Salário líquido: R$ " + (SalarioLiquido));
		
	}

}
