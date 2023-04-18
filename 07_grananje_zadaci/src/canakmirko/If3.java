package canakmirko;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {

		// Za uneti broj ispitati da li je deljiv brojem 2 i brojem 3.

		// 1. Ulazne vrednosti
		Scanner scanner = new Scanner(System.in);

		System.out.print("Unesite ceo broj: "); // nije neophodna linija koda
		int broj = scanner.nextInt();

		// 2. Obrada podataka
		if (broj % 2 == 0 && broj % 3 == 0) {
			System.out.println("Uneti broj je deljiv je i sa brojem 2 i sa brojem 3.");
		} else {
			System.out.println("Uneti broj nije deljiv brojevima 2 i 3.");
		}

		scanner.close();

	}

}
