package UUP;

import java.io.*;
public class DomaciBuffer {

	public static void main(String[] args) throws Exception {
		
		//Unos podataka:
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Zemlja je planeta. Unesite odgovor false ako nije ili true ako jeste: ");
		boolean booleanValue = Boolean.parseBoolean(ulaz.readLine());
		
		System.out.print("Unesite ceo broj od -128 do 127: ");
		byte byteValue = Byte.parseByte(ulaz.readLine());
		
		System.out.print("Unesite ceo broj od -2147483648 do 2147483647: ");
		int intValue = Integer.parseInt(ulaz.readLine());
		
		System.out.print("Unesite ceo broj od -32768 do 32767: ");
		short shortValue = Short.parseShort(ulaz.readLine());
		
		System.out.print("Unesite ceo broj od -9223372036854775808 do 9223372036854775807: ");
		long longValue = Long.parseLong(ulaz.readLine());
		
		System.out.print("Unesite decimalni broj od 1.4E-45 do 3.4028235E38: ");
		float floatValue = Float.parseFloat(ulaz.readLine());
		
		System.out.print("Unesite decimalni broj od 4.9E-324 do 1.7976931348623157E308: ");
		double doubleValue = Double.parseDouble(ulaz.readLine());

		// Štampanje unetih podataka:
		
		System.out.println("\nUneli ste boolean vrednost: " + booleanValue);
		System.out.println("Uneli ste byte vrednost: " + byteValue);
		System.out.println("Uneli ste integer vrednost: " + intValue);
		System.out.println("Uneli ste short vrednost: " + shortValue);
		System.out.println("Uneli ste long vrednost: " + longValue);
		System.out.println("Uneli ste Float vrednost: " + floatValue);
		System.out.println("Uneli ste double vrednost: " + doubleValue);
	}

}
