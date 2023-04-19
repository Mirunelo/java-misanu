package zadatak5;

public class Main {

	public static void main(String[] args) throws Exception {
		// Primeri naselja:
		// Inđija:
		Naselje n1 = new Naselje("Beška", 6239);
		Naselje n2 = new Naselje("Krčedin", 2878);
		// Šid:
		Naselje n3 = new Naselje("Kukujevci", 2252);
		Naselje n4 = new Naselje("Morovic", 2164);
		// Ruma: - provera kapaciteta
		Naselje n5 = new Naselje("Buđanovci", 1757);
		Naselje n6 = new Naselje("Hrtkovci", 3036);
		
		
		

		// Primeri opština:
		Opstina o1 = new Opstina("Šid", 2, 687);
		Opstina o2 = new Opstina("Inđija", 2, 385);
		// opština 3 - za proveru kapaciteta
		Opstina o3 = new Opstina("Ruma", 2, 582);

		// Opštinama dodajemo naselja
		o1.addTJ(n1);
		o1.addTJ(n2);
		o2.addTJ(n3);
		o2.addTJ(n4);
		o3.addTJ(n5);
		
		// neće moći da se doda opština u opštinu -> Greška 1!
		o3.addTJ(o2);
		
		o3.addTJ(n6);
		
		// neće moći da se doda 3. naselje -> Greška 2!
		o3.addTJ(n1);

		// Primer okruga kapaciteta 2 mesta
		Okrug ok = new Okrug("Sremski okrug", 2);

		// Okrugu dodajemo opštine
		ok.addTJ(o1);
		
		// neće moći da se doda naselje okrugu -> Greška 3
		ok.addTJ(n1);
		
		ok.addTJ(o2);
		
		// neće moći da se doda 3. opština -> Greška 4!
		ok.addTJ(o3);

		// Ispisivanje okruga na glavnom izlazu
		System.out.println("\nPrimer okruga sa " + ok.getKapacitet() + " opštine, od kojih svaka opština ima po " + o1.getKapacitet() + " naselja:\n");
		System.out.println(ok.opis());
	}

}
