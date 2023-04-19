package zadatak1;

public class TackeURavni {

	// Tačka u ravni opisana je dvema koordinatama X i Y
	private double x, y;

	// Konstruktor bez parametara za postavljanje default vrednosti X i Y = 0
	public TackeURavni() {
	}

	// Parametrizovani konstruktor za postavljanje X i Y koordinata tačke
	public TackeURavni(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Set-eri za postavljanje koordinata tačke
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	// Get-eri za dohvatanje koordinata tačke
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	// Metoda za računanje rastojanja između dve tačke
	public double rastojanje(TackeURavni tacka2) {
		double xa = this.x;
		double ya = this.y;
		double xb = tacka2.getX();
		double yb = tacka2.getY();
		return Math.sqrt(Math.pow((xb - xa), 2) + Math.pow((yb - ya), 2));
	}
	// Vraća String sa opisom tačke (koordinate X i Y)
	public String opisTacke() {
		return "X = " + this.x + "\tY = " + this.y;
	}

}
