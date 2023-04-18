package canak.mirko;

import java.util.Scanner;

public class Primer17 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		/*
		 * n - broj koji se unosi
		 * s - zbir cifara
		 * cifra - cifra koja se izdvaja
		 */
		
		int n, s = 0, cifra;
		
		System.out.println("Unesite vrednost za n:");
		n = ulaz.nextInt();
		
		if (n < 0)
			System.out.println("Uneli ste negativan broj.");
		else {
			while (n > 0) {
				cifra = n % 10;
				s += cifra;
				n /= 10;
			}
			
			System.out.println("Zbir cifara je " + s);
		}
		
		ulaz.close();
	}
}