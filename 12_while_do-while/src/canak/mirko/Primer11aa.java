package canak.mirko;

import java.util.Scanner;

public class Primer11aa {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int n, s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		ulaz.close();
		int i = 1;
		for (i = 1; i <= n; i++) {
			if (i % 2 != 0)
				s += Math.pow(i, 2);
		}
		System.out.println("Za unetu vrednost n = " + n + " dobija se s = " + s);
	}
}
