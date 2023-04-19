package primer02;

public class Uredjaj {

	// Deklarisanje podataka
	String marka;
	boolean ukljucen;

	// Parametrizovan konstruktor
	public Uredjaj(String marka, boolean ukljucen) {
		if (marka.isBlank() || marka.isEmpty())
			System.out.println("Greška: vrednost podatka marka ne sme biti null.");
		else {
			this.marka = marka;
			this.ukljucen = ukljucen;
		}
	}

	// Metoda za pristup podatku marka
	public String getMarka() {
		return marka;
	}

	// Metoda za postavljanje podatka marka
	public void setMarka(String marka) {
		if (marka.isBlank() || marka.isEmpty())
			System.out.println("Greška: vrednost podatka marka ne sme biti null.");
		else
			this.marka = marka;
	}

	// Metoda koja vraca true ako je uredjaj uključen
	public void ukljuci() {
		ukljucen = true;
	}

	// Metoda koja vraca true ako je uredjaj isključen
	public void iskljuci() {
		ukljucen = false;
	}

	// Metoda za ispisivanje podataka o uredjaju
	public void ispisi() {
		System.out.println("Marka: " + marka);
		if (ukljucen)
			System.out.println("Uredjaj je uključen.");
		else
			System.out.println("Uredjaj je isključen.");
	}
}
