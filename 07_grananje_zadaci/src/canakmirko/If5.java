package canakmirko;

import java.util.Scanner;

public class If5 {

	public static void main(String[] args) {
		
		/*
		 * Za uneti broj ispitati da li je broj pozitivan, negativan ili jednak 0.
		 */

		Scanner sc = new Scanner(System.in);

		int broj;

		System.out.println("Unesite broj: ");
		broj = sc.nextInt();

		if (broj > 0) {
			System.out.println("Broj je pozitivan!");
		} else if (broj < 0) {
			System.out.println("Broj je nagativan");
		} else if (broj == 0) {
			System.out.println("Uneti broj je nula.");
		} else {
			System.out.println("Pogrešan unos!");
		}

		sc.close();

	}

}
