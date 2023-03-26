package sextaatv;

public class ListaTelefonica implements ListaTelefonicaInterface {

	private String arrayTel[] = new String[30];
	private String arrayNome[] = new String[30];

	int cont = 0;
	Boolean delete = false;
	int aux = 0;

	@Override
	public void inserir(String tel, String nome) {
		arrayTel[cont] = tel;
		arrayNome[cont] = nome;
		cont++;
	}

	@Override
	public void atualizar() {
		for (int i = 0; i < arrayNome.length; i++) {
			if (arrayNome[i] == null || arrayTel[i] == null) {

			} else {
				System.out.println(arrayNome[i] + ", " + arrayTel[i]);

			}
		}
	}

	@Override
	public int tamnho() {
		if (delete == true) {
			return cont-= aux;
		}
		return cont;
	}

	@Override
	public void deletar(String tel, String nome) {
		for (int i = 0; i < arrayNome.length; i++) {
			if (arrayTel[i] == tel || arrayNome[i] == nome) {
				aux++;
				delete = true;
				arrayTel[i] = null;
				arrayNome[i] = null;
				cont++;
				

			}
	
		}
		
	
		
	}

}
