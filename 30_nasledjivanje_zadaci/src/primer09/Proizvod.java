package primer09;

public class Proizvod {
	String naziv;
	String proizvodjac;
	double cena;
	String rokTrajanja;

	public Proizvod() {
		naziv = "nepoznat";
		proizvodjac = "nepoznat";
		cena = 0.0;
		rokTrajanja = "29.12.2022";
	}

	public Proizvod(String naziv, String proizvodjac, double cena, String rokTrajanja) {
		if (naziv.isBlank() || naziv.isEmpty())
			System.out.println("Greška: vrednost podatka naziv ne sme biti null.");
		else
			this.naziv = naziv;
		if (proizvodjac.isBlank() || proizvodjac.isEmpty())
			System.out.println("Greška: vrednost podatka proizvodjac ne sme biti null.");
		else
			this.proizvodjac = proizvodjac;
		if (cena < 0)
			System.out.println("Greška: vrednost podatka cena ne sme biti manja od nule.");
		else
			this.cena = cena;
		this.rokTrajanja = rokTrajanja;
	}
}
