package vezba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak_06 {

	public static void main(String[] args) {

		BufferedReader unos = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Program će izračunati proizvod P po formuli:");
		System.out.println("P = (1-1/2)*(1-1/3)...(1-1/(n+1)\n");
		System.out.println("za uneti prirodan broj n.");
		int n = 0;
		boolean test = true;
		while (test) {
			try {
				System.out.println("\nUnesite broj: ");
				n = Integer.parseInt(unos.readLine());

				/* Pretpostavio sam gledajući zadatak, da je n >= 1 i da je Integer */

				if (n < 1) {
					System.out.println("Broj mora biti veći ili jednak 1.");
					test = true;
				} else
					test = false;

			} catch (Exception e) {
				System.out.println("\nMorate uneti broj.\nMolim vas da ponovite unos.\nHvala.");
				test = true;
			}
		}

		double p = 1;
		for (int i = 1; i <= n; i++)
			p *= (1 - 1 / ((double) i + 1));
		System.out.println("\nTraženi proizvod iznosi: " + p);

		/*
		 * Verujem da sam razumeo zadatak tj. kad se unese n = 2, računa se:
		 * P = (1 - 1/2 ) * (1 - 1/3), zato što je (1 - 1/(n+1))
		 */

	}

}
