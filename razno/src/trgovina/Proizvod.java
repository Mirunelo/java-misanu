package trgovina;

public abstract class Proizvod implements BarCode {

	private String naziv;
	private long barKod;
	private double osnovnaCena;
	private final double PDV = 20;

	Proizvod(String naziv, double osnovnaCena) {
		this.naziv = naziv;
		this.barKod = getBarCode();
		this.osnovnaCena = osnovnaCena;
	}

	double cena() {
		return osnovnaCena * (1 + PDV / 100);
	}

	String opis() {
		return "Naziv artikla: " + naziv + "\nBar kod: " + barKod + "\nOsnovna cena: " + osnovnaCena
				+ " din\nCena uvećana za iznos PDV " + PDV + "%";
	}

}
