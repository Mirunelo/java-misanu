package canak.mirko;
import java.util.Scanner;
public class Primer18 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int n;
		double s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		int i = 1;
		while (i <= n){
			s += i / Math.pow((2 * i - 1), 2);
			i++;
			}
		System.out.println("Suma je: " + s);
		ulaz.close();
		}
	}