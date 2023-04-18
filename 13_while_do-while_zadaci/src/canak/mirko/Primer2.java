package canak.mirko;

import java.util.Scanner;

public class Primer2 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost broja: ");
		int broj = ulaz.nextInt();
		int cifra;
		
		do { cifra = broj % 10;
		
		// izdvojena cifra
		
		broj = broj / 10;
		
		// celobrojna vrednost podeljenog broja sa 10
	
		System.out.println(cifra);
		
		// izdvojena cifra
		
		} while (broj > 0);
		
		ulaz.close();
	}
}