package canak_mirko;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String imena[] = { "Mika", "Žika", "Ana", "Lana", "Hana", "Una" };

		List<String> listaImena = new ArrayList<String>();

		for (String ime : imena)
			listaImena.add(ime);

		String imenaZaBrisanje[] = { "Mika", "Lana", "Hana" };
		List<String> listaImenaZaBrisanje = new ArrayList<String>();
		for (String ime : imenaZaBrisanje)
			listaImenaZaBrisanje.add(ime);

		/* Kreiranje iteratora kolekcije i štampanje liste pomoću iteratora */
		Iterator<String> iter = listaImena.iterator();
		System.out.println("Štampanje elemenata pomoću iteratora: ");
		while (iter.hasNext())
			System.out.print(iter.next() + " ");

		/*
		 * Brisanje elemenata liste imena koja se nalaze u listi koja se zove
		 * listaImenaZaBrisanje
		 */
		iter = listaImena.iterator(); /* Ovo ne mora jer gore ima već Iterator<String> iter =... */
		while (iter.hasNext())
			if (listaImenaZaBrisanje.contains(iter.next())) /* Utvrđujemo da li lista imena za brisanje sadrži element na koju ukazuje
											 * iterator. Ako je odgovor true, brišemo element.
											 */
				iter.remove();

		System.out.println("\nLista nakon brisanja: ");
		for (int i = 0; i < listaImena.size(); i++)
			System.out.print(listaImena.get(i) + " ");

	}

}
