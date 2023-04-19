package primer05;

public class Programer extends Zaposleni {
	// Deklarisanje podataka
	double bonus;
	double prekovremeniRad;

	// Parametrizovan konstruktor
	Programer(double brojRadnihSati, double cenaRadnogSata, double bonus, double prekovremeniRad) {
		this.brojRadnihSati = brojRadnihSati;
		this.cenaRadnogSata = cenaRadnogSata;
		this.bonus = bonus;
		this.prekovremeniRad = prekovremeniRad;
	}

	// Metoda za izračunavanje plate programera
	public double izracunajPlatu() {
		return brojRadnihSati * cenaRadnogSata + bonus + prekovremeniRad;
	}
}
