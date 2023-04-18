package uup;

import java.util.Scanner;

public class Paran {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Deklarisanje podataka
		int a;
		double y;

		// Unos podatka a
		System.out.println("Unesite vrednost broja a: ");
		a = input.nextInt();

		// Razgranata struktura
		if (a % 2 != 0)
			y = (double) 1 / a;
		else
			y = (a - 1) * (a - 1);

		// Štampanje rezultata
		System.out.println("y je " + y);

		input.close();
	}
}