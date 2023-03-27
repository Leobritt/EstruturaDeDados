package listaencadeada;

public class ListaEncadeada<T> {
//tipando de forma generica 
	private No<T> inicio;

	private No<T> ultimo;

	private int tamanho = 0;

	public void adiciona(T elemento) {

		No<T> celula = new No<T>(elemento);
		// se a celular tiver vazia o inico a ponta para a primeira celula
		// o ultimo e o inicio apontam para celula e acresce 1 no tamanaho
		if (this.tamanho == 0) {
			this.inicio = celula;

		} else {
			// se a lista não tiver vazia o ultimo será apontado/setado para a proxima
			// celula
			this.ultimo.setProximo(celula);
		}
		// o ultimo aponta para celula e acresce 1 no tamanaho
		this.ultimo = celula;
		this.tamanho++;

	}

	public int gettamanho() {
		return this.tamanho;
	}

	public void limpa() {
		for (No<T> atual = this.inicio;  atual != null; ) {
			No<T> auxProximo = atual.getProximo();
			atual.setElemento(null);
			atual.setProximo(null);
			atual = auxProximo;
		}
		
	}

	// percorrer a lista
	@Override
	public String toString() {
		// lista vazia
		if (this.tamanho == 0) {
			return "[]";
		}

		StringBuilder stb = new StringBuilder();
		// atribuindo o valor de atual ao primeiro elemento
		No<T> atual = this.inicio;
		// obtendo o "valor" do atual
		stb.append(atual.getElemento()).append(",");
		
		//Tambem pode-se percorrer a lista usando: for (int i = 0; i < tamanho - 1; i++)
		while (atual.getProximo() != null) {
			// movendo para o proximo elemento
			atual = atual.getProximo();
			stb.append(atual.getElemento()).append(",");

		}

		return stb.toString();

	}

}
