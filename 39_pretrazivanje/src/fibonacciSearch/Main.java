/* Fibonacci Search je algoritam pretrage za pronalaženje elemenata u sortiranom nizu.
 * Fibonačijevi brojevi određuju tačku podele niza, a pretraživanje vršimo binarnom
 * metodom u odgovarajućem podnizu.
 * Fibonačijevi brojevi su rekurzivno definisani kao:
 * F(n) = F(n-1) + F(n-2), F(0) = 0, F(1) = 1.
 * Dakle, Fibonačijevi brojevi su: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …
 * Ovaj algoritam je brži od linearnog, a sporiji od binarnog pretraživanja i
 * ostalih logaritamskih pretraživanja kao što su interpolaciono i eksponencijalno. */

package fibonacciSearch;

public class Main {

	// Statička metoda za štampanje niza
	static void stampajNiz(int niz[]) {
		int n = niz.length;
		for (int i = 0; i < n; ++i) {
			if (i == n - 1)
				System.out.print(niz[i] + ".");
			else
				System.out.print(niz[i] + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// Instanca klase FibonacciSearch
		FibonacciSearch fibonacci = new FibonacciSearch();

		// Zadajemo niz celobrojnih vrednosti
		int niz[] = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100, 235 };
		System.out.println("Niz celobrojnih vrednosti:");
		stampajNiz(niz);

		// Element za pretragu
		int x = 85;
		System.out.println("\nTražimo element " + x + " iterativnom metodom Fibonačijevog pretraživanja...\n");

		int ind = fibonacci.fibonacciSearch(niz, x);
		if (ind >= 0) {
			System.out.println("Element je pronađen pod indeksom: " + ind);
		} else {
			System.out.println("Element nije pronađen!");
		}

	}

}