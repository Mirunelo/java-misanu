package uup2;

public class Krug extends Oblik{
	double poluprecnik;
	
	public Krug(double r) {
		poluprecnik = r;
}
	public double uzmiPovrsinu() {
		povrsina = Math.PI * (poluprecnik * poluprecnik);
		return povrsina;
	}
}
