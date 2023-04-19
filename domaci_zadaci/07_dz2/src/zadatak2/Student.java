package zadatak2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
	
	private String ime;
	private long brIndexa;
	private Ispit[]nizIspita;
	private int brojac;
	private ArrayList<Student> studenti = new ArrayList<Student>();
	
	public Student() {
		studenti.add(this);
	}
	
	public ArrayList<Student> getStudenti() {
		return studenti;
	}

	public Student(String i, long index) {
		ime = i;
		brIndexa = index;
		nizIspita = new Ispit[40];
	}
	
	public Student(String i, long index, int kapacitet) {
		ime = i;
		brIndexa = index;
		nizIspita = new Ispit[kapacitet];
	}
	
	public void dodajIspit(String s, int o) {
		try {
			nizIspita[brojac] = new Ispit(s, o);
			brojac++;
			System.out.println("Ispit -> " + nizIspita[brojac - 1].opisIspita() + " je uspešno dodat.");
		}catch(ArrayIndexOutOfBoundsException e) {
			Ispit errIspit = new Ispit(s, o);
			System.err.println("Ispit -> " + errIspit.opisIspita() + " se ne može dodati. Nema mesta u nizu!");
		}
	}
	
	public double srednjaOcena() {
		int so = 0;
		int br = 0;
		for(int i = 0; i < brojac; i++)
			if (nizIspita[i].getOcena().getOcena() > 5 ) {
				so += nizIspita[i].getOcena().getOcena();
				br++;
			}
		return (double) so/br;
	}
	
	public int getGodUp() {
		String number = String.valueOf(brIndexa);
		String godina = number.substring(0, 4);
		return Integer.parseInt(godina);
	}
	
	public long getRegBr() {
		String number = Long.toString(brIndexa);
		String regBr = number.substring(4, number.length());
		return Long.parseLong(regBr);
	}

	public void dodajStudenta(String i, long brInd, int kap) {
		boolean test = true;
		for(Student e : studenti)
			if(e.brIndexa == brInd) {
				System.err.println("Ne sme se praviti kopija studenta sa indeksom br." + brInd + " !!!");
				test = false;
				break;
			}
		
		if(test) {
			studenti.add(new Student(i, brInd, kap));
			System.out.println("Dosije studenta " + i + " je uspešno kreiran sa indeksom broj " + brInd);
		}
		
	}
	
	public String opis() {
		DecimalFormat df = new DecimalFormat("#.0");
		return ime + "[" + getGodUp() + "/" + getRegBr() + ":" + df.format(srednjaOcena()) + "]";
	}
	
}
