package praksaNEW;

public enum TipSmajlija {
SRECNI("[😄🙂😊😍]"), TUZNI("[😢😭😞👿]"), LJUBAVNI("[😍😘]");

	private String smajliji;
	
	TipSmajlija(String kombinacija) {
		smajliji = kombinacija;
	}

	public String getSmajliji() {
		return smajliji;
	}
	
}
