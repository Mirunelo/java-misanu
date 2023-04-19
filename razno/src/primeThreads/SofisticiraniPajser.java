package primeThreads;

import java.util.ArrayList;
import java.util.List;

public class SofisticiraniPajser {

	public static void main(String[] args) {

		// Pajser na steroidima traži proste brojeve u intervalu od 1 do milion

		// Setujemo tajmer
		long timer = System.currentTimeMillis();

		// Tražimo proste brojeve
		List<Integer> n = new ArrayList<Integer>();
		n.add(2);
		n.add(3);
		for (int i = 4; i < 1000000; i++) { // kandidati... možete probati 10 ili 100 miliona i više
			for(int e: n)
				if (i % e == 0) // kandidate delimo samo prostim brojevima
					break;
				else if (e > Math.sqrt(i) && i % e != 0) { // proveru završavamo kad je imenilac veći od kvadratnog korena kandidata 
					n.add(i);
					break;
				}
		}

		// Štampamo proste brojeve
		System.out.println(n); // nije loše zakomentarisati štampanje prostih brojeva za pretrage preko milion
		System.out.println("Pronašli smo " + n.size() + " prostih brojeva."); // provera: https://en.wikipedia.org/wiki/Prime-counting_function

		// Izračunavamo dužinu rada programa i ispisujemo je
		timer = System.currentTimeMillis() - timer;
		System.out.println("\nIzvršenje programa je trajalo " + timer + " milisekundi.");
	}
}