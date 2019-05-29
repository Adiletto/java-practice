package day43_Encapsulation_Constructor;

public class MicroCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		comp1.setBrand("MacBook");
		comp1.setOs("MacOS Mojave");
		comp1.setPrice(3200);
		
		
		comp2.setBrand("Windows Surface Pro 3");
		comp2.setOs("Windows 10");
		comp2.setPrice(1200);
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
	Computer comp3 = new Computer ("ASUS", "Windows 8", 645.5);
	System.out.println(comp3.toString());
	
	comp3.setOs("Windows 11");
	System.out.println(comp3.toString());
	
	comp3.setPrice(comp3.getPrice()-200);
	System.out.println(comp3.toString());
	
	
	}
}
