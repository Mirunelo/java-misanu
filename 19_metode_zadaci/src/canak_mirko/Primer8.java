package canak_mirko;

import java.io.*;

public class Primer8 {
	static final double k = 9 * Math.pow(10, 9);
	
	/* sila - metoda za izračunavanje sile privlačenja izmedju dve čestice */
	/* q1, q2 – naelektrisanja čestica */
	/* r – rastojanje izmedju čestica */
	public static double sila(double q1, double q2, double r) {
		return k * q1 * q2 / (r * r);
		}
	public static void main(String[] args) throws Exception {
		
		/* Deklarisanje podataka */
		double q1, q2, r;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		/* Unos podataka */
		System.out.println("Unesite vrednost prvog naelektrisanja q1 (C): ");
		System.out.print("q1 = "); q1 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost drugog naelektrisanja q2 (C): ");
		System.out.print("q2 = "); q2 = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za rastojanje r (m): ");
		r = Double.parseDouble(ulaz.readLine());
		
		/* Štampanje rezultata */
		System.out.println("Za q1 = " + q1 + " C, q2 = " + q2 + " C i rastojanje r = " + r +" m, sila je F = " + sila(q1, q2, r) + " N.");
		}
	}