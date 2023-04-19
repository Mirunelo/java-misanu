package uup3_Primer1;

public class Pas extends Zivotinja {

	private String ime;
	private String rasa;

	public Pas(String ime) {
		super("pas");
		this.ime = ime;
		rasa = "bernardinac";
	}

	public Pas(String ime, String rasa) {
		super("pas");
		this.ime = ime;
		this.rasa = rasa;
	}

	public String toString() {
		return super.toString() + " " + ime + ", " + rasa + ".";
	}

}
