package uup7_Primer4_Kompozicija_RelacijaIma;

public class Taksista {
	
	// ime kompanije
	private static String imeKompanije = "Žuti taksi";
	
	// ime taksiste
	private String ime;
	public Taksista() {
		ime = null;
	}
	
	Taksista(String iIme) {
		ime = iIme;
	}
	
	public void zadajIme(String iIme) {
		ime = iIme;
	}
	
	public String uzmiIme() {
		return ime;
	}
	
	public void zadajPravac() {
		System.out.println("Pravac");
		skreniDesno();
		skreniLevo();
	}
	
	private void skreniDesno() {
		System.out.println("Skreni desno");
	}
	
	private void skreniLevo() {
		System.out.println("Skreni levo");
		
	} public static String uzmiImeKompanije() {
		return imeKompanije;
	}

}