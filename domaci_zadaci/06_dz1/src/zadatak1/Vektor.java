package zadatak1;

public class Vektor {
	
	private double [] vektor;
	private int index0 = 1;
	private int indexN = 10;
	
	Vektor(){
		vektor = new double[indexN + 1];
	}
	
	Vektor(int n) {
		this.indexN = n;
		vektor = new double[indexN + 1];
	}
	
	Vektor(int o, int n) {
		this.index0 = o;
		this.indexN = n;
		vektor = new double[indexN + 1];
	}

	public double getKomponenta(int i) {
		return vektor[i];
	}

	public void setKomponenta(int i, double v) {
		vektor[i] = v;
	}

	public int getIndex0() {
		return index0;
	}

	public int getIndexN() {
		return indexN;
	}

	public double skalarniProizvod(Vektor v) {
		double skalar = 0;
		int min = this.index0;
		int max = this.indexN;
		if (v.index0 > min)
			min = v.index0;
		if (v.indexN < max)
			max = v.indexN;
		for (int i = min; i <= max; i++) {
			skalar += vektor[i] * v.vektor[i];
		}
		return skalar;
		
	}
	
}
