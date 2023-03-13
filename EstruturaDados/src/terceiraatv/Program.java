package terceiraatv;

public class Program {

	public static void main(String[] args) {
		Professor professor = new Professor();
		
		professor.insere("Osvaldo", "01");
		professor.insere("Mario Jorge", "02");
		professor.insere("Fernando", "03");
		professor.insere("Hamilton", "04");
		professor.insere("Glaucya", "05");
		professor.insere("Flavio Dusse", "06");
		professor.insere("Marco Camara", "07");
		
		System.out.println("---LISTA---");
		professor.listar();
		
		System.out.println();
		System.out.println("Tamanho: "+professor.tamanho());
		
		System.out.println("Elemento no espaço 1: "+professor.get(0));
	}

}
