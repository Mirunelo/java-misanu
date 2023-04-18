package canak_mirko;

import java.io.*;

public class Primer17 {
	public static void vrstaVezeKondenzatora(double c1, double c2, int vrstaVeze) {

		double ce;

		switch (vrstaVeze) {
		case 1:
			/* Izračunavanje kapaciteta redne veze */
			ce = c1 * c2 / (c1 + c2);
			System.out.println("Kapacitet redne veze je " + ce);
			break;
		case 2:
			/* Izračunavanje kapaciteta paralelne veze */
			ce = c1 + c2;
			System.out.println("Kapacitet paralelne veze je " + ce);
			break;
		default:
			System.out.println("Treba uneti 1 za rednu, a 2 za paralelnu vezu.");
			break;
		}
	}

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		/* Unos vrednosti za izbor veze kondenzatora */
		System.out.println("Unesite 1 za rednu, a 2 za paralelnu vezu: ");
		int i = Integer.parseInt(ulaz.readLine());

		/* Unos kapaciteta kondenzatora */
		System.out.println("Unesite vrednost kapaciteta prvog kondenzatora: ");
		double c1 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost kapaciteta drugog kondenzatora: ");
		double c2 = Double.parseDouble(ulaz.readLine());
		vrstaVezeKondenzatora(c1, c2, i);
	}
}