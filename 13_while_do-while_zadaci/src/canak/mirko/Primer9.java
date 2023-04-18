package canak.mirko;

import java.util.Scanner;
public class Primer9 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		System.out.println("Unesite vrednost za k:");
		int k = ulaz.nextInt();
		
		double s = 0, p = 1, p1 = 1;
		
		int i = 1;
		while (i <= n){
			p *= i; // faktorijel broja
			p1 *= k ; // stepen broja
			s += p/p1;
			i++;
		}
		System.out.println("Suma s = " + s);
		
		ulaz.close();

	}
}