package canak_mirko;

public class Izuzetak {

	public static void proveriUzrast(int uzrast) throws PogresanUzrastIzuzetak {

		/*
		 * throws se koristi u zaglavlju metode da naglasi tipove izuzetaka koje baca
		 * metoda, a throw se koristi za bacanje izuzetka u telu metode.
		 */
		System.out.println("Proveri uzrast: (" + uzrast + ")");
		if (uzrast < 0 || uzrast > 100)
			throw new PogresanUzrastIzuzetak(uzrast);
		System.out.println("Uzrast: " + uzrast + " je dozvoljen uzrast.");
	}

	public static void main(String[] args) {
		try {
			proveriUzrast(25);
			proveriUzrast(-5);
		} catch (PogresanUzrastIzuzetak e) {
			System.out.println("Uhvaćen izuzetak: " + e.uTekst());
		} finally {
			System.out.println("finally blok se štampa obavezno!");
		}
	}

}
