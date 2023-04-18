package canak.mirko;

import java.util.Scanner;

public class ZadatakZaVezbu_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite n: ");
		int n = sc.nextInt();
		sc.close();
		
		int i = 1;
		double suma = 0;
		
		do {
			suma += 1/Math.pow(3*i, 2);
			i++;
		} while ( i <= n );
		
		System.out.println("Suma iznosi: " + suma);
		
		i = 1;
		suma = 0;
		
		while ( i <= n ) {
			suma += 1/Math.pow(3*i, 2);
			i++;
		}
		System.out.println("Suma iznosi: " + suma);
	}

}
