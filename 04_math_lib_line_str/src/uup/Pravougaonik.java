package uup;

import java.util.Scanner;

public class Pravougaonik {

	public static void main(String[] args) {

		// a, b - stranice pravougaonika
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrednost stranice pravougaonika a: ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost stranice pravougaonika b: ");
		double b = input.nextDouble();
		/*
		// I način
		// Štampanje vrednosti dijagonale pravougaonika
		System.out.println("Dijagonala pravougaonika je: " + Math.sqrt(a * a + b * b));
		*/
		// II način
		double d = Math.sqrt(a*a+b*b);
		// Štampanje vrednosti dijagonale provougaonika
		System.out.println("Dijagonala pravougaonika je: " + d);
		
		input.close();
	}

}
