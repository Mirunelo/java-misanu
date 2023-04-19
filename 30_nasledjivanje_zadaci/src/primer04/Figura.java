package primer04;

public abstract class Figura {
	/* Deklarisanje zaštićenih podataka */
	protected double xRef;
	protected double yRef;

	/* Parametrizovan konstruktor */
	Figura(double xRef, double yRef) {
		if (xRef != 0 || yRef != 0) {
			this.xRef = xRef;
			this.yRef = yRef;
		}
		else
			System.out.println("Greška: vrednosti podataka ne mogu biti 0.0");
	}

	/* Deklarisanje apstraktnih metoda obim i površina */
	abstract double obim();

	abstract double povrsina();
}