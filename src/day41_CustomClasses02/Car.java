package day41_CustomClasses02;

public class Car {
	String make;
	String model;
	int currentSpeed;
	String color;
	
	public void PrintCarInfo () {
		String info = "Car make ["+make+"], model ["+model+"], color["+color+"], currentSpeed ["+currentSpeed+"]";
	
		System.out.println(info);
	
	}
	
	
	public void showCurrentSpeed (int speedLimit) {
		if (currentSpeed <= speedLimit) {
			System.out.println(make+" is driving at "+currentSpeed+" mph, following the speed limit -"+speedLimit);
		}else {
			System.out.println(make+" is driving at "+currentSpeed+" mph, OVER the speed limit - "+speedLimit);
		}
	}
	
	
	public void drive() {
		System.out.println(make + " " + model + " is driving ...");
	}
	
	public void accellerate (int mph) {
		currentSpeed += mph;
	}
}
