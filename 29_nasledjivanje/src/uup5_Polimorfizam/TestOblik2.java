package uup5_Polimorfizam;

public class TestOblik2 {

	public static void main(String[] args) {

		Krug krug = new Krug();
		Pravougaonik pravougaonik = new Pravougaonik();
		Zvezda zvezda = new Zvezda();
		
		crtajOblik(krug);
		crtajOblik(pravougaonik);
		crtajOblik(zvezda);
		
	}

	private static void crtajOblik(Oblik o) {

		o.crtaj();
		
	}

}
