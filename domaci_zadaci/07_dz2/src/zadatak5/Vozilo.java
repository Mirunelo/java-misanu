package zadatak5;

public abstract class Vozilo {
	
	private String vrsta;
	private double sopstvenaTezina;
	
	public Vozilo(String vrsta, double t) {
		this.vrsta = vrsta;
		sopstvenaTezina = t;
		System.out.println("Vozilo " + vrsta + " je uspešno kreirano.");
	}

	public String getVrsta() {
		return vrsta;
	}
	
	public double getSopstvenaTezina() {
		return sopstvenaTezina;
	}

	abstract public double ukupnaTezinaVozila();
	
	public String opis() {
		return "it<< " + getVrsta() + " ( sopstvene težine: " + sopstvenaTezina + " kg )";
	}

}
