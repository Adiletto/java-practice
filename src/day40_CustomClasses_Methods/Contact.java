package day40_CustomClasses_Methods;

public class Contact {

	String name;
	String email;
	String phoneNumber;
	
	
	
	public void call() {
		System.out.println("Calling " + name +" ... ");
	}
	
	public void sendMessage () {
		System.out.println("Sending text message to " + phoneNumber + " | name: " + name);
	}
	
	public void sendEmail () {
		System.out.println("Sending an email to "+email + " ... ");
	}
}
