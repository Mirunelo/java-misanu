package canak_mirko;

import java.io.*;
import java.text.DecimalFormat;

public class Primer16 {
	public static double[] koeficijentAB(double x[], double y[], int n) {
		double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
		double[] koeficijent = new double[5];
		for (int i = 1; i <= n; i++) {
			s1 += x[i];
			s2 += y[i];
			s3 += x[i] * y[i];
			s4 += x[i] * x[i];
		}

		/* Izračunavanje koeficijenta a */
		koeficijent[1] = (s1 * s2 - n * s3) / (s1 * s1 - n * s4);

		/* Izračunavanje koeficijenta b */
		koeficijent[2] = (s2 - koeficijent[1] * s1) / n;
		return koeficijent;
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
		System.out.println(
				"a = " + df.format(koeficijentAB(x, y, n)[1]) + "\tb = " + df.format(koeficijentAB(x, y, n)[2]));
	}
}