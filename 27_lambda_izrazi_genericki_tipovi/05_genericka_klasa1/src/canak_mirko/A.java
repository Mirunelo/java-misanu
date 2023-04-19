package canak_mirko;

public class A<T> { /*
					 * Generička klasa. Ovde je T parametar tipa, koji će biti zamenjen stvarnim
					 * tipom kad se napravi objekat tipa A.
					 */

	T ob; /* kod obične klase imali smo int ob; a ovde imamo generički tip T */

	A(T o) {
		ob = o;
	}

	public void seOb(T ob) {
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	void prikaziTip() {
		System.out.println("Tip T je: " + ob.getClass().getName());
	}

} /*
	 * Zaključak: T je zamena za stvarni tip koji će biti zadat u trenutku kreiranja
	 * objekta klase A ( u našem slučaju ).
	 */
