package zadatak3final;

public class MainTest {

	public static void main(String[] args) throws Exception {

		// Kreiram Voz zadatog kapaciteta 3 (lokomotiva i 2 vagona)
		Voz voz = new Voz(3); // Voz će imati još jedno mesto za poslednji vagon
		// Voz voz = new Voz(4); // -> Možemo da se igramo :)

		// Kreiram šinsko vozilo Lokomotiva
		Vozilo lokomotiva = new Lokomotiva(100, 800);
		// Vozilo lokomotiva2 = new Lokomotiva(20, 300); // -> Možemo da se igramo :)

		// Kreiram 2 šinska Vozila(Vagona) + 1 za proveru
		Vozilo vagon1 = new Vagon(20, 2); // otvoreni vagon
		Vozilo vagon2 = new Vagon(30, 2); // zatvoreni vagon
		Vozilo vagon3 = new Vagon(15, 3); // vagon platforma

		// Pribavljam teret-e:
		Teret s1 = new Sanduk(10, 3, 1, 0.5); // ID1: 15 (ID tereta: težina)
		Teret s2 = new Sanduk(20, 3, 1, 0.5); // ID2: 30
		Teret b1 = new Bure(10, 0.5, 1.5); // ID3: 11,781
		Teret b2 = new Bure(15, 0.5, 1.4); // ID4: 16,493

		// Tovarim teret-e u Vagon-e
		vagon1.setTeret(s1);
		vagon1.setTeret(b1);
		vagon1.setTeret(s2); // -> Ovaj teret neće moći da stane u vagon 1 kapaciteta 2 mesta
		vagon2.setTeret(s2); // Zato ga stavljamo u vagon 2
		vagon2.setTeret(b2);

		// Pravim Voz od Lokomotive i dva Vagon-a
		voz.setVoz(lokomotiva);
		// voz.setVoz(lokomotiva2); // -> Možemo da se igramo :)
		voz.setVoz(vagon1);
		voz.setVoz(vagon2);

		// Štampam opis Voz-a
		System.out.println(voz.Opis());

		// Po uslovu zadatka tovarimo treći vagon i priključujemo ga na Voz
		// Prvo pribavljam nove teret-e
		Teret s3 = new Sanduk(100, 3, 1, 0.5); // ID5: 150
		Teret s4 = new Sanduk(202, 3, 1, 0.5); // ID6: 303
		Teret b3 = new Bure(100, 0.5, 1.5); // ID7: 117.81

		// Tovarim teret-e u Vagon br.3
		vagon3.setTeret(s3);
		vagon3.setTeret(s4);
		vagon3.setTeret(b3);

		// Dodajem treće šinsko Vozilo(Vagon br.3) na Voz
		voz.setVoz(vagon3);

		// Štampam opis Voz-a
		System.out.println("Pokušaćemo da dodamo 3. vagon...\n" + vagon3.Opis());
		System.out.println(voz.Opis());
	}

}