package zadatak3;

public class MainTest {

	public static void main(String[] args) {
		
		// n identičnih sanduka i buradi sa teretom random specifične težine
		int n = 2;
		Sanduk [] sanduk = new Sanduk[n];
		Bure [] bure = new Bure[n];
		double a = 2, b = 4, c = 3, r = 2, h = 3;
		for(int i = 0; i < n; i++) {
			double st = Math.random()*10;
			sanduk[i] = new Sanduk(st, a, b, c );
			bure[i] = new Bure(st, r, h );
		}
		
		// Definisanje lokomotive težine
		double t = 110.125; // - težina lokomotive
		double vucnaF = 1100; // - max teret koji može povući
		Lokomotiva lok = new Lokomotiva(t, vucnaF);
		
		// Definisanje vagona (jedan tip)
		int brVagona = 2; // 2 vagona uslov zadatka
		Vagon[] vag = new Vagon[brVagona+1]; // omogućeno mesto za još jedan vagon
		for(int i = 0; i < brVagona; i++)
			vag[i] = new Vagon(20);
		
		// Pakovanje tereta u vagone (u svaki vagon po sanduk i bure)
		for(int i = 0; i < n; i++) {
			vag[i].dodajTeret(sanduk[i].tezina());
			vag[i].dodajTeret(bure[i].tezina());
		}
		
		// Ukoliko voz nije preopterećen štampa se izgled kompozicije
		t = lok.ukupnaTezina();
		for (int i = 0; i < n; i++)
			t += vag[i].ukupnaTezina();
		if(t <= lok.vucnaF) {
			System.out.println("Oznaka\t    ukupna | vučna\n\t    težina | sila\n-----------------------------");
			System.out.println(lok.opisVozila());
			for (int i = 0; i < brVagona; i++)
				System.out.println(vag[i].opisVozila());
			System.out.print("\nUkupno oko " + Math.round(t) + " što je u okviru dozvoljenog.");
		}
		else
			System.out.println("Voz je preopterećen!");
		
		// Dodajemo još jedan vagon
		vag[2] = new Vagon(20);
		// Tovarim prvi sanduk i drugo bure
		vag[2].dodajTeret(sanduk[0].tezina());
		vag[2].dodajTeret(bure[1].tezina());
		// Ukoliko voz nije preopterećen štampa se izgled kompozicije
		System.out.println("\n\nNakon dodavanja još jednog vagona:\n");
		System.out.println(vag[2].opisVozila() + "\n");
		t += vag[2].ukupnaTezina();
		if(t <= lok.vucnaF) {
			System.out.println("Oznaka\t    ukupna | vučna\n\t    težina | sila\n-----------------------------");
			System.out.println(lok.opisVozila());
			for (int i = 0; i <= brVagona; i++)
				System.out.println(vag[i].opisVozila());
			System.out.print("\nUkupno oko " + Math.round(t) + " što je u okviru dozvoljenog.");
		}
		else
			System.out.println("Voz je preopterećen!");
		
		
		
	}

}
