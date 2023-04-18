package canak_mirko;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				niz[i][j] = 1;
			}
		}

		sc.close();
		System.out.println("\nPočetni izgled:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nNovi izgled:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if( i >= j)
				System.out.print(niz[i][j] + " ");
				else;
				System.out.print("");
			}
			System.out.println();
		}
	}
}
