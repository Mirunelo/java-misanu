package canak_mirko;

public enum Boja {
	
	/* Mora prvo lista sa vrednostima Enuma inače javlja grešku */
	Crvena(200), Zelena(150), Plava(100), Crna(250), Bela(179), Zuta(124);
	
	private int udeo;
	
	Boja(int u){
		udeo = u;
	}
	
	int getUdeo() {
		return udeo;
	}

}
