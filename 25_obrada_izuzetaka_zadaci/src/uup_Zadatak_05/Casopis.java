package uup_Zadatak_05;

public class Casopis {

	/* Deklarisanje podataka */
	String naslov;
	String izdavac;
	int brojCasopisa;
	double cena;

	/* Metoda za pristup podatku naslov */
	public String getNaslov() {
		return naslov;
	}

	/* Metoda za postavljanje podatka naslov */
	public void setNaslov(String naslov) throws IzuzetakCasopis {
		if (naslov.isBlank() || naslov.isEmpty())
			throw new IzuzetakCasopis("Naslov časopisa ne sme biti null");
		this.naslov = naslov;
	}

	/* Metoda za pristup podatku izdavač */
	public String getIzdavac() {
		return izdavac;
	}

	/* Metoda za postavljanje podatka izdavač */
	public void setIzdavac(String izdavac) throws IzuzetakCasopis {
		if (izdavac.isBlank() || izdavac.isEmpty())
			throw new IzuzetakCasopis("Izdavač časopisa ne sme biti null");
		this.izdavac = izdavac;
	}

	/* Metoda za pristup podatku broj časopisa */
	public int getBrojCasopisa() {
		return brojCasopisa;
	}

	/* Metoda za postavljanje podatka broj časopisa */
	public void setBrojCasopisa(int brojCasopisa) {
		this.brojCasopisa = brojCasopisa;
	}

	/* Metoda za pristup podatku cena */
	public double getCena() {
		return cena;
	}

	/* Metoda za postavljanje podatka cena */
	public void setCena(double cena) throws IzuzetakCasopis {
		if (cena <= 0)
			throw new IzuzetakCasopis("Cena mora biti veća od nule");
		this.cena = cena;
	}

	/* Metoda za ispisivanje podataka o časopisu */
	public String toString() {
		return "Naslov: " + naslov + "\nIzdavač: " + izdavac + "\nBroj časopisa: " + brojCasopisa + "\nCena: " + cena;
	}
}