package primer04;

public class Pravougaonik extends Figura {
	/* Parametrizovan konstruktor */
	Pravougaonik(double duzina, double sirina) {
		super(duzina, sirina);
	}

	/* Metoda za izračunavanje obima pravougaonika */
	double obim() {
		return 2 * xRef + 2 * yRef;
	}

	/* Metoda za izračunavanje površine pravougaonika */
	double povrsina() {
		return xRef * yRef;
	}
}