package uup8_Primer5;

public class MasinaZaVes extends Uredjaj {
	
	int program = 1;
	int temperatura;
	
	MasinaZaVes(String marka, boolean ukljucen, int program, int temperatura) {
		super(marka, ukljucen);
		if (program >= 1 && program <= 5)
			this.program = program;
		else System.out.println("Greška: Vrednost podatka program mora biti između 1 i 5.");
		if (temperatura >= 0)
			this.temperatura = temperatura;
		else System.out.println("Greška: Vrednost podatka temperatura mora biti veća od nule.");
	}
	
	public void promeniProgramNavise() {
		if (program < 5) program++;
		else program = 1;
	}
	
	public void promeniProgramNanize() {
		if (program > 1)
			program--;
		else program = 5;
		
	} public void ispisi() {
		super.ispisi();
		System.out.println("Trenutno je pokrenut " + program + ". program i podešena temperatura " + temperatura);
	}
}