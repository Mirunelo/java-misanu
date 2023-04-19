package zadatak4;

public class Main {

	public static void main(String[] args) throws Exception {

		// Kreiranje menija zadatog kapaciteta
		Namirnica [] meni = new Namirnica[4];
		
		// Kreiranje namirnica:
		System.out.println("Kreiranje namirnica:\nKreiranje prve namirnice.");
		Namirnica n1 = new Hrana("Ćevapi", 250, 14.5, 18, 0);
		System.out.println("Kreiranje druge namirnice.");
		Namirnica n2 = new Hrana("Pomfrit", 200, 2.75, 5.48, 25.55);
		System.out.println("Kreiranje treće namirnice.");
		Namirnica n3 = new Hrana("Šopska salata", 150, 1.5, 9, 4.8);
		System.out.println("Kreiranje četvrte namirnice.");
		Namirnica n4 = new Pice("Pivo", 0.33, 2092);
		System.out.println("Kreiranje pete namirnice.");
		Namirnica n5 = new Pice("Coca-Cola", 0.25, 1841);
		
		// Ubacivanje namirnica u meni:
		try {
			// Dodavanje namirnica u meni:
			System.out.println("\nDodavanje namirnica u meni:");
			meni[0] = n1;
			System.out.println("Dodata prva namirnica.");
			meni[1] = n2;
			System.out.println("Dodata druga namirnica.");
			meni[2] = n3;
			System.out.println("Dodata treća namirnica.");
			meni[3] = n4;
			System.out.println("Dodata četvrta namirnica.");
			// Pokušaj da se u meni kapaciteta 4 ubaci 5-a namirnica javlja grešku
			meni[4] = n5;
			System.out.println("Dodata peta namirnica.\n");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Greška! Meni kapaciteta " + meni.length + " namirnice je prepunjen!\n" );
		}
		
		// Opis i ukupna energetska vrednost menija
		double energy = 0;
		String s = "";
		for(int i = 0; i < meni.length; i++) {
			energy += meni[i].energetskaVrednost();
			s += meni[i].opis();
			if( i < meni.length-1)
				s += ",\n  ";
		}
		// Opis menija
		System.out.println("\nTekstualni opis menija:\n{ " + s + " }\nUkupna energetska vrednost menija: [" + energy + " kJ]");
		
		
	}

}
