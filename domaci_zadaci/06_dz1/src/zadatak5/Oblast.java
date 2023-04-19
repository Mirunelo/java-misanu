package zadatak5;

public abstract class Oblast extends TJ {
	
	protected TJ[] jedinice;
	protected int brJedinica;
	private static int brGreske = 0;

	// Konstruktor
	public Oblast(String naziv, int kapacitet) {
		super(naziv);
		jedinice = new TJ[kapacitet];
		brJedinica = 0;
	}
	
	// Dohvatanje broja stanovnika
	public int getBrStanovnika() {
		int ukupnoStanovnika = 0;
		for (int i = 0; i < jedinice.length; i++) {
			ukupnoStanovnika += jedinice[i].getBrStanovnika();
		}
		return ukupnoStanovnika;
	}
	
	// Apstraktna metoda za proveru može li se dodati TJ
	public abstract boolean mozeSeDodati(TJ jedinica);
	
	// Apstraktna metoda za dohvatanje površine
	public abstract int getPovrsinu();
	
	// Metoda za dohvatanje kapaciteta
	public int getKapacitet() {
		return jedinice.length;
	}
	
	// Dodavanje teritorijalne jedinice u oblast
	public void addTJ(TJ jedinica) throws Exception {
		try {
			if (brJedinica >= jedinice.length) {
				brGreske++;
				throw new Exception("Greška " + brGreske + "! -> Kapacitet oblasti " + this.getOznaka() + ":\"" + naziv + "\" je prekoračen, teritorijalna jedinica " + jedinica.getOznaka() + ":\"" + jedinica.naziv + "\" se ne može dodati.");
			}
			
			if (mozeSeDodati(jedinica)) {
				jedinice[brJedinica++] = jedinica;
			} else {
				brGreske++;
				throw new Exception("Greška " + brGreske + "! -> U oblast " + this.getOznaka() + ":\"" + naziv + "\" se ne može dodati teritorijalna jedinica " + jedinica.getOznaka() + ":\"" + jedinica.naziv + "\"");
			}
		}catch(Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

	// Opis
	@Override
	public String opis() {
		StringBuilder izlaz = new StringBuilder();
		
		for (int i = 0; i < brJedinica; i++) {
			izlaz.append(jedinice[i].opis() + "\n");
			
		}
		
		izlaz.append(super.opis()).append(":").append(getPovrsinu());


		return izlaz.toString() + "\n---------------------------";
	}

}
