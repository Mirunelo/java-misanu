package uup6_Primer3_i_Stack;

public class Kvadrat extends Oblik {

	double stranica;

	Kvadrat(double stranica) {
		this.stranica = stranica;
	}

	public double uzmiPovrsinu() {
		povrsina = stranica * stranica;
		return povrsina;
	}

}
