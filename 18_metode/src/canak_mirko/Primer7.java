package canak_mirko;

import java.io.*;

public class Primer7 {
	// static final double GAMA = 6.67 * Math.pow(10, -11);
	/*
	 * sila - metoda za izračunavanje sile privlačenja između dve tela m1, m2 – mase
	 * tela r – rastojanje između težišta tela
	 */
	public static double sila(double m1, double m2, double r) {
		/* gama – univerzalna gravitaciona konstanta */
		final double GAMA = 6.67 * Math.pow(10, -11);
		return GAMA * m1 * m2 / (r * r);
	}

	public static void main(String[] args) throws Exception {

		// Deklarisanje podataka
		double m1, m2, r;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.println("Unesite vrednost za mase (kg): ");
		System.out.print("m1 = ");
		m1 = Double.parseDouble(ulaz.readLine());
		System.out.print("m2 = ");
		m2 = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za rastojanje r (m): ");
		r = Double.parseDouble(ulaz.readLine());

		// Štampanje rezultata
		System.out.println("Za m1 = " + m1 + " kg, m2 = " + m2 + " kg i rastojanje r = " + r + " m, sila je F = "
				+ sila(m1, m2, r) + " N.");
	}
}