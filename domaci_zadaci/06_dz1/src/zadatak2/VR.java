package zadatak2;

public class VR {

	private int [] vr;
	private int brojilac;
	private int imenilac;
	private int i;
	
	public VR(int n, int x, int y) {
		vr = new int[n];
		brojilac = x;
		imenilac = y;
	}
	
	public void verizniRazlomak() {
		int koef;
		int mod = 0;
		for(i = 0; i < vr.length; i++) {
			koef = brojilac/imenilac;
			mod = brojilac%imenilac;
			vr[i] = koef;
			brojilac = imenilac;
			imenilac = mod;
			if (mod == 0) {
				vr[i] = koef;
				break;
			}
		}
	}
	
	public String opisRazlomka() {
		String s = "{ ";
		for(int j = 0; j <= i && j < vr.length; j++) {
			if (j == i || j == vr.length - 1)
				s += vr[j] + " }";
			else
				s += vr[j] + ", ";
		}
		return s;
			
	}
	
}
