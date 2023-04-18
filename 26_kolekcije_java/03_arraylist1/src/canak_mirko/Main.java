package canak_mirko;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		/*
		 * Interfejs <T> ime = new ArrayList<T>();
		 * T predstavlja tip promenljive
		 */
		List<Integer> kolekcijaAL = new ArrayList<Integer>();
		/* List je interfejs, <Integer> je tip podataka, kolekcijaAL je naziv,
		 * ArrayList je kolekcija.
		 */

		/* add - metoda */
		kolekcijaAL.add(5); /* add se nalazi unutar java.util.List */
		kolekcijaAL.add(4);
		kolekcijaAL.add(9);
		kolekcijaAL.add(7);
		kolekcijaAL.add(12);

		System.out.println(kolekcijaAL);
		
		/* Zaključak: Koristite ArrayList kada ne znate unapred veličinu niza! */

	}

}
