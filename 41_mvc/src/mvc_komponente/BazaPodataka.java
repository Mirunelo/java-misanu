// MODEL (BAZA Zaposlenih)
package mvc_komponente;

import java.util.ArrayList;

public class BazaPodataka {

	private ArrayList<Zaposleni> zaposleni;

	public BazaPodataka() {
		this.zaposleni = new ArrayList<>();
		bazaPodataka();
	}

	private void bazaPodataka() {
		Zaposleni[] model = new Zaposleni[6];
		String[] imena = { "Žika", "Pera", "Laza", "Jovana", "Zorica", "Milica" };
		int[] id = { 11111111, 22222222, 33333333, 44444444, 55555555, 66666666 };
		String[] odeljenja = { "Magacin", "Maloprodaja", "Uprava", "Magacin", "Maloprodaja", "Komercijala" };
		for (int i = 0; i < 6; i++) {
			model[i] = new Zaposleni();
			model[i].setIme(imena[i]);
			model[i].setId(id[i]);
			model[i].setOdeljenje(odeljenja[i]);
			zaposleni.add(model[i]);
		}
	}

	public Zaposleni getZaposleni(int id) {
		Zaposleni z = null;
		for (Zaposleni e : zaposleni) {
			if (e.getId() == id)
				z = e;
		}
		return z;
	}

}