package fibonacciSearch;

public class FibonacciSearch {

	public FibonacciSearch() {

	}

	// Fibonači ptretraživanje (iterativna metoda)
	public int fibonacciSearch(int[] niz, int x) {
		int n = niz.length;
		if (n == 0) {
			return -1;
		}

		// Inicijalizuje Fibonačijeve brojeve
		int fib1 = 0, fib2 = 1, fib3 = fib1 + fib2;

		// Traži najmanji Fibonačijev broj veći ili jednak n
		while (fib3 < n) {
			fib1 = fib2;
			fib2 = fib3;
			fib3 = fib1 + fib2;
		}

		// Inicijalizuje promenljive trenutnih i prethodnih tačaka podela
		int pomak = -1;
		while (fib3 > 1) {
			int i = Math.min(pomak + fib2, n - 1);

			// Ako je x veće od elementa pod indeksom i,
			// pomeri tačku podele desno
			if (niz[i] < x) {
				fib3 = fib2;
				fib2 = fib1;
				fib1 = fib3 - fib2;
				pomak = i;
			}

			// Ako je x manje od elementa pod indeksom i,
			// pomeri tačku podele levo
			else if (niz[i] > x) {
				fib3 = fib1;
				fib2 = fib2 - fib1;
				fib1 = fib3 - fib2;
			}

			// Ako je x jednako elementu pod indeksom i,
			// vrati indeks (rezultat)
			else {
				return i;
			}

		}

		// Ako x nije pronađeno u nizu, vrati vrednost -1
		if (fib2 == 1 && niz[pomak + 1] == x) {
			return pomak + 1;
		} else {
			return -1;
		}

	}

}