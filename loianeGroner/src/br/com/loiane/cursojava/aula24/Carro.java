package br.com.loiane.cursojava.aula24;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Carro implements Comparable<Carro> {

	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	Double preco;

	public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel,
			double consumoCombustivel, Double preco) {

		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		this.preco = preco;
	}

	DecimalFormat df = new DecimalFormat(" #, ##0.00");

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	public double getPreco() {

		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {

		return "Marca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nCapacidade máxima de passageiros: "
				+ this.getNumeroPassageiros() + "\nQuantidade máxima do tanque de combustível: "
				+ this.getCapacidadeCombustivel() + " L" + "\nConsumo de Combustível: " + this.getConsumoCombustivel()
				+ " Km/L" + "\nPREÇO: R$ " + df.format(preco);
	}

	@Override
	public int compareTo(Carro outroObjeto) {
		Double d = preco;
		return d.compareTo(outroObjeto.getPreco());
	}

//	public void impressao(ArrayList<Carro> veiculos) {
//		System.out.print(String.format("%-10s", "Marca"));
//		System.out.printf("%15s", "Modelo");
//		System.out.printf("%15s", "Número de Passageiros");
//		System.out.printf("%15s", "Capacidade de Combustível");
//		System.out.printf("%15s", "Consumo de Combustível");
//		System.out.printf("%15s", "PREÇO");
//		System.out.println("");
//
//		for (int i = 0; i < veiculos.size(); i++) {
//			System.out.print(String.format("%-10s", veiculos.get(i).getMarca()));
//			System.out.printf("%15s", veiculos.get(i).getModelo());
//			System.out.printf("%15s", veiculos.get(i).getNumeroPassageiros());
//			System.out.printf("%15s", veiculos.get(i).getCapacidadeCombustivel());
//			System.out.printf("%15s", veiculos.get(i).getConsumoCombustivel());
//			System.out.printf("%15s", veiculos.get(i).getPreco());
//
//		}
//	}
}
