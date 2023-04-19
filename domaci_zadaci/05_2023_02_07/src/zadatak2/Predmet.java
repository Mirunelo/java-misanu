package zadatak2;

public abstract class Predmet {
	
	// Deklarisanje zaštićenih podataka
	protected double st;
	private char oznaka;
	
	// Parametrizovani konstruktor
	Predmet (char oznaka, double st) {
		this.oznaka = oznaka;
		this.st = st;
	}
	
	// Apstraktna metoda određivanja zapremine predmeta
	abstract double zapremina();
	// Metoda za određivanje težine predmeta
	double tezina() {
		return zapremina()*st;
	}
	// Geter oznake predmeta
	public char getOznaka() {
		return oznaka;
	}

	// Apstraktna metoda opisa predmeta
	abstract String opis();

}
