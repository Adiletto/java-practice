package day30_Methods02;

public class StudentAtSchool {

	public static void main(String[] args) {
		study("HTML");
		study("SQL");
		sleep(10);
		working("Developer", 4, 25.80);
	}

	public static void study (String topic) {
		System.out.println("Student is studying "+topic);
	}
	
	
	public static void sleep (int hours) {
		System.out.println("Student has been sleeping for " +hours+ " hours ");
	}
	
	public static void working (String partTime, int hours, double salary) {
		System.out.println("Student is working only "+hours+" hours a day because he works "+partTime+ " and makes "+salary+" per hour");
	}
	
}
