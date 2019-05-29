package day40_CustomClasses_Methods;

public class MyContacts {

	public static void main(String[] args) {
		
		// create Contact object
		
		Contact trump = new Contact();
		trump.name = "Donald Trump";
		trump.phoneNumber = "(222) 333-4444";
		trump.email = "donald@thewhitehouse.com";
		
		trump.call();
		trump.sendMessage();
		trump.sendEmail();
		
		
		System.out.println("##### CHYK ESHIKKE #####");
		
		Contact soke = new Contact();
		soke.name = "Sooronbai Jeenbekov";
		soke.phoneNumber = "(996555)567-9878";
		soke.email = "sokekyrgyz#1@president.kg";
		
		System.out.println("Name: " + soke.name);
		System.out.println("PhoneNumber: "+soke.phoneNumber);
		System.out.println("Email: "+soke.email);
		
		trump.call();
		
		
	}
}
