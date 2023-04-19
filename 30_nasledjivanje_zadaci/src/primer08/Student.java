package primer08;

public class Student extends Osoba {
	// Deklarisanje podataka
	String ispit;

	// Metoda za pristup podatku ispit
	public String getIspit() {
		return ispit;
	}

	// Metoda za postavljanje podatka ispit
	public void setIspit(String ispit) {
		this.ispit = ispit;
	}
}
