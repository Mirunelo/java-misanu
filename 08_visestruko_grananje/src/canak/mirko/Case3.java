package canak.mirko;

import java.util.Scanner;

public class Case3 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		/* 1. deo: Unos podataka */

		System.out.print("Unesite karakter: ");
		char karakter = sc.next().charAt(0);
				
		sc.close();

		/* 2. deo: Obrada podataka */
		
		switch (karakter) {
		case 'a' | 'A': { /* Ovo ne valja */
			System.out.println(karakter + " je samoglasnik.");
			break;
		}
		case 'e':
		case 'E': {
			System.out.println(karakter + " je samoglasnik.");
			break;
		}
		case 'i': {
			System.out.println(karakter + " je samoglasnik.");
			break;
		}
		case 'I': {
			System.out.println(karakter + " je samoglasnik.");
			break;
		}
		case 'o','O': {
			System.out.println(karakter + " je samoglasnik.");
			break;
		}
		case 'u': case 'U': {
			System.out.println(karakter + " je samoglasnik.");
			break;
		}
		default:
			System.out.println("Uneti karakter je suglasnik.");

		}

	}
}
