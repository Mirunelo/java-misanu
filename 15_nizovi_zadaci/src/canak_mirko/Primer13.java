package canak_mirko;

import java.io.*;

import java.text.DecimalFormat;
public class Primer13 {
	public static void main(String[] args) throws Exception {
		double[] x = new double[100];
		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos podataka a i n
		System.out.println("Unesite vrednost za a: ");
		double a = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite broj elemenata n niza x:");
		int n = Integer.parseInt(ulaz.readLine());
		
		// Unos elemenata niza x
		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			}
		
		//Izračunavanje verižnog razlomka
		double ver = n * Math.sqrt(a);
		for (int i = n -1; i >= 1; i--)
			ver = i * Math.sqrt(a) + (x[i] - x[i + 1]) / ver;
		
		//Štampanje rezultata
		System.out.println("Vrednost verižnog razlomka je " + df.format(ver));
	}
}