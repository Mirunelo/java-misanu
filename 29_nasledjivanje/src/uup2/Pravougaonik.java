package uup2;

public class Pravougaonik extends Oblik{
	double duzina;
	double sirina;
	
	public Pravougaonik(double d, double s) {
		duzina = d;
		sirina = s;
	}
	public double uzmiPovrsinu() {
		povrsina = duzina * sirina;
		return povrsina;
	}
}
