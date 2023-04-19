package uup7_Primer4_Kompozicija_RelacijaIma;

public class HonorarniTaksista extends Taksista {
	int honorarniSati;
	
	public void zadajHonorarneSate(int sati) {
		honorarniSati = sati;
	}
	
	public int uzmiHonorarneSate() {
		return honorarniSati;
	}
}