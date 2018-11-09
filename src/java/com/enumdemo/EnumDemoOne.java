package java.com.enumdemo;

public class EnumDemoOne {
	
	public static void main(String[] args) {
		
		Countries code = Countries.CANADA;
		System.out.println(code.getCountryCode());
		
		Countries code1 = Countries.CANADA;
		System.out.println(code1.getCountryCode());

	}

}
