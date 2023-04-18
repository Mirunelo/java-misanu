package canak_mirko;

import static java.lang.Math.PI;

public class Main {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		double r, a;
		System.out.print("Unesite poluprečnik: ");
		r = sc.nextDouble();
		sc.close();
		a = PI * r * r;
		System.out.println("Površina kruga: " + a);

	}

}
