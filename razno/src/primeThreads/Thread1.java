package primeThreads;

import java.util.ArrayList;
import java.util.List;

// Klasa nasleđuje Thread
public class Thread1 extends Thread {

	// Deklarisanje niza rezultata
	private List<Integer> prostiBr = new ArrayList<Integer>();
	private int a, b;
	private long tajmer;

	// Ppodrazmevani konstruktor (2 niti) od 2 do milion
	public Thread1() {
		a = 2;
		b = 700000;
	}

	// Traže se svi prosti brojevi do broja b
	public Thread1(int b) {
		a = 2;
		this.b = b;
	}

	// Traže se svi prosti brojevi od broja a do broja b
	public Thread1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// Programski kod niti 1
	public void run() {
		tajmer = System.currentTimeMillis();
		// Ako se kreće od broja manjeg od 3
		if (a < 3) {
			prostiBr.add(2);
			prostiBr.add(3);
			a = 5;
		}
		// Ako se kreće od broja 3
		else if (a == 3) {
			prostiBr.add(3);
			a = 5;
		}
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
