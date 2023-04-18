package canak_mirko;

import java.util.Scanner;

public class Zadatak3 {

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
		
		/* Elementi parnih indeksa redova */
		System.out.println("\nElementi parnih indeksa redova:");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				if((i+1)%2==0)
					System.out.print(niz[i][j] + " ");
			}
		}
		
		/* Elementi neparnih indeksa kolona */
		System.out.println("\n\nElementi neparnih indeksa kolona:");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				if((j+1)%2!=0)
					System.out.print(niz[i][j] + " ");
			}
		}
		
		/* Elementi parnih indeksa kolona */
		System.out.println("\n\nElementi pranih indeksa kolona:");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				if((j+1)%2==0)
					System.out.print(niz[i][j] + " ");
			}
		}
		
		/* Elementi neparnih indeksa redova */
		System.out.println("\n\nElementi neparnih indeksa redova:");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				if((i+1)%2!=0)
					System.out.print(niz[i][j] + " ");
			}
		}
		
		/* Elementi parnih indeksa redova i kolona */
		System.out.println("\n\nElementi parnih indeksa redova i kolona:");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				if( (i+1)%2==0 && (j+1)%2==0 )
					System.out.print(niz[i][j] + " ");
			}
		}
		
		sc.close();
		
		
	}

}
