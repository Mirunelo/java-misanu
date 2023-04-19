package dodatak;

import java.util.Scanner;

public class Zadatak_09_AI {

	public static int calculateF(int n) {
		if (n == 1) {
			return 3;
		}
		int F_n_1 = calculateF(n - 1);
		int G_n_1 = calculateG(n - 1);
		return 3 * F_n_1 + 2 * G_n_1;
	}

	public static int calculateG(int n) {
		if (n == 1) {
			return 2;
		}
		int F_n_1 = calculateF(n - 1);
		int G_n_1 = calculateG(n - 1);
		return F_n_1 + 2 * G_n_1;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a natural number n: ");
		int n = scanner.nextInt();
		int F = calculateF(n);
		System.out.println("F(" + n + ") = " + F);
		scanner.close();
	}
	/*
	 * In this example, the main method prompts the user to enter a natural number n
	 * and then calls the calculateF method with that value as its argument. The
	 * calculateF method uses the first recursive relation to calculate F(n) in
	 * terms of F(n-1) and G(n) by using the second method calculateG to obtain
	 * G(n-1) value. The calculateG method uses the second recursive relation to
	 * calculate G(n) in terms of F(n-1) and G(n-1) by using the calculateF method
	 * to obtain F(n-1) value. Both of the methods have a base case where if n = 1
	 * then F(1) = 3 and G(1) = 2 respectively. When the calculateF method finishes
	 * executing, it returns the value of F(n), which is then printed to the console
	 * by the main method.
	 */
}