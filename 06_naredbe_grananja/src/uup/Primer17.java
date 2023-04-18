package uup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primer17 {
	public static void main(String[] args) throws Exception {

		// Deklarisanje podataka
		double x, y, z, f;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.print("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za y: ");
		y = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za z: ");
		z = Double.parseDouble(ulaz.readLine());

		if (2 * x != y) {

			// Izračunavanje vrednosti funkcije f
			f = (x + y) * (x + z) / (2 * x - y);

			// Štampanje rezultata
			System.out.println("Vrednost funkcije f je " + df.format(f));
		} else

			// Štampanje poruke korisniku o pogrešnom unosu podataka
			System.out.println("Unos podataka nije ispravan (y se mora razlikovati od 2x).");
	}
}