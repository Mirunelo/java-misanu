package canak.mirko;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite redni broj dana u nedelji (ponedeljak je 1):");
		byte dan = sc.nextByte();
		
		sc.close();
		
		switch (dan) {
		case 1: {
			System.out.println("Redni broj " + dan + " je ponedeljak.");
			break;
		}
		case 2: {
			System.out.println("Redni broj " + dan + " je utorak.");
			break;
		}
		case 3: {
			System.out.println("Redni broj " + dan + " je sreda.");
			break;
		}
		case 4: {
			System.out.println("Redni broj " + dan + " je četvrtak.");
			break;
		}
		case 5: {
			System.out.println("Redni broj " + dan + " je petak.");
			break;
		}
		case 6: {
			System.out.println("Redni broj " + dan + " je subota.");
			break;
		}
		case 7: {
			System.out.println("Redni broj " + dan + " je nedelja.");
			break;
		}
		default: {
			System.out.println("Napravili ste grešku prilikom unosa!");
		}

		}
		
	}

}
