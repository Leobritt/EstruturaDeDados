package quartaatv;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Informe dois valores: ");
		Double n1 = input.nextDouble();
		Double n2 = input.nextDouble();
		System.out.println("Infome a escolha:\n1)Multiplicar numeros Racionais\n2)Somar numeros Racionais");
		int i = input.nextInt();
		Racionais r1 = new Racionais(n1, n2, i);
		while (i != 1 && i != 2 && i != 3) {
			System.out.println("Escolha Inválida");
			System.out.println("Infome a escolha:\n1)Multiplicar numeros Racionais\n2)Somar numeros Racionais");
			 i = input.nextInt();
		}
		r1.criarnovoRacional();
		r1.teste(i);
		input.close();
	}
}
