package canak_mirko;

public class EnumPrikaz {
	
	void odgovor(Odgovori odg) {
		switch(odg) {
		case NE:
			System.out.println("Ne");
			break;
		case DA:
			System.out.println("Da");
			break;
		case MOZDA:
			System.out.println("Možda");
			break;
		case KASNIJE:
			System.out.println("Kasnije");
			break;
		case USKORO:
			System.out.println("Uskoro");
			break;
		case NIKAD:
			System.out.println("Nikad");
			break;
		}
	}

}
