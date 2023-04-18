package paket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	/*
	 * throws (ključna reč) koristi se u zaglavlju metode da naznači tip, tj. tipove
	 * izuzetaka koje ta metoda može da baci
	 */

	public static int kolicnik(int br, int im) throws ArithmeticException {
		return br / im;
	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Unesite brojilac: ");
			int brojilac = sc.nextInt();

			System.out.print("Unesite imenilac: ");
			int imenilac = sc.nextInt();

			int rezultat = kolicnik(brojilac, imenilac);

			System.out.println("Rezultat : " + rezultat);

			System.out.println("Sve OK!");

		} catch (ArithmeticException e) {
			System.out.println("Izuzetak: " + e);
		} catch (InputMismatchException e) {
			System.out.println("Unesite celobrojne vrednosti! " + e);
		}

		sc.close();

	}

}
