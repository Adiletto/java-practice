package day34_Methods06;

public class MethodOverLoading {

	public static void main(String[] args) {
		add(10, 20);
		add("one", " two");
		long n1 = 1234L;
		long n2 = 39876L;
		add(n1, n2);
	}
	
	public static void add(int num1, int num2) {
		int result = num1+num2;
		System.out.println("Result: "+result);
	}
	
	public static void add (double d1, double d2) {
		double result = d1+d2;
		System.out.println("Result: "+result);
	}
	
	public static void add (String str1, String str2) {
		String result = str1+str2;
		System.out.println("Result: "+result);
	}
	
	public static void add (long n1, long n2) {
		long result = n1+n2;
		System.out.println("Result: "+result);
	}
	
}
