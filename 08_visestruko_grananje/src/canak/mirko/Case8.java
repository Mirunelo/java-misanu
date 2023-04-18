package canak.mirko;

import java.util.Scanner;

public class Case8 {

	public static void main(String[] args) {

		/* Za uneti mesec, ispisati koliko dana ima taj mesec */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite godinu: ");
		short god = sc.nextShort();
		System.out.print("Unesite mesec (od 1 do 12): ");
		short mes = sc.nextShort();
		sc.close();

		switch (mes) {

		case 1: {
			System.out.println("\nUneli ste mesec Januar koji ima 31 dan.");
			break;
		}
		case 3: {
			System.out.println("\nUneli ste mesec Mart koji ima 31 dan.");
			break;
		}
		case 4: {
			System.out.println("\nUneli ste mesec April koji ima 30 dana.");
			break;
		}
		case 5: {
			System.out.println("\nUneli ste mesec Maj koji ima 31 dan.");
			break;
		}
		case 6: {
			System.out.println("\nUneli ste mesec Jun koji ima 30 dana.");
			break;
		}
		case 7: {
			System.out.println("\nUneli ste mesec Jul koji ima 31 dan.");
			break;
		}
		case 8: {
			System.out.println("\nUneli ste mesec Avgust koji ima 31 dan.");
			break;
		}
		case 9: {
			System.out.println("\nUneli ste mesec Septembar koji ima 30 dana.");
			break;
		}
		case 10: {
			System.out.println("\nUneli ste mesec Oktobar koji ima 31 dan.");
			break;
		}
		case 11: {
			System.out.println("\nUneli ste mesec Novembar koji ima 30 dana.");
			break;
		}
		case 12: {
			System.out.println("\nUneli ste mesec Decembar koji ima 31 dan.");
			break;
		}
		case 2: {

			int test = (god % 4 == 0 && god % 100 != 0 || god % 400 == 0) ? 1 : 0;

			switch (test) {

			case 1: {
				System.out.println("\nUneli ste mesec Februar prestupne godine koji ima 29 dana.");
				break;
			}
			default: {
				System.out.println("\nUneli ste mesec Februar koji ima 28 dana.");
			}

			}
			break;
		}
		default: {
			System.out.println("\nNiste dobro uneli mesec!");
		}

		}

	}

}
