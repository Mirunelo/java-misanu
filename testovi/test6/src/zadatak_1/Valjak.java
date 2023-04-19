package zadatak_1;

public class Valjak {

	private double r;
	private double h;
	
	Valjak(double r, double h){
		this.r = r;
		this.h = h;
	}

	// Dohvatanje poluprecnika
	public double getR() {
		return r;
	}
	
	// Dohvatanje visine
	public double getH() {
		return h;
	}

	// Stvaranje valjka kroz setere
	public void setR(double r) {
		this.r = r;
	}
	public void setH(double h) {
		this.h = h;
	}
	
	public double zapremina(double r, double h) {
		return Math.PI * r * r * h;
	}
	
	public String opis() {
		return " valjak poluprecnika baze " + r + " i visine " + h + " zapremine " + zapremina(r, h) + ". ";
	}
	
}
