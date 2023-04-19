package zadatak4;

import java.text.DecimalFormat;

public class Pice extends Namirnica {
	
	private double kolicina;
	
	Pice(String ime, double kol, double e){
		super(ime);
		kolicina = kol;
		energy = e;
	}

	public double getKolicina() {
		return kolicina;
	}

	@Override
	public String opis() {
		DecimalFormat df = new DecimalFormat("#.###");
		return super.opis() + kolicina + " l, " + df.format(energetskaVrednost()) + " kJ)";
	}
	
	@Override
	double energetskaVrednost() {
		return kolicina * energy;
	}
	
}
