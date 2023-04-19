package uup7_Primer4_Kompozicija_RelacijaIma;

public class TestTaksista {

	public static void main(String[] args) {
		HonorarniTaksista ht = new HonorarniTaksista();
		ht.zadajIme("Žika Obretković");
		System.out.println(ht.uzmiIme());
		ht.zadajHonorarneSate(20);
		System.out.println("Honorarni sati: " + ht.uzmiHonorarneSate());
		ht.zadajPravac();

		Taksista t = new Taksista("Rukavina Rudi");
		System.out.println("\nTaksista " + t.uzmiIme() + " radi za " + Taksista.uzmiImeKompanije());
		t.zadajPravac();

	}
}