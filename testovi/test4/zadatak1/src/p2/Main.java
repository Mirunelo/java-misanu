package p2;

import java.io.*;

import p1.Knjiga;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		/* Kreiranje Knjige putem parametrizovanog konstrukora */
		Knjiga k = new Knjiga("Na Drini ćuprija", "Ivo Andrić",
				"Roman pripoveda o građenju mosta preko Drine u bosanskom mestu Višegrad.", 1100.0, true);

		System.out.println("Kompletan opis knjige:\n" + k.opisKnjige());

		/* Kreiranje Knjige unošenjem svih podataka */
		Knjiga k1 = new Knjiga();

		System.out.println("\nUnesite podatke o sledećoj knjizi:\n");
		System.out.print("Naslov knjige: ");
		k1.setNaslov(bf.readLine());
		System.out.print("Pisac: ");
		k1.setAutor(bf.readLine());
		System.out.println("Kratak opis knjige:");
		k1.setOpis(bf.readLine());
		System.out.print("Cena knjige: ");
		k1.setCena(Double.parseDouble(bf.readLine()));
		System.out.print("Da li je na stanju? (true ili false): ");
		k1.setNaStanju(Boolean.parseBoolean(bf.readLine()));

		System.out.println("\nUneli ste sledeće podatke:");
		System.out.println(k1.getNaslov() + ", " + k1.getAutor() + ", " + k1.getOpis() + ", " + k1.getCena() + ", "
				+ k1.getNaStanju());

		System.out.println("\nKompletan opis knjige:" + k1.opisKnjige());

	}

}
