package tadprofessor;

public class Professor implements ProfessorInterface {

	private String nome, codigoDisicplina;

	private String arrayNome[] = new String[10];

	private String arrayCodigoDisciplina[] = new String[10];

	int cont = 0;

	public String getNome() {
		return nome;
	}

	public String getCodigoDisicplina() {
		return codigoDisicplina;
	}

	@Override
	public void listar() {
		for (int i = 0; i < arrayCodigoDisciplina.length; i++) {
			if (arrayNome[i] == null) {

			} else {
				System.out.println(arrayNome[i] + "," + arrayCodigoDisciplina[i]);
			}
		}
	}

	@Override
	public String get(int i) {
		return arrayNome[i] + arrayCodigoDisciplina[i];
	}

	@Override
	public int tamanho() {
		return cont;
	}

	@Override
	public void insere(String nome, String codigoDisciplina) {
		arrayNome[cont] = nome;
		arrayCodigoDisciplina[cont] = codigoDisciplina;
		cont++;
	}

}
