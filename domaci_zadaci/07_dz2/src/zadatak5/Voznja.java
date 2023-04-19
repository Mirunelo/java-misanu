package zadatak5;

public class Voznja {
	
	private int kapacitet;
	private Etapa[] nizEtapa;
	private int brojac;
	
	public Voznja() {
		kapacitet = 10;
		nizEtapa = new Etapa[kapacitet];
		brojac = 0;
	}
	
	public Voznja(int k) {
		kapacitet = k;
		nizEtapa = new Etapa[kapacitet];
		brojac = 0;
	}

	public void dodajEtapu(double duzina, double brzina) {
		try {
			nizEtapa[brojac] = new Etapa(duzina, brzina);
			brojac++;
			System.out.println("Etapa je dodata.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Greška! Etapa se ne može dodati. Niz je prepunjen!");
		}
	}
	
	public double ukupnaDuzinaVoznje() {
		double duzinaVoznje = 0;
		for(Etapa e : nizEtapa)
			duzinaVoznje += e.getDuzina();
		return duzinaVoznje;
	}
	
	public double ukupnoTrajanjeVoznje() {
		double trajanjeVoznje = 0;
		for(Etapa e : nizEtapa)
			trajanjeVoznje += e.vremeKretanja();
		return trajanjeVoznje;
	}
	
	public double srednjaBrzinaVoznje() {
		double srednjaBrzina = 0;
		for(Etapa e : nizEtapa)
			srednjaBrzina += e.getBrzina();
		srednjaBrzina = srednjaBrzina / brojac;
		return srednjaBrzina;
	}
	
}
