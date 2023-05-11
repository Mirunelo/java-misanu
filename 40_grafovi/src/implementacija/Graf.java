package implementacija;

import java.util.ArrayList;
import java.util.List;

// Klasa Graf
public class Graf {

	// Definisanje liste susednosti
	List<List<Cvor>> sused_list = new ArrayList<>();

	// Konstruktor
	public Graf(List<Grana> grane) {
		// Alociranje memorije za listu susednosti
		for (int i = 0; i < grane.size(); i++)
			sused_list.add(i, new ArrayList<>());

		// Dodavanje grana Grafu
		for (Grana e : grane) {
			// Dodeli novi čvor u listi susednosti od izvora do destinacije
			sused_list.get(e.izvor).add(new Cvor(e.destinacija, e.tezina));
		}
	}

	// Štampanje liste susednosti za Graf
	public void printGraf(Graf graf) {
		int izvorniCvor = 0;
		int listVelicina = graf.sused_list.size();

		System.out.println("Sadržaj Grafa:\n");
		while (izvorniCvor < listVelicina) {
			// Proliazi kroz listu susednosti i štampa grane
			for (Cvor cvor : graf.sused_list.get(izvorniCvor)) {
				System.out.print("Čvor: " + izvorniCvor + " ==> " + cvor.vrednost + " (" + cvor.tezina + ")\t");
			}

			System.out.println("");
			izvorniCvor++;

		}

	}

}