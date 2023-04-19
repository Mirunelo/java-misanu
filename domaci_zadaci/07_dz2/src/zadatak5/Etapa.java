package zadatak5;

public class Etapa {
	
	private double duzina;
	private double brzina;
	
	public Etapa(double duzina, double brzina) {
		this.duzina = duzina;
		this.brzina = brzina;
	}

	public double getDuzina() {
		return duzina;
	}

	public double getBrzina() {
		return brzina;
	}
	
	public double vremeKretanja() {
		return getDuzina() / getBrzina();
	}

}
