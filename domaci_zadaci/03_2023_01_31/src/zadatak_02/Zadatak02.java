package zadatak_02;

import java.util.Random;

public class Zadatak02 {

	public static void main(String[] args) {

		Random rd = new Random();

		System.out.println("Generišemo 5 slučajnih brojeva celobrojnog tipa:\n");

		for (int i = 1; i <= 5; i++)
			System.out.println(rd.nextInt());

	}

}
