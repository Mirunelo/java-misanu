package uup_Zadatak_07;

public class TekuciRacun {

	/* Deklarisanje podataka */
	private String brojTekucegRacuna;
	private String vlasnikRacuna;
	private double iznosNaRacunu;

	/* Metoda za pristup podatku brojTekucegRacuna */
	public String getBrojTekucegRacuna() {
		return brojTekucegRacuna;
	}

	/* Metoda za postavljanje podatka brojTelefona */
	public void setBrojTekucegRacuna(String brojTekucegRacuna) {
		if (brojTekucegRacuna.isBlank() || brojTekucegRacuna.isEmpty())
			throw new IzuzetakTekuciRacun("Broj tekućeg računa ne sme biti null");
		this.brojTekucegRacuna = brojTekucegRacuna;
	}

	/* Metoda za pristup podatku iznosNaRacunu */
	public double getIznosNaRacunu() {
		return iznosNaRacunu;
	}

	/* Metoda za postavljanje podatka dugovanje */
	public void setIznosNaRacunu(double iznosNaRacunu) {
		if (iznosNaRacunu > 25000)
			throw new IzuzetakTekuciRacun("Iznos na računu ne sme biti veći od 25000");
		this.iznosNaRacunu = iznosNaRacunu;
	}

	/* Metoda za pristup podatku vlasnik računa */
	public String getVlasnikRacuna() {
		return vlasnikRacuna;
	}

	/* Metoda za postavljanje podatka vlasnik računa */
	public void setVlasnikRacuna(String vlasnikRacuna) {
		if (vlasnikRacuna.isBlank() || vlasnikRacuna.isEmpty())
			throw new IzuzetakTekuciRacun("Ime i prezime vlasnika računa ne sme biti null");
		this.vlasnikRacuna = vlasnikRacuna;
	}

	/* Redefinisana metoda */
	public String toString() {
		return "Broj tekućeg računa: " + brojTekucegRacuna + "\nVlasnik računa: " + vlasnikRacuna
				+ "\nIznos na računu: " + iznosNaRacunu;
	}

}