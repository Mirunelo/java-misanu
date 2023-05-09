package binarySearch;

public class BinarySearch {

	int binarySearch(int niz[], int x) {

		int levi = 0;
		int desni = niz.length - 1;

		// Ponavlja se dok se pokazivači ne susretnu
		while (levi <= desni) {
			int sredina = levi + (desni - levi) / 2;

			// Element je nađen
			if (niz[sredina] == x)
				return sredina;

			// Pronađeni element je manji od traženog
			// pa pretražujemo desnu stranu gde su veće vrednosti
			if (niz[sredina] < x)
				levi = sredina + 1;

			// Pronađeni element nije manji od traženog
			// pa pretražujemo levu stranu gde su manje vrednosti
			else
				desni = sredina - 1;
		}

		// Element nije pronađen
		return -1;
	}
	
		  int binarySearchRecursive(int niz[], int x, int levi, int desni) {

		    if (desni >= levi) {
		      int sredina = levi + (desni - levi) / 2;

		      // Ako je nađen element na sredini, vrati rezultat
		      if (niz[sredina] == x)
		        return sredina;

		      // Pretražuje levu polovinu
		      if (niz[sredina] > x)
		        return binarySearchRecursive(niz, x, levi, sredina - 1);

		      // Pretražuje desnu polovinu
		      return binarySearchRecursive(niz, x, sredina + 1, desni);
		    }

		    return -1;
		  }

}