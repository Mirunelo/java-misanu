package most;

public class Putnicko extends Vozilo{
	
	private int brPutnika;
	private double prosecnaTezina;
	
	public Putnicko(int br, double pt) {
		super('P');
		brPutnika = br;
		prosecnaTezina = pt;
	}

	@Override
	double tezinaTereta() {
		return brPutnika * prosecnaTezina;
	}

	@Override
	String opis() {
		return "Putničko vozilo prevozi " + brPutnika + " putnika prosečne težine " + prosecnaTezina + ". " + super.opis();
	}

	
	
}
