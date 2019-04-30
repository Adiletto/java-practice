package day011_Logical_Nestedif;

public class OR_Logic_With_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'C';
		//A, B, C -> pass     D, E -> Fail    Invalid Grade
		
		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
		case 'E':
			System.out.println("Fail");
			break;
			default:
				System.out.println("Invalid Grade");
			
		}
		
		
		
		
		
		
		
	}

}
