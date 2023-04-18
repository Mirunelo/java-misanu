package canak_mirko;

/* import java.util.Scanner; - možemo navesti određenu klasu za import */

import java.util.*; /* Možemo importovati sve biblioteke java.util.* */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double r, a;
		System.out.print("Unesite poluprečnik: ");
		r = sc.nextDouble();
		sc.close();
		a = Math.PI * r * r;
		System.out.println("Površina kruga: " + a);

	}

}
