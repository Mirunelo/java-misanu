package canak.mirko;

import java.io.*;
import java.text.DecimalFormat;

public class Primer19 {
	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos podataka
		System.out.println("Unesite vrednost za x: ");
		double x = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za eps: ");
		double eps = Double.parseDouble(ulaz.readLine());
		
		// Izračunavanje vrednosti sume
		double koef = Math.sin(x) + Math.cos(x);
		double a0 = 1.0;
		double s = a0;
		int k = 0;
		while (Math.abs(a0) > eps) { a0 = a0 * (k + 1) / (k + 2);
		s += a0;
		k++;
		}
		s *= koef;
		
		// Štampanje rezultata
		System.out.println("Tražena suma je S = " + df.format(s));
	}
}