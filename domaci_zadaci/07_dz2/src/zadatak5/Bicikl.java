package zadatak5;

public class Bicikl extends Vozilo{
	
	public Bicikl(double t) {
		super("Bicikl", t);
	}

	@Override
	public double ukupnaTezinaVozila() {
		return getSopstvenaTezina();
	}

}
