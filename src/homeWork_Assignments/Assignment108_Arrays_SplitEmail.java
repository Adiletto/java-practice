package homeWork_Assignments;

import java.util.*;

public class Assignment108_Arrays_SplitEmail {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String email = input.nextLine();

		// Write your code below
		String id []= email.split("@");
//		if (!email.contains("@")) {
//			System.out.println("Invalid email");
//			return;
//		}
		
		int count =0;
		for (int i =0; i < email.length(); i++) {
			if (email.substring(i, i+1).equals("@")) {
				count++;
			}
		}
		
		
		if (count == 1) {
			System.out.println("Email id: "+id [0]);
			System.out.println("Email domain: "+id[1]);
		}else {
			System.out.println("invalid email");
		}
		
		
		
		
		
		
		
		
		
		
		
		//email -> info@cybertekschool.com
//		Print:  
//		Email id: info
//		Email domain: cybertekschool.com	
		
		
		
		
		
		
		
		
	}

}
