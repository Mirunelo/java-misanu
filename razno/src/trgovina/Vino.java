package trgovina;

import java.text.DecimalFormat;

public class Vino extends Proizvod {

	private double zapreminaBoce;
	private final double AKCIZA = 10;

	Vino(double zapreminaBoce, double osnovnaCena) {
		super("Vino", osnovnaCena);
		this.zapreminaBoce = zapreminaBoce;
	}

	DecimalFormat df = new DecimalFormat("#.##");

	@Override
	double cena() {
		return super.cena() * (1 + AKCIZA / 100);
	}

	@Override
	String opis() {
		return super.opis() + " i akcize " + AKCIZA + "%: " + df.format(cena()) + " din\nBoca: " + zapreminaBoce + " l";
	}

}
