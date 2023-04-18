package uup_Zadatak_06;

public class TelefonskiRacun {

	/* Deklarisanje podataka */
	private String brojTelefona;
	private String vlasnik;
	private double dugovanje;

	/* Metoda za pristup podatku brojTelefona */
	public String getBrojTelefona() {
		return brojTelefona;
	}

	/* Metoda za postavljanje podatka brojTelefona */
	public void setBrojTelefona(String brojTelefona) {
		if (brojTelefona.isBlank() || brojTelefona.isEmpty())
			throw new IzuzetakTelefonskiRacun("Broj telefona ne sme biti null");
		this.brojTelefona = brojTelefona;
	}

	/* Metoda za pristup podatku dugovanje */
	public double getDugovanje() {
		return dugovanje;
	}

	/* Metoda za postavljanje podatka dugovanje */
	public void setDugovanje(double dugovanje) {
		if (dugovanje <= 0)
			throw new IzuzetakTelefonskiRacun("Dugovanje mora biti veće od nule");
		this.dugovanje = dugovanje;
	}

	/* Metoda za pristup podatku vlasnik */
	public String getVlasnik() {
		return vlasnik;
	}

	/* Metoda za postavljanje podatka vlasnik */
	public void setVlasnik(String vlasnik) {
		if (vlasnik.isBlank() || vlasnik.isEmpty())
			throw new IzuzetakTelefonskiRacun("Ime i prezime vlasnika telefona ne sme biti null");
		this.vlasnik = vlasnik;
	}

	/* Redefinisana metoda */
	public String toString() {
		return "Broj telefona: " + brojTelefona + "\nVlasnik: " + vlasnik + "\nDugovanje: " + dugovanje;
	}
}