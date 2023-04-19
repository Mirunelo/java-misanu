package zadatak3;

public class Saobracajnica {

	private String ime;
	private int duzina;
	
	public Saobracajnica(String ime, int duzina) {
		this.ime = ime.substring(0, Math.min(ime.length(), 30));
		this.duzina = duzina;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String opisSaobracajnice() {
		return "it<<saobraćajnica, " + getIme() + "(" + duzina + ")";
	}
}
