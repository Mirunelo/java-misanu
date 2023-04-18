package canak_mirko;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("niz[" + i + ", " + j + "] = ");
				niz[i][j] = sc.nextInt();
			}
		}

		sc.close();
		System.out.println("\nMatrica");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		int suma = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if ( niz[i][j] > 3 ) {
					suma += niz[i][j];
				}
			}
				
			}
			System.out.println("\nSuma elemenata većih od 3: " + suma);
		
	}

}