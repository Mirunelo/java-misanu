package canak_mirko;

import java.io.*;

public class Primer13 {
	public static void korenJednacine(double x0, double eps) {
		int i = 0;

		/* Štampanje zaglavlja */
		System.out.println("I X(I) F(X(I))");
		System.out.println("------------------------------------");
		double x1 = Math.cos(x0) - 0.15;
		System.out.println(i + "\t" + x0 + "\t" + x1);
		while (Math.abs(x1 - x0) > eps) {
			i++;
			x0 = x1;
			x1 = Math.cos(x0) - 0.15;

			/* Štampanje rezultata */
			System.out.println(i + "\t" + x0 + "\t" + x1);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za x0: ");
		double x0 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za eps: ");
		double eps = Double.parseDouble(ulaz.readLine());
		korenJednacine(x0, eps);
	}
}