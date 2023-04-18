package vezba;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite godinu: ");
		short god = sc.nextShort();

		if (god % 4 == 0 && god % 100 != 0 || god % 400 == 0)
			System.out.println(god + " je prestupna godina.");
		else
			System.out.println(god + " nije prestupna godina.");

		sc.close();

	}

}
