package while_scanner;

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

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean uslov = true;

		while (uslov) {
			try {
				uslov = false;
				System.out.print("Unesite brojilac: ");
				int brojilac = sc.nextInt();

				System.out.print("Unesite imenilac: ");
				int imenilac = sc.nextInt();

				int rezultat = kolicnik(brojilac, imenilac);

				System.out.println("Rezultat : " + rezultat);

				System.out.println("Sve OK!");

			} catch (ArithmeticException e) {
				System.out.println("Izuzetak." + e);
				uslov = true;
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("Unesite celobrojne vrednosti! " + e);
				uslov = true;
			}

		}

		sc.close();
		
	}

}
