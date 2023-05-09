/* Selection Sort algoritam traži ekstremne vrednosti elemenata niza
 * (min-rastući ili max-opadajući poredak).
 * Prva ekstremna vrednost je član niza sa indeksom 0.
 * Zatim se traži druga ekstramna vrednost u prvom prolazu kroz niz počevši od indeksa 1.
 * Prva i druga ekstremna vrednost zamenjuju mesta.
 * U drugom prolazu počinjemo od elementa sa indeksom 2 i tražimo novu ekstremnu vrednost.
 * Na kraju prvobitna i nova ekstremna vrednost menjaju mesta.
 * Postupak se ponavlja do kraja.
 * U slučaju da se u nekom od prolaza desi da je stara ekstremna vrednost i dalje ekstremna
 * prosto tehnički menja mesto sama sa sobom i nastavlja se algoritam dalje.
 * Selection Sort se koristi:
 * - za sortiranje manjih lista;
 * - kad brzina nije bitna jer je neophodna provera svih elemenata;
 * - kad je potreban što manji broj upisa u memoriju (NPR: flash memorija). */

package selectionSort;

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

		// Instanca klase SelectionSort
		SelectionSort selection = new SelectionSort();

		//////////////////////////////////////
		// SELECTION SORT - Rastući poredak //
		//////////////////////////////////////

		// Zadajemo niz celobrojnih vrednosti
		int[] niz1 = { 20, 12, 10, 15, 2 };
		System.out.println("Zadat je niz:");
		stampajNiz(niz1);
		System.out.println("...sortiramo SelectionSort-om u rastućem poretku.");

		// Pozivamo metodu za Selection Sort
		niz1 = selection.selectionSort(niz1);

		System.out.println("\nSortiran niz u rastućem poretku: ");
		stampajNiz(niz1);

		////////////////////////////////////////
		// SELECTION SORT - Opadajući poredak //
		////////////////////////////////////////

		// Zadajemo niz celobrojnih vrednosti
		int[] niz2 = { 20, 12, 10, 15, 2 };
		System.out.println("\nNiz celobrojnih vrednosti:");
		stampajNiz(niz2);
		System.out.println("...sortiramo SelectionSort-om u opadajućem poretku.");

		// Pozivamo metodu za Selection Sort
		niz2 = selection.selectionSortOptimal(niz2);

		System.out.println("\nSortiran niz u opadajućem poretku: ");
		stampajNiz(niz2);

	}

}