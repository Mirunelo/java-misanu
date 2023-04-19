package zadatak_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		FaktorijelBroja fb = (n) -> {
			int faktorijel = 1;
			for (int i = 2; i <= n; i++) {
				faktorijel = faktorijel * i;
			}
			return faktorijel;
		};

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj za računanje faktorijela: ");
		int broj = ulaz.nextInt();
		System.out.println("Faktorijel broja " + broj + " je " + fb.faktorijel(broj));

		ulaz.close();

	}

}
