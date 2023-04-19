package zadatak3final;

public class Lokomotiva extends Vozilo {

	// Lokomotiva je vozilo zadate vučne sile
	private double vucnaSila;

	// Konstruktor
	public Lokomotiva(double tezina, double vucnaSila) {
		super(tezina);
		this.vucnaSila = vucnaSila;
	}

	// Može da se pribavi vučna sila
	@Override
	public double vucnaSila() {
		return vucnaSila;
	}

	// Može da se pribavi ukupna težina
	@Override
	public double ukupnaTezina() {
		return tezina;
	}

	// Obavezna implementacija abstraktne metode
	@Override
	void setTeret(Teret t) {
		// Lokomotiva ne prima teret
	}

	// Tekstualni opis lokomotive
	public String Opis() {
		return "L  ->  (" + ukupnaTezina() + "  | " + vucnaSila + ")\n";
	}

}
