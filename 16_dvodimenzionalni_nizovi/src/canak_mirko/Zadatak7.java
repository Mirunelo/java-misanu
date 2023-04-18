package canak_mirko;

import java.util.Scanner;

public class Zadatak7 {

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
		
		/* Stampanje matrice */
		System.out.println("\nMatrica:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		
		/* Odredjivanje elementa glavne dijagonale matrice */
		System.out.println("\nElementi koji se nalaze na glavnoj dijagonali matrice su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == j) {
					System.out.print(niz[i][j] + " ");
				}
			}
		}
		
		/* Odredjivanje elementa sporedne dijagonale matrice */
		System.out.println("\n\nElementi koji se nalaze na sporednoj dijagonali matrice su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i + j == red - 1) {
					System.out.print(niz[i][j] + " ");
				}
			}
		}
		
		sc.close();
	}

}
