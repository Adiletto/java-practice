package homeWork_Assignments;
	import java.util.*;
		public class Assignment078_Car_Insurance_Quote {

		  public static void main(String[] args) {
		    //DO NOT CHANGE
		    double premium = 0;
				int accidentsAmount = 0;
				int daysDrivenToWorkOrSchool = 0;
				int milesToWorkOrSchool = 0;
				String vehicleOwnership = "";
				String vehicleUsage = "";
				String continuousInsurance = "";
				String education = "";
				String name = "";
				String referenceNumber = "";
				Scanner scan = new Scanner(System.in);
				System.out.println("Welcome to the CountyFarm car insurance!");
		    //WRITE YOUR CODE HERE
		    
				    
				    System.out.println("Enter your name");
								name = scan.nextLine();
								
								System.out.println("Do you have a US driver license?");
								String driversLicense = scan.next();
									
								if (driversLicense.equalsIgnoreCase("yes")) {
									
								} else if (driversLicense.equalsIgnoreCase("no")) {
									System.out.println("Invalid data!");
									System.exit(0);
								}
								
								
								
								System.out.println("Enter your zip code");
								int zipcode = 0;
								zipcode = scan.nextInt();
								
								if (zipcode == 20910  || zipcode == 20740) {
									premium = premium + 60;
								} else if (zipcode == 22102  || zipcode == 22103) {
									premium = premium + 30;
								} else {
									premium = premium + 50;
								}
								
								System.out.println("Is this vehicle Owned, Financed, or Leased?");
								vehicleOwnership = scan.next();
								
								if (vehicleOwnership.equalsIgnoreCase("Owned")) {
									premium = premium + 10;
								} else  { 
									premium = premium + 20;
								}
								
								
								System.out.println("How is this vehicle primarily used?");
								vehicleUsage = scan.next();
								if (vehicleUsage.equalsIgnoreCase("business")) {
									premium = premium + 50;
								}else if (vehicleUsage.equalsIgnoreCase("pleasure")) {
									premium = premium + 10;
								}else if (vehicleUsage.equalsIgnoreCase("commute")) {
									premium = premium + 20;
									
									System.out.println("Days Driven To Work And/Or School");
								daysDrivenToWorkOrSchool = scan.nextInt();
								premium = premium + (5 *daysDrivenToWorkOrSchool); 
								
								System.out.println("Miles Driven To Work And/Or School");
								milesToWorkOrSchool = scan.nextInt();
								premium += milesToWorkOrSchool; 
								
								}
								
								System.out.println("How old are you?");
								int age = scan.nextInt();
								
								 if (age < 16){
						      System.out.println("Invalid data!");
						      System.exit(0);
						    }else if (age >= 16 && age < 18){
						      premium = (premium*20);
						    }else if (age >=18 && age <=21){
						      premium = (premium*6);
						    }else if  (age >21 && age < 25){
						      premium = (premium*2);
						    }
								
								
								System.out.println("How many years you've been driving?");
								int driveExperience = scan.nextInt();
								
									
									if (driveExperience == 0){
						      System.out.println("Invalid data!");
						      System.exit(0);
						    }else if (driveExperience > 0 && age-driveExperience >= 16){
						      premium = (premium - (driveExperience*5));
						    }else {
						      System.out.println("Invalid data!");
						      System.exit(0);
						    }

								
									 System.out.println("Have you had any accidents in the last 5 years?");
									 String accidents = scan.next();
									 
									 accidents.equalsIgnoreCase("yes");
										 System.out.println("How many?");
										 accidentsAmount = scan.nextInt();
										 premium = premium + ((premium*.20) * accidentsAmount);
									
										 
										 
										 System.out.println("Have you had continuous insurance for the past 12 months?");
									 continuousInsurance = scan.next();
									 if (continuousInsurance.equalsIgnoreCase("no")) {
									   premium = premium*2;
										 
									 }
									 
									  System.out.println("What is the highest level of education you have completed?");
									 education = scan.next();
									 
									 if (education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("bachelors") || education.equalsIgnoreCase("masters")){
						      premium = premium - (premium*.05);
						    }else if(education.equalsIgnoreCase("doctors")){
						      premium = premium - (premium*.10);
						    }else{
						      education = "LessthanHighSchool";
						      premium = premium + (premium*.05);
						    }
									 
								
								System.out.println(name + ", here's your quote!");
						    System.out.println("Start Your Policy Today For: $" + premium);
						    referenceNumber = (name.toUpperCase().substring(0,2)+age+name.toUpperCase().substring((name.length()-2), (name.length())) + zipcode + education.toUpperCase());
						    System.out.println("Reference number: " + referenceNumber);
								
								
				  }
				}