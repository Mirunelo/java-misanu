package zadatak_04;

public class Zadatak04 {

	public static void main(String[] args) {

		int niz[] = { 34, 5, 43, 747, 134, 4556, 4, 75, 73, 2, 767, 342, 4, 7, 784 };
		
		int sp = 0;
		int sn = 0;
		
		for(int i : niz)
			if(i%2==0)
				sp++;
			else
				sn++;
		
		System.out.println("Niz sadrži:");
		System.out.println("- parnih brojeva:   " + sp);
		System.out.println("- neparnih brojeva: " + sn);
		
	}

}
