package canak_mirko;

public class Primer10 {
	/* Definisanje rekurzivne funkcije */
	public static void hanoj(char a, char b, char c, int n) {
		if (n > 0) {
			hanoj(a, c, b, n - 1);
			System.out.println(a + " -> " + b);
			hanoj(c, b, a, n - 1);
		}
	}

	public static void main(String[] args) {
		hanoj('A', 'B', 'C', 4);
		/* Za slučaj 4 diska. */
	}
}