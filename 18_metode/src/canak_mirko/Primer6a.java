package canak_mirko;

import java.text.DecimalFormat;

public class Primer6a {

	// Definisanje funkcija f i g
	static double f(double x) {
		return 2 * x - Math.log(x);
	}

	static double g(double x) {
		return Math.tan(x / 2.) + Math.abs(x);
	}

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,##0.00");

		// Deklarisanje promenljivih x i y
		double x, y;

		// Štampanje zaglavlja
		System.out.println("\tX\tY");

		for (x = 0.1; x <= 0.9; x += 0.1) {
			// Poziv funkcija f i g
			y = f(2 * g(f(x)));
			// Štampanje izlaznog rezultata
			System.out.println("\t" + df.format(x) + "\t" + df.format(y));
		}
	}
}