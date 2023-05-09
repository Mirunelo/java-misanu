package insertionSort;

public class InsertionSort {

	void sortirajRastuce(int niz[]) {
		int duzina = niz.length;

		for (int i = 1; i < duzina; i++) {
			int kljuc = niz[i];
			int j = i - 1;

			// Uporedi ključ sa svakim elementom levo od njega,
			// dok se ne nađe element manji od njega.
			while (j >= 0 && kljuc < niz[j]) { // Poredak: rastući → key < niz[j] ; opadajući → key > niz[j]
				niz[j + 1] = niz[j];
				--j;
			}

			// Stavite ključ posle elementa koji je prvi manji od njega.
			niz[j + 1] = kljuc;
		}

	}

	void sortirajOpadajuce(int niz[]) {
		int duzina = niz.length;

		for (int i = 1; i < duzina; i++) {
			int kljuc = niz[i];
			int j = i - 1;

			// Uporedi ključ sa svakim elementom levo od njega,
			// dok se ne nađe element manji od njega.
			while (j >= 0 && kljuc > niz[j]) { // Poredak: rastući → key < niz[j] ; opadajući → key > niz[j]
				niz[j + 1] = niz[j];
				--j;
			}

			// Stavite ključ posle elementa koji je prvi manji od njega.
			niz[j + 1] = kljuc;
		}

	}

}