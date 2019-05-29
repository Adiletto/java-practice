package day33_Methods05;

public class Calculator {
	public static void main (String[] args) {
		
	addVoid(2,5);
	int result = add(4,8);
	System.out.println("Result: "+result);
	result = add(10,30);
	System.out.println("Result: "+result);
	
	double summary = multiply (20, 5);
	System.out.println("Summary: "+ summary);
	
	//below line will not work, because addVoid does not
	//return a value.It just perform action
	//int result = addVoid(5,1);
}
	/*
	 * 1) method addVoid
	return type: void
	params: int num1, int num2;
	add them and print sum
	 */
	public static void addVoid (int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Sum: "+sum);
	}
	
	
/*
 * 2) method name: add
	return	type: int
	params: int num1, int num2
	add them and return the sum
 */
	
	public static int add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	/*
	 * Method: multiply with return value
		Method: minus with return value
		Method: divide with return value
	 */
	
	public static double multiply(double num1, double num2) {
		double sum = num1 * num2;
		return sum;
	}
	
	public static double minus (double num1, double num2) {
		double result = num1 - num2;
		return result;
		//return num1 - num2;
	}
	
	public static double divide(double n1, double n2) {
		if (n2 == 0 ) {
			System.out.println("ERROR: Can not / by 0");
			
			return 0;
		}else {
			
		double total = n1 / n2;
		return total;
		//return n1 / n2;
		}
	}
}
