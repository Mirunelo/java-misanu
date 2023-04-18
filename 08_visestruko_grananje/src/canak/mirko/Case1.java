package canak.mirko;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {

		/* 1. deo: Unos podataka
		 * 2. deo: Obrada podataka
		 * 3. deo: Štampanje podataka
		 */

		/* 1. deo  */
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Unesite ocenu od 1 do 5.");
			byte ocena = sc.nextByte();
			
			/* 2. deo  */
			switch (ocena) {
			case 1: {
				System.out.println("Ocena " + ocena + " - nedovoljan.");
				break;
			}
			case 2: {
				System.out.println("Ocena " + ocena + " - dovoljan.");
				break;
			}
			case 3: {
				System.out.println("Ocena " + ocena + " - dobar.");
				break;
			}
			case 4: {
				System.out.println("Ocena " + ocena + " - vrlo dobar.");
				break;
			}
			case 5: {
				System.out.println("Ocena " + ocena + " - odličan.");
				break;
			}
			default: {
				System.out.println("Napravili ste grešku prilikom unosa ocene!");
			}

			}
			
		sc.close();
		
		
		 /* switch(uslov)
		 * {
		 * case 1: {
		 * break;
		 * }
		 * case 2:
		 * {
		 * obrada
		 * break;
		 * }
		 * default:
		 * obrada ostalih slučajeva
		 * }
		 */
		
		
		
	}

}
