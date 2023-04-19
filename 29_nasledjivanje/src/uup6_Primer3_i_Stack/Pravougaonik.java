package uup6_Primer3_i_Stack;

public class Pravougaonik extends Oblik {
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
