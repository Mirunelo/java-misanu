package uup3_Primer1;

public class Zivotinja {

	private String vrsta;

	public Zivotinja() {

	}

	public Zivotinja(String vrsta) {
		// može prosto: this.vrsta = vrsta;
		this.vrsta = new String(vrsta);
	}

	public String toString() {
		return "Ovo je " + vrsta;

	}

}
