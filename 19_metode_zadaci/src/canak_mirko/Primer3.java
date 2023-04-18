package canak_mirko;

import java.text.DecimalFormat;

public class Primer3 {
	static double horn(double[] a, int n, double x) {
		double horner = a[n];
		while (n != 0) {
			horner = horner * x + a[n - 1];
			n--;
		}
		return horner;
	}

	public static void main(String[] args) {
		double[] a = { 24, -50, 35, -10, 1 };
		DecimalFormat df = new DecimalFormat("#.##");
		int n = 4;
		System.out.println("\tX\tF(X)");
		for (double x = 0.0; x <= 0.9; x += 0.1)
			System.out.println("\t" + df.format(x) + "\t" + df.format(horn(a, n, x)));
	}
}