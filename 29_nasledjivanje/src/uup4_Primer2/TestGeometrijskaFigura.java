package uup4_Primer2;

public class TestGeometrijskaFigura {

	public static void main(String[] args) {

		Kvadrat[] k = new Kvadrat[4];

		k[1] = new Kvadrat(25.5);
		k[2] = new Kvadrat(10.5);
		k[3] = new Kvadrat(5.0);

		for (int i = 1; i <k.length; i++)
			System.out.println("Površina kvadrata br." + i + ". iznosi = " + k[i].izracunajPovrsinu()
					+ ", a obim iznosi = " + k[i].izracunajObim());

	}

}
