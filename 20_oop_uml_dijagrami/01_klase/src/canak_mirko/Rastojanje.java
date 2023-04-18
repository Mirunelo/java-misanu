package canak_mirko;

public class Rastojanje {

	int stopala; 
	double inci;
	
	/* Za unos preko konstruktora treba ga definisati:
	 public Rastojanje(int stopala, double inci) {
	 super();
	 this.stopala = stopala;
	 this.inci = inci;
	*/
	
	Rastojanje (){
		
	}
	
	Rastojanje (int stop, double inci){
		//super(); - čemu ovo???
		stopala = stop;
		this.inci = inci; // mora this da se naglasi kad je double inci u klasi i u parametru konstruktora
	}
	
}
