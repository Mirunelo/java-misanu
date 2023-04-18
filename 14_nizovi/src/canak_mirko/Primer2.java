package canak_mirko;

import java.util.Scanner;

public class Primer2 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.print("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();
		
		int x[] = new int[n];
		
		System.out.println("Unesite članove niza:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		
		int p = 1;
		for (int i = 0; i < x.length; i++)
			if (x[i] >= 3 && x[i] <= 9)
				p *= x[i];
		
		System.out.println("P = " + p);
		System.out.println(x.length);
		
		ulaz.close();
	}
}