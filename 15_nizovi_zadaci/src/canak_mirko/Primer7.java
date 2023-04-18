package canak_mirko;

import java.io.*;

public class Primer7 {
	public static void main(String[] args) throws Exception {
		
		// Niz parnih i niz neparnih brojeva i njihove trenutne dužine
		int[] parni = new int[100];
		int[] neparni = new int[100];
		int p = 0, n = 0;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Učitavamo broj elemenata
		System.out.println("Unesite vrednost za k: ");
		int k = Integer.parseInt(ulaz.readLine());
		for (int i = 1; i <= k; i++) {
			
			// Učitavamo naredni element
			int x = Integer.parseInt(ulaz.readLine());
			if (x % 2 == 0)
				
				// ako je paran
				
				parni[p++] = x;
			
			// smeštamo ga u niz parnih
			
			else
				
				// u suprotnom
				
				neparni[n++] = x;
			}
		System.out.println("Parni brojevi kuća");
		for (int i = 0; i < p; i++)
			System.out.println(parni[i]);
		System.out.println("Neparni brojevi kuća");
		for (int i = 0; i < n; i++)
			System.out.println(neparni[i]);
	}
}