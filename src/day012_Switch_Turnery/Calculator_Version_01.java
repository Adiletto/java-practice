package day012_Switch_Turnery;

import java.util.Scanner;

	public class Calculator_Version_01 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	              //Get number
		double num1, num2, result;
		Scanner input = new Scanner (System.in);
		
			System.out.println("Enter first number:");
			num1 = input.nextDouble();
					
				System.out.println("Enter second number:");
				num2 = input.nextDouble();
				
		//Get operator
			
		System.out.println("Select Operator: +, -, *, /, %;");
		String operator = input.next();
		
		 result = 0.0;
			//perform calculation and display result
		
		if (operator.equals("+")) {
			result = num1 + num2;
			//System.out.println("Result: "+result); *****OPTIONAL*****
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		} else if (operator.equals("%")) {
			result = num1 % num2;
		} else {
		
			System.out.println("Invalid operator selected: " + operator);
				}		
		
		System.out.println("Result: "+result);
		
		
		
		}	
		
	}


