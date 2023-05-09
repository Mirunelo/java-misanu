/* Merge Sort algoritam deli problem (niz) na više podproblema (nizova).
 * Svaki podproblem se rešava pojedinačno.
 * Na kraju se podproblemi kombinuju i dobija se konačno rešenje.
 * Postupak sortiranja niza se sastoji u podeli niza na podnizove dok se
 * ne dostigne bazni slučaj.
 * Sada se kombinuju rezultati i kreira se sortirani niz. */

package mergeSort;

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

		// Zadajemo niz
		int niz[] = { 6, 5, 12, 10, 9, 1 };
		System.out.println("Zadat je niz:");
		stampajNiz(niz);

		// Instanca klase MergeSort
		MergeSort merge = new MergeSort();

		merge.mergeSort(niz, 0, niz.length - 1);

		System.out.println("\nSortiran niz:");
		stampajNiz(niz);

	}

}