package mirko_canak;

/* 1. Prvo se implementira interfejs tipa prema kojem se vrši prilagođavanje.
 * To je interfejs koji klijent očekuje.
 */

public class CurkaAdapter implements Patka {
	
	Curka curka;
	
	/* 2. Dobiti referencu na objekat koji prilagođavamo */
	
	public CurkaAdapter(Curka curka) {
		this.curka = curka;
	}

	/* Prevođenje kvace() u metodu curlice() između klasa. */
	public void kvace() {
		curka.curlice();		
	}

	@Override
	public void leti() {
		for(int i = 0; i < 5; i++)
			curka.leti();
		
	}
	
	/* 3. Implementacija metoda u interfejsu */
	
	

}
