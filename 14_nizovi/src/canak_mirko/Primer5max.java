package canak_mirko;

import java.util.Scanner;

public class Primer5max {
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
			int max = 0, a = x[i];
			while (a != 0) {
				cifra = a % 10;
				if (cifra > max)
					max = cifra;
				
				a /= 10;
			}
			
			System.out.println("Najveća cifra člana niza " + x[i] + " je " + max);
		}
		
		ulaz.close();
	}
}