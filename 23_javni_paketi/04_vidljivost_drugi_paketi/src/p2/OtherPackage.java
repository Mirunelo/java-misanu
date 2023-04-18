package p2;

public class OtherPackage {

	OtherPackage() {

		p1.Base p = new p1.Base(); /* paket.Klasa objekat = new paket.Klasa(); */
		System.out.println("Konstruktor klase OtherPackage");

		/* System.out.println("n_pri = " + p.n_pri); */
		/* System.out.println("Same package klasa: n_def = " + p.n_def); */
		/* System.out.println("Same package klasa: n_pro = " + p.n_pro); */
		System.out.println("Klasa OtherPackage: n_pub = " + p.n_pub);
	}

}
