package zadatak_1;

public class Kanta extends Valjak {

	// Zadata popunjenost (zapremina tecnosti)
	private double popunjenost;
	
	// Stvaranje kante kroz konstruktor
	Kanta (double r, double h, double pop){
		super(r, h);
		popunjenost = pop;		
	}

	// Dohvatanje kolicine tecnosti u kanti (zapremine)
	public double getPopunjenost() {
		return popunjenost;
	}

	// Postavljanje popunjenosti kante (zapremine)
	public void setPopunjenost(double popunjenost) {
		this.popunjenost = popunjenost;
	}
	
	public double moguDoliti() {
		return zapremina(getR(), getH()) - getPopunjenost();
	}
	
	// Ispitivanje da li je kanta skroz puna ili je skroz prazna
	public void ispitivanjeKante() {
		if(getPopunjenost() == 0)
			System.out.println("Kanta je potpuno prazna");
		else if(getPopunjenost() == zapremina(getR(), getH()))
			System.out.println("Kanta je potpuno puna");
	}
	
	public void dolivanjeTecnosti(double dolivanje) {
		popunjenost += dolivanje;
		if (getPopunjenost()>zapremina(getR(), getH())) {
			System.out.println("Prosuce se " + (getPopunjenost()-zapremina(getR(), getH())) );
		}
		else {
			System.out.println("U kanti je sad " + getPopunjenost() + " vode.");
		}
	}
	
	public void odlivanjeTecnosti(double odlivanje) {
		popunjenost -= odlivanje;
		if(getPopunjenost() < 0) {
			popunjenost = 0;
			System.out.println("U kanti nije bilo " + odlivanje + " tecnosti. Kanta je prazna.");
		}
		else 
			System.out.println("U kanti je nakon odlivanja " + odlivanje + " ostalo " + getPopunjenost() + " tecnosti.");
	}
	
	public void presipanjeTecnosti(Kanta k, double presip) {
		odlivanjeTecnosti(presip);
		k.dolivanjeTecnosti(presip);
		
	}

	@Override
	public String opis() {
		return "Kanta je " + super.opis() + "\nNapunjena je sa " + getPopunjenost() + " tecnosti.";
	}
	
}
