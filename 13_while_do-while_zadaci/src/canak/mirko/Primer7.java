package canak.mirko;

import java.util.Scanner;

public class Primer7 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		
		int p = 1, s = 0;
		
		int i = 1;
		while (i <= n) {
			p *= i;
			if (i % 2 == 0)
				s += p;
			i++;
		}
		
		System.out.println("Suma s = " + s);
		
		ulaz.close();
	}
}