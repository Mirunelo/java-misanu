package stackPrimer;

/* Za korišćenje Stack-a moramo ga uvesti */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Palindrom {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		/* Unos broja */
		System.out.println("Unesite prirodan broj n:");
		int n = Integer.parseInt(bf.readLine());

		/* Stek (Pored ArryList i LinkedList imamo i Stack) */
		Stack<Integer> st = new Stack<Integer>();

		/* while petljom jednu po jednu crifru unetog broja stavljamo na Stack */
		int m = n; 			/* Kopiram uneti broj u promenljivu m za manipulaciju */
		while (m > 0) { 	/* Izvršava se dok broj m ne overi nulu. */
			st.add(m % 10);	/* Na Stek stavljam poslednju cifru m-a */
			m /= 10; 		/* Uklanjam poslednju cifru m-a */
		}

		int x = 1; 				/* osnova za množenje je 1, kao što je za sumu 0 */
		while (!st.empty()) { 	/* Kopamo po Stack-u dok ga ne ispraznimo. */
			m += st.pop() * x;	/* m = 0 je već izašlo iz prethodne while petlje */
			x *= 10; 			/* x množimo sa 10 da bi u sledećem prolasku našem m-u dodali sledeću cifru */
		}

		/*
		 * Prosto poredimo m (n - natraške) sa unetim brojem n i ukoliko su identični
		 * broj je palindrom
		 */
		if (m == n)
			System.out.println("Broj je palindrom.");
		else
			System.out.println("Broj nije palindrom.");
	}
	
}
