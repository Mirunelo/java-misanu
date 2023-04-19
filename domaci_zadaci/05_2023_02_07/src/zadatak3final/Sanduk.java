package zadatak3final;

public class Sanduk extends Teret {

	// Sanduk(kvadar) definisan je dužinama ivica
	private double duzina, sirina, visina;

	// Konstruktor
	public Sanduk(double specificnaTezina, double duzina, double sirina, double visina) {
		super(specificnaTezina, 'S');
		this.duzina = duzina;
		this.sirina = sirina;
		this.visina = visina;
	}

	// Zapremina sanduka(kvadra)
	@Override
	double getZapremina() {
		return duzina * sirina * visina;
	}

}
