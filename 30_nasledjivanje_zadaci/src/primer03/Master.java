package primer03;

public class Master extends Kartica {

	// Deklarisanje podatka pinKod
	int pinKod;

	// Parametrizovan konstruktor
	Master(String tipKartice, String imeVlasnika, int pinKod) {

		// Nasledjivanje parametrizovanog konstruktora klase Kartica
		super(tipKartice, imeVlasnika);
		this.pinKod = pinKod;
	}

	public void ispisi() {

		// Nasledjivanje metode ispisi klase Kartica
		super.ispisi();
		System.out.println("Pin kod: " + pinKod);
	}
}
