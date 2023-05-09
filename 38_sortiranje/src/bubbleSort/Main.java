/* Bubble Sort je algoritam za sortiranja elemenata niza koji upoređuje
 * susedne elemente niza i ako nisu u željenom redosledu zamenjuje im mesta.
 * U svakom prolazu kroz niz, poslednji provereni element je na svom mestu
 * i više se ne proverava.
 * Provere se vrše do kraja tj. provere samo prvog i drugog elementa niza.
 * Postoji i optimizovan algoritam, koji proveru obustavlja kada se ustanovi
 * da nije bilo zamena elemenata u poslednjem prolazu kroz niz.
 * Bubble Sort metoda je pogodna za kraće nizove,
 * kad je kratak i jasan kod od presudnog značaja */

package bubbleSort;

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

		// Instanca klase BubbleSort
		BubbleSort bubble = new BubbleSort();

		/////////////////
		// BUBBLE SORT //
		/////////////////

		// Zadajemo niz celobrojnih vrednosti
		int[] niz1 = { -2, -9, 0, 45, 11 };
		System.out.println("Niz celobrojnih vrednosti:");
		stampajNiz(niz1);
		System.out
				.println("...sortiramo BubbleSort-om.\nProvere se vrše do kraja bez obzira da li je niz već sortiran.");

		// Pozivamo metodu za BubbleSort
		niz1 = bubble.bubbleSort(niz1);

		/////////////////////////////
		// BUBBLE SORT OPTIMIZOVAN //
		/////////////////////////////

		// Zadajemo niz celobrojnih vrednosti
		int[] niz2 = { -2, -9, 0, 45, 11 };
		System.out.println("\nProcesuiramo isti niz:");
		stampajNiz(niz2);
		System.out.println(
				"...optimizovanim BubbleSort-om.\nUkoliko nema zamena niz je sortiran i provere se obustavljaju.");

		// Pozivamo optimizovanu metodu za BubbleSort
		niz2 = bubble.bubbleSortOptimal(niz2);

	}

}