package day012_Switch_Turnery;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sunny, hot, windy, rainy, snowy;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("How is the weather today:");
			//
			String weather = scan.next().toLowerCase();
			
		switch(weather){
			case "sunny":
				System.out.println("Go to Park");
				System.out.println("Code Java");
				break;
			case "hot":
				System.out.println("Go Swimming");
				System.out.println("Code Java");
				break;
			case "windy":
				System.out.println("Fly a kite");
				System.out.println("Code Java");
				break;
			case "rainy":
				System.out.println("Go shopping");
				System.out.println("Code Java");
				break;
			case "snowy":
				System.out.println("Chain your tires");
				System.out.println("Go skiing");
				System.out.println("Code Java");
				break;
			default:
				System.out.println("Code Java in any other weather");
				break; // optional to break, since this last statement
		}
		
		
		System.out.println("***END OF PROGRAMM***");
		
		
		
	}

}
