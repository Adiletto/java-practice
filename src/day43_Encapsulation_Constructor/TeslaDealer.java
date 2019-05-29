package day43_Encapsulation_Constructor;

public class TeslaDealer {

	public static void main(String[] args) {
		
		Tesla tesla = new Tesla ();
		tesla.setModel("model y");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		System.out.println("model: " + tesla.getModel());
		System.out.println("range: " + tesla.getRange());
		System.out.println("price: " + tesla.getPrice());
		System.out.println("0to60 miles: "+ tesla.getZeroTo60());
		System.out.println("Self Driving? " + tesla.isSelfDriving());
		
		System.out.println(tesla);
		System.out.println(tesla.toString());
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
		
		if (tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: " + myTesla.getModel());
			System.out.println("0-60 speed: " + myTesla.getZeroTo60());
		}else {
			System.out.println("Faster model: " + myTesla.getModel());
			System.out.println("0-60 speed: " + myTesla.getZeroTo60());
		}
		
		buy(myTesla);
		buy(tesla);
		testDrive("model s");
		Tesla testCar = testDrive("model 3");
		System.out.println(testCar.toString());
	}//main method
	
	public static Tesla testDrive (String model) {
		System.out.println(" - Hi, I'd like to test drive - "+model);
		System.out.println(" - Sure, let me build the object and return it, momentatarily!");
		Tesla car = new Tesla();
		car.setTeslaInfo(model, 310, 2.5, 95000, false);
		return car;
	}

	public static void buy (Tesla car) {
		System.out.println("Purchasing: " + car.toString());
	}
	
	
	
	
}
