package primeiraatv;

public interface LivrosInterface {
	void listar();
	int tamanho();
	void insere(String titulo,String editora,String anoPublic);
	String get(int i);
}
