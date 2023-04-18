package canak.mirko;

import java.util.Scanner;

public class Primer6 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		int s, p;
		p = 1;
		s = 0;
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		
		int i = 1;
		while (i <= n) {
			p *= i;
			s += p;
			i++;
		}
		System.out.println("Suma s = " + s);
		ulaz.close();
	}
}