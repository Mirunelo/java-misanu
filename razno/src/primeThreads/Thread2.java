package primeThreads;

import java.util.ArrayList;
import java.util.List;

// Klasa implementira Runnable
public class Thread2 implements Runnable {

	// Deklarisanje niza rezultata
	private List<Integer> prostiBr = new ArrayList<Integer>();
	private int a, b; // Intervali
	private long tajmer; // Tajmer

	// Podrazumevani konstruktor (2 niti) od 2 do milion
	public Thread2() {
		a = 700001;
		b = 1000000;
	}

	// Zadavanje intervala za koji tražimo proste brojeve
	public Thread2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// Programski kod niti 2
	@Override
	public void run() {
		tajmer = System.currentTimeMillis();
		for (int i = a; i < b; i++) {
			for (int j = 2; j <= i / 2; j++)
				if (i % j == 0)
					break;
				else if (j == i / 2 && i % j != 0)
					prostiBr.add(i);
		}
		tajmer = System.currentTimeMillis() - tajmer;
	}

	public List<Integer> getProstiBr() {
		return prostiBr;
	}

	public long getTajmer() {
		return tajmer;
	}

}
