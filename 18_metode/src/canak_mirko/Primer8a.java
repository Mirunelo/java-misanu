package canak_mirko;

import java.io.*;

public class Primer8a {
	static double suma(double[] a, double[] b, int k, int n, int m) {
		double s = 0;
		for (int i = 1; i <= k; i++)
			s += Math.pow(a[i], n) * Math.pow(b[i], m);
		return s;
	}

	public static void main(String[] args) throws Exception {
		double[] x = new double[30];
		double[] y = new double[30];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite dimenziju n niza x: ");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
		}
		System.out.println("Unesite elemente niza y: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("y[" + i + "] = ");
			y[i] = Double.parseDouble(ulaz.readLine());
		}
		double q = (n * suma(x, y, n, 1, 1) - suma(x, y, n, 1, 0) * suma(x, y, n, 0, 1))
				/ Math.sqrt(n * Math.abs(suma(x, y, n, 2, 0) * suma(x, y, n, 0, 2)));
		System.out.println("Suma je " + q);
	}
}