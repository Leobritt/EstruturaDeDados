package segundaatv;

public class Aluno implements AlunoInterface{

	private String nome, semestre;
	private String arrayNome[] = new String[10];
	private String arraySemestre[] = new String[10];
	int cont = 0;
	
	
	
	public String getNome() {
		return nome;
	}

	public String getSemestre() {
		return semestre;
	}

	@Override
	public void insere(String nome, String semestre) {
		arrayNome[cont] = nome;
		arraySemestre[cont] = semestre;
		cont++;
	}

	@Override
	public int tamanho() {
		return cont;
	}

	@Override
	public void listar() {
		for (int i = 0; i < arrayNome.length; i++) {
			if (arrayNome[i] == null) {
				
			} else {
				System.out.println(arrayNome[i]+", "+arraySemestre[i]);
			}
		}
		
	}

	@Override
	public String get(int i) {
		
		return arrayNome[i] + arraySemestre[i];
	}

}
