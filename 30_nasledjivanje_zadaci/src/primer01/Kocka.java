package primer01;

public class Kocka extends GeometrijskoTelo {

	// Deklarisanje podatka stranica
	double stranica;

	// Parametrizovan konstruktor
	public Kocka(double stranica) {
		if (stranica > 0.0)
			this.stranica = stranica;
		else
			System.out.println("Greška: vrednost podatka stranica mora biti veća od 0.");
	}

	// Metoda za izračunavanje površine kocke
	public double izracunajPovrsinu() {
		return stranica * stranica * 6;
	}

	// Metoda za izračunavanje zapremine kocke
	public double izracunajZapreminu() {
		return stranica * stranica * stranica;
	}
}
