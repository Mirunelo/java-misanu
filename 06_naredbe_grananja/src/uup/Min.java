package uup;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Deklarisanje promenljivih
		int a, b;
		int y;

		// Unošenje celobrojnih promenljivih a i b
		System.out.println("Unesite vrednost broja a: ");
		a = input.nextInt();
		System.out.println("Unesite vrednost broja b: ");
		b = input.nextInt();

		// Razgranata struktura
		if (a >= 0)
			y = Math.min(a, b);

		else
			y = 2 * Math.min(a, b);

		// Štampanje rezultata
		System.out.println("y je " + y);

		input.close();
	}
}