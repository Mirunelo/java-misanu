package heapSort;

public class HeapSort {

	public void sortiraj(int niz[]) {
		int n = niz.length;

		// Napravi maksimalni Heap (gomilu)
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(niz, n, i);
		}

		// Sortiraj Heap
		for (int i = n - 1; i >= 0; i--) {
			int temp = niz[0];
			niz[0] = niz[i];
			niz[i] = temp;

			// Heapify korenski element
			heapify(niz, i, 0);
		}

	}

	void heapify(int arr[], int n, int i) {
		// Nađi najveći među korenima, levo dete i desno dete
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && arr[l] > arr[largest])
			largest = l;

		if (r < n && arr[r] > arr[largest])
			largest = r;

		// Zameni mesta i nastavi heapifying ukoliko koren nije najveći
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heapify(arr, n, largest);
		}

	}

}