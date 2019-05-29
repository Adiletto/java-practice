package day14_String_Manipulation;

public class StringSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Good Morning";
		//check if it match "Good Morning" and print match
		
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		} else {
			System.out.println("Not Match");
		}
		
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore Case");
		}else {
			System.out.println("Not Match - ignore case");
		}
		
		// Convert to All uppercase and print
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1); //it stays as old value. not value
		str1 = str1.toUpperCase();
		System.out.println("After Assignment: "+str1);
		
		//combine the above methods together:
		//convert to all lowercase first then check if it equals ("good morning")
		
				//good morning =====> good morning
		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods: do not match");
		}
		
		
		// FIND OUT HOW MANY CHARACTERS IN THE STRING
		
		String myName = "Adilet";
		
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My name's length:"+length);
		
		//usernames must be exactly 8 characters.
		
		String userName = "password";
		
		if (userName.length()==8) {
			System.out.println("Valid username");
		} else {
			System.out.println("inValid username, must be 8 chars min");
		}
			
		
		String password = "woodenSpooen";
		
		//1)
		if (password.length()>=6) {
			System.out.println("Password is good");
		}else {
			System.out.println("Password is too short");
		}
		
		//2)
		int passwordLength = password.length();
		
		if (passwordLength < 6) {
			System.out.println("Invalid password. Too short");
		} else {
			System.out.println("Valid password, good job");
		}
		
		
		
	}

}
