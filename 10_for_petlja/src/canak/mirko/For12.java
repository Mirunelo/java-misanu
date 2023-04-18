package canak.mirko;

public class For12 {

	public static void main(String[] args) {

		int suma=0;
		
		for (int i = 1; i <= 20; ++i)
		{
			if (i%3==0)
			{
				++suma;
			}
		}
		System.out.println("U intervalu od 1 do 20 ima " + suma + " brojeva deljivih sa 3.");
		
	}

}
