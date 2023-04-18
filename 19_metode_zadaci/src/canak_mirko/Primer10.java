package canak_mirko;

import java.io.*;

public class Primer10 {
	static void prikaziMatricu(int matrica[][], int n, int m) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++)
				System.out.print(" " + matrica[i][j]);
			System.out.println();
		}
	}

	static void transponovanje(int m[][], int n[][], int v, int k) {
		for (int i = 1; i <= v; i++)
			for (int j = 1; j <= k; j++)
				n[j][i] = m[i][j];
	}

	public static void main(String[] args) throws Exception {
		int[][] matrica = new int[10][10];
		int[][] b = new int[10][10];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite dimenziju vrste n matrice: ");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite dimenziju kolone m matrice: ");
		int m = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite elemente matrice: ");
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++) {
				System.out.print("matrica[" + i + "]" + "[" + j + "]: ");
				matrica[i][j] = Integer.parseInt(ulaz.readLine());
			}
		System.out.println("Štampanje matrice pre zamene elemenata");
		prikaziMatricu(matrica, n, m);
		System.out.println("Štampanje matrice nakon zamene elemenata");
		transponovanje(matrica, b, n, m);
		prikaziMatricu(b, m, n);
	}
}