package canak_mirko;

/* Nabrajanje je vrsta klase. Instanca klase ne pravi se pomoću ključne
 * reči new. Rezervisana reč Enum definiše klasu.
 * Svaka konstanta definisana u nabrajanju je objekat čiji tip je
 * to isto nabrajanje.
 */

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Udeo zelene boje: " + Boja.Zelena.getUdeo());
		
		System.out.println("Sve boje: ");
		for(Boja c : Boja.values())
			System.out.println(c + " " + c.getUdeo()*2);

	}

}
