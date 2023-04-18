package uup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak1 {
	public static void main(String[] args) throws Exception {

		// Deklarisanje podataka
		double x, y, f;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.print("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za y: ");
		y = Double.parseDouble(ulaz.readLine());

		// Razgranata struktura
		if (x > y)
			f = Math.sqrt((x - 0.2) / (2 + y));
		else
			f = Math.sqrt((y - 0.2) / (2 + x));

		// f = sqrt((Math.Max(x,y)-0.2)/(2+Math.Min(x,y)));

		// Štampanje rezultata
		System.out.println("Vrednost funkcije je " + df.format(f));
	}
}
