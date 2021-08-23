package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex014 {
/**
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.
 * @param args
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a quantidade de peso em kg: ");
		double pesoPescado = scan.nextDouble();
		double excessoDePeso = pesoPescado - 50;
		double multaPorExcesso = excessoDePeso * 4;
		
		if(pesoPescado > 50) {
			System.out.println("Você deverá pagar uma multa de R$ " + multaPorExcesso + " por excesso de peso.");
		}else {
			System.out.println("Não há Excesso de peso, e, consequentemente NÃO HÁ MULTA!");
		}
		
		
	}

}
