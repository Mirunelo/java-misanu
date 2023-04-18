package canak_mirko;

public class BoxPrikaz {

	public static void main(String[] args) {

		Box b1 = new Box();
		
		double zapremina;
		
		b1.sirina = 10;
		b1.visina = 15;
		b1.dubina = 20;
		
		zapremina = b1.sirina * b1.visina * b1.dubina;
		
		System.out.println("Zapremina: " + zapremina);
		
	}

}
