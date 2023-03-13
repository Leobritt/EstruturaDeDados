package primeiraatv;

public class Program {

	public static void main(String[] args) {
		Livros livro = new Livros();
		livro.insere("A insustentável leveza do ser", " Companhia das Letras ", "1984");
		livro.insere("1984", "Companhia das Letras", "1949");
		livro.insere("O apanhador no campo de centeio","Editora do Autor", "1951");
		livro.insere("O mundo de Sofia", "Companhia das Letras", "1991");
		livro.insere("O pequeno principe", "Agir", "1943");
		livro.insere("O nome da rosa", " Editora Record", "1980");
		livro.insere("As crônicas de Nárnia: O leão, a feiticeira e o guarda-roupa", "WMF Martins Fontes", "1950");
		
		
		System.out.println("---LISTA---");
		livro.listar();
	
		System.out.println();
		System.out.println("Tamnho: "+livro.tamanho());
		
		System.out.println("Livro no espaço 06 do vetor: "+livro.get(6));
	}

}
