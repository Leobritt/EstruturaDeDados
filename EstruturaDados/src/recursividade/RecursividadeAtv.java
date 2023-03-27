package recursividade;

public class RecursividadeAtv {
	public static void main(String[] args) {
		
		System.out.println("---Fatoriais---");
		System.out.println(fatorial(5));
		System.out.println(fatorial(10));
		System.out.println(fatorial(0));
		
		System.out.println("---Fibonacci---");
		System.out.println(fibonacci(15));
		System.out.println(fibonacci(4));
		System.out.println(fibonacci(1));
		
		System.out.println("---Somatorio---");
		System.out.println(somatorio(5));
		System.out.println(somatorio(20));
		System.out.println(somatorio(1));

		
	}

	/*fatorial(5) = 5 * fatorial(4)
	 *fatorial(4) = 4 * fatorial(3)
	 *fatorial(3) = 3 * fatorial(2) 
	 *fatorial(2) = 2 * fatorial(1) 
	 *fatorial(1) = 1 * fatorial(0) 
	 *fatorial(0) = 1 
	 */
	public static int fatorial(int n) {
		if (n == 0) {
			return 1;
		}
		
		return n *fatorial(n-1);
	}
	//fibonacci fn = F(n-1) + F(n-2)
	public static int fibonacci(int f) {
		if (f == 1 || f == 0) {
			return f;
		}
		
		return fibonacci(f-1) + fibonacci(f-2);
	}
	//somatorio(5) 5 = 5 + 4 + 3 + 2 + 1
	public static int somatorio(int s) {
		if (s == 0 || s == 1) {
			return s;
		}
		
		return s + somatorio(s-1);
	}
}
