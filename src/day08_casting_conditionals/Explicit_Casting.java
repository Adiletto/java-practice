package day08_casting_conditionals;

public class Explicit_Casting {
	public static void main(String[] args) {
		
		System.out.println(10 / 2.0); // result is double (5.0)
		System.out.println(10.0 / 2); // same thing. Result is double (java prints the larger type)
		
		int result = (int)(10 / 2.0);
		
		
		
		
		int rent1 = 987;
			int rent2 = 1000;
				int rent3 = 894;
					int rent4 = 1234;
					
		double average = (rent1 + rent2 + rent3 + rent4) / 4.0;
		//double average = (double)(rent1 + rent2 + rent3 + rent4) / 4;
		
		System.out.println(average);
		
		
		double d = 40.2;
		int i = (byte)d;
		// in above statement both explicit and implicit casting happening
		
		//explicit; double > byte;
		// implicit: byte > int;
		
		
		
	}

}
