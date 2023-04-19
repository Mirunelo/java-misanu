package zadatak1;

public class NizZarubljenihKupa {
	
	private ZarubljenaKupa[] nizZK;
	private int brojac;
	
	// Konstruktori:
	public NizZarubljenihKupa() {
		nizZK =  new ZarubljenaKupa[5];
		brojac = 0;
	}
	
	public NizZarubljenihKupa(int i) {
		nizZK = new ZarubljenaKupa[i];
		brojac = 0;
	}
	
	// Geter kapaciteta niza
	public int kapacitetNiza() {
		return nizZK.length;
	}
	
	// Geter popunjenosti niza
	public int getBrojac() {
		return brojac;
	}

	public void setBrojacNa0() {
		this.brojac = 0;
		this.nizZK[0].resetID();
	}

	// Da li se može dodati zarubljena kupa u niz
	public boolean moguDodatiKupu() {
		boolean test = false;
		if(brojac != 5)
			test = true;
		return test;
	}
	
	// Dodaj kupu u niz
	public void dodajKupu(ZarubljenaKupa zk) {
		if(moguDodatiKupu())
			nizZK[brojac++] = zk;
		else {
			System.err.println("Niz je prepunjen!");
			System.exit(0);
		}
	}

	// Geter kupe zadatog indeksa
	public ZarubljenaKupa getNiz(int i) {
		return nizZK[i - 1];
	}
	
	// Pronađi indeks kupe najmanje zapremine
	public int indexKupeNajmanjeV() {
		double v = nizZK[0].zapreminaKupe();
		int index = 0;
		for(int i = 0; i <= brojac - 1; i++)
			if(nizZK[i].zapreminaKupe() < v) {
				v = nizZK[i].zapreminaKupe();
				index = i;
			}
		
		return index + 1;
		
	}

}
