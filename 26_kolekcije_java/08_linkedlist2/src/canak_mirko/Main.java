package canak_mirko;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String imena[] = {"Mika", "Žika", "Fića"};
		
		List<String> listaImena1 = new LinkedList<String>();
		for(String s : imena)
			listaImena1.add(s);
		
		System.out.println("Lista 1 pre dodavanja imena: " + listaImena1);
		
		String imena2[] = {"Ana", "Lena", "Hana", "Una"};
		List<String> listaImena2 = new LinkedList<String>();
		for(String ime : imena2)
			listaImena2.add(ime);
		
		System.out.println("Lista 2 pre dodavanja imena: " + listaImena2);
		
		listaImena1.addAll(listaImena2);
		System.out.println("Nova Lista 1 dodavanjem imena Lista 2 u nju: " + listaImena1);
		
		//listaImena1.subList(1, 4).clear();
		listaImena1.subList(1,4).clear();

		// subList(indexFrom, indexTo);
		// indexFrom - pocevsi od zadatog indeksa, uključujući i njega
		// indexTo - do zadatog indeksa, NE uključujući i njega
		System.out.println("Lista nakon brisanja elemenata sa indeksima od 1 do 4: " + listaImena1);
		
	}

}
