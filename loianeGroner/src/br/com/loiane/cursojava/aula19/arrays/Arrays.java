package br.com.loiane.cursojava.aula19.arrays;

public class Arrays {

	public static void main(String[] args) {


		String [] nomes = new String[10];
		
		nomes[0] = "Carlos";
		nomes[1] = "J�lia";
		nomes[2] = "Alexandre";
		nomes[3] = "Lucca";
		nomes[4] = "Pedro";
		nomes[5] = "Magno";
		nomes[6] = "T�lio";
		nomes[7] = "B�rbara";
		nomes[8] = "Camila";
		nomes[9] = "�ngelo";
		
		for(int i = 0; i < nomes.length; i++ ) {
			System.out.println("O " + (i+1) + "� nome � " + nomes[i]);

		}
		
	}

}
