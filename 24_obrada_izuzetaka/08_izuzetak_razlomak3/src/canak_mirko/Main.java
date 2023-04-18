package canak_mirko;

public class Main {

	public static void main(String[] args) {

		try {
			int a = 0;
			int b = 10 / a;
			System.out.println(b);
		} catch (ArithmeticException e) {
			System.out.println("Izuzetak" + e.getMessage());
		}
		/*
		 * catch (ArithmeticException e) { System.out.println("Izuzetak2"); }
		 */

		/*
		 * Ukoliko postoji više catch blokova čiji tip parametara odgovara tipu bačenog
		 * izuzetka, izvršava se samo prvi takav catch blok. Greška je navesti dva catch
		 * bloka sa istim tipom paramtetara.
		 */

	}

}
