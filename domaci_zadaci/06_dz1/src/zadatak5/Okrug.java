package zadatak5;

public class Okrug extends Oblast {

	// Konstruktor
	public Okrug(String naziv, int kapacitet) {
		super(naziv, kapacitet);
	}

	// Provera da li se jedinica sme dodati
	public boolean mozeSeDodati(TJ jedinica) {
		return jedinica instanceof Opstina;
	}

	// Metoda za dohvatanje oznake okruga
	public char getOznaka() {
		return 'K';
	}

	// Površina okruga
	public int getPovrsinu() {
		int ukupnaPovrsina = 0;
		for (int i = 0; i < brJedinica; i++) {
			TJ jedinica = jedinice[i];
			if (jedinica instanceof Opstina) {
				ukupnaPovrsina += ((Opstina) jedinica).getPovrsinu();
			}
		}
		return ukupnaPovrsina;
	}	
	
}
