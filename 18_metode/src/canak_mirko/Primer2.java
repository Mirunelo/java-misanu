package canak_mirko;

import java.io.*;

public class Primer2 {
	static void stampajNiz(int n, double niz[]) {
		System.out.println("Uneti elementi niza su: ");
		for (int i = 0; i < n; i++)
			System.out.println(niz[i] + "\t");
	}

	static double srednjaVrednost(int n, double niz[]) {
		double sr = 0;
		for (int i = 0; i < n; i++)
			sr += niz[i];
		return sr / n;
	}

	public static void main(String[] args) throws Exception {
		double[] niz = new double[10];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite dimenziju niza: ");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < n; i++) {
			System.out.print("niz[" + i + "] = ");
			niz[i] = Double.parseDouble(ulaz.readLine());
		}
		stampajNiz(n, niz);
		System.out.println("\nSrednja vrednost niza je " + srednjaVrednost(n, niz));
	}
}