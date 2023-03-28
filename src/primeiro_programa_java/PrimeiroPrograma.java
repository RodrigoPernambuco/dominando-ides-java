package primeiro_programa_java;

import primeiro_programa_java.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		System.out.println(gato);
		System.out.println(livro);

	}

}

class Livros {
	private String nome;
	private String npag;
}