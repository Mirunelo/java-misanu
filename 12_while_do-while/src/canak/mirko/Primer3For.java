package canak.mirko;

import java.util.Scanner;

public class Primer3For {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		
		System.out.print("Unesite vrednost za n: ");
		int n = ulaz.nextInt();
		double s=0;
		
		for (int i = 1; i <= n; i++)
			s += (double) 1/i;
		
		System.out.println("Suma recipročnih vrednosti brojeva do " + n + " je: " + s);
		ulaz.close();
		
	}

}
