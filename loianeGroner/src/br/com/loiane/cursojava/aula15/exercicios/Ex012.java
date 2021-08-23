package br.com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex012 {
/**
 * Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto 
 * (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). 
 * O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
 * O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês. 
 * Desconto do IR: o Salário Bruto até 900 (inclusive) - isento;
 * Salário Bruto até 1500 (inclusive) - desconto de 5%;
 * Salário Bruto até 2500 (inclusive) - desconto de 10%; 
 * Salário Bruto acima de 2500 - desconto de 20%;
 * 
 * Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
 * No exemplo o valor da hora é 5 e a quantidade de hora é 220. 
 * Salário Bruto: (5 * 220) : R$ 1100,00 
 * IR (5%) : R$ 55,00
 * INSS (10%) : R$ 110,00 
 * FGTS (11%) : R$ 121,00 
 * Total de descontos : R$ 165,00 
 * Salário Liquido : R$ 935,00 
 * @param args
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da sua hora trabalhada: R$ ");
		double valorHoraTrabalhada = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas no Mês: ");
		double qtdHorasMensais = scan.nextDouble();
		
		double salBruto = valorHoraTrabalhada * qtdHorasMensais;
		int percentualIr = 0;
		if(salBruto <= 900) {
			percentualIr = 0;
		}else if (salBruto > 900 && salBruto <= 1500) {
			percentualIr = 15;
		}else if (salBruto > 1500 && salBruto <= 2500) {
			percentualIr = 10;
		}else if (salBruto > 2500) {
			percentualIr = 20;
		}
		
		double descIr = (salBruto / 100) * percentualIr;
		double descInss = salBruto * 0.1;
		double fgts = salBruto * 0.11;
		double totalDescontos = descIr + descInss;
		double salLiquido = salBruto - totalDescontos;
		
		System.out.println("Quantidade de horas trabalhadas: " + qtdHorasMensais);
		System.out.println("Valor da Hora: " + valorHoraTrabalhada);
		System.out.println("Salário Bruto: " + salBruto);
		System.out.println();
		System.out.println("(-) IR " + percentualIr + "% : R$ " + descIr);
		System.out.println("(-) INSS (10%) : R$ " + descInss);
		System.out.println("FGTS (11%) : R$ " + fgts);
		System.out.println("Total de descontos : R$ " + totalDescontos);
		System.out.println("Salário Líquido : R$ " + salLiquido);
		
		
		
		
		
		
	}

}
