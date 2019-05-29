package day49_Inheritance02;

public class Leopard extends Animal {

	public Leopard () {
		super(); // 
		System.out.println("Leopard constructor");
		setType("Leopard");
	}
	
	public Leopard (String type) {
		super (type); // call Animal (String type) constructor
		System.out.println("Leopard one 1 arg constructor");
		
	}
}
