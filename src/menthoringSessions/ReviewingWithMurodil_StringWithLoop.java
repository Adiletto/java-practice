package menthoringSessions;

public class ReviewingWithMurodil_StringWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Monday";
		//check num of chars
		
		System.out.println(day.length());
		if (day.length()>=6) {
			System.out.println("Possibly a valid day");
		}else {
			System.out.println("Days are normally 6 chars or longer");
		}
		
		//compare strings
		String today = new String ("Monday");
		
		if (day.equals(today)) {
			System.out.println("Monday is today");
		}else {
			System.out.println("Wrong day");
		}
		//variable day ==> "Monday", "Friday", "Sunday"
		
			if (day.equals("Monday") || 
				day.equals("Friday") || 
				day.equals("Sunday")) {
		System.out.println("Definitely a valid day");
	}else {
		System.out.println("Invalid Day!");
		
		}
			//first check if it is 6 chars then compare if it is one
			//of three
			//nested if statement
			if (day.length()==6) {
				if (day.equals("Monday") || 
						day.equals("Friday") || 
						day.equals("Sunday")) {
				System.out.println("Definitely a valid day");
			}else {
				System.out.println("Invalid Day!");
				
				}
			}
			//Monday --> check if last 3 chars are "day"
			// 1-> endsWith method
			
			if (day.endsWith("day")) {
				System.out.println("It ends with 'day' ");
			}else {
				System.out.println("Does not end with 'day'");
			}
			
			//substring -> create a partial string
			
			
			if (day.substring(3).equals("day")) {
				System.out.println();
			}
			//time stopped at 33:21
			//https://learn.cybertekschool.com/courses/147/pages/recording-monday-office-hours-%7C-04-slash-15-slash-2019?module_item_id=7594
			
	}

}
