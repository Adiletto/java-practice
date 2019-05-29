package day52_Inheritance05;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE = 610;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSANGERS;
	public final String JAN = "January";
	
	public static final String COMPANY_NAME = "Cybertek";
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME = "admin@gmail.com";
	}
	
	public FinalVariables () {
		MODEL_3_MAX_SPEED = 190;
		
	}
	
	{
		MODEL_X_PASSANGERS =7;
	}
	
	public static void main(String[] args) {
		final int MAX_PASSANGERS_COUNT = 5;
		//MAX_PASSANGERS_COUNT = 10;
		final double PI = 3.14159265358979323846;
		//PI = 4.667885432
		
		System.out.println(MAX_PASSANGERS_COUNT);
		
		final int SSN;
		SSN = 980769876;
		
		//SSN++; is not possible
		FinalVariables finalVars = new FinalVariables();
		System.out.println("Max range od Roadster " + finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed: " + finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Model X passangers: " + finalVars.MODEL_X_PASSANGERS);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("Company name: "+COMPANY_NAME);
		System.out.println("Company name: " + FinalVariables.COMPANY_NAME);
		
	}
}
