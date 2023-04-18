package canak_mirko;

public class Knjiga {
	
	private String ime;
	private int brojStrana;
	
	Knjiga (){
		ime = "Mali princ";
		brojStrana = 112;
	}
	
	Knjiga(String ime, int bs){
		this.ime = ime;
		brojStrana = bs;
	}
	
	String ispisImena() {
		return ime;
	}
	
	int brojStrana() {
		return brojStrana;
	}
}
