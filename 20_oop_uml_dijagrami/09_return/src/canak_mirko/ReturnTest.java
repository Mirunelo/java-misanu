package canak_mirko;

public class ReturnTest {

	public static void test() {
		int a = 10;
		System.out.println("BBB");
		if (a == 10)
			return; /* Vraćamo se u glavni program */
		System.out.println("CCC");
	}
	
	public static void main(String[] args) {
		
		System.out.println("AAA");
		test();
		System.out.println("DDD");

	}

}
