package canak_mirko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] brojevi = new int[5];

		/* for petlja - punimo niz */
		for (int i = 0; i < brojevi.length; i++) { /* Indeksiranje od 0 do 4 */

			System.out.println("Unesite broj: ");
			brojevi[i] = scanner.nextInt();

			if ((i + 1) == brojevi.length) {
				System.out.println("Niz je napunjen! ");
			}

		}

		/* Unapređena for petlja - štampamo niz */
		System.out.println("Elementi niza su: ");
		for (int i : brojevi) {
			System.out.println(i);

		}

		scanner.close();

	}

}
