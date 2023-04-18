package canak_mirko;

import java.util.Scanner;

public class Primer3 {
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
		
		for (int i = 1; i < n; i++)
			if ((x[i - 1] + x[i]) % 2 == 0)
				System.out.println(x[i - 1] + " " + x[i]);
		
		ulaz.close();
	}
}