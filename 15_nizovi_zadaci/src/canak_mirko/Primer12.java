package canak_mirko;

import java.io.*;

import java.text.DecimalFormat;
public class Primer12 {
	public static void main(String[] args) throws Exception {
		double[] x = new double[100];
		double eps = 1.0E-5;
		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos dimenzije niza x
		System.out.println("Unesite broj elemenata n niza x:");
		int n = Integer.parseInt(ulaz. readLine());
		
		// Unos elemenata niza x
		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			}
		
		// Štampanje zaglavlja
		System.out.println("\tI\tX\tS(X(I))");
		for (int i = 1; i <= n; i++) {
			
			// Izračunavanje vrednosti sume
			int k = 1;
			double s = (Math.abs(Math.sin(x[i] / k) - Math.pow(Math.cos(x[i]), 2))) / (k * k + 1);
			while (Math.abs(s) <= eps) {
				k++;
				s += (Math.abs(Math.sin(x[i] / k) - Math.pow(Math.cos(x[i]), 2))) / (k * k + 1);
				}
			
			// Štampanje rezultata
			System.out.println("\t" + i + "\t" + df.format(x[i]) + "\t" + df.format(s));
			} 
	}
}