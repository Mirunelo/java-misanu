package knjizara;

public class MainTest {

	public static void main(String[] args) {

		// Kreiranje
		Knjiga k = new Knjiga("Na drini ćuprija", "Ivo Andrić", 2020, "Vulkan Izdavaštvo", 983.99, 1000);
		CD c = new CD("Aleksandra Radović", "Predvorje života", "Pop", 378.99, 2500);

		// Opisi
		System.out.println(k.opis() + "\n");
		System.out.println(c.opis() + "\n");

		// Kupi knjigu
		System.out.println("Kupljena jedna knjiga...\nNa stanju ostalo još: " + k.kupi() + "\n");

		// Kupi CD
		System.out.println("Kupljen jedan CD...\nNa stanju ostalo još: " + c.kupi() + "\n");

	}

}
