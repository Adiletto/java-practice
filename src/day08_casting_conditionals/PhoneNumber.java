	
	package day08_casting_conditionals;
	import java.util.Scanner;
 	public class PhoneNumber {
	public static void main(String[] args) {
			// TODO Auto-generated method stub

			//Write a program that asks user to input int values: areaCode and localNumber.
			//-Using concatenation put together in this format and assign to String phoneNumber  variable:
			//-(222)-3334444
			//-Write a print statement that displays (use phoneNumber variable ): 
			//Calling number (222)-3334444
			
			
			
		Scanner scan = new Scanner (System.in);
		
			
			System.out.println("Enter your area code: ");
			int areaCode = scan.nextInt();
			
			System.out.println("Enter local number: ");
			int localNumber = scan.nextInt();
			//(617)-8202117
			String phoneNumber = "(" + areaCode + ")-" + localNumber;
			
			System.out.println("Calling number " + phoneNumber);
			
			
		}

	}



