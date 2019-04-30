package day08_casting_conditionals;

	public class Implicit_Casting {
		public static void main(String[] args) {
	//automatic casting from smaller to larger type
			
			short shortValue = 3455;
			int intValue = (int) shortValue;  //you can go without (int). 
			//int intValue = shortValue; (optional)
			System.out.println("int value: " + intValue);
			
			
			double price = 750;
			System.out.println("Price after casting: " + price);
			
			int price1 = 34562;
			double dPrice = price1;
			
			System.out.println("dPrice after casting: " + dPrice);
			
			
			
			
			
			
			
			
			
}
}
