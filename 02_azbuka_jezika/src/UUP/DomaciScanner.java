package UUP;

import java.util.*;
public class DomaciScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Unesite ime jednog dana u nedelji: ");
		String stringValue = scanner.next();
		
		System.out.print("Zemlja je planeta. Unesite odgovor false ako nije ili true ako jeste: ");
		boolean booleanValue = scanner.nextBoolean();

		//System.out.print("Unesite vaše ime i prezime: ");
		//String nameValue = scanner.nextLine();
		
		System.out.print("Unesite ceo broj od -128 do 127: ");
		byte byteValue = scanner.nextByte();
		
		System.out.print("Unesite ceo broj od -2147483648 do 2147483647: ");
		int intValue=scanner.nextInt();
		
		System.out.print("Unesite ceo broj od -32768 do 32767: ");
		short shortValue = scanner.nextShort();
		
		System.out.print("Unesite ceo broj od -9223372036854775808 do 9223372036854775807: ");
		long longValue = scanner.nextLong();
		
		System.out.print("Unesite decimalni broj od 1.4E-45 do 3.4028235E38: ");
		float floatValue = scanner.nextFloat();
		
		System.out.print("Unesite decimalni broj od 4.9E-324 do 1.7976931348623157E308: ");
		double doubleValue = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println("\nZa dan u nedelji uneli ste " + stringValue + ".");
		System.out.println("Osim toga, uneli ste brojeve... \ntipa byte: " + byteValue);
		System.out.print("tipa short: " + shortValue + " \ntipa integer: " + intValue + " \ntipa long: " + longValue + " \ntipa float: " + floatValue + " \ntipa double. " + doubleValue + " \na za tvrdnju da je Zemlja planeta smatrate da je " + booleanValue + ".");
		// System.out.print("Uzgred, vaše ime i prezime glasi: " + nameValue + ".");
	}

}
