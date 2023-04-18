package canak_mirko;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();
		
		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();
		
		int niz[][] = new int [red][kolona];
		
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("niz[" + i + ", " + j + "] = ");
				niz[i][j] = sc.nextInt();
			}
		}
		
		/* Odredjivanje najveceg elementa matrice */
		
		int max = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] > max) {
					max = niz[i][j];
				}
			}
		}
		
		System.out.print("\nNajveci element matrice je: " + max);
		
		/* Odredjivanje najmanjeg elementa matrice */
		
		int min = niz[0][0];
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] < min) {
					min = niz[i][j];
				}
			}
		}
		
		System.out.print("\n\nNajmanji element matrice je: " + min);
		
				sc.close();
		
	}

}
