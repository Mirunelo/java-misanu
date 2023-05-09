package bubbleSort;

public class BubbleSort {

	public BubbleSort() {

	}

	// Bubble Sort:
	public int[] bubbleSort(int[] niz) {
		System.out.println("\nProces BoobleSort sortiranja u opadajućem poretku:");
		int duzina = niz.length;
		int brojac = 0;

		// petlja za pristup svakom elementu
		for (int i = 0; i < duzina - 1; i++)

			// petlja za upoređivanje elemenata
			for (int j = 0; j < duzina - i - 1; j++) {
				brojac++;
				// Upoređivanje dva susedna elementa
				if (niz[j] < niz[j + 1]) { // > - rastući ; < - opadajući poredak
					// zamena mesta ako elementi nisu u željenom redosledu
					int temp = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = temp;
					Main.stampajNiz(niz);
				}

			}

		System.out.println("Provere su izvršene: " + brojac + " puta.");
		return niz;

	}

	// Bubble Sort Optimizovan:
	public int[] bubbleSortOptimal(int niz[]) {
		System.out.println("\nOptimizovani proces BoobleSort sortiranja u rastućem poretku:");
		int size = niz.length;
		int brojac = 0;

		// petlja za pristup svakom elementu
		for (int i = 0; i < (size - 1); i++) {

			// provera da li je bilo zamene mesta elemenata
			boolean swapped = false;

			// petlja za upoređivanje elemenata
			for (int j = 0; j < (size - i - 1); j++) {
				brojac++;

				// Upoređivanje dva susedna elementa
				if (niz[j] > niz[j + 1]) { // > - rastući ; < - opadajući poredak

					// zamena mesta ako elementi nisu u željenom redosledu
					int temp = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = temp;
					Main.stampajNiz(niz);
					swapped = true;
				}

			}
			// ako nije bilo zamene mesta niz je već sortiran
			// i nema potrebe za daljim proverama
			if (!swapped)
				break;

		}

		System.out.println("Provere su izvršene: " + brojac + " puta.");
		return niz;

	}

}