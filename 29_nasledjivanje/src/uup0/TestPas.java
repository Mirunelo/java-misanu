package uup0;

public class TestPas {

	public static void main(String[] args) {
		
		Pas p = new Pas();

		System.out.println("Klasa Pas");
		p.lajati();
		p.dachi();

		ZlatniRetriver zr = new ZlatniRetriver();

		System.out.println("Klasa Zlatni Retriver");
		zr.lajati();
		zr.dachi();
		zr.aportiraj();

		LhasaApso la = new LhasaApso();
		System.out.println("Klasa Lhasa Apso");
		la.lajati();
		la.dachi();
		la.cuvaj();
		la.uzmiBojuOciju();
		
		Macka m = new Macka();
		System.out.println("Klasa Macka");
		m.mjaukati();
		m.uzmiBojuOciju();
		m.uzmiFrekvencijuMjauka();
		
	}

}
