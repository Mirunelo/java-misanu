package canak_mirko;

public class InicObjSaParametrizovanimKonstruktorom {

	public static void main(String[] args) {

		Box b1 = new Box(10.3, 15.6, 20.4);
		Box b2 = new Box(5.3, 6.5, 7.1);
		
		/* System.out.println(b1.width); - ne vidi private atribut width! */

		System.out.println("Zapremina: " + b1.volume());
		System.out.println("Zapremina: " + b2.volume());

	}

}
