package most;

public abstract class Vozilo {
	
	private double t;
	private char oznaka;
	
	public Vozilo(char oznaka){
		this.oznaka = oznaka;
	}
	
	public char getOznaka() {
		return oznaka;
	}

	public void setT(double t) {
		this.t = t;
	}

	abstract double tezinaTereta();
	
	public double ukupnaTeznaVozila() {
		return t + tezinaTereta();
	}

	String opis() {
		return "\nJednoslovna oznaka vrste vozila: " + oznaka + "\nTežina vozila: " + t + "\nTežina tereta iznosi: " + tezinaTereta() + "\n";
	}
	
}
