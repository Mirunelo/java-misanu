package zadatak5;

public class Naselje extends TJ {
	
	private int brStanovnika;

	// Konstruktor
	public Naselje(String naziv, int brojStanovnika) {
		super(naziv);
		this.brStanovnika = brojStanovnika;
	}

	// Metoda za dohvatanje oznake naselja
	public char getOznaka() {
		return 'N';
	}

	// Metoda za dohvatanje broja stanovnika naselja
	public int getBrStanovnika() {
		return brStanovnika;
	}

}
