package canak.mirko;

import java.util.Scanner;

public class IfObnavljanje {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		int broj = sc.nextInt();
		
		sc.close();
		
		if(/*uslov*/ broj > 0) /* uslov pišemo logičkim operatorima */
		{
			System.out.println("Uneti broj je pozitivan!");
		}
		else if (broj<0)
		{
			System.out.println("Uneti broj je negativan!");
		}
		else
		{
			System.out.println("Unet je broj (cifra) 0.");
		}
		
	}

}
