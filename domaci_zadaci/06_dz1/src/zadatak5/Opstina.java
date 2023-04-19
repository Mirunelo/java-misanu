package zadatak5;

public class Opstina extends Oblast {
	
	private int povrsina;

	// Konstruktor
	public Opstina(String naziv, int kapacitet, int povrsina) {
		super(naziv, kapacitet);
		this.povrsina = povrsina;
	}

	// Provera da li se može dodati još neka jedinica
	public boolean mozeSeDodati(TJ jedinica) {
		return jedinica instanceof Naselje;
	}

	// Metoda za dohvatanje oznake
	public char getOznaka() {
		return 'O';
	}

	// Metoda za dohvatanje površine
	public int getPovrsinu() {
		return povrsina;
	}


}
