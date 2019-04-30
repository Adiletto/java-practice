package day010_LogicalsOperators_conditionals;

public class IfStatementWithBooleanVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   boolean isBreakTime = true;
   
   if (isBreakTime == false) {
	   System.out.println("Break untill 8:35pm");
   } else {
	   System.out.println("Not Break time yet.");
   }
		
   	//SECOND VERSION
   
   if (isBreakTime) {
	   System.out.println("Break till 8:35pm");
   } else {
	   System.out.println("Not Break time yet.");
   }
   
   boolean classTime = false;
   if(classTime) {
	   //if(classTime == true;)
		   System.out.println("Come back on time!");
		   System.out.println("Stop talking");
		   System.out.println("Pay Attention");
		   System.out.println("Code and have fun!");
	} else {
	System.out.println("Take a walk and have some water.");	
	}
   
   boolean qualified = false;
   //send a notification message if not qualified
   // we need to check if qualified variable contains FALSE
   
   if(qualified == false) {
	   System.out.println("Your application was not approved. Thank you!");
	   
   }
   
   
   
   
	}

}
