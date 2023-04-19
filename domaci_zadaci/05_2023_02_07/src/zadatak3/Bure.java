package zadatak3;

import java.text.DecimalFormat;

public class Bure extends Teret {

	DecimalFormat df = new DecimalFormat("#.###");
	
	// Bure je valjak definisan poluprečnikom osnove i visinom
	private double r, h;
	
	// Parametrizovani konstruktor za inicijalizaciju bureta
	public Bure(double st, double r, double h) {
		super(st, 'B');
		this.r = r;
		this.h = h;
	}

	// Metoda za određivanje zapremine bureta
	@Override
	double zapremina() {
		return r * r * h * Math.PI;
	}
	
}
