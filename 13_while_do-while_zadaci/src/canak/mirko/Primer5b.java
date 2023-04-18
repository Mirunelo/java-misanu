package canak.mirko;

import java.util.Scanner;

public class Primer5b {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		System.out.println("Unesite vrednost za k:");
		int k = ulaz.nextInt();
		
		double s = 0;
		int i = 1;
		
		do {
			s += k * i / Math.pow((2 * i - 1), 2);
			i++;
		} while (i <= n);
		
		System.out.println("Suma s = " + s);
		
		ulaz.close();
	}
}