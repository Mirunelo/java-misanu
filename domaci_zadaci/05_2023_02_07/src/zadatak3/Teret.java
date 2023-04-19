package zadatak3;

public abstract class Teret {

	/*
	 * id mora biti static da bi se pamtio inkrement sa svakim novim teretom
	 * apstraktni teret pored ID ima još zadatu specifičnu težinu i celobrojni
	 * identifikator (oznaka)
	 */
	protected static int id;
	protected double st;
	private char oznaka;

	// Parametrizovani konstruktor
	Teret(double st, char oznaka) {
		id++;
		this.st = st;
		this.oznaka = oznaka;
	}

	// Geter za oznaku vrste
	public char getOznaka() {
		return oznaka;
	}

	// Apstraktna metoda računa zapreminu
	abstract double zapremina();

	// Metoda za računanje težine
	double tezina() {
		return zapremina()*st;
	}

	// Tekstualni opis sa oznakom vrste i ID-om
	String opis() {
		return "Teret " + oznaka + ", ID(" + id + "):";
	}

	
	
}
