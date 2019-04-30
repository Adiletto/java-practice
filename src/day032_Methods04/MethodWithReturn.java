package day032_Methods04;

public class MethodWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println("i: " + i);
		
		System.out.println(giveMeYourName());
		String myName = giveMeYourName();
		System.out.println("My name is "+myName);
	}
	/*
	 * this method returns int value
	 */

	public static int giveMe10$() {
		System.out.println("returning 10 from method");
		
		return 10;
	}
	
	/*
	 * 
	 */
	
	public static String giveMeYourName() {
		String name = "Volkodav - Borubasar Uulu";
		return name;
		
	}
	
	
}
