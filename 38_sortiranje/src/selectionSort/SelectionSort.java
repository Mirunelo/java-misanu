package selectionSort;

public class SelectionSort {

	public SelectionSort() {

	}

	// Selection Sort - Rastući poredak:
	public int[] selectionSort(int niz[]) {
		System.out.println("\nProces SelectionSort sortiranja u rastućem poretku:");
		int duzina = niz.length;

		for (int i = 0; i < duzina - 1; i++) {
			int indeksEkstrema = i;

			for (int j = i + 1; j < duzina; j++) {
				// Određuje ekstremne vrednosti min(rasutći) ili max(opadajući)
				if (niz[j] < niz[indeksEkstrema]) { // < - rastući ; > - opadajući poredak
					indeksEkstrema = j;
				}

			}

			// Stavljamo ekstremnu vrednost na svoje mesto
			int temp = niz[i];
			niz[i] = niz[indeksEkstrema];
			niz[indeksEkstrema] = temp;
			Main.stampajNiz(niz);
		}
		return niz;

	}

	// Selection Sort - Opadajući poredak:
	public int[] selectionSortOptimal(int niz[]) {
		System.out.println("\nProces SelectionSort sortiranja u opadajućem poretku:");
		int duzina = niz.length;

		for (int i = 0; i < duzina - 1; i++) {
			int indeksEkstrema = i;

			for (int j = i + 1; j < duzina; j++) {
				// Određuje ekstremne vrednosti min(rasutći) ili max(opadajući)
				if (niz[j] > niz[indeksEkstrema]) { // < - rastući ; > - opadajući poredak
					indeksEkstrema = j;
				}

			}
			// Stavljamo ekstremnu vrednost na svoje mesto
			int temp = niz[i];
			niz[i] = niz[indeksEkstrema];
			niz[indeksEkstrema] = temp;
			Main.stampajNiz(niz);
		}

		return niz;

	}

}