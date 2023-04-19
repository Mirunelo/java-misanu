package zadatak3;

public class StambenaZgrada {

	private double povrsinaOsnove;
	private int brSpratova;
	private int brojStanova;
	
	public StambenaZgrada(double povrsina, int spratovi, int stanovi) {
		povrsinaOsnove = povrsina;
		brSpratova = spratovi;
		brojStanova = stanovi;
	}

	public double getPovrsinaOsnove() {
		return povrsinaOsnove;
	}

	public int getBrSpratova() {
		return brSpratova;
	}

	public int getBrojStanova() {
		return brojStanova;
	}
	
	public int ukupanBrStanova() {
		return getBrojStanova() * getBrSpratova();
	}
	
	public double prosecnaPovrsinaStanova() {
		return getPovrsinaOsnove() / (double) getBrojStanova();
	}
	
	public String opisZgrade() {
		return "it<<zgrada, " + getPovrsinaOsnove() + "/" + getBrSpratova() + "/" + getBrojStanova();
	}
	
}
