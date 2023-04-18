package canak_mirko;

public class PogresanUzrastIzuzetak extends Throwable {

	private int uzrast;

	PogresanUzrastIzuzetak(int a) {
		uzrast = a;
	}

	public String uTekst() {
		return "Uzrast: " + uzrast + " nije dozvoljen uzrast.";

	}

}
