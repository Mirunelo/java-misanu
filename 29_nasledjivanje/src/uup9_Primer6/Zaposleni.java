package uup9_Primer6;

public class Zaposleni extends Osoba {

	// Deklarisanje podataka
	int brojRadneKnjizice;
	double prosecnaZarada;

	// Metoda za pristup podatku brojRadneKnjizice
	public int getBrojRadneKnjizice() {
		return brojRadneKnjizice;
	}

	// Metoda za postavljanje podatka brojRadneKnjizice
	public void setBrojRadneKnjizice(int brojRadneKnjizice) {
		this.brojRadneKnjizice = brojRadneKnjizice;
	}

	// Metoda za pristup podatku prosecnaZarada
	public double getProsecnaZarada() {
		return prosecnaZarada;
	}

	// Metoda za postavljanje podatka prosecnaZarada
	public void setProsecnaZarada(double prosecnaZarada) {
		if (prosecnaZarada > 0.0)
			this.prosecnaZarada = prosecnaZarada;
		else
			System.out.println("Greška: vrednost podatka prosečna zarada mora biti veća od nule.");
	}
}
