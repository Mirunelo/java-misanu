package profesor;

import java.io.*;

public class Zadatak1 {
	
	public static void main(String[] args) throws Exception {
		double a, b, c, f, g;
		
		// Unos podataka
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za a: ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za b: ");
		b = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za c: ");
		c = Double.parseDouble(ulaz.readLine());
		
		// Izračunavanje vrednosti funkcija f i g
		f = (a - b) / (c + a / (c + b / (c - b)));
		g = (a + b + Math.sin(a) * Math.cos(c));
		
		// Štampanje rezultata
		System.out.println("Vrednosti funkcija f = " + f + " i g = " + g);
	}

}
