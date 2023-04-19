package primeThreads;

public class Pajser {

	public static void main(String[] args) {

		// Pajser kod za izračunavanje prvih 78498 prostih brojeva bez upotrebe niti

		// Setujemo tajmer
		long timer = System.currentTimeMillis();

		// Tražimo proste brojeve
		int[] n = new int[78498];
		int b = 2;
		n[0] = 2;
		n[1] = 3;
		for (int i = 4; i < 1000000; i++) {
			for (int j = 2; j <= i / 2; j++)
				if (i % j == 0)
					break;
				else if (j == i / 2 && i % j != 0)
					n[b++] = i;
		}

		// Štampamo proste brojeve
		for (int e : n)
			System.out.print(e + ", ");

		// Izračunavamo dužinu rada programa i ispisujemo je
		timer = System.currentTimeMillis() - timer;
		System.out.println("\nIzvršenje programa je trajalo " + timer + " milisekundi.");
	}
}
