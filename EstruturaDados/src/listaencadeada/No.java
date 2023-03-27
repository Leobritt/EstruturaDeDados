package listaencadeada;

public class No<T> {
//Tipo generico do Java <T>

	//guarda o "valor"
	private T elemento;
	private No<T> proximo;
	// Linkando ao proximo No com tipo generico

	public No(T elemento) {
		this.elemento = elemento;
		//setando o proximo como null
		this.proximo = null;
	}

	public No(T elemento, No<T> proximo) {
		super();
		this.elemento = elemento;
		this.proximo = proximo;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No [elemento: " + elemento + ", proximo: " + proximo;
	}

}
