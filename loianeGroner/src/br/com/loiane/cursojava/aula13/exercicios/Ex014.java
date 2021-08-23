package br.com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Ex014 {
/**
 * Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de S�o Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um programa que leia a vari�vel peso (peso de peixes) e
verifique se h� excesso. Se houver, gravar na vari�vel excesso e na vari�vel multa o valor da multa que Jo�o dever� pagar. Caso contr�rio
mostrar tais vari�veis com o conte�do ZERO.
 * @param args
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a quantidade de peso em kg: ");
		double pesoPescado = scan.nextDouble();
		double excessoDePeso = pesoPescado - 50;
		double multaPorExcesso = excessoDePeso * 4;
		
		if(pesoPescado > 50) {
			System.out.println("Voc� dever� pagar uma multa de R$ " + multaPorExcesso + " por excesso de peso.");
		}else {
			System.out.println("N�o h� Excesso de peso, e, consequentemente N�O H� MULTA!");
		}
		
		
	}

}
