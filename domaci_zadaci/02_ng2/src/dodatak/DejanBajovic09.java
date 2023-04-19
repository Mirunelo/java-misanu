package dodatak;

import java.util.Scanner;

public class DejanBajovic09 {
	
    public static void main(String[] args) {
	/* Deklarisanje promenljivih */
	double funcF = 0d, funcG = 0d;

	/* Kreiranje objekta klase Scanner */
	Scanner ulaz = new Scanner(System.in);

	/* Unos podataka - n, F(0), G(0) */
	System.out.print("Unesite vrednost za n: ");
	int n = ulaz.nextInt();
	System.out.print("F(0) = ");
	double f = ulaz.nextInt();
	System.out.print("G(0) = ");
	double g = ulaz.nextInt();

	/* Obrada podataka i računanje funkcija F i G */
	for (int i = 0; i < n; i++) {
	    funcF = f * g + 3 * i - 1;
	    funcG = i * i * f + 2 * g;
	    f = funcF;
	    g = funcG;
	}

	/* Štampanje vrednosti F(n) */
	System.out.println("F(" + n + ") = " + funcF);
	ulaz.close();

	}

}
