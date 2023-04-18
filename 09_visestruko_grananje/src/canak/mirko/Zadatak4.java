package canak.mirko;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		/* 1 deo: Unos */
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite dan, mesec i godinu:");
		int dan = sc.nextInt();
		int mesec = sc.nextInt();
		int godina = sc.nextInt();
		sc.close();

		int danas = dan + 7;

		/* 2 deo: Obrada */
		if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
			if (mesec % 2 != 0 && mesec < 12 && dan <= 31 || mesec == 8) {
				if (danas > 31) {
					danas = danas - 31;
					++mesec;
				}
			} else if (mesec == 2 && dan <= 29) {
				if (danas > 29) {
					danas = danas - 29;
					++mesec;
				}

			} else if (mesec % 2 == 0 && mesec < 12 && mesec != 8 && mesec != 2 && dan <= 30) {
				if (danas > 30) {
					danas = danas - 30;
					++mesec;
				}

			} else if (mesec == 12 && dan <= 31) {
				if (danas > 31) {
					danas = danas - 31;
					mesec = 1;
					++godina;
				}

			}

			else {
				System.out.println("Pogrešno ste uneli datum!");
			}

		} else {

			if (mesec % 2 != 0 && mesec < 12 && dan <= 31 || mesec == 8 ) {
				if (danas > 31) {
					danas = danas - 31;
					++mesec;
				}
			} else if (mesec == 2 && dan <= 28) {
				if (danas > 28) {
					danas = danas - 28;
					++mesec;
				}

			} else if (mesec % 2 == 0  && mesec < 12 && mesec != 2 && mesec != 8 && dan <= 30) {
				if (danas > 30) {
					danas = danas - 30;
					++mesec;
				}

			} else if (mesec == 12 && dan <= 31) {
				if (danas > 31) {
					danas = danas - 31;
					mesec = 1;
					++godina;
				}

			}

			else {
				System.out.println("Pogrešno ste uneli datum!");
			
			}
			
		}

		/* 3. deo: Štampanje */
		System.out.println("\nZa sedam dana biće: " + danas + "." + mesec + "." + godina + ".");

	}

}
