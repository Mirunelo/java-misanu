package canak_mirko;

public class Matrica {

	private double[][] matr; /* Deklaracija matrice */

	/* Kreiranje matrice kroz konstruktor */
	Matrica(int vrs, int kol) {
		matr = new double[vrs][kol];
	}

	public double vrs() {
		return matr.length; /* length = osobina (vraća broj redova) */
	}

	public double kol() {
		return matr[0].length; /* matr[0].length = vraća broj kolona */
	}

	public void /*Matrica*/ postavi(int v, int k, double vr) {
		matr[v][k] = vr;
		//return this;
	}

	public double dohvati(int v, int k) {
		return matr[v][k];
	}

	public String toString() {
		String s = "";
		for (int v = 0; v < matr.length; v++) {
			for (int k = 0; k < matr[0].length; k++) {
				/* System.out.print(matr[v][k] + "  "); */
				s = s + matr[v][k] + "  ";
				/* s = s + '\n'; */
			}
			/* System.out.println("\n"); */
			s = s + '\n';
		}
		return s;
	}
}
