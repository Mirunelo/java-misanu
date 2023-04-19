package canak_mirko;

import java.io.*;

public class KvadratniKoren {

	public static void main(String[] args) {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Unesite broj: ");
			double br = Double.parseDouble(bf.readLine());
			System.out.println("\nProvera broja: " + br);
			if( br < 0)
				throw new Izuzetak("Kvadratni koren broja -5.0 ne može se izračunati.");
			System.out.println("Kvadratni koren broja " + br + " iznosi: " + Math.sqrt(br));
		} catch (Exception e) {
			System.out.println("Izuzetak: " + e.getMessage());
		}
		
	}

}
