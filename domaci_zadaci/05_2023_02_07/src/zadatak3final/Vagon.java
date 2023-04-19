package zadatak3final;

import java.text.DecimalFormat;

public class Vagon extends Vozilo {

	// Prazan vagon zadatog kapaciteta
	private int kapacitet;
	private int brTereta;

	// Vagon je vozilo koje sadrži niz tereta
	private GenerickiNiz<Teret> nizTereta;
	private double ukupnaTezinaTereta;

	// Konstruktor
	public Vagon(double tezina, int kapacitet) {
		super(tezina);
		this.kapacitet = kapacitet;
		nizTereta = new GenerickiNiz<>(kapacitet);
		brTereta = 0;
		ukupnaTezinaTereta = 0;
	}

	// Dodavanje tereta pojedinačno
	public void setTeret(Teret t) {
		if (brTereta > kapacitet - 1)
			System.out.println(
					"Nema mesta za teret No." + (brTereta + 1) + " u vagonu kapaciteta " + kapacitet + " tereta.\n");
		else {
			nizTereta.set(brTereta, t);
			ukupnaTezinaTereta += nizTereta.get(brTereta++).getTezina();
		}

	}

	// Vučna sila vagona je 0
	public double vucnaSila() {
		return 0;
	}

	// Određivanje ukupne težine
	@Override
	double ukupnaTezina() {
		return tezina + ukupnaTezinaTereta;
	}

	// Tekstualni opis
	public String Opis() {
		DecimalFormat df = new DecimalFormat("#.###");
		String opis = "V  ->  (" + (df.format(ukupnaTezina()) + " | ");

		for (int i = 0; i < brTereta; i++) {
			opis += nizTereta.get(i).getOznakaVrste() + ":" + nizTereta.get(i).identifikator;

			if (i < brTereta - 1)
				opis += ", ";
		}
		opis += "]";
		return opis + "\n";
	}

}
