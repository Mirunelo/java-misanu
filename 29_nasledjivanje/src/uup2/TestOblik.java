package uup2;

public class TestOblik {
	
	public static void main(String[] args) {
		
		Krug k = new Krug(1);
		System.out.println("Površina kruga je " + k.uzmiPovrsinu());
		Pravougaonik p = new Pravougaonik(4, 5);
		System.out.println("Površina pravougaonika je " + p.uzmiPovrsinu());
		Kvadrat kv = new Kvadrat(6);
		System.out.println("Površina kvadrata je " + kv.uzmiPovrsinu());
	}
}