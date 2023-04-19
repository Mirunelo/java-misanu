package zadatak2;

public class Ocena {

	private int ocena;
	
	public Ocena(int o) {
		if(o<5)
			o = 5;
		else if(o>10)
			o = 10;
		ocena = o;
	}

	public int getOcena() {
		return ocena;
	}
	
	public String getOcenaSlovima() {
		String ocenaSlovima;
		switch(ocena) {
		case 5:
			ocenaSlovima = "pet";
			break;
		case 6:
			ocenaSlovima = "šest";
			break;
		case 7:
			ocenaSlovima = "sedam";
			break;
		case 8:
			ocenaSlovima = "osam";
			break;
		case 9:
			ocenaSlovima = "devet";
			break;
		default:
			ocenaSlovima = "deset";
		}
		return ocenaSlovima;
	}
	
	public String opisOcene() {
		return getOcena() + "(" + getOcenaSlovima() + ")";
	}
	
}
