/* Insertion Sort je algoritam za sortiranje koje postavlja nesortiran element
 * na odgovarajuće mesto pri svakom prolasku kroz niz elemenata.
 * Polazimo od predpostavke da je prvi element niza već sortiran.
 * Uzimamo sledeći element i stavljamo ga posebno kao ključ.
 * Upoređujemo ključ sa prvim elementom i ako je veći stavljamo ga ispred.
 * Tako su prva dva elementa sortirana.
 * Uzimamo treći elemetn kao ključ i upoređujemo ga sa najmanjim otkrivenim
 * elementom. Ukoliko je manji stavljamo ključ na početak sortiranog niza.
 * Dalje svaki sledeći element proglašavamo za ključ, tražimo mu odgovrajuće
 * mesto i stavljamo ga tamo.
 * Ovaj algoritam se koristi ako niz ima manji broj elemenata ili imamo samo
 * nekoliko elemenata preostalih za sortiranje. */

package insertionSort;

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

		int[] niz = { 9, 5, 1, 4, 3 };
		System.out.println("Zadat je niz:");
		stampajNiz(niz);

		// Instanca klase InsertionSort
		InsertionSort insertion = new InsertionSort();

		insertion.sortirajRastuce(niz);
		System.out.println("\nNiz sortiran u rastućem poretku: ");
		stampajNiz(niz);

		System.out.println("\nSada ćemo prethodni sortiran niz sortirati u opadajućem poretku:");
		insertion.sortirajOpadajuce(niz);
		stampajNiz(niz);

	}

}