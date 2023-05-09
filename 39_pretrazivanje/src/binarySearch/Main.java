/* Binary Search je algoritam za pronalaženje elementa u sortiranom nizu.
 * Element se uvek traži u sredini niza.
 * Može se implementirati iterativnom i rekurzivnom metodom.
 * U procesu debagovanja, binarno pretraživanje pokazuje mesto greške. */
package binarySearch;

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

		// Instanca klase BinarySearch
		BinarySearch binary = new BinarySearch();

		// Zadajemo niz celobrojnih vrednosti
		int niz[] = { 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Niz celobrojnih vrednosti:");
		stampajNiz(niz);

		///////////////////////////////////////////////
		// BINARNO PRETRAŽIVANJE - Iterativna metoda //
		///////////////////////////////////////////////

		// Zadajemo element za pretragu
		int x = 4;
		System.out.println("\nTražimo element " + x + " iterativnom metodom binarnog pretraživanja...\n");

		// Pozivamo metodu za Binarno pretraživanje (iterativno)
		int rezultat = binary.binarySearch(niz, x);
		if (rezultat == -1)
			System.out.println("Element nije pronađen!");
		else
			System.out.println("Element je pronađen pod indeksom: " + rezultat);

		///////////////////////////////////////////////
		// BINARNO PRETRAŽIVANJE - Rekurzivna metoda //
		///////////////////////////////////////////////

		// Zadajemo element za pretragu
		x = 7;
		System.out.println("\nTražimo element " + x + " rekurzivnom metodom binarnog pretraživanja...\n");

		// Pozivamo metodu za Binarno pretraživanje (rekurzivno)
		rezultat = binary.binarySearchRecursive(niz, x, 0, niz.length - 1);
		if (rezultat == -1)
			System.out.println("Element nije pronađen!");
		else
			System.out.println("Element je pronađen pod indeksom: " + rezultat);

	}

}