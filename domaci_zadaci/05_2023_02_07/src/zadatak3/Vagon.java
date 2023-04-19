package zadatak3;

public class Vagon extends Vozilo {
	
	double teret;
	
	Vagon(double t){
		super('V', t);
		teret = 0;
	}

	public void dodajTeret(double teret) {
		this.teret += teret;
	}

	@Override
	double ukupnaTezina() {
		return t + teret;
	}

	
	
}
