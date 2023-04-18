package canak_mirko;

import java.util.Scanner;

public class Primer1 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();
		
		double x[] = new double[100];
		double y[] = new double[100];
		
		System.out.println("Unesite koordinate tačaka x i y:");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextDouble();
			System.out.print("y[" + i + "] = ");
			y[i] = ulaz.nextDouble();
		}
		x[0] = x[n];
		x[n + 1] = x[1];
		y[0] = y[n];
		y[n + 1] = y[1];
		
		double s = 0;
		
		for (int i = 1; i <= n; i++)
			s += y[i] * (x[i - 1] - x[i + 1]);
		
		double p = 0.5 * s;
		
		System.out.println("Površina parcele je " + p);
		ulaz.close();
	}
}