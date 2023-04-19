package canak_mirko;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		
		/* Kada određenoj niti želite da odredite prioritet izvršavanja, pozovite metodu
		 * setPriority() koja je član klase Thread.
		 * void setPriority(nivo)
		 * Parametrom "nivo" zadajete nivo prioriteta niti za koju je metoda pozvana.
		 * Vrednost mora biti u opsegu između MIN_PRIORITY i MAX_PRIORITY
		 * A vrednosti tih konstanti su između 1 i 10.
		 * Podrazumevana vrednost iznosi 5, a može se zadati preko NORM_PRIORITY.
		 * Ta konstanta vraća vrednost na 5, ako smo setovali nešto drugo ranije.
		 */

		b.setPriority(Thread.MAX_PRIORITY);
		a.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(b.getName() + " B ima MAX prioritet: " + a.getPriority());
		System.out.println(a.getName() + " A ima MIN prioritet: " + b.getPriority());
		b.start();
		a.start();
		
		System.out.println("Kraj glavne niti.");
		
	}

}
