package day033_Methods05;

public class CalcTests {
public static void main (String [] args) {
	System.out.println(Calculator.add(3, 1));
	System.out.println(Calculator.multiply(7,  5));
	System.out.println(Calculator.minus(40, 12));
	System.out.println(Calculator.divide(100, 5));
	
	double addResult = Calculator.add(21, 32);
	double mResult = Calculator.multiply(95, 10);
	double miResult = Calculator.minus(2500, 495);
	double dResult = Calculator.divide(755, 25);
	
	System.out.println("addResult: "+addResult);
	System.out.println("mResult: "+mResult);
	System.out.println("miResult: "+miResult);
	System.out.println("dResult: "+dResult);
	
	double a = 10.0, b = 5.0;
	double myResult = Calculator.minus(a, b);
	System.out.println("myResult: "+ myResult);
	
	double [] dNums = {2.0, 4.5};
	double result2 = Calculator.multiply(dNums[0], dNums[1]);
	System.out.println("result2: "+result2);
	
	
	if (Calculator.add(10, 16) == 26) {
		System.out.println("Add Unit Test Passed");
	}else {
		System.out.println("Add Unit Test Failed");
	}
	String str = "java";
	if (str.length()==4) {
		System.out.println("It is 4 characters");
	}else {
		System.out.println("It is NOT 4 characters");
	}
	
}
}
