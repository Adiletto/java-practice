package day06_Operators;

public class IncrementDecrement {
	public static void main (String [] args) {
		
		int employees = 50;
		System.out.println("Employees: " + employees );
		
		
		employees++; // add 1;
		employees++; // add 1 more;
		employees += 1; 
		employees = employees + 1;
		System.out.println("Employees: " + employees );
		
		employees--;                                 //====\
		System.out.println("Employees: " + employees);//    ====> same thing (optional)
		--employees;                                //=====/
		System.out.println("Employees: " + employees);
		
	
		
	}

}
