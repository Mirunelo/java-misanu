package canak_mirko;

import java.io.*;
import java.text.DecimalFormat;

public class Primer3b {
	public static void main(String[] args) throws Exception {
		
		double[] nizA = new double[100];
		double[] x = new double[100];
		double[] y = new double[100];
		
		double a = 0.0, xt = 0.0, yt = 0.0;
		
		DecimalFormat df = new DecimalFormat("#.###");
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos dimenzije nizova
		System.out.println("Unesite broj elemenata nizova: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		// Unos elemenata niza a
		System.out.println("Unesite elemente niza a, x, y: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			nizA[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("y[" + i + "] = ");
			y[i] = Double.parseDouble(ulaz.readLine());
			a += nizA[i];
			xt += nizA[i] * x[i]; yt += nizA[i] * y[i];
			}
		xt /= a;
		yt /= a;
		
		//Štampanje rezultata
		System.out.println("A = " + df.format(a) + "\nXT = " + df.format(xt) + "\nYT = " + df.format(yt));
	}
}