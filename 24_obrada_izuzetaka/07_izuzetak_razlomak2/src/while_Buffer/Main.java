package while_Buffer;

import java.io.*;

public class Main {

	/*
	 * throws (ključna reč) koristi se u zaglavlju metode da naznači tip, tj. tipove
	 * izuzetaka koje ta metoda može da baci
	 */

	public static int kolicnik(int br, int im) throws ArithmeticException {
		return br / im;
	}

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		boolean unos = true;

		while (unos) {
			try {
				unos = false;
				System.out.print("Unesite brojilac: ");
				int brojilac = Integer.parseInt(bf.readLine());

				System.out.print("Unesite imenilac: ");
				int imenilac = Integer.parseInt(bf.readLine());

				int rezultat = kolicnik(brojilac, imenilac);

				System.out.println("Rezultat : " + rezultat);

				System.out.println("Sve OK!");

			} catch (ArithmeticException e) {
				System.out.println("Izuzetak." + e);
				unos = true;
			} catch (NumberFormatException e) {
				System.out.println("Unesite celobrojne vrednosti! " + e);
				unos = true;
			}

		}

	}

}
