package canak.mirko;
public class Primer13Prof1 {
	public static void main(String[] args) {
		// m - trocifreni broj
		// s - cifra stotice broja
		// d - cifra desetice broja
		// j - cifra jedinice broja
		int m, s, d, j;
		System.out.println("Celi trocifreni brojevi deljivi sa 2 i 3 su: ");
		for (s = 1; s <= 9; s++)
			for (d = 0; d <= 9; d++)
				for (j = 0; j <= 9; j++) {
					m = 100 * s + 10 * d + j;
					if (m % 2 == 0 && m % 3 == 0)
						System.out.println(m);
		}
	}
}