package canak.mirko;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		/* 1.deo: Unos */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite dan u mesecu: ");
		int dan = sc.nextInt();

		System.out.print("Unesite mesec (Januar, Februar...): ");
		String me$ec = sc.next();

		sc.close();

		/*
		 * 2.deo: Obrada 3.deo: Štampanje
		 */

		switch (me$ec) {

		case "Januar": {
			if (dan > 21) {
				System.out.println("\nVodolija");
			} else {
				System.out.println("\nJarac");
			}
			break;
		}
		case "Februar": {

			if (dan <= 19) {
				System.out.println("\nVodolija");
			} else {
				System.out.println("\nRibe");
			}
			break;
		}
		case "Mart": {

			if (dan <= 20) {
				System.out.println("\nRibe");
			} else {
				System.out.println("\nOvan");
			}
			break;
		}
		case "April": {

			if (dan <= 20) {
				System.out.println("\nOvan");
			} else {
				System.out.println("\nBik");
			}
			break;
		}
		case "Maj": {

			if (dan <= 21) {
				System.out.println("\nBik");
			} else {
				System.out.println("\nBlizanci");
			}
			break;
		}
		case "Jun": {

			if (dan <= 21) {
				System.out.println("\nBlizanci");
			} else {
				System.out.println("\nRak");
			}
			break;
		}
		case "Jul": {

			if (dan <= 22) {
				System.out.println("\nRak");
			} else {
				System.out.println("\nLav");
			}
			break;
		}
		case "Avgust": {

			if (dan <= 22) {
				System.out.println("\nLav");
			} else {
				System.out.println("\nDevica");
			}
			break;
		}
		case "Septembar": {

			if (dan <= 22) {
				System.out.println("\nDevica");
			} else {
				System.out.println("\nVaga");
			}
			break;
		}
		case "Oktobar": {

			if (dan <= 23) {
				System.out.println("\nVaga");
			} else {
				System.out.println("\nŠkorpija");
			}
			break;
		}
		case "Novembar": {

			if (dan <= 22) {
				System.out.println("\nŠkorpija");
			} else {
				System.out.println("\nStrelac");
			}
			break;
		}
		case "Decembar": {

			if (dan <= 21) {
				System.out.println("\nStrelac");
			} else {
				System.out.println("\nJarac");
			}
			break;
		}
		default: {
			System.out.println("Pogrešno ste uneli mesec!");
		}

		}

	}

}
