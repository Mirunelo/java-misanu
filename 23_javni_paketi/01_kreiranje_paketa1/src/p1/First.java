package p1;

/* Paketi(packages)
 * 
 * Paketi služe za grupisanje klasa. Klase se grupišu po svojstvu. Recimo, sve klase
 * koje su zadužene za komunikaciju sa bazom biće smeštene unutar jednog paketa.
 * Sve klase koje su zadužene za izgled aplikacije biće smeštene unutra drugog paketa
 * i sve ostale će biti smeštene unutar trećeg paketa.
 * Možete napraviti dve klase sa istim nazivom unutar dva razičita paketa i neće biti
 * konflikta između njih.
 * Paket je istovremeno mehainzam za imenovanje i za upravljanje vidljivošću klasa.
 * 
 * Paketi sadrže klase. Klase sadrže polja (fields) i metode (methods).
 * Metode sadrže lokalne promenljive. Nema globalnih promenljivih u Javi!!!
 * 
 * */

public class First {

	public int a = 5;

	public void view() {
		System.out.println("Ovo je klasa definisana u paketu P1.");
	}

}
