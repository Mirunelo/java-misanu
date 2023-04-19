package most;

public class Teretno extends Vozilo{
	
	double teret;
	
	public Teretno (double t) {
		super('T');
		teret = t;
	}

	@Override
	double tezinaTereta() {
		return teret;
	}

	@Override
	String opis() {
		return "Teretno vozilo:" + super.opis();
	}

}
