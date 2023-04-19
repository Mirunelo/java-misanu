package zadatak3final;

public class Bure extends Teret {

	// Bure(valjak) je definisano poluprečnikom baze i visinom
	private double poluprecnik, visina;

	// Konstruktor
	public Bure(double specificnaTezina, double poluprecnik, double visina) {
		super(specificnaTezina, 'B');
		this.poluprecnik = poluprecnik;
		this.visina = visina;
	}

	// Set-uj visinu
	public void setVisina(double visina) {
		this.visina = visina;
	}

	// Zapremina bureta(valjka)
	@Override
	double getZapremina() {
		return Math.pow(poluprecnik, 2) * visina * Math.PI;
	}

}
