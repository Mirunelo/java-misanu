package zadatak3;

public class Lokomotiva extends Vozilo {
	
	Lokomotiva (double t, double vucnaF){
		super('L', t, vucnaF);
	}

	@Override
	double ukupnaTezina() {
		return t;
	}
	
	
	
}
