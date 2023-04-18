package canak_mirko;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int red, kolone;

		System.out.print("Unesite broj redova: ");
		red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		kolone = sc.nextInt();

		int a[][] = new int[red][kolone];
		int b[][] = new int[red][kolone];
		int c[][] = new int[red][kolone];

		System.out.println("\nElementi prve matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print("a[" + i + ", " + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nElementi druge matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print("b[" + i + ", " + j + "] = ");
				b[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nElementi dvodimenzionalnog niza a su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nElementi dvodimenzionalnog niza b su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		/* Sabiranje matrica */
		System.out.println("\nSabiranje matrica (a + b): ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(c[i][j] + "   ");
			}
			System.out.println();
		}

		/* Oduzimanje matrica */
		System.out.println("\nOduzimanje matrica (a - b):");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++)
				c[i][j] = a[i][j] - b[i][j];
		}

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(c[i][j] + "   ");
			}
			System.out.println();
		}

		/* Mnozenje matrice skalarom */

		System.out.print("\nUnesite skalar za mnozenje matrice: ");
		int skalar = sc.nextInt();
		int d[][] = new int[red][kolone];

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				c[i][j] = a[i][j] * skalar;
				d[i][j] = b[i][j] * skalar;
			}
		}

		System.out.println("\nMnozenje matrice a skalarom: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\nMnozenje matrice b skalarom: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();
		}

		/* Mnozenje matrica */
		if (red == kolone) {
			System.out.println("\nMnozenje matrica (a * b): ");
			for (int i = 0; i < red; i++)
				for (int j = 0; j < kolone; j++) {
					c[i][j] = 0;
					for (int p = 0; p < red; p++)
						c[i][j] += a[i][p] * b[p][j];
				}

		} else
			System.out.println("Nemoguće je pomnožiti vaše matrice!");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();

	}

}
