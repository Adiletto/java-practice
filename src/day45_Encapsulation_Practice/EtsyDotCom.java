package day45_Encapsulation_Practice;

public class EtsyDotCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EtsyAccount acct1 = new EtsyAccount();
		System.out.println(acct1.toString());
		acct1.setEmail("pumev@mrmail.com");
		acct1.setFirstName("Pumev");
		acct1.setPassword("bulgaria123");
		System.out.println(acct1.toString());
		
		System.out.println("#############");
		
		EtsyAccount acct2 = new EtsyAccount();
		acct2.setEmail("helirevaroyalhost.info");
		acct2.setFirstName("helireva123");
		acct2.setPassword("abc12");
		System.out.println(acct2.toString());
		
		System.out.println("#############");
		
		EtsyAccount acct3 = new EtsyAccount("helireva@royalhost.info", "Helireva", "royal123");
		System.out.println(acct3.toString());
		
		
		EtsyAccount acct4 = new EtsyAccount("woodenspoon@@gmail.com", "WdSpoon");
		System.out.println(acct4.toString());
		
		final String password = "38ji9d";
		
	}

}
