package uup_Zadatak_04;

public class Motor {

	/* Deklarisanje podataka */
	String marka;
	double kubikaza;

	/* Metoda za pristup podatku marka */
	public String getMarka() {
		return marka;
	}

	/* Metoda za postavljanje podatka marka */
	public void setMarka(String marka) throws IzuzetakMotor {
		if (marka.isBlank() || marka.isEmpty())
			throw new IzuzetakMotor("Marka motora ne sme biti null");
		this.marka = marka;
	}

	/* Metoda za pristup podatku kubikaža */
	public double getKubikaza() {
		return kubikaza;
	}

	/* Metoda za postavljanje podatka kubikaža */
	public void setKubikaza(double kubikaza) throws IzuzetakMotor {
		if (kubikaza > 50 && kubikaza < 2000)
			this.kubikaza = kubikaza;
		else
			throw new IzuzetakMotor("Kubikaža mora biti veća od 50 i manja od 2000");
	}

	/* Metoda za ispisivanje podataka o motoru */
	public void ispisi() {
		System.out.println("Marka: " + marka + "\nKubikaža: " + kubikaza);
	}
}