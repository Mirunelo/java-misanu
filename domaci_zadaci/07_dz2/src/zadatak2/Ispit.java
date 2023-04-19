package zadatak2;

public class Ispit {
	
	private String sifra;
	private Ocena ocena;
	
	public Ispit(String s, int o) {
		sifra = s.substring(0, Math.min(s.length(), 6));
		ocena = new Ocena(o);
	}

	public String getSifra() {
		return sifra;
	}

	public Ocena getOcena() {
		return ocena;
	}
	
	public String opisIspita() {
		return getSifra() + ":" + ocena.opisOcene();
	}
	
}
