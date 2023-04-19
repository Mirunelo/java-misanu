package zadatak4;

import java.text.DecimalFormat;

public class Hrana extends Namirnica {
	
	private double tezina, procUdeoBelancevine, procUdeoMasti, procUdeoUH;
	
	Hrana(String ime, double t, double b, double m, double uh) throws Exception{
		super(ime);
		tezina = t;
		try {
			if(b + m + uh > 100) {
				throw new Exception("Greška! Zbir procentualnih udela belančevina, masti i ugljenih hidrata prelazi 100%");
			}
			else {
				procUdeoBelancevine = b;
				procUdeoMasti = m;
				procUdeoUH = uh;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public double getTezina() {
		return tezina;
	}

	public double getTUdeoBelancevine() {
		return tezina * procUdeoBelancevine / 100;
	}

	public double getTUdeoMasti() {
		return tezina * procUdeoMasti / 100;
	}

	public double getTUdeoUH() {
		return tezina * procUdeoUH / 100;
	}

	@Override
	public String opis() {
		DecimalFormat df = new DecimalFormat("#.###");
		String s;
		if(energetskaVrednost() == 0)
			s = super.opis() + tezina + " g, Greška! Zbir procentualnih udela belančevina, masti i ugljenih hidrata je veći od 100%)";
		else
			s = super.opis() + tezina + " g, " + df.format(energetskaVrednost()) + " kJ)";
		return s;
	}

	@Override
	public double energetskaVrednost() {
		return getTUdeoBelancevine() * BELANCEVINE + getTUdeoMasti() * MASTI + getTUdeoUH() * UH;
	}
	
}
