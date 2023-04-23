package primeNumbers;

import java.util.ArrayList;
import java.io.*;

public class Prime implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3466020274154225563L;
	private ArrayList<Integer> primes;
	private int n;
	private long timer;

	public Prime() {
		primes = new ArrayList<>();
		primes.add(2);
		primes.add(3);
		n = 4;
		this.timer = 0L;
	}
	
	public int getN() {
		return n;
	}

	public long getTimer() {
		return timer;
	}

	public void CalculatePrimes(int n) {
		long timer = System.currentTimeMillis();
		for (int i = n; i < n + 10000000; i++) {
			for(int e: primes)
				if (i % e == 0) // kandidate delimo samo prostim brojevima
					break;
				else if (e > Math.sqrt(i) && i % e != 0) { // proveru završavamo kad je imenilac veći od kvadratnog korena kandidata 
					primes.add(i);
					break;
				}
		}
		this.n += 10000000;
		this.timer += (System.currentTimeMillis() - timer);
	}
	
	public void PrimeNumbers() {
		System.out.println(primes); // nije loše zakomentarisati štampanje prostih brojeva za pretrage preko milion
		System.out.println("Pronašli smo " + primes.size() + " prostih brojeva."); // provera: https://en.wikipedia.org/wiki/Prime-counting_function
	}
	
}
