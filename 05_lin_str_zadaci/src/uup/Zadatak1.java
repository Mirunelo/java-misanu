package uup;

import java.io.*;
import java.text.DecimalFormat;

public class Zadatak1 {

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
		
		// Izracunavanje vrednosti funkcije f
		f = (x + y) * (x + z) * Math.sin(x) / (2 * x - y);
		
		// Stampanje rezultata
		System.out.println("Vrednost funkcije f je " + df.format(f));
		
	}

}
