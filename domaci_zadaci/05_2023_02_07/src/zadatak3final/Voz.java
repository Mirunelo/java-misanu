package zadatak3final;

import java.text.DecimalFormat;

public class Voz {

	// Prazan voz zadatog kapaciteta
	private int kapacitet;
	// Voz se sastoji od niz[]-a vozila
	private GenerickiNiz<Vozilo> nizVozila;
	private int brVozila;
	private double ukupnaTezinaVoza;
	private double ukupnaVucnaSila;

	// Konstruktor
	public Voz(int kapacitet) {
		// Ostavljam mesto za dodatni vagon
		this.kapacitet = kapacitet + 1;

		// Voz kao niz šinskih vozila zadatog broja
		nizVozila = new GenerickiNiz<>(this.kapacitet);
		brVozila = 0;
		ukupnaTezinaVoza = 0;
		ukupnaVucnaSila = 0;
	}

	// Može da se dohvati broj vozila u vozu
	public int getBrVozila() {
		return nizVozila.brElemenata();
	}

	// Dodavanje vozila pojedinačno
	public void setVoz(Vozilo v) {
		nizVozila.set(brVozila, v);
		ukupnaTezinaVoza += nizVozila.get(brVozila).ukupnaTezina();
		ukupnaVucnaSila += nizVozila.get(brVozila++).vucnaSila();
	}

	// Opis Voza
	public String Opis() {
		DecimalFormat df = new DecimalFormat("#.###");
		String opis = "";
		if (ukupnaTezinaVoza > ukupnaVucnaSila)
			opis += "\nVoz maksimalne vučne sile " + df.format(ukupnaVucnaSila) + " je preopterećen sa "
					+ df.format(ukupnaTezinaVoza) + " !!!";
		else {
			System.out.println("Oznaka (Ukupna | vučna sila)\nvozila (težina | ID tereta )");
			System.out.println("=============================");
			for (int i = 0; i < brVozila; i++)
				opis += nizVozila.get(i).Opis();
		}
		return opis;
	}

}
