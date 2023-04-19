package primer05;

public class Referent extends Zaposleni {

	// Deklarisanje podatka bonus
	double bonus;

	// Parametrizovan konstruktor
	Referent(double brojRadnihSati, double cenaRadnogSata, double bonus) {
		this.brojRadnihSati = brojRadnihSati;
		this.cenaRadnogSata = cenaRadnogSata;
		this.bonus = bonus;
	}

	// Metoda za izračunavanje plate referenta
	public double izracunajPlatu() {
		return brojRadnihSati * cenaRadnogSata + bonus;
	}
}
