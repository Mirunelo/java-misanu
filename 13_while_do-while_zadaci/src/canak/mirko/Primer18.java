package canak.mirko;

import java.io.*;
import java.text.DecimalFormat;

public class Primer18 {
	public static void main(String[] args) throws Exception {
		
		// a0 - prvi član sume
		// s - tražena suma
		// eps - tačnost izračunavanja
		
		double a0, s;
		int k;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos podataka
		System.out.println("Unesite vrednost za x: ");
		double x = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za eps: ");
		double eps = Double.parseDouble(ulaz.readLine());
		
		// Ispitivanje važenja reda
		if (Math.abs(x) < 4) {
			// Izračunavanje vrednosti funkcije
			a0 = 1.0;
			s = a0;
			k = 0;
			while (Math.abs(a0 / s) > eps) {
				a0 = x * x / ((2 * k + 2) * (2 * k + 1)) * a0;
				s += a0;
				k++;
			}
			
			// Štampanje rezultata
			System.out.println("Tražena suma je S = " + df.format(s));
			}
		else System.out.println("Za ch mora da važi |x| < 4.");
		
	}
}