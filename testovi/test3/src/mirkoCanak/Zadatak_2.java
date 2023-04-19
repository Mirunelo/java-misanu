package mirkoCanak;

import java.io.*;
import java.text.DecimalFormat;

public class Zadatak_2 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.print("Unesite n: ");
		int n = Integer.parseInt(bf.readLine());

		double x[] = new double[n + 1];

		System.out.println("\nUnesite niz x[i], i = 1, ..., n:");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(bf.readLine());
		}

		double suma1 = 0, suma2 = 0;

		for (int i = 1; i <= n; i++) {
			suma2 += Math.pow(x[i], 2);
			suma1 += x[i];
		}

		double sigma = Math.sqrt(suma2 / n - Math.pow(suma1 / n, 2));

		System.out.println("\nStandardna devijacija iznosi: " + df.format(sigma));

	}

}