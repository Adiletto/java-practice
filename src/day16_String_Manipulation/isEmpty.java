package day16_String_Manipulation;

public class isEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName = "";
		String password = "";
		System.out.println(userName.isEmpty());

		if (userName.isEmpty()) {
			System.out.println("Username field CAN NOT be empty");
		} else {
			System.out.println("Username is NOT empty");
		}

		
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password fields CAN NOT be empty");
		} else {
			System.out.println("Username or password fields are NOT empty");
		}

		
		if (userName.length()==0) {
			System.out.println("Username length is 0, so it's empty");
		}
		
		
		
		
		
		
		
		
		
	}

}
