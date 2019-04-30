package day06_Operators;

public class OperatorsPrecedence {
		public static void main (String [] args) {
			
			System.out.println("Hello " + 6 + 10);
			System.out.println(6 + 10 + " Hello");  //since number comes first, it will be executed as an arithmetic oper
			System.out.println("Hello " + (6 + 10) );
			
		}

}
