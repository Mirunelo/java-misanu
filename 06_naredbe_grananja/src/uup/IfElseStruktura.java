package uup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfElseStruktura {

	public static void main(String[] args) throws Exception {

		// Deklarisanje podataka
		double x, y;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podatka x
		System.out.print("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());

		// Razgranata struktura
		if (x >= 0)
			y = x;
		else
			y = -x;

		// Štampanje rezultata
		System.out.println("Za uneto X = " + x + " dobija se Y = " + y);
	}
}