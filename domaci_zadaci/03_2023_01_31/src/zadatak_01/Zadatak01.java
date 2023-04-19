package zadatak_01;

import java.util.Random;

public class Zadatak01 {

	public static void main(String[] args) {

		Random rd = new Random();

		int i = rd.nextInt();
		float flo = rd.nextFloat();
		boolean boo = rd.nextBoolean();
		double dou = rd.nextDouble();
		byte byt[] = new byte[1];
		rd.nextBytes(byt);

		System.out.println("Slučajno generisani brojevi:\n\n" + "Tip:\t" + "\tbroj:\n");
		System.out.println("Integer\t\t" + i);
		System.out.println("Float\t\t" + flo);
		System.out.println("Boolean\t\t" + boo);
		System.out.println("Double\t\t" + dou);
		System.out.println("Byte\t\t" + byt[0]);

	}

}
