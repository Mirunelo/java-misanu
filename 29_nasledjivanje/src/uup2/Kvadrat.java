package uup2;

public class Kvadrat extends Oblik {
	
	double stranica;
	
	public Kvadrat (double stranica) {
		this.stranica = stranica;
	}

	@Override
	public double uzmiPovrsinu() {
		povrsina = stranica * stranica;
		return povrsina;
	}

	
	
}
