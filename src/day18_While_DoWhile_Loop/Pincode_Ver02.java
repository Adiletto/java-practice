package day18_While_DoWhile_Loop;
import java.util.*;
public class Pincode_Ver02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int secretPincode = 4321;
		
		//give only 3 attempts
		//if attempts reaches more than 3 print card blocked
		int pincode = 0;
		int attempts = 1;
		
		while (pincode != secretPincode && attempts <= 3) {
			System.out.println("Enter pincode:");
			pincode = scan.nextInt();
			attempts++;
			
			if (attempts == 3 && pincode != secretPincode) {
				System.out.println("car is blocked");
				return;
			}
		}
		
		System.out.println("Acces granted! Select Operation");
	}

}
