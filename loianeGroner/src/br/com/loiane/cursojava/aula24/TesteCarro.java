package br.com.loiane.cursojava.aula24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCarro {

	public static void main(String[] args) {

		List<Carro> veiculos = new ArrayList<>();

		veiculos.add(new Carro("Fiat", "Ducato", 12, 100, 1.5, 80000d));
		veiculos.add(new Carro("Nissan", "Versa", 5, 45, 9.5, 75000d));
		veiculos.add(new Carro("Ford", "Ka", 5, 50, 11, 50000d));
		veiculos.add(new Carro("CR-V", "Honda", 5, 60, 7.5, 180000d));
		veiculos.add(new Carro("Nissan", "Z-350", 2, 45, 2, 700000d));
		veiculos.add(new Carro("Chevrolet", "Onix", 5, 55, 11, 70000d));
		veiculos.add(new Carro("Ford", "Mustang", 2, 43.5, 5.5, 900000d));


		Collections.sort(veiculos);
		
		System.out.println("CADASTRANDO VEÍCULOS");
		System.out.println("A lista contém " + veiculos.size() + " Veículos");
		System.out.println();

		for (Carro carro : veiculos) {
			System.out.println(carro);
			System.out.println("___________________________________________________");
		}
		
	
	}

}
