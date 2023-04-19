package zadatak3;

public class Zaposlen extends Osoba {

	protected String nazivFirme;
	protected String radnoOdeljenje;

	Zaposlen(String nf, String ro) {
		super();
		nazivFirme = nf;
		radnoOdeljenje = ro;
	}

	public String getNazivFirme() {
		return nazivFirme;
	}

	public void setNazivFirme(String nazivFirme) {
		this.nazivFirme = nazivFirme;
	}

	public String getRadnoOdeljenje() {
		return radnoOdeljenje;
	}

	public void setRadnoOdeljenje(String radnoOdeljenje) {
		this.radnoOdeljenje = radnoOdeljenje;
	}

	public void tekstualniOpis() {
		System.out.println("Ime i prezime: " + imeOsobe);
		System.out.println("Datum rođenja: " + datumRodjenja);
		System.out.println("Adresa stanovanja: " + adresaStanovanja);
		System.out.println("Naziv firme: " + nazivFirme);
		System.out.println("Radno odeljenje: " + radnoOdeljenje + "\n");
	}
}
