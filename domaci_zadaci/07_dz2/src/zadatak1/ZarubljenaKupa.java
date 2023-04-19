package zadatak1;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZarubljenaKupa {
	
	// Parametri zarubljene kupe
	private double r1;
	private double r2;
	private double h;
	private static int id;
	private int broj;
	
	// Konstruktori:
	public ZarubljenaKupa() throws IOException {
		r1 = 2.0;
		r2 = 1.0;
		h = 1.0;
		id++;
		broj = id;
		this.upisUDatoteku();
	}
	
	public ZarubljenaKupa(double r1, double r2, double h) throws IOException {
		this.r1 = r1;
		this.r2 = r2;
		this.h = h;
		id++;
		broj = id;
		this.upisUDatoteku();
	}

	// Geteri:
	public double getR1() {
		return r1;
	}

	public double getR2() {
		return r2;
	}

	public double getH() {
		return h;
	}
	
	// Reset ID-a;
	public void resetID() {
		id = 0;
	}
	
	// Zapremina zarubljene kupe
	public double zapreminaKupe() {
		double v = Math.PI * getH() * (getR1() * getR1() + getR2() * getR2() + getR1() * getR2()) / 3;
		return v;
	}
	
	// Da li je manja zapremina zarubljene kupe od zadate zk
	public boolean manjaZapremina(ZarubljenaKupa zk) {
		boolean test = this.zapreminaKupe() < zk.zapreminaKupe();
		return test;
	}

	public String opis() {
		return "k" + broj + "(" + getR1() + ", " + getR2() + ", " + getH() + ")";
	}
	
	public void upisUDatoteku() throws IOException {
		FileOutputStream fos = new FileOutputStream("zarubljeneKupe" + this.broj + ".txt");
		DataOutputStream dos = new DataOutputStream(fos);
		String str = this.opis() + "\n";
		dos.writeBytes(str);
		dos.close();
	}
	
	public void procitajDatoteku() throws IOException {
		int ch;
		for(int i = 1; i <= id; i++) {
			FileInputStream fis = new FileInputStream("zarubljeneKupe" + i + ".txt");
			while((ch = fis.read()) != -1) {
				System.out.print((char)ch);
			}
			fis.close();

		}
	}
	
}