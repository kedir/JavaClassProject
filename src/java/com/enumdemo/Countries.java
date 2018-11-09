package java.com.enumdemo;

public enum Countries {
	
	USA ("US"),
	CANADA ("CN"),
	CHINA ("CH"),
	JAPAN ("JP");
	
	private final String shortCode;

	private Countries(String shortCode) {
		this.shortCode = shortCode;
	}
	
	public String getCountryCode() {
		return this.shortCode;
	}

}
