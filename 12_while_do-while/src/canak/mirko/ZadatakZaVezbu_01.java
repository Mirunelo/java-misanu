package canak.mirko;

import java.util.Scanner;

public class ZadatakZaVezbu_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za n:");
		int n = sc.nextInt();
		sc.close();
		
		int i = 1;
		int suma = 0;
		
		while ( i <= n ) {
			if ( i%2 == 0)
				suma += i;
			i++;
		}
		
		System.out.println("Suma svih parnih brojeva od 1 do " + n + " iznosi: " + suma);
		
		i = 1;
		suma = 0;
		
		do {
			if ( i%2 == 0 )
				suma += i;
			i++;
		} while( i <= n );

		System.out.println("Suma svih parnih brojeva od 1 do " + n + " iznosi: " + suma);
		
	}

}
