package canak.mirko;

import java.util.Scanner;

public class Primer12b {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		
		int n, k;
		double s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		
		System.out.print("Unesite vrednost za k: ");
		k = ulaz.nextInt();
		ulaz.close();
		
		int i = 0;
		
		for ( i = 0; i <= n; i++)
			s = s + 2 / (double) (k + i);
		System.out.println("Suma je " + s);
		
	}

}
