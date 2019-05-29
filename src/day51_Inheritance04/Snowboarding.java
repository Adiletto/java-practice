package day51_Inheritance04;

public class Snowboarding extends Exercise{

	public int perform (int minutes) {
		int cals = super.perform(10);//call super class version of perform
		System.out.println("Snowboarding for " + minutes + " minutes");
		return minutes * 7;
	}
}
