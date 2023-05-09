/* Linear Search je najprostiji sekvencijalni algoritam za pretraživanje.
 * Startuje se sa jednog kraja niza i proverava svaki element liste
 * dok se ne nađe željeni element. */

package linearSearch;

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

		// Instanca klase LinearSearch
		LinearSearch linear = new LinearSearch();

		// Zadajemo niz celobrojnih vrednosti
		int niz[] = { 2, 4, 0, 1, 9 };
		System.out.println("Niz celobrojnih vrednosti:");
		stampajNiz(niz);

		// Zadajemo element za pretragu
		int x = 1;
		System.out.println("\nTražimo element " + x + "...\n");

		// Pozivamo metodu za linearno pretraživanje
		int result = linear.linearSearch(niz, x);

		// Štampamo rezultat
		if (result == -1)
			System.out.print("Element nije pronađen!");
		else
			System.out.print("Element je pronađen pod indeksom: " + result);
	}

}