package homeWork_Assignments;
import java.util.*;
public class Assignment083_Party {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
			System.out.println("Please enter guest name:");
			String name = input.next();
			System.out.println("Do you want to enter new guest name:");
			String newGuest = input.next();
			
			
			while (newGuest.equalsIgnoreCase("yes")) {
				System.out.println("Please enter guest name:");
				String name2 = input.next();
			name = name +", "+name2;
				System.out.println("Do you want to enter new guest name:");
				newGuest = input.next();
				
				}
			System.out.println("Guest's list: "+name);
			}
	}


