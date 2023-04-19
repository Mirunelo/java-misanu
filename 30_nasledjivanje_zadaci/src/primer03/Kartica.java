package primer03;

public class Kartica {

	// Deklarisanje zasticenih podataka
	protected String tipKartice;
	protected String imeVlasnika;

	// Parametrizovan konstruktor
	Kartica(String tipKartice, String imeVlasnika) {
		this.tipKartice = tipKartice;
		this.imeVlasnika = imeVlasnika;
	}

	// Metoda za ispisivanje podataka o kartici
	public void ispisi() {
		System.out.println("Tip kartice: " + tipKartice);
		System.out.println("Ime vlasnika: " + imeVlasnika);
	}
}
