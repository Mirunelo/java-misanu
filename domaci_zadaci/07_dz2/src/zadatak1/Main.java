package zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		int br = 0;
		double r1, r2, h;
		
		// Formira se niz zarubljenih kupa podrazumevanog kapaciteta 5 mesta
		NizZarubljenihKupa niz = new NizZarubljenihKupa();
		
		//niz.dodajKupu(new ZarubljenaKupa());
		//System.out.println("Zapremina zarubljene kupe br." + niz.indexKupeNajmanjeV() + " " + niz.getNiz(niz.indexKupeNajmanjeV()).opis() + " = " + niz.getNiz(niz.indexKupeNajmanjeV()).zapreminaKupe());
		
		System.out.print("Unesite broj zarubljenih kupa za unos: ");
		br = Integer.parseInt(ulaz.readLine());
		
		while(br <= niz.kapacitetNiza()) {
			
			for(int i = 0; i < br; i++) {
				System.out.print("Unesite r1 = ");
				r1 = Double.parseDouble(ulaz.readLine());
				System.out.print("Unesite r2 = ");
				r2 = Double.parseDouble(ulaz.readLine());
				System.out.print("Unesite h = ");
				h = Double.parseDouble(ulaz.readLine());
				niz.dodajKupu(new ZarubljenaKupa(r1, r2, h));
			}
			System.out.println("Kapacitet niza zarubljenih kupa: " + niz.kapacitetNiza());
			System.out.println("Broj popunjenih mesta: " + niz.getBrojac());
			System.out.println("Spisak zarubljenih kupa:");
			niz.getNiz(1).procitajDatoteku();
			System.out.println("Zarubljena kupa najmanje zapremine -> " + niz.getNiz(niz.indexKupeNajmanjeV()).opis() + " = " + niz.getNiz(niz.indexKupeNajmanjeV()).zapreminaKupe());
			if(!niz.moguDodatiKupu())
				System.out.println("Niz je pun!");
			
			System.out.print("Unesite broj zarubljenih kupa za unos: ");
			br = Integer.parseInt(ulaz.readLine());
			niz.setBrojacNa0();
			
		}
		
		// Nedozvoljena vrednost dužine niza
		System.err.println("Nedozvoljena vrednost! Dužina niza može biti maksimalno " + niz.kapacitetNiza());
		
	}

}