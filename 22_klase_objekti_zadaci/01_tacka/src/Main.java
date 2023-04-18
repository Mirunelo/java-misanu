
public class Main {

	public static void main(String[] args) {

		Tacka t1 = new Tacka(2, 5);
		Tacka t2 = new Tacka(3.0, 6.0);

		System.out.println(t1.getX());
		System.out.println(t1.getY());
		System.out.println(t1.ispisi()+"\n");
		
		System.out.println(t2.getX());
		System.out.println(t2.getY());
		System.out.println(t2.ispisi());

	}

}
