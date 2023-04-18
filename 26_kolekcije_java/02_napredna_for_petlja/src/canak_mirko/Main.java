package canak_mirko;

public class Main {

	public static void main(String[] args) {

		int[] niz = { 2, 5, 7, 9, 29 };

		/* Štampanje elementa niza */

		System.out.println("Štampanje elemenata niza for petljom: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}

		System.out.println("\nŠtampanje elemenata niza unapređenom for petljom: ");
		for (double unapredjenifor : niz)
			System.out.println(unapredjenifor);

	}

}
