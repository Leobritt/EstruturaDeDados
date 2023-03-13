package segundaatv;

public class Program {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.insere("Helio Norway", "8º");
		aluno.insere("Maria Kaya", "4º");
		aluno.insere("Joana Becks", "2º");
		aluno.insere("Cleiton Kherr", "3º");
		aluno.insere("Marco Stark", "6º");
		aluno.insere("Fernando Souza", "1º");
		aluno.insere("Leonardo DiVinci", "8º");
		aluno.insere("Pedro Fildago", "3º");
		aluno.insere("Amanada Silva", "7º");
		
		System.out.println("---LISTA---");
		aluno.listar();
		System.out.println();
		System.out.println("Tamanho: "+aluno.tamanho());
		System.out.println();
		
		System.out.println("Elemento na posição 3: "+aluno.get(2));
	}

}
