package canak_mirko;

import java.io.*;

public class Primer9 {
	static void prikaziMatricu(int matrica[][], int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print(" " + matrica[i][j]);
			System.out.println();
		}
	}

	static void zameniElemente(int matrica[][], int n) {
		for (int i = 1; i <= n; i++){
			int tmp = matrica[i][i];
			matrica[i][i] = matrica[i][n - i + 1];
			matrica[i][n - i + 1] = tmp;
		}
	}

	public static void main(String[] args) throws Exception {
		int[][] matrica = new int[10][10];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite dimenziju matrice: ");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite elemente matrice: ");
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				System.out.print("matrica[" + i + "]" + "[" + j + "]: ");
				matrica[i][j] = Integer.parseInt(ulaz.readLine());
			}
		System.out.println("Štampanje matrice pre zamene elemenata");
		prikaziMatricu(matrica, n);
		System.out.println("Štampanje matrice nakon zamene elemenata");
		zameniElemente(matrica, n);
		prikaziMatricu(matrica, n);
	}
}