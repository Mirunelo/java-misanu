package trgovina;

import java.text.DecimalFormat;

public class Cokolada extends Proizvod {

	private int tezina;

	Cokolada(int tezina, double osnovnaCena) {
		super("Čokolada", osnovnaCena);
		this.tezina = tezina;
	}

	DecimalFormat df = new DecimalFormat("#.##");
	
	@Override
	String opis() {
		return super.opis() + ": " + df.format(cena()) + " din\nNetto težina: " + tezina + " g";
	}

}
