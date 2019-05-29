package day46_Static_Keyword;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cm1 = new Customer ("Asan Atabalasy", "asan@gmail.com");
		Customer cm2 = new Customer ("Uson Atabalasy", "uson@gmail.com");
		Customer cm3 = new Customer ("Esen Apabalasy", "esen@gmail.com");
		
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		Customer cm4 = new Customer ("Ahmet Mehmet", "ahmet@gmail.com");
		System.out.println("Total Customers: "+Customer.count);
		
		cm1.count = 10;
		System.out.println(cm3.count);
		System.out.println("Total Customers: " + Customer.count);
	}

}
