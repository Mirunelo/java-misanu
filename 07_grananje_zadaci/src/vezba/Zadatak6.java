package vezba;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		/*
		 * test ocenjivanje 0 - 49 = 1, 50 - 60 = 2, 61 - 69 = 3, 70- 80 = 4, 81 - 100 =
		 * 5, ostalo je greška.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj bodova: ");
		byte bod = sc.nextByte();

		if (bod >= 0 && bod <= 49)
			System.out.println("Ocena 1.");
		else if (bod >= 50 && bod <= 60)
			System.out.println("Ocena 2.");
		else if (bod >= 61 && bod <= 69)
			System.out.println("Ocena 3.");
		else if (bod >= 70 && bod <= 80)
			System.out.println("Ocena 4.");
		else if (bod >= 81 && bod <= 100)
			System.out.println("Ocena 5.");
		else
			System.out.println("Uneli ste pogrešnu vrednost!");

		sc.close();

	}

}
