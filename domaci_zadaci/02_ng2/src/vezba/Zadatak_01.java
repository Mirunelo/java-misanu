package vezba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak_01 {

	public static void main(String[] args) {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		double a, b, c;
		a = b = c = 0;
		boolean test = true;
		while (test) {
			try {
				System.out.print("Unesite realne promenljive:\na = ");
				a = Double.parseDouble(ulaz.readLine());
				System.out.print("b = ");
				b = Double.parseDouble(ulaz.readLine());
				System.out.print("c = ");
				c = Double.parseDouble(ulaz.readLine());

				/*
				 * U pokušaju da sprečim korisnika da se igra mojim programom, došao sam do
				 * otkrića: Double.POSITIVE_INFINITY i Double.NEGATIVE_INFINITY. Ne znajući za
				 * jadac, smatrao sam da ću lako uhvatiti deljenje nulom, međutim... Umesto
				 * deljenja nulom JAVA kad su u pitanju float i double ima POSITIVE_INFINITY i
				 * NEGATIVE_INFINITY. I zato sam u try ubacio if naredbu koja polako pešaka
				 * eliminiše moguća deljenja nulom. Prvo se proveri da li je C = B. To je prvo
				 * deljenje koje bi dalo Infinity. U slučaju da taj uslov nije zadovoljen, onda
				 * sledeće Infinity bi se dobilo ako bi: C + B / (C - B) = 0, i poslednji
				 * Infinity bi se dobio u slučaju da je: c + a / ( c + b / (c - b)) = 0
				 * 
				 * Možda postoji i neko elegantnije rešenje, ali sa onim što sam naučio do sada
				 * mogu samo na ovaj način da sprečim unos problematičnih parametara.
				 * 
				 * NPR: Sva tri slučaja unosa problematičnih parametara:
				 * 1) A = 3 , B = 4 , C = 4
				 * 2) A = 1 , B = 4 , C = 2
				 * 3) A = -1.5 , B = 5 , C = 3
				 * Nije traženo da se ovo radi, ali setih se vaših reči sa početka kursa.
				 */

				if (c == b || (c + b / (c - b)) == 0 || (c + a / (c + b / (c - b))) == 0)
					throw new ArithmeticException("Deljenje nulom!");
				test = false;
			} catch (Exception e) {
				System.out.println("\n!!! PAŽNJA !!! \n" + e.getMessage() + "\n");
				test = true;
			}
		}

		double f = (a - b) / (c + a / (c + b / (c - b)));
		double g = (a + b + Math.sin(a)) * Math.cos(c);

		System.out.println("\nVrednost funkcije f = " + f);
		System.out.println("Vrednost funkcije g = " + g);
		System.out.println("\nZbir i razlika vrednosti funkcija f i g:\nf + g = " + (f + g));
		System.out.print("f - g = " + (f - g));

	}

}
