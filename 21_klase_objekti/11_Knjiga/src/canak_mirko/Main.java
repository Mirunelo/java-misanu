package canak_mirko;

import java.util.Scanner;

public class Main {

	/*
	 * Kreirati klasu Knjiga. Knjia ima podatke: Ime, brojStrana. Posle ispisati
	 * vrednosti koliko ima stranica i kako se knjiga zove.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Knjiga k1 = new Knjiga();
		
		System.out.println("Knjiga se zove ˝" + k1.ispisImena() + "˝ i ima " + k1.brojStrana() + " stranica.");
		
		System.out.print("\nUnesite ime knjige: ");
		String i = sc.nextLine();
		System.out.print("\nUnesite broj stranica: ");
		int bs = sc.nextInt();
		
		sc.close();
		
		Knjiga k2 = new Knjiga(i, bs);
		System.out.println("Knjiga se zove ˝" + k2.ispisImena() + "˝ i ima " + k2.brojStrana() + " stranica.");
		
	}

}
