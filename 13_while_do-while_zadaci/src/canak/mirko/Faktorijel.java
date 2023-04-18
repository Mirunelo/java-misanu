package canak.mirko;

import java.util.Scanner;

public class Faktorijel {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int p;
		p = 1;
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		int i = 1;
		while (i <= n) {
			p *= i;
			i++;
		}
		System.out.println("Faktorijel broja = " + p);
		ulaz.close();
	}
}