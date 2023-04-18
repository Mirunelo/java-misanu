package canak_mirko;

public class Domina {
	private int a, b;

	/* konstruktor */
	Domina(int p, int q) {
		a = p;
		b = q;
	}

	public int a() {
		return a;
	}

	public int b() {
		return b;
	}

	public boolean ista(Domina d) {
		return a == d.a && b == d.b || b == d.a && a == d.b;
	}

	public Domina okreni() {
		int c = a;
		a = b;
		b = c;
		return this;
	}

	public String toString() {
		return "(" + a + ", " + b + ")";
	}

}
