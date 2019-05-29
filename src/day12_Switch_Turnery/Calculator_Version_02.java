package day12_Switch_Turnery;

import java.util.Scanner;

	public class Calculator_Version_02 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				double num1, num2, result;
			Scanner scan = new Scanner(System.in);
	        System.out.println("Enter first number:");
	         num1 = scan.nextDouble();
	        System.out.println("Enter second number:");
	         num2 = scan.nextDouble();
	        
	        System.out.println("Select Operator: +, -, *, /, %");
	        String operator = scan.next();
	         result = 0.0;
	        switch(operator) {
	        
	        case "+":
	        result = num1 + num2;
	        System.out.println(result);
	        break;
	        case "-":
	        result = num1 - num2;
	        System.out.println(result);
	        break;
	        case "*":
	        result = num1 + num2;
	        System.out.println(result);
	        break;
	        case "/":
	        result = num1 - num2;
	        System.out.println(result);
	        break;
	        case "%":
	        result = num1 - num2;
	        System.out.println(result);
	        break;
	        default:
	            System.out.println("Invalid operator sected!");
	        }
	}

}
