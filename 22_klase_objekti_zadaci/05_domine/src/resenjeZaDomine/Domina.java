package resenjeZaDomine;

public class Domina {
	private int a, b;

	/* konstruktor */
	Domina(int a, int b) {
		this.a = a;
		this.b = b;
	}

	/* Geteri */
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	/* Metoda okreće dominu */
	public Domina okreni() {
		int p = a;
		a = b;
		b = p;
		return this;
	}
	
	/* Metoda oduzmi domine */
	public Domina oduzmi(Domina d) {
		a = Math.abs(a - d.a);
		b = Math.abs(b - d.b);
		return this;
	}

	/* Metoda proverava da li su dve domine identične */
	public boolean ista(Domina d) {
		return a == d.a && b == d.b || b == d.a && a == d.b;
	}

	/* Metoda vraća String koji se koristi prilikom štampanja izgleda domine */
	public String tekstualniOpis() {
		return "(" + a + ", " + b + ")";
	}

}
