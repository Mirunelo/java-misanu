/* Heap Sort je zgodan algoritam za pronalaženje najmanjeg, tj. najvećeg elementa niza,
 * bez čuvanja ostalih elemenata u sortiranom nizu. Zgodno za pravljenje liste prioriteta.
 *  */

package heapSort;

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

		int niz[] = { 1, 12, 9, 5, 6, 10 };
		System.out.println("Zadat je niz:");
		stampajNiz(niz);

		// Instanca klase HeapSort
		HeapSort heap = new HeapSort();
		heap.sortiraj(niz);

		System.out.println("Sortirani niz:");
		stampajNiz(niz);

	}

}