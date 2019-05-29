package day41_CustomClasses02;

public class MyCar {

	public static void main(String[] args) {
		
		Car car1 = new Car ();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Black";
		car1.currentSpeed = 55;
		
		car1.PrintCarInfo();
		
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(35);
		
		car1.drive();
		System.out.println("before: "+car1.currentSpeed);
		car1.accellerate(20);
		System.out.println("after: "+car1.currentSpeed);
		
		BMW bmw = new BMW();
		System.out.println(bmw.make);
		bmw.model = "m3";
		bmw.showPrice();
		
		System.out.println("Car Price: "+bmw.price);
		
		BMW bmw2 = new BMW();
		bmw2.model = "X5";
		bmw2.showPrice();
		
	}
}