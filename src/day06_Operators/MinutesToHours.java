package day06_Operators;

public class MinutesToHours {
	
	public static void main (String [] args) {
		
		//Print: 2 hours and 5 mins
		
		int minutes = 125;
		
		int hours = minutes / 60;
		
		int remainingMinutes = minutes % 60;
		
		
		System.out.print(minutes + " minutes is ");
		System.out.println(hours + " hours and " + remainingMinutes + " minutes" );
		
		
		
		
	}

}
