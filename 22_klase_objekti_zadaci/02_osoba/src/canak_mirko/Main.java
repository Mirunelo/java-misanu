package canak_mirko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Osoba o1 = new Osoba();
		
		System.out.print("Unesite ime: ");
		o1.ime = sc.nextLine();
		System.out.print("Unesite datum rođenja: ");
		o1.datumRodjenja = sc.nextLine();
		System.out.print("Unesite adresu stanovanja: ");
		o1.adresaStanovanja = sc.nextLine();
		
		sc.close();
		
		System.out.println("\n" + o1.stampanjeInformacija());
		
	}

}
