package day011_Logical_Nestedif;

import java.util.Scanner;
public class Assignment041_SchoolSystem {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class Main {
			  public static void main(String[] args) {
			    //DO NOT CHANGE
			    Scanner scan = new Scanner(System.in);
			    System.out.println("Enter age:");
			    //WRITE YOUR CODE HERE 
			  int inputAge;
			  
		 inputAge = scan.nextInt();    // DYNAMIC VALUE
		
		if (inputAge < 2 && inputAge >18) {
			System.out.println("Ineligible");
			}else if (inputAge == 2) {
				System.out.println("toddler");
			} else if (inputAge >= 3 && inputAge <= 5) { // (age ==3 || age == 4 || age ==5)
				System.out.println("early childhood");
			} else if (inputAge == 6 || inputAge == 7) { // (age >= && age <=7)
				System.out.println("young reader");
			}else if (inputAge >= 8 && inputAge <= 10) { // (age ==8 || age == 9 || age ==10)
				System.out.println("elementary");
			} else if (inputAge == 11 || inputAge == 12) {
				System.out.println("middle");
			}else if (inputAge == 13) {
				System.out.println("impossible");
			} else if (inputAge >= 14 && inputAge <=16 ) {
				System.out.println("high school");
			} else if (inputAge == 17 || inputAge == 18) { //(age >=17 && age <=18 )
				System.out.println("scholar");
			}
		
		}
	}	
		
