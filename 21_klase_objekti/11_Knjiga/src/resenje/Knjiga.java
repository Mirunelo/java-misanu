package resenje;

public class Knjiga {

	private String ime;
	private int brojStranica;

	Knjiga(){
		ime = "Mali Princ";
		brojStranica = 112;
	}
	
	public void setIme(String name) {
		ime = name;
	}

	public String getIme() {
		return ime;
	}

	public void setBrojStranica(int br) {
		brojStranica = br;
	}

	public int getBrojStranica() {
		return brojStranica;
	}

	public void imeIBroj() {
		System.out.println("Ime: " + ime + ". Broj stranica: " + getBrojStranica());
	}
}
