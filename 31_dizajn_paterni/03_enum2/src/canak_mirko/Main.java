package canak_mirko;

public class Main {

	public static void main(String[] args) {

/* Sva nabrajanja imaju dve unapred definisane metode:
 * values() - vraća niz koji sadrži listu konstanti definisanih u nabrajanju
 * valuesOf() - vraća konstantu iz nabrajanja čija vrednost odgovara
 * znakovnom nizu prosleđenom u argumentu.
 */
		
		System.out.println("Boje:\n");
		
		//Boja[] nizBoja = { Boja.Crvena, Boja.Zelena, Boja.Plava, Boja.Crna, Boja.Bela, Boja.Narandžasta, Boja.Žuta };
		Boja nizBoja[] = Boja.values();
		
		for(Boja c : nizBoja) {
			System.out.println(c + " ");
		}
		
		Boja c1;
		c1 = Boja.valueOf("Bela"); // metoda vraća vrednost iz nabrajanja koja odgovara imenu zadate konstante
		
		System.out.println("Boja: " + c1);
		
	}

}
