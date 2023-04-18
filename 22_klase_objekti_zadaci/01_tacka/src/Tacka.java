
public class Tacka {

	private double x, y;

	/* Konstruktor */
	Tacka(double x, double yy) { /* (2, 5) */
		this.x = x;
		y = yy;
	}

	/* geter (uzimaju, tj. "dohvataju") vrednosti za koordinate */
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	/* Konverzija u String ispisa */
	public String ispisi() {
		return "(" + x + ", " + y + ")";
	}

}
