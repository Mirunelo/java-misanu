package canak_mirko;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak15 {

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
		int n = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
					suma += niz[i][j];
					n++;
			}
				
		}
			System.out.println("\nSrednja vrednost svih " + n + " elemenata iznosi: " + (double)suma/n);
	
			/* Aritmetička sredina pozitivnih brojeva */
			
			int suma1 = 0;
			int n1 = 0;
			for (int i = 0; i < red; i++) {
				for (int j = 0; j < kolona; j++) {
					if (niz[i][j] > 0) {
						suma1 += niz[i][j];
						n1++;
					}
				}
					
			}
				System.out.println("\nAritmetička sredina pozitivnih brojeva iznosi: " + (double)suma1/n1);
			
				/* Aritmetička sredina pozitivnih elemenata na redovima */
				
				int suma11 = 0;
				int n11 = 0;
				for (int i = 0; i < red; i++) {
					n11 = 0;
					suma11 = 0;
					for (int j = 0; j < kolona; j++) {
						if (niz[i][j] > 0) {
							suma11 += niz[i][j];
							n11++;
						}
						
					}
					System.out.println("\nAritmetička sredina pozitivnih elemenata u " + i + " redu: " + (double)suma11/n11);
				}
					
				/* DOMAĆI: Aritmetička sredina parnih elemenata na kolonama */
				
				int suma111 = 0;
				int n111 = 0;
				for (int j = 0; j < kolona; j++) {
					n111 = 0;
					suma111 = 0;
					for (int i = 0; i < kolona; i++) {
						if (niz[i][j]%2==0) {
							suma111 += niz[i][j];
							n111++;
						}
						
					}
					System.out.println("\nAritmetička sredina parnih elemenata u " + j + " koloni: " + (double)suma111/n111);
				}
				System.out.println(Arrays.deepToString(niz)); // štampa nizove :)
	}
		
}