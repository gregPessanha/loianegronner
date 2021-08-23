package br.com.loiane.cursojava.aula13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 18. Fa�a um programa que pe�a o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).
 * @author carlo
 *
 */
public class Ex018 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##.##");
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o tamanho do arquivo em Mb, e a velocidade do link de Internet em Mbps: ");
		double tamanhoArquivo = scan.nextDouble();
		double velocidade = scan.nextDouble() / 60;
		double tempoDeDowload = tamanhoArquivo / velocidade;
		
		System.out.println("O tempo aproximado de Download do arquivo informado � : " + df.format(tempoDeDowload) + " Minutos.");
	}

}
