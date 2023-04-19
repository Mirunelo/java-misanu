package zadatak_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		TestNegativanBroj tb = (n) -> (n < 0);

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite ceo broj: ");
		int broj = ulaz.nextInt();

		if (tb.negativanIliPozitivan(broj))
			System.out.println("Broj " + broj + " je negativan.");
		else
			System.out.println("Broj " + broj + " je pozitivan.");

		ulaz.close();

	}

}
