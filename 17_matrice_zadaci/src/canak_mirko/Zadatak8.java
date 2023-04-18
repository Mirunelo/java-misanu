package canak_mirko;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];
		int b[][] = new int [kolona][red];

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

		System.out.println("Obrnuti redosled: ");
		for (int i = 0; i < kolona; i++) {
			for (int j = 0; j < red; j++) {
				b[i][j] = niz[j][i];
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
