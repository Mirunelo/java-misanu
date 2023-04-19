package mirkoCanak;

public class Zadatak_1 {

	public static void main(String[] args) {

		int x[] = { 108, 236, 100, 248 };
		int suma = 0;

		System.out.println("Suma članova niza X:");
		for (int i = 0; i < 4; i++) {
			System.out.print(x[i] + ", ");
			if (x[i] % 10 == 8)
				suma += x[i];
		}

		System.out.println("\nčija je cifra jedinica 8, iznosi: " + suma + ".");

	}

}