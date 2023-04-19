package zadatak4;

import java.util.ArrayList;

public class NizTacaka {

	private ArrayList<Tacka[]> niz;
	private int size;
	private Tacka[] nizTacaka;
	private int kapacitet;
	private int defaultkap;
	private int length;
	
	public NizTacaka() {
		kapacitet = 5;
		defaultkap = kapacitet;
		nizTacaka = new Tacka[kapacitet];
		length = 0;
		niz = new ArrayList<Tacka[]>();
		niz.add(nizTacaka);
		size = 0;
	}
	
	public NizTacaka(int n) {
		kapacitet = n;
		defaultkap = kapacitet;
		nizTacaka = new Tacka[kapacitet];
		length = 0;
		niz = new ArrayList<Tacka[]>();
		niz.add(nizTacaka);
		size = 0;
	}
	
	public void dodajTacku(double m, double x, double y, double z) {
		// Dodavanje tacke u niz
		if(length < defaultkap)
			niz.get(size)[length++] = new Tacka(m, x, y, z);
		// Prepunjen niz
		else {
			niz.add(new Tacka[5]);
			size++;
			length = 0;
			defaultkap = 5;
			niz.get(size)[length++] = new Tacka(m, x, y, z);
		}
	}
	
	// Računa broj unetih tačaka
	public int brojTacaka() {
		int brT = 0;
		if(size == 0)
			brT = length;
		if(size == 1)
			brT = kapacitet + length;
		if(size > 1)
			brT = kapacitet + ((size - 1) * defaultkap) + length;
		return brT;
	}
	
	// Traži tačku koja maksimalno privlači zadatu
	public String fatalnaPrivlacnost(double m, double x, double y, double z) {
		Tacka test = new Tacka(m, x, y, z);
		double f;
		double maxF = 0;
		int maxI = 0;
		int maxJ = 0;
		for(int i = 0; i <= size; i++)
			for(int j = 0; j < niz.get(i).length; j++) {
				if(niz.get(i)[j] != null) {
					f = test.privlacnaSila(niz.get(i)[j]);
					if(maxF < f) {
						maxF = f;
						maxI = i;
						maxJ = j;
					}
				}
		}
				
		return "Zadatu tačku -> " + test.opisTacke() + "\nnajviše privlači tačka - > " + niz.get(maxI)[maxJ].opisTacke() + "\ni to intenzitetom sile privlačenja od: " + maxF;
	}
	
	// Štampa sve unete tačke
	public void stampajTacke() {
		for(int i = 0; i <= size; i++)
			for(int j = 0; j < niz.get(i).length; j++) {
				if(niz.get(i)[j] != null)
					System.out.println(niz.get(i)[j].opisTacke());
			}
			
	}
	
}
