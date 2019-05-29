package day41_CustomClasses02;

public class Microwave {

	String brand;
	boolean isOn;
	
	public void turnOn () {
		if (isOn ==true) {
			System.out.println(brand + " is already ON");
			//System.out.println("Heating the pizza");
		}else {
			System.out.println("Turning on " + brand + " microwave");
			isOn = true;
		}
	}
	
	
	public void turnOff() {
		if (isOn == false) {
			System.out.println(brand + " is already OFF");
		}else {
			System.out.println("Turning OFF " + brand + " microwave");
		}
	}
	
	
	public void heat (String food) {
		if (isOn) {
			System.out.println("Heating "+food);
		}else {
			System.out.println("Microwave is OFF, can not heat "+food);
		}
	}
}
