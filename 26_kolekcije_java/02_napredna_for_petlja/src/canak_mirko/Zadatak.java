package canak_mirko;

import java.util.Scanner;

public class Zadatak {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] niz = new int[5];
		System.out.println("Unesite niz[]");
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite " + i + " element niza: ");
			niz[i] = sc.nextInt();
		}

		System.out.println("\nŠtampanje elemenata niza unapređenom for petljom: ");
		for (int unapredjenifor : niz)
			System.out.println(unapredjenifor);

		sc.close();
	}

}
