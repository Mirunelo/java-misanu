package canak.mirko;

import java.util.Scanner;

public class Primer6a {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		int i, k, n, suma = 0;
		System.out.print("Unesite vrednost za k: ");
		k = ulaz.nextInt();
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		
		i = k;
		while (i <= n) {
			suma += i;
			i++;
		}
		
		System.out.println("Od " + k + " do " + n + " suma = " + suma);
		
		ulaz.close();
	}
}