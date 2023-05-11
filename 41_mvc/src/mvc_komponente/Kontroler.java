// CONTROLLER
package mvc_komponente;

public class Kontroler {

	// Deklarisanje promenljivih Model-a i prikaz
	private Zaposleni model;
	private Prikaz prikaz;

	// Konstruktor za inicijalizaciju
	public Kontroler(Zaposleni model, Prikaz prikaz) {
		this.model = model;
		this.prikaz = prikaz;
	}

	// Definisanje Geter-a i Seter-a
	public void setIme(String ime) {
		model.setIme(ime);
	}

	public String getIme() {
		return model.getIme();
	}

	public void setId(int id) {
		model.setId(id);
	}

	public int getId() {
		return model.getId();
	}

	public void setOdeljenje(String odeljenje) {
		model.setOdeljenje(odeljenje);
	}

	public String getOdeljenje() {
		return model.getOdeljenje();
	}

	// Metoda za prikaz promene
	public void prikazPromene() {
		prikaz.stampajZaposlenog(model.getIme(), model.getId(), model.getOdeljenje());
	}

}