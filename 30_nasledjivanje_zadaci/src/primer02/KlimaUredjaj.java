package primer02;

public class KlimaUredjaj extends Uredjaj {

	// Inicijalizacija podatka temperatura
	int temperatura = 18;

	// Parametrizovan konstruktor
	public KlimaUredjaj(String marka, boolean ukljucen, int temperatura) {

		// Nasledjivanje parametrizovanog konstruktora klase Uredjaj
		super(marka, ukljucen);
		if (temperatura >= 18 && temperatura <= 30)
			this.temperatura = temperatura;
		else
			System.out.println("Greška: vrednost podatka temperatura mora biti izmedju 18 i 30");
	}

	// Metoda za povecanje vrednosti podatka temperatura za jedan
	public void povecajTemperaturu() {
		if (temperatura < 30)
			temperatura++;
		else
			temperatura = 18;
	}

	// Metoda za smanjenje vrednosti podatka temperatura za jedan
	public void smanjiTemperaturu() {
		if (temperatura > 18)
			temperatura--;
		else
			temperatura = 30;
	}

	// Metoda za ispisivanje podataka o klima uredjaju
	public void ispisi() {

		// Nasledjivanje metode ispisi klase Uredjaj
		super.ispisi();
		System.out.println("Trenutna temperatura je " + temperatura);
	}
}
