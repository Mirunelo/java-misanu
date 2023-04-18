package canak_mirko;

import java.io.*;

public class Primer8 {
	public static void main(String[] args) throws Exception {
		
		// bj - vektor jedinica
		// bd - vektor desetica
		// n - željeni broj unetih cifara
		// broj - vrednost broja koja se unosi
		int[] bj = new int[10];
		int[] bd = new int[10];
		int broj, j, d;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i <= 9; i++) {
			bj[i] = 0; bd[i] = 0;
			}
		System.out.println("Koliko brojeva želite da unesete? ");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite brojeve: ");
		for (int i = 1; i <= n; i++) {
			broj = Integer.parseInt(ulaz.readLine());
			if (broj >= 0 && broj <= 99) {
				if (broj < 10) j = broj;
				else { d = broj / 10;
				bd[d]++;
				j = broj - 10 * d;
				}
				bj[j]++;
				}
			}
		System.out.println("\tCifra\tKao desetica\tKao jedinica ");
		for (int i = 0; i <= 9; i++)
			System.out.println("\t" + i + "\t" + bd[i] + "\t" + bj[i]);
	}
}