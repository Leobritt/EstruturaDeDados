package tadlivros;

public class Livros implements LivrosInterface {
	private String titulo, editora, anoPublic;

	private String vetorT[] = new String[10];

	private String vetorE[] = new String[10];

	private String vetorAnoPublic[] = new String[10];

	int n = 0;

	public String getTitulo() {
		return titulo;
	}

	public String getEditora() {
		return editora;
	}

	public String getAnoPublic() {
		return anoPublic;
	}

	@Override
	public void listar() {
		for (int i = 0; i < vetorAnoPublic.length; i++) {
			if (vetorAnoPublic[i] == null) {

			} else {
				System.out.println(vetorT[i] + ", " + vetorE[i] + ", " + vetorAnoPublic[i]);
			}
		}

	}

	@Override
	public int tamanho() {

		return n;
	}

	@Override
	public void insere(String titulo, String editora, String anoPublic) {
		vetorT[n] = titulo;
		vetorE[n] = editora;
		vetorAnoPublic[n] = anoPublic;
		n++;
	}

	@Override
	public String get(int i) {

		return vetorT[i] + vetorE[i] + vetorAnoPublic[i];
	}

}
