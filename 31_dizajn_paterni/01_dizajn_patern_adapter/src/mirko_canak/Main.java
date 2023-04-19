package mirko_canak;

public class Main {
	
	static void testPatka(Patka patka) {
		patka.kvace();
		patka.leti();
	}

	public static void main(String[] args) {

		//DivljaCurka patka = new DivljaCurka();
		DivljaPatka patka = new DivljaPatka();
		
		Curka curka = new DivljaCurka();
		
		/* Umotavamo Curku u CurkaAdapter, zahvaljujući kome će izgledati kao Patka */
		Patka curkaAdapter = new CurkaAdapter(curka);
		
		System.out.println("Ćurka: ");
		curka.curlice();
		curka.leti();
		
		System.out.println("Patka: ");
		testPatka(patka);
		
		/* Pokušavamo da poturimo Ćurku kao Patku */
		System.out.println("AdapterCurka");
		testPatka(curkaAdapter); // ne zna da je dobila Ćurku prerušenu u Patku
		
	}

}
