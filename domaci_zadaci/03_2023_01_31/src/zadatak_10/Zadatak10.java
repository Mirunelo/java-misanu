package zadatak_10;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Unos 10 prirodnih brojeva u niz
		System.out.println("Unesite 10 prirodnih brojeva:\n");
		int[] niz = new int[10];
		for (int i = 0; i < niz.length; i++) {
			System.out.print((i + 1) + ". -> ");
			niz[i] = ulaz.nextInt();
		}
		
		// Unos prirodnog broja n za pretragu kroz niz
		System.out.print("\nUnesite broj da vidimo koliko puta se ponavlja u nizu: ");
		int n = ulaz.nextInt();
		ulaz.close();
		
		// Utvrđujemo koliko se puta traženi broj n ponavlja u unetom nizu
		int s = 0;
		for(int i : niz)
			if(i==n)
				s++;
		
		// Ispis poruke
		System.out.println("\nU nizu od 10 unetih brojeva broj " + n + " se ponavlja " + s + " puta.");

	}

}
