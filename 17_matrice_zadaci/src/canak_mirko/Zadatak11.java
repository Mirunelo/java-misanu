package canak_mirko;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

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

		int suma = 0;
		int i = 2;
		for (int j = 0; j < kolona; j++) {
				suma += niz[i][j];
			}
			System.out.println("\nSuma trećeg reda: " + suma);
		
	}

}