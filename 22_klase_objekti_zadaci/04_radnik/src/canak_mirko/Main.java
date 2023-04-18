package canak_mirko;

public class Main {

	public static void main(String[] args) {

		Radnik r1 = new Radnik("Pera", 100, 150000);
		Radnik r2 = new Radnik("Mika", 80, 120000);
		
		System.out.println("Prihod prvog radnika je " + r1.prihod());
		
		System.out.println("Plata drugog radnika je " + r2.plata());
		
		System.out.println("Ime/Plata: " + r1.opis());
		
		r2.drugiOpis();
		
	}

}
