package primer08;

public class Osoba {

	// Deklarisanje i inicijalizacija podataka ime i prezime
	String ime = "N";
	String prezime = "N";
	int starost = 0;

	// Metoda za pristup podatku ime
	public String getIme() {
		return ime;
	}

	// Metoda za postavljanje podatka ime
	public void setIme(String ime) {
		if (ime.isBlank() || ime.isEmpty())
			System.out.println("Greška: vrednost podatka ime ne sme biti null.");
		else
			this.ime = ime;
	}

	// Metoda za pristup podatku prezime
	public String getPrezime() {
		return prezime;
	}

	// Metoda za postavljanje podatka prezime
	public void setPrezime(String prezime) {
		if (prezime.isBlank() || prezime.isEmpty())
			System.out.println("Greška: vrednost podatka prezime ne sme biti null.");
		else
			this.prezime = prezime;
	}

	// Metoda za pristup podatku starost
	public int getStarost() {
		return starost;
	}

	// Metoda za postavljanje podatka starost
	public void setStarost(int starost) {
		if (starost <= 0)
			System.out.println("Greška: vrednost podatka starost mora biti veća od nule.");
		else
			this.starost = starost;
	}
}
