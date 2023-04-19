package primer07;

public class TestVoce {

	public static void main(String[] args) {
		Jabuka j = new Jabuka("jabuka", "crvena", 55.70, 10, "delišes");
		System.out.println("Ukupno za plaćanje: " + j.izracunajZaUplatu());
	}
}
