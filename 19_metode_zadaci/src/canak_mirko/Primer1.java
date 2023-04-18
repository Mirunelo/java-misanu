package canak_mirko;

import java.io.*;
import java.text.DecimalFormat;

public class Primer1 {
	static double rastojanje(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

	public static void main(String[] args) throws Exception {
		double[] x = new double[100];
		double[] y = new double[100];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednosti koordinata tačke: ");
		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". tačka ");
			System.out.print("x = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("y = ");
			y[i] = Double.parseDouble(ulaz.readLine());
		}
		System.out.println("\tR.BR.\tX\tY\tRastojanje");
		for (int i = 1; i <= n; i++)
			System.out.println("\t" + i + "\t" + df.format(x[i]) + "\t" + df.format(y[i]) + "\t"
					+ df.format(rastojanje(0, 0, x[i], y[i])));
	}
}