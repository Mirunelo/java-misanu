package canak_mirko;

import java.util.Scanner;

public class Primer5min {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();
		
		int x[] = new int[n];
		System.out.println("Unesite članove niza:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		
		int cifra;
		for (int i = 0; i < x.length; i++) {
			int min = 10, a = x[i];
			while (a != 0) {
				cifra = a % 10;
				if (cifra < min)
					min = cifra;
				
				a /= 10;
			}
			
			System.out.println("Najmanja cifra člana niza " + x[i] + " je " + min);
		}
		
		ulaz.close();
	}
}