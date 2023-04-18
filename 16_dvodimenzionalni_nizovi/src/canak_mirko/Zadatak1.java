package canak_mirko;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Broj redova: ");
		int red = sc.nextInt();
		
		System.out.print("Broj kolona: ");
		int kolona = sc.nextInt();
		
		int niz[][] = new int[red][kolona];
		
		System.out.println("\nElementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "] = ");
				niz[i][j] = sc.nextInt();
			}
		}
		
		/* Ispisivanje elemenata */
		System.out.println("\nElementi dvodimenzionalnog niza su: ");
		for(int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nElementi prvog reda su: ");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				if (i == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		
		System.out.println("\n\nElementi druge kolone su: ");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				if (j == 1)
					System.out.print(niz[i][j] + " ");
			}
			
		}
		
		System.out.println();
		sc.close();
	}
}


