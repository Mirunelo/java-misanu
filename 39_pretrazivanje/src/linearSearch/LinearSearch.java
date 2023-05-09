package linearSearch;

public class LinearSearch {

	// Linearno pretraživanje:
	public int linearSearch(int niz[], int x) {
		int n = niz.length;

		// Sekvencijalno prolazimo kroz niz
		for (int i = 0; i < n; i++) {
			if (niz[i] == x)
				return i;
		}

		// Element nije pronađen
		return -1;

	}

}