package zadatak3;

import java.text.DecimalFormat;

public abstract class Vozilo {

	protected double t;
	protected double vucnaF;
	protected char oznaka;
	
	Vozilo(char oznaka, double t){
		this.t = t;
		this.oznaka = oznaka;
	}
	
	Vozilo(char oznaka, double t, double vucnaF){
		this.t = t;
		this.vucnaF = vucnaF;
		this.oznaka = oznaka;
	}
	

	// Kad vučna sila ne bi bila zadata apstraktna metoda bi forsirala njeno određivanje
	// implementiranjem metode u klasama naslednicama (zakomentarisaću)
	// abstract double vucnaF();
	
	// apstraktna metoda za određivanje ukupne težine vozila
	abstract double ukupnaTezina();
	
	public String opisVozila() {
		DecimalFormat df = new DecimalFormat("#.###");
		return "  " + oznaka + "\t ( " + df.format(ukupnaTezina()) + " | " + vucnaF + " )";
	}
	
}
