package canak_mirko;

public class ObjekatKaoParametarKonstruktoraPrikaz {

	/* Objekat kao parametar konstruktora */

	public static void main(String[] args) {

		Circle c0 = new Circle();
		
		Circle c1 = new Circle(10); /* ** */

		Circle c2 = new Circle(c1); /* c1 je objekat koji je već kreiran *** */

		System.out.println("Površina prvog kruga: " + c0.area());
		System.out.println("Površina drugog kruga: " + c1.area());
		System.out.println("Površina trećeg kruga, istog kao drugi: " + c2.area());
	}

}
