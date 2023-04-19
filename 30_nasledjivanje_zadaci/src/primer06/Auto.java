package primer06;

public class Auto {
	protected String naziv;
	protected String boja;
	protected int brojVrata;

	public void postaviVrednosti(String naziv, String boja, int vrata) {
		this.naziv = naziv;
		this.boja = boja;
		brojVrata = vrata;
	}

	public void ispisi() {
		System.out.println("Naziv auta: " + naziv);
		System.out.println("Boja: " + boja);
		System.out.println("Broj vrata: " + brojVrata);
	}
}
