package zadatak3;

import java.util.ArrayList;
import java.util.List;

public class Voz {
	
	List<Object> kompozicija = new ArrayList<Object>();
	int brVagona;
	
	Voz(Lokomotiva lok, Vagon vag, int brVagona){
		this.brVagona = brVagona;
		kompozicija.add(lok);
		for(int i = 0; i < brVagona; i++)
			kompozicija.add(vag);
	}
	
	// Kod će biti dostupan od v1.5 - nisam imao vremena

}
