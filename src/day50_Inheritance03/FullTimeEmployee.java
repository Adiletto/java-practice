package day50_Inheritance03;

public class FullTimeEmployee extends Employee{
	@Override//if method 
	public void calculatePay(int hours, double rate ) {
		double total = (hours * rate) * 1.05;
		System.out.println("FullTimeEmployee total pay: " + total);
	}
}
