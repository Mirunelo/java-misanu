package uup4_Primer2;

public class Kvadrat extends GeometrijskaFigura {

	double stranica;

	public Kvadrat(double stranica) {
		if (stranica > 0.0)
			this.stranica = stranica;
		else
			System.out.println("Greška: Vrednost podatka stranica mora biti veća od 0.");
	}

	public double izracunajPovrsinu() {
		return stranica * stranica;
	}

	public double izracunajObim() {
		return 4 * stranica;
	}

}
