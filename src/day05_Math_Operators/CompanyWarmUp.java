package day05_Math_Operators;

public class CompanyWarmUp {
	public static void main (String [] args) {
		// Declare Variables: CompanyName
	                  //Address
	                  //numberOfEmployees, Revenue, isTechCompany 
	
	
	String companyName = "Facebook";
		String address = "Silicon Valley, CA";
			int numberOfEmployees = 10000; 
				long revenue = 40000001111L;         // can be int,too (is amount is smaller)
					boolean isTechCompany = true;
	
					System.out.println("Company name is " + companyName);
				System.out.println("Address is " + address);
			System.out.println("Number of employess is " + numberOfEmployees);
		System.out.println("Annual revenue of the company is " + revenue);
	System.out.println("Is it a tech company?-" + isTechCompany);
	
	
	
	
	             //System.out.println(revenue + IsTechCompany); 	WILL NOT WORK
		//System.out.println(companyName);
	
		String aboutCompany = "Company " +companyName+" is located in " + address + "\n and "+numberOfEmployees + " work for it.";
	
	System.out.println(aboutCompany);
	

	
}
}
