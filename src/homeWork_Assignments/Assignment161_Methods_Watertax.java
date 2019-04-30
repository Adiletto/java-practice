package homeWork_Assignments;

public class Assignment161_Methods_Watertax {

	//class Main {
		  public double waterTax(double units)
		  {
		    double bill = 0.0;
		    
		    //your code here
		    double fine = 50;
		    if (units <= 50 ) {
		      bill = units * 0.60;
		    }else if (units > 50) {
		      bill= units * 0.90;
		    }else if ( units > 100 && units < 150 ) {
		     bill= units * 0.90;
		      bill+=fine;
		    }
		    bill= units * 0.90;
		      bill+=(fine*2);
		    
		    
		    //end your code here
		    
		    
		    return bill;
		  }//end waterTax

		  
		}
	
	

