package canak_mirko;

import java.io.*;

public class Primer15b {
	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Kreiranje realnog niza x
		double[] x = new double[100];
		
		// Unos vrednosti promenljive n
		System.out.print("Unesite broj elemenata n niza x: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		// Unos elemenata niza x
		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			}
		double xsr = 0;
		for (int i = 1; i <= n; i++)
			xsr += x[i];
		xsr /= n;
		double v = 0;
		for (int i = 1; i <= n; i++)
			v += (x[i] - xsr) * (x[i] - xsr);
		v /= (n - 1);
		System.out.print("V = " + v);
	}
}