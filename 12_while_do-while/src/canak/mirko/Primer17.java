package canak.mirko;
import java.util.Scanner;
public class Primer17 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int n, k;
		double s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		System.out.print("Unesite vrednost za k: ");
		k = ulaz.nextInt();
		int i = 0;
		while(i <= n){
			s += (i+1)/(double)(k+i);
			++i;
			}
		System.out.println("Suma je "+s); ulaz.close();
		} 
	}