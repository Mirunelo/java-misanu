package canak.mirko;

import java.util.Scanner;

public class ElseIf1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite ocenu od 1 do 5.");
		byte ocena = sc.nextByte();
		
		sc.close();
		
		if (ocena == 1)
			System.out.println("Ocena " + ocena + " - nedovoljan.");
		else if (ocena == 2)
			System.out.println("Ocena " + ocena + " - dovoljan.");
		else if (ocena == 3)
			System.out.println("Ocena " + ocena + " - dobar.");
		else if (ocena == 4)
			System.out.println("Ocena " + ocena + " - vrlo dobar.");
		else if (ocena == 5)
			System.out.println("Ocena " + ocena + " - odličan.");
		else
			System.out.println("Napravili ste grešku prilikom unosa ocene!");
		
	}

}
