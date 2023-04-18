package canak.mirko;
public class Primer12 {
	public static void main(String[] args) {
		// m - trocifreni broj
		// s - cifra stotice broja
		// d - cifra desetice broja
		// j - cifra jedinice broja
		int m, s, d, j;
		
		System.out.println("Armstrongovi brojevi od 100 do 999 su: ");
		
		for (s = 1; s <= 9; s++)
			for (d = 0; d <= 9; d++)
				for (j = 0; j <= 9; j++) {
			
			// Traženje Armstrongovog broja
			m = 100 * s + 10 * d + j;
			if (m == Math.pow(s, 3) + Math.pow(d, 3) + Math.pow(j, 3))
				System.out.println(m);
		}
	}
}