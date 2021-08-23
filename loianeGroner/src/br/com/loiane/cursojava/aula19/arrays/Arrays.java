package br.com.loiane.cursojava.aula19.arrays;

public class Arrays {

	public static void main(String[] args) {


		String [] nomes = new String[10];
		
		nomes[0] = "Carlos";
		nomes[1] = "Júlia";
		nomes[2] = "Alexandre";
		nomes[3] = "Lucca";
		nomes[4] = "Pedro";
		nomes[5] = "Magno";
		nomes[6] = "Túlio";
		nomes[7] = "Bárbara";
		nomes[8] = "Camila";
		nomes[9] = "Ângelo";
		
		for(int i = 0; i < nomes.length; i++ ) {
			System.out.println("O " + (i+1) + "º nome é " + nomes[i]);

		}
		
	}

}
