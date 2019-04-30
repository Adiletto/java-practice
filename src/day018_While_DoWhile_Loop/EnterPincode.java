package day018_While_DoWhile_Loop;
import java.util.*;
public class EnterPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		int secretPincode = 1234;
		int randomPin = 0;
		
		while (randomPin != secretPincode) {
			System.out.println("Enter pin");
			randomPin = scan.nextInt();
		}
		System.out.println("Acces granted");
	}

}
