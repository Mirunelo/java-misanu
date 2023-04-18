package canak_mirko;

public class Base {

	private int n_pri = 1;
	int n_def = 2; /* podrazumevani nivo pristupa */
	protected int n_pro = 3;
	public int n_pub = 4;

	Base() {
		System.out.println("Konstruktor klase Base.");
		System.out.println("Base klasa n_pri = " + n_pri);
		System.out.println("Base klasa n_def = " + n_def);
		System.out.println("Base klasa n_pro = " + n_pro);
		System.out.println("Base klasa n_pub = " + n_pub);
	}

}
