package zadatak3;

import java.util.ArrayList;

public class Ulica extends Saobracajnica{
	
	private StambenaZgrada[] ulica;
	private ArrayList<Ulica> ulice = new ArrayList<Ulica>();

	public Ulica() {
		super("", 0);
		ulice.add(this);
	}
	
	public Ulica(String ime, int duzina, int br) {
		super(ime, duzina);
		ulica = new StambenaZgrada[br + 1];
	}

	public ArrayList<Ulica> getUlice() {
		return ulice;
	}

	public void dodajUlicu(String ime, int duzina, int br) {
		boolean test = true;
		for(Ulica e : ulice)
			if(e.getIme().equals(ime)) {
				System.err.println("Ulica " + ime + " već postoji. Ulica ne može da se duplira!");
				test = false;
				break;
			}
		
		if(test) {
			ulice.add(new Ulica(ime, duzina, br));
			System.out.println("Ulica " + ime + " je uspešno pridodata naselju.");
		}
		
	}
	
	public void dodajZgradu(int adresniBr, double povrsina, int spratovi, int stanovi) {
		try {
			if(ulica[adresniBr] == null) {
				ulica[adresniBr] = new StambenaZgrada(povrsina, spratovi, stanovi);
				System.out.println("Stambena zgrada broj " + adresniBr + " je dodata.");
			}
			else
				System.err.println("Pod zadatim adresnim brojem " + adresniBr + " već postoji zgrada.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Stambena zgrada broj " + adresniBr + " se ne može dodati. Nema slobodnih adresnih brojeva!");
		}
	}
	
	public int ukupanBrZgrada() {
		int brojac = 0;
		for(StambenaZgrada e : ulica)
			if(e != null)
				brojac++;
		return brojac;
	}
	
	public double ukupnaPovrsinaSvihStanova() {
		double ukupnaPovrsinaStanbenihJedinica = 0;
		for(StambenaZgrada e : ulica)
			if(e != null)
				ukupnaPovrsinaStanbenihJedinica += (e.prosecnaPovrsinaStanova() * e.ukupanBrStanova());
		return ukupnaPovrsinaStanbenihJedinica;
	}
	
	public String opis() {
		String opis = "";
		for(int i = 1; i < ulice.size(); i++) {
			opis += ulice.get(i).opisSaobracajnice() + "\n";
			for(StambenaZgrada e : ulice.get(i).ulica) {
				if(e != null)
					opis += e.opisZgrade() + "\n";				
			}
		}

		return opis;
		
	}
	
}
