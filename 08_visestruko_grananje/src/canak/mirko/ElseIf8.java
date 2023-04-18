package canak.mirko;

import java.util.Scanner;

public class ElseIf8 {

	public static void main(String[] args) {

		/* Za uneti mesec, ispisati koliko dana ima taj mesec */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite godinu: ");
		short god = sc.nextShort();
		System.out.print("Unesite mesec (od 1 do 12): ");
		short mes = sc.nextShort();

		sc.close();

		if (mes == 1) {
			System.out.println("\nUneli ste mesec Januar koji ima 31 dan.");
		} else if (mes == 3) {
			System.out.println("\nUneli ste mesec Mart koji ima 31 dan.");
		} else if (mes == 4) {
			System.out.println("\nUneli ste mesec April koji ima 30 dana.");
		} else if (mes == 5) {
			System.out.println("\nUneli ste mesec Maj koji ima 31 dan.");
		} else if (mes == 6) {
			System.out.println("\nUneli ste mesec Jun koji ima 30 dana.");
		} else if (mes == 7) {
			System.out.println("\nUneli ste mesec Jul koji ima 31 dan.");
		} else if (mes == 8) {
			System.out.println("\nUneli ste mesec Avgust koji ima 31 dan.");
		} else if (mes == 9) {
			System.out.println("\nUneli ste mesec Septembar koji ima 30 dana.");
		} else if (mes == 10) {
			System.out.println("\nUneli ste mesec Oktobar koji ima 31 dan.");
		} else if (mes == 11) {
			System.out.println("\nUneli ste mesec Novembar koji ima 30 dana.");
		} else if (mes == 12) {
			System.out.println("\nUneli ste mesec Decembar koji ima 31 dan.");
		} else if (mes == 2) {

			if (god % 4 == 0 && god % 100 != 0 || god % 400 == 0) {
				System.out.println("\nUneli ste mesec Februar prestupne godine koji ima 29 dana.");
			} else {
				System.out.println("\nUneli ste mesec Februar koji ima 28 dana.");
			}

		} else {
			System.out.println("\nNiste dobro uneli mesec!");
		}

	}

}
