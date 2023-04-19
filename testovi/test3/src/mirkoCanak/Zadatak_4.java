package mirkoCanak;

import java.io.*;
import java.text.DecimalFormat;

public class Zadatak_4 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.print("Unesite broj redova, tj. kolona kvadratnih matrica A i B: ");
		int n = Integer.parseInt(bf.readLine());

		int i, j;
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];

		System.out.println("\nUnesite elemente matrice A:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("A[" + i + "][" + j + "] = ");
				a[i][j] = Integer.parseInt(bf.readLine());
			}
		}

		System.out.println("\nUnesite elemente matrice B:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("B[" + i + "][" + j + "] = ");
				b[i][j] = Integer.parseInt(bf.readLine());
			}
		}

		/* Određivanje matrice C[n][n] */
		double c[][] = new double[n][n];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i < j)
					c[i][j] = Math.pow(a[i][j], 2) - Math.pow(b[i][j], 2);
				else if (i == j)
					c[i][j] = Math.abs(a[i][j]) + Math.abs(b[i][j]) + 1;
				else
					c[i][j] = Math.sqrt(Math.pow(a[i][j], 2) + Math.pow(b[i][j], 2));
			}
		}

		/* Štampanje matrice C */
		System.out.println("\nFormirana matrica C izgleda ovako:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(df.format(c[i][j]) + "   ");
			}
			System.out.println("\n");
		}

	}

}