package vezba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadatak_07 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Program će na osnovu unete pozitivne celobrojne vrednosti n");
		System.out.println("Generisati niz a od 2n random elemenata i nakon toga će rešavati zadatak.");

		boolean test = true;
		int n = 0;
		while (test) {
			try {
				System.out.print("\nUnesite ceo broj veći ili jednak jedinici:\nn = ");
				n = Integer.parseInt(bf.readLine());
				if (n < 1) {
					System.out.println("\nUneli ste broj manji od 1.");
					test = true;
				} else
					test = false;
			} catch (Exception e) {
				System.out.println("\nPogrešan unos!");
				test = true;
			}
		}

		double[] a = new double[(2 * n) + 1];
		System.out.println("\nVaš niz a[2n] od " + (2 * n) + " elemenata je popunjen sledećim vrednostima:");
		for (int i = 1; i <= (2 * n); i++) {
			a[i] = 100 * Math.random();
			System.out.println("a[" + i + "] = " + a[i]);
		}

		double[] b = new double[n + 1];
		System.out.println("\nKreiramo niz b[n] od " + n + " elementa prema uslovu zadatka:");
		for (int i = 1; i <= n; i++) {
			b[i] = (a[i] + a[2 * n + 1 - i]) / 2;
			System.out.println("b[" + i + "] = " + b[i]);
		}

		/*
		 * Primer da je n = 3 i da imamo zadat niz od 2n (int) elemenata i formiramo
		 * double niz bb[] od n elemenata, krećem od i = 0 i nultog elementa niza da
		 * bude prostije.
		 */
		System.out.println("\nŠtampamo niz aa[] od 6 elemenata tipa Integer:");
		int[] aa = { 1, 4, 9, 16, 25, 36 };
		for (int i = 0; i < 6; i++)
			System.out.println("aa[" + i + "] = " + aa[i]);
		System.out.println("\nŠtampamo niz bb[] od 3 elementa double");
		double[] bb = new double[3];
		for (int i = 0; i < 3; i++) {
			bb[i] = (double) (aa[i] + aa[2 * 3 - 1 - i]) / 2;
			System.out.println("bb[" + i + "] = " + bb[i]);
		}

		/*
		 * Verzija sa unosom vrednosti niza A[] od 2n članova. n je već zadato na
		 * početku unosa.
		 */
		System.out.println("\nUnesite niz A[] od " + (2 * n) + " elemenata.");
		double[] aaa = new double[2 * n + 1];
		for (int i = 1; i < aaa.length; i++) {
			System.out.print("A[" + i + "] = ");
			aaa[i] = Double.parseDouble(bf.readLine());
		}
		System.out.println("\nŠtampamo niz A[] od " + (2 * n) + " elemenata.");
		for (int i = 1; i < aaa.length; i++)
			System.out.println("A[" + i + "] = " + aaa[i]);
		System.out.println("\nŠtampamo niz B[] od " + n + " elementa.");
		double[] bbb = new double[n + 1];
		for (int i = 1; i < bbb.length; i++) {
			bbb[i] = (double) (aaa[i] + aaa[2 * n + 1 - i]) / 2;
			System.out.println("B[" + i + "] = " + bbb[i]);
		}

	}

}
