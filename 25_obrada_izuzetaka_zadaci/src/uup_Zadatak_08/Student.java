package uup_Zadatak_08;

public class Student {

	/* Deklarisanje podataka */
	String imePrezime;
	int brojIndeksa;
	double prosecnaOcena;

	/* Metoda za pristup podatku imePrezime */
	public String getImePrezime() {
		return imePrezime;
	}

	/* Metoda za postavljanje podatka imePrezime */
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	/* Metoda za pristup podatku brojIndeksa */
	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	/* Metoda za postavljanje podatka brojIndeksa */
	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	/* Metoda za pristup podatku prosecnaOcena */
	public double getProsecnaOcena() {
		return prosecnaOcena;
	}

	/* Metoda za postavljanje podatka prosecnaOcena */
	public void setProsecnaOcena(double prosecnaOcena) {
		if (prosecnaOcena >= 6.0 && prosecnaOcena <= 10.0)
			this.prosecnaOcena = prosecnaOcena;
	}
}