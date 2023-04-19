package uup9_Primer6;

public class Osoba {
	
	// Deklarisanje i inicijalizacija podataka ime i prezime
	String ime = "N";
	String prezime = "N";
	String maticniBroj;
	
	// Metoda za pristup podatku ime
	public String getIme() {
		return ime;
		}
	
	// Metoda za postavljanje podatka ime
	public void setIme(String ime) {
		if (ime.isBlank() || ime.isEmpty())
			System.out.println("Greška: vrednost podatka ime ne sme biti null.");
		else this.ime = ime;
	}
	
	// Metoda za pristup podatku prezime
	public String getPrezime() {
		return prezime;
	}
	
	//Metoda za postavljanje podatka prezime
	public void setPrezime(String prezime) {
		if (prezime.isBlank() || prezime.isEmpty())
			System.out.println("Greška: vrednost podatka prezime ne sme biti null.");
		else this.prezime = prezime;
	}
	
	//Metoda za pristup podatku maticni broj
	public String getMaticniBroj() {
		return maticniBroj;
	}
	
	//Metoda za postavljanje podatka maticniBroj
	public void setMaticniBroj(String maticniBroj) {
		if (maticniBroj.isBlank() || maticniBroj.isEmpty())
			System.out.println("Greška: vrednost podatka matični broj ne sme biti null.");
		else this.maticniBroj = maticniBroj;
	}

}