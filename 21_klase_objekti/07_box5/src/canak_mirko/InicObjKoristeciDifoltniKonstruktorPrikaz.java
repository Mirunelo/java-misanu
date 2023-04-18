package canak_mirko;

public class InicObjKoristeciDifoltniKonstruktorPrikaz {

	public static void main(String[] args) {

		Box b1 = new Box();
		Box b2 = new Box();
		
		b2.depth = 5;
		b2.height = 5;
		//b3.width = 5; // ovo daje grešku zato što je width private podatak u klasi Box.

		System.out.println("Zapremina " + b1.volume());
		System.out.println("Zapremina " + b2.volume());

	}

}
