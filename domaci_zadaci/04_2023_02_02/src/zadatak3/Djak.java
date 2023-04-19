package zadatak3;

public class Djak extends Osoba {

	protected String nazivSkole;
	protected String razred;

	Djak(String ns, String raz) {
		super();
		nazivSkole = ns;
		razred = raz;
	}

	public String getNazivSkole() {
		return nazivSkole;
	}

	public void setNazivSkole(String nazivSkole) {
		this.nazivSkole = nazivSkole;
	}

	public String getRazred() {
		return razred;
	}

	public void setRazred(String razred) {
		this.razred = razred;
	}

	public void tekstualniOpis() {
		System.out.println("Ime i prezime: " + imeOsobe);
		System.out.println("Datum rođenja: " + datumRodjenja);
		System.out.println("Adresa stanovanja: " + adresaStanovanja);
		System.out.println("Naziv škole: " + nazivSkole);
		System.out.println("Odeljenje: " + razred + "\n");
	}

}
