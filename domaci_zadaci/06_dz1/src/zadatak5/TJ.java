package zadatak5;

public abstract class TJ {
	protected String naziv;

	public TJ(String naziv) {
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	// Apstraktna metoda za dohvatanje oznake vrste
	public abstract char getOznaka();

	// Apstraktna metoda za dohvatanje broja stanovnika
	public abstract int getBrStanovnika();

	// Opis
	public String opis() {
		return naziv + ":" + getOznaka() + ":" + getBrStanovnika();
	}
}