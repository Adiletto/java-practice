package day013_Ternary_Intro;

import java.util.Scanner;

public class CarSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("What type of car are you interested in?:");
		
		System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean ");
		
		int carType = scan.nextInt();
		double averagePrice = 0.0;
		String carOptions = "";
		String carOrigin = "";
		

		switch (carType){
		case 1:
			averagePrice = 33000.0;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigin = "American";
			break;
		case 2: 
			averagePrice = 32000.0;
			carOptions = "Toyota, Mitsubishi, Honda, Subaru, Mazda";
			carOrigin = "Japanese";
			break;
		case 3: 
			averagePrice = 55000.0;
			carOptions = "BMW, VW, Audi, Mercedes, Porsche";
			carOrigin = "German";
			break;
		case 4:
			averagePrice = 85000.0;
			carOptions = "AlfaRomeo, Ferrari, Lamborghini, Fiat";
			carOrigin = "Italian";
			break;
		case 5:	
			averagePrice = 25000.0;
			carOptions = "Kia, Hyundai, Genesis";
			carOrigin = "Korean";
			break;
			default:
				System.out.println("Car type not available");
				return; // stop execution. Do not run the rest of code
		}
		
		System.out.println("You have selected " + carOrigin + " car and your options are: " + carOptions+".");
		System.out.println("Average Price: " + "$"+averagePrice);
		
		
		
		
		
		}
		
	}


