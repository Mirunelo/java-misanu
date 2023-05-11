// MODEL (Zaposleni)
package mvc_komponente;

public class Zaposleni {

	// Deklarisanje promenljivih
	private String ime;
	private int id;
	private String odeljenje;

	// Definisanje Geter-a i Seter-a
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getOdeljenje() {
		return odeljenje;
	}

	public void setOdeljenje(String odeljenje) {
		this.odeljenje = odeljenje;
	}

}