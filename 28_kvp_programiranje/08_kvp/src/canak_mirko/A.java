package canak_mirko;

public class A implements Runnable{
	
	String ime; /* Ime inti. */
	Thread t;
	
	A(String name){
		ime = name;
		t = new Thread(this, ime); // this je 
		t.start();
	}

	@Override
	public void run() {
		try {
		for(int i = 1; i <= 5; i++) {
			System.out.println(ime + " = " + i);
			Thread.sleep(500);
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
