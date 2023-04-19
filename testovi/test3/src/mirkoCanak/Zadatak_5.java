package mirkoCanak;

import java.io.*;

public class Zadatak_5 {

	public static double sila(double K, double q1, double q2, double r) {
		/*
		 * Metoda za izračunavanje sile privlačenja između dve naelektrisane čestice q1
		 * i q2 na rastojanju r.
		 */
		return K * q1 * q2 / Math.pow(r, 2);
	}

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		final double K = 9E9;

		System.out.print("Unesite vrednost naelektrisanja čestice q1: ");
		double q1 = Double.parseDouble(bf.readLine());
		System.out.print("Unesite vrednost naelektrisanja čestice q2: ");
		double q2 = Double.parseDouble(bf.readLine());
		System.out.print("Unesite rastojanje r između naelektrisanih čestica q1 i q2: ");
		double r = Double.parseDouble(bf.readLine());

		double f = sila(K, q1, q2, r);

		System.out.print("\nSila naelektrisanja između čestica q1 i q2 na rastojanju r iznosi: " + f + " N.");

	}

}