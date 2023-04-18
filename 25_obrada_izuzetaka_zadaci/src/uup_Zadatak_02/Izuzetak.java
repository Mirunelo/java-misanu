package uup_Zadatak_02;

public class Izuzetak extends Exception {
	
	/* Indeks studenta koji dovodi do izuzetka */
	private int indeksStudenta;

	/* Podrazumevani konstruktor */
	public Izuzetak() {
		indeksStudenta = -1;
	}

	public Izuzetak(int indeksStudenta) {
		super("Desio se izuzetak: broj indeksa studenta je veci od 100");
		this.indeksStudenta = indeksStudenta;
	}

	/* Uzimanje indeksa studenta za koji se desila greška */
	public int getIndeksStudenta() {
		return indeksStudenta;
	}
}