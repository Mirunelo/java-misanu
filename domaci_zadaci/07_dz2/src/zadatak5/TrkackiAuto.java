package zadatak5;

public class TrkackiAuto extends Vozilo{
	
	private GenerickiNiz<Voznja> nizVoznji;
	private int brojac;
	private int brVoznji;
	
	public TrkackiAuto(double tezina) {
		super("Trkački Automobil", tezina);
		brVoznji = 10;
		nizVoznji = new GenerickiNiz<Voznja>(brVoznji);
		nizVoznji.set(0, new Voznja(100));
		brojac = 1;
	}
	
	public TrkackiAuto(double tezina, int brVoznji) {
		super("Trkački Automobil", tezina);
		this.brVoznji = brVoznji;
		nizVoznji = new GenerickiNiz<Voznja>(this.brVoznji);
		brojac = 0;
	}

	@Override
	public double ukupnaTezinaVozila() {
		return getSopstvenaTezina();
	}
	
	public void dodajVoznju(int brEtapa) {
		if(brojac < brVoznji ) {
			nizVoznji.set(brojac, new Voznja(brEtapa));
			brojac++;
		}
		else
			System.err.println("Greška! Ne možete dodati vožnju. Kapacitet je prekoračen.");
	}
	
	public void dodajEtapu(double duzina, double brzina) {
		nizVoznji.get(brojac - 1).dodajEtapu(duzina, brzina);
	}
	
	public int najbrzaVoznja() {
		int maxBrzaVoznja = 0;
		double maxBrzina = 0;
		for(int i = 0; i < brojac; i++) {
			if(maxBrzina < nizVoznji.get(i).srednjaBrzinaVoznje()) {
				maxBrzina = nizVoznji.get(i).srednjaBrzinaVoznje();
				maxBrzaVoznja = i;
			}
		}
		
		return maxBrzaVoznja;

	}

	@Override
	public String opis() {
		int max = najbrzaVoznja();
		double duzinaVoznje = nizVoznji.get(max).ukupnaDuzinaVoznje();
		double ukupnoTrajanjeVoznje = nizVoznji.get(max).ukupnoTrajanjeVoznje();
		int sec = (int)(ukupnoTrajanjeVoznje * 3600);
		int sat = sec / 3600;
		int min = (sec % 3600) / 60;
		sec %= 60;
		return super.opis() + "\n[ dužina vožnje sa najvećom srednjom brzinom: " + duzinaVoznje + " km ]\n[ ukupno trajanje vožnje sa najvećom srednjom brzinom: " + sat + "H " + min + "' " + sec + "\"]";
	}

	
	
}
