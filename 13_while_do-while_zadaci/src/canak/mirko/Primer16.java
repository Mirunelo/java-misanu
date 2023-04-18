package canak.mirko;

import java.util.Scanner;

public class Primer16 {
	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za a:");
		int a = ulaz.nextInt();
		
		int i = a;
		int cifra, max = 0;
		
		while (a != 0) {
			cifra = a % 10;
			
			if (cifra > max)
				max = cifra;
			a /= 10;
		}
		
		System.out.println("Najveća cifra unetog broja " + i + " je " + max);
		
		ulaz.close();
	}
}