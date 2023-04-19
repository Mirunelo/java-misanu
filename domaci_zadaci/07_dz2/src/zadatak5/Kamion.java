package zadatak5;

public class Kamion extends Vozilo{
	
	private double nosivost;
	private double tovar;
	
	public Kamion(double t, double nosivost) {
		super("Kamion", t);
		this.nosivost = nosivost;
		tovar = 0;
	}

	@Override
	public double ukupnaTezinaVozila() {
		return getSopstvenaTezina() + tovar;
	}
	
	public void dodajTovar(double t) {
		if((tovar + t) <= nosivost) {
			tovar += t;
			System.out.println("Na kamion nosivosti " + nosivost + " kg, dodali ste tovar od " + t + " kg. Ukupno natovareno: " + tovar + " kg.");
		}
		else
			System.err.println("Gtreška! Teret od " + t + " kg bi pretovario kamion za " + (tovar + t - nosivost) + " kg!");
	}
	
	public void skiniTovar(double t) {
		double tovarBackup = tovar;
		tovar -= t;
		if(tovar < 0) {
			System.out.println("Na kamionu nema " + t + " kg tovara. Skinuli ste " + tovarBackup + " kg i ispraznili kamion.");
			tovar = 0;
		}
		else
			System.out.println("Skinuli ste " + t + " kg tovara sa kamiona. Ostalo je još " + tovar + " kg natovareno.");
		
	}

	@Override
	public String opis() {
		return super.opis() + "[ natovaren teretom: " + tovar + " kg ]";
	}
	
	

}
