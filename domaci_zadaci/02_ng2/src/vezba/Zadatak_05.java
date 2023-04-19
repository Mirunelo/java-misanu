package vezba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak_05 {

	public static void main(String[] args) {

		/*
		 * Zadatak sam prvo rešio kodom i bio je tu i niz i gomila komplikovanih
		 * nepotrebnosti, a zatim sam nacrtao algoritme i shvatio sam da moram da
		 * obrišem dobar deo prvobitnog koda i iskodiram to ponovo. Ovde sam naučio da
		 * crtanje algoritma nije gubljenje vremena, iako ga kompanije u jurnjavi za
		 * profitom zanemaruju.
		 */

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		double a, n, eps;
		a = n = eps = 0.0;

		boolean test = true;
		while (test) {
			try {
				System.out.print("Unesite tačnost izračunavanja e = ");
				eps = Double.parseDouble(bf.readLine());
				System.out.print("Unesite promenljivu n: ");
				n = Double.parseDouble(bf.readLine());
				System.out.print("Unesite promenljivu a uz uslov da je a > 0: ");
				a = Double.parseDouble(bf.readLine());
				if (a > 0)
					test = false;
				else {
					System.out.println("\nPromenljiva a nije veća od nule.\nMolim vas da ponovo sve unesete.\n");
					test = true;
				}
			} catch (Exception e) {
				System.out.println("\nPogrešan unos!\nMolim vas da ponovo sve unesete.\n");
				test = true;
			}

		}

		/* Provere radi ovo je rezultat */

		System.out.println("\nKonsultujemo java.lang.Math...\nx kao " + (int) n + " koren iz " + a + " iznosi:\nx = "
				+ Math.pow(a, 1 / n) + "\n");

		/* a) Rešenje prema uslovu iz zadatka while petljom */

		System.out.println("Računamo n-ti koren iz a while petljom:\n");
		int i = 1;
		double xo = (a + n - 1) / n;
		double dx = eps + 0.1;
		double xi = 0;
		while (Math.abs(dx) > eps) {
			xi = ((n - 1) * xo + a / Math.pow(xo, (n - 1))) / n;

			System.out.println("Iteracija br." + i++ + ": n-ti koren iz a = " + xi);
			dx = xi - xo;
			xo = xi;
		}

		System.out.println("\nKonačno rešenje za zadatu tačnost iznosi: " + xi + "\n");

		/*
		 * b) Rešenje prema uslovu iz zadatka do-while petljom video sam da mi je niz
		 * totalno nepotreban, pa sam modifikovao kod za do-while petlju.
		 */

		System.out.println("Računamo n-ti koren iz a do-while petijom:\n");
		i = 1;
		xo = (a + n - 1) / n;
		do {
			xi = ((n - 1) * xo + a / Math.pow(xo, (n - 1))) / n;
			dx = Math.abs(xi - xo);
			System.out.println("Iteracija br." + i++ + ": n-ti koren iz a = " + xi);
			xo = xi;
		} while (dx > eps);

		System.out.println("\nKonačno rešenje za zadatu tačnost iznosi: " + xi);

	}

}
