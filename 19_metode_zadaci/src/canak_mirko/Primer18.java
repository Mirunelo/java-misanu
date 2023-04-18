package canak_mirko;

import java.io.*;

public class Primer18 {
	/* Metoda za izračunavanje rastojanja između dve tačke */
	public static double rastojanje(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		/* Deklarisanje podataka */
		double a, b, c, xa, ya, xb, yb, xc, yc, p, s;

		/* Unos koordinata temena A trougla */
		System.out.println("Unesite koordinate temena A trougla: ");
		System.out.print("xa = ");
		xa = Double.parseDouble(ulaz.readLine());
		System.out.print("ya = ");
		ya = Double.parseDouble(ulaz.readLine());

		/* Unos koordinata temena B trougla */
		System.out.println("Unesite koordinate temena B trougla: ");
		System.out.print("xb = ");
		xb = Double.parseDouble(ulaz.readLine());
		System.out.print("yb = ");
		yb = Double.parseDouble(ulaz.readLine());

		/* Unos koordinata temena C trougla */
		System.out.println("Unesite koordinate temena C trougla: ");
		System.out.print("xc = ");
		xc = Double.parseDouble(ulaz.readLine());
		System.out.print("yc = ");
		yc = Double.parseDouble(ulaz.readLine());

		/* Izračunavanje stranica trougla */
		a = rastojanje(xb, yb, xc, yc);
		b = rastojanje(xa, ya, xc, yc);
		c = rastojanje(xa, ya, xb, yb);

		/* Izračunavanje poluobima trougla */
		s = (a + b + c) / 2;

		/* Izračunavanje površine trougla */
		p = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		/* Štampanje rezultata */
		System.out.println("Površina trougla je " + p);
	}
}