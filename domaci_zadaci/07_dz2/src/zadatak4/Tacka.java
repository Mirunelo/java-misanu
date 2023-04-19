package zadatak4;

public class Tacka {

	private double m, x, y, z;
	private final double GAMA = 6.67E-11;
	
	public Tacka() {
		m = 1;
		x = y = z = 0;
	}
	
	public Tacka(double m, double x, double y, double z) {
		this.m = m;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// Računa rastojanje između tačaka
	public double rastojanje(Tacka t) {
		return Math.sqrt(Math.pow(x - t.x, 2) + Math.pow(y - t.y, 2) + Math.pow(z - t.z, 2));
	}

	// Računa privlačnu silu između tačaka
	public double privlacnaSila(Tacka t) {
		return GAMA * m * t.m / Math.pow(rastojanje(t), 2);
	}
	
	// Štampa opis tačke
	public String opisTacke() {
		return "( m, x, y, z )[ " + m + ", " + x + ", " + y + ", " + z + " ]";
	}
	
}
