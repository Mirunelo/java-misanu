package canak_mirko;

public class Main {

	public static void main(String[] args) {

		OkreniString os = ( str ) -> {
			String rezultat = "";
			for( int i = str.length() - 1; i >= 0; i--)
				rezultat += str.charAt(i);
			return rezultat;
		}; /* Lambda izraz koji ima vitičaste zagrade završava se sa ; */
		
		System.out.println("proveri\n" + os.OkreniderString("proveri"));
		System.out.println("Java okrenuto glasi: " + os.OkreniderString("Java"));
		
	}

}
