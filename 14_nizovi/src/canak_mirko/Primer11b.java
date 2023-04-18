package canak_mirko;
import java.io.*;
public class Primer11b {
	public static void main(String[] args) throws Exception {
		
		int[] x = new int[100];
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite broj elemenata n niza x:");
		int n = Integer.parseInt(ulaz.readLine());
		
		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Integer.parseInt(ulaz.readLine());
		}
		
		int imax = 1;
		
		for (int i = 2; i <= n; i++)
			if (x[i] > x[imax]) imax = i;
		
		System.out.println("Indeks maksimalnog elementa ( " + x[imax] + " ) je " + imax);
		
		}
	}