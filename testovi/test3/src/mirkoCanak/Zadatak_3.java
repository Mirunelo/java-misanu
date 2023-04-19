package mirkoCanak;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova tj. kolona kvadratne matrice A reda NxN: ");
		int n = sc.nextInt();

		sc.close();

		int a[][] = new int[n][n];

		/* 0,0 0,2 1,1 2,0 2,2 - jedinice, a ostalo su nule */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1)
					a[i][j] = 1;
				else
					a[i][j] = 0;
			}
		}

		/*
		 * Štampanje formirane matrice sa jedinicama na glavnoj i sporednoj dijagonali i
		 * svim ostalim nulama.
		 */
		System.out.println("\nMatrica sa jedinicama po dijagonalama:\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}