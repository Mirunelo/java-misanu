package zadatak3final;

public abstract class Vozilo {

	// Vozilo ima sopstvenu težinu
	protected double tezina;

	// Konstruktor
	public Vozilo(double tezina) {
		this.tezina = tezina;
	}

	// Može da se odredi ukupna težina
	abstract double ukupnaTezina();

	// Može da se odredi vučna sila vozila
	public abstract double vucnaSila();

	// Metoda omogućava utovar tereta u Vagon-e
	abstract void setTeret(Teret t);

	// Opis vozila
	abstract String Opis();

}
