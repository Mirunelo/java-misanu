package canak_mirko;

public class BoxPrikaz {

	/* Više objekata sa argumentima */
	
	public static void main(String[] args) {

		Box b1 = new Box();
		Box b2 = new Box();
		Box b3 = new Box();

		b1.width = 10;
		b1.height = 15;
		b1.depth = 20;

		b2.width = 5;
		b2.height = 6;
		b2.depth = 7;

		b1.volume();
		b2.volume();
		b3.volume();

	}

}
