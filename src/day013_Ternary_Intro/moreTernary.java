package day013_Ternary_Intro;

public class moreTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String quality = "good";
		
		int rating = (quality.equals("good"))? 100 : 0;
		
		System.out.println("Rating: "+ rating);
		
		
		int PMHour = 6;
		// Rush hour during evening: 4-7
		//boolean rushHour;
		
		boolean rushHour = (PMHour >= 4 && PMHour <=7)? true : false;
		
		//System.out.println(PMHour + " is rush hour? " + rushHour);
		
		//String result = rushHour == true? "yes" : "no";
		//String result = (rushHour.equals("yes"))? true : false;
		
		
		int AMHour = 8; // 6-9;
		
		String amRushHour = (AMHour >= 6 && AMHour <=9) ? "yes" : "no";
		System.out.println(AMHour + " is rush hour? " + amRushHour);
		
		
	}

}
