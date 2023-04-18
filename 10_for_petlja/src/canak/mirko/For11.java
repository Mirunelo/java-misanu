package canak.mirko;

public class For11 {

	public static void main(String[] args) {

		int s, d, j;
		
		for (int i=100; i<=999; ++i)
		{
			s = i/100;
			d = (i / 10) % 10;
			j = i % 10;
			int a = s * s * s + d * d * d + j * j * j;
			if (a==i)
			{
				System.out.println("Armsrongov broj: " + a);
			}
			
		}
		
	}

}
