package zadatak4;

public abstract class Namirnica extends Energent {
	
	private String ime;
	private static int brojac = 0;
	private int id;
	
	Namirnica(String ime){
		this.ime = ime;
		id = ++brojac;
	}

	public String getIme() {
		return ime;
	}

	public int getId() {
		return id;
	}
	
	public String opis() {
		return getIme() + "[" + getId() + "](";
		
	}
	
}
