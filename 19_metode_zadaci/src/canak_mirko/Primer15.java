package canak_mirko;

import java.io.*;
import java.text.DecimalFormat;

public class Primer15 {
	public static double koeficijentR(double x[], double y[], int n) {
		double s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;
		for (int i = 1; i <= n; i++) {
			s1 += x[i] * y[i];
			s2 += x[i];
			s3 += y[i];
			s4 += x[i] * x[i];
			s5 += y[i] * y[i];
		}
		/* Izračunavanje koeficijenta r */
		return (n * s1 - s2 * s3) / Math.sqrt((n * s4 - s2 * s2) * (n * s5 - s3 * s3));
	}

	public static void main(String[] args) throws Exception {
		double[] x = new double[100];
		double[] y = new double[100];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". tačka ");
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("y[" + i + "] = ");
			y[i] = Double.parseDouble(ulaz.readLine());
		}
		System.out.println("r = " + df.format(koeficijentR(x, y, n)));
	}
}