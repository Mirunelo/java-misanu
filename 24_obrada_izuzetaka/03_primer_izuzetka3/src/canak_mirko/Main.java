package canak_mirko;

public class Main {

	public static void main(String[] args) {

		int d, a;

		try { /*
				 * U try bloku se stavljaju naredbe koje mogu baciti izuzetak, kao i one naredbe
				 * koje se neće izvršiti ako dođe do izuzetka
				 */
			d = 0;
			a = 10 / d;
			System.out.println("Ova poruka neće biti odštampana!");
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom.");
		}
		System.out.println("Program nastavlja sa izvršenjem!");
	}

}
/*
 * Hijerarhija izuzetaka
 * 
 * Svi izuzeci izvedeni su iz klase Throwable. Klasa Throwable ima dva direktna
 * naslednika (potomka): Error i Exception.
 * 
 * Klasa Error opisuje fatalne greške. (greške na koje ne možemo uticati). Za
 * greške tog tipa nije potrebno navoditi try/catch blokove.
 * 
 * Klasa Exception jeste klasa iz koje se izvode klase koje pripadaju
 * neproverenim tipovima izuzetaka.
 * 
 * Exception { RuntimeException, IOException}
 * 
 * RuntimeException {IndexOutOfBoundsException, ArithmeticException}
 * 
 */
