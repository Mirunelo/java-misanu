package zadatak3;

public class Polica {

	private double nosivost;
	private double[] polica;

	Polica(int m, double t) {
		polica = new double[m];
		nosivost = t;
	}

	public int kapacitetPolice() {
		return polica.length;
	}

	public int brPopunjenihMesta() {
		int s = 0;
		for (double d : polica)
			if (d != 0)
				s++;
		return s;
	}

	public double nosivostPolice() {
		return nosivost;
	}

	public double ukupanTeret() {
		double t = 0;
		for (double d : polica)
			t += d;
		return t;
	}

	public double ostaloNosivosti() {
		return nosivost - ukupanTeret();
	}

	public void isprazniPolicu() {
		for (int i = 0; i < polica.length; i++)
			polica[i] = 0;
		System.out.println("Polica je ispražnjena.\n");
	}

	public void staviPredmet(int m, double t) {
		boolean test = testNosivosti(t);
		while (test) {
			try {
				if (polica[m - 1] == 0) {
					polica[m - 1] = t;
					System.out.println("Stavili ste predmet težak " + t + " kg na policu, mesto broj " + m + ".");
					test = false;
				} else {
					System.err.println("Na mestu broj " + m + " na polici se već nalazi predmet!");
					test = false;
				}
			} catch (Exception e) {
				System.err.println("Nema mesta na polici za predmet težine " + t + " kg!");
				test = false;
			}
		}
	}

	public void staviPredmetNaPraznoMesto(double t) {
		boolean test = testNosivosti(t);
		while (test) {
			for (int i = 0; i < polica.length; i++) {
				if (polica[i] == 0) {
					polica[i] = t;
					System.out.println("Stavili ste predmet težak " + t + " kg na policu, mesto broj " + (i + 1) + ".");
					test = false;
					break;
				} else if (i == polica.length - 1) {
					System.err.println("Nema mesta na polici za predmet težine " + t + " kg!");
					test = false;
				}
			}
		}
	}

	public void uzmiPredmet(int m) {

		if (praznoMesto(m)) {
			System.out.println("Uzeli ste predmet sa mesta " + m + " police, težak " + polica[m - 1] + " kg.");
			polica[m - 1] = 0;
		}

	}

	public void pogledajPredmet(int m) {

		if (praznoMesto(m)) {
			System.out.println("Na mestu " + m + " na polici se nalazi predmet, težak " + polica[m - 1] + " kg.");
		}

	}

	public boolean praznoMesto(int m) {
		boolean test = false;
		try {
			if (polica[m - 1] == 0) {
				System.out.println("Mesto " + m + " na polici je prazno!");
			} else
				test = true;
		} catch (Exception e) {
			System.err.println("Na polici ima samo " + polica.length + " mesta!");
		}
		return test;
	}

	public boolean testNosivosti(double t) {
		double tezina = t;
		boolean test = false;
		for (double d : polica)
			tezina += d;
		if (tezina <= nosivost)
			test = true;
		else
			System.err.println("Predmet težine " + t + " kg bi preopteretio policu za " + (tezina - nosivost) + " kg.");
		return test;
	}

	public String opisPolice() {
		return "Opis police:\nPolica je kapaciteta: " + kapacitetPolice() + "\npopunjeno je: " + brPopunjenihMesta()
				+ " mesta\nnosivost police je " + nosivostPolice() + " kg\nukupan teret na polici je " + ukupanTeret()
				+ " kg\nmože da se doda još " + ostaloNosivosti() + " kg.\n";
	}

}
