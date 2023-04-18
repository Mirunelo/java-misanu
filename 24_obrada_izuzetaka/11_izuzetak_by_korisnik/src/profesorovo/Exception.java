package profesorovo;

public class Exception {

	public static void checkAge(int age) throws InvalidAgeException {

		/*
		 * throws se koristi u zaglavlju metode da naglasi tipove izuzetaka koje baca
		 * metoda, a throw se koristi za bacanje izuzetka u telu metode.
		 */
		System.out.println("Checking Age Validity: (" + age + ")");
		if (age < 0 || age > 100)
			throw new InvalidAgeException(age);
		System.out.println("Age: " + age + " is a valid age.");
	}

	public static void main(String[] args) {
		try {
			checkAge(25);
			checkAge(-5);
		} catch (InvalidAgeException e) {
			System.out.println("Caught: " + e);
		} finally {
			System.out.println("Finally blok.");
		}
	}

}
