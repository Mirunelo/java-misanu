package trgovina;

import java.util.HashSet;
import java.util.Set;

public interface BarCode {
	/*
	 * Set-ovi: Za sve Set-ove važi da ne čuvaju duplikate. Ako pokušamo da unesemo
	 * duplikat ne javlja grešku. Prosto ga ne uvrsti u Set.
	 * 
	 * HashSet: Eelementi nemaju rd.br(prosto su nabacani kao u kantu za đubre), ali
	 * zato radi brzo.
	 * 
	 * TreeSet: Sortira elemente u prirodnom redosledu 0,1,2... A-Z... Sporo radi.
	 * 
	 * LinkedHashSet: Čuva redosled unetih elemenata.
	 */

	Set<Long> barCodes = new HashSet<Long>();

	// Interna metoda unutar interfejsa
	private long makeBarCode() {
		int size = barCodes.size();
		long code = 0;

		/*
		 * Ako se slučajno generiše bar kod koji već postoji while petlja se izvršava
		 * ponovo jer je uslov true
		 */
		while (size == barCodes.size()) {
			code = (long) (Math.random() * 1E13);
			barCodes.add(code); // ako je generisan dupikat HashSet ne menja size
		}
		return code;
	}

	// Default interfejs metoda u akciji
	default long getBarCode() {
		return makeBarCode();
	}
	
}
