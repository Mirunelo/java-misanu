package canak_mirko;

/* This
 * 
 * Kljucna rec this ili referenca this pruza nacin da metoda zna koji tacno objekat je pozvao metodu, tj sa čijim podacima radi.
 * Takodje, moze se koristiti za pristup podacima objekta koji su sakriveni lokalnim promenljivama ili parametrima metode.
 * Takodje, odnosi se na trenutni objekat u metodi ili konstruktoru.
 */

public class Krug {

	private final double PI = 3.14159265358979323846; 
	private double poluprecnik;
	
	Krug() {
		poluprecnik = 0.0;
	}
	
	Krug(double poluprecnik){
		this.poluprecnik = poluprecnik;
	}
	
	public double povrsinaKruga() {
		float PI = 3.14f; // može da se deklariše lokalno PI unutar metode, kao lokalna promenljiva.
		/* Ako se u izrazu kaže PI to se odnosi na lokalno PI */
		System.out.println("Računica manje tačnosti: " + (poluprecnik * poluprecnik * PI));
		/* Da bi se računalo sa PI koje je zadato u polju klase mora se koristiti komanda this.PI */
		return poluprecnik * poluprecnik * this.PI;
	}
	
	double obimKruga() {
		return 2 * poluprecnik * PI;
	}
}
