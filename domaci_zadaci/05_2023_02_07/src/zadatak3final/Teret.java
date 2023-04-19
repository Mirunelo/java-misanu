package zadatak3final;

public abstract class Teret {

	// Teret ima specifičnu težinu, oznaku vrste i jedinstven ID
	protected int identifikator;
	private double specificnaTezina;
	private char oznakaVrste;

	// Brojač za setovanje jedinstvenog ID-a Tereta.
	private static int id = 0;

	// Konstruktor
	public Teret(double specificnaTezina, char oznakaVrste) {

		// Zadata specifična težina i oznaka vrste Teret-a
		this.specificnaTezina = specificnaTezina;
		this.oznakaVrste = oznakaVrste;

		id++;

		// Jedinstven automatski generisan celobrojni ID
		this.identifikator = id;
	}

	// Jednoslovna oznaka vrste može da se dohvati
	public char getOznakaVrste() {
		return oznakaVrste;
	}

	// Može da se odredi zapremina
	abstract double getZapremina();

	// Može da se odredi težina
	public double getTezina() {
		return specificnaTezina * getZapremina();
	}

	// Može da se sastavi tekstualni opis za oznakom vrste i ID-om
	public String getOpis() {
		return "[" + getOznakaVrste() + ":" + identifikator + "]";
	}

}
