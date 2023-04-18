package canakmirko;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		/*
		 * Za uneti broj ispitati da li je broj pozitivan, negativan ili jednak 0.
		 */

		// 1. deo: Unos podataka (uočavanje potrebnih ulaznih podataka)

		Scanner sc = new Scanner(System.in);

		int broj;

		System.out.println("Unesite broj: ");
		broj = sc.nextInt();

		// 2. deo: Obrada podataka

		if (broj > 0) {
			System.out.println("Broj je pozitivan.");
		}
		if (broj < 0) {
			System.out.println("Broj je negativan.");
		}
		if (broj == 0) {
			System.out.println("Uneti broj je nula.");
		}

		// x = 10; naredba dodele
		// x == y; naredba ispitivanja vrednosti x da li je jednako y

		sc.close();

	}

}
