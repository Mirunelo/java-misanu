package canak_mirko;

import java.io.*;
import java.text.DecimalFormat;

public class Primer15 {
	/* Definisanje funkcije y */
	static double y(int n, double x, double[] a) {
		double s = 0, p;
		for (int i = 1; i <= n; i++) {
			p = 1;
			for (int j = 1; j <= n; j++)
				if (i != j)
					p *= x - a[j];
			s += p;
		}
		return s;
	}

	public static void main(String[] args) throws Exception {
		double[] a = new double[100];
		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		/* Unos dimenzije niza */
		System.out.println("Unesite dimenziju n niza a: ");
		int n = Integer.parseInt(ulaz.readLine());

		/* Unos elemenata niza */
		System.out.println("Unesite elemente niza a: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Double.parseDouble(ulaz.readLine());
		}
		/* Štampanje rezultata */
		System.out.println("\tN = " + n + "\tX\tY");
		for (double x = 0.0; x <= 1.0; x += 0.1)
			System.out.println("\t\t" + df.format(x) + "\t\t" + df.format(y(n, x, a)));
	}
}