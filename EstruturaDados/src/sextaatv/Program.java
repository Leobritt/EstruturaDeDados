package sextaatv;

public class Program {

	public static void main(String[] args) {
		ListaTelefonica c1 = new ListaTelefonica();
		c1.inserir("71 99898-8087", "Raul Seixas");
		c1.inserir("21 98761-9876", "Jorge Filho");
		c1.inserir("11 42012-0921", "Linus Torvald");
		c1.inserir("02 9812-1212", "Roger Winglesman");

		System.out.println("\n------Lista--------");
		c1.atualizar();
		c1.deletar("71 99898-8087", "Raul Seixas");
		System.out.println("Tamanho: "+c1.tamnho());
		c1.inserir("11 0212-021", "Thorgan Hazard");
		c1.inserir("321 5331-2132", "Thomas Muller");
		System.out.println("\n------Lista--------");
		c1.atualizar();
		System.out.println("Tamanho: "+c1.tamnho());

	}

}
