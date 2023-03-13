package quartaatv;

import java.text.DecimalFormat;

public class Racionais implements RacionaisInterface {

	private Double n1, n2,sum,multi;

	private int escolha;
	int cont = 0;

	public Racionais(Double n1, Double n2, int escolha) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.escolha = escolha;
	}

	@Override
	public Double somarRacional() {

		return n1 + n2;
	}

	@Override
	public Double multiplicarRacional() {

		return n1 * n2;
	}

	@Override
	public void criarnovoRacional() {
		if (escolha == 1) {
			System.out.println(multiplicarRacional()); 
			
		} else if (escolha == 2) {
			System.out.println(somarRacional());
		
		} else if (escolha == 3) {
			teste(escolha);
			
		}
		
	}

	@Override
	public void teste(int n) {
		if (sum != null) {
			if (sum == 41 / 9 || sum == 5 / 9 || sum == 7 / 3 || sum == 44 / 33 || sum == 1 / 45) {
				System.out.println("Numero Irracional");
				
			} else {
				System.out.println("Numero Racional");
				

			}

		} else if (multi != null) {
			if (multi == 41 / 9 || multi == 5 / 9 || multi == 7 / 3 || multi == 44 / 33 || multi == 1 / 45) {
				System.out.println("Numero Irracional");
				
			} else {
				System.out.println("Numero Racional");
				
			}
			
		}
		 
	}

	@Override
	public String toString() {
		return "Racionais [n1=" + n1 + ", n2=" + n2 + ", escolha=" + escolha + ", cont=" + cont + "]";
	}

}
