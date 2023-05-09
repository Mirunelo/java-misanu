package mergeSort;

public class MergeSort {

	// Spaja dva podniza L i M u jedan niz
	void spoji(int niz[], int p, int q, int r) {

		// Kreira L ← A[p..q] i M ← A[q+1..r]
		int n1 = q - p + 1;
		int n2 = r - q;

		int L[] = new int[n1];
		int M[] = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = niz[p + i];
		for (int j = 0; j < n2; j++)
			M[j] = niz[q + 1 + j];

		// Tekući indeksi podnizova i glavnog niza
		int i, j, k;
		i = 0;
		j = 0;
		k = p;

		// Dok ne dođemo do kraja L ili M niza, izaberi veći element L i M nizova
		// i stavi ih na odgovarajuće meston u A[p..r]
		while (i < n1 && j < n2) {
			if (L[i] <= M[j]) {
				niz[k] = L[i];
				i++;
			} else {
				niz[k] = M[j];
				j++;
			}
			k++;
		}

		// Kada nemamo više elemenata u L ili M nizu,
		// uzimamo preostali element i stavljamo ga u A[p..r]
		while (i < n1) {
			niz[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			niz[k] = M[j];
			j++;
			k++;
		}
	}

	// Deli niz na dva podniza, sortira i spaja ih
	void mergeSort(int niz[], int l, int r) {
		if (l < r) {

			// m je tačka podele niza na dva dela
			int m = (l + r) / 2;

			mergeSort(niz, l, m);
			mergeSort(niz, m + 1, r);

			// Spaja sortirane podnizove
			spoji(niz, l, m, r);
		}

	}

}